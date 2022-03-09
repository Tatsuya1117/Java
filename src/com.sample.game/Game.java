import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import main.*;

public class Game extends JApplet
{
	// 初期設定
	public void init()
	{
		Dimension size = getSize();   // アプレットの大きさの取得
		size.width  -=10;
		size.height -=10;
		Container CP = getContentPane();   // ContentPane を取得
		CP.setLayout(null); // レイアウトマネージャを停止
		CP.setBackground(new Color(220, 255, 220));   // 背景色
		AppletContext AC = getAppletContext();   // アプレットのコンテキストを取得
		URL CB = getCodeBase();   // HTML ファイルが存在する URL
		MainPanel pn = new MainPanel(AC, CB, size);   // MainPanel オブジェクトの生成
		CP.add(pn);   // MainPanel オブジェクトを ContentPane に追加
		pn.setSize(size.width, size.height);
		pn.setLocation(5, 5);
	}
}
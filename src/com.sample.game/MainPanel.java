package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import start.*;
import game.*;

public class MainPanel extends JPanel implements Runnable
{
	AppletContext ac;   // アプレットのコンテキスト
	URL cb;   // HTML ファイルが存在する URL
	Dimension size;   // アプレットの大きさ
	boolean in_game = true;   // ゲーム実行中はtrue
	public int state = 0;   // ゲーム状態（0:表紙，1:ゲーム，2:終了）
	public int method = 0;   // ゲーム方法（0:対人間，1:対PC（先手），2:対PC（後手））
	int old_state = 0;   // 直前のゲーム状態
	StartPanel sp;
	GamePanel gp;
	Thread td;

	// コンストラクタ
	public MainPanel(AppletContext ac1, URL cb1, Dimension size1)
	{
		ac   = ac1;
		cb   = cb1;
		size = size1;
		// グリッドレイアウト
		setLayout(new GridLayout(1, 1, 0, 0));
		// スタートパネルの生成
		sp = new StartPanel(ac, cb, size, this);   // スタート（タイトル）
		add(sp);
		// スレッドの生成
		td = new Thread(this);
		td.start();
	}

	// ゲームの状態を変更
	public void run()
	{
		while (in_game) {
			try {
				td.sleep(1);   // 1 ms 毎の実施
			}
			catch (InterruptedException e) {}
			if (state != old_state) {
				// 前のパネルの削除
				if (old_state == 0)
					remove(sp);
				else
					remove(gp);
				// 新しいパネルの追加
				if (state == 2)   // ゲーム終了
					in_game = false;
				else {
					if (state == 0) {   // StartPanel
						sp = new StartPanel(ac, cb, size, this);
						add(sp);
					}
					else {   // GamePanel
						gp = new GamePanel(ac, cb, size, this);
						add(gp);
					}
					validate();
					old_state = state;
				}
			}
		}
	}
}

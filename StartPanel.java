package start;
	
	import java.awt.*;&lt;span data-mce-type="bookmark" style="display: inline-block; width: 0px; overflow: hidden; line-height: 0;" class="mce_SELRES_start"&gt;&lt;/span&gt;
	import java.awt.event.*;
	import javax.swing.*;
	import java.applet.*;
	import java.net.*;
	import main.*;
	
	public class StartPanel extends JPanel implements ActionListener, ItemListener
	{
		boolean in_game = true;
		AppletContext ac;   // アプレットのコンテキスト
		URL cb;   // HTML ファイルが存在する URL
		Dimension size;   // アプレットの大きさ
		MainPanel mp;
		JButton bt, start;
		Checkbox c1, c2, c3;
		// コンストラクタ
		public StartPanel(AppletContext ac1, URL cb1, Dimension size1, MainPanel mp1)
		{
			ac   = ac1;
			cb   = cb1;
			size = size1;
			mp   = mp1;
			// レイアウトマネージャの停止
			setLayout(null);
			// 背景色の設定
			setBackground(Color.white);
			// 「遊び方」ボタンの配置
			Font f = new Font("SansSerif", Font.BOLD, 20);
			FontMetrics fm = getFontMetrics(f);
			String str = "遊び方";
			int w = fm.stringWidth(str) + 40;
			int h = fm.getHeight() + 10;
			bt = new JButton(str);
			bt.setFont(f);
			bt.addActionListener(this);
			bt.setSize(w, h);
			bt.setLocation(size.width/2-w/2, 5);
			add(bt);
			// ラジオボタンの追加
			setFont(f);
			CheckboxGroup cbg = new CheckboxGroup();
			c1 = new Checkbox("対人間", cbg, true);
			w = fm.stringWidth("対人間") + 40;
			c1.setSize(w, h);
			c1.setLocation(20, size.height-3*h);
			c1.addItemListener(this);
			add(c1);
			c2 = new Checkbox("対コンピュータ（人先手）", cbg, false);
			w = fm.stringWidth("対コンピュータ（人先手）") + 40;
			c2.setSize(w, h);
			c2.setLocation(20, size.height-2*h);
			c2.addItemListener(this);
			add(c2);
			c3 = new Checkbox("対コンピュータ（人後手）", cbg, false);
			w = fm.stringWidth("対コンピュータ（人後手）") + 40;
			c3.setSize(w, h);
			c3.setLocation(20, size.height-h);
			c3.addItemListener(this);
			add(c3);
			// 「開始」ボタンの配置
			w = fm.stringWidth("開始") + 40;
			start = new JButton("開始");
			start.setFont(f);
			start.addActionListener(this);
			start.setSize(w, h);
			start.setLocation(size.width-w-20, size.height-2*h);
			add(start);
		}
		// 描画
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);   // 親クラスの描画
			FontMetrics fm;
			Font f;
			String str;
			int w, h;
	
			f   = new Font("SansSerif", Font.BOLD, 40);
			fm  = g.getFontMetrics(f);
			str = "オセロ";
			w   = fm.stringWidth(str);
			h   = fm.getHeight();
			g.setFont(f);
			g.drawString(str, size.width/2-w/2, size.height/2);
		}
		// ボタンがクリックされたときの処理
		public void actionPerformed(ActionEvent e)
		{
			URL url;
			if (e.getSource() == bt) {
				try {
					url = new URL(cb+"start/method.htm");
					ac.showDocument(url, "method");
					requestFocusInWindow();
				}
				catch (MalformedURLException me)
				{
					System.out.println("Bad URL: method.htm");
				}
			}
			else if (e.getSource() == start)
				mp.state = 1;
		}
		// チェックされたときの処理
		public void itemStateChanged(ItemEvent e)
		{
			if (e.getSource() == c1)
				mp.method = 0;
			else if(e.getSource() == c2)
				mp.method = 1;
			else if(e.getSource() == c3)
				mp.method = 2;
		}
	}
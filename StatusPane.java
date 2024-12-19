package Testapp1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StatusPane extends JPanel implements ActionListener{
	Application myApp;
	OptionPane option;
	JLabel score, highScores, count;
	public StatusPane(Application app)
	{
		myApp = app;
		setPreferredSize(new Dimension(120, 625));
		setBorder(BorderFactory.createEtchedBorder(Color.red, Color.blue));
		initializeComponents();
	}
	private void initializeComponents() {
		setLayout(new GridLayout( 10, 1));
		
		option = new OptionPane(myApp);
		JButton butStart = new JButton("Start Game");
		butStart.setPreferredSize(new Dimension(100, 40));
		butStart.addActionListener(this);
		this.add(butStart);
		JButton butOption = new JButton("Setting");
		butOption.setPreferredSize(new Dimension(100, 40));
		butOption.addActionListener(this);
		this.add(butOption);
		score = new JLabel("Score: 0");
		this.add(score);


		highScores = new JLabel("High Scores: ");
		this.add(highScores);

		count = new JLabel("Lines: ");
		this.add(count);
	}
	
	public void scored(int score)
	{
		this.score.setText("Score: "  +   Integer.toString(score));
	}

	public void highScored(int[] highScores) {
    StringBuilder scores = new StringBuilder("<html>High Scores:<br>");
    for (int i = 0; i < highScores.length; i++) {
        scores.append((i + 1) + ": " + highScores[i] + "<br>");
    }
    scores.append("</html>");
    this.highScores.setText(scores.toString());
	}

	public void Counted(int count){
		this.count.setText("Line: "  +   Integer.toString(count));
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Start Game"){
			myApp.tetris.board.start();
		}
		else
		{
			myApp.tetris.board.stop();
			option.setVisible(true);
		}
	}
}



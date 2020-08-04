package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Action.Calculate;
public class CalculatorGui extends JFrame {
	
	public CalculatorGui() {
		Calculate C = new Calculate();
		setTitle("계산기");
		setSize(286,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 200, 5,200));
		contentPane.setLayout(null);
		//파라미터1 = leftMargin, 파라미터 2 = topMargin, 
		//파라미터 3,4 = 버튼크기
		JLabel consol = new JLabel("0", SwingConstants.RIGHT);
		consol.setBounds(5, 50, 260, 100);
		consol.setOpaque(true);
		consol.setBackground(new Color(250,250,250));
		consol.setFont(new Font("굴림", Font.BOLD, 50));
		contentPane.add(consol);
		JLabel resul = new JLabel("0", SwingConstants.RIGHT);
		resul.setBounds(115, 160, 150, 100);
		resul.setOpaque(true);
		resul.setBackground(new Color(250,250,250));
		resul.setFont(new Font("굴림", Font.BOLD, 40));
		contentPane.add(resul);
		
		JButton joinBtn0 = new JButton("0");
		joinBtn0.setBounds(72, 415, 60, 40);
		contentPane.add(joinBtn0);
		joinBtn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("0");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn1 = new JButton("1");
		joinBtn1.setBounds(6, 370, 60, 40);
		contentPane.add(joinBtn1);
		joinBtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("1");
				consol.setText(C.output());
			}
		});
		JButton joinBtn2 = new JButton("2");
		joinBtn2.setBounds(72, 370, 60, 40);
		contentPane.add(joinBtn2);
		joinBtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("2");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn3 = new JButton("3");
		joinBtn3.setBounds(138, 370, 60, 40);
		contentPane.add(joinBtn3);
		joinBtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("3");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn4 = new JButton("4");
		joinBtn4.setBounds(6, 325, 60, 40);
		contentPane.add(joinBtn4);
		joinBtn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("4");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn5 = new JButton("5");
		joinBtn5.setBounds(72, 325, 60, 40);
		contentPane.add(joinBtn5);
		joinBtn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("5");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn6 = new JButton("6");
		joinBtn6.setBounds(138, 325, 60, 40);
		contentPane.add(joinBtn6);
		joinBtn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("6");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn7 = new JButton("7");
		joinBtn7.setBounds(6, 280, 60, 40);
		contentPane.add(joinBtn7);
		joinBtn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("7");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn8 = new JButton("8");
		joinBtn8.setBounds(72, 280, 60, 40);
		contentPane.add(joinBtn8);
		joinBtn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("8");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtn9 = new JButton("9");
		joinBtn9.setBounds(138, 280, 60, 40);
		contentPane.add(joinBtn9);
		joinBtn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("9");
				consol.setText(C.output());
			}
		});
		
		JButton joinBtnChange = new JButton("+/-");
		joinBtnChange.setBounds(6, 415, 60, 40);
		contentPane.add(joinBtnChange);
		JButton joinBtnDot = new JButton(".");
		joinBtnDot.setBounds(138, 415, 60, 40);
		contentPane.add(joinBtnDot);
		
		JButton joinBtnEqual = new JButton("=");
		joinBtnEqual.setBounds(204, 415, 60, 40);
		contentPane.add(joinBtnEqual);
		joinBtnEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				//C.Finish("9");
			}
		});
		
		JButton joinBtnPlus = new JButton("+");
		joinBtnPlus.setBounds(204, 370, 60, 40);
		contentPane.add(joinBtnPlus);
		joinBtnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("+");
				consol.setText(C.output());
			}
		});
		JButton joinBtnMinus = new JButton("-");
		joinBtnMinus.setBounds(204, 325, 60, 40);
		contentPane.add(joinBtnMinus);
		joinBtnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("-");
				consol.setText(C.output());
			}
		});
		JButton joinBtnMulti = new JButton("x");
		joinBtnMulti.setBounds(204, 280, 60, 40);
		contentPane.add(joinBtnMulti);
		joinBtnMulti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다.");
				C.SetCalculate("x");
				C.SecCalculate(",*,");
				consol.setText(C.output());
			}
		});

		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorGui C =new CalculatorGui();
		
	}
}

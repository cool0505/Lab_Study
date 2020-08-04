package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class JoinGui  extends JFrame {
	public JoinGui() {
		setTitle("회원가입");
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 3, 5,3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblId = new JLabel("아이디 ");
		lblId.setBounds(41, 50, 69, 35);
		contentPane.add(lblId);
		JLabel lblPW = new JLabel("비밀번호 ");
		lblPW.setBounds(41, 100, 69, 35);
		contentPane.add(lblPW);
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(41, 150, 69, 35);
		contentPane.add(lblName);
		JLabel lblPN = new JLabel("핸드폰");
		lblPN.setBounds(41, 200, 69, 35);
		contentPane.add(lblPN);
		JTextField TfId= new JTextField();
		TfId.setBounds(157, 50, 176, 35);
		contentPane.add(TfId);
		TfId.setColumns(10);
		JPasswordField tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(157, 103, 176, 35);
		contentPane.add(tfPassword);
		JButton loginBtn = new JButton("회원가입");
		loginBtn.setBounds(108, 154, 106, 29);
		contentPane.add(loginBtn);
		setVisible(true);
		
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = TfId.getText();
				char[] passwordchar = tfPassword.getPassword();
				String password = String.valueOf(passwordchar);
				int result = lg.Login(username, password);
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					dispose();
					new CalculatorGui();

				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}

			}
		});

		
	}

}

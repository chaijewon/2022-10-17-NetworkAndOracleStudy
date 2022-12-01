package com.sist.client;
import javax.swing.*;
public class ClientMain extends JFrame{
    public ClientMain()
    {
    	setSize(1300, 850);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE); // X 버튼 클릭시 메모리 해제
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex){}
        new ClientMain();
	}

}

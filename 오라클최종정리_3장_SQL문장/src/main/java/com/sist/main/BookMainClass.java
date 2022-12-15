package com.sist.main;

import com.sist.dao.BookDAO;
import com.sist.dao.BookVO;

import java.util.*;
public class BookMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BookDAO dao=new BookDAO();
        // 오라클로부터 값을 받아 온다 
        /*ArrayList<BookVO> list=dao.book3_1();
        // 출력 
        for(BookVO vo:list)
        {
        	System.out.println(vo.getBookname()+" "+vo.getPrice());
        }*/
        /*ArrayList<BookVO> list=dao.book3_2();
        for(BookVO vo:list)
        {
        	System.out.println(vo.getBookid()+" "
        			+vo.getBookname()+" "
        			+vo.getPublisher()+" "
        			+vo.getPrice());
        }*/
        ArrayList<String> list=dao.book3_3();
        for(String s:list)
        {
        	System.out.println(s);
        }
        
	}

}

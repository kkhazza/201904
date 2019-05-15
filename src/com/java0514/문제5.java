﻿// 정하린

package com.java0514;

import java.util.Scanner;

public class 문제5 {
	private int[][] Map = {
			{1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 1, 1, 0, 1},
			{1, 0, 0, 1, 2, 0, 1},
			{1, 0, 1, 1, 1, 1, 1},
			{1, 0, 1, 1, 0, 2, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1}
	};
	
	private int[][] Port = {
			{ 5 , 4 },
			{ 4 , 2 }
	};
	
	public void Screen(int t_x, int t_y)
	{
		for(int y = 0; y < Map.length; y++)
		{
			for(int x = 0; x < Map[y].length; x++)
			{
				if(t_x == x && t_y == y)
				{
					System.out.print("p");
				}
				else if(Map[y][x] == 1)
				{
					System.out.print("■");
				}
				else if(Map[y][x] == 2)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("□");
				}
			}
			System.out.println();
		}
	}
	
	public void Game()
	{
		int m_x = 1;
		int m_y = 1;
		int t_x = 1;
		int t_y = 1;
		Screen(t_x, t_y);
		
		Scanner sc = new Scanner(System.in);
		String Key = null;
		while(true)
		{
			Key = sc.next();
			switch(Key.toUpperCase())
			{
				case "W":
					m_y--;
					break;
					
				case "D":
					m_x++;
					break;
					
				case "S":
					m_y++;
					break;
					
				case "A":
					m_x--;
					break;
					
				default:
					break;
			}
			
			if(Move(m_x, m_y))
			{
				if(Port[0][0] == m_x && Port[0][1] == m_y)
				{
					t_x = Port[1][0];
					t_y = Port[1][1];
					m_x = t_x;
					m_y = t_y;
				}
				else
				{
					t_x = m_x;
					t_y = m_y;
				}
			}
			else
			{
				m_x = t_x;
				m_y = t_y;
			}
			
			Screen(t_x, t_y);
			
			if(t_x == 5 && t_y == 1)
			{
				System.out.println("목적지");
				break;
			}
		}
	}
	
	public boolean Move(int m_x, int m_y)
	{
		if(Map[m_y][m_x] != 1)
		{
			return true;
		}
		
		return false;
	}
}

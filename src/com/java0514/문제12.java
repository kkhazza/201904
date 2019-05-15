// 권대한

package com.java0514;

import java.util.Scanner;

public class 문제12 {
	private int Map[][] = {
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 3, 0, 0, 0, 1, 2, 1},
			{1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
			{1, 1, 1, 1, 3, 0, 1, 3, 0, 1},
			{1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
			{1, 0, 0, 0, 0, 3, 1, 0, 3, 1},
			{1, 0, 1, 1, 1, 1, 1, 0, 0, 1},
			{1, 0, 0, 3, 0, 0, 0, 1, 0, 1},
			{1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
	
	public void Screen(int t_x, int t_y)
	{
		for(int y = 0; y < Map.length; y++)
		{
			for(int x = 0; x < Map[y].length; x++)
			{
				if(t_x == x && t_y == y)
				{
					System.out.print("P");
				}
				else if(Map[y][x] == 3)
				{
					System.out.print("*");
				}
				else if(Map[y][x] == 2)
				{
					System.out.print("♣");
				}
				else if(Map[y][x] == 1)
				{
					System.out.print("■");
				}
				else if(Map[y][x] == 0)
				{
					System.out.print("□");
				}
			}
			System.out.println();
		}
	}
	
	public void Game()
	{
		int t_x = 1;
		int t_y = 1;
		int m_x = t_x;
		int m_y = t_y;
		Screen(1, 1);
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			switch(sc.next().toUpperCase())
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
				t_x = m_x;
				t_y = m_y;
			}
			else
			{
				m_x = t_x;
				m_y = t_y;
			}
			
			Screen(t_x, t_y);
			
			if(Map[t_y][t_x] == 3)
			{
				System.out.println("죽음");
				break;
			}
			else if(Map[t_y][t_x] == 2)
			{
				System.out.println("끝");
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

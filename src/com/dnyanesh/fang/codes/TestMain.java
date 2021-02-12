package com.dnyanesh.fang.codes;

import java.util.Scanner;

public class TestMain {
	static int originalrowCount;
	static int originalcolumnCount;
	static long ans = -1;
	static int grid[][] = new int [501][501];
	static boolean isVisitedArray[][] = new boolean [501][501];
	static int arrayofX[] = {-1, 0, 1};
	static int arrayofY[] = {0, 1, 0};
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		originalrowCount = sc.nextInt();
		originalcolumnCount = sc.nextInt();
		for(int rowCount=0; rowCount<originalrowCount; rowCount++) {
			for(int columnCount=0; columnCount<originalcolumnCount; columnCount++) {
				grid[rowCount][columnCount] = sc.nextInt();
			}
		}
		for(int rowCount=0; rowCount<originalcolumnCount; rowCount++) {
			if(grid[rowCount][0]==-1) {
				continue;
			}
			isVisitedArray[rowCount][0] = true;
			calculateSnakePath(grid[rowCount][0], rowCount, 0);
			isVisitedArray[rowCount][0] = false;
		}
		System.out.println(ans);
		System.out.println(System.currentTimeMillis());
	}
	static void calculateSnakePath(int sum, int rowCount, int columnCount){
		if(columnCount==originalcolumnCount-1 && sum > ans) {
			ans = sum;
		}
		for(int i=0; i<3; i++) {
			boolean flag = false;
			int nx = rowCount + arrayofX[i];
			if(nx==-1) {
				nx = originalrowCount - 1;
				flag = true;
			}
			if(nx==originalrowCount) {
				nx = 0;
				flag = true;
			}
			int ny = columnCount + arrayofY[i];
			if(ny==originalcolumnCount) {
				continue;
			}
			if(isVisitedArray[nx][ny] && grid[nx][ny]==-1) {
				continue;
			}
			isVisitedArray[nx][ny] = true;
			if(flag) {
				calculateSnakePath(grid[nx][ny], nx, ny);
			}
			else {
				calculateSnakePath(sum + grid[nx][ny], nx, ny);
			}	
			isVisitedArray[nx][ny] = false;
		}
	}
}

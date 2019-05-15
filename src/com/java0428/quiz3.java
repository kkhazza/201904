package com.java0428;
import java.util.Scanner;

public class quiz3 {
private static int A=0;
public int t1(int aX,int aY,int bX,int bY) {
int result=1;

int[][] pyo={
{0,0,0,0,0,0,0},
{1,1,1,1,1,1,0},
{0,1,0,0,0,2,0},
{0,1,0,4,1,0,0},
{0,1,0,0,1,0,0},
{0,1,3,1,1,1,5},
{0,0,0,0,0,0,0}
};
if(A==1) {
pyo[2][5]=1;
pyo[5][2]=1;
}

//2 == 3을 1로 변환
//3 == 1 로 바뀔 값
//4 == 1,0 으로 이동
//5 == 끝
if(pyo[aY][aX]==2) {
pyo[2][5]=1;
pyo[5][2]=1;
result=2;
A=1;
}
if(pyo[aY][aX]==3) {
System.out.println("길이 막혀있음둥.");
}
if(pyo[aY][aX]==4) {
aX=0;
aY=1;
bX=0;bY=1;
result=4;
}
if(pyo[aY][aX]==5) {
System.out.println("성공입니다.!");
result=5;
}

for(int i=0;i<pyo.length;i++) {
for (int j = 0; j < pyo[i].length; j++) {
if(pyo[aY][aX]==0 ||pyo[aY][aX]==3) {
aX=bX;
aY=bY;
result=0;
}

if (pyo[i][j] == 1) {
if (i == aY && j == aX) {
System.out.print("㉿ ");
} else {
System.out.print("□ ");
}

}else if(pyo[i][j]==2){
System.out.print("♣ ");
}else if(pyo[i][j]==3){
System.out.print("● ");
}else if(pyo[i][j]==5){
System.out.print("㉾ ");
}else if(pyo[i][j]==4){
System.out.print("㉾ ");
}else {
System.out.print("■ ");
}

}
System.out.println();
}
return result;
}

public void t2() {
Scanner scan=new Scanner(System.in);
int aX=0;
int aY=1;
int bX=0;
int bY=1;
t1(aX,aY,bX,bY);

while(true) {
switch(scan.next().toUpperCase()) {
case "W":
aY--;
break;
case "S":
aY++;
break;
case "A":
aX--;
break;
case "D":
aX++;
break;
default :
break;
}
System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
int input=t1(aX,aY,bX,bY);
if(input==0){
aX=bX;
aY=bY;
}else if(input==1) {
bX=aX;
bY=aY;
}else if(input==2){
System.out.print("문이 열렸습니다");	
}else if(input==4){
aX=0;
aY=1;
bX=0;
bY=1;
}else if(input==5){
System.out.print("끝났습니다!");
break;
}else {
aX=1;
aY=1;
}
}
}
}
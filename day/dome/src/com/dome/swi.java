
package com.dome;
import java.util.Scanner;
public class swi {
    public static void main(String[] args) {
        int j=1;
        while(j<=6) {
            System.out.println();
            System.out.println("请输入一个数：");
            Scanner be=new Scanner(System.in );
            int nu=be.nextInt();
            switch (nu) {
                case 1:
                    System.out.println("你是煞笔么");
                    j=0+1;
                    break;
                case 2:
                    System.out.println("不是么");
                    j=1+1;
                    break;
                case 3:
                    System.out.println("请输入5*6的值：");
                    Scanner df=new Scanner(System.in);
                    int ac=5*6;
                    int dt=df.nextInt();
                    if (ac!=dt){
                        System.out.println("输入错了，你是煞笔");
                    }
                    else { System.out.println("答对了，你不是煞笔");}
                    j=1+2;
                    break;
                case 4:
                    System.out.println("伟大的人");
                    j=1+3;
                    break;
                case 5:
                    System.out.println("伟大的超");
                    j=1+4;
                    break;
                case 6:
                    System.out.println("超的伟大");
                    j=1+5;
                    break;
                default:
                    System.out.println("超出范围，即将爆炸！！！");
                    j=j+6;
                    break;
            }
        }
        System.out.println("=================================");
        System.out.println("嘭！！！");
    }
}
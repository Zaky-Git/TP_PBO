/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_02_1302213067_zaky;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TP_MOD_02_1302213067_ZAKY {

    static int fpb_1302213067(int a, int b){
        int c;
        if (a==0){
            return b;
        } else if (b==0) {
            return a;
        } else {
            while (b!=0){
                c = a%b;
                a = b;
                b = c;
            }
            return a;
        }
    }
    
    public static void main(String[] args) {
        int array [][]= {
            {2,4,6},
            {1,3,5,7,9},
            {0,1,1,2,3,5,8}
        };
        int i;
        int j;
        for (i=0;i<array.length;i++){
            for (j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input bilangan 1:");
        int n = input.nextInt();
        System.out.println("Input bilangan 2:");
        int z = input.nextInt();
        int fpbnya = fpb_1302213067(n, z);
        System.out.println("Hasil KPK:" + ((n * z)/fpbnya));
        System.out.println("Hasil FPB:" + fpbnya);
    }
}

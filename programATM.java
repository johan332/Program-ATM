package com.tutorial;

import java.util.Scanner;

public class programATM
{
    public static void main(String args[])
    {
        int saldo = 100000, penarikan, setoran;
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("Automatic Teller Machine");
            System.out.println("Pilih 1 untuk Penarikan");
            System.out.println("Pilih 2 untuk Setoran");
            System.out.println("Pilih 3 untuk Lihat Saldo");
            System.out.println("Pilih 4 untuk Keluar");
            System.out.println("Silakan pilih angka : ");

            int pilihan = sc.nextInt();
            switch (pilihan)
            {
                case 1:
                    System.out.print("Masukan nominal untuk ditarik : ");
                    penarikan=sc.nextInt();
                    if (saldo>=penarikan)
                    {
                        saldo=saldo-penarikan;
                        System.out.println("Silakan ambil uang anda");
                    }
                    else
                    {
                        System.out.println("Saldo tidak cukup");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Masukan uang yang akan disetor : ");
                    setoran=sc.nextInt();

                    saldo=saldo+setoran;
                    System.out.println("Uang berhasil disetor");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Saldo : "+saldo);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehuuhieu.mathutil.main;

import com.lehuuhieu.mathutil.MathUtility;

/**
 *
 * @author lehuuhieu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muon test 5! co bang 120 hay khong
        int n = 5; //5! coi bang may
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected: " + expected + "; actual: " + actual);
        
        //xet truong hop 2: 0! bang may
        n = 0; //0! coi bang may
        expected = 1;
        actual = MathUtility.getFactorial(n);
        
        System.out.println("0! expected: " + expected + "; actual " + actual);
    }
    
}

//TRONG QUY TRINH LAM PM, DAN DEV PHAI CO TRACH NHIEM TEST TUNG HAM, TUNG CLASS
//MA MINH VIET RA TRUOC KHI DONG GOI GUI CHO BEN QA/QC TEST DOC LAP, TUNG HAM, TUNG CLASS PHAI DUOC TEST CAN THAN
//TRUOC KHI CHUNG DUOC DE PHOI HOP VOI CAC CLASS KHAC. TEST NGAY MUC HAM, MUC CLASS, VUA HOAN THIEN,
//CHUA BAN THEM VE UI, THI MUC DO TEST SOM NAY GOI LA UNIT TEST LEVEL - TEST TUNG ĐƠN THỂ, DON VI CODE

//VAY LAM SAO DE TEST TUNG HAM , TUNG CLASS
//CO NHIEU CACH DE TEST TUNG HAM TUNG CLASS
//1. CACH 1: DUNG SOUT (GOI HAM CAN TEST) DE IN RA GIA TRI XU LY CUA HAM DUNG TRONG MON OOP

//2. CACH 2: DUNG JOPTIONPANE CUA MON JAVA DESKTOP DE POP-UP MOT CUA SO IN KET QUA XU LY CUA HAM DE KTRA COI HAM CHAY DUNG HAY SAI

//3. CACH 3: DUNG LOG FILE, TRANG WEB IN RA KET QUA XU LY CUA HAM (MON JAVA WEB)

//DU LA CACH NAO THI TA CUNG CAN PHAI IN RA GIA TRI HAM DA XU LY
//GOI LA  ACTUAL VALUE
//ROI TA DI SO SANH CAI GIA TRI TRA VE CUA HAM CO GIONG NHU TA TINH TOAN TRUOC DO HAY KHONG,
//CAI DO TA HY VONG HAM SE TRA VE - GOI LA EXPECTED VALUE

//NEU ACTUAL VALUE == EXPECTED VALUE -> HAM CHAY NGON
//                 KHAC              -> HAM SAI
//NGUYEN TAC CUA VIEC TEST: SO SANH ACTUAL VOI EXPECTED
//3 CACH NAY DEU CUNG MOT NGUYEN TAT:
//GOI HAM DUNG MAT DE SO SANH ACTUAL VA EXPECTED ROI TA TU KET LUAN CACH NAY TIEM AN SAI SOT KHI TA PHAI XEM XET QUA NHIEU CAP VALUE
//VI DU HAM GIAO THUA() PHAI TEST TRUONG HOP N < 0, = 0, = 1, 18, 19, 20 (BIEN)
//21, 30, 1TRIEU

//MOI N DE TEST TA GOI LA 1 TINH HUONG XAI HAM, 1 TINH HUONG TEST, TEST CASE

//CACH 4: HONG THEM NHIN BANG MAT TUNG TRUONG HOP EXPECTED VA ACTUAL


//MAY QUET QUA TAT CA CAC CAP EXPECTED AND ACTUAL
//NEU TAT CA DEU KHOP BAO TAO LA MAU XANH - DUONG THONG CODE TOT

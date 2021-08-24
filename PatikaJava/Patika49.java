package PatikaJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    int x;
    int y;
    String[][] table;
    String[][] mineTable;
    boolean isFinished = true;
    int openedArea = 0;

    public MineSweeper(int x, int y){
        this.x = x;
        this.y = y;
        resetTable();
    }

    public void resetTable(){
        createTable(x,y);
        createMineTable(x, y);
        isFinished = false;
    }

    public void checkGame(int x, int y, int result){
        if (result == -1){
            System.out.println("Oyunu kaybettiniz...");
            isFinished = true;
        } else if (result == -2){
            System.out.println("Hatalı giriş yaptınız !");
        } else if (result >= 0 && result <= 8){
            setArea(x, y, String.valueOf(result));
            openedArea++;
        }
        
        if ((openedArea + (this.x*this.y)/4) == (this.x*this.y)){
            System.out.println("Oyunu Kazandınız. Tebrikler...");
            isFinished = true;
        }
    }

    public void printTable(){
        for (String[] s : table) {
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.print("\n");
        }
    }

    public void printMineTable(){
        for (String[] s : mineTable) {
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.print("\n");
        }
    }

    public void setArea(int x, int y, String value){
        table[x][y] = value;
    }

    public int getMines(int x, int y){
        String symbol = table[x][y];
        if (mineTable[x][y] == "*"){
            return -1; // lost
        } else if (symbol == "-") {
            //mayın sayısı
            return mineDetection(x, y);
        } else {
            return -2;  // daha önce bu nokta aktif edilmiştir.
        } 
    }

    private int mineDetection(int x, int y){
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x+i > (this.x-1) || x+i < 0 || y+j > (this.y-1) || y+j < 0){
                    continue;
                } else {
                    if (mineTable[x+i][y+j] == "*"){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void createTable(int x, int y){
        table = new String[x][y];
        for (String[] cs : table) {
            Arrays.fill(cs, "-");
        }
    }

    private void createMineTable(int x, int y){
        Random rnd = new Random();
        mineTable = new String[x][y];
        int mine = (x*y) / 4;
        int activeMine = 0;
        for (String[] cs : mineTable) {
            Arrays.fill(cs, "-");
        }
        while(activeMine < mine){
            int mX = rnd.nextInt(x);
            int mY = rnd.nextInt(y);
            if (mineTable[mX][mY] == "-"){
                activeMine++;
                mineTable[mX][mY] = "*";
            }
        }
    }

}


public class Patika49 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        MineSweeper mineSweeper;
        int result;

        System.out.println("Mayın tarlasına hoşgeldiniz ...");
        System.out.print("Mayın tablosu satır genişliğini giriniz : ");
        int x = inp.nextInt();
        System.out.print("Mayın tablosu sütun genişliğini giriniz : ");
        int y = inp.nextInt();

        mineSweeper = new MineSweeper(x, y);
        mineSweeper.printMineTable();
        System.out.println("=========================");
        System.out.println("Oyun Tablosu");

        while(!mineSweeper.isFinished){
            mineSweeper.printTable();
            System.out.print("Satır giriniz : ");
            int selectedX = inp.nextInt();
            System.out.print("Sütun giriniz : ");
            int selectedY = inp.nextInt();
            result = mineSweeper.getMines(selectedX, selectedY);
            mineSweeper.checkGame(selectedX, selectedY, result);
            System.out.println("=========================");
        }
    }
}

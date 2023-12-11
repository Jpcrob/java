package test.pack;
import java.lang.*;
import java.time.LocalDate;

public class sampleQuiz {
    static int x = 11;
		private int y = 33;

        public static void main(String args[]){
                sampleQuiz pro = new sampleQuiz();
                pro.method(5);
                System.out.print(sampleQuiz.x);
                System.out.print(" " + pro.x);
                System.out.print(" " + pro.y);
        }

        public void method(int x){
                x = 10;
                y = 12;
        }
	}
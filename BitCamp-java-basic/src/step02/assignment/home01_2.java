package step02.assignment;

// 4단계: 사용할 변수를 먼저 선언하기
public class home01_2 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name= new String[6];
        int[] kor=new int[6];
        int[] eng=new int[6];
        int[] math=new int[6];
        int[] sum=new int[6];
        float[] average=new float[6];

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[0] = keyScan.next();
        kor[0] = keyScan.nextInt();
        eng[0] = keyScan.nextInt();
        math[0] = keyScan.nextInt();

        sum[0] = kor[0] + eng[0] + math[0];
        average[0] = sum[0] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[1] = keyScan.next();
        kor[1] = keyScan.nextInt();
        eng[1] = keyScan.nextInt();
        math[1] = keyScan.nextInt();

        sum[1] = kor[1] + eng[1] + math[1];
        average[1] = sum[1] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[2] = keyScan.next();
        kor[2] = keyScan.nextInt();
        eng[2] = keyScan.nextInt();
        math[2] = keyScan.nextInt();

        sum[2] = kor[2] + eng[2] + math[2];
        average[2] = sum[2] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[3] = keyScan.next();
        kor[3] = keyScan.nextInt();
        eng[3] = keyScan.nextInt();
        math[3] = keyScan.nextInt();

        sum[3] = kor[3] + eng[3] + math[3];
        average[3] = sum[3] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[4] = keyScan.next();
        kor[4] = keyScan.nextInt();
        eng[4] = keyScan.nextInt();
        math[4] = keyScan.nextInt();

        sum[4] = kor[4] + eng[4] + math[4];
        average[4] = sum[4] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[5] = keyScan.next();
        kor[5] = keyScan.nextInt();
        eng[5] = keyScan.nextInt();
        math[5] = keyScan.nextInt();

        sum[5] = kor[5] + eng[5] + math[5];
        average[5] = sum[5] / 3;
        

        System.out.println("------------------------------");
        
        System.out.print(name[0]);
        System.out.print(" ");
        System.out.print(kor[0]);
        System.out.print(" ");
        System.out.print(eng[0]);
        System.out.print(" ");
        System.out.print(math[0]);
        System.out.print(" ");
        System.out.print(sum[0]);
        System.out.print(" ");
        System.out.print(average[0]);
        System.out.println();

        System.out.print(name[1]);
        System.out.print(" ");
        System.out.print(kor[1]);
        System.out.print(" ");
        System.out.print(eng[1]);
        System.out.print(" ");
        System.out.print(math[1]);
        System.out.print(" ");
        System.out.print(sum[1]);
        System.out.print(" ");
        System.out.print(average[1]);
        System.out.println();

        System.out.print(name[2]);
        System.out.print(" ");
        System.out.print(kor[2]);
        System.out.print(" ");
        System.out.print(eng[2]);
        System.out.print(" ");
        System.out.print(math[2]);
        System.out.print(" ");
        System.out.print(sum[2]);
        System.out.print(" ");
        System.out.print(average[2]);
        System.out.println();

        System.out.print(name[3]);
        System.out.print(" ");
        System.out.print(kor[3]);
        System.out.print(" ");
        System.out.print(eng[3]);
        System.out.print(" ");
        System.out.print(math[3]);
        System.out.print(" ");
        System.out.print(sum[3]);
        System.out.print(" ");
        System.out.print(average[3]);
        System.out.println();

        System.out.print(name[4]);
        System.out.print(" ");
        System.out.print(kor[4]);
        System.out.print(" ");
        System.out.print(eng[4]);
        System.out.print(" ");
        System.out.print(math[4]);
        System.out.print(" ");
        System.out.print(sum[4]);
        System.out.print(" ");
        System.out.print(average[4]);
        System.out.println();

        System.out.print(name[5]);
        System.out.print(" ");
        System.out.print(kor[5]);
        System.out.print(" ");
        System.out.print(eng[5]);
        System.out.print(" ");
        System.out.print(math[5]);
        System.out.print(" ");
        System.out.print(sum[5]);
        System.out.print(" ");
        System.out.print(average[5]);
        System.out.println();
    }
}
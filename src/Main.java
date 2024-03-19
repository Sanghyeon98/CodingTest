public class Main {
    public static void main(String[] args) {

//        for(int i = 0; i<5; i++){
//            for(int l=5; l>0; l--){
//
//            }
//            for(int j= 0; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 0; k<5-i;k++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        for(int i = 0; i<5; i++){
//            for(int k = 0; k<5-i; k++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j<2*i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for(int l= 0; l<4; l++){
//            System.out.print(" ");
//            for(int m=0; m<l+1; m++){
//                System.out.print(" ");
//            }
//            for(int n=0; n<7-2*l ; n++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//      9 7 5 3 1
//
//      0 1 2 3 4
//
//            9 - 2*l 0
//
//            9 - 2*l 1 -> 7
//            9 - 2*l 2 -> 5
//
////        * * * * *
////        * * * *
////        * * *
////        * *
////        *
//
//    }
        int size = 6; // 하트의 크기를 조절할 수 있는 변수

        // 위쪽 부분
        for (int i = size / 2; i >= -size / 2; i--) {
            for (int j = 0; j < 2 * size; j++) {
                if (Math.pow(i, 2) <= Math.pow(size - Math.abs(j - size), 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 아래쪽 부분
        for (int i = -size / 2 + 1; i <= size / 2; i++) {
            for (int j = 0; j < 2 * size; j++) {
                if (Math.pow(i, 2) <= Math.pow(size - Math.abs(j - size), 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

class algo007{
    public static void main(String[] args){

        //初期処理
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //試験の回数  
        int l = sc.nextInt(); //学生の人数

        //全学生の点数を取得
        int[][] score = new int[l][n];
        for (int i = 0; i < l; i++){
            for (int j = 0; j < n; j++){
                score[i][j] = sc.nextInt();
            }
        }

        
        int[] winCount = new int[l];

        //n回目の試験の最高得点を決める
        for (int j = 0; j < n; j++){
            int max = -1;
            for (int i = 0; i < l; i++){
                if(score[i][j] > max){
                max = score[i][j];
                }
            }

            //最高得点の生徒をカウント
            for (int i = 0; i < l; i++){
                if(score[i][j] == max){
                    winCount[i]++;
                }
            }
        }

        int maxCount = -1;
        int topStudent = 0;
        for (int i = 0; i < l; i++){
            if (winCount[i] > maxCount){
                maxCount = winCount[i];
                topStudent = i + 1;
            }
        }

        System.out.println(topStudent + " " + maxCount);
    }
}
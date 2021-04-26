

import java.util.Scanner;


public class Report{
    private int year;
    private int month;
    private int date;
    private int day;
    private int location;
    private int understandingLevel;
    private int satisfactoryLevel;
    private int selfEvaluation;
    private String duration, thoughts;
    public Report(){};
    
    public void start(){
        Scanner sc = new Scanner(System.in);
        //ユーザー入力部分
        //>>全て入力完了後ReportListクラス内の対応するフィールドに値をそれぞれ追加
        System.out.print("作成年を入力してください： ");
        this.year = sc.nextInt();
        System.out.print("作成月を入力してください：");
        this.month = sc.nextInt();
        System.out.print("作成日を入力してください：");
        this.date = sc.nextInt();
        System.out.print("曜日を選択してください(1:日, 2:月, 3:火, 4:水, 5:木, 6:金, 7:土)：");
        this.day = sc.nextInt();
        System.out.print("受講時間を入力したください：");
        this.duration = sc.next();
        System.out.print("受講場所を選択してください（1.本社, 2.在宅)：");
        this.location = sc.nextInt();
        System.out.print("理解度を選択してください(1:◎,2:〇,3:△, 4:✕)：");
        this.understandingLevel = sc.nextInt();
        System.out.print("満足度を選択してください(1:大変満足,2:満足,3:普通, 4:やや不満, 5:不満 )：");
        this.satisfactoryLevel = sc.nextInt();
        System.out.print("自己評価(主体性)を選択してください(1:〇, 2:△,3:,✕)：");
        this.selfEvaluation = sc.nextInt();
        System.out.print("所見を入力してください：");
        this.thoughts = sc.next();
        System.out.print("次の操作を選択してください(1.作成したレポートの閲覧, 2.全てのレポートの閲覧):");
        int exCommand = sc.nextInt();

        ReportList rpList = new ReportList(this.year, this.month, this.date, this.day, this.understandingLevel,this.satisfactoryLevel,this.selfEvaluation, this.location, this.duration, this.thoughts);
        //操作の選択による分岐
        if(exCommand==1){ rpList.dispLatestMonthReaport();}
        else if(exCommand==2){ rpList.dispReport();}
        sc.close();
    };
}
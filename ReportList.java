import java.util.ArrayList;
public class ReportList {
    ArrayList<Integer> year = new ArrayList<>();
    ArrayList<Integer> month = new ArrayList<>();
    ArrayList<Integer> date = new ArrayList<>();
    ArrayList<Integer> day = new ArrayList<>();
    ArrayList<String> duration = new ArrayList<>();
    ArrayList<String> thoughts = new ArrayList<>();
    ArrayList<Integer> location = new ArrayList<>();
    ArrayList<Integer> understandingLevel = new ArrayList<>();
    ArrayList<Integer> satisfactoryLevel = new ArrayList<>();
    ArrayList<Integer> selfEvaluation = new ArrayList<>();
    //Reportクラスのstart()メソッドから値を受け取りリストに追加
    public ReportList(int year, int month, int date, int day, int understandingLevel, int satisfactoryLevel,int selfEvaluation, int location,String duration, String thoughts){
        this.year.add(year);
        this.month.add(month);
        this.date.add(date);
        this.day.add(day);
        this.location.add(location);
        this.understandingLevel.add(understandingLevel);
        this.satisfactoryLevel.add(satisfactoryLevel);
        this.selfEvaluation.add(selfEvaluation);
        this.duration.add(duration);
        this.thoughts.add(thoughts);
    }
    //作成された全てのレポートの表示
    public void dispReport(){
        String month ="";
        String date  ="";
        String day ="";
        String location ="";
        String understandingLevel="";
        String satisfactoryLevel ="";
        String selfEvaluation = "";

        for(int i =0; i < this.year.size(); i++){
        //作成曜日        
        switch(this.day.get(i)){
            case 1: day="日"; break;
            case 2: day="月"; break;
            case 3: day="火"; break;
            case 4: day="水"; break;
            case 5: day="木"; break;
            case 6: day="金"; break;
            case 7: day="土"; break;
        }
        //出勤場所
        switch(this.location.get(i)){
            case 1: location = "本社"; break;
            case 2: location = "在宅"; break;
        }
        //受講評価>>理解度
        switch(this.understandingLevel.get(i)){
            case 1: understandingLevel = "よく理解できた"; break;
            case 2: understandingLevel = "理解できた"; break;
            case 3: understandingLevel = "あまり理解できなかった"; break;
            case 4: understandingLevel = "理解できなかった"; break;
        }
        //受講評価>>満足度
        switch(this.satisfactoryLevel.get(i)){
            case 1: satisfactoryLevel = "とても満足"; break;
            case 2: satisfactoryLevel = "満足"; break;
            case 3: satisfactoryLevel = "普通"; break;
            case 4: satisfactoryLevel = "やや不満"; break;
            case 5: satisfactoryLevel = "不満"; break;
        }
        //受講評価>>主体性の自己評価
        switch(this.selfEvaluation.get(i)){
            case 1: selfEvaluation = "積極的に取り組めた"; break;
            case 2: selfEvaluation = "一部、反省すべき点があった"; break;
            case 3: selfEvaluation = "消極的だった"; break;
        }

        if(this.month.get(i)<10){month = "0"+this.month.get(i);} else{month =""+this.month.get(i);}
        if(this.date.get(i)<10){date = "0"+this.date.get(i);} else{date = ""+this.date.get(i);}

        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("| 受講レポート（"+this.year.get(i)+"年"+month+"月"+date+"日"+"）|");
        System.out.println("|_______________________________|");
        System.out.println("");
        System.out.println("作成日時: "+ this.year.get(i)+"年"+this.month.get(i)+"月"+this.date.get(i)+"日("+day+")");
        System.out.println("受講場所：" + location + "  受講時間：" + this.duration.get(i));
        System.out.println("受講評価： \n\r     >>理解度："+understandingLevel+"||   >>満足度："+satisfactoryLevel+"||   >>自己評価："+selfEvaluation);
        }
    }
    //最後に作成されたレポートの表示
    public void dispLatestMonthReaport(){
        int i = this.year.size()-1;
        String month ="";
        String date  ="";
        String day ="";
        String location ="";
        String understandingLevel="";
        String satisfactoryLevel ="";
        String selfEvaluation = "";

        //作成曜日        
        switch(this.day.get(i)){
            case 1: day="日"; break;
            case 2: day="月"; break;
            case 3: day="火"; break;
            case 4: day="水"; break;
            case 5: day="木"; break;
            case 6: day="金"; break;
            case 7: day="土"; break;
        }
        //出勤場所
        switch(this.location.get(i)){
            case 1: location = "本社"; break;
            case 2: location = "在宅"; break;
        }
        //受講評価>>理解度
        switch(this.understandingLevel.get(i)){
            case 1: understandingLevel = "よく理解できた"; break;
            case 2: understandingLevel = "理解できた"; break;
            case 3: understandingLevel = "あまり理解できなかった"; break;
            case 4: understandingLevel = "理解できなかった"; break;
        }
        //受講評価>>満足度
        switch(this.satisfactoryLevel.get(i)){
            case 1: satisfactoryLevel = "とても満足"; break;
            case 2: satisfactoryLevel = "満足"; break;
            case 3: satisfactoryLevel = "普通"; break;
            case 4: satisfactoryLevel = "やや不満"; break;
            case 5: satisfactoryLevel = "不満"; break;
        }
        //受講評価>>主体性の自己評価
        switch(this.selfEvaluation.get(i)){
            case 1: selfEvaluation = "積極的に取り組めた"; break;
            case 2: selfEvaluation = "一部、反省すべき点があった"; break;
            case 3: selfEvaluation = "消極的だった"; break;
        }

        if(this.month.get(i)<10){month = "0"+this.month.get(i);} else{month =""+this.month.get(i);}
        if(this.date.get(i)<10){date = "0"+this.date.get(i);} else{date = ""+this.date.get(i);}

        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("| 受講レポート（"+this.year.get(i)+"年"+month+"月"+date+"日"+"）|");
        System.out.println("|_______________________________|");
        System.out.println("");
        System.out.println("作成日時: "+ this.year.get(i)+"年"+this.month.get(i)+"月"+this.date.get(i)+"日("+day+")");
        System.out.println("受講場所：" + location + "  受講時間：" + this.duration.get(i));
        System.out.println("受講評価： \n\r     >>理解度："+understandingLevel+"||   >>満足度："+satisfactoryLevel+"||   >>自己評価："+selfEvaluation);
        
    }
}
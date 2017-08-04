
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;


public class MainPaneController {
   // <!--这里的Button对象有需要加@FXML，然后变量的名称为你刚才在FXML文件中声明的Button的id属性-->
    @FXML
    private Button btnHello;
    @FXML
    private TextArea TextArea1;
    @FXML
    public  Button sudoku;
    @FXML
    public Button music;
    @FXML
    public Button start;
    @FXML
    private ImageView sudokuImage;
    @FXML
    private ImageView musicImage;
    @FXML
    private Label time;
    @FXML
    private Label memory;
    @FXML
    public ImageView left;
    @FXML
    public ImageView right;
   // <!--这里的handleButtonAction方法为我们在FXML文件中声明的onAction的处理函数-->
   @FXML
    protected void handleButtonAction(ActionEvent event) throws IOException {
	  ArrayList<String>list = new ArrayList<String>();
	 
	  list.add("一切不开心的事都可以用两个方案解决:\n找对象 or 吃肉肉！");
	  list.add("那时她还年轻，不知道生命中所有的馈赠，\n都早已在暗中标好了价格。");
	  list.add("正是绝境中的坚持，才使人被称之为人。");
	  list.add("多吃水果多吃菜，多刷绩点多做爱。");
	  list.add("先干起来，逢山开路，遇水搭桥，\n有什么问题解决什么问题。");
	  list.add("风可以吹起一张白纸，却无法吹走一只蝴蝶，\n因为生命的力量在于不顺从。");
	  list.add("如果我们终将逝去，那至少\n要有一些东西提醒自己,\n你曾经在这世上走过一遭。");
	  list.add("你所担心的事99%都不会发生，剩下的1%发生了，\n你也有能力解决.对于那极少数不能解决的，\n你也完全有能力面对。");
	  list.add("理智告诉我人无完人，但一想到你，\n我觉得凡事总有例外。");
	  list.add("世上所有的事\n都可以用跳脱的想象力和超凡的行动力解决。");
	  list.add("溪柴火软蛮毡暖，我与狸奴不出门。");
	  list.add("出发，永远是最有意义的事，去做就是了。");
	  list.add("怕什么真理无穷，进一寸有一寸的欢喜。");
	  list.add("让我们像大自然那样从容不迫地度过每一天，\n不让任何一片落在铁轨上的坚果壳\n或蚊子翅膀把我们抛出轨道。\n让我们黎明即起，迅速吃顿早餐，\n平心静气，毫不心烦；\n任客人来来去去，任钟鸣孩子哭，\n下决心过好这一天。");
	  list.add("今日的事情，尽心、尽意、尽力去做了，\n无论成绩如何，都应该高高兴兴地上床恬睡。");
	  list.add("古之成大事者，不惟有超世之才，\n亦必有坚韧不拔之志。");
	  list.add("你来自云南元谋\n我来自北京周口\n伸出毛茸茸的小手\n轻轻地咬一小口\n啊！\n是爱情让我们直立行走！");
	  list.add("民主主义也好，世界变成原子也罢，\n我只希望你能在我身边半睡半醒地看书。");
	  list.add("他人的经验最多只能参考，\n最终你也要学会独自面对一切。");
	  list.add("这世界每一天都在验证我们的渺小，\n但我们却在努力创造，n终有一天我们挥发的能动性\n会在这绮丽画卷中留下自己美好的脚印。");
	  list.add("一个人只拥有此生此世是不够的，\n他还应该拥有诗意的世界。");
	  list.add("心脏是一座有两间卧室的房子，\n一间住着痛苦，另一间住着欢乐，\n人不能笑得太响。否则笑声会吵醒隔壁房间的痛苦。 ");
	  list.add("你身体里的每一个原子都来自一颗爆炸了的恒星\n形成你左手的原子可能与右手的来自不同的恒星\n这是在是我所知物理学中最富诗意的东西\n你的一切都是星辰");
	  list.add("我是不吃面包的，麦子对我来说毫无用处，\n我对麦田无动于衷。而你的头发是金黄色的。\n所以，一旦你驯养了我，事情就变得很美妙了！\n金黄色的麦子，会让我想起你。\n我会喜爱风儿吹拂麦浪的声音……");
	  list.add("总想在阴凉的园子里给你放上一把躺椅，\n在你的手够得着的地方放上十杯牛奶。");
	  list.add("对待生命你不妨大胆一点，\n因为我们始终要失去它。");
	  list.add("就算世界荒芜,总有一个人,他会是你的信徒");
	  list.add("草在结它的种子，风在摇它的叶子。\n我们站着，不说话，就十分美好。");
	  list.add("据说那些你一笑就跟着你笑的人，\n不是傻逼就是爱你的人。");
	  list.add("在有生的瞬间能遇到你，竟花光所有运气。");
	  list.add("每一个不曾起舞的日子，都是对生命的辜负。");
	  list.add("生活在阴沟里，依然有仰望星空的权利。");
	  list.add("你不开心就欺负我好咯\n反正我那么喜欢你！");
	  list.add("我见青山多妩媚，料青山见我应如是");
	  list.add("祝你今天愉快\n你明天的愉快留着我明天再祝。");
	  list.add("在你到来之前，我迎接过阴风、海啸、惊雷、山鬼，\n以及来自心底一阵一阵的暗戾。我以天地为不屑，\n以尘间为嗤鼻，\n自诩无羁无绊，图个潇洒肆意。\n唯独没料到，你一入眼，\n我便乱了阵脚。不能自已。");
	  list.add("一生中总会遇到这样的时候，\n你的内心已经兵荒马乱天翻地覆了，\n可是在别人看来你只是比平时沉默了一点，\n没人会觉得奇怪。这种战争，注定单枪匹马。");
	  list.add("我把我整个灵魂都给你，\n连同它的怪癖，耍小脾气，忽明忽暗，\n一千八百种坏毛病。它真讨厌，\n只有一点好，爱你。");
	  list.add("你需要在口袋里经常放两张字条，\n一张写的是“我只是一粒尘埃”，\n另一张写着“世界为我而造”。");
	  list.add("一生中，你会碰到许多混蛋，\n他们伤害你，是因为他们愚蠢，\n你不必回应他们的恶意。\n世界上最糟旳就是自卑和报复心理。\n永远要维持自尊与诚实。");
	  list.add("要是世上只有我们两个人多么好，\n我一定要把你欺负得哭不出来。");
	  list.add("醒来觉得甚是爱你。");
	  list.add("遇见你,就像在最动情的时候,遇见纸笔");
	   int position =  (int) Math.rint(Math.random() * (list.size()-1));
     
        TextArea1.setText(list.get(position));
        
       
    }
    public void handleSudokuAction(ActionEvent event) throws IOException {
    	
       Stage sudokuStage = new Stage();
       BorderPane root1 = (BorderPane)FXMLLoader.load(getClass().getResource("Sudoku!.fxml"));
       Scene scene = new Scene(root1, 400, 600);
       scene.getStylesheets().add(getClass().getResource("SudokuStyle.css").toExternalForm()); 
       sudokuStage.setScene(scene);
       sudokuStage.setTitle("Sudoku!");
       sudokuStage.show();
      
   }
    public void handleMusicAction(ActionEvent event) throws IOException {
    	 Stage musicStage = new Stage();
         BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Music!.fxml"));
         Scene scene = new Scene(root, 400, 600);
     scene.getStylesheets().add(getClass().getResource("MusicStyle.css").toExternalForm()); 
         musicStage.setScene(scene);
        musicStage.setTitle("Music!");
         musicStage.show();
        
    }
 public void handleStartAction(ActionEvent event) throws IOException, ParseException {
	        Image cat1 = new Image("image/cat1.png");
	        Image cat2 = new Image("image/cat2.png");
	        left.setImage(cat2);
	        right.setImage(cat1);
			Date date=new Date();
			DateFormat format=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
			DateFormat format2=new SimpleDateFormat("EEEE");
			String time2 = format2.format(date);
			if(time2.equals("星期一")){
				time2 = "Monday";
			}
			if(time2.equals("星期二")){
				time2 = "Tuesday";
			}
			if(time2.equals("星期三")){
				time2 = "Wednesday";
			}
			if(time2.equals("星期四")){
				time2 = "Thursday";
			}
			if(time2.equals("星期五")){
				time2 = "Friday";
			}
			if(time2.equals("星期六")){
				time2 = "Saturday";
			}
			if(time2.equals("星期日")){
				time2 = "Sunday";
			}
			String time1=format.format(date);
			time.setText(time1+" "+time2);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		    long to = df.parse("2017-3-31").getTime();
		    String now = df.format(date);
		    long from = df.parse(now).getTime();
		    //System.out.println((from - to) / (1000 * 60 * 60 * 24));
		    memory.setText("      "+(from - to) / (1000 * 60 * 60 * 24)+"  Days Till Harper Become Catty !");
	
    }
 

}
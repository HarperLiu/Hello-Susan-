import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SudokuController {
	ArrayList<TextField> textFieldList = new ArrayList<TextField>();
	ArrayList<int[]> question = new ArrayList<int[]>();
	ArrayList<int[]> answer = new ArrayList<int[]>();
	int[] q1 = { 0, 6, 1, 0, 3, 0, 0, 2, 0, 0, 5, 0, 0, 0, 8, 1, 0, 7, 0, 0, 0, 0, 0, 7, 0, 3, 4, 0, 0, 9, 0, 0, 6, 3,
			7, 8, 0, 0, 3, 2, 7, 9, 5, 0, 0, 5, 7, 0, 3, 0, 0, 9, 0, 2, 1, 9, 0, 7, 6, 0, 0, 0, 0, 8, 0, 2, 4, 0, 0, 7,
			6, 0, 6, 4, 0, 0, 1, 0, 2, 5, 0 };
	int[] a1 = { 7, 6, 1, 9, 3, 4, 8, 2, 5, 3, 5, 4, 6, 2, 8, 1, 9, 7, 9, 2, 8, 1, 5, 7, 6, 3, 4, 2, 1, 9, 5, 4, 6, 3,
			7, 8, 4, 8, 3, 2, 7, 9, 5, 1, 6, 5, 7, 6, 3, 8, 1, 9, 4, 2, 1, 9, 5, 7, 6, 2, 4, 8, 3, 8, 3, 2, 4, 9, 5, 7,
			6, 1, 6, 4, 7, 8, 1, 3, 2, 5, 9 };
	int[] q2 = { 1, 0, 0, 8, 3, 0, 0, 0, 2, 5, 7, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 9, 0, 6, 4, 7, 0, 4, 0, 0, 8, 5,
			9, 0, 0, 0, 3, 0, 1, 0, 4, 0, 0, 0, 5, 1, 4, 0, 0, 3, 0, 6, 3, 6, 0, 7, 0, 4, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0,
			7, 9, 8, 0, 0, 0, 5, 2, 0, 0, 3 };
	int[] a2 = { 1, 4, 9, 8, 3, 6, 7, 5, 2, 5, 7, 6, 2, 4, 1, 9, 3, 8, 2, 3, 8, 5, 7, 9, 1, 6, 4, 7, 2, 4, 3, 6, 8, 5,
			9, 1, 6, 8, 3, 9, 1, 5, 4, 2, 7, 9, 5, 1, 4, 2, 7, 3, 8, 6, 3, 6, 2, 7, 9, 4, 8, 1, 5, 4, 1, 5, 6, 8, 3, 2,
			7, 9, 8, 9, 7, 1, 5, 2, 6, 4, 3 };
	int[] q3 = { 0, 3, 0, 0, 0, 7, 0, 0, 4, 6, 0, 2, 0, 4, 1, 0, 0, 0, 0, 5, 0, 0, 3, 0, 9, 6, 7, 0, 4, 0, 0, 0, 3, 0,
			0, 6, 0, 8, 7, 0, 0, 0, 3, 5, 0, 9, 0, 0, 7, 0, 0, 0, 2, 0, 7, 1, 8, 0, 2, 0, 0, 4, 0, 0, 0, 0, 1, 6, 0, 8,
			0, 9, 4, 0, 0, 5, 0, 0, 0, 3, 0 };
	int[] a3 = { 8, 3, 9, 6, 5, 7, 2, 1, 4, 6, 7, 2, 9, 4, 1, 5, 8, 3, 1, 5, 4, 8, 3, 2, 9, 6, 7, 5, 4, 1, 2, 8, 3, 7,
			9, 6, 2, 8, 7, 4, 9, 6, 3, 5, 1, 9, 6, 3, 7, 1, 5, 4, 2, 8, 7, 1, 8, 3, 2, 9, 6, 4, 5, 3, 2, 5, 1, 6, 4, 8,
			7, 9, 4, 9, 6, 5, 7, 8, 1, 3, 2 };
	int[] q4 = { 0, 8, 5, 0, 0, 0, 2, 1, 0, 0, 9, 4, 0, 1, 2, 0, 0, 3, 0, 0, 0, 3, 0, 0, 7, 0, 4, 5, 0, 3, 4, 0, 9, 0,
			0, 0, 0, 4, 0, 2, 0, 6, 0, 3, 0, 0, 0, 0, 1, 0, 3, 9, 0, 7, 6, 0, 8, 0, 0, 5, 0, 0, 0, 1, 0, 0, 8, 4, 0, 3,
			6, 0, 0, 2, 7, 0, 0, 0, 8, 9, 0 };
	int[] a4 = { 3, 8, 5, 7, 6, 4, 2, 1, 9, 7, 9, 4, 5, 1, 2, 6, 8, 3, 2, 1, 6, 3, 9, 8, 7, 5, 4, 5, 7, 3, 4, 8, 9, 1,
			2, 6, 9, 4, 1, 2, 7, 6, 5, 3, 8, 9, 6, 2, 1, 5, 3, 9, 4, 7, 6, 3, 8, 9, 2, 5, 4, 7, 1, 1, 5, 9, 8, 4, 7, 3,
			6, 2, 4, 2, 7, 6, 3, 1, 8, 9, 5 };
	int[] q5 = { 0, 8, 0, 0, 0, 1, 6, 0, 0, 0, 7, 0, 4, 0, 0, 0, 2, 1, 5, 0, 0, 3, 9, 6, 0, 0, 0, 2, 0, 4, 0, 5, 0, 1,
			3, 0, 0, 0, 8, 9, 0, 7, 5, 0, 0, 0, 5, 7, 0, 3, 0, 9, 0, 0, 0, 0, 0, 5, 6, 3, 0, 0, 9, 3, 1, 0, 0, 0, 2, 0,
			5, 0, 0, 0, 5, 8, 0, 0, 0, 4, 0 };
	int[] a5 = { 4, 8, 3, 2, 7, 1, 6, 9, 5, 9, 7, 6, 4, 8, 5, 3, 2, 1, 5, 2, 1, 3, 9, 6, 4, 7, 8, 2, 9, 4, 6, 5, 8, 1,
			3, 7, 1, 3, 8, 9, 2, 7, 5, 6, 4, 6, 5, 7, 1, 3, 4, 9, 8, 2, 8, 4, 2, 5, 6, 3, 7, 1, 9, 3, 1, 9, 7, 4, 2, 8,
			5, 6, 7, 6, 5, 8, 1, 9, 2, 4, 3 };
	int[] q6 = { 0, 0, 7, 0, 0, 0, 9, 0, 0, 2, 0, 0, 5, 0, 7, 0, 0, 6, 0, 8, 0, 1, 0, 4, 0, 7, 0, 0, 4, 0, 0, 1, 0, 0,
			3, 0, 6, 0, 1, 0, 0, 0, 8, 0, 9, 0, 9, 0, 0, 8, 0, 0, 6, 0, 0, 5, 0, 8, 0, 9, 0, 1, 0, 0, 1, 0, 6, 0, 3, 0,
			0, 2, 0, 0, 6, 0, 0, 0, 3, 0, 0 };
	int[] a6 = { 1, 6, 7, 2, 3, 8, 9, 5, 4, 2, 3, 4, 5, 9, 7, 1, 8, 6, 5, 8, 9, 1, 6, 4, 2, 7, 3, 8, 4, 2, 9, 1, 6, 7,
			3, 5, 6, 7, 1, 3, 4, 5, 8, 2, 9, 3, 9, 5, 7, 8, 2, 4, 6, 1, 4, 5, 3, 8, 2, 9, 6, 1, 7, 9, 1, 8, 6, 7, 3, 5,
			4, 2, 7, 2, 6, 4, 5, 1, 3, 9, 8 };
	int[]q7 = {0,7,0,1,0,3,0,6,0,0,5,0,0,0,0,0,7,0,3,0,0,0,5,0,0,0,1,5,0,0,3,0,4,0,0,8,4,0,7,0,0,0,1,0,2,9,0,0,7,0,2,0,0,4,2,0,0,0,7,0,0,0,3,0,3,0,0,0,0,0,4,0,0,6,0,5,0,9,0,2,0};
	int[]a7 = {8,7,2,1,9,3,4,6,5,6,5,1,2,4,8,3,7,9,3,4,9,6,5,7,2,8,1,5,2,6,3,1,4,7,9,8,4,8,7,9,5,6,1,3,2,9,1,3,7,8,2,6,5,4,2,9,8,4,7,6,5,1,3,7,3,5,8,2,1,9,4,6,1,6,4,5,3,9,8,2,7};
	int[]q8 = {0,0,0,0,1,3,4,0,0,0,8,0,0,0,6,9,5,0,6,5,0,0,0,0,0,0,0,9,6,0,2,0,1,0,0,0,1,0,0,0,7,0,0,0,2,0,0,0,3,0,4,0,1,6,0,0,0,0,0,0,0,7,9,0,2,5,8,0,0,0,4,0,0,0,9,7,6,0,0,0,0};
	int[]a8 = {2,9,7,5,1,3,4,6,8,3,8,1,4,2,6,9,5,7,6,5,4,9,8,7,1,2,3,9,6,8,2,5,1,7,3,4,1,4,3,6,7,8,5,9,2,5,7,2,3,9,4,8,1,6,8,3,6,1,4,5,2,7,9,7,2,5,8,3,9,6,4,1,4,1,9,7,6,2,3,8,5};
	int[]q9 = {0,0,1,0,9,0,2,7,0,0,0,9,0,0,2,0,5,0,2,0,0,0,0,3,0,0,0,3,0,0,0,1,4,0,0,2,0,8,0,0,0,0,0,4,0,1,0,0,2,8,0,0,0,5,0,0,0,9,0,0,0,0,7,0,1,0,3,0,0,9,0,0,0,4,6,0,7,0,5,0,0};
	int[]a9 = {5,3,1,4,9,8,2,7,6,4,7,9,1,6,2,3,5,8,2,6,8,7,5,3,4,1,9,3,5,7,6,1,4,8,9,2,6,8,2,5,3,9,7,4,1,1,9,4,2,8,7,6,3,5,8,2,3,9,4,5,1,6,7,7,1,5,3,2,6,9,8,4,9,4,6,8,7,1,5,2,3};
	int[] currentQuestion = new int[81];
	int[] currentAnswer = new int[81];
	int[] userAnswer = new int[81];
	int choose;
	boolean correct = true;
	boolean commitable = true;
	@FXML
	private Button restart;
	@FXML
	private Button commit;
	@FXML
	private Button start;
	@FXML
	private Button show;
	@FXML
	private Label hint;
	@FXML
	private Label history;
	@FXML
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
	@FXML
	private TextField t5;
	@FXML
	private TextField t6;
	@FXML
	private TextField t7;
	@FXML
	private TextField t8;
	@FXML
	private TextField t9;
	@FXML
	private TextField t10;
	@FXML
	private TextField t11;
	@FXML
	private TextField t12;
	@FXML
	private TextField t13;
	@FXML
	private TextField t14;
	@FXML
	private TextField t15;
	@FXML
	private TextField t16;
	@FXML
	private TextField t17;
	@FXML
	private TextField t18;
	@FXML
	private TextField t19;
	@FXML
	private TextField t20;
	@FXML
	private TextField t21;
	@FXML
	private TextField t22;
	@FXML
	private TextField t23;
	@FXML
	private TextField t24;
	@FXML
	private TextField t25;
	@FXML
	private TextField t26;
	@FXML
	private TextField t27;
	@FXML
	private TextField t28;
	@FXML
	private TextField t29;
	@FXML
	private TextField t30;
	@FXML
	private TextField t31;
	@FXML
	private TextField t32;
	@FXML
	private TextField t33;
	@FXML
	private TextField t34;
	@FXML
	private TextField t35;
	@FXML
	private TextField t36;
	@FXML
	private TextField t37;
	@FXML
	private TextField t38;
	@FXML
	private TextField t39;
	@FXML
	private TextField t40;
	@FXML
	private TextField t41;
	@FXML
	private TextField t42;
	@FXML
	private TextField t43;
	@FXML
	private TextField t44;
	@FXML
	private TextField t45;
	@FXML
	private TextField t46;
	@FXML
	private TextField t47;
	@FXML
	private TextField t48;
	@FXML
	private TextField t49;
	@FXML
	private TextField t50;
	@FXML
	private TextField t51;
	@FXML
	private TextField t52;
	@FXML
	private TextField t53;
	@FXML
	private TextField t54;
	@FXML
	private TextField t55;
	@FXML
	private TextField t56;
	@FXML
	private TextField t57;
	@FXML
	private TextField t58;
	@FXML
	private TextField t59;
	@FXML
	private TextField t60;
	@FXML
	private TextField t61;
	@FXML
	private TextField t62;
	@FXML
	private TextField t63;
	@FXML
	private TextField t64;
	@FXML
	private TextField t65;
	@FXML
	private TextField t66;
	@FXML
	private TextField t67;
	@FXML
	private TextField t68;
	@FXML
	private TextField t69;
	@FXML
	private TextField t70;
	@FXML
	private TextField t71;
	@FXML
	private TextField t72;
	@FXML
	private TextField t73;
	@FXML
	private TextField t74;
	@FXML
	private TextField t75;
	@FXML
	private TextField t76;
	@FXML
	private TextField t77;
	@FXML
	private TextField t78;
	@FXML
	private TextField t79;
	@FXML
	private TextField t80;
	@FXML
	private TextField t81;

	public void handleRestartAction(ActionEvent event) throws IOException {
		hint.setText(" Hello,Susan! It's Time For Sudoku!");
		commitable = true;
		for (int i = 0; i < textFieldList.size(); i++) {
			if (currentQuestion[i] != 0) {
				textFieldList.get(i).setText(Integer.toString(currentQuestion[i]));
				textFieldList.get(i).setEditable(false);
			} else {
				textFieldList.get(i).setText("");
			}
		}
	}

	public void handleCommitAction(ActionEvent event) throws IOException {
		for (int i = 0; i < textFieldList.size(); i++) {
			textFieldList.get(i).getText().trim();
			if (textFieldList.get(i).getText().equals("")) {
				userAnswer[i] = 0;
				continue;
			}

			if (Integer.parseInt(textFieldList.get(i).getText()) > 9
					|| Integer.parseInt(textFieldList.get(i).getText()) < 1) {
				userAnswer[i] = 0;
			}

			else {
				userAnswer[i] = Integer.parseInt(textFieldList.get(i).getText().trim());
			}
		}
		for (int i = 0; i < currentAnswer.length; i++) {
			if (currentAnswer[i] == userAnswer[i]) {
			} else {
				correct = false;
			}
		}
		if (correct == true && commitable == true) {
			hint.setText(" You win! How clever are you !");
			try {
				File historyWinTimes = new File("document/historyWinTimes");
				FileReader reader = new FileReader(historyWinTimes);
				BufferedReader br = new BufferedReader(reader);
				int times = Integer.parseInt(br.readLine());
				times = times + 1;
				FileWriter writer = new FileWriter(historyWinTimes);
				writer.write(Integer.toString(times));
				reader.close();
				writer.close();
				history.setText(" History Win Times : " + times + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (correct == false) {
			hint.setText(" Something is wrong, How about Try Again?");
		}
		if (commitable == false) {
			hint.setText(" You have known the result my dear!");
		}

	}

	public void handleShowAction(ActionEvent event) throws IOException {
		for (int i = 0; i < textFieldList.size(); i++) {
			textFieldList.get(i).setText(Integer.toString(currentAnswer[i]));

		}
		commitable = false;
		hint.setText(" Here Comes Result!");
	}

	public void handleStartAction(ActionEvent event) throws IOException {
		question.clear();
		answer.clear();
		textFieldList.clear();
		hint.setText(" Hello,Susan! It's Time For Sudoku!");

		try {
			File historyWinTimes = new File("document/historyWinTimes");
			FileReader reader = new FileReader(historyWinTimes);
			BufferedReader br = new BufferedReader(reader);
			int times = Integer.parseInt(br.readLine());

			reader.close();

			history.setText(" History Win Times : " + times + " ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		commitable = true;
		question.add(q1);
		answer.add(a1);
		question.add(q2);
		answer.add(a2);
		question.add(q3);
		answer.add(a3);
		question.add(q4);
		answer.add(a4);
		question.add(q5);
		answer.add(a5);
		question.add(q6);
		answer.add(a6);
		question.add(q7);
		answer.add(a7);
		question.add(q8);
		answer.add(a8);
		question.add(q9);
		answer.add(a9);
		textFieldList.add(t1);
		textFieldList.add(t2);
		textFieldList.add(t3);
		textFieldList.add(t4);
		textFieldList.add(t5);
		textFieldList.add(t6);
		textFieldList.add(t7);
		textFieldList.add(t8);
		textFieldList.add(t9);

		textFieldList.add(t10);
		textFieldList.add(t11);
		textFieldList.add(t12);
		textFieldList.add(t13);
		textFieldList.add(t14);
		textFieldList.add(t15);
		textFieldList.add(t16);
		textFieldList.add(t17);
		textFieldList.add(t18);

		textFieldList.add(t19);
		textFieldList.add(t20);
		textFieldList.add(t21);
		textFieldList.add(t22);
		textFieldList.add(t23);
		textFieldList.add(t24);
		textFieldList.add(t25);
		textFieldList.add(t26);
		textFieldList.add(t27);

		textFieldList.add(t28);
		textFieldList.add(t29);
		textFieldList.add(t30);
		textFieldList.add(t31);
		textFieldList.add(t32);
		textFieldList.add(t33);
		textFieldList.add(t34);
		textFieldList.add(t35);
		textFieldList.add(t36);

		textFieldList.add(t37);
		textFieldList.add(t38);
		textFieldList.add(t39);
		textFieldList.add(t40);
		textFieldList.add(t41);
		textFieldList.add(t42);
		textFieldList.add(t43);
		textFieldList.add(t44);
		textFieldList.add(t45);

		textFieldList.add(t46);
		textFieldList.add(t47);
		textFieldList.add(t48);
		textFieldList.add(t49);
		textFieldList.add(t50);
		textFieldList.add(t51);
		textFieldList.add(t52);
		textFieldList.add(t53);
		textFieldList.add(t54);

		textFieldList.add(t55);
		textFieldList.add(t56);
		textFieldList.add(t57);
		textFieldList.add(t58);
		textFieldList.add(t59);
		textFieldList.add(t60);
		textFieldList.add(t61);
		textFieldList.add(t62);
		textFieldList.add(t63);

		textFieldList.add(t64);
		textFieldList.add(t65);
		textFieldList.add(t66);
		textFieldList.add(t67);
		textFieldList.add(t68);
		textFieldList.add(t69);
		textFieldList.add(t70);
		textFieldList.add(t71);
		textFieldList.add(t72);

		textFieldList.add(t73);
		textFieldList.add(t74);
		textFieldList.add(t75);
		textFieldList.add(t76);
		textFieldList.add(t77);
		textFieldList.add(t78);
		textFieldList.add(t79);
		textFieldList.add(t80);
		textFieldList.add(t81);

		choose = (int) Math.rint(Math.random() * 8);
		// System.out.println(choose);
		// System.out.println(question.size());
		currentQuestion = question.get(choose);
		currentAnswer = answer.get(choose);
		for (int i = 0; i < textFieldList.size(); i++) {
			if (currentQuestion[i] != 0) {
				textFieldList.get(i).setText(Integer.toString(currentQuestion[i]));
				textFieldList.get(i).setEditable(false);
			} else {
				textFieldList.get(i).setText("");
			}
		}

		choose = 0;

	}

}

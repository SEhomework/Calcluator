
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class JCalculator extends Frame{
 Panel panel1=null;
 Panel panel2=null;
 Panel panel3=null;
 TextField txt;
 Button[] button=new Button[22];
 String[] string={"1","2","3","4","+","5","6","7","8","-","9","0",".","=","*","/","sqrt","^2","x^y","abs","清空","关闭"};
 static double a;
 static String s,str;//定义变量，创建对象
 
 public JCalculator(String c){//构造方法
  super(c);
  initialize();
 }
 
 public void initialize(){//初始化窗体
  this.setSize(180,240);
  this.setLocation(350,200);
  this.setBackground(Color.black);
  this.setResizable(false);
  this.addPanel();
 }
 
 public void addPanel(){//往窗体中添加面板
  this.add(getPanel1(),BorderLayout.NORTH);
  this.add(getPanel2(),BorderLayout.CENTER);
  this.add(getPanel3(),BorderLayout.SOUTH); 
 }
 
 public static void main(String[] args){
  JCalculator calculator=new JCalculator("计算器");
  calculator.addWindowListener(new Close());
  calculator.setVisible(true);
 }
 
 public Panel getPanel1(){
  if(panel1==null){
   panel1=new Panel();
   panel1.setLayout(new BorderLayout());
   panel1.add(getTextField(),BorderLayout.NORTH);
  }
  return panel1;
 }
 
 public Panel getPanel2(){
  if(panel2==null){
   panel2=new Panel();
   panel2.setLayout(new GridLayout(4,5,10,10));
   for(int i=0;i<=19;i++){//添加按钮到panel2中
    panel2.add(button[i]=new Button(string[i]));
    button[i].addActionListener(new buttonListener());
   }  
  }
  return panel2;
 }
 
 public Panel getPanel3(){
  if(panel3==null){
   panel3=new Panel();
   panel3.setBackground(Color.gray);
   panel3.setLayout(new FlowLayout());
   for(int i=20;i<=21;i++){
    button[i]=new Button(string[i]);
   }
   for(int i=20;i<=21;i++)
    panel3.add(button[i]);
   button[20].addActionListener(new buttonListener());//为"清空"按钮添加监听器
   button[21].addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
     System.exit(0); 
    } 
   });//添加监听器，退出程序        
  }
  return panel3;
 }
 
 public TextField getTextField(){//获得文本框
  txt=new TextField(18);
  txt.setEditable(false);
  return txt;
 }
 
 class buttonListener implements ActionListener{
 public void actionPerformed(ActionEvent e){
  Button bn=(Button)e.getSource();
  if(bn.getLabel()=="="){
   calculate();
   str=String.valueOf(a);
   txt.setText(str);
   s="";
  }else if(bn.getLabel()=="+"){
   calculate();
   txt.setText("");
   s="+";
  }else if(bn.getLabel()=="-"){
   calculate();
   txt.setText("");
   s="-";
  }else if(bn.getLabel()=="*"){
   calculate();
   txt.setText("");
   s="*";
  }else if(bn.getLabel()=="/"){
   calculate();
   txt.setText("");
   s="/";
  }else if(bn.getLabel()=="^2"){
   calculate();
   txt.setText("");
   s="^2";
  }else if(bn.getLabel()=="sqrt"){
    calculate();
    txt.setText("");
	s="sqrt";
  }else if(bn.getLabel()=="x^y"){
	  calculate();
	   txt.setText("");
	   s="x^y";
  }

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator extends Frame{
 Panel panel1=null;
 Panel panel2=null;
 Panel panel3=null;
 TextField txt;
 Button[] button=new Button[23];
 String[] string={"1","2","3","4","+","5","6","7","8","-","9","0",".","=","*","/","sqrt","^2","x^y","abs","清空","关闭","帮助"};
 static double a;
 static String s,str;//定义变量，创建对象
 
 public Calculator(String c){//构造方法
  super(c);
  initialize();
 }
 
 public void initialize(){//初始化窗体
  this.setSize(180,240);
  this.setLocation(350,200);
  this.setBackground(Color.black);
  this.setResizable(false);
  this.addPanel();
 }
 
 public void addPanel(){//往窗体中添加面板
  this.add(getPanel1(),BorderLayout.NORTH);
  this.add(getPanel2(),BorderLayout.CENTER);
  this.add(getPanel3(),BorderLayout.SOUTH); 
 }
 
 public static void main(String[] args){
  Calculator calculator=new Calculator("计算器");
  calculator.addWindowListener(new Close());
  calculator.setVisible(true);
 }
 
 public Panel getPanel1(){
  if(panel1==null){
   panel1=new Panel();
   panel1.setLayout(new BorderLayout());
   panel1.add(getTextField(),BorderLayout.NORTH);
  }
  return panel1;
 }
 
 public Panel getPanel2(){
  if(panel2==null){
   panel2=new Panel();
   panel2.setLayout(new GridLayout(4,5,10,10));
   for(int i=0;i<=19;i++){//添加按钮到panel2中
    panel2.add(button[i]=new Button(string[i]));
    button[i].addActionListener(new buttonListener());
   }  
  }
  return panel2;
 }
 
 public Panel getPanel3(){
  if(panel3==null){
   panel3=new Panel();
   panel3.setBackground(Color.gray);
   panel3.setLayout(new FlowLayout());
   for(int i=20;i<=22;i++){
    button[i]=new Button(string[i]);
   }
   for(int i=20;i<=22;i++)
    panel3.add(button[i]);
   button[20].addActionListener(new buttonListener());//为"清空"按钮添加监听器
   button[21].addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
     System.exit(0); 
    } 
   });//添加监听器，退出程序    
   button[22].addActionListener(new buttonListener());
  }
  return panel3;
 }
 
 public TextField getTextField(){//获得文本框
  txt=new TextField(18);
  txt.setEditable(false);
  return txt;
 }
 
 class buttonListener implements ActionListener{
 public void actionPerformed(ActionEvent e){
  Button bn=(Button)e.getSource();
  if(bn.getLabel()=="="){
   calculate();
   str=String.valueOf(a);
   txt.setText(str);
   s="";
  }else if(bn.getLabel()=="+"){
   calculate();
   txt.setText("");
   s="+";
  }else if(bn.getLabel()=="-"){
   calculate();
   txt.setText("");
   s="-";
  }else if(bn.getLabel()=="*"){
   calculate();
   txt.setText("");
   s="*";
  }else if(bn.getLabel()=="/"){
   calculate();
   txt.setText("");
   s="/";
  }else if(bn.getLabel()=="^2"){
   calculate();
   txt.setText("");
   s="^2";
  }else if(bn.getLabel()=="sqrt"){
	    calculate();
	    txt.setText("");
		s="sqrt";
	  }else if(bn.getLabel()=="x^y"){
		  calculate();
		   txt.setText("");
		   s="x^y";
	  }
	  else if(bn.getLabel()=="abs"){
		  calculate();
		   txt.setText("");
		   s="abs";
	  }else if(bn.getLabel()=="清空"){
   txt.setText(""); 
  }else if(bn.getLabel()=="帮助"){
	   txt.setText(""); 
  }else{
   txt.setText(txt.getText()+bn.getLabel()); 
  }
 }
 
 public void calculate(){//编写具体计算方法
  if(s=="+")
   a+=Double.parseDouble(txt.getText());
  else if(s=="-")
   a-=Double.parseDouble(txt.getText()); 
  else if(s=="*")
   a*=Double.parseDouble(txt.getText());
  else if(s=="/")
   a/=Double.parseDouble(txt.getText());
  else if(s=="^2")
	  a*=a;
  else if(s=="sqrt")
	  a=Math.sqrt(a);
  else if(s=="abs")
	  a=Math.abs(a);
    else if(s=="x^y")
  {
	  int temp=(int)Double.parseDouble(txt.getText());
	  System.out.println(Double.parseDouble(txt.getText()));
	  System.out.println(a);
	  int sum=1;
	  for(int i=0;i<temp;i++)
      {
	  sum*=a;
      }
	  a=sum;
  }	  
  else
   a=Double.parseDouble(txt.getText());  
 } 
}
}
class Close extends WindowAdapter{//退出系统
 public void windowClosing(WindowEvent e){
  System.exit(0); 
 } 
}

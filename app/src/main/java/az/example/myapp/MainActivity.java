package az.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
   private TextView textView;
   private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnpoint,btnc,btncd,btnmult,btndiv,btnsum,btnminus,btnprs,btnequel;

 private boolean mathoperationclick =false,numclick=false;
 private String num="",num1="";
 private String mathoperation ="";



  private String hesabla(String emel, String number, String number1){
      Double sum;
      String rs="";
      switch (emel){
          case "+":
              sum=Double.parseDouble(number)+Double.parseDouble(number1);
              rs=sum.toString();
              break;
          case "-":
              sum=Double.parseDouble(number)-Double.parseDouble(number1);
              rs=sum.toString();
              break;
          case "*":
              sum=Double.parseDouble(number)*Double.parseDouble(number1);
              rs=sum.toString();
              break;
          case "/":
              if(Double.parseDouble(number1)!=0.0) {
                  sum=Double.parseDouble(number)/Double.parseDouble(number1);
                  rs=sum.toString();
                  break;
              }
              else {
                  rs="sifira bolme yoxdu";
                  btnClose();
              break;}
          case "%":
              sum=Double.parseDouble(number)*Double.parseDouble(number1)/100;
              rs=sum.toString();
      }
     return rs;
  }
  private void btnClose(){
      btn1.setEnabled(false);
      btn2.setEnabled(false);
      btn3.setEnabled(false);
      btn4.setEnabled(false);
      btn5.setEnabled(false);
      btn6.setEnabled(false);
      btn7.setEnabled(false);
      btn8.setEnabled(false);
      btn9.setEnabled(false);
      btn0.setEnabled(false);
      btnpoint.setEnabled(false);
      btnc.setEnabled(false);
      btnmult.setEnabled(false);
      btndiv.setEnabled(false);
      btnsum.setEnabled(false);
      btnminus.setEnabled(false);
      btnprs.setEnabled(false);
      btnequel.setEnabled(false);
  }
  private void btnOpen(){
      btn1.setEnabled(true);
      btn2.setEnabled(true);
      btn3.setEnabled(true);
      btn4.setEnabled(true);
      btn5.setEnabled(true);
      btn6.setEnabled(true);
      btn7.setEnabled(true);
      btn8.setEnabled(true);
      btn9.setEnabled(true);
      btn0.setEnabled(true);
      btnpoint.setEnabled(true);
      btnc.setEnabled(true);
      btnmult.setEnabled(true);
      btndiv.setEnabled(true);
      btnsum.setEnabled(true);
      btnminus.setEnabled(true);
      btnprs.setEnabled(true);
      btnequel.setEnabled(true);

  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=this.findViewById(R.id.txtresult);
        btn1=this.findViewById(R.id.btn1);
        btn2=this.findViewById(R.id.btn2);
        btn3=this.findViewById(R.id.btn3);
        btn4=this.findViewById(R.id.btn4);
        btn5=this.findViewById(R.id.btn5);
        btn6=this.findViewById(R.id.btn6);
        btn7=this.findViewById(R.id.btn7);
        btn8=this.findViewById(R.id.btn8);
        btn9=this.findViewById(R.id.btn9);
        btn0=this.findViewById(R.id.btn0);
        btnpoint=this.findViewById(R.id.point);
        btnc=this.findViewById(R.id.btnc);
        btncd=this.findViewById(R.id.btncd);
        btnsum=this.findViewById(R.id.btnsum);
        btnminus=this.findViewById(R.id.minus);
        btnmult=this.findViewById(R.id.multiplication);
        btndiv=this.findViewById(R.id.division);
        btnpoint=this.findViewById(R.id.point);
        btnprs=this.findViewById(R.id.percent);
        btnequel=this.findViewById(R.id.equal);
         btncd.setOnClickListener(v->{
             btnOpen();
             textView.setText("");
             numclick=false;
             mathoperationclick=false;
             mathoperation ="";
             num="";
             num1="";
         });

        btn1.setOnClickListener(v->{
           textView.setText(textView.getText()+"1");
            if(!mathoperationclick) num+=1;
             else {
                 num1+=1;
                 numclick=true;
             }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn2.setOnClickListener(v->{
            textView.setText(textView.getText()+"2");
            if(!mathoperationclick) num+=2;
            else {
                num1+=2;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn3.setOnClickListener(v->{
            textView.setText(textView.getText()+"3");
            if(!mathoperationclick) num+=3;
            else{
                num1+=3;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn4.setOnClickListener(v->{
            textView.setText(textView.getText()+"4");
            if(!mathoperationclick) num+=4;
            else{
                num1+=4;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn5.setOnClickListener(v->{
            textView.setText(textView.getText()+"5");
            if(!mathoperationclick) num+=5;
            else {
                num1+=5;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn6.setOnClickListener(v->{
            textView.setText(textView.getText()+"6");
            if(!mathoperationclick) num+=6;
            else {
                num1+=6;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn7.setOnClickListener(v->{
            textView.setText(textView.getText()+"7");
            if(!mathoperationclick) num+=7;
            else {
                num1+=7;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn8.setOnClickListener(v->{
            textView.setText(textView.getText()+"8");
            if(!mathoperationclick) num+=8;
            else{
                num1+=8;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn9.setOnClickListener(v->{
            textView.setText(textView.getText()+"9");
            if(!mathoperationclick) num+=9;
            else {
                num1+=9;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btn0.setOnClickListener(v->{
            textView.setText(textView.getText()+"0");
            if(!mathoperationclick) num+=0;
            else {
                num1+=0;
                numclick=true;
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btnpoint.setOnClickListener(v->{
           if(textView.length()==0){ textView.setText(textView.getText()+"0.");num="0.";}
           else{ if(!mathoperationclick){
               num+=".";
               textView.setText(textView.getText()+".");
           }
                 else {textView.setText(textView.getText()+".");
                       num1+=".";
                       numclick=true;
                 }
           }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btnc.setOnClickListener(v->{
            if(textView.length()==0) textView.setText("");
            else textView.setText(textView.getText().toString().substring(0,textView.getText().length()-1));

            if(num1.length()>1) num1=num1.substring(0,num1.length()-1);
            else num1="";

            if((textView.getText().length()-num.length())==0){
                      mathoperation ="";
                     mathoperationclick=false;
            }
            else if(textView.getText().length()-num.length()<0){
                  num=num.substring(0,num.length()-1);
            }
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btnsum.setOnClickListener(v-> {
            if(mathoperationclick){ if(numclick) {num=hesabla(mathoperation,num,num1);num1="";}}
            textView.setText(num+"+");
            mathoperation ="+";
            mathoperationclick =true;
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
       btnminus.setOnClickListener(v->{

        if(mathoperationclick){ if(numclick) {num=hesabla(mathoperation,num,num1);num1="";}}
        if(num.length()==0){  textView.setText(num+"-");
           num="-";
            mathoperationclick =false;
        }else{
            textView.setText(num+"-");
            mathoperationclick =true;
            mathoperation ="-";
        }
        System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btnmult.setOnClickListener(v->{

            if(mathoperationclick){ if(numclick) {num=hesabla(mathoperation,num,num1);num1="";}}
            textView.setText(num+"*");
            mathoperationclick =true;
            mathoperation ="*";
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btndiv.setOnClickListener(v->{

           if(mathoperationclick){ if(numclick) {num=hesabla(mathoperation,num,num1);num1="";}}
            textView.setText(num+"/");
            mathoperationclick =true;
            mathoperation ="/";
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
        btnprs.setOnClickListener(v->{
            if(mathoperationclick){ if(numclick) {num=hesabla(mathoperation,num,num1);num1="";}}
            textView.setText(num+"%");
            mathoperationclick =true;
            mathoperation ="%";
            System.out.println(num+" "+ mathoperation +" " +num1);

        });

        btnequel.setOnClickListener(v->{

            num= hesabla(mathoperation,num,num1);
            textView.setText(textView.getText()+"="+num);
            num1="";
            mathoperation ="";
            mathoperationclick=false;
            System.out.println(num+" "+ mathoperation +" " +num1);
        });
    }
}

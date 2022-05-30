package com.example.myapplication;

import static java.lang.Float.parseFloat;
import static java.lang.Math.pow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private float a;
    private float b;
    private char c;
    private char g;
    private char d;
    private int k;
    public int s;
    public int r;
    private float cal;
    TextView t1 = null;
    TextView t2 = null;

    public MainActivity() {
        b = 0;
        r = 0;
        a = 0;
        c = ' ';
        g = ' ';
        d = ' ';
        k = 0;
        s = 0;
        cal = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.tv1);
        t2 = findViewById(R.id.tv2);
        Button b1 = findViewById(R.id.bt1);
        Button b2 = findViewById(R.id.bt2);
        Button b3 = findViewById(R.id.bt3);
        Button b4 = findViewById(R.id.bt4);
        Button b5 = findViewById(R.id.bt5);
        Button b6 = findViewById(R.id.bt6);
        Button b7 = findViewById(R.id.bt7);
        Button b8 = findViewById(R.id.bt8);
        Button b9 = findViewById(R.id.bt9);
        Button b0 = findViewById(R.id.bt0);
        Button bs = findViewById(R.id.bts);
        Button bm = findViewById(R.id.btm);
        Button bd = findViewById(R.id.btd);
        Button ba = findViewById(R.id.bta);
        Button bef = findViewById(R.id.bef);
        Button bft = findViewById(R.id.btf);
        Button beg = findViewById(R.id.beg);
        Button bpt = findViewById(R.id.bpt);
        Button bp = findViewById(R.id.btp);
        b1.setOnClickListener(vue -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "1";
            t1.setText(ecr);
            if (g == '.') {
                k = (k * 10) + 1;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            }else a = a * 10 + 1;

        });
        b2.setOnClickListener(vue -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "2";
            t1.setText(ecr);
            if (g == '.') {
                k = (k * 10) + 2;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 2;
        });
        b3.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "3";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 3;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 3;
        });
        b4.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "4";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 4;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 4;
        });
        b5.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "5";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 5;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 5;
        });
        b6.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "6";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 6;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 6;
        });
        b7.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "7";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 7;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 7;
        });
        b8.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "8";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 8;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 8;
        });
        b9.setOnClickListener(v -> {
            t2.setText("");
            if (s == 1){
                c = ' ';
                r = 1;
                s = 0;
            }
            String ecr = t1.getText().toString() + "9";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10 + 9;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 9;

        });
        b0.setOnClickListener(v -> {
            t2.setText("");
            String ecr = t1.getText().toString() + "0";
            t1.setText(ecr);
            if (g == '.') {
                k = k * 10;
                String n = String.valueOf(k);
                n = String.format("0.%s", n);
                a += parseFloat(n);
                g = ' ';
            } else a = a * 10 + 0;

        });
        bpt.setOnClickListener(v -> {
            if ((k == 0) || (g == ' ')) {
                g = '.';
                if (t1.getText().toString().equals("")) {
                    String ecr = t1.getText().toString() + "0.";
                    t1.setText(ecr);
                } else {
                    String ecr = t1.getText().toString() + ".";
                    t1.setText(ecr);
                }
            }
        });
        bm.setOnClickListener(v -> {


            if (c == ' ') {
                if (a == 0 && b == 0){
                    int n;
                    n = t2.getText().toString().length();
                    if (n > 0){
                        b = Float.parseFloat(t2.getText().toString());
                        t1.setText(t2.getText().toString());
                        t2.setText("");
                        String ecr = t1.getText().toString() + "x";
                        t1.setText(ecr);
                        c = 'x';
                        a = 0;
                    }
                } else {
                    String ecr = t1.getText().toString() + "x";
                    t1.setText(ecr);
                    c = 'x';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            } else {
                if (b != 0 && a!=0) {
                    eg();
                    String ecr = t1.getText().toString() + "x";
                    t1.setText(ecr);
                    c = 'x';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            }

        });
        bd.setOnClickListener(v -> {

            if (c == ' ') {
                if (a == 0 && b == 0){
                    int n;
                    n = t2.getText().toString().length();
                    if (n > 0){
                        b = Float.parseFloat(t2.getText().toString());
                        t1.setText(t2.getText().toString());
                        t2.setText("");
                        String ecr = t1.getText().toString() + "/";
                        t1.setText(ecr);
                        c = '/';
                        a = 0;
                    }
                } else {
                    String ecr = t1.getText().toString() + "/";
                    t1.setText(ecr);
                    c = '/';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            } else {
                if (b != 0 && a!=0) {
                    eg();
                    String ecr = t1.getText().toString() + "/";
                    t1.setText(ecr);
                    c = '/';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            }

        });
        bs.setOnClickListener(v -> {

            if (c == ' ') {
                if (a == 0 && b == 0){
                    int n;
                    n = t2.getText().toString().length();
                    if (n > 0){
                        b = Float.parseFloat(t2.getText().toString());
                        t1.setText(t2.getText().toString());
                        t2.setText("");
                        String ecr = t1.getText().toString() + "-";
                        t1.setText(ecr);
                        c = '-';
                        a = 0;
                    }
                } else {
                    String ecr = t1.getText().toString() + "-";
                    t1.setText(ecr);
                    c = '-';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            } else {
                if (b != 0 && a!=0) {
                    eg();
                    String ecr = t1.getText().toString() + "-";
                    t1.setText(ecr);
                    c = '-';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            }

        });
        ba.setOnClickListener(v -> {

            if (c == ' ') {
                if (a == 0 && b == 0){
                    int n;
                    n = t2.getText().toString().length();
                    if (n > 0){
                        b = Float.parseFloat(t2.getText().toString());
                        t1.setText(t2.getText().toString());
                        t2.setText("");
                        String ecr = t1.getText().toString() + "+";
                        t1.setText(ecr);
                        c = '+';
                        a = 0;
                    }
                } else {
                    String ecr = t1.getText().toString() + "+";
                    t1.setText(ecr);
                    c = '+';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            } else {
                if (b != 0 && a!=0) {
                    eg();
                    String ecr = t1.getText().toString() + "+";
                    t1.setText(ecr);
                    c = '+';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            }

        });
        bp.setOnClickListener(v -> {

            if (c == ' ') {
                if (a == 0 && b == 0){
                    int n;
                    n = t2.getText().toString().length();
                    if (n > 0){
                        b = Float.parseFloat(t2.getText().toString());
                        t1.setText(t2.getText().toString());
                        t2.setText("");
                        String ecr = t1.getText().toString() + "^";
                        t1.setText(ecr);
                        c = '^';
                        a = 0;
                    }
                } else {
                    String ecr = t1.getText().toString() + "^";
                    t1.setText(ecr);
                    c = '^';
                    b = a;
                    a = 0;
                    g = ' ';
                }

            } else {
                if (b != 0 && a!=0) {
                    eg();
                    String ecr = t1.getText().toString() + "^";
                    t1.setText(ecr);
                    c = '^';
                    b = a;
                    a = 0;
                    g = ' ';
                }
            }


        });
        bef.setOnClickListener(v -> {
            int n = t1.getText().toString().length() - 1;
            if (n <= 0){
                t1.setText("");
                t2.setText("");
                b = 0;
                a = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else {
                String ecr = t1.getText().toString();
                StringBuilder z = new StringBuilder();
                if (ecr.charAt(n) == c) {
                    c = ' ';
                    a = b;
                    b = 0;
                } else if (ecr.charAt(n) == g) {
                    g = ' ';
                } else if (ecr.charAt(n) == d) {
                    d = ' ';
                    a = b;
                    b = 0;
                } else {
                    if (c == ' ') {
                        for (int i = 0; i < n; i++) {
                            z.append(ecr.charAt(i));
                        }
                        a = Float.parseFloat(String.valueOf(z));
                    } else {
                        for (int i = 0; i < n; i++) {
                            z.append(ecr.charAt(i));
                        }
                        a = (a - (a % 10)) / 10;
                    }
                    t1.setText(String.valueOf(z));
                }
            }





        });
        bft.setOnClickListener(v -> {
            t1.setText("");
            t2.setText("");
            b = 0;
            a = 0;
            c = ' ';
            g = ' ';
            d = ' ';
            k = 0;
            s = 0;
        });
        beg.setOnClickListener(v -> {
            if ((c == '+') && (d == ' ')) {
                if (r==1){
                    cal = (float)a - (float)b;
                    r=0;
                } else {
                    cal = (float)a + (float)b;
                }

                a = 0;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;

            } else if ((c == '-') && (d == ' ')) {
                if (r==1){
                    cal = (float)(b*-1) - (float)a;
                    r=0;
                } else {
                    cal = b - a;
                }
                a = 0;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else if ((c == 'x') && (d == ' ')) {
                if (r==1){
                    cal = (float)b * (float)(a*-1);
                    r=0;
                } else {
                    cal = a * b;
                }
                a = 0;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else if ((c == '/') && (d == ' ')) {
                if (r == 1){
                    cal = (float)(b*-1)/(float)a;
                    r=0;
                } else {
                    cal = b / a;
                }
                a = 0;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else {
                if (r == 1){
                    cal = (float) pow((float)(b*-1), (float)a);
                    r=0;
                } else {
                    cal = (float) pow(b, a);
                }
                a = 0;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            }
            t2.setText(tsg(cal));
            t1.setText("");
        });
        }
        public void eg(){
            if ((c == '+') && (d == ' ')) {
                if (r==1){
                    cal = (float)a - (float)b;
                    r=0;
                } else {
                    cal = (float)a + (float)b;
                }
                a = cal;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;

            } else if ((c == '-') && (d == ' ')) {
                if (r==1){
                    cal = (float)(b*-1) - (float)a;
                    r=0;
                } else {
                    cal = b - a;
                }
                a = cal;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else if ((c == 'x') && (d == ' ')) {
                if (r==1){
                    cal = (float)b * (float)(a*-1);
                    r=0;
                } else {
                    cal = a * b;
                }
                a = cal;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else if ((c == '/') && (d == ' ')) {
                if (r == 1){
                    cal = (float)(b*-1)/(float)a;
                    r=0;
                } else {
                    cal = b / a;
                }
                a = cal;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            } else {
                if (r == 1){
                    cal = (float) pow((float)(b*-1), (float)a);
                    r=0;
                } else {
                    cal = (float) pow(b, a);
                }
                a = cal;
                b = 0;
                c = ' ';
                g = ' ';
                d = ' ';
                k = 0;
                s = 0;
            }
            t1.setText(tsg(cal));
        }
        public static String tsg(float n){
            if(n == (int)n){
                return String.valueOf((int)n);
            } else {
                return String.valueOf(n);
            }
        }

    }
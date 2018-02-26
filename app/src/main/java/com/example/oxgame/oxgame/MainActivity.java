package com.example.oxgame.oxgame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button restart;
    int[][] table = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    int turn = 1;
    int gameset = 0;

    //1은 1p 2는 2p 0은 공백
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restart = (Button) findViewById(R.id.restart);
        b1 = (Button) findViewById(R.id.num1);
        b2 = (Button) findViewById(R.id.num2);
        b3 = (Button) findViewById(R.id.num3);
        b4 = (Button) findViewById(R.id.num4);
        b5 = (Button) findViewById(R.id.num5);
        b6 = (Button) findViewById(R.id.num6);
        b7 = (Button) findViewById(R.id.num7);
        b8 = (Button) findViewById(R.id.num8);
        b9 = (Button) findViewById(R.id.num9);


        ButtonHandler bh = new ButtonHandler();
        b1.setOnClickListener(bh);
        b2.setOnClickListener(bh);
        b3.setOnClickListener(bh);
        b4.setOnClickListener(bh);
        b5.setOnClickListener(bh);
        b6.setOnClickListener(bh);
        b7.setOnClickListener(bh);
        b8.setOnClickListener(bh);
        b9.setOnClickListener(bh);
        restart.setOnClickListener(bh);
    }

    class ButtonHandler implements View.OnClickListener {


        @Override
        public void onClick(View view) {
            TextView tv_memo = (TextView) findViewById(R.id.alram);
            if (gameset == 0) {
                if (b1 == view) {

                    if (table[0][0] == 0) {
                        table[0][0] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b1.setText("O");
                            b1.setTextColor(Color.RED);

                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b1.setText("X");
                            b1.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b2 == view) {
                    if (table[0][1] == 0) {
                        table[0][1] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b2.setText("O");
                            b2.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b2.setText("X");
                            b2.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b3 == view) {
                    if (table[0][2] == 0) {
                        table[0][2] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b3.setText("O");
                            b3.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b3.setText("X");
                            b3.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b4 == view) {
                    if (table[1][0] == 0) {
                        table[1][0] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b4.setText("O");
                            b4.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b4.setText("X");
                            b4.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b5 == view) {
                    if (table[1][1] == 0) {
                        table[1][1] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b5.setText("O");
                            b5.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b5.setText("X");
                            b5.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b6 == view) {
                    if (table[1][2] == 0) {
                        table[1][2] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b6.setText("O");
                            b6.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b6.setText("X");
                            b6.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b7 == view) {
                    if (table[2][0] == 0) {
                        table[2][0] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b7.setText("O");
                            b7.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b7.setText("X");
                            b7.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b8 == view) {
                    if (table[2][1] == 0) {
                        table[2][1] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b8.setText("O");
                            b8.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b8.setText("X");
                            b8.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                } else if (b9 == view) {
                    if (table[2][2] == 0) {
                        table[2][2] = turn;

                        if (turn == 1) {
                            turn = turn + 1;
                            tv_memo.setText("2P 차례입니다.");
                            b9.setText("O");
                            b9.setTextColor(Color.RED);
                        } else {
                            turn = turn - 1;
                            tv_memo.setText("1P 차례입니다.");
                            b9.setText("X");
                            b9.setTextColor(Color.BLUE);
                        }
                    }

                    if (windlose() == 1) {
                        tv_memo.setText("1P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 2) {
                        tv_memo.setText("2P 승리입니다.");
                        gameset = 1;
                    } else if (windlose() == 5) {
                        tv_memo.setText("무승부입니다.");
                        gameset = 1;
                    }
                }

            }
            if (restart == view) {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        table[i][j] = 0;
                    }
                }
                tv_memo.setText("1P 부터시작입니다.");
                gameset = 0;
                turn = 1;
                b1.setText("1");
                b1.setTextColor(Color.BLACK);
                b2.setText("2");
                b2.setTextColor(Color.BLACK);
                b3.setText("3");
                b3.setTextColor(Color.BLACK);
                b4.setText("4");
                b4.setTextColor(Color.BLACK);
                b5.setText("5");
                b5.setTextColor(Color.BLACK);
                b6.setText("6");
                b6.setTextColor(Color.BLACK);
                b7.setText("7");
                b7.setTextColor(Color.BLACK);
                b8.setText("8");
                b8.setTextColor(Color.BLACK);
                b9.setText("9");
                b9.setTextColor(Color.BLACK);

            }

        }
    }


    public int windlose() {

        if (table[0][0] == table[0][1] && table[0][0] == table[0][2]) {
            return table[0][0];
        }
        if (table[1][0] == table[1][1] && table[1][0] == table[1][2]) {
            return table[1][0];
        }
        if (table[2][0] == table[2][1] && table[2][0] == table[2][2]) {
            return table[2][0];
        }

        if (table[0][0] == table[1][0] && table[0][0] == table[2][0]) {
            return table[0][0];
        }
        if (table[0][1] == table[1][1] && table[0][1] == table[2][1]) {
            return table[0][1];
        }
        if (table[0][2] == table[1][2] && table[0][2] == table[2][2]) {
            return table[0][2];
        }

        if (table[0][0] == table[1][1] && table[0][0] == table[2][2]) {
            return table[0][0];
        }
        if (table[2][0] == table[1][1] && table[2][0] == table[0][2]) {
            return table[2][0];
        }
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return 5;
        }
        return 0;
    }


}

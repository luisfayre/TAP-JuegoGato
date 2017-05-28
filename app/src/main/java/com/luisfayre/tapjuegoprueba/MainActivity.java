package com.luisfayre.tapjuegoprueba;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button reiniciar;
    private TextView textView_x, textView_o;
    private int turn;
    private Boolean c1, c2, c3, c4, c5, c6, c7, c8, c9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);


        textView_x = (TextView) findViewById(R.id.textView_x);
        textView_o = (TextView) findViewById(R.id.textView_o);
        reiniciar = (Button) findViewById(R.id.button);
        reiniciar.setEnabled(false);

        turn = 1;
        c1 = false;
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;
        c7 = false;
        c8 = false;
        c9 = false;

        b1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        b1.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                        textView_o.setText("Turno: O");
                        textView_x.setText("");

                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        b1.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c1 = true;
                FinJuego();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        b2.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        b2.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c2 = true;
                FinJuego();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b3.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        b3.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c3 = true;
                FinJuego();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b4.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        b4.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c4 = true;
                FinJuego();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b5.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        b5.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c5 = true;
                FinJuego();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b6.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        b6.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c6 = true;
                FinJuego();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b7.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        b7.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c7 = true;
                FinJuego();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b8.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        b8.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c8 = true;
                FinJuego();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        textView_o.setText("Turno: O");
                        textView_x.setText("");
                        b9.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorX));
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.colorO));
                        textView_x.setText("Turno: X");
                        textView_o.setText("");
                    }
                }
                c9 = true;
                FinJuego();
            }
        });

    }

    public void FinJuego() {

        String a, b, c, d, e, f, g, h, i;
        boolean fin = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }

        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }

        if (c1 == true)
            if (c2 == true)
                if (c3 == true)
                    if (c4 == true)
                        if (c5 == true)
                            if (c6 == true)
                                if (c7 == true)
                                    if (c8 == true)
                                        if (c9 == true) {
                                            Toast.makeText(MainActivity.this, "Empate", Toast.LENGTH_LONG).show();
                                            fin = true;
                                        }

        if (fin) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            reiniciar.setEnabled(true);

            new AlertDialog.Builder(this)
                    .setTitle("Fin del juego")
                    .setMessage("¿Volver a jugar?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            recreate();
                        }

                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            reiniciar.setEnabled(true);
                        }
                    })
                    .show();
        }
    }

    public void Reiniciar(View view) {
        recreate();
    }
}

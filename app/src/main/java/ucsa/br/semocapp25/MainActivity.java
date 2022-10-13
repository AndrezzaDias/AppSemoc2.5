package ucsa.br.semocapp25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Semoc> itens;
    private SemocAdapter  adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listView);
        itens = new ArrayList<Semoc>();
        itens.add(new Semoc("Apresentação:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Projeto:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Eixo Temáticos:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Programação:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Incrições:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Cronograma:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Contatos:","Semana de Mobilização Científica – SEMOC"));
        itens.add(new Semoc("Certificados:","Semana de Mobilização Científica – SEMOC"));

        adapter = new SemocAdapter(MainActivity.this, itens);
        lista.setAdapter(adapter);





    }
}
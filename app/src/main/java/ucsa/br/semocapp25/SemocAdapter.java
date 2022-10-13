package ucsa.br.semocapp25;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SemocAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Semoc> itens;


    public SemocAdapter (Context context, ArrayList<Semoc> itens){
        this.context = context;
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflater = LayoutInflater.from(context).inflate(R.layout.evento_linha, parent, false);
        TextView textNome = inflater.findViewById(R.id.nome);
        TextView textEvento = inflater.findViewById(R.id.evento);
        textNome.setText(itens.get(position).getNome());
        textEvento.setText(itens.get(position).getEvento());

        return inflater;
    }
}

package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    //Criar a base de dados para os filmes

    String titulo[] = {"2067","A CULPA É DAS ESTRELAS", "LIVRO DE ELI", "VINGADORES ULTIMATO"};
    String descricao[] = {"A Terra está à beira da extinção. Após anos de mudança climática, a vida vegetal desapareceu e o oxigênio tornou-se escasso.","Diagnosticada com câncer, a adolescente Hazel Grace Lancaster (Shailene Woodley) se mantém viva graças a uma droga experimental.", "Em um futuro não muito distante, 30 anos após o término da última guerra. Eli (Denzel Washington) é um homem solitário, que percorre a América do Norte devastada.", "Em Vingadores: Ultimato, após Thanos eliminar metade das criaturas vivas em Vingadores: Guerra Infinita, os heróis precisam lidar com a dor da perda de amigos e seus entes queridos."};
    String acesso[] = {};
    int filmes[] = {R.drawable.filmeUm, R.drawable.aCulpaEdasEstrelas, R.drawable.filmeTres, R.drawable.filmeQuatro};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistaFilmes);

        ,MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(Adaptador);
    }
    //Criando uma InnerClass MyAdapter

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //Adaptador ligando ao modelo

            View v = getLayoutInflater().inflate();

            imagemFilme = v.findViewById(R.id.imgFilmes);
            tituloFilme = v.findViewById(R.id.idTituloFilmes);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilmes);
            acessoFilme = v.findViewById(R.id.idAcessoFilmes);

            tituloFilme.setText(titulo[position]);
            descricaoFilme.setText(titulo[position]);
            imagemFilme.setImageResource(titulo[position]);
            acessoFilme.setText(titulo[position]);

            return v;
        }
    }
}
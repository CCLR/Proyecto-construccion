package co.edu.konradlorenz.becas_u;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class infoEntidad extends AppCompatActivity {
    TabHost th;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_entidad);
        //Copiar estas lineas
        Intent intent = getIntent();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle("Info de la entidad.");
        //ssssssss


        //TABSPec
        th = (TabHost) findViewById(R.id.thEntidad);//Nombre del TanHost
        //Tab1
        th.setup();
        TabSpec ts1 = th.newTabSpec("Tab1");//Identificador
        ts1.setIndicator("Becas");//Titulo de la tab
        ts1.setContent(R.id.TabBecas);//Id del Layout Tab
        th.addTab(ts1);//Se agrega la Tab

        //Tab2
        th.setup();
        TabSpec ts2 = th.newTabSpec("Tab2");//Identificador
        ts2.setIndicator("Opiniones");//Titulo de la tab
        ts2.setContent(R.id.TabOpiniones);//Id del Layout Tab
        th.addTab(ts2);//Se agrega la Tab

        //Tab3
        th.setup();
        TabSpec ts3 = th.newTabSpec("Tab3");//Identificador
        ts3.setIndicator("Más Datos");//Titulo de la tab
        ts3.setContent(R.id.TabMas_Datos);//Id del Layout Tab
        th.addTab(ts3);//Se agrega la Tab

        //Lista de Becas
        ListView listaE;
        listaE = (ListView)findViewById(R.id.lista_E_becas);
        ArrayList<String> arrE = new ArrayList<String>();
        arrE.add("Becas OEA para jóvenes emprendedores- Emprendimiento Empresarial Boot Camp");
        arrE.add("Becas Icetex para estudiar producción y sanidad animal en Egipto");
        arrE.add("Becas Icetex para realizar programa de Pisicultura en Egipto");
        arrE.add("Becas para realizar programa de Manejo de Suelos y Aguas en El Cairo");
        arrE.add("Summer Fellowships at the institute of chemical research of Catalonia");
        arrE.add("Becas LAIOB para estudiar Marketing, Management, Corporate Finance y Project Management");
        arrE.add("Emory University offers scolarships for international students");
        arrE.add("Clinical Pharmacology Prize");
        arrE.add("Becas OEA para jóvenes emprendedores- Emprendimiento Empresarial Boot Camp");
        arrE.add("Becas Icetex para estudiar producción y sanidad animal en Egipto");
        arrE.add("Becas Icetex para realizar programa de Pisicultura en Egipto");
        arrE.add("Becas para realizar programa de Manejo de Suelos y Aguas en El Cairo");
        arrE.add("Summer Fellowships at the institute of chemical research of Catalonia");
        arrE.add("Becas LAIOB para estudiar Marketing, Management, Corporate Finance y Project Management");
        arrE.add("Emory University offers scolarships for international students");
        arrE.add("Clinical Pharmacology Prize");
        ArrayAdapter<String> adaptadorE;
        adaptadorE = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrE);
        listaE.setAdapter(adaptadorE);
        //Fin Lista de Becas

        //Lista de Becas
        ListView listaO;
        listaO = (ListView)findViewById(R.id.lista_E_Opiniones);
        ArrayList<String> arrO = new ArrayList<String>();
        arrO.add("Entidad muy comprometida, la recomiendo mucho!");
        arrO.add("Muy fácil aplicar y toda la información completa");
        arrO.add("Falta atención para el usuario");
        arrO.add("Pagina web muy organizada, se busca fácil la beca ofertada");
        arrO.add("Tienen muchas ofertas");
        arrO.add("Me gusta, 5 estrellas!");
        arrO.add("Deben mejorar los datos que piden ya que cuando llevé mis documentos hicieron falta más de los solicitados");
        arrO.add("Conocí París gracias a las becas que ofrecen!");
        arrO.add("Entidad muy comprometida, la recomiendo mucho!");
        arrO.add("Muy fácil aplicar y toda la información completa");
        arrO.add("Falta atención para el usuario");
        arrO.add("Pagina web muy organizada, se busca fácil la beca ofertada");
        arrO.add("Tienen muchas ofertas");
        arrO.add("Me gusta, 5 estrellas!");
        arrO.add("Deben mejorar los datos que piden ya que cuando llevé mis documentos hicieron falta más de los solicitados");
        arrO.add("Conocí París gracias a las becas que ofrecen!");
        ArrayAdapter<String> adaptadorO;
        adaptadorO = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrO);
        listaO.setAdapter(adaptadorO);
        //Fin Lista de Becas










    }
}

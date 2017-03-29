package co.edu.konradlorenz.becas_u;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class HomePro extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("¡Bienvenido a Becas U!");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //TABSPec
        TabHost tb;
        tb = (TabHost) findViewById(R.id.thHome);//Nombre del TanHost
        //Tab1
        tb.setup();
        TabHost.TabSpec ts1 = tb.newTabSpec("Tab1");//Identificador
        ts1.setIndicator("Buscar Becas");//Titulo de la tab
        ts1.setContent(R.id.tabBuscarBecas);//Id del Layout Tab
        tb.addTab(ts1);//Se agrega la Tab

        //Tab2
        tb.setup();
        TabHost.TabSpec ts2 = tb.newTabSpec("Tab2");//Identificador
        ts2.setIndicator("Comunidad");//Titulo de la tab
        ts2.setContent(R.id.TabComunidad);//Id del Layout Tab
        tb.addTab(ts2);//Se agrega la Tab



        //Lista de Becas
        ListView listaE;
        listaE = (ListView)findViewById(R.id.Lista_H_BuscarBecas);
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
        listaO = (ListView)findViewById(R.id.Lista_H_Comunidad);
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_iniciar_sesion) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_registro) {
            Intent intent = new Intent(getApplicationContext(), SingUpActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_ayuda) {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

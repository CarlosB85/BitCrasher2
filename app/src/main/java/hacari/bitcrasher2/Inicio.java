package hacari.bitcrasher2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void iniciar(View vv){
        Intent menu = new Intent(Inicio.this, menu.class);
        startActivity(menu);
    }
}

package br.com.heybeauty.cadastro;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import br.com.heybeauty.R;
import br.com.heybeauty.cadastro.adapters.CadastroFragmentPageAdapter;

public class Cadastro extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        tabLayout = findViewById(R.id.tblCadastro);
        viewPager = findViewById(R.id.vpg_cadastro);

        viewPager.setAdapter(new CadastroFragmentPageAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titles_tab)));
        tabLayout.setupWithViewPager(viewPager);
    }
}

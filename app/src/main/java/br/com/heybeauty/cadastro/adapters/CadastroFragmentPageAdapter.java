package br.com.heybeauty.cadastro.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import br.com.heybeauty.cadastro.fragments.FragmentProfissional;
import br.com.heybeauty.cadastro.fragments.FragmentUsuario;

// Classe que faz o controle do adaptador do view pager (que cria e destrói aos fragments)
// Esta é uma classe filha da FragmentStatePagerAdapter que carrega e guarda na memória os dados dos fragments
// A outra classe possível é a FragmentPagerAdapter que não armazena os fragments na memória
public class CadastroFragmentPageAdapter extends  FragmentStatePagerAdapter {
    // Vetor que armazena os títulos dos fragments
    private String[] mTabTitles;

    // Construtor da classe
    //  Passa os títulos para o atributo
    public CadastroFragmentPageAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    // método chamada para carregar o Fragment
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentUsuario();
            case 1:
                return new FragmentProfissional();
            default:
                return null;
        }
    }

    // Carrega o título do Fragmente
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }
}

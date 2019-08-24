package entidadesAula;

public class ProfessorCasa {
    private boolean portas[];
    private String cor, cores[] = {"branca", "azul", "rosa"};
    private int qtdePortas;
     
    public ProfessorCasa () {
        setCasaVetor ( 3 );
    }
     
    public ProfessorCasa ( int qtdePortas ) {
        setCasaVetor ( qtdePortas );
    }
     
    private void setCasaVetor ( int qtdePortas ) {
        setQtdePortas ( qtdePortas );
        portas = new boolean[ getQtdePortas() ];
        for ( int i = 0 ; i < getQtdePortas() ; i++ ) {
            portas[i] = false;
        }
        setCor ( cores[0] );        
    }
     
    private void setQtdePortas ( int qtdePortas ) {
        if ( qtdePortas > 0 ) {
            this.qtdePortas = qtdePortas;
        } else {
            this.qtdePortas = 3;
        }
    }
     
    public boolean setPorta ( int porta, boolean estado ) {
        if ( --porta >= 0 && porta < qtdePortas ) {
            if ( this.portas[porta] != estado ) {
                this.portas[porta] = estado;
                return true;
            }
        }
        return false;
    }
     
    public boolean setCor ( int index ) {
        if (--index >= 0 && index < cores.length ) {
            return setCor ( cores [ index ] );
        }
        return false;
    }
     
    public boolean setCor ( String cor ) {
        boolean ok = false;
        int i = 0;
        while ( !ok && ( i < cores.length ) ) {
            ok = cor.equalsIgnoreCase ( cores[i++] );
        }
        if ( ok ) {
            this.cor = cor;
            return true;
        }
        return false;
    }
     
    public String[] getCores () {
        return cores;
    }
 
    public int getQtdePortas () {
        return qtdePortas;
    }
     
    public boolean isPorta ( int porta ) {
        if ( --porta >= 0 && porta < qtdePortas ) {
            return portas[ porta ];
        }
        return false;
    }
     
    public String getCor () {
        return cor;
    }
     
    public boolean abrirPorta ( int porta ) {
        return setPorta ( porta, true );
    }
     
    public boolean fecharPorta ( int porta ) {
        return setPorta ( porta, false );
    }
     
    public boolean pintar ( int index ) {
        if (--index >= 0 && index < cores.length ) {
            return pintar ( cores [ index ] );
        }
        return false;
    }
     
    public boolean pintar ( String cor ) {
        if ( !this.cor.equalsIgnoreCase ( cor ) ) {
            return setCor ( cor );
        }
        return false;
    }
     
    public int quantasPortasEstaoAbertas () {
        int cont = 0;
        for ( int i = 0 ; i < qtdePortas ; i++) {
            cont += ( portas[i] ? 1 : 0 );
        }
        return cont;
    }
}

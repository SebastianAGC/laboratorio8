import java.util.ArrayList;

public class ParserOperations {

    private ArrayList<String> terminals = new ArrayList<>();
    private ArrayList<String> nonterminals = new ArrayList<>();

    public ArrayList<String> getTerminals() {
        return terminals;
    }

    public void setTerminals(ArrayList<Productions> productions) {
        ArrayList<String> t = new ArrayList<>();
        for (Productions p: productions) {
            String cabeza = p.getHead();
            String cuerpo = p.getBody();
            for(int i=0; i<cuerpo.length();i++){
                String caracter = String.valueOf(cuerpo.charAt(i));
                for (Productions pr:productions) {
                    int size = pr.getHead().length();
                    if(size<1){
                        String subcadena = cuerpo.substring(i, i+size);
                        if(subcadena.equals(pr.getHead())){
                            if(!this.terminals.contains(subcadena)){
                                this.terminals.add(subcadena);
                            }
                        }
                    }else{

                    }
                }
            }
        }



        this.terminals = terminals;
    }

    public ArrayList<String> getNonterminals() {
        return nonterminals;
    }

    public void setNonterminals(ArrayList<String> nonterminals) {
        this.nonterminals = nonterminals;
    }
}

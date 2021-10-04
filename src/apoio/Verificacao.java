
package apoio;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class Verificacao extends PlainDocument {
        
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
    }
    
    public static boolean verificaCPF(String cpf) {
        
        cpf = cpf.replaceAll("[-.]","");

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            
            for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                    System.out.println("ERRO:" + erro);
                return(false);
            }
        }
        
    public static boolean verificaCNPJ(String cnpj) {
        
        cnpj = cnpj.replaceAll("[./-]","");
        
        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
        // Calculo do 1o. Digito Verificador
        sm = 0;
        peso = 2;
        
        for (i=11; i>=0; i--) {
            // converte o i-ésimo caractere do CNPJ em um número:
            // por exemplo, transforma o caractere '0' no inteiro 0
            // (48 eh a posição de '0' na tabela ASCII)
            num = (int)(cnpj.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            
            if (peso == 10)
                peso = 2;
        }

        r = sm % 11;
      
        if ((r == 0) || (r == 1))
            dig13 = '0';
        else dig13 = (char)((11-r) + 48);

        // Calculo do 2o. Digito Verificador
        sm = 0;
        peso = 2;
        
        for (i=12; i>=0; i--) {
            num = (int)(cnpj.charAt(i)- 48);
            sm = sm + (num * peso);
            peso = peso + 1;
        
            if (peso == 10)
                peso = 2;
        }
        r = sm % 11;
      
        if ((r == 0) || (r == 1))
            dig14 = '0';
        else dig14 = (char)((11-r) + 48);

        // Verifica se os dígitos calculados conferem com os dígitos informados.
        if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
            return(true);
        else return(false);
    
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public static boolean verificaCidade(String cidade) {
        boolean ok = false;
        
        if (!cidade.equals("") && !cidade.matches(".*\\d.*")) {
            ok = true;
        }
        return ok;        
    }  
    
    public static boolean verificaEmail(String email) {
        boolean ok = false;
    
        if (email.contains("@") && email.contains(".") && !email.equals("")){
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaNome(String nome) {
        boolean ok = false;
        
        if (!nome.matches(".*\\d.*") && !nome.equals("")) {
            ok = true;
        }
        return ok;
    }
        
    public static boolean verificaRua(String rua) {
        boolean ok = false;
        
        if (!rua.equals("")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaCapacidade (int capacidade) {
        boolean ok = false;
        
        if (capacidade > 0 && capacidade < 500) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaNomeAviao(String nomeAviao) {
        boolean ok = false;
        
        if (!nomeAviao.equals("")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaSenha(String senha) {
        boolean ok = false;
        
        if (!senha.equals("")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaDataSaida(String data) throws ParseException {
        if (!validaData(data)) {
            return false;
        }
        
        boolean ok = false;
        String hoje = getDataAtual();

        Date dataAtual = new SimpleDateFormat("dd/MM/yyyy").parse(hoje);
        Date dataRecebida = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        
        int comparacao = dataAtual.compareTo(dataRecebida);
        
        if (comparacao <= 0) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaDataChegada(String dataSaida, String dataChegada) throws ParseException {
        if (!validaData(dataSaida) || !validaData(dataChegada)) {
            return false;
        }
        
        boolean ok = false;

        Date saida = new SimpleDateFormat("dd/MM/yyyy").parse(dataSaida);
        Date chegada = new SimpleDateFormat("dd/MM/yyyy").parse(dataChegada);
        
        int comparacao = saida.compareTo(chegada);
        
        if (comparacao == 0) {
            ok = true;
        }
        return ok;
    }     
        
    public static boolean verificaHorarioSaida(String horario) {
        boolean ok = false;
        
        if (validaHorario(horario)) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaHorarioChegada(String horarioChegada, String horarioSaida) throws ParseException {
       
        if (!validaHorario(horarioChegada) || !validaHorario(horarioSaida)) {
            return false;
        }
        boolean ok = false;
        
        horarioSaida = horarioSaida.replaceAll("[:]", "");
        horarioChegada = horarioChegada.replaceAll("[:]", "");
        
        int saida = Integer.parseInt(horarioSaida);
        int chegada = Integer.parseInt(horarioChegada);
        
        if (saida < chegada) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaTelefone(String telefone) {
        boolean ok = false;
        
        telefone = telefone.replaceAll("[()-]","");
        
        if (!telefone.equals("")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaCodigo(int codigo) {
        
        boolean ok = false;
        
        if (codigo > 0) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaSituacao (String situacao) {
        boolean ok = false;
        
        if (!situacao.equals("Selecione")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaValor (String valorPassagem) {
        
        boolean ok = false;
        
        if (!valorPassagem.equals("")) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaPortao (String portao) {
        boolean ok = false;
        
        if (!portao.equals("Selecione")) {
            ok = true;
        }
        return ok;
    }
    
    public static String getDataAtual() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(now);

        return dataHoje;
    }
    
    public static boolean validaData(String data) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            sdf.setLenient(false);

            sdf.parse(data);

            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
    public static boolean validaHorario(String horario) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            sdf.setLenient(false);

            sdf.parse(horario);

            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
    public static boolean verificaCartao(String numero) {
        numero = numero.replaceAll("-", "");
        
        long number = new Long(numero);
        
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number)>=13 ) && (getSize(number)<=16 )) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDigit(int number) {

        if (number <= 9) {
            return number;
        } else {
            int firstDigit = number % 10;
            int secondDigit = (int) (number / 10);

            return firstDigit + secondDigit;
        }
    }
    
    public static int sumOfOddPlace(long number) {
        int result = 0;

        while (number > 0) {
            result += (int) (number % 10);
            number = number / 100;
        }

        return result;
    }
    
    public static int sumOfDoubleEvenPlace(long number) {

        int result = 0;
        long temp = 0;

        while (number > 0) {
            temp = number % 100;
            result += getDigit((int) (temp / 10) * 2);
            number = number / 100;
        }
        return result;
    }

    public static boolean prefixMatched(long number, int d) {

        if ((getPrefix(number, d) == 4)
                || (getPrefix(number, d) == 5)
                || (getPrefix(number, d) == 3)) {

            if (getPrefix(number, d) == 3) {
                System.out.println("\nVisa Card");
            } else if (getPrefix(number, d) == 5) {
                System.out.println("\nMaster Card");
            } else if (getPrefix(number, d) == 3) {
                System.out.println("\nAmerican Express Card");
            }
            return true;
        }else{
            return false;
        }
    }

    public static int getSize(long d) {
        int count = 0;

        while (d > 0) {
            d = d / 10;
            count++;
        }
        return count;
    }

    public static long getPrefix(long number, int k) {

        if (getSize(number) < k) {
            return number;
        }else{
            
            int size = (int) getSize(number);

            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }
            return number;
        }
    }
    
    public static boolean verificaDataCartao (String data) throws ParseException {
        if (!validaData(data)) {
            return false;
        }
        
        boolean ok = false;
        String hoje = getDataAtual();

        Date dataAtual = new SimpleDateFormat("dd/MM/yyyy").parse(hoje);
        Date dataRecebida = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        
        int comparacao = dataAtual.compareTo(dataRecebida);
        
        if (comparacao <= 0) {
            ok = true;
        }
        return ok;
    }
    
    public static boolean verificaCodigoCartao (String codigo) {
        boolean ok = false;
        
        if (!codigo.equals("   ")) {
            ok = true;
        }
        return ok;
    }
    
    private static MessageDigest md;

   public static String criptografaSenha(String senha) {
        byte[] messageDigest = null;
        String senhaHex = null;       
       
        try {
       
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
       
        StringBuilder sb = new StringBuilder();
        
        for (byte b : messageDigest) {
            sb.append(String.format("%02X", 0xFF &b));
        }
        senhaHex = sb.toString();
       
        }catch (Exception e) {
           System.out.println("Erro ao Criptografar Senha: " + e );
        }
        return senhaHex;
   }
}




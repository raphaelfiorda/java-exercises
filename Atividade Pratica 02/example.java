import javax.swing.*;

class AtividadePratica02
{
    public static void main(String args[]) {
      // Declaração de variáveis

        int n1, n2, quociente;
        double potencia;
        String msg="";

      // Entrada de dados

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));

      // Processamento

        quociente = n1 / n2;
        potencia = Math.pow(n1, n2);

      // Saída de resultado

        msg = msg + "Resultado da divisão: " + quociente + "\n";
        msg = msg + "Resultado da potência: " + potencia + "\n";

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
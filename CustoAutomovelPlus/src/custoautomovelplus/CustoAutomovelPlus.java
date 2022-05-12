package custoautomovelplus;

import javax.swing.JOptionPane;

public class CustoAutomovelPlus {

    public static void main(String[] args) {

        String combustíveis[] = {"Gasolina", "Álcool", "Diesel", "GNV", "Flex"};

        String operações[] = {"Listar informações", "Sair"};

        InfoAuto objValores = null;

        AutoPlus auto = null;

        String opçãoUser = "";

        String marca = JOptionPane.showInputDialog(null, "Informe a marca do seu carro:", "Automóvel", 3);

        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo:", "Automóvel", 3);

        String cor = JOptionPane.showInputDialog(null, "Informe a cor:", "Automóvel", 3);

        String combustível = (String) JOptionPane.showInputDialog(null, "Escolha o combustível:", "Automóvel", 3, null, combustíveis, combustíveis[0]);

        float custo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o custo de seu carro (sem 'R$' e decimais depois de ponto):", "Automóvel", 3));

        if (JOptionPane.showConfirmDialog(null, "Possui opcionais?", "Automóvel", JOptionPane.YES_NO_OPTION, 3) == 0) {
            boolean gps = false;
            boolean bluetooth = false;
            boolean sensor = false;
            boolean cadeirinha = false;

            if (JOptionPane.showConfirmDialog(null, "Possui gps?", "Automóvel", JOptionPane.YES_NO_OPTION, 3) == 0) {
                gps = true;
            }
            if (JOptionPane.showConfirmDialog(null, "Possui bluetooth?", "Automóvel", JOptionPane.YES_NO_OPTION, 3) == 0) {
                bluetooth = true;
            }
            if (JOptionPane.showConfirmDialog(null, "Possui sensor de estacionamento?", "Automóvel", JOptionPane.YES_NO_OPTION, 3) == 0) {
                sensor = true;
            }
            if (JOptionPane.showConfirmDialog(null, "Possui cadeirinha de bebê?", "Salario", JOptionPane.YES_NO_OPTION, 3) == 0) {
                cadeirinha = true;
            }

            int novo = JOptionPane.showConfirmDialog(null, "Seu automóvel é 0KM?", "Automóvel", JOptionPane.YES_NO_OPTION, 3);

            if (novo == 0) {
                auto = new AutoPlus(gps, bluetooth, sensor, cadeirinha, marca, modelo, cor, combustível, custo);
            } else {
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano:", "Automóvel", 3));
                auto = new AutoPlus(gps, bluetooth, sensor, cadeirinha, marca, modelo, cor, combustível, custo, ano);
            }

        } else {
            int novo = JOptionPane.showConfirmDialog(null, "Seu automóvel é 0KM?", "Automóvel", JOptionPane.YES_NO_OPTION, 3);
            if (novo == 0) {
                objValores = new InfoAuto(marca, modelo, cor, combustível, custo);
            } else {
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano:", "Automóvel", 3));
                objValores = new InfoAuto(marca, modelo, cor, combustível, custo, ano);
            }
        }
        JOptionPane.showMessageDialog(null, "Auomóvel cadastrado com sucesso.", "Automóvel", 1);

        while (!opçãoUser.equals(operações[1])) {
            opçãoUser = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Automóvel", 3, null, operações, operações[0]);
            switch (opçãoUser) {
                case "Listar informações":

                    if (auto != null) {
                        JOptionPane.showMessageDialog(null, "As informações do seu automóvel são:\n" + auto, "Automóvel", 1);

                    } else if (objValores != null) {
                        JOptionPane.showMessageDialog(null, "As informações do seu automóvel são:\n" + objValores, "Automóvel", 1);
                    }

                    break;

            }
        }

        System.exit(0);

    }

}

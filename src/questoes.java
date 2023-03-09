// import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class questoes extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questoes frame = new questoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public questoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton questao1 = new JButton("Questao 1");
		questao1.setForeground(new Color(255, 255, 255));
		questao1.setBackground(new Color(128, 0, 255));
		questao1.setBounds(211, 0, 115, 35);
		contentPane.add(questao1);
		
		JButton questao2 = new JButton("Questao 2");
		questao2.setForeground(new Color(255, 255, 255));
		questao2.setBackground(new Color(128, 0, 255));
		questao2.setBounds(211, 46, 115, 35);
		contentPane.add(questao2);
		
		JButton questao3 = new JButton("Questao 3");
		questao3.setForeground(new Color(255, 255, 255));
		questao3.setBackground(new Color(128, 0, 255));
		questao3.setBounds(211, 92, 115, 35);
		contentPane.add(questao3);
		
		JButton questao4 = new JButton("Questao 4");
		questao4.setForeground(new Color(255, 255, 255));
		questao4.setBackground(new Color(128, 0, 255));
		questao4.setBounds(211, 138, 115, 35);
		contentPane.add(questao4);
		
		JButton questao5 = new JButton("Questao 5");
		questao5.setForeground(new Color(255, 255, 255));
		questao5.setBackground(new Color(128, 0, 255));
		questao5.setBounds(211, 184, 115, 35);
		contentPane.add(questao5);
		
		JButton questao6 = new JButton("Questao 6");
		questao6.setForeground(new Color(255, 255, 255));
		questao6.setBackground(new Color(128, 0, 255));
		questao6.setBounds(211, 230, 115, 35);
		contentPane.add(questao6);
		
		JButton sair = new JButton("Sair");
		sair.setForeground(new Color(255, 255, 255));
		sair.setBackground(new Color(128, 0, 255));
		sair.setBounds(211, 276, 115, 35);
		contentPane.add(sair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src/imagem/espacoBackground.png"));
		lblNewLabel.setBounds(0, 0, 518, 324);
		contentPane.add(lblNewLabel);
		
		questao1.addActionListener(this::MenuEncaminhaQuestao1);
		questao2.addActionListener(this::MenuEncaminhaQuestao2);
		questao3.addActionListener(this::MenuEncaminhaQuestao3);
		questao4.addActionListener(this::MenuEncaminhaQuestao4);
		questao5.addActionListener(this::MenuEncaminhaQuestao5);
		questao6.addActionListener(this::MenuEncaminhaQuestao6);
		sair.addActionListener(this::MenuEncaminhaSair);
		}

	public void MenuEncaminhaQuestao1(ActionEvent actionEvent) {

		  final int NUM_PESSOAS = 10;
	        double maiorAltura = 0.0, menorAltura = Double.MAX_VALUE, mediaHomens = 0.0, altura;
	        int numMulheres = 0;
	        
	        for (int i = 1; i <= NUM_PESSOAS; i++) {
	            do {
	                String alturaStr = JOptionPane.showInputDialog("Digite a altura da pessoa " + i + " em metros:");
	                altura = Double.parseDouble(alturaStr);
	                if (altura < 0) {
	                    JOptionPane.showMessageDialog(null, "Insira um valor válido para altura!");
	                }
	            } while (altura < 0);

	            String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa " + i + " (M/F):");
	            sexo = sexo.toUpperCase();
	            
	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	            }
	            
	            if (altura < menorAltura) {
	                menorAltura = altura;
	            }
	            
	            if (sexo.equals("M")) {
	                mediaHomens += altura;
	            } else if (sexo.equals("F")) {
	                numMulheres++;
	            } else {
	                JOptionPane.showMessageDialog(null, "Sexo inválido para a pessoa " + i);
	                i--; // -> volta como se não tivesse feito o cadastro, por isso diminuimos 1
	            }
	        }
	        
	        mediaHomens /= NUM_PESSOAS - numMulheres;
	        
	        JOptionPane.showMessageDialog(null, "Maior altura: " + maiorAltura
	                + "\nMenor altura: " + menorAltura
	                + "\nMédia de altura dos homens: " + mediaHomens
	                + "\nNúmero de mulheres: " + numMulheres);

	}

	public void MenuEncaminhaQuestao2(ActionEvent actionEvent) {

		 Double numFuncionarios, salario, somaSalarios = 0.0;
	        do {
	            String numFuncionariosStr = JOptionPane.showInputDialog("Digite a quantidade de funcionários da empresa: ");
	            numFuncionarios = Double.parseDouble(numFuncionariosStr);
	            if (numFuncionariosStr.isEmpty() ||  Double.parseDouble(numFuncionariosStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "Insira um valor válido!");
	            }
	        } while (numFuncionarios < 0);

	        

	        for(int i = 1; i <= numFuncionarios; i++) {
	            do {
	                String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário " + i + ": ");
	                salario = Double.parseDouble(salarioStr);
	                if (salarioStr.isEmpty() ||  Double.parseDouble(salarioStr) <= 0) {
	                    JOptionPane.showMessageDialog(null, "Insira um valor válido!");
	                }
	            } while (salario < 0);
	            
	            somaSalarios += salario;

	        }
	        
	        double mediaSalarial = somaSalarios / numFuncionarios;
	        JOptionPane.showMessageDialog(null,"A média salarial da empresa é: " + mediaSalarial);		
		
	}
	
	public void MenuEncaminhaQuestao3(ActionEvent actionEvent) {
		
		 double hp, lp, ha, la;

	        do {
	            String hpStr = JOptionPane.showInputDialog("Digite a altura da parede: ");
	            if (hpStr.isEmpty() || Double.parseDouble(hpStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura da parede deve ser positiva e não nula. Tente novamente.");
	            } else {
	                hp = Double.parseDouble(hpStr);
	                break;
	            }
	        } while (true);

	        do {
	            String lpStr = JOptionPane.showInputDialog("Digite a largura da parede: ");
	            if (lpStr.isEmpty() || Double.parseDouble(lpStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A largura da parede deve ser positiva e não nula. Tente novamente.");
	            } else {
	                lp = Double.parseDouble(lpStr);
	                break;
	            }
	        } while (true);

	        do {
	            String haStr = JOptionPane.showInputDialog("Digite a altura do azulejo: ");
	            if (haStr.isEmpty() || Double.parseDouble(haStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura do azulejo deve ser positiva e não nula. Tente novamente.");
	            } else {
	                ha = Double.parseDouble(haStr);
	                break;
	            }
	        } while (true);

	        do {
	            String laStr = JOptionPane.showInputDialog("Digite a largura do azulejo: ");
	            if (laStr.isEmpty() || Double.parseDouble(laStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A largura do azulejo deve ser positiva e não nula. Tente novamente.");
	            } else {
	                la = Double.parseDouble(laStr);
	                break;
	            }
	        } while (true);

	        double areaParede = hp * lp;
	        double areaAzulejo = ha * la;
	        int numAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

	        JOptionPane.showMessageDialog(null, "Serão necessários " + numAzulejos + " azulejos.");
		
	}
	
	public void MenuEncaminhaQuestao4(ActionEvent actionEvent) {
		
		  double raio, altura, volume;
	        double PI = 3.14159;

	        // lendo o valor do raio
	        do {
	            String raioStr = JOptionPane.showInputDialog("Digite o valor do raio:");
	            if (raioStr.isEmpty() || Double.parseDouble(raioStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "O raio deve ser um número positivo e não nulo. Tente novamente.");
	            } else {
	                raio = Double.parseDouble(raioStr);
	                break;
	            }
	        } while (true);

	        // lendo o valor da altura
	        do {
	            String alturaStr = JOptionPane.showInputDialog("Digite o valor da altura:");
	            if (alturaStr.isEmpty() || Double.parseDouble(alturaStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura deve ser um número positivo e não nulo. Tente novamente.");
	            } else {
	                altura = Double.parseDouble(alturaStr);
	                break;
	            }
	        } while (true);

	        // calculando o volume
	        volume = PI * raio * raio * altura;

	        // exibindo o resultado
	        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
		
	}
	
	public void MenuEncaminhaQuestao5(ActionEvent actionEvent) {
		
double massa, altura, tempo, cavalos;
        
        do {
            String massaStr = JOptionPane.showInputDialog("Digite a massa em kg:");
            if (massaStr.isEmpty() || Double.parseDouble(massaStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                massa = Double.parseDouble(massaStr);
                break;
            }
        } while(true);

        do {
            String alturaStr = JOptionPane.showInputDialog("Digite a altura em metros:");
            if (alturaStr.isEmpty() || Double.parseDouble(alturaStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                altura = Double.parseDouble(alturaStr);
                break;
            }
        } while(true);

        do {
            String tempoStr = JOptionPane.showInputDialog("Digite o tempo em segundos:");
            if (tempoStr.isEmpty() || Double.parseDouble(tempoStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                tempo = Double.parseDouble(tempoStr);
                break;
            }
        } while(true);
        
        cavalos = (massa * altura / tempo) / 745.7;
        
        JOptionPane.showMessageDialog(null, "A quantidade de cavalos necessários é: " + cavalos);
		
	}
	
	public void MenuEncaminhaQuestao6(ActionEvent actionEvent) {
		
		 double celsius, kelvin, reaumur, rankine, fahrenheit;

	        do {
	            String celsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
	            if (celsiusStr.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
	            } else {
	                try {
	                    celsius = Double.parseDouble(celsiusStr);
	                    break;
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
	                }
	            }
	        } while(true);

	        fahrenheit = celsius * 1.8 + 32;
	        kelvin = celsius + 273.15;
	        reaumur = celsius * 0.8;
	        rankine = celsius * 1.8 + 32 + 459.67;

	        JOptionPane.showMessageDialog(null, 
	          "Fahrenheit: " + Math.round(fahrenheit) + "°F\n" 
	        + "Kelvin: "     + Math.round(kelvin) + " K\n"
	        + "Réaumur: "    + Math.round(reaumur) + "°Re\n"
	        + "Rankine: "    + Math.round(rankine) + "°Ra");
		
	}
	
	public void MenuEncaminhaSair(ActionEvent actionEvent) {
		System.exit(0);
	}
	
}

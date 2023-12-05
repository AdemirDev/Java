package programas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import classes.Conexao;

public class Cadastro extends JFrame {

    private JTextField txtNome, txtEmail, txtTelefone, txtCpf;

    public Cadastro(Conexao conexao) {
        super("Cadastro de Cliente");

        // Criando os componentes
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblEmail = new JLabel("E-mail:");
        JLabel lblTelefone = new JLabel("Telefone:");
        JLabel lblCpf = new JLabel("CPF:");

        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);
        txtTelefone = new JTextField(20);
        txtCpf = new JTextField(20);

        JButton btnCadastrar = new JButton("Cadastrar");

        // Adicionando os componentes ao painel
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espaçamento externo
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(lblTelefone);
        panel.add(txtTelefone);
        panel.add(lblCpf);
        panel.add(txtCpf);
        panel.add(new JLabel()); // Espaço vazio
        panel.add(btnCadastrar);

        // Adicionando o listener para o botão cadastrar
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar(conexao);
            }
        });

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrar(Conexao conexao) {
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText();

        try {
            boolean sucesso = conexao.inserirAmigo(nome, email, telefone, cpf);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");

                // Após o cadastro bem-sucedido, abrir a tela da AgendaContatos
                SwingUtilities.invokeLater(() -> new AgendaContatos(conexao));
                
                // Fechar a janela de cadastro
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao cadastrar. Verifique os dados e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/cadastro";
        String usuario = "root";
        String senha = "senai";

        try {
            Conexao conexao = new Conexao(url, usuario, senha);
            new Cadastro(conexao);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}

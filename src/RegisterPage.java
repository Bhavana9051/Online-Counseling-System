/*class User {
    String applicationNo;
    String password;
    User(String applicationNo,String password){
        this.password = password;
        this.applicationNo = applicationNo;
    }
}

public class RegisterPage extends JFrame {

    ArrayList<User> users = new ArrayList<User>(10);
    private JPanel RegisterPanel;
    private JLabel applicationNo;
    private JTextField applicationNoText;

    private JLabel setpasswordLabel;
    private JPasswordField setPasswordText;
    private JLabel confirmPasswordLabel;
    private JPasswordField confirmPasswordText;
    private JButton submitButton;
    private JButton clearButton;
    private JTextField errorMessageText;

    public RegisterPage(String title){
        super(title);

        this.setLayout(new GridLayout(4,3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RegisterPanel);
        this.pack();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {

                users.add(new User(applicationNoText.getText(), setPasswordText.getText()));
                if ((setPasswordText.getText() == confirmPasswordText.getText())) {
                    System.out.println("Added " + applicationNoText.getText() + " " + setPasswordText.getText());
                } else {
                    JOptionPane.showMessageDialog(errorMessageText, "Password did not match !!!");
                }
            }
            });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPasswordText.setText("");
                applicationNoText.setText("");
                confirmPasswordText.setText("");
            }
        });
    }


    public static void main(String[] args) {
        JFrame f = new RegisterPage("Registration");
        f.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
*/
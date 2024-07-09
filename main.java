import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        int borderwidth =600;
        int borderheight = 600;
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(borderwidth,borderheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Snakegame SnakeGame = new Snakegame(borderheight, borderwidth);
        frame.add(SnakeGame);
        frame.pack();//for complete dimension of pannel
      SnakeGame.requestFocus();
    }
}

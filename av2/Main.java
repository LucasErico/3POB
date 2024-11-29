import controller.FuncionarioController;
import view.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        FuncionarioController controller = new FuncionarioController();
        
        MenuPrincipal menu = new MenuPrincipal(controller);
        
        menu.exibirMenu();
    }
}

package ifpr.pgua.eic.mylist.controllers;

import ifpr.pgua.eic.mylist.App;
import ifpr.pgua.eic.mylist.utils.Navigator.BorderPaneRegion;
import javafx.fxml.FXML;

public class TelaPrincipal extends BaseController {
    
    @FXML
    private void carregarTelaFerramenta() {
        App.changeScreenRegion("FERRAMENTA", BorderPaneRegion.CENTER);
    }
}
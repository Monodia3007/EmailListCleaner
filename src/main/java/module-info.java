module eu.lilithmonodia.emaillistcleaner.emaillistcleaner {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens eu.lilithmonodia.emaillistcleaner.emaillistcleaner to javafx.fxml;
    exports eu.lilithmonodia.emaillistcleaner.emaillistcleaner;
}

package com.example.uorders;

        import com.example.models.CategoryModel;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;

        import java.util.Objects;

public class MenuCatController {

    @FXML
    private Label Cat_name;

    @FXML
    private Button CategoryButton;

    @FXML
    private ImageView img;

    private CategoryModel category;

    public void setData(CategoryModel category){
        this.category=category;
        Cat_name.setText(category.getName());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(category.getImgSrc())));
        img.setImage(image);

    }

    @FXML
    void OpenItemMenu(ActionEvent event) {

    }

}

package Controller;

import DAO.Dao_Food;
import Model.FoodItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class AFoodController {

//    private GridPane contentArea;
    @FXML
    private Button buttonCreate;
//    public void initialize() {
//        renderFood();
//    }

//    public void renderFood() {
//        List<FoodItem> foodItems = Dao_Food.getInstance().getAll();
//        int col = 0, row = 0;
//        for (FoodItem item : foodItems) {
//            VBox itemBox = new VBox();
//            ImageView imageView = new ImageView();
//            String imageUrl = item.getImageUrl();
//            if (imageUrl != null && !imageUrl.isEmpty()) {
//                File imageFile = new File(imageUrl);
//                if (imageFile.exists()) {
//                    Image image = new Image(imageFile.toURI().toString());
//                    imageView.setImage(image);
//                } else {
//                    System.err.println("This image file does not exist: " + imageUrl);
//                }
//            } else {
//                System.err.println("Error file path: " + item.getFoodName());
//            }
//
//            imageView.setFitWidth(100);
//            imageView.setFitHeight(100);
//
//            Label nameLabel = new Label(item.getFoodName());
//            Label priceLabel = new Label(String.format("%,.0fđ", item.getPrice()));
//            Button addToCartButton = new Button("THÊM VÀO GIỎ");
//            Button buyNowButton = new Button("MUA NGAY");
//            itemBox.getChildren().addAll(imageView, nameLabel, priceLabel, addToCartButton, buyNowButton);
//            contentArea.add(itemBox, col, row);
//            col++;
//            if (col == 6)
//            {
//                col = 0;
//                row++;
//            }
//        }
//    }
    public void onCreateButton(ActionEvent e)
    {
        addFoodItem();
    }
    // edit food item by button id
    public void addFoodItem()
    {
        FoodItem item = new FoodItem();
        item.setFoodName("Mì siu kay cấp độ 2703");
        item.setDescription("Mì j mà cay cay thế xin thưa rằng mì cay");
        item.setPrice(50000.0);
        item.setCategoryId(1);
        item.setImageUrl("D:/HuyCoding/JavaCode/LoginApp/src/main/resources/Pictures/mycay.jpg");
        item.setStock(20);
        Dao_Food.getInstance().create(item);
    }
}
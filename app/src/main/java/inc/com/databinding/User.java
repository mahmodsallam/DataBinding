package inc.com.databinding;

import android.content.Context;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Observable;

public class User  {
    private String name ;
    private String email ;
    private static String image ;

    public User(String name, String email, String image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage (View view , String imageUrl){
        ImageView imageView = (ImageView) view;
        Glide.with(view.getContext()).load(getImage()).into(imageView) ;

    }
}

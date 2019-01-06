package inc.com.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import inc.com.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding ;
    UsersAdapter adapter  ;
    ArrayList<User>userArrayList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this ,R.layout.activity_main ) ;
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userArrayList = new ArrayList<>() ;
        userArrayList.add(new User("mahmoud","test","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGTVf63Vm3XgOncMVSOy0-jSxdMT8KVJIc8WiWaevuWiPGe0Pm")) ;
        userArrayList.add(new User("mahmoud","test","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7b8m7eJ5c-BvpzHOrw7fjSHcbDsavFtCbpOoBROsHSH13IPOU")) ;
        userArrayList.add(new User("mahmoud","test","https://images.homedepot-static.com/productImages/4c249ff0-b5a4-4c93-b811-a0222973d920/svn/globalrose-flower-bouquets-vars-1-dozen-red-roses-64_1000.jpg")) ;
        adapter = new UsersAdapter(this , userArrayList) ;
        binding.recyclerView.setAdapter(adapter);
    }
}

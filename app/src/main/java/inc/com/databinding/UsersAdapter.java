package inc.com.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import inc.com.databinding.databinding.UserRowBinding;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.usersHolder> {
    Context context ;
    ArrayList<User>userArrayList ;

    public UsersAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public usersHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        UserRowBinding userRowBinding = DataBindingUtil.inflate(LayoutInflater.from(context) , R.layout.user_row,viewGroup ,false );
        return new usersHolder(userRowBinding) ;
    }

    @Override
    public void onBindViewHolder(@NonNull usersHolder usersHolder, int i) {
        User user = userArrayList.get(i) ;
        usersHolder.userRow.setUser(user);

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


    class usersHolder extends RecyclerView.ViewHolder{

        UserRowBinding userRow ;
        public usersHolder(@NonNull UserRowBinding itemView) {
            super(itemView.getRoot());
            userRow = itemView ;
        }
    }
}

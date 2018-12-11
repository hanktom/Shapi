package com.fju.shapi;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //recycler.setAdapter();
    }

    class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>{
        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class ProductViewHolder extends RecyclerView.ViewHolder{
            TextView productName;
            ImageView productImage;
            public ProductViewHolder(View itemView) {
                super(itemView);
                productName = itemView.findViewById(R.id.tv_product);
                productImage = itemView.findViewById(R.id.im_product);
            }
        }
    }


    public void login(View view){
//        Intent login = new Intent(LoginActivity.class);
//        startActivity(login);
    }
}

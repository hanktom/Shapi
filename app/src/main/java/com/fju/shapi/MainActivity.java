package com.fju.shapi;

import android.content.Intent;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fju.shapi.data.DummyData;
import com.fju.shapi.data.Product;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final int RC_LOGIN = 7800;
    boolean login = false;
    List products = DummyData.getProducts();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new ProductAdapter());
    }
    public void login(View view){
        Intent login = new Intent(this,LoginActivity.class);
        startActivity(login);
    }

    if (!login) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, RC_LOGIN);
    }

    class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.product_row,parent,false);
            return new ProductViewHolder(view);
        }


        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.productName.setText((CharSequence) products.get(position));
            //holder.productImage.setImageURI();
        }

        @Override
        public int getItemCount() {
            return products.size();
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
}

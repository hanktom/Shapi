package com.fju.shapi;

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
    boolean login = false;
    List<Product> products = DummyData.getProducts();
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
        if(!login) {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
        }
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
            holder.productName.setText(products.get(position).getName());
            holder.productInfo.setText(products.get(position).getInfo());
            holder.productPrice.setText(String.valueOf(products.get(position).getPrice()));
            holder.productStock.setText(String.valueOf(products.get(position).getStock()));
            //holder.productImage.setImageURI();
        }

        @Override
        public int getItemCount() {
            return products.size();
        }

        class ProductViewHolder extends RecyclerView.ViewHolder{
            TextView productName;
            TextView productInfo;
            TextView productPrice;
            TextView productStock;
            ImageView productImage;
            public ProductViewHolder(View itemView) {
                super(itemView);
                productName = itemView.findViewById(R.id.tv_productName);
                productInfo = itemView.findViewById(R.id.tv_productInfo);
                productPrice = itemView.findViewById(R.id.tv_productPrice);
                productStock = itemView.findViewById(R.id.tv_productStock);
                productImage = itemView.findViewById(R.id.im_product);
            }
        }
    }
}

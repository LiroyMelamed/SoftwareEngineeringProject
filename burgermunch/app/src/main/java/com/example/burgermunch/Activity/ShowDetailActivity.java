package com.example.burgermunch.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.burgermunch.Controller.OrderController;
import com.example.burgermunch.Domain.OrderDetails;
import com.example.burgermunch.Helper.ManagementCart;
import com.example.burgermunch.View.IOrderView;
import com.example.burgermunch.R;

public class ShowDetailActivity extends AppCompatActivity implements IOrderView {
    private TextView addToCartBtn,textView;
    private TextView titleTxt, feeTxt, descriptionTxt, totalPriceTxt, starTxt, caloryTxt, timeTxt;
    private ImageView picFood;
    private OrderDetails object;
    private int numberOrder = 1;
    private ManagementCart managementCart;
    private CheckBox tomato,lettuce,onion,pickle,pepper,friedOnion, friedEgg,mushroom,onionJelly,chickenBrest,DoubleChicken,mr,m,mw,wd;
    private IOrderView iorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        managementCart = new ManagementCart(this);

        iniView();
        getBundle();
        Checked();
    }

    private void Checked() {
        object = (OrderDetails) getIntent().getSerializableExtra("object");
        tomato=findViewById(R.id.tomato);
        lettuce=findViewById(R.id.lettuce);
        onion=findViewById(R.id.onion);
        pickle=findViewById(R.id.piccle);
        pepper=findViewById(R.id.pepper);
        friedOnion=findViewById(R.id.friedOnion);
        friedEgg =findViewById(R.id.friedAgg);
        mushroom=findViewById(R.id.mushroom);
        onionJelly=findViewById(R.id.onionJelly);
        chickenBrest=findViewById(R.id.chickenBreast);
        DoubleChicken=findViewById(R.id.doubleChicken);

        if(object.getDescription().contains("??????????????")) pepper.setVisibility(View.GONE);
        if(object.getDescription().contains("?????? ??????????")) friedOnion.setVisibility(View.GONE);
        if(object.getDescription().contains("???????? ??????")) friedEgg.setVisibility(View.GONE);
        if(object.getDescription().contains("????????????")) mushroom.setVisibility(View.GONE);
        if(object.getDescription().contains("???????? ??????")) onionJelly.setVisibility(View.GONE);
        if(object.getDescription().contains("???????? ??????????")) chickenBrest.setVisibility(View.GONE);
        if(object.getDescription().contains("???????? ?????? ???????? ??????????")) DoubleChicken.setVisibility(View.GONE);

        if(object.getTitle().contains("??????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);
        }
        if(object.getTitle().contains("????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("????????-????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("????????-????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("??????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("????????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("???????? ????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("??????????????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("?????????????????? ??????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("???????? ??????????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("?????????? ??????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("????????")){
            tomato.setVisibility(View.GONE);
            lettuce.setVisibility(View.GONE);
            onion.setVisibility(View.GONE);
            pickle.setVisibility(View.GONE);
            pepper.setVisibility(View.GONE);
            friedOnion.setVisibility(View.GONE);
            friedEgg.setVisibility(View.GONE);
            mushroom.setVisibility(View.GONE);
            onionJelly.setVisibility(View.GONE);
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);

        }
        if(object.getTitle().contains("?????????????? ????????????????")){
            chickenBrest.setVisibility(View.GONE);
            DoubleChicken.setVisibility(View.GONE);
            mr.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            mw.setVisibility(View.GONE);
            wd.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);
        }

        tomato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (tomato.isChecked() && !object.getDescription().contains("??????????????")) object.setDescription(object.getDescription()+",?????????????? ");
                else {
                    String temp = object.getDescription().replace(",?????????????? ", "");
                    object.setDescription(temp);
                }
            }
        });
        lettuce.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (lettuce.isChecked() && !object.getDescription().contains("??????")) object.setDescription(object.getDescription()+",?????? ");
                else {
                    String temp = object.getDescription().replace(",?????? ", "");
                    object.setDescription(temp);
                }
            }
        });
        onion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (onion.isChecked() && !object.getDescription().contains("?????? ????????")) object.setDescription(object.getDescription()+",?????? ???????? ");
                else {
                    String temp = object.getDescription().replace(",?????? ???????? ", "");
                    object.setDescription(temp);
                }
            }
        });
        pickle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (pickle.isChecked() && !object.getDescription().contains("???????????? ????????")) object.setDescription(object.getDescription()+",???????????? ???????? ");
                else {
                    String temp = object.getDescription().replace(",???????????? ???????? ", "");
                    object.setDescription(temp);
                }
            }
        });
        pepper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (pepper.isChecked() && !object.getDescription().contains("??????????????")){
                    object.setDescription(object.getDescription()+",?????????????? ");
                    object.setFee(object.getFee()+6);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",?????????????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-6);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");
                }
            }
        });
        friedOnion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (friedOnion.isChecked() && !object.getDescription().contains("?????? ??????????")){
                    object.setDescription(object.getDescription()+",?????? ?????????? ");
                    object.setFee(object.getFee()+6);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",?????? ?????????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-6);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
            }
        });
        friedEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (friedEgg.isChecked() && !object.getDescription().contains("???????? ??????")){
                    object.setDescription(object.getDescription()+",???????? ?????? ");
                    object.setFee(object.getFee()+7);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",???????? ?????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-7);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
            }
        });
        mushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (mushroom.isChecked() && !object.getDescription().contains("????????????")){
                    object.setDescription(object.getDescription()+",???????????? ");
                    object.setFee(object.getFee()+7);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",???????????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-7);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
            }
        });
        onionJelly.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (onionJelly.isChecked() && !object.getDescription().contains("???????? ??????")){
                    object.setDescription(object.getDescription()+",???????? ?????? ");
                    object.setFee(object.getFee()+9);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",???????? ?????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-9);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");


                }
            }
        });
        chickenBrest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chickenBrest.isChecked() && !object.getDescription().contains("?????? ???????? ??????????")){
                    object.setDescription(object.getDescription()+",?????? ???????? ?????????? ");
                    object.setFee(object.getFee()+13);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",?????? ???????? ?????????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-13);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
            }
        });
        DoubleChicken.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (DoubleChicken.isChecked() && !object.getDescription().contains("???????? ?????? ???????? ??????????")){
                    object.setDescription(object.getDescription()+",???????? ?????? ???????? ?????????? ");
                    object.setFee(object.getFee()+23);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
                else {
                    String temp = object.getDescription().replace(",???????? ?????? ???????? ?????????? ", "");
                    object.setDescription(temp);
                    object.setFee(object.getFee()-23);
                    totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");

                }
            }
        });
        mr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (mr.isChecked() && !object.getDescription().contains(",MR")) {
                    object.setDescription(object.getDescription() + ",MR ");
                }
                else {
                    String temp = object.getDescription().replace(",MR ", "");
                    object.setDescription(temp);
                }
            }
        });
        m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (m.isChecked() && !object.getDescription().contains(",M")) {
                    object.setDescription(object.getDescription() + ",M ");
                }
                else {
                    String temp = object.getDescription().replace(",M ", "");
                    object.setDescription(temp);
                }
            }
        });
        mw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (mw.isChecked() && !object.getDescription().contains(",MW")) {
                    object.setDescription(object.getDescription() + ",MW ");
                }
                else {
                    String temp = object.getDescription().replace(",MW ", "");
                    object.setDescription(temp);
                }
            }
        });
        wd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (m.isChecked() && !object.getDescription().contains(",WD")) {
                    object.setDescription(object.getDescription() + ",WD ");
                }
                else {
                    String temp = object.getDescription().replace(",WD ", "");
                    object.setDescription(temp);
                }
            }
        });


    }

    private void getBundle() {
        object = (OrderDetails) getIntent().getSerializableExtra("object");

        int drawableResourceId = this.getResources().getIdentifier(object.getPic(), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picFood);

        titleTxt.setText(object.getTitle());
        feeTxt.setText(object.getFee()+" ??????");
        descriptionTxt.setText(object.getDescription());
        caloryTxt.setText(object.getCalories() + " ??????????????");
        starTxt.setText(object.getStar() + "");
        timeTxt.setText(object.getTime()+ " ???????? ");
        totalPriceTxt.setText(Math.round(numberOrder * object.getFee())+" ??????");
        object = (OrderDetails) getIntent().getSerializableExtra("object");
        tomato=findViewById(R.id.tomato);
        lettuce=findViewById(R.id.lettuce);
        onion=findViewById(R.id.onion);
        pickle=findViewById(R.id.piccle);
        pepper=findViewById(R.id.pepper);
        friedOnion=findViewById(R.id.friedOnion);
        friedEgg =findViewById(R.id.friedAgg);
        mushroom=findViewById(R.id.mushroom);
        onionJelly=findViewById(R.id.onionJelly);
        chickenBrest=findViewById(R.id.chickenBreast);
        DoubleChicken=findViewById(R.id.doubleChicken);
        addToCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!object.getTitle().contains("?????????????? ????????????????")&&!object.getTitle().contains("????????")&&!object.getTitle().contains("?????????? ??????")&&!object.getTitle().contains("???????? ??????????????")&&!object.getTitle().contains("?????????????????? ??????????")&&!object.getTitle().contains("??????????????????")&&!object.getTitle().contains("???????? ????????")&&!object.getTitle().contains("????????????")&&!object.getTitle().contains("??????????")&&!object.getTitle().contains("????????-????????")&&!object.getTitle().contains("????????-????????")&&!object.getTitle().contains("????????")&&!object.getTitle().contains("??????"))&&(!mr.isChecked()&&!m.isChecked()&&!mw.isChecked()&&!wd.isChecked())){
                    Toast.makeText(ShowDetailActivity.this, "???????? ?????????? ???????? ??????????", Toast.LENGTH_SHORT).show();
                }
                else if((mr.isChecked()&&m.isChecked())||(mr.isChecked()&&mw.isChecked())||(mr.isChecked()&&wd.isChecked())||(m.isChecked()&&mw.isChecked())||(m.isChecked()&&wd.isChecked())||(mw.isChecked()&&wd.isChecked())){
                    Toast.makeText(ShowDetailActivity.this, "???????? ?????????? ???????? ?????????? ??????", Toast.LENGTH_SHORT).show();
                }
                else {
                    object.setNumberInCart(numberOrder);
                    managementCart.insertFood(object);
                    startActivity(new Intent(ShowDetailActivity.this, MainActivity.class));
                }
            }
        });
    }

    private void iniView() {
        addToCartBtn = findViewById(R.id.addToCartBtn);
        titleTxt = findViewById(R.id.titleTxt);
        feeTxt = findViewById(R.id.priceTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        picFood = findViewById(R.id.foodPic);
        totalPriceTxt = findViewById(R.id.totalPriceTxt);
        starTxt = findViewById(R.id.starTxt);
        caloryTxt = findViewById(R.id.VicaloriesTxt);
        timeTxt = findViewById(R.id.timeTxt);
        mr = findViewById(R.id.MR);
        m = findViewById(R.id.M);
        mw = findViewById(R.id.MW);
        wd = findViewById(R.id.WD);
        textView = findViewById(R.id.textView);


    }

    @Override
    public void OrderSuccess(String msg) {
    }

    @Override
    public void OrderError(String msg) {
        Toast.makeText(ShowDetailActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
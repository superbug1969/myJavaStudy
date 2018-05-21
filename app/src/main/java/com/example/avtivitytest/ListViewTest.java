package com.example.avtivitytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.avtivitytest.BaseActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListViewTest extends BaseActivity {
//    private String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};
    private List<Fruit> fruitList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewtest_layout);
        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
       /** LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); */
       /** StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(6,StaggeredGridLayoutManager.VERTICAL);*/
        GridLayoutManager layoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
/**public void initFruits(){
        for (int i=0;i<2;i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.m_01);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Banana"), R.drawable.m_02);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.m_03);
            fruitList.add(orange);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.m_04);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("Grape"), R.drawable.m_05);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("PineApple"), R.drawable.m_06);
            fruitList.add(pineapple);
            Fruit stawberry = new Fruit(getRandomLengthName("StrawBerry"), R.drawable.m_07);
            fruitList.add(stawberry);
            Fruit cherry = new Fruit(getRandomLengthName("Cherry"), R.drawable.m_08);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.m_09);
            fruitList.add(mango);
            Fruit watermelon = new Fruit(getRandomLengthName("WaterMelon"),R.drawable.m_10);
            fruitList.add(watermelon);

        }
}
*/

public void initFruits(){
     for (int i=0;i<2;i++) {
     Fruit apple = new Fruit("Apple", R.drawable.m_01);
     fruitList.add(apple);
     Fruit banana = new Fruit("Banana", R.drawable.m_02);
     fruitList.add(banana);
     Fruit orange = new Fruit("Orange", R.drawable.m_03);
     fruitList.add(orange);
     Fruit pear = new Fruit("Pear", R.drawable.m_04);
     fruitList.add(pear);
     Fruit grape = new Fruit("Grape", R.drawable.m_05);
     fruitList.add(grape);
     Fruit pineapple = new Fruit("PineApple", R.drawable.m_06);
     fruitList.add(pineapple);
     Fruit stawberry = new Fruit("StrawBerry", R.drawable.m_07);
     fruitList.add(stawberry);
     Fruit cherry = new Fruit("Cherry", R.drawable.m_08);
     fruitList.add(cherry);
     Fruit mango = new Fruit("Mango", R.drawable.m_09);
     fruitList.add(mango);
     Fruit watermelon = new Fruit("WaterMelon",R.drawable.m_10);
     fruitList.add(watermelon);

     }
     }

private String getRandomLengthName(String name){
    Random random = new Random();
    int length = random.nextInt(20)+1;
    StringBuilder builder = new StringBuilder();
    for (int i=0;i<length;i++){
        builder.append(name);
    }
    return builder.toString();
}

}

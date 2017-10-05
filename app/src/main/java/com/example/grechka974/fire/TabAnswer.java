package com.example.grechka974.fire;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Marsel on 05.10.2017.
 */


public class TabAnswer extends Fragment {

    ListView listView;
    private static final int CM_ONE = 1;
    private static final int CM_TWO = 2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_ans, container, false);
        listView = (ListView) rootView.findViewById(R.id.listView);

        registerForContextMenu(listView); // тут тоже создается меню
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){ //тут при нажатии на элемент должно открываться диалоговое окно
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {

            }
        });


        return rootView;


    }
    //тут меню при длит нажатии открывается
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, CM_ONE, 0, R.string.one);
        menu.add(0, CM_TWO, 0, R.string.two);

    }

    //тут смотрит куда ты нажимаешь
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == CM_ONE) {

            return true;
        }
        if (item.getItemId() == CM_TWO) {

            return true;
        }


        return super.onContextItemSelected(item);
    }
}
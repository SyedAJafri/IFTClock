package com.NothingSuspicious.iftclock;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Rules_List extends ListActivity {
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    String[] values = new String[] { "Rule1", "Rule2", "Rule3", "Rule11", "Rule12", "Rule13" };
    
    /*TODO customize rowlayout.xml img when done*/
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            R.layout.rowlayout, R.id.label, values);
    setListAdapter(adapter);
  }

  
  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    String item = (String) getListAdapter().getItem(position);
    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
  }
  
} 
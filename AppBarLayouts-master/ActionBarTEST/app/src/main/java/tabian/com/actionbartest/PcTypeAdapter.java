package tabian.com.actionbartest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hieuv on 7/1/2017.
 */

public class PcTypeAdapter extends BaseAdapter {
    Context context;
    int myLayout;
    List<PCTYPE> pctypeList;
    @Override
    public int getCount() {
        return pctypeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);
        TextView textView = (TextView)convertView.findViewById(R.id.txtName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imagesRowPC);
        textView.setText(pctypeList.get(position).name);
        textView.setText(pctypeList.get(position).name);
        imageView.setImageResource(pctypeList.get(position).Images);
        return convertView;
    }
}

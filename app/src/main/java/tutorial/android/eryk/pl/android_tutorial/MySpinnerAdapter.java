package tutorial.android.eryk.pl.android_tutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MySpinnerAdapter extends ArrayAdapter<Dupa> {

    private List<Dupa> values = new ArrayList<>();

    public MySpinnerAdapter(Context context) {
        super(context, R.layout.spinner_item);
    }

    public void setValues(List<Dupa> values) {
        this.values = values;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public Dupa getItem(int position) {
        return values.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        return setLabelForView(position, super.getView(position, convertView, parent));
    }

    @Override
    public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) {
        return setLabelForView(position, super.getView(position, convertView, parent));
    }

    private View setLabelForView(int position, View view) {
        TextView label = (TextView) view.findViewById(android.R.id.text1);
        label.setText(getLabel(values.get(position)));
        return view;
    }

    String getLabel(Dupa item) {
        return "Dupa dupa";
    }

    String getItemLabel(int position) {
        return getLabel(getItem(position));
    }

    public int setSelection(Spinner spinner, Dupa item) {
        return setSelection(spinner, getLabel(item));
    }

    private int setSelection(Spinner spinner, String label) {
        if (spinner != null && !TextUtils.isEmpty(label))
            for (int i = 0; i < spinner.getCount(); ++i) {
                if (spinner.getItemAtPosition(i).equals(label)) {
                    spinner.setSelection(i);
                }
            }
        return -1;
    }

}

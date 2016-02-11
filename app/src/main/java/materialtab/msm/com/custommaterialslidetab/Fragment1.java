package materialtab.msm.com.custommaterialslidetab;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_1,container,false);
        final Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getActivity().getIntent();
                //BitmapDrawable bitmapDrawable = (BitmapDrawable) button.getDra
                Bitmap thumbnail= BitmapFactory.decodeResource(getResources(), R.drawable.credit);

                if (Integer.valueOf(android.os.Build.VERSION.SDK)>16) {
                    Bundle options= ActivityOptions.makeScaleUpAnimation(v, 0, 0, 50, 150).toBundle();
                    getActivity().startActivity(intent, options);
                }

            }
        });
        return v;
    }
}

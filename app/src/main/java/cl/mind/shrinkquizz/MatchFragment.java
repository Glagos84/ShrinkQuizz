package cl.mind.shrinkquizz;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance() {
        return new MatchFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final SeekBar userSb = view.findViewById(R.id.userSb);
        final TextView userTv = view.findViewById(R.id.userTv);
        final SeekBar loverSb = view.findViewById(R.id.loverSb);
        final TextView loverTv = view.findViewById(R.id.loverTv);
        Button button = view.findViewById(R.id.machBtn);

        userSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                userTv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        loverSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                loverTv.setText(String.valueOf(i)); // tengo q caster el int a string


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //userSb.setProgress();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int user = userSb.getProgress();
                int lover = loverSb.getProgress();

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                alertDialog.setTitle("Nivel de Match");
                alertDialog.setMessage(new MatchResult(user, lover).answer());
                alertDialog.setPositiveButton("Macth", (new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        dialog.dismiss();
                    }
                }));

                alertDialog.show();
            }
        });

    }
}

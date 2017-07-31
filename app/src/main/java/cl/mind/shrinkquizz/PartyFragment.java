package cl.mind.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }

    public static PartyFragment newInstance() {
        return new PartyFragment();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // porq no me pide q lo castee?? en le video lo estaba casteando;

        final RadioGroup radioGroup = view.findViewById(R.id.partyRg);
        Button button = view.findViewById(R.id.partyBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = radioGroup.getCheckedRadioButtonId();

               if (id != -1 ){

                   RadioButton radiobutton = radioGroup.findViewById(id);
                   String answer = radiobutton.getText().toString();
                   Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();

                }else {

                   Toast.makeText(getContext(), "DEBES MARCAR UNA OPCION", Toast.LENGTH_SHORT).show();

               }

                Log.d("RADIO GROUP", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            }
        });
    }
}

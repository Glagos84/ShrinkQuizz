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

                if (id != -1) {

                    RadioButton radiobutton = radioGroup.findViewById(id);
                    String answer = radiobutton.getText().toString();
                    showDialog(answer);

                } else {

                    Toast.makeText(getContext(), "DEBES MARCAR UNA OPCION", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }

    private void showDialog(String answer) {

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Nivel de Mambo");
        alertDialog.setMessage(new PartyResult(answer).score()); /* llamo las clases que cree para el answer y el result, ESTO
         ES LO IMPORTANTE esto me va a mostrar el resultado procesado.*/
        alertDialog.setPositiveButton("yeahh", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                dialog.dismiss();
            }
        });

        alertDialog.show();

    }
}

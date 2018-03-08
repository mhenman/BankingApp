package com.example.emilyeberhardt.BankingApp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileFragment extends android.support.v4.app.Fragment {
    private EditText mEditFirstText;
    private TextView mFirstText;
    private TextView mLastText;
    private EditText mEditLastText;
    private FamilyMember familyMember;
    private Button mSubmitButton;
    private TextView balance;

    TextView getBalance;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View rootView = inflater.inflate(R.layout.activity_profile_fragment, container, false);
        familyMember = new FamilyMember();
        mFirstText = (TextView) rootView.findViewById(R.id.m_first_text);
        mLastText = (TextView) rootView.findViewById(R.id.m_last_text);
        mEditFirstText = (EditText)rootView.findViewById(R.id.m_edit_first_text);
        mEditLastText = (EditText)rootView.findViewById(R.id.m_edit_last_text);
        balance = (TextView)rootView.findViewById(R.id.Balance);
        mSubmitButton = (Button)rootView.findViewById(R.id.m_submit_profile_button);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                familyMember.setFirstName(mEditFirstText.getText().toString());
                familyMember.setLastName(mEditLastText.getText().toString());
                String primary = familyMember.getFirstName();
                String secondary = familyMember.getLastName();
                int Balance = Integer.parseInt(balance.getText().toString())+Integer.parseInt(primary) - Integer.parseInt(secondary);
                balance.setText(""+Balance);


            }
        });
        return rootView;




    }

}
package com.example.cat.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cat.R;




public class DashboardFragment extends Fragment {
    ListView lvDashboard;
    String[] dashName = {"files", "people", "image", "legislation"};
    String[] dashDescription = {"files description", "people description", "image description", "legislation description"};
    int[] dashImage = {R.drawable.docso, R.drawable.community, R.drawable.community, R.drawable.legislation};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        lvDashboard = rootView.findViewById(R.id.lvDashboard);

        ProgramAdapter programAdapter = new ProgramAdapter(getActivity(), dashName, dashImage, dashDescription);
        lvDashboard.setAdapter(programAdapter);
        return rootView;
    }
}
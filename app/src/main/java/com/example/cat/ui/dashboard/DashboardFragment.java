package com.example.cat.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cat.CompteRendu;
import com.example.cat.R;
import com.example.cat.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    public DashboardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        String[] menuItems = {"La vie de la réunion, activités", "Comptes rendu des seances", "Liste des membres", "Situation Géographique"};

        ListView listView = (ListView) view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(getActivity(), "tu as selection le premier", Toast.LENGTH_SHORT).show();
                }else if (position == 1){
                    Toast.makeText(getActivity(), "tu as selection le second", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), CompteRendu.class);
                    startActivity(intent);
                } else if (position == 2){
                    Toast.makeText(getActivity(), "tu as selection le troisieme", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
    /*
    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    */
}
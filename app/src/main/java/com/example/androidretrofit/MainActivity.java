package com.example.androidretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidretrofit.Adapter.ProjectAdapter;
import com.example.androidretrofit.ClientToServer.ApiClient;
import com.example.androidretrofit.ClientToServer.ApiInterface;
import com.example.androidretrofit.Model.ModelInformation;
import com.example.androidretrofit.Presenter.ProjectService;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ProjectService.networkcall,ProjectService.uicontrol {

    private RecyclerView recyclerView;
    private ProjectAdapter adapter;
    private List<ModelInformation> list;
    private LinearLayoutManager layoutManager;
    private ApiInterface apiInterface;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        fetchprojectinfo();
    }

    @Override
    public void initialization() {

        apiInterface  = ApiClient.getApiClient().create(ApiInterface.class);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        textView = findViewById(R.id.fulltime);

    }

    @Override
    public void fetchprojectinfo() {

        Call<List<ModelInformation>> call = apiInterface.getprojectinfo();
        call.enqueue(new Callback<List<ModelInformation>>() {
            @Override
            public void onResponse(Call<List<ModelInformation>> call, Response<List<ModelInformation>> response) {

                if (response.code() == 200)
                {
                    list = response.body();
                    if (list != null)
                    {
                        adapter = new ProjectAdapter(list,MainActivity.this);
                        recyclerView.setAdapter(adapter);

                        // if needed to set any dataa from server to static ui
                        Toast.makeText(MainActivity.this, "Our No of Full time HR "+list.get(0).getNoofdeveloperfulltime(), Toast.LENGTH_SHORT).show();
                        textView.setText(list.get(0).getNoofdeveloperparttime());

                    }
                }
            }

            @Override
            public void onFailure(Call<List<ModelInformation>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error is "+t, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

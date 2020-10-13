package com.mydfmax.my.AbsenQR;

import android.os.Bundle;

import com.mydfmax.my.AbsenQR.ui.home.ScanFragment;

public class ActivityAbsenTruk extends ScanFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absen_truk);
//        cekAjax();
    }
//    private void cekAjax() {
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                Request.Method.GET,
//                URLS.URL_AJAX,
//                null,
//                new Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        String id;
//                        JSONObject jsonObject = getString();
//                        try {
//                            String firstName = jsonObject.getString("firstname");
//                            int age = jsonObject.getInt("age");
//                            String mail = jsonObject.getString("mail");
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        error.printStackTrace();
//                    }
//                }
//
//        );
//    }
}
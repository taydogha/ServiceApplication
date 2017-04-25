package com.example.tayketyai.serviceapplication.OPPMSService;

import com.example.tayketyai.serviceapplication.OPPMSService.OPPMSDAO.OPPMSDAO;
import com.example.tayketyai.serviceapplication.OPPMSService.OPPMSDAO.SendQuick;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Tay Ketyai on 17/3/2560.
 */

public interface OPPMSService {

    @POST("index.php/OPPMS/service_android/graph_cycle") //ใส่พาธข้อมูลservice
    Call<OPPMSDAO> getOPPMSData();
    @FormUrlEncoded
    @POST("index.php/OPPMS/service_android/send_quick")
    Call<SendQuick> sendData(@Field("id") String id,@Field("name") String name);
}

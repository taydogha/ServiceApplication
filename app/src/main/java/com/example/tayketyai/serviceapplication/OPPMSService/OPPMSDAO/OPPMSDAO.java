package com.example.tayketyai.serviceapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Tay Ketyai on 17/3/2560.
 */

public class OPPMSDAO {
    @SerializedName("details")
    public Details details;
    @SerializedName("graphData")
    public ArrayList<GraphData> graphData;
}

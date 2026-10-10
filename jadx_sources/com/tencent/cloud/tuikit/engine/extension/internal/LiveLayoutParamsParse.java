package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class LiveLayoutParamsParse {
    private static final String TAG = "LiveLayoutParamsParse";

    public static TUILiveLayoutManager.SeatLayout getSeatLayoutFromJSONObject(JSONObject jSONObject) {
        TUILiveLayoutManager.SeatLayout seatLayout = new TUILiveLayoutManager.SeatLayout();
        if (jSONObject != null) {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("regions");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2 != null) {
                        arrayList.add(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getSeatFullInfoFromJSONObject(jSONObject2));
                    }
                }
                seatLayout.templateId = jSONObject.getInt("templateId");
                seatLayout.canvasWidth = jSONObject.getInt("canvasWidth");
                seatLayout.canvasHeight = jSONObject.getInt("canvasHeight");
                seatLayout.seatList = arrayList;
                return seatLayout;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "parse getSeatLayoutFromJSONObject failed, error: " + e11);
            }
        }
        return seatLayout;
    }
}

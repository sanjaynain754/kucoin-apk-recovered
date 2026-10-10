package com.tencent.bugly.callback;

import org.json.JSONObject;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface Callback {
    public static final String FRAME_LAG = "frame_lag";
    public static final String MSG_LAG = "msg_lag";

    void onCallback(JSONObject jSONObject);
}

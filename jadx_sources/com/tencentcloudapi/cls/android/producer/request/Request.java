package com.tencentcloudapi.cls.android.producer.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Request implements Serializable {
    private static final long serialVersionUID = -5830692390140453699L;
    private final Map<String, String> mParams = new HashMap();

    public Map<String, String> GetAllParams() {
        return this.mParams;
    }

    public String GetParam(String str) {
        return this.mParams.containsKey(str) ? this.mParams.get(str) : "";
    }

    public void SetParam(String str, String str2) {
        if (str2 == null) {
            this.mParams.put(str, "");
        } else {
            this.mParams.put(str, str2);
        }
    }
}

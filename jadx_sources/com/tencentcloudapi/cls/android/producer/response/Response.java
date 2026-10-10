package com.tencentcloudapi.cls.android.producer.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Response implements Serializable {
    private static final long serialVersionUID = 7331835262124313824L;
    private Map<String, List<String>> mHeaders = new HashMap();
    private Integer httpStatusCode = 0;

    public Map<String, List<String>> GetAllHeaders() {
        return this.mHeaders;
    }

    public List<String> GetHeader(String str) {
        return this.mHeaders.containsKey(str) ? this.mHeaders.get(str) : new ArrayList();
    }

    public Integer GetHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String GetRequestId() {
        List<String> listGetHeader = GetHeader("X-Cls-Requestid");
        if (!listGetHeader.isEmpty()) {
            return listGetHeader.get(0);
        }
        List<String> listGetHeader2 = GetHeader("x-cls-requestid");
        return !listGetHeader2.isEmpty() ? listGetHeader2.get(0) : "";
    }

    public void SetHttpStatusCode(Integer num) {
        this.httpStatusCode = num;
    }

    /* JADX INFO: renamed from: a */
    public final void m79346a(Map<String, List<String>> map) {
        this.mHeaders = new HashMap(map);
    }

    public Response(Map<String, List<String>> map) {
        m79346a(map);
    }
}

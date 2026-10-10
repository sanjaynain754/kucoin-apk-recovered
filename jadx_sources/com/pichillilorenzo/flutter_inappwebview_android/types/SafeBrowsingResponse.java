package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class SafeBrowsingResponse {
    private Integer action;
    private boolean report;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
            if (this.report != safeBrowsingResponse.report) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = safeBrowsingResponse.action;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 == null) {
                return true;
            }
        }
        return false;
    }

    public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get(TUIConstants.TIMPush.NOTIFICATION.ACTION));
    }

    public Integer getAction() {
        return this.action;
    }

    public int hashCode() {
        int i11 = (this.report ? 1 : 0) * 31;
        Integer num = this.action;
        return i11 + (num != null ? num.hashCode() : 0);
    }

    public boolean isReport() {
        return this.report;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setReport(boolean z11) {
        this.report = z11;
    }

    public String toString() {
        return "SafeBrowsingResponse{report=" + this.report + ", action=" + this.action + '}';
    }

    public SafeBrowsingResponse(boolean z11, Integer num) {
        this.report = z11;
        this.action = num;
    }
}

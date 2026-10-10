package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class ServerTrustAuthResponse {
    private Integer action;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Integer num = this.action;
            Integer num2 = ((ServerTrustAuthResponse) obj).action;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 == null) {
                return true;
            }
        }
        return false;
    }

    public static ServerTrustAuthResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ServerTrustAuthResponse((Integer) map.get(TUIConstants.TIMPush.NOTIFICATION.ACTION));
    }

    public Integer getAction() {
        return this.action;
    }

    public int hashCode() {
        Integer num = this.action;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public String toString() {
        return "ServerTrustAuthResponse{action=" + this.action + '}';
    }

    public ServerTrustAuthResponse(Integer num) {
        this.action = num;
    }
}

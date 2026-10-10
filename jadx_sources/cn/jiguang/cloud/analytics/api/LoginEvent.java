package cn.jiguang.cloud.analytics.api;

import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class LoginEvent extends Event {
    private static final int CUSTOM_SIZE = 2;
    private static final String TAG = "LoginEvent";
    private String loginMethod;
    private boolean loginSuccess;

    public LoginEvent() {
        super(JAnalysisConstants.TYPE_LOGIN);
        this.loginMethod = "";
        this.loginSuccess = false;
        super.putExtraAttr(JAnalysisConstants.LOGIN_METHOD, "");
        super.putExtraAttr(JAnalysisConstants.LOGIN_SUCCESS, (Object) Boolean.valueOf(this.loginSuccess));
    }

    public String getLoginMethod() {
        return this.loginMethod;
    }

    public boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public LoginEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        if (str.equals(JAnalysisConstants.LOGIN_SUCCESS) || str.equals(JAnalysisConstants.LOGIN_METHOD)) {
            JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
            return this;
        }
        if (this.extraAttrMap.size() < 50) {
            return (LoginEvent) super.putExtraAttr(str, obj);
        }
        JCommonLog.m5430d(TAG, "can't put [" + str + "], login event extraAttrMap size can't be no more than 48");
        return this;
    }

    public Event setExtMap(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return this;
        }
        Map<String, Object> extraAttrMap = getExtraAttrMap();
        if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
            Iterator<Map.Entry<String, Object>> it = extraAttrMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                key.getClass();
                if (key.equals(JAnalysisConstants.LOGIN_SUCCESS) || key.equals(JAnalysisConstants.LOGIN_METHOD)) {
                    JCommonLog.m5430d(TAG, "key [" + next.getKey() + "] is invalid");
                } else {
                    it.remove();
                }
            }
        }
        addExtMap(map);
        return this;
    }

    public Event addExtMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                key.getClass();
                if (!key.equals(JAnalysisConstants.LOGIN_SUCCESS) && !key.equals(JAnalysisConstants.LOGIN_METHOD)) {
                    putExtraAttr(entry.getKey(), entry.getValue());
                } else {
                    JCommonLog.m5430d(TAG, "key [" + entry.getKey() + "] is invalid");
                }
            }
        }
        return this;
    }

    public LoginEvent addKeyValue(String str, Object obj) {
        return putExtraAttr(str, obj);
    }

    public LoginEvent setLoginMethod(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.loginMethod = str;
            super.putExtraAttr(JAnalysisConstants.LOGIN_METHOD, (Object) str);
        }
        return this;
    }

    public LoginEvent setLoginSuccess(boolean z11) {
        if (JAnalyticsHelper.isValidValue(Boolean.valueOf(z11))) {
            this.loginSuccess = z11;
            super.putExtraAttr(JAnalysisConstants.LOGIN_SUCCESS, (Object) Boolean.valueOf(z11));
        }
        return this;
    }

    public LoginEvent(String str, boolean z11) {
        super(JAnalysisConstants.TYPE_LOGIN);
        this.loginMethod = str;
        this.loginSuccess = z11;
        super.putExtraAttr(JAnalysisConstants.LOGIN_METHOD, (Object) str);
        super.putExtraAttr(JAnalysisConstants.LOGIN_SUCCESS, (Object) Boolean.valueOf(this.loginSuccess));
    }
}

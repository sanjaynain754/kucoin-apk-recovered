package com.sensorsdata.analytics.android.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class AppWebViewInterface {
    private static final String TAG = "SA.AppWebViewInterface";
    private boolean enableVerify;
    private Context mContext;
    private WeakReference<View> mWebView;
    private JSONObject properties;

    public AppWebViewInterface(Context context, JSONObject jSONObject, boolean z11) {
        this(context, jSONObject, z11, null);
    }

    @JavascriptInterface
    public boolean sensorsdata_abtest_module() {
        try {
            return ReflectUtil.callStaticMethod(ReflectUtil.getCurrentClass(new String[]{"com.sensorsdata.abtest.SensorsABTest"}), "shareInstance", new Object[0]) != null;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    @JavascriptInterface
    public boolean sensorsdata_visual_verify(String str) {
        try {
            if (!this.enableVerify) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strOptString = new JSONObject(str).optString("server_url");
            return !TextUtils.isEmpty(strOptString) && new ServerUrl(strOptString).check(new ServerUrl(SensorsDataAPI.sharedInstance().getServerUrl()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return false;
    }

    public AppWebViewInterface(Context context, JSONObject jSONObject, boolean z11, View view) {
        this.mContext = context;
        this.properties = jSONObject;
        this.enableVerify = z11;
        if (view != null) {
            this.mWebView = new WeakReference<>(view);
        }
    }

    @JavascriptInterface
    public String sensorsdata_call_app() {
        try {
            if (this.properties == null) {
                this.properties = new JSONObject();
            }
            this.properties.put("type", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            String loginId = SensorsDataAPI.sharedInstance(this.mContext).getLoginId();
            if (TextUtils.isEmpty(loginId)) {
                this.properties.put("distinct_id", SensorsDataAPI.sharedInstance(this.mContext).getAnonymousId());
                this.properties.put("is_login", false);
            } else {
                this.properties.put("distinct_id", loginId);
                this.properties.put("is_login", true);
            }
            return this.properties.toString();
        } catch (JSONException e11) {
            SALog.m68589i(TAG, e11.getMessage());
            return null;
        }
    }

    @JavascriptInterface
    public void sensorsdata_js_call_app(String str) {
        try {
            if (this.mWebView != null) {
                SensorsDataAPI.sharedInstance().handleJsMessage(this.mWebView, str);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @JavascriptInterface
    public void sensorsdata_track(String str) {
        try {
            SensorsDataAPI.sharedInstance(this.mContext).trackEventFromH5(str, this.enableVerify);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @JavascriptInterface
    public boolean sensorsdata_verify(String str) {
        try {
            if (this.enableVerify) {
                return SensorsDataAPI.sharedInstance(this.mContext)._trackEventFromH5(str);
            }
            sensorsdata_track(str);
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    @JavascriptInterface
    public String sensorsdata_get_server_url() {
        SensorsDataAPI.sharedInstance();
        if (AbstractSensorsDataAPI.getConfigOptions().isAutoTrackWebView) {
            return SensorsDataAPI.sharedInstance().getServerUrl();
        }
        return "";
    }
}

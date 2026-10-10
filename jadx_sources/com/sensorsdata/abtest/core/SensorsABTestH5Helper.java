package com.sensorsdata.abtest.core;

import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.abtest.entity.AppConstants;
import com.sensorsdata.abtest.entity.H5Request;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class SensorsABTestH5Helper implements WebViewJavascriptBridge {
    private static final String TAG = "SAB.SensorsABTestH5Helper";
    private String mMessage;
    private WeakReference<View> mWebView;

    @Override // com.sensorsdata.abtest.core.WebViewJavascriptBridge
    public void callJs(final String str) {
        final View view;
        WeakReference<View> weakReference = this.mWebView;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.post(new Runnable() { // from class: com.sensorsdata.abtest.core.SensorsABTestH5Helper.2
            @Override // java.lang.Runnable
            public void run() {
                String str2 = "'abtest','" + str + "'";
                SensorsABTestH5Helper.invokeWebViewLoad(view, "loadUrl", new Object[]{"javascript:window.sensorsdata_app_call_js(" + str2 + ")"}, new Class[]{String.class});
            }
        });
    }

    @Override // com.sensorsdata.abtest.core.WebViewJavascriptBridge
    public void handlerJSMessage() {
        try {
            SALog.m68589i(TAG, "handlerJSMessage enter.");
            WeakReference<View> weakReference = this.mWebView;
            if (weakReference != null && weakReference.get() != null) {
                if (TextUtils.isEmpty(this.mMessage)) {
                    SALog.m68589i(TAG, "content is null");
                    return;
                }
                SALog.m68589i(TAG, "handlerJSMessage content: " + this.mMessage);
                JSONObject jSONObject = new JSONObject(this.mMessage);
                if (TextUtils.equals("abtest", jSONObject.optString("callType"))) {
                    final H5Request h5Request = new H5Request();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        h5Request.messageId = jSONObjectOptJSONObject.optString(Constants.MessagePayloadKeys.MSGID_SERVER);
                        final String distinctId = SensorsDataAPI.sharedInstance().getDistinctId();
                        new SensorsABTestApiRequestHelper().requestExperiments(null, null, jSONObjectOptJSONObject.optJSONObject("request_body"), new IApiCallback<String>() { // from class: com.sensorsdata.abtest.core.SensorsABTestH5Helper.1
                            @Override // com.sensorsdata.abtest.core.IApiCallback
                            public void onFailure(int i11, String str) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put(Constants.MessagePayloadKeys.MSGID_SERVER, h5Request.messageId);
                                    SALog.m68589i(SensorsABTestH5Helper.TAG, "onFailure callJS object: " + jSONObject2.toString());
                                    SensorsABTestH5Helper.this.callJs(SensorsABTestH5Helper.string2Base64(jSONObject2.toString()));
                                } catch (JSONException e11) {
                                    SALog.printStackTrace(e11);
                                }
                            }

                            @Override // com.sensorsdata.abtest.core.IApiCallback
                            public void onSuccess(String str) {
                                JSONObject jSONObject2;
                                if (TextUtils.isEmpty(str)) {
                                    SALog.m68589i(SensorsABTestH5Helper.TAG, "response is null");
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put(Constants.MessagePayloadKeys.MSGID_SERVER, h5Request.messageId);
                                    jSONObject3.put("data", new JSONObject(str));
                                    SALog.m68589i(SensorsABTestH5Helper.TAG, "onSuccess callJS object: " + jSONObject3.toString());
                                    SensorsABTestH5Helper.this.callJs(SensorsABTestH5Helper.string2Base64(jSONObject3.toString()));
                                } catch (JSONException e11) {
                                    SALog.printStackTrace(e11);
                                }
                                try {
                                    JSONObject jSONObject4 = new JSONObject(str);
                                    JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray("results");
                                    if (TextUtils.equals(AppConstants.AB_TEST_SUCCESS, jSONObject4.optString("status"))) {
                                        if (jSONArrayOptJSONArray != null) {
                                            jSONObject2 = new JSONObject();
                                            jSONObject2.put("experiments", jSONArrayOptJSONArray);
                                            jSONObject2.put("distinct_id", distinctId);
                                        } else {
                                            jSONObject2 = null;
                                        }
                                        SensorsABTestCacheManager.getInstance().loadExperimentsFromCache(jSONObject2 != null ? jSONObject2.toString() : "");
                                    }
                                } catch (JSONException e12) {
                                    SALog.printStackTrace(e12);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            SALog.m68589i(TAG, "mWebView is null");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public SensorsABTestH5Helper(WeakReference<View> weakReference, String str) {
        this.mWebView = weakReference;
        this.mMessage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void invokeWebViewLoad(View view, String str, Object[] objArr, Class[] clsArr) {
        try {
            view.getClass().getMethod(str, clsArr).invoke(view, objArr);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String string2Base64(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }
}

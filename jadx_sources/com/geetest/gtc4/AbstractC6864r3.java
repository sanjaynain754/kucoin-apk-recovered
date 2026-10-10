package com.geetest.gtc4;

import android.content.Context;
import android.util.Pair;
import com.tencent.bugly.proguard.C33820nf;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.gtc4.r3 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6864r3 {
    /* JADX INFO: renamed from: a */
    public static GeeGuardReceipt m12707a(Context context, String str, String str2) {
        if (context == null || str == null) {
            return null;
        }
        String data = Core.getData(context.getApplicationContext(), new GeeGuardConfiguration.Builder().setAppId(str).addSignature(str2).build());
        String string = context.getSharedPreferences("gt_core", 0).getString("gt_gid3", null);
        GeeGuardReceipt geeGuardReceipt = new GeeGuardReceipt();
        geeGuardReceipt.geeToken = data;
        geeGuardReceipt.geeID = string;
        geeGuardReceipt.appID = str;
        if (string != null && !string.isEmpty()) {
            String[] strArrSplit = string.split(C33820nf.f71144W);
            if (strArrSplit.length == 4) {
                geeGuardReceipt.geeIDTimestamp = strArrSplit[1];
            }
        }
        return geeGuardReceipt;
    }

    /* JADX INFO: renamed from: a */
    public static void m12708a(Context context, String str, String str2, int i11, String str3, GeeGuard.CallbackHandler callbackHandler) {
        if (context == null) {
            AbstractC6846p3.m12691a("Context is null", new IllegalArgumentException("Context is null"));
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-200, null);
                return;
            }
            return;
        }
        if (str == null) {
            AbstractC6846p3.m12691a("Empty App ID", new IllegalArgumentException("Empty App ID"));
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-200, null);
                return;
            }
            return;
        }
        GeeGuardReceipt geeGuardReceiptM12707a = m12707a(context, str, str2);
        if (geeGuardReceiptM12707a == null) {
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-200, null);
                return;
            }
            return;
        }
        C6714a6 c6714a6 = new C6714a6();
        c6714a6.f11307a.put("API-Version", "1");
        c6714a6.f11307a.put("AppID", str);
        c6714a6.f11307a.put("GeeID", geeGuardReceiptM12707a.geeID);
        c6714a6.f11307a.put("Client-Type", "1");
        c6714a6.f11309c = geeGuardReceiptM12707a.geeToken;
        c6714a6.f11308b = str3;
        Pair pairM12614a = AbstractC6723b6.m12614a(c6714a6, i11);
        if (((Integer) pairM12614a.first).intValue() != 200) {
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-300, geeGuardReceiptM12707a);
                return;
            }
            return;
        }
        geeGuardReceiptM12707a.originalResponse = (String) pairM12614a.second;
        try {
            JSONObject jSONObject = new JSONObject((String) pairM12614a.second);
            if (jSONObject.getInt("code") != 0) {
                if (callbackHandler != null) {
                    callbackHandler.onCompletion(-501, geeGuardReceiptM12707a);
                }
            } else {
                geeGuardReceiptM12707a.respondedGeeToken = jSONObject.getJSONObject("data").getString("gee_token");
                if (callbackHandler != null) {
                    callbackHandler.onCompletion(200, geeGuardReceiptM12707a);
                }
            }
        } catch (JSONException e11) {
            AbstractC6846p3.m12691a(String.valueOf(-15), e11);
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-500, geeGuardReceiptM12707a);
            }
        }
    }
}

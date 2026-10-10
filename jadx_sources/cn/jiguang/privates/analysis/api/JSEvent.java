package cn.jiguang.privates.analysis.api;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JSEvent {
    private static final String TAG = "JSEvent";

    @JavascriptInterface
    public void onEvent(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JCommonLog.m5431e(TAG, "onEvent eventJson can't be null, please check it");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("event_name");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JAnalysisConstants.EVENT_ATTRIBUTES);
            Event event = new Event(strOptString);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    event.putExtraAttr(next, jSONObjectOptJSONObject.opt(next));
                }
            }
            JAnalysisPrivatesApi.onEvent(JGlobal.context, event);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onEvent failed " + th2.getMessage());
        }
    }
}

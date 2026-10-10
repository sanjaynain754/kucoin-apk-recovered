package cn.jiguang.privates.common.component;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.utils.NotificationUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JCommonActivity extends Activity {
    private static final String TAG = "JCommonActivity";

    private void processPlatformMessage(String str) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        Bundle bundleConvertJsonToBundle;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JCommonLog.m5430d(TAG, "platformMessageJson:" + JCommonLog.toLogString(jSONObject));
            String messageId = NotificationUtil.getMessageId(jSONObject);
            byte bOptInt = (byte) jSONObject.optInt("rom_type");
            if (jSONObject.has("m_content")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("m_content");
                strOptString3 = jSONObjectOptJSONObject.optString("n_title");
                strOptString = jSONObjectOptJSONObject.optString("n_content");
                strOptString2 = jSONObjectOptJSONObject.optString("n_intent_uri");
                bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObjectOptJSONObject.optJSONObject("n_extras"));
            } else {
                String strOptString4 = jSONObject.optString("n_title");
                strOptString = jSONObject.optString("n_content");
                strOptString2 = jSONObject.optString("n_intent_uri");
                Bundle bundleConvertJsonToBundle2 = NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("n_extras"));
                strOptString3 = strOptString4;
                bundleConvertJsonToBundle = bundleConvertJsonToBundle2;
            }
            NotificationMessage intentUri = new NotificationMessage().setMessageId(messageId).setPlatform(bOptInt).setTitle(strOptString3).setContent(strOptString).setExtras(bundleConvertJsonToBundle).setIntentUri(strOptString2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", intentUri);
            JPushPrivatesApi.init(getApplicationContext());
            JCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3003, bundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processPlatformMessage failed " + th2.getMessage());
        }
    }

    private void processIntent(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            String string = "";
            if (intent.getData() != null) {
                string = intent.getData().toString();
            }
            if (TextUtils.isEmpty(string) && intent.getExtras() != null) {
                string = extras.getString("JMessageExtra");
            }
            if (TextUtils.isEmpty(string)) {
                JCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), Integer.parseInt(intent.getAction()), extras);
            } else {
                processPlatformMessage(string);
            }
            finish();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processIntent failed " + th2.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent(getIntent());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent);
    }
}

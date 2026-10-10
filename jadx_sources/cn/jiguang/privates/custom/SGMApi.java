package cn.jiguang.privates.custom;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class SGMApi {
    private static final String TAG = "SGMApi";
    public static final int TYPE_NOTIFICATION_ARRIVED = 9000;
    public static final int TYPE_NOTIFICATION_CLICKED = 9001;

    public static void report(Context context, int i11, String str) {
        try {
            if (context == null) {
                JCommonLog.m5431e(TAG, "report context can't be null, please check it");
                return;
            }
            if (i11 != 9000 && i11 != 9001) {
                JCommonLog.m5431e(TAG, "report type is invalid, please check it");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                JCommonLog.m5431e(TAG, "report messageId can't be empty, please check it");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", str);
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, i11);
            report(context, "sgm_msg_status", jSONObject);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "report failed " + th2.getMessage());
        }
    }

    public static void report(Context context, String str, JSONObject jSONObject) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "report context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "report type can't be empty, please check it");
            return;
        }
        if (jSONObject == null) {
            JCommonLog.m5431e(TAG, "report contentJson can't be null, please check it");
            return;
        }
        JReporter content = new JReporter().setType(str).setContent(jSONObject.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("protocol", content);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle);
    }
}

package cn.jiguang.privates.push.business.message.custom;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.api.CustomMessage;
import cn.jiguang.privates.push.business.message.JMessageBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.utils.NotificationUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JCustomBusiness extends JMessageBusiness {
    private static final String TAG = "JCustomBusiness";
    private static volatile JCustomBusiness instance;

    public static JCustomBusiness getInstance() {
        if (instance == null) {
            synchronized (JCustomBusiness.class) {
                instance = new JCustomBusiness();
            }
        }
        return instance;
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void onMessage(Context context, Bundle bundle) {
        try {
            String string = bundle.getString("message");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("ad_id");
            if (TextUtils.isEmpty(strOptString)) {
                JCommonLog.m5430d(TAG, "customMessage's messageId is null, can't callback this custom");
                return;
            }
            String strOptString2 = jSONObject.optString("title");
            String strOptString3 = jSONObject.optString("message");
            if (TextUtils.isEmpty(strOptString3)) {
                JCommonLog.m5430d(TAG, "customMessage's content is null, can't callback this custom");
                return;
            }
            CustomMessage extras = new CustomMessage().setMessageId(strOptString).setTitle(strOptString2).setContent(strOptString3).setContentType(jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("extras")));
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", extras);
            JCommonPrivatesApi.sendMessageToMainProcess(context, 3001, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void processMainMessage(Context context, int i11, Bundle bundle) {
        JCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(CustomMessage.class.getClassLoader());
            CustomMessage customMessage = (CustomMessage) bundle.getParcelable("message");
            if (customMessage != null && (commonReceiver = JGlobal.getCommonReceiver(context)) != null) {
                commonReceiver.onCustomMessage(context, customMessage);
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED, bundle);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processMainMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
        int i12;
        try {
            bundle.setClassLoader(CustomMessage.class.getClassLoader());
            CustomMessage customMessage = (CustomMessage) bundle.getParcelable("message");
            if (customMessage == null) {
                return;
            }
            JCommonLog.m5430d(TAG, "onCustomMessage");
            String str = "msg_status";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", customMessage.getMessageId());
            if (customMessage.getPlatform() != 0) {
                str = "third_msg_status";
                jSONObject.put("sdk_type", (int) customMessage.getPlatform());
                jSONObject.put("tmsg_id", customMessage.getPlatformMessageId());
                i12 = JPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE;
            } else {
                i12 = JPushConstants.MainWhat.REPORT_MESSAGE_STATE;
            }
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, 1018);
            JReporter content = new JReporter().setType(str).setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("protocol", content);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString(JPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            JCommonPrivatesApi.sendMessageToMainProcess(context, i12, bundle3);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processRemoteMessage failed " + th2.getMessage());
        }
    }
}

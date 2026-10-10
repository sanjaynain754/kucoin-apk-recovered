package cn.jiguang.privates.push.business.message;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.JPush;
import cn.jiguang.privates.push.business.message.custom.JCustomBusiness;
import cn.jiguang.privates.push.business.message.notification.JNotificationBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.protocol.JPushProtocol;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JMessageBusiness {
    private static final int FLAG_NOTIFICATION = 1;
    private static final int FLAG_TRANSMISSION = 0;
    private static final String TAG = "JMessage";
    private static final int TYPE_NOTIFICATION_AND_TRANSMISSION = 4;
    private static volatile JMessageBusiness instance;

    public static JMessageBusiness getInstance() {
        if (instance == null) {
            synchronized (JMessageBusiness.class) {
                instance = new JMessageBusiness();
            }
        }
        return instance;
    }

    public void onMessage(Context context, Bundle bundle) {
        JSONObject jSONObjectOptJSONObject;
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(((JProtocol) bundle.getParcelable("protocol")).getBody());
            byte b11 = byteBufferWrap.get();
            long j11 = byteBufferWrap.getLong();
            LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(StringUtil.getTlv2(byteBufferWrap)));
            String line = lineNumberReader.readLine();
            String line2 = lineNumberReader.readLine();
            String line3 = lineNumberReader.readLine();
            if (!TextUtils.equals(line, context.getPackageName())) {
                JCommonLog.m5433w(TAG, "the message applicationId is [" + line + "]");
                return;
            }
            if (!TextUtils.equals(line2, JGlobal.getAppKey(context))) {
                JCommonLog.m5433w(TAG, "the message applicationKey is [" + line2 + "]");
                return;
            }
            if (TextUtils.isEmpty(line3)) {
                JCommonLog.m5433w(TAG, "the message is empty");
                return;
            }
            JSONObject jSONObject = new JSONObject(line3);
            int iOptInt = jSONObject.optInt("n_only");
            int iOptInt2 = jSONObject.optInt("show_type");
            processMessageReceipt(context, b11, j11);
            Bundle bundle2 = new Bundle();
            bundle2.putString("message", jSONObject.toString());
            JCommonLog.m5430d(TAG, "onMessage:" + JCommonLog.toLogString(jSONObject));
            if (jSONObject.has("geofence") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("geofence")) != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("geofenceid"))) {
                JCommonLog.m5430d(TAG, "is geofence notification");
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ADD_GEOFENCE, bundle2);
            } else if (iOptInt2 == 4) {
                JNotificationBusiness.getInstance().onMessage(context, bundle2);
                JCustomBusiness.getInstance().onMessage(context, bundle2);
            } else if (iOptInt == 1) {
                JNotificationBusiness.getInstance().onMessage(context, bundle2);
            } else if (iOptInt == 0) {
                JCustomBusiness.getInstance().onMessage(context, bundle2);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessage failed " + th2.getMessage());
        }
    }

    private void processMessageReceipt(Context context, int i11, long j11) {
        JProtocol threadName = new JProtocol().setCommand(4).setVersion(2).setBody(JPushProtocol.packageMessageBody(i11, j11)).setThreadName(JPush.THREAD_PUSH);
        Bundle bundle = new Bundle();
        bundle.putParcelable("protocol", threadName);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle);
    }

    public void processMainMessage(Context context, int i11, Bundle bundle) {
    }

    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
    }
}

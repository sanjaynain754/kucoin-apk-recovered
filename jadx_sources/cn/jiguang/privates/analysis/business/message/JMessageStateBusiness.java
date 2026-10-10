package cn.jiguang.privates.analysis.business.message;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JMessageStateBusiness {
    private static final String TAG = "JMessageStateBusiness";
    private static volatile JMessageStateBusiness instance;

    public static JMessageStateBusiness getInstance() {
        if (instance == null) {
            synchronized (JMessageStateBusiness.class) {
                instance = new JMessageStateBusiness();
            }
        }
        return instance;
    }

    public void onMessageState(Context context, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString(JPushConstants.Analysis.KEY_JSON));
            Event event = new Event("msg_status");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                event.putExtraAttr(next, jSONObject.opt(next));
            }
            JEventBusiness.getInstance().onEvent(context, event);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessageState failed " + th2.getMessage());
        }
    }

    public void onPlatformMessageState(Context context, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString(JPushConstants.Analysis.KEY_JSON));
            Event event = new Event("third_msg_status");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                event.putExtraAttr(next, jSONObject.opt(next));
            }
            JEventBusiness.getInstance().onEvent(context, event);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onPlatformMessageState failed " + th2.getMessage());
        }
    }
}

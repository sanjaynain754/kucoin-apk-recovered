package cn.jiguang.privates.push.business.operation;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes34.dex */
public class JOperationBusiness {
    private static final String TAG = "JOperationBusiness";
    protected static final String TAG_ALIAS_REGEX = "^[一-龥0-9a-zA-Z_!@#$&*+=.|]";
    private static ConcurrentLinkedQueue<Long> tagAliasSequence = new ConcurrentLinkedQueue<>();
    private static volatile JOperationBusiness instance = null;

    public static JOperationBusiness getInstance() {
        if (instance == null) {
            synchronized (JOperationBusiness.class) {
                instance = new JOperationBusiness();
            }
        }
        return instance;
    }

    public int checkTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (tagAliasSequence.size() < 10) {
            tagAliasSequence.offer(Long.valueOf(jCurrentTimeMillis));
            return 0;
        }
        long jLongValue = jCurrentTimeMillis - tagAliasSequence.element().longValue();
        if (jLongValue < 0) {
            tagAliasSequence.clear();
            JCommonLog.m5433w(TAG, "set tags/alias failed, time shaft error，please try again");
            return JPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        if (jLongValue > 10000) {
            while (tagAliasSequence.size() >= 10) {
                tagAliasSequence.poll();
            }
            tagAliasSequence.offer(Long.valueOf(jCurrentTimeMillis));
            return 0;
        }
        JCommonLog.m5433w(TAG, "set tags/alias too soon, over 10 times in 10s");
        return JPushPrivatesApi.Code.INVOKE_TOO_SOON;
    }

    public void processMainMessage(Context context, int i11, Bundle bundle) {
    }

    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
    }
}

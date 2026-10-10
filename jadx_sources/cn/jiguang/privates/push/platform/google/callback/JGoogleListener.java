package cn.jiguang.privates.push.platform.google.callback;

import android.content.Context;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.platform.google.business.JGoogleBusiness;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class JGoogleListener implements OnCompleteListener<String> {
    private static final String TAG = "JGoogleListener";
    private final Context context;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<String> task) {
        if (task == null) {
            JCommonLog.m5430d(TAG, "onTokenFailed");
            JGoogleBusiness.getInstance().onNode(this.context, 3003, 0, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            return;
        }
        if (!task.isSuccessful()) {
            JCommonLog.m5430d(TAG, "onTokenFailed " + task.getException());
            JGoogleBusiness.getInstance().onNode(this.context, 3003, 0, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            return;
        }
        String result = task.getResult();
        if (TextUtils.isEmpty(result)) {
            JCommonLog.m5430d(TAG, "onTokenFailed:get token is empty");
            JGoogleBusiness.getInstance().onNode(this.context, 3003, 0, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            return;
        }
        JCommonLog.m5430d(TAG, "onTokenSuccess:get token is " + result);
        JGoogleBusiness.getInstance().onToken(this.context, result, 1);
    }

    public JGoogleListener(Context context) {
        this.context = context;
    }
}

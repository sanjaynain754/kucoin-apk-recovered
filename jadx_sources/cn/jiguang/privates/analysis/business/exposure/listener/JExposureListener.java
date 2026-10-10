package cn.jiguang.privates.analysis.business.exposure.listener;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ViewTreeObserver;
import cn.jiguang.privates.analysis.JAnalysis;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;

/* JADX INFO: loaded from: classes34.dex */
@TargetApi(16)
public class JExposureListener implements ViewTreeObserver.OnDrawListener {
    private Context context;
    private long lastDrawTime;

    public JExposureListener(Context context) {
        this.context = context;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastDrawTime < 100) {
            JCommonPrivatesApi.removeMessages(this.context, JAnalysis.THREAD_ANALYSIS, 4005);
        }
        this.lastDrawTime = jCurrentTimeMillis;
        JCommonPrivatesApi.sendMessage(this.context, JAnalysis.THREAD_ANALYSIS, 4005, null);
    }
}

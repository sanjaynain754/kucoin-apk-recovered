package cn.jiguang.privates.push.platform.google;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.push.platform.google.business.JGoogleBusiness;

/* JADX INFO: loaded from: classes.dex */
public class JGoogle extends JObserver {
    private static final String THREAD_PLATFORM = "JIGUANG-PRIVATES-PLATFORM-8";

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        JCommonPrivatesApi.sendMessage(context, THREAD_PLATFORM, i11, bundle);
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String[] getThreadName() {
        return new String[]{THREAD_PLATFORM};
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleMessage(Context context, int i11, Bundle bundle) {
        if (i11 != 3101) {
            return;
        }
        JGoogleBusiness.getInstance().init(context);
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSupport(int i11) {
        return i11 == 3101;
    }
}

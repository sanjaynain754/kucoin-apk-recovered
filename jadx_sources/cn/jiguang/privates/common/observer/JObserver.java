package cn.jiguang.privates.common.observer;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class JObserver {
    public abstract void dispatchMessage(Context context, int i11, Bundle bundle);

    public short getSdkFlag() {
        return (short) 0;
    }

    public String getSdkName() {
        return null;
    }

    public int getSdkPriority() {
        return 0;
    }

    public String getSdkVersion() {
        return null;
    }

    public String[] getThreadName() {
        return new String[0];
    }

    public boolean isSdk() {
        return false;
    }

    public abstract boolean isSupport(int i11);

    public void handleDelayMessage(Context context, int i11, Bundle bundle) {
    }

    public void handleMessage(Context context, int i11, Bundle bundle) {
    }
}

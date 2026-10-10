package com.tencent.bugly.proguard;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.memory.leakdetect.ActivityLeakSolution;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33968v0 extends AbstractC33596d1 {

    /* JADX INFO: renamed from: c */
    public static final String f72284c = "RMonitor_MemoryLeak_BaseActivityWatcher";

    public AbstractC33968v0(C33565bc c33565bc) {
        super(c33565bc);
    }

    /* JADX INFO: renamed from: a */
    public void m75222a(@NonNull Activity activity) {
        ActivityLeakSolution.fixInputMethodManagerLeak(activity);
        ActivityLeakSolution.fixAudioManagerLeak(activity);
        try {
            this.f69484b.m72507c(activity, "");
        } catch (Exception e11) {
            Logger.INSTANCE.exception(f72284c, e11);
        }
    }
}

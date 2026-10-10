package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.mc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 26)
public final class C33796mc extends C33754kc implements WindowOnFrameMetricsAvailableListenerC33665g7.a {

    /* JADX INFO: renamed from: j */
    public WindowOnFrameMetricsAvailableListenerC33665g7 f70958j;

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: a */
    public boolean mo73805a(String str, long j11) {
        boolean zMo73805a = super.mo73805a(str, j11);
        if (zMo73805a) {
            if (this.f70958j == null) {
                this.f70958j = new WindowOnFrameMetricsAvailableListenerC33665g7(this, new Handler(Looper.getMainLooper()));
            }
            this.f70958j.m73160a();
        }
        return zMo73805a;
    }

    @Override // com.tencent.bugly.proguard.C33754kc
    /* JADX INFO: renamed from: g */
    public boolean mo73812g() {
        WindowOnFrameMetricsAvailableListenerC33665g7 windowOnFrameMetricsAvailableListenerC33665g7;
        boolean zMo73812g = super.mo73812g();
        if (zMo73812g && (windowOnFrameMetricsAvailableListenerC33665g7 = this.f70958j) != null) {
            windowOnFrameMetricsAvailableListenerC33665g7.m73162b();
        }
        return zMo73812g;
    }

    @Override // com.tencent.bugly.proguard.WindowOnFrameMetricsAvailableListenerC33665g7.a
    /* JADX INFO: renamed from: a */
    public void mo73165a(C33644f7 c33644f7) {
        if (!this.f70646c || c33644f7 == null) {
            return;
        }
        m73807b(c33644f7);
    }
}

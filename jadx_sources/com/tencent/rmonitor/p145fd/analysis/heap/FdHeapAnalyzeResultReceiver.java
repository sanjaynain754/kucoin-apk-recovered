package com.tencent.rmonitor.p145fd.analysis.heap;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.bugly.proguard.C33559b6;
import com.tencent.bugly.proguard.C33648fb;
import com.tencent.bugly.proguard.InterfaceC33936t8;
import java.util.ArrayList;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class FdHeapAnalyzeResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: c */
    public static final String f75265c = "RMonitor_FdLeak_FdHeapAnalyzeResultReceiver";

    /* JADX INFO: renamed from: b */
    public final InterfaceC33936t8 f75266b;

    public FdHeapAnalyzeResultReceiver(InterfaceC33936t8 interfaceC33936t8) {
        super(new Handler(Looper.myLooper()));
        this.f75266b = interfaceC33936t8;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i11, Bundle bundle) {
        C33648fb.m73044c(f75265c, "onReceiveResult: resultCode=" + i11);
        if (this.f75266b == null) {
            C33648fb.m73045d(f75265c, "onReceiveResult: listener == null");
            return;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable(C33559b6.f69150d);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f75266b.m75048a(i11, bundle.getString(C33559b6.f69151e), arrayList);
    }
}

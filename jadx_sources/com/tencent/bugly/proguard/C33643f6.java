package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.rmonitor.sla.AttaEvent;
import com.tencent.rmonitor.sla.AttaEventReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33643f6 implements InterfaceC34036y8, IReporter.ReportCallback {

    /* JADX INFO: renamed from: j */
    public static final String f69854j = "RMFdLeakEvent";

    /* JADX INFO: renamed from: k */
    public static final String f69855k = "fd_dump_start";

    /* JADX INFO: renamed from: l */
    public static final String f69856l = "fd_dump_finish";

    /* JADX INFO: renamed from: m */
    public static final String f69857m = "fd_analyze_start";

    /* JADX INFO: renamed from: n */
    public static final String f69858n = "fd_analyze_finish";

    /* JADX INFO: renamed from: o */
    public static final String f69859o = "fd_analyze_result";

    /* JADX INFO: renamed from: p */
    public static final String f69860p = "fd_upload_start";

    /* JADX INFO: renamed from: q */
    public static final String f69861q = "fd_upload_result";

    /* JADX INFO: renamed from: r */
    public static final String f69862r = "fd_heap_dump_fail";

    /* JADX INFO: renamed from: s */
    public static final String f69863s = "fd_monitor_start";

    /* JADX INFO: renamed from: t */
    public static final int f69864t = 810;

    /* JADX INFO: renamed from: u */
    public static final int f69865u = 820;

    /* JADX INFO: renamed from: i */
    public final String f69866i;

    public C33643f6() {
        this("");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34036y8
    /* JADX INFO: renamed from: a */
    public ArrayList<String> mo73003a(int i11, int i12) {
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34036y8
    /* JADX INFO: renamed from: b */
    public void mo73007b(int i11) {
        m73001a(f69863s, String.valueOf(i11));
    }

    public C33643f6(String str) {
        this.f69866i = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m73001a(String... strArr) {
        if (C33868q0.a.f71513a.m74637a(f69854j)) {
            AttaEvent attaEvent = new AttaEvent();
            attaEvent.setEventCode(f69854j);
            attaEvent.setParams(strArr);
            AttaEventReporter.INSTANCE.getInstance().addEvent(attaEvent);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33916s8
    /* JADX INFO: renamed from: b */
    public void mo73006b() {
        m73001a(f69857m);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33996w8
    /* JADX INFO: renamed from: c */
    public void mo73008c(int i11) {
        m73001a(f69855k, String.valueOf(i11));
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onBlocked(int i11) {
        m73001a(f69861q, this.f69866i, String.valueOf(f69865u), "");
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onCached() {
        m73001a(f69861q, this.f69866i, String.valueOf(f69864t), "");
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onFailure(int i11, @NotNull String str, int i12, int i13) {
        m73001a(f69861q, this.f69866i, String.valueOf(i11), str);
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onSuccess(int i11, int i12) {
        m73001a(f69861q, this.f69866i, String.valueOf(0), "");
    }

    /* JADX INFO: renamed from: b */
    public static void m73002b(String str) {
        m73001a(f69860p, str);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33916s8
    /* JADX INFO: renamed from: a */
    public void mo73005a(C33748k6 c33748k6) {
        m73001a(f69858n, String.valueOf(c33748k6.m73725h()), String.valueOf(c33748k6.m74910a()), c33748k6.m74913b());
        if (c33748k6.m74914c()) {
            Map<String, C33727j6> mapM73721d = c33748k6.m73721d();
            Iterator<String> it = mapM73721d.keySet().iterator();
            while (it.hasNext()) {
                C33727j6 c33727j6 = mapM73721d.get(it.next());
                List<C33973v5> listM73525a = c33727j6.m73525a();
                if (listM73525a != null) {
                    c33727j6.m73526a(listM73525a.subList(0, listM73525a.size() < 10 ? listM73525a.size() : 10));
                }
            }
            m73001a(f69859o, C33914s6.m74915b(c33748k6.m73725h()), String.valueOf(c33748k6.m73722e()), C33657g.m73094e(), "", "", "", c33748k6.m73724g().toString() + "," + c33748k6.m73726i().toString());
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33996w8
    /* JADX INFO: renamed from: a */
    public void mo73004a(int i11, C33706i6 c33706i6) {
        if (i11 == 3) {
            m73001a(f69856l, String.valueOf(c33706i6.m73348g()), String.valueOf(c33706i6.m74910a()), c33706i6.m74913b(), String.valueOf(c33706i6.m73346e()), String.valueOf(C33712ic.m73402a()));
        } else {
            m73001a(f69856l, String.valueOf(c33706i6.m73348g()), String.valueOf(c33706i6.m74910a()), c33706i6.m74913b());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73000a(int i11, boolean z11, String str) {
        m73001a(f69862r, String.valueOf(i11), String.valueOf(z11), str);
    }
}

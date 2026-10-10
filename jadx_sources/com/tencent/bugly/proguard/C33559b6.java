package com.tencent.bugly.proguard;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.rmonitor.p145fd.utils.SharkAnalysisUtil;
import com.tencent.rmonitor.p145fd.utils.SharkUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.b6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33559b6 {

    /* JADX INFO: renamed from: a */
    public static final String f69147a = "RMonitor_FdLeak_FdHeapAnalyzeHelper";

    /* JADX INFO: renamed from: b */
    public static final String f69148b = "key_hprof_data";

    /* JADX INFO: renamed from: c */
    public static final String f69149c = "key_result_receiver";

    /* JADX INFO: renamed from: d */
    public static final String f69150d = "key_analyze_result";

    /* JADX INFO: renamed from: e */
    public static final String f69151e = "key_analyze_error_message";

    /* JADX INFO: renamed from: a */
    public static void m72479a(C33706i6 c33706i6, ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            C33648fb.m73043b(f69147a, "onHandleIntent, result receiver is null.");
            return;
        }
        Bundle bundle = new Bundle();
        if (c33706i6 == null) {
            C33648fb.m73043b(f69147a, "onHandleIntent, result is null.");
            resultReceiver.send(8, bundle);
            return;
        }
        C33648fb.m73044c(f69147a, "runAnalysis.");
        C33580c6 c33580c6M72480b = m72480b(c33706i6);
        c33706i6.m73344a(c33580c6M72480b);
        bundle.putString(f69151e, c33706i6.m74913b());
        if (c33580c6M72480b == null) {
            resultReceiver.send(c33706i6.m74910a(), bundle);
        } else {
            bundle.putSerializable(f69150d, m72478a(c33706i6));
            resultReceiver.send(0, bundle);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C33580c6 m72480b(C33706i6 c33706i6) {
        try {
            return SharkUtil.getHprofHeapGraph(new File(c33706i6.m73347f()));
        } catch (OutOfMemoryError e11) {
            C33648fb.m73043b(f69147a, "parse hprof failed due to OOM: " + e11.getMessage());
            c33706i6.m74911a(7);
            c33706i6.m74912a(e11.getMessage());
            return null;
        } catch (Throwable th2) {
            C33648fb.m73043b(f69147a, "parse hprof failed due to exception: " + th2.getMessage());
            c33706i6.m74911a(6);
            c33706i6.m74912a(th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<C33727j6> m72478a(C33706i6 c33706i6) {
        ArrayList<C33727j6> arrayList = new ArrayList<>();
        if (AbstractC34028y0.m75470b(c33706i6)) {
            InterfaceC33956u8[] interfaceC33956u8ArrM72926a = C33622e6.m72926a();
            HashMap map = new HashMap(interfaceC33956u8ArrM72926a.length);
            for (InterfaceC33956u8 interfaceC33956u8 : interfaceC33956u8ArrM72926a) {
                map.put(interfaceC33956u8.mo72308a(), m72477a(interfaceC33956u8, c33706i6));
            }
            C33580c6 c33580c6 = (C33580c6) c33706i6.m73345d();
            Map<Long, String> mapFindPathsFromGcRoots = SharkAnalysisUtil.findPathsFromGcRoots(c33580c6.m72650a(), c33580c6.m72652b());
            for (InterfaceC33956u8 interfaceC33956u9 : interfaceC33956u8ArrM72926a) {
                C33727j6 c33727j6 = (C33727j6) map.get(interfaceC33956u9.mo72308a());
                if (c33727j6 != null) {
                    interfaceC33956u9.mo72281a(c33580c6, c33727j6, mapFindPathsFromGcRoots);
                    arrayList.add(c33727j6);
                }
                C33648fb.m73044c(f69147a, "onAnalyzeFinished: " + c33727j6);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static C33727j6 m72477a(InterfaceC33956u8 interfaceC33956u8, C33706i6 c33706i6) {
        try {
            return interfaceC33956u8.mo75291a(c33706i6);
        } catch (Throwable th2) {
            C33648fb.m73043b(f69147a, "pre analyze failed, type=" + interfaceC33956u8.mo72308a() + ": " + th2.getMessage());
            return null;
        }
    }
}

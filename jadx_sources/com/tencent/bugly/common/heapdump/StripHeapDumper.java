package com.tencent.bugly.common.heapdump;

import android.os.Debug;
import android.os.Handler;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.proguard.C33895r7;
import com.tencent.bugly.proguard.InterfaceC33604d9;
import com.tencent.bugly.proguard.InterfaceC33625e9;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class StripHeapDumper implements InterfaceC33625e9 {

    /* JADX INFO: renamed from: l */
    public static final String f68492l = "RMonitor_Heap_StripHeapDumper";

    /* JADX INFO: renamed from: m */
    public static boolean f68493m;

    /* JADX INFO: renamed from: n */
    public static final String[] f68494n = {".*/librmonitor_memory.so$", ".*/libBugly_Native.so$"};

    /* JADX INFO: renamed from: o */
    public static final Map<String, String[]> f68495o;

    /* JADX INFO: renamed from: k */
    public Handler f68496k;

    private static native void nDisableHprofStrip();

    private static native void nEnableHprofStrip(String str);

    private static native void nSetHprofStripConfig(int i11);

    private static native void nSetIgnoreHookSo(String str);

    private static native void nSetRegisterHookSo(String str, String str2);

    /* JADX INFO: renamed from: a */
    public void m72148a(C33895r7 c33895r7) {
        if (c33895r7.m74801d() && m72155c()) {
            nDisableHprofStrip();
            m72147a(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public Handler m72153b() {
        if (this.f68496k == null) {
            this.f68496k = new Handler(ThreadManager.getMonitorThreadLooper());
        }
        return this.f68496k;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.common.heapdump.StripHeapDumper$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class C33507a {

        /* JADX INFO: renamed from: a */
        public boolean f68497a;

        /* JADX INFO: renamed from: b */
        public IOException f68498b;

        public C33507a(boolean z11, IOException iOException) {
            this.f68497a = z11;
            this.f68498b = iOException;
        }
    }

    static {
        HashMap map = new HashMap(2);
        f68495o = map;
        map.put(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, new String[]{"libart.so"});
        map.put("write", new String[]{"libc.so", "libart.so", "libbase.so", "libartbase.so"});
        f68493m = FileUtil.loadLibrary("rmonitor_base");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72155c() {
        return f68493m && AndroidVersion.isOverM();
    }

    /* JADX INFO: renamed from: a */
    public void m72152a(String str, C33895r7 c33895r7, C33507a c33507a) {
        m72154b(str, c33895r7);
        m72151a(str, c33507a);
        m72148a(c33895r7);
    }

    /* JADX INFO: renamed from: b */
    public void m72154b(String str, C33895r7 c33895r7) {
        if (c33895r7.m74801d() && m72155c()) {
            m72150a(str);
            m72147a(c33895r7.m74800c());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72151a(String str, C33507a c33507a) {
        try {
            Debug.dumpHprofData(str);
            c33507a.f68497a = true;
            c33507a.f68498b = null;
        } catch (IOException e11) {
            c33507a.f68497a = false;
            c33507a.f68498b = e11;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72149a(C33895r7 c33895r7, Exception exc) {
        InterfaceC33604d9 interfaceC33604d9M74799b = c33895r7.m74799b();
        if (interfaceC33604d9M74799b != null) {
            interfaceC33604d9M74799b.mo72779a(exc);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72150a(String str) {
        nSetRegisterHookSo("libart.so", TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
        nSetRegisterHookSo("libc.so", "write");
        nSetRegisterHookSo("libart.so", "write");
        nSetRegisterHookSo("libbase.so", "write");
        nSetRegisterHookSo("libartbase.so", "write");
        nSetIgnoreHookSo(".*/librmonitor_memory.so$");
        nSetIgnoreHookSo(".*/libBugly-rqd.so$");
        nEnableHprofStrip(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m72147a(int i11) {
        if (f68493m) {
            nSetHprofStripConfig(i11);
        }
    }
}

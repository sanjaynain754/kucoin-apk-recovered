package com.tencent.rmonitor.p145fd;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33589cf;
import com.tencent.bugly.proguard.C33648fb;
import com.tencent.bugly.proguard.C33664g6;
import com.tencent.bugly.proguard.C33704i4;
import com.tencent.bugly.proguard.C33787m3;
import com.tencent.bugly.proguard.C33809n4;
import com.tencent.bugly.proguard.C33811n6;
import com.tencent.bugly.proguard.C33832o6;
import com.tencent.bugly.proguard.C33865pi;
import com.tencent.bugly.proguard.C33899rb;
import com.tencent.bugly.proguard.C33914s6;
import com.tencent.bugly.proguard.C33915s7;
import com.tencent.bugly.proguard.C33960uc;
import com.tencent.bugly.proguard.C33981vd;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.bugly.proguard.InterfaceC34036y8;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.p145fd.hook.FdOpenStackManager;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class FdLeakMonitor extends QAPMMonitorPlugin implements Handler.Callback {

    /* JADX INFO: renamed from: h */
    public static final String f75244h = "RMonitor_FdLeak_Monitor";

    /* JADX INFO: renamed from: i */
    public static final long f75245i = 90000;

    /* JADX INFO: renamed from: j */
    public static final int f75246j = 10000;

    /* JADX INFO: renamed from: k */
    public static final int f75247k = 30000;

    /* JADX INFO: renamed from: l */
    public static final int f75248l = 5;

    /* JADX INFO: renamed from: m */
    public static final long f75249m = 30000;

    /* JADX INFO: renamed from: n */
    public static final int f75250n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f75251o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f75252p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f75253q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f75254r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f75255s = 4;

    /* JADX INFO: renamed from: t */
    public static final int f75256t = 5;

    /* JADX INFO: renamed from: u */
    public static final int f75257u = 6;

    /* JADX INFO: renamed from: b */
    public final C33809n4 f75258b;

    /* JADX INFO: renamed from: c */
    public final Handler f75259c;

    /* JADX INFO: renamed from: d */
    public final C33811n6 f75260d;

    /* JADX INFO: renamed from: e */
    public final C33832o6 f75261e;

    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor[] f75262f;

    /* JADX INFO: renamed from: g */
    public long f75263g;

    /* JADX INFO: renamed from: com.tencent.rmonitor.fd.FdLeakMonitor$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class C35155b {

        /* JADX INFO: renamed from: a */
        public static final FdLeakMonitor f75264a = new FdLeakMonitor();
    }

    public static native boolean nEnableLeakDetectThisTime(boolean z11);

    public static native void nInitLeakDetectInNative(int i11, int i12);

    /* JADX INFO: renamed from: a */
    public boolean m77165a(InterfaceC34036y8 interfaceC34036y8) {
        if (m77167c()) {
            C33648fb.m73043b(f75244h, "dump heap exception too many times.");
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73007b(3);
            }
            return false;
        }
        if (!C33664g6.m73156f() || !C33787m3.m74030a("fd_leak", 30000L)) {
            return true;
        }
        C33648fb.m73043b(f75244h, "cannot start fd leak monitor due to too many crashes");
        if (interfaceC34036y8 != null) {
            interfaceC34036y8.mo73007b(4);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77166b(InterfaceC34036y8 interfaceC34036y8) {
        if (!AndroidVersion.isOverL() && !C33704i4.m73338a()) {
            C33648fb.m73043b(f75244h, "cannot start fd leak monitor due to not support fork dump");
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73007b(1);
            }
            return false;
        }
        if (C33915s7.m74925a() instanceof ForkJvmHeapDumper) {
            return true;
        }
        C33648fb.m73043b(f75244h, "cannot start fd leak monitor due to not have valid dumper");
        if (interfaceC34036y8 != null) {
            interfaceC34036y8.mo73007b(5);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m77168c(InterfaceC34036y8 interfaceC34036y8) {
        if (C33899rb.m74807a().m74812c()) {
            Logger.INSTANCE.mo77132i(f75244h, "start fd leak monitor fail, couldn't support x86 or x86_64 arch");
            return false;
        }
        if (C33899rb.m74807a().m74809a("fd_leak")) {
            Logger.INSTANCE.mo77132i(f75244h, "start fd monitor fail, couldn't open fd with native memory or asan same time.");
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73007b(6);
            }
            return false;
        }
        if ("fd_leak".equals(C33899rb.m74807a().m74813d())) {
            Logger.INSTANCE.mo77132i(f75244h, "prepare to start fd monitor, local sample success!");
            return true;
        }
        Logger.INSTANCE.mo77132i(f75244h, "start fd monitor failed, local sample failed!");
        if (interfaceC34036y8 != null) {
            interfaceC34036y8.mo73007b(6);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m77170d(InterfaceC34036y8 interfaceC34036y8) {
        return m77166b(interfaceC34036y8) && m77168c(interfaceC34036y8) && m77165a(interfaceC34036y8);
    }

    public FdLeakMonitor() {
        this.f75258b = new C33809n4(10000L, 10000L, 30000L);
        C33811n6 c33811n6 = new C33811n6();
        this.f75260d = c33811n6;
        this.f75261e = new C33832o6(c33811n6);
        this.f75262f = null;
        this.f75263g = 10000L;
        this.f75259c = new Handler(ThreadManager.getMonitorThreadLooper(), this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m77169d() {
        return C33914s6.m74917d() > C33664g6.m73155e();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1) {
            m77164a(false);
        }
        return true;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() throws Throwable {
        C33648fb.m73044c(f75244h, "fdLeakConfig: " + C33664g6.m73154d());
        InterfaceC34036y8 interfaceC34036y8M74430b = this.f75261e.m74430b();
        if (m77170d(interfaceC34036y8M74430b)) {
            this.f75258b.m74230b();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("fd_leak"));
            this.f75259c.removeMessages(1);
            this.f75259c.sendEmptyMessageDelayed(1, this.f75263g);
            if (C33664g6.m73156f()) {
                FdOpenStackManager.m77177a();
                if (C33664g6.m73151a()) {
                    m77162a();
                }
            }
            C33648fb.m73044c(f75244h, "fd leak monitor started.");
            if (interfaceC34036y8M74430b != null) {
                interfaceC34036y8M74430b.mo73007b(0);
            }
            C33865pi.m74602e();
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        this.f75258b.m74231c();
        C33589cf.m72692a().m72693a(C33981vd.m75302a("fd_leak"));
        this.f75259c.removeMessages(1);
        if (C33664g6.m73151a()) {
            nEnableLeakDetectThisTime(false);
        }
        if (C33664g6.m73156f()) {
            FdOpenStackManager.m77179b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static FdLeakMonitor m77161b() {
        return C35155b.f75264a;
    }

    /* JADX INFO: renamed from: a */
    public final void m77163a(FileDescriptor fileDescriptor) {
        try {
            ThreadManager.getMonitorThreadLooper().getQueue().addOnFileDescriptorEventListener(fileDescriptor, 1, new C33960uc());
        } catch (Throwable th2) {
            nEnableLeakDetectThisTime(false);
            Logger.INSTANCE.exception(f75244h, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77167c() {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        return sharedPreferences != null && sharedPreferences.getInt(InterfaceC33953u5.f72200G, 0) >= 5;
    }

    /* JADX INFO: renamed from: a */
    public final void m77162a() {
        try {
            if (AndroidVersion.isOverM()) {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                this.f75262f = parcelFileDescriptorArrCreatePipe;
                if (parcelFileDescriptorArrCreatePipe == null || parcelFileDescriptorArrCreatePipe.length != 2) {
                    return;
                }
                nInitLeakDetectInNative(C33664g6.m73155e(), this.f75262f[1].getFd());
                m77163a(this.f75262f[0].getFileDescriptor());
                nEnableLeakDetectThisTime(true);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75244h, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77164a(boolean z11) {
        StringBuilder sb2 = new StringBuilder("current fd: ");
        sb2.append(C33914s6.m74917d());
        sb2.append(", from native: ");
        sb2.append(z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        C33648fb.m73044c(f75244h, sb2.toString());
        if (m77169d()) {
            if (this.f75261e.m74431c()) {
                this.f75263g = f75245i;
            }
        } else {
            this.f75263g = this.f75258b.m74229a();
            if (C33664g6.m73151a()) {
                nEnableLeakDetectThisTime(true);
            }
        }
        this.f75259c.removeMessages(1);
        if (!PluginController.INSTANCE.canCollect("fd_leak")) {
            C33648fb.m73045d(f75244h, "fd leak can't collect, stop detect.");
            stop();
        } else {
            this.f75259c.sendEmptyMessageDelayed(1, this.f75263g);
        }
    }
}

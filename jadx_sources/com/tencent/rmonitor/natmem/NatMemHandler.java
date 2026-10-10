package com.tencent.rmonitor.natmem;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33657g;
import com.tencent.bugly.proguard.C33865pi;
import com.tencent.bugly.proguard.C33980vc;
import com.tencent.bugly.proguard.C34000wc;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.C34040yc;
import com.tencent.bugly.proguard.C34060zc;
import com.tencent.bugly.proguard.HandlerC33544ac;
import com.tencent.bugly.proguard.InterfaceC33667g9;
import com.tencent.bugly.proguard.InterfaceC33688h9;
import com.tencent.bugly.proguard.InterfaceC34037y9;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.bhook.BHookManager;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class NatMemHandler extends Handler implements InterfaceC33667g9, InterfaceC33688h9, InterfaceC34037y9 {

    /* JADX INFO: renamed from: k */
    public static final String f75276k = "RMonitor_NatMem_Handler";

    /* JADX INFO: renamed from: l */
    public static final int f75277l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f75278m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f75279n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f75280o = 2;

    /* JADX INFO: renamed from: p */
    public static final String f75281p = "sig_jmp_info_key";

    /* JADX INFO: renamed from: b */
    public long f75282b;

    /* JADX INFO: renamed from: c */
    public long f75283c;

    /* JADX INFO: renamed from: d */
    public String f75284d;

    /* JADX INFO: renamed from: e */
    public boolean f75285e;

    /* JADX INFO: renamed from: f */
    public SharedPreferences f75286f;

    /* JADX INFO: renamed from: g */
    public SharedPreferences.Editor f75287g;

    /* JADX INFO: renamed from: h */
    public long f75288h;

    /* JADX INFO: renamed from: i */
    public long f75289i;

    /* JADX INFO: renamed from: j */
    public float f75290j;

    /* JADX INFO: renamed from: com.tencent.rmonitor.natmem.NatMemHandler$a */
    /* JADX INFO: compiled from: BUGLY */
    public class RunnableC35164a implements Runnable {
        public RunnableC35164a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NatMemHandler.this.m77187a(2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.natmem.NatMemHandler$b */
    /* JADX INFO: compiled from: BUGLY */
    public class RunnableC35165b implements Runnable {
        public RunnableC35165b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NatMemHandler.this.m77187a(1);
        }
    }

    private native boolean nativeIs64Bit();

    /* JADX INFO: renamed from: b */
    public final void m77189b() throws Throwable {
        C34000wc c34000wcM77198a = NatMemMonitor.m77197b().m77198a();
        NatMemMonitor.m77197b().nativeInit();
        NatMemMonitor.m77197b().nativeInitAppHookParameter(c34000wcM77198a.m75368d());
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        this.f75286f = sharedPreferences;
        if (sharedPreferences != null) {
            this.f75287g = sharedPreferences.edit();
        }
        m77191c();
        boolean zNativeIs64Bit = nativeIs64Bit();
        this.f75285e = zNativeIs64Bit;
        if (zNativeIs64Bit) {
            this.f75282b = C34000wc.f72426u;
        } else {
            this.f75282b = C34000wc.f72427v;
        }
        this.f75283c = c34000wcM77198a.m75372h();
        String rootPath = FileUtil.getRootPath();
        if (TextUtils.isEmpty(rootPath)) {
            rootPath = C33598d3.m72772c().getDir("Tencent_RMonitor", 0).getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rootPath);
        String str = File.separator;
        sb2.append(str);
        sb2.append("NatMem");
        sb2.append(str);
        this.f75284d = sb2.toString();
        if (c34000wcM77198a.m75374j() == 4) {
            C33865pi.m74602e();
        } else {
            C33865pi.m74605i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77192c(String str) {
        if (NatMemMonitor.f75295g) {
            NatMemMonitor.m77197b().nativeDumpNatMemLeakInfo(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m77193d() {
        C34000wc c34000wcM77198a = NatMemMonitor.m77197b().m77198a();
        if (!c34000wcM77198a.m75369e()) {
            c34000wcM77198a.m75370f().add("libc.so");
        }
        Iterator<String> it = c34000wcM77198a.m75370f().iterator();
        while (it.hasNext()) {
            NatMemMonitor.m77197b().nativeIgnoreLib(it.next());
        }
        NatMemMonitor.m77197b().nativeStartHook(HandlerC33544ac.m72327l().m72328a(false), c34000wcM77198a.m75374j(), c34000wcM77198a.m75371g());
        C34060zc.m75594a();
        C33980vc.m75298a();
        HandlerC33544ac.m72327l().m72332a((InterfaceC33667g9) this);
        HandlerC33544ac.m72327l().m72333a((InterfaceC33688h9) this);
        C33657g.m73095h().m73099a(this);
        NatMemMonitor.m77197b().m77203d(C33657g.f69911j.m73106f());
    }

    /* JADX INFO: renamed from: e */
    public final void m77196e(String str) {
        if (NatMemMonitor.f75295g) {
            NatMemMonitor.m77197b().nativeDumpNatMemUsageInfo(str, HandlerC33544ac.m72327l().m72328a(false));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77188a() {
        try {
            File file = new File(this.f75284d);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileUtil.INSTANCE.deleteOvertimeFiles(this.f75284d, 259200000);
            return file.exists();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75276k, th2);
            return false;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        int i11 = message.what;
        if (i11 == 1) {
            m77189b();
        } else {
            if (i11 != 2) {
                return;
            }
            m77193d();
        }
    }

    public NatMemHandler(Looper looper) {
        super(looper);
        this.f75282b = C34000wc.f72426u;
        this.f75283c = 1073741824L;
        this.f75285e = true;
        this.f75287g = null;
        this.f75288h = 0L;
        this.f75289i = 0L;
        this.f75290j = 1.05f;
    }

    /* JADX INFO: renamed from: c */
    public final void m77191c() {
        SharedPreferences sharedPreferences = this.f75286f;
        if (sharedPreferences == null || this.f75287g == null) {
            return;
        }
        int i11 = sharedPreferences.getInt(f75281p, 0);
        if (i11 != 0) {
            C33980vc.m75299a(i11);
        }
        this.f75287g.putInt(f75281p, 0).commit();
    }

    /* JADX INFO: renamed from: e */
    public final void m77195e() {
        SharedPreferences.Editor editor;
        int iM77127a = BHookManager.m77127a();
        if (this.f75286f == null || (editor = this.f75287g) == null || iM77127a == 0) {
            return;
        }
        editor.putInt(f75281p, iM77127a).commit();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33667g9
    /* JADX INFO: renamed from: c */
    public void mo73167c(long j11) {
        m77195e();
        if (j11 <= this.f75288h * this.f75290j || j11 <= this.f75283c) {
            return;
        }
        this.f75288h = j11;
        ThreadManager.runInDumpThread(new RunnableC35164a(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m77187a(int i11) {
        if (PluginController.INSTANCE.canCollect("native_memory") && m77188a()) {
            String str = this.f75284d + "usage_" + C33591ch.m72746d() + ".json";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f75284d);
            sb2.append("mem_history_");
            String str2 = C33591ch.f69465f;
            String strM75464a = C34025xh.m75464a(sb2, str2, ".json");
            String str3 = this.f75284d + "smaps_" + str2 + ".txt";
            m77194d(str3);
            m77196e(str);
            m77190b(strM75464a);
            int i12 = 1 == i11 ? 1 : 2;
            int i13 = 1 == i11 ? 4 : 5;
            C34040yc.m75498a(str, strM75464a, str3, i12);
            C34060zc.m75597a(str, i13);
            FileUtil.deleteFile(new File(str));
            FileUtil.deleteFile(new File(strM75464a));
            FileUtil.deleteFile(new File(str3));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m77194d(String str) {
        if (NatMemMonitor.f75295g) {
            try {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileUtil.copyFile(new File("/proc/self/smaps"), file);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f75276k, th2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77190b(String str) {
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        if (!NatMemMonitor.f75295g) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("pss", HandlerC33544ac.m72327l().m72347j());
                jSONObject.put("vss", HandlerC33544ac.m72327l().m72348k());
                jSONObject.put("java_heap", HandlerC33544ac.m72327l().m72346i());
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    String string = jSONObject.toString();
                    bufferedOutputStream.write(string.getBytes(), 0, string.getBytes().length);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        Logger.INSTANCE.exception(f75276k, th2);
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } catch (Throwable th4) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th5) {
                                Logger.INSTANCE.exception(f75276k, th5);
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                bufferedOutputStream = null;
            }
        } catch (Throwable th7) {
            Logger.INSTANCE.exception(f75276k, th7);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33688h9
    /* JADX INFO: renamed from: a */
    public void mo73256a(long j11) {
        m77195e();
        if (j11 <= this.f75289i * this.f75290j || j11 <= this.f75282b || this.f75285e) {
            return;
        }
        this.f75289i = j11;
        ThreadManager.runInDumpThread(new RunnableC35165b(), 0L);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34037y9
    /* JADX INFO: renamed from: a */
    public void mo72960a(String str) {
        NatMemMonitor.m77197b().m77203d(C33657g.m73094e());
    }
}

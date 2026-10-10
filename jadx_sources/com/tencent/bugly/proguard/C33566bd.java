package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33566bd implements NativeExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final Context f69195a;

    /* JADX INFO: renamed from: b */
    public final C33724j3 f69196b;

    /* JADX INFO: renamed from: c */
    public final C33765l2 f69197c;

    /* JADX INFO: renamed from: d */
    public final C33863pg f69198d;

    /* JADX INFO: renamed from: a */
    public static String m72514a(String str, int i11, String str2) {
        if (i11 <= 0) {
            return str;
        }
        return str + "(" + str2 + ")";
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8) {
        C34012x4.m75442d("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i11, i12, j11, j12, str, str2, str3, str4, str5, i13, str6, i14, i15, i16, str7, str8, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException2(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8, String[] strArr) {
        C34012x4.m75442d("Native Crash Happen v2", new Object[0]);
        String str9 = str6;
        try {
            String strM72514a = m72514a(str, i13, str9);
            String strM72835a = C33608dd.m72835a(str3);
            Map<String, String> mapM72517a = m72517a(strArr);
            String strM72516a = m72516a(mapM72517a, this.f69197c);
            String strM72515a = m72515a(mapM72517a, i12);
            long j13 = (j11 * 1000) + (j12 / 1000);
            String str10 = mapM72517a.get("SysLogPath");
            String str11 = mapM72517a.get("JniLogPath");
            String fileParentPath = FileUtil.getFileParentPath(str5);
            if (!this.f69198d.m74583d()) {
                C34012x4.m75431a(LogState.WARN, "no remote but still store!", new Object[0]);
            }
            if (!this.f69198d.m74582c().f68568d && this.f69198d.m74583d()) {
                C34012x4.m75431a(LogState.ERROR, "crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C33724j3.m73469a("NATIVE_CRASH", C33571bi.m72572a(), strM72516a, strM72515a, strM72514a + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + strM72835a, null);
                FileUtil.deleteFile(fileParentPath);
                return;
            }
            if (i13 > 0) {
                str9 = "KERNEL";
            }
            CrashDetailBean crashDetailBeanPackageCrashBasicDatas = packageCrashBasicDatas(strM72515a, j13, strM72514a, str2, strM72835a, str4, str9, m72512a(i13, i14), str5, str10, str11, str8);
            if (crashDetailBeanPackageCrashBasicDatas == null) {
                try {
                    C34012x4.m75431a(LogState.ERROR, "pkg crash datas fail!", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (C34012x4.m75432a(LogState.WARN, th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
            packageCrashDetailDatas(crashDetailBeanPackageCrashBasicDatas, strM72516a, null, null, true, -1L, -1L, -1L, -1L);
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_6.ordinal(), false);
            C33724j3.m73469a("NATIVE_CRASH", C33571bi.m72572a(), strM72516a, strM72515a, strM72514a + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + strM72835a, crashDetailBeanPackageCrashBasicDatas);
            m72519a(crashDetailBeanPackageCrashBasicDatas, i13, fileParentPath);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72513a(int i11, String str) {
        return i11 > 0 ? "KERNEL" : str;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public CrashDetailBean packageCrashBasicDatas(String str, long j11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        String str12;
        boolean zM73684p = C33745k3.m73653l().m73684p();
        if (zM73684p) {
            C34012x4.m75437b("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f68631c = 1;
        crashDetailBean.f68643i = this.f69197c.m73890n();
        crashDetailBean.f68645j = this.f69197c.m73892o();
        C33765l2 c33765l2 = this.f69197c;
        crashDetailBean.f68649l = c33765l2.f70714F;
        crashDetailBean.f68647k = c33765l2.f70755k;
        crashDetailBean.f68651m = c33765l2.f70748g0;
        crashDetailBean.f68653n = c33765l2.m73868d();
        List<String> operationLogString = LifecycleCallback.INSTANCE.getOperationLogString();
        crashDetailBean.f68657p = operationLogString;
        if (operationLogString != null && !operationLogString.isEmpty()) {
            NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.martianLog.ordinal());
        }
        C33765l2 c33765l3 = this.f69197c;
        crashDetailBean.f68641h = c33765l3.f70752i0;
        crashDetailBean.f68655o = c33765l3.m73882j();
        crashDetailBean.f68665v = this.f69197c.m73833F();
        crashDetailBean.f68666w = str2;
        if (zM73684p) {
            str12 = str5 + "\n[Bugly]This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!";
        } else {
            str12 = str5;
        }
        crashDetailBean.f68667x = str12;
        crashDetailBean.f68668y = str3;
        String str13 = str4 == null ? "" : str4;
        crashDetailBean.f68669z = str13;
        crashDetailBean.f68602A = j11;
        crashDetailBean.f68605D = C33571bi.m72614c(str13.getBytes());
        crashDetailBean.f68612K = str;
        crashDetailBean.f68624W = this.f69197c.m73900x();
        crashDetailBean.f68659q = this.f69197c.m73898v();
        crashDetailBean.f68661r = this.f69197c.m73897u();
        crashDetailBean.f68606E = str8;
        String strM72837a = C33608dd.m72837a(FileUtil.getFileParentPath(str8), str8);
        if (!C33571bi.m72617c(strM72837a)) {
            crashDetailBean.f68648k0 = strM72837a;
        }
        crashDetailBean.f68607F = C33608dd.m72836a(str9, C33745k3.f70517x, C33745k3.f70518y, C33745k3.f70519z, C33745k3.f70493E, j11);
        crashDetailBean.f68608G = C33608dd.m72836a(str10, C33745k3.f70517x, C33745k3.f70518y, C33745k3.f70519z, null, j11);
        crashDetailBean.f68626Y = str7;
        crashDetailBean.f68627Z = str6;
        crashDetailBean.f68628a0 = str11;
        crashDetailBean.f68616O = this.f69197c.m73830C();
        crashDetailBean.f68617P = this.f69197c.m73831D();
        crashDetailBean.f68618Q = this.f69197c.m73832E();
        return crashDetailBean;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void packageCrashDetailDatas(CrashDetailBean crashDetailBean, String str, byte[] bArr, Map<String, String> map, boolean z11, long j11, long j12, long j13, long j14) {
        int i11;
        String str2;
        int iIndexOf;
        if (z11) {
            crashDetailBean.f68619R = C33830o4.m74395b(this.f69195a);
            crashDetailBean.f68620S = C33830o4.m74412o();
            crashDetailBean.f68621T = C33830o4.m74402f();
            crashDetailBean.f68622U = Runtime.getRuntime().maxMemory();
            crashDetailBean.f68623V = Runtime.getRuntime().totalMemory();
            crashDetailBean.f68613L = C33830o4.m74406i();
            crashDetailBean.f68614M = C33830o4.m74408k();
            crashDetailBean.f68615N = C33830o4.m74400e();
            crashDetailBean.f68609H = C33627eb.m72943b();
            C33765l2 c33765l2 = this.f69197c;
            crashDetailBean.f68630b0 = c33765l2.f70739c;
            crashDetailBean.f68632c0 = c33765l2.m73838K();
            crashDetailBean.f68610I = C33571bi.m72588a(this.f69197c.m73840M(), C33745k3.f70490B, false, false);
            int iIndexOf2 = crashDetailBean.f68669z.indexOf("java:\n");
            if (iIndexOf2 > 0 && (i11 = iIndexOf2 + 6) < crashDetailBean.f68669z.length()) {
                String str3 = crashDetailBean.f68669z;
                String strSubstring = str3.substring(i11, str3.length() - 1);
                if (strSubstring.length() > 0 && crashDetailBean.f68610I.containsKey(crashDetailBean.f68612K) && (iIndexOf = (str2 = crashDetailBean.f68610I.get(crashDetailBean.f68612K)).indexOf(strSubstring)) > 0) {
                    String strSubstring2 = str2.substring(iIndexOf);
                    crashDetailBean.f68610I.put(crashDetailBean.f68612K, strSubstring2);
                    crashDetailBean.f68669z = crashDetailBean.f68669z.substring(0, i11);
                    crashDetailBean.f68669z = C34025xh.m75464a(new StringBuilder(), crashDetailBean.f68669z, strSubstring2);
                }
            }
            if (TextUtils.isEmpty(str)) {
                crashDetailBean.f68611J = this.f69197c.f70745f;
            } else {
                crashDetailBean.f68611J = str;
            }
            crashDetailBean.f68638f0 = this.f69197c.m73835H();
            crashDetailBean.f68640g0 = this.f69197c.m73828A();
            crashDetailBean.f68642h0 = this.f69197c.m73880i();
            crashDetailBean.f68644i0 = this.f69197c.m73878h();
            crashDetailBean.f68652m0 = C33955u7.m75163c().m75164a();
            crashDetailBean.f68654n0 = C33955u7.m75163c().m75167b();
            C33663g5.m73147b(crashDetailBean);
        } else {
            crashDetailBean.f68611J = str;
            crashDetailBean.f68613L = j11;
            crashDetailBean.f68614M = j12;
            crashDetailBean.f68615N = j13;
            crashDetailBean.f68620S = j14;
            if (crashDetailBean.f68607F == null) {
                crashDetailBean.f68607F = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f68630b0 = -1L;
            crashDetailBean.f68638f0 = -1;
            crashDetailBean.f68640g0 = -1;
            crashDetailBean.f68642h0 = map;
            crashDetailBean.f68644i0 = this.f69197c.m73878h();
            crashDetailBean.f68610I = null;
            crashDetailBean.f68652m0 = "";
            crashDetailBean.f68654n0 = "0";
            if (bArr != null) {
                crashDetailBean.f68609H = bArr;
            }
        }
        if (TextUtils.isEmpty(crashDetailBean.f68611J)) {
            crashDetailBean.f68611J = "unknown(record)";
        }
    }

    public C33566bd(Context context, C33765l2 c33765l2, C33724j3 c33724j3, C33863pg c33863pg) {
        this.f69195a = context;
        this.f69196b = c33724j3;
        this.f69197c = c33765l2;
        this.f69198d = c33863pg;
    }

    /* JADX INFO: renamed from: a */
    public static String m72512a(int i11, int i12) {
        String strM75404a = "UNKNOWN";
        if (i11 > 0) {
            return "UNKNOWN";
        }
        if (i12 > 0) {
            strM75404a = C34007x.m75404a(i12);
        }
        if (strM75404a.equals(String.valueOf(i12))) {
            return strM75404a;
        }
        return strM75404a + "(" + i12 + ")";
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public boolean clearPreDumpAnrInfo() {
        C33947u c33947u;
        if (C33947u.m75076c() == null) {
            return false;
        }
        synchronized (C33947u.class) {
            c33947u = C33947u.f72131E;
        }
        return c33947u.m75086a();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public boolean preDumpAnrInfo() {
        C33947u c33947u;
        if (C33947u.m75076c() == null) {
            return false;
        }
        synchronized (C33947u.class) {
            c33947u = C33947u.f72131E;
        }
        return c33947u.m75102h();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public boolean updateStateAndHandleAnr() {
        C33947u c33947u;
        if (C33947u.m75076c() == null) {
            return false;
        }
        synchronized (C33947u.class) {
            c33947u = C33947u.f72131E;
        }
        return c33947u.m75111q();
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m72517a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr != null) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                if (str != null) {
                    C34012x4.m75442d("Extra message[%d]: %s", Integer.valueOf(i11), str);
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    } else {
                        C34012x4.m75431a(LogState.WARN, "bad extraMsg %s", str);
                    }
                }
            }
            return map;
        }
        C34012x4.m75434a("not found extraMsg", new Object[0]);
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72518a(Map<String, String> map) {
        String str = map.get("HasPendingException");
        if (str == null || !str.equals(CredentialEntry.TRUE_STRING)) {
            return false;
        }
        C34012x4.m75442d("Native crash happened with a Java pending exception.", new Object[0]);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m72516a(Map<String, String> map, C33765l2 c33765l2) {
        String str = map.get("ExceptionProcessName");
        if (str != null && str.length() != 0) {
            C34012x4.m75434a("Name of crash process: %s", str);
            return str;
        }
        return c33765l2.f70745f;
    }

    /* JADX INFO: renamed from: a */
    public static String m72515a(Map<String, String> map, int i11) {
        String str = map.get("ExceptionThreadName");
        C34012x4.m75434a("crash thread name:%s tid:%s", str, Integer.valueOf(i11));
        if (TextUtils.isEmpty(str)) {
            return Thread.currentThread().getName() + "(" + i11 + ")";
        }
        return str + "(" + i11 + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m72519a(CrashDetailBean crashDetailBean, int i11, String str) {
        if (this.f69196b == null) {
            C34012x4.m75444f("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        C33608dd.m72840a(true, str);
        boolean zM73501a = this.f69196b.m73501a(crashDetailBean, i11, true);
        if (NativeCrashHandler.getInstance() != null) {
            String crashThreadLocalValue = NativeCrashHandler.getInstance().getCrashThreadLocalValue();
            if (!TextUtils.isEmpty(crashThreadLocalValue)) {
                crashDetailBean.f68642h0.put(C33765l2.f70707J0, crashThreadLocalValue);
            }
        }
        C33571bi.m72609b(this.f69195a, NativeCrashHandler.f68695Z);
        if (!zM73501a) {
            this.f69196b.m73497a(crashDetailBean, 3000L, true);
        }
        this.f69196b.m73516g(crashDetailBean);
        C33745k3.m73653l().m73674e();
    }
}

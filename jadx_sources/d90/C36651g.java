package d90;

import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.imsdk.BaseConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: d90.g */
/* JADX INFO: compiled from: VirtualApkCheckUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36651g {

    /* JADX INFO: renamed from: c */
    public static volatile C36651g f79449c;

    /* JADX INFO: renamed from: a */
    public String f79450a = "test";

    /* JADX INFO: renamed from: b */
    public String[] f79451b = {"com.bly.dkplat", "com.by.chaos", "com.lbe.parallel", "com.excelliance.dualaid", "com.lody.virtual", "com.qihoo.magic"};

    /* JADX INFO: renamed from: b */
    public boolean m82022b(InterfaceC36652h interfaceC36652h) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            bufferedReader2.close();
                            break;
                        }
                        for (String str : this.f79451b) {
                            if (line.contains(str)) {
                                if (interfaceC36652h != null) {
                                    interfaceC36652h.m82025a();
                                }
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused) {
                                }
                                return true;
                            }
                        }
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException unused4) {
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m82024e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static C36651g m82020c() {
        if (f79449c == null) {
            synchronized (C36651g.class) {
                try {
                    if (f79449c == null) {
                        f79449c = new C36651g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f79449c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m82021a(InterfaceC36652h interfaceC36652h) throws Throwable {
        String[] strArrSplit;
        int i11;
        String strM82023d = m82023d();
        if (TextUtils.isEmpty(strM82023d)) {
            return false;
        }
        String strM81983a = C36646b.m81981c().m81983a("ps");
        if (!TextUtils.isEmpty(strM81983a) && (strArrSplit = strM81983a.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) != null && strArrSplit.length > 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                if (strArrSplit[i13].contains(strM82023d)) {
                    int iLastIndexOf = strArrSplit[i13].lastIndexOf(C33627eb.f69716f);
                    String str = strArrSplit[i13];
                    if (iLastIndexOf <= 0) {
                        i11 = 0;
                    } else {
                        i11 = iLastIndexOf + 1;
                    }
                    if (new File(String.format("/data/data/%s", str.substring(i11, str.length()), Locale.CHINA)).exists()) {
                        i12++;
                    }
                }
            }
            if (i12 > 1 && interfaceC36652h != null) {
                interfaceC36652h.m82025a();
            }
            if (i12 > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final String m82023d() throws Throwable {
        String strM81983a = C36646b.m81981c().m81983a("cat /proc/self/cgroup");
        if (strM81983a != null && strM81983a.length() != 0) {
            int iLastIndexOf = strM81983a.lastIndexOf("uid");
            int iLastIndexOf2 = strM81983a.lastIndexOf("/pid");
            if (iLastIndexOf < 0) {
                return null;
            }
            if (iLastIndexOf2 <= 0) {
                iLastIndexOf2 = strM81983a.length();
            }
            try {
                String strReplaceAll = strM81983a.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
                if (!m82024e(strReplaceAll)) {
                    return null;
                }
                return String.format("u0_a%d", Integer.valueOf(Integer.valueOf(strReplaceAll).intValue() + BaseConstants.ERR_SVR_SSO_VCODE));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }
}

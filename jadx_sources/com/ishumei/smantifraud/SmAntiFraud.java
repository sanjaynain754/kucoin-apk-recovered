package com.ishumei.smantifraud;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ishumei.smantifraud.l1111l111111Il.l11l1111I1l;
import com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il;
import com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl;
import com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il;
import com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SmAntiFraud {
    public static final String AREA_BJ = "bj";
    public static final String AREA_FJNY = "fjny";
    public static final String AREA_XJP = "xjp";
    public static final int SM_AF_ASYN_MODE = 1;
    public static final int SM_AF_SYN_MODE = 0;
    private static final String l1111l111111Il = "Smlog";
    private static IServerSmidCallback l111l11111lIl;
    public static SmOption option;

    /* JADX INFO: loaded from: classes56.dex */
    public interface IDeviceIdCallback {
        void onResult(String str);
    }

    public interface IServerSmidCallback {
        void onError(int i11);

        void onSuccess(String str);
    }

    public static class SmOption {
        private static final int l1111l111111Il = 1024;
        private boolean l11l1111I11l;
        private Set<String> l11l1111Il1l;
        private boolean l11l1111Ill;
        private String l11l111l1Il;
        private byte[] l11l111l1lll;
        private boolean l111l11111lIl = false;
        private String l111l11111I1l = "";
        private String l111l11111Il = "";
        private boolean l111l1111l1Il = true;
        private boolean l111l1111llIl = true;
        private String l111l1111lI1l = null;
        private String l111l1111lIl = null;
        private String l11l1111lIIl = null;
        private boolean l11l1111I1l = false;
        private boolean l11l1111I1ll = false;
        private IServerSmidCallback l11l1111Il = null;
        private String l11l11IlIIll = "default";
        private String l11l111l11Il = null;
        private boolean l111l11IlIlIl = false;
        private String l11l111l1I1l = SmAntiFraud.AREA_BJ;

        public final String l1111l111111Il() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.l111l1111l1Il ? "1" : "0");
            sb2.append(this.l111l1111llIl ? "1" : "0");
            sb2.append(this.l11l1111I11l ? "1" : "0");
            sb2.append(this.l11l1111I1ll ? "1" : "0");
            sb2.append(SmAntiFraud.l111l11111lIl != null ? "1" : "0");
            Set<String> set = this.l11l1111Il1l;
            sb2.append((set == null || set.size() <= 0) ? "0" : "1");
            sb2.append(this.l111l11IlIlIl ? "1" : "0");
            return sb2.toString();
        }

        private boolean l111l11IlIlIl() {
            return this.l111l1111llIl;
        }

        private boolean l11l111l11Il() {
            return this.l111l11IlIlIl;
        }

        private boolean l11l111l1I1l() {
            return this.l111l11111lIl;
        }

        private boolean l11l111l1Il() {
            return this.l11l1111Ill;
        }

        private byte[] l11l111l1lll() {
            return this.l11l111l1lll;
        }

        public final boolean l111l11111I1l() {
            return this.l11l1111I1ll;
        }

        public final String l111l11111Il() {
            return this.l11l111l11Il;
        }

        public final String l111l11111lIl() {
            return this.l11l111l1I1l;
        }

        public final IServerSmidCallback l111l1111l1Il() {
            return this.l11l1111Il;
        }

        public final boolean l111l1111lI1l() {
            return this.l11l1111I11l;
        }

        public final boolean l111l1111lIl() {
            return this.l11l1111I1l;
        }

        public final String l111l1111llIl() {
            return this.l11l1111lIIl;
        }

        public final String l11l1111I11l() {
            return this.l111l11111I1l;
        }

        public final String l11l1111I1l() {
            return this.l111l11111Il;
        }

        public final String l11l1111I1ll() {
            return this.l111l1111lI1l;
        }

        public final String l11l1111Il() {
            return this.l111l1111lIl;
        }

        public final Set<String> l11l1111Il1l() {
            return this.l11l1111Il1l;
        }

        public final String l11l1111Ill() {
            return this.l11l11IlIIll;
        }

        public final boolean l11l1111lIIl() {
            return this.l111l1111l1Il;
        }

        public final String l11l11IlIIll() {
            return this.l11l111l1Il;
        }

        public void setAppId(String str) {
            this.l11l11IlIIll = str;
        }

        public void setArea(String str) {
            this.l11l111l1I1l = str;
        }

        public void setChannel(String str) {
            this.l111l11111Il = str;
        }

        public void setCheckCrt(boolean z11) {
            this.l111l11IlIlIl = z11;
        }

        public void setCloudConf(boolean z11) {
            this.l111l1111llIl = z11;
        }

        public void setConfUrl(String str) {
            this.l11l1111lIIl = str;
        }

        public void setExtraInfo(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                this.l11l111l1Il = str.substring(0, 1024);
            } else {
                this.l11l111l1Il = str;
            }
        }

        public void setFirst(boolean z11) {
            this.l11l1111Ill = z11;
        }

        public void setHttpsCrt(byte[] bArr) {
            this.l11l111l1lll = bArr;
        }

        public void setNotCollect(Set<String> set) {
            this.l11l1111Il1l = set;
        }

        public void setOrganization(String str) {
            this.l111l11111I1l = str;
        }

        public void setPublicKey(String str) {
            this.l11l111l11Il = str;
        }

        public void setRetryUrl(String str) {
            this.l111l1111lIl = str;
        }

        public void setServerIdCallback(IServerSmidCallback iServerSmidCallback) {
            this.l11l1111Il = iServerSmidCallback;
        }

        public void setSynMode(boolean z11) {
            this.l111l11111lIl = z11;
        }

        public void setTransport(boolean z11) {
            this.l111l1111l1Il = z11;
        }

        public void setUrl(String str) {
            this.l111l1111lI1l = str;
        }

        public void setUsingHttps(boolean z11) {
            this.l11l1111I1ll = z11;
        }

        public void setUsingMD5(boolean z11) {
            this.l11l1111I11l = z11;
        }

        public void usingShortBoxData(boolean z11) {
            this.l11l1111I1l = z11;
        }
    }

    public static void destroy() {
        l111l1111l1Il.l111l1111l1Il = true;
    }

    public static String getDeviceId() {
        synchronized (SmAntiFraud.class) {
            try {
                if (l111l1111l1Il.l111l1111l1Il) {
                    return "Dc21zZGsgaGFzIGJlZW4gZGVzdHJveWVk";
                }
                if (TextUtils.isEmpty(com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il)) {
                    l111l11111Il.l1111l111111Il();
                    return l111l11111Il.l111l11111lIl();
                }
                Log.e(l1111l111111Il, com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il);
                try {
                    throw new IllegalAccessException(com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il);
                } catch (Throwable th2) {
                    try {
                        return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l11l1111I1l.l1111l111111Il().l1111l111111Il(th2).getBytes());
                    } catch (Throwable th3) {
                        return "D" + Base64.encodeToString((com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il + ";" + th3).getBytes(), 0);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:22:0x0041, B:24:0x0058, B:27:0x006a, B:30:0x0079, B:31:0x0093, B:33:0x00a0, B:34:0x00b4, B:37:0x00c2, B:38:0x00d2, B:39:0x00d6, B:40:0x00dd, B:42:0x00e9, B:43:0x00fc, B:54:0x0127, B:56:0x0138, B:57:0x0140, B:59:0x014e, B:61:0x0152, B:62:0x0163, B:64:0x016d, B:66:0x0175, B:51:0x011b), top: B:75:0x0041, outer: #0 }] */
    public static synchronized boolean create(Context context, SmOption smOption) {
        String str;
        String strL111l11111Il;
        IServerSmidCallback iServerSmidCallback;
        SmOption smOption2;
        String strL11l1111I1ll;
        String str2;
        String str3;
        boolean z11 = false;
        try {
            if (context == null) {
                str2 = "context is null!";
                com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = "context is null!";
                str3 = l1111l111111Il;
            } else if (smOption == null) {
                str2 = "SmOption is null!";
                com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = "SmOption is null!";
                str3 = l1111l111111Il;
            } else if (TextUtils.isEmpty(smOption.l11l1111I11l())) {
                str2 = "SmOption.organization is null!";
                com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = "SmOption.organization is null!";
                str3 = l1111l111111Il;
            } else {
                if (!TextUtils.isEmpty(smOption.l111l11111Il())) {
                    try {
                        com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = null;
                        l111l1111l1Il.l111l1111l1Il = false;
                        l111l1111l1Il.l1111l111111Il = context.getApplicationContext();
                        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il(context);
                        l111l1111l1Il.l111l11111I1l = System.currentTimeMillis();
                        if (l111l1111l1Il.l111l11111lIl == null) {
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random(System.currentTimeMillis());
                            for (int i11 = 0; i11 < 5; i11++) {
                                sb2.append(random.nextInt(10));
                            }
                            l111l1111l1Il.l111l11111lIl = System.currentTimeMillis() + C33820nf.f71144W + ((Object) sb2);
                        }
                        option = smOption;
                        if (TextUtils.isEmpty(smOption.l11l1111I1ll())) {
                            SmOption smOption3 = option;
                            smOption3.setUrl(l111l1111llIl.l1111l111111Il(smOption3.l111l11111lIl(), option.l111l11111I1l()));
                            z11 = true;
                        }
                        if (TextUtils.isEmpty(option.l11l1111Il())) {
                            if (z11) {
                                smOption2 = option;
                                strL11l1111I1ll = l111l1111llIl.l111l11111lIl(smOption2.l111l11111lIl(), option.l111l11111I1l());
                            } else {
                                smOption2 = option;
                                strL11l1111I1ll = smOption2.l11l1111I1ll();
                            }
                            smOption2.setRetryUrl(strL11l1111I1ll);
                        }
                        if (TextUtils.isEmpty(option.l111l1111llIl())) {
                            SmOption smOption4 = option;
                            smOption4.setConfUrl(l111l1111llIl.l111l11111I1l(smOption4.l111l11111lIl(), option.l11l1111I1ll));
                        }
                        l111l11111Il l111l11111ilL1111l111111Il = l111l11111Il.l1111l111111Il();
                        String strL111l11111lIl = option.l111l11111lIl();
                        int iHashCode = strL111l11111lIl.hashCode();
                        if (iHashCode == 3144) {
                            str = AREA_BJ;
                        } else {
                            if (iHashCode != 118718) {
                                if (iHashCode == 3144079) {
                                    str = AREA_FJNY;
                                }
                                l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I11l());
                                if (option.l111l1111l1Il() != null) {
                                    l111l11111lIl = option.l111l1111l1Il();
                                }
                                strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
                                if (!TextUtils.isEmpty(strL111l11111Il) && (iServerSmidCallback = l111l11111lIl) != null) {
                                    iServerSmidCallback.onSuccess("B" + strL111l11111Il);
                                }
                                if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl() && option.l11l1111lIIl()) {
                                    com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl.l1111l111111Il().l1111l111111Il(option.l11l1111I1ll(), option.l11l1111Il());
                                }
                                return TextUtils.isEmpty(com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il);
                            }
                            str = AREA_XJP;
                        }
                        strL111l11111lIl.equals(str);
                        l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I11l());
                        if (option.l111l1111l1Il() != null) {
                            l111l11111lIl = option.l111l1111l1Il();
                        }
                        strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
                        if (!TextUtils.isEmpty(strL111l11111Il)) {
                            iServerSmidCallback.onSuccess("B" + strL111l11111Il);
                        }
                        if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
                            com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl.l1111l111111Il().l1111l111111Il(option.l11l1111I1ll(), option.l11l1111Il());
                        }
                    } catch (Throwable th2) {
                        Log.e(l1111l111111Il, "smsdk init exception!", th2);
                        com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = "smsdk init exception!;" + th2;
                    }
                    return TextUtils.isEmpty(com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il);
                }
                str2 = "SmOption.publicKey is null!";
                com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = "SmOption.publicKey is null!";
                str3 = l1111l111111Il;
            }
            Log.e(str3, str2);
            return false;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static void getDeviceId(IDeviceIdCallback iDeviceIdCallback) {
        if (iDeviceIdCallback == null) {
            throw new IllegalArgumentException("callback cannot be null.");
        }
        l111l11111Il.l1111l111111Il().l1111l111111Il(iDeviceIdCallback, Thread.currentThread() == Looper.getMainLooper().getThread());
    }

    public static String getSDKVersion() {
        return "3.7.3_hy_timeh";
    }

    public static IServerSmidCallback getServerIdCallback() {
        return l111l11111lIl;
    }

    public static String getVData() {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
            return "DU21PcHRpb24gaXMgbnVsbC4=";
        }
        try {
            return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l11l111l11Il.l1111l111111Il().l111l11111lIl().getBytes());
        } catch (Throwable th2) {
            return "D" + l11l1111I1l.l1111l111111Il().l1111l111111Il(th2);
        }
    }

    private static void l1111l111111Il(SmOption smOption) {
        IServerSmidCallback iServerSmidCallback;
        l111l11111lIl(smOption);
        String strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
        if (!TextUtils.isEmpty(strL111l11111Il) && (iServerSmidCallback = l111l11111lIl) != null) {
            iServerSmidCallback.onSuccess("B" + strL111l11111Il);
        }
        if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl() && option.l11l1111lIIl()) {
            com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl.l1111l111111Il().l1111l111111Il(option.l11l1111I1ll(), option.l11l1111Il());
        }
    }

    private static void l111l11111lIl(SmOption smOption) {
        boolean z11;
        SmOption smOption2;
        String strL11l1111I1ll;
        option = smOption;
        if (TextUtils.isEmpty(smOption.l11l1111I1ll())) {
            SmOption smOption3 = option;
            smOption3.setUrl(l111l1111llIl.l1111l111111Il(smOption3.l111l11111lIl(), option.l111l11111I1l()));
            z11 = true;
        } else {
            z11 = false;
        }
        if (TextUtils.isEmpty(option.l11l1111Il())) {
            if (z11) {
                smOption2 = option;
                strL11l1111I1ll = l111l1111llIl.l111l11111lIl(smOption2.l111l11111lIl(), option.l111l11111I1l());
            } else {
                smOption2 = option;
                strL11l1111I1ll = smOption2.l11l1111I1ll();
            }
            smOption2.setRetryUrl(strL11l1111I1ll);
        }
        if (TextUtils.isEmpty(option.l111l1111llIl())) {
            SmOption smOption4 = option;
            smOption4.setConfUrl(l111l1111llIl.l111l11111I1l(smOption4.l111l11111lIl(), option.l11l1111I1ll));
        }
        l111l11111Il l111l11111ilL1111l111111Il = l111l11111Il.l1111l111111Il();
        l111l1111llIl.l1111l111111Il(option.l111l11111lIl());
        l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I11l());
        if (option.l111l1111l1Il() != null) {
            l111l11111lIl = option.l111l1111l1Il();
        }
    }

    public static synchronized void registerServerIdCallback(IServerSmidCallback iServerSmidCallback) {
        l111l11111lIl = iServerSmidCallback;
    }

    public static void startDetector(AbsDetector absDetector) {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
        } else {
            l11l111l11Il.l1111l111111Il().l1111l111111Il(absDetector);
        }
    }

    public static void stopDetector(AbsDetector absDetector) {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
        } else {
            l11l111l11Il.l1111l111111Il().l111l11111lIl(absDetector);
        }
    }

    private SmAntiFraud() {
    }

    private static boolean l1111l111111Il(Context context, SmOption smOption) {
        String str;
        if (context == null) {
            str = "context is null!";
        } else if (smOption == null) {
            str = "SmOption is null!";
        } else if (TextUtils.isEmpty(smOption.l11l1111I11l())) {
            str = "SmOption.organization is null!";
        } else {
            if (!TextUtils.isEmpty(smOption.l111l11111Il())) {
                return true;
            }
            str = "SmOption.publicKey is null!";
        }
        com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il.l1111l111111Il = str;
        Log.e(l1111l111111Il, str);
        return false;
    }
}

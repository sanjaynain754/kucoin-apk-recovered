package com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.l1111l111111Il.l11l1111I1l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l111l11111Il {
    private static String l1111l111111Il = "sm";
    private static l111l11111Il l111l11111lIl;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l11111I1l;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l11111Il;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l1111l1Il;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l1111lI1l;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l1111lIl;
    private com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l111l1111llIl;
    private String l11l1111lIIl;

    public static l111l11111Il l1111l111111Il() {
        if (l111l11111lIl == null) {
            synchronized (l111l11111Il.class) {
                try {
                    if (l111l11111lIl == null) {
                        l111l11111lIl = new l111l11111Il();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return l111l11111lIl;
    }

    public static String l111l11111lIl() {
        String strL1111l111111Il;
        if (!TextUtils.isEmpty(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il)) {
            return "B" + com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il;
        }
        String strL111l11111Il = l1111l111111Il().l111l11111Il();
        if (!TextUtils.isEmpty(strL111l11111Il)) {
            com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il = strL111l11111Il;
            return "B" + strL111l11111Il;
        }
        String strL111l11111I1l = com.ishumei.smantifraud.l1111l111111Il.l1111l111111Il.l1111l111111Il().l111l11111I1l();
        if (!TextUtils.isEmpty(strL111l11111I1l)) {
            return "D" + strL111l11111I1l;
        }
        boolean zL111l1111lI1l = SmAntiFraud.option.l111l1111lI1l();
        if (com.ishumei.smantifraud.l1111l111111Il.l1111l111111Il.l1111l111111Il().l111l11111lIl()) {
            return "DZ2V0RGV2aWNlSWQgZW1wdHk=";
        }
        try {
            strL1111l111111Il = com.ishumei.smantifraud.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(zL111l1111lI1l ? 1 : 0);
            if (strL1111l111111Il == null && com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l1111l1Il) {
                return "Dc21zZGsgaGFzIGJlZW4gZGVzdHJveWVk";
            }
        } catch (Throwable th2) {
            strL1111l111111Il = l11l1111I1l.l1111l111111Il().l1111l111111Il(th2);
        }
        if (strL1111l111111Il == null) {
            try {
                return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l11l1111I1l.l1111l111111Il().l1111l111111Il(new IllegalStateException()).getBytes());
            } catch (Throwable th3) {
                return "D" + Base64.encodeToString(th3.toString().getBytes(), 0);
            }
        }
        try {
            return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strL1111l111111Il.getBytes());
        } catch (Throwable th4) {
            try {
                return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l11l1111I1l.l1111l111111Il().l1111l111111Il(th4).getBytes());
            } catch (Throwable th5) {
                return "D" + Base64.encodeToString(th5.toString().getBytes(), 0);
            }
        }
    }

    public final synchronized String l111l11111Il() {
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l11111I1l;
        if (l1111l111111il == null) {
            return "";
        }
        return l1111l111111il.l111l11111lIl();
    }

    private void l111l11111lIl(String str) {
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l11111I1l;
        if (l1111l111111il != null) {
            l1111l111111il.l111l11111lIl(str);
        }
    }

    private String l11l1111I11l() {
        if (!TextUtils.isEmpty(this.l11l1111lIIl)) {
            return this.l11l1111lIIl;
        }
        ArrayList<com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il> arrayList = new ArrayList();
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l11111I1l;
        if (l1111l111111il != null) {
            arrayList.add(l1111l111111il);
        }
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il2 = this.l111l1111lI1l;
        if (l1111l111111il2 != null) {
            arrayList.add(l1111l111111il2);
        }
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il3 = this.l111l1111l1Il;
        if (l1111l111111il3 != null) {
            arrayList.add(l1111l111111il3);
        }
        for (com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il4 : arrayList) {
            if (l1111l111111il4 != null) {
                String strL111l11111lIl = l1111l111111il4.l111l11111lIl();
                if (!TextUtils.isEmpty(strL111l11111lIl)) {
                    this.l11l1111lIIl = strL111l11111lIl;
                    return strL111l11111lIl;
                }
            }
        }
        return "";
    }

    public final void l1111l111111Il(final SmAntiFraud.IDeviceIdCallback iDeviceIdCallback, final boolean z11) {
        new Thread(new Runnable() { // from class: com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.1
            @Override // java.lang.Runnable
            public final void run() {
                final String strL111l11111lIl = l111l11111Il.l111l11111lIl();
                if (z11) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            iDeviceIdCallback.onResult(strL111l11111lIl);
                        }
                    });
                } else {
                    iDeviceIdCallback.onResult(strL111l11111lIl);
                }
            }
        }).start();
    }

    public final String l111l11111I1l() {
        if (!TextUtils.isEmpty(this.l11l1111lIIl)) {
            return this.l11l1111lIIl;
        }
        ArrayList<com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il> arrayList = new ArrayList();
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l11111I1l;
        if (l1111l111111il != null) {
            arrayList.add(l1111l111111il);
        }
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il2 = this.l111l1111lI1l;
        if (l1111l111111il2 != null) {
            arrayList.add(l1111l111111il2);
        }
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il3 = this.l111l1111l1Il;
        if (l1111l111111il3 != null) {
            arrayList.add(l1111l111111il3);
        }
        for (com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il4 : arrayList) {
            if (l1111l111111il4 != null) {
                String strL111l11111lIl = l1111l111111il4.l111l11111lIl();
                if (!TextUtils.isEmpty(strL111l11111lIl)) {
                    this.l11l1111lIIl = strL111l11111lIl;
                    return strL111l11111lIl;
                }
            }
        }
        return "";
    }

    public final String l111l1111l1Il() {
        return "";
    }

    public final String l111l1111lI1l() {
        return "";
    }

    public final String l111l1111lIl() {
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l1111lI1l;
        return l1111l111111il == null ? "" : l1111l111111il.l111l11111lIl();
    }

    public final String l111l1111llIl() {
        com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = this.l111l1111l1Il;
        return l1111l111111il == null ? "" : l1111l111111il.l111l11111lIl();
    }

    public final String l11l1111lIIl() {
        return "";
    }

    private l111l11111Il() {
    }

    public final void l1111l111111Il(String str) {
        try {
            this.l111l11111I1l = new l111l1111l1Il(str);
            this.l111l1111l1Il = new l111l1111llIl();
            this.l111l1111lI1l = new l111l1111lI1l();
        } catch (Throwable unused) {
        }
    }

    public final synchronized void l1111l111111Il(String str, boolean z11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il = str;
            com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il l1111l111111il = l1111l111111Il().l111l11111I1l;
            if (l1111l111111il != null) {
                l1111l111111il.l111l11111lIl(str);
            }
            if (SmAntiFraud.getServerIdCallback() != null) {
                SmAntiFraud.getServerIdCallback().onSuccess("B" + str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.common.reporter.upload.UploadEncrypt;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ai */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33550ai extends RunnableC33925sh {

    /* JADX INFO: renamed from: z */
    public final boolean f68872z;

    public C33550ai(Context context, int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, Map<String, String> map, boolean z11) {
        super(context, i11, i12, bArr, str, str2, interfaceC33885qh, true, 0, 0, false, map);
        this.f68872z = z11;
    }

    @Override // com.tencent.bugly.proguard.RunnableC33925sh, java.lang.Runnable
    public void run() {
        try {
            this.f72007q = 0;
            this.f72008r = 0L;
            this.f72009s = 0L;
            String strM75001c = m75001c();
            if (strM75001c != null) {
                m74996a(null, false, 0, strM75001c);
                return;
            }
            byte[] bArr = this.f71996f;
            if (bArr == null) {
                m74996a(null, false, 0, "failed to zip request body");
                return;
            }
            Map<String, String> mapM75000b = m75000b();
            m74993a();
            String str = this.f72004n;
            StrategyBean strategyBeanM74582c = this.f71998h.m74582c();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= this.f71992b) {
                    m74996a(null, false, i12, "failed after many attempts");
                    return;
                }
                if (i13 > 1) {
                    C34012x4.m75444f("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i13));
                    C33571bi.m72615c(this.f71993c);
                    if (i13 == this.f71992b) {
                        C34012x4.m75444f("[Upload] Use the back-up url at the last time: %s", this.f72005o);
                        str = this.f72005o;
                    }
                }
                C34012x4.m75434a("[Upload] Send %d bytes", Integer.valueOf(bArr.length));
                C34012x4.m75434a("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", str, Integer.valueOf(this.f71995e), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                if (this.f68872z) {
                    byte[] bArrM74866a = this.f71999i.m74866a(str, UploadEncrypt.doUploadEncryptWithAppId(bArr, C33765l2.m73827s().m73872e()), this, mapM75000b);
                    if (bArrM74866a == null) {
                        m74996a(null, false, 2, "response is null");
                    } else if (m72372a(bArrM74866a)) {
                        return;
                    } else {
                        m74996a(null, false, 2, "failed from server");
                    }
                    i11 = i13;
                } else if (!m74999a(this.f71999i.m74866a(str, bArr, this, mapM75000b), this.f71999i.f71739b, strategyBeanM74582c)) {
                    return;
                }
                i12 = 1;
                i11 = i13;
            }
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72372a(byte[] bArr) {
        boolean z11;
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            if (jSONObject.has("next_time_in_sec")) {
                C33918sa.f71856p.m75253c(jSONObject.getLong("next_time_in_sec") * 1000);
            }
            boolean z12 = jSONObject.has("code") && jSONObject.optInt("code") == 0;
            if (!z12) {
                return z12;
            }
            try {
                C33579c5.m72639a(InterfaceC33617e1.f69654c, "union_dau", jSONObject);
                m74996a(null, true, 2, "success");
                return z12;
            } catch (Throwable th2) {
                z11 = z12;
                th = th2;
                C34012x4.m75437b(new String(bArr), new Object[0]);
                C34012x4.m75432a(LogState.ERROR, th);
                return z11;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
        }
    }
}

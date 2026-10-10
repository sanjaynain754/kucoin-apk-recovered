package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.tencent.bugly.callback.Callback;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.kc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33754kc {

    /* JADX INFO: renamed from: g */
    public static final long f70642g = 16666667;

    /* JADX INFO: renamed from: h */
    public static final long f70643h = 1000000;

    /* JADX INFO: renamed from: i */
    public static final String f70644i = "RMonitor_looper_metric";

    /* JADX INFO: renamed from: b */
    public long f70645b = 200;

    /* JADX INFO: renamed from: c */
    public boolean f70646c = false;

    /* JADX INFO: renamed from: d */
    public boolean f70647d = false;

    /* JADX INFO: renamed from: e */
    public final DropFrameResultMeta f70648e = new DropFrameResultMeta();

    /* JADX INFO: renamed from: f */
    public C33736jf f70649f = null;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public boolean mo73805a(String str, long j11) {
        if (!AndroidVersion.isOverJellyBean()) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "Build.VERSION.SDK_INT is to low.");
            return false;
        }
        if (!C33549ah.m72371a(Looper.getMainLooper())) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "start, not in main looper");
            return false;
        }
        if (this.f70646c) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "start, has start before.");
            return false;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", C33770l7.m73937a("start scene: ", str));
        this.f70645b = j11;
        m73804a(str);
        this.f70646c = true;
        this.f70647d = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public DropFrameResultMeta m73806b() {
        return this.f70648e;
    }

    /* JADX INFO: renamed from: b */
    public void m73807b(C33644f7 c33644f7) {
        int i11;
        if (c33644f7 == null || c33644f7.m73013c()) {
            return;
        }
        long jM73009a = c33644f7.m73009a();
        long j11 = jM73009a / 1000000;
        long j12 = 0;
        if (j11 < 0) {
            return;
        }
        if (j11 > this.f70645b) {
            this.f70648e.suspendDuration += j11;
        }
        this.f70648e.totalDuration += j11;
        if (c33644f7.m73014d()) {
            int length = 0;
            if (jM73009a > f70642g) {
                j12 = (jM73009a - f70642g) / 1000000;
                i11 = (int) (jM73009a / f70642g);
            } else {
                i11 = 0;
            }
            long[] jArr = this.f70648e.refreshCount;
            if (i11 >= jArr.length) {
                length = jArr.length - 1;
            } else if (i11 < 0) {
                Logger.INSTANCE.mo77131e("RMonitor_looper_metric", "invalid nanoSecondDelay: " + jM73009a);
            } else {
                length = i11;
            }
            DropFrameResultMeta dropFrameResultMeta = this.f70648e;
            dropFrameResultMeta.hitchesDuration += j12;
            long[] jArr2 = dropFrameResultMeta.refreshCount;
            jArr2[length] = jArr2[length] + 1;
            long[] jArr3 = dropFrameResultMeta.refreshDuration;
            jArr3[length] = jArr3[length] + j11;
        }
        try {
            m73802a(c33644f7, j11, j12);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m73808c() {
        return !this.f70647d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m73809d() {
        return this.f70646c;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo73810e() {
        if (!C33549ah.m72371a(Looper.getMainLooper())) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "pause, not in main looper");
            return false;
        }
        if (this.f70646c && this.f70647d) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "pause scene: " + this.f70648e.scene);
            this.f70647d = false;
            return true;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "pause, isStarted: " + this.f70646c + ", isResumed: " + this.f70647d);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo73811f() {
        if (!C33549ah.m72371a(Looper.getMainLooper())) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "resume, not in main looper");
            return false;
        }
        if (this.f70646c && !this.f70647d) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "resume scene: " + this.f70648e.scene);
            this.f70647d = true;
            return true;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "resume, isStarted: " + this.f70646c + ", isResumed: " + this.f70647d);
        return false;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public boolean mo73812g() {
        if (!C33549ah.m72371a(Looper.getMainLooper())) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "stop, not in main looper");
            return false;
        }
        if (!this.f70646c) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "stop, not start yet.");
            return false;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "stop scene: " + this.f70648e.scene);
        this.f70646c = false;
        this.f70647d = false;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m73804a(String str) {
        this.f70648e.reset();
        DropFrameResultMeta dropFrameResultMeta = this.f70648e;
        dropFrameResultMeta.scene = str;
        dropFrameResultMeta.timeStamp = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public void m73803a(C33736jf c33736jf) {
        this.f70649f = c33736jf;
    }

    /* JADX INFO: renamed from: a */
    public final void m73802a(C33644f7 c33644f7, long j11, long j12) {
        long j13;
        C33736jf c33736jf;
        if (!c33644f7.m73014d() || (c33736jf = this.f70649f) == null) {
            j13 = j11;
        } else {
            j13 = j11;
            c33736jf.m73564a(c33644f7.m73012b(), j13, j12);
        }
        if (j13 <= this.f70645b || !C33660g2.m73125a(Callback.FRAME_LAG)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", Callback.FRAME_LAG);
            jSONObject.put("timeStamp", System.currentTimeMillis());
            jSONObject.put(DropFrameTable.COLUMN_SCENE, this.f70648e.scene);
            jSONObject.put("delay", j13);
            jSONObject.put("isRealUIRefreshed", c33644f7.m73014d());
            C33660g2.m73124a(jSONObject);
        } catch (Throwable unused) {
        }
    }
}

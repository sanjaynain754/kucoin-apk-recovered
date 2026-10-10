package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.C7837s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.y */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class AbstractC7799y {

    /* JADX INFO: renamed from: b */
    private final String f12081b;

    /* JADX INFO: renamed from: c */
    private final long f12082c;

    /* JADX INFO: renamed from: e */
    @GuardedBy("dialogShownLock")
    private boolean f12084e;

    /* JADX INFO: renamed from: a */
    private final C7837s f12080a = new C7837s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d */
    private final Object f12083d = new Object();

    /* JADX INFO: renamed from: b */
    public abstract Task mo13222b(Activity activity, Bundle bundle);

    /* JADX INFO: renamed from: a */
    public final Task m13270a(Activity activity, int i11) {
        synchronized (this.f12083d) {
            try {
                if (this.f12084e) {
                    return Tasks.forResult(0);
                }
                this.f12084e = true;
                this.f12080a.m13323a("checkAndShowDialog(%s)", Integer.valueOf(i11));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i11);
                bundle.putString("package.name", this.f12081b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f12082c);
                return mo13222b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractC7799y(String str, long j11) {
        this.f12081b = str;
        this.f12082c = j11;
    }
}

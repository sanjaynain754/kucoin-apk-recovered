package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC7826h;
import com.google.android.play.integrity.internal.C7810ae;
import com.google.android.play.integrity.internal.C7822d;
import com.google.android.play.integrity.internal.C7837s;
import com.google.android.play.integrity.internal.InterfaceC7844z;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bn */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7766bn {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    final C7810ae f12036a;

    /* JADX INFO: renamed from: b */
    private final C7837s f12037b;

    /* JADX INFO: renamed from: c */
    private final String f12038c;

    /* JADX INFO: renamed from: d */
    private final TaskCompletionSource f12039d;

    /* JADX INFO: renamed from: e */
    private final C7745at f12040e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC7783k f12041f;

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m13248a(C7766bn c7766bn, String str, long j11, long j12, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c7766bn.f12038c);
        bundle.putLong("cloud.prj", j11);
        bundle.putString(AuthenticationTokenClaims.JSON_KEY_NONCE, str);
        bundle.putLong("warm.up.sid", j12);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        C7822d.m13311b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C7822d.m13310a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m13249b(C7766bn c7766bn, long j11, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c7766bn.f12038c);
        bundle.putLong("cloud.prj", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        C7822d.m13311b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C7822d.m13310a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m13255k(C7766bn c7766bn) {
        return c7766bn.f12039d.getTask().isSuccessful() && ((Integer) c7766bn.f12039d.getTask().getResult()).intValue() == 0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final Task m13256c(Activity activity, Bundle bundle) {
        int i11 = bundle.getInt("dialog.intent.type");
        this.f12037b.m13326d("requestAndShowDialog(%s)", Integer.valueOf(i11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12036a.m13295t(new C7760bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i11), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public C7766bn(Context context, C7837s c7837s, C7745at c7745at, InterfaceC7783k interfaceC7783k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12039d = taskCompletionSource;
        this.f12038c = context.getPackageName();
        this.f12037b = c7837s;
        this.f12040e = c7745at;
        this.f12041f = interfaceC7783k;
        C7810ae c7810ae = new C7810ae(context, c7837s, "ExpressIntegrityService", C7767bo.f12042a, new InterfaceC7844z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.InterfaceC7844z
            /* JADX INFO: renamed from: a */
            public final Object mo13219a(IBinder iBinder) {
                return AbstractBinderC7826h.m13318b(iBinder);
            }
        }, null);
        this.f12036a = c7810ae;
        c7810ae.m13293c().post(new C7757be(this, taskCompletionSource, context));
    }

    /* JADX INFO: renamed from: d */
    public final Task m13257d(@Nullable String str, long j11, long j12, int i11) {
        this.f12037b.m13326d("requestExpressIntegrityToken(%s)", Long.valueOf(j12));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12036a.m13295t(new C7759bg(this, taskCompletionSource, 0, str, j11, j12, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: e */
    public final Task m13258e(long j11, int i11) {
        this.f12037b.m13326d("warmUpIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12036a.m13295t(new C7758bf(this, taskCompletionSource, 0, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

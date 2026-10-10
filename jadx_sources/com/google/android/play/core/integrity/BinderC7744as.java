package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.AbstractBinderC7835q;
import com.google.android.play.integrity.internal.C7810ae;
import com.google.android.play.integrity.internal.C7837s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.as */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class BinderC7744as extends AbstractBinderC7835q {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    final TaskCompletionSource f11991a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    final C7810ae f11992b;

    /* JADX INFO: renamed from: c */
    private final C7837s f11993c = new C7837s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d */
    private final String f11994d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7783k f11995e;

    /* JADX INFO: renamed from: f */
    private final Activity f11996f;

    @Override // com.google.android.play.integrity.internal.InterfaceC7836r
    /* JADX INFO: renamed from: b */
    public final void mo13232b(Bundle bundle) {
        this.f11992b.m13297v(this.f11991a);
        this.f11993c.m13326d("onRequestDialog(%s)", this.f11994d);
        ApiException apiExceptionMo13261a = this.f11995e.mo13261a(bundle);
        if (apiExceptionMo13261a != null) {
            this.f11991a.trySetException(apiExceptionMo13261a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f11993c.m13324b("onRequestDialog(%s): got null dialog intent", this.f11994d);
            this.f11991a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f11996f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(C2711C.BUFFER_FLAG_LAST_SAMPLE);
        intent.putExtra("result_receiver", new ResultReceiverC7743ar(this, this.f11992b.m13293c()));
        this.f11993c.m13323a("Starting dialog intent...", new Object[0]);
        this.f11996f.startActivityForResult(intent, 0);
    }

    public BinderC7744as(Context context, InterfaceC7783k interfaceC7783k, Activity activity, TaskCompletionSource taskCompletionSource, C7810ae c7810ae) {
        this.f11994d = context.getPackageName();
        this.f11995e = interfaceC7783k;
        this.f11991a = taskCompletionSource;
        this.f11996f = activity;
        this.f11992b = c7810ae;
    }
}

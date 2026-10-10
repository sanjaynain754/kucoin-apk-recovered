package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC7838t;
import com.google.android.play.integrity.internal.C7814ai;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.be */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7757be extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f12012a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C7766bn f12013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7757be(C7766bn c7766bn, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f12013b = c7766bn;
        this.f12012a = context;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        this.f12013b.f12039d.trySetResult(Integer.valueOf(C7814ai.m13300a(this.f12012a)));
    }
}

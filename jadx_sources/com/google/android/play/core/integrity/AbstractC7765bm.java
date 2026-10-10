package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC7838t;
import com.google.android.play.integrity.internal.C7811af;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bm */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class AbstractC7765bm extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C7766bn f12035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7765bm(@Nullable C7766bn c7766bn, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f12035f = c7766bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: a */
    public final void mo13220a(Exception exc) {
        if (!(exc instanceof C7811af)) {
            super.mo13220a(exc);
        } else if (C7766bn.m13255k(this.f12035f)) {
            super.mo13220a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo13220a(new StandardIntegrityException(-9, exc));
        }
    }
}

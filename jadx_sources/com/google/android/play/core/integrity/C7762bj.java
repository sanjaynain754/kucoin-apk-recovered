package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bj */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7762bj extends AbstractC7799y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC7763bk f12029a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7762bj(BinderC7763bk binderC7763bk, String str, long j11) {
        super(str, j11);
        this.f12029a = binderC7763bk;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7799y
    /* JADX INFO: renamed from: b */
    public final Task mo13222b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f12029a.f12032e);
        return this.f12029a.f12030c.m13256c(activity, bundle);
    }
}

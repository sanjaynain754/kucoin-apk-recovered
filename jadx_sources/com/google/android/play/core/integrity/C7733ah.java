package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ah */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7733ah extends AbstractC7799y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC7734ai f11969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7733ah(BinderC7734ai binderC7734ai, String str, long j11) {
        super(str, j11);
        this.f11969a = binderC7734ai;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7799y
    /* JADX INFO: renamed from: b */
    public final Task mo13222b(Activity activity, Bundle bundle) {
        return this.f11969a.f11970a.m13229b(activity, bundle);
    }
}

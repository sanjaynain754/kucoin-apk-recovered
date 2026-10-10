package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.br */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7770br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a */
    private final String f12047a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7799y f12048b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i11) {
        return this.f12048b.m13270a(activity, i11);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f12047a;
    }

    public C7770br(String str, AbstractC7799y abstractC7799y) {
        this.f12047a = str;
        this.f12048b = abstractC7799y;
    }
}

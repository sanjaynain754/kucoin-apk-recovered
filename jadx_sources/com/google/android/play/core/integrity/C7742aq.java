package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aq */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7742aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a */
    private final String f11988a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7799y f11989b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i11) {
        return this.f11989b.m13270a(activity, i11);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f11988a;
    }

    public C7742aq(String str, AbstractC7799y abstractC7799y) {
        this.f11988a = str;
        this.f11989b = abstractC7799y;
    }
}

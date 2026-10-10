package qf0;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: qf0.b */
/* JADX INFO: compiled from: Dip.java */
/* JADX INFO: loaded from: classes60.dex */
public class C43727b {

    /* JADX INFO: renamed from: a */
    public final float f96678a;

    /* JADX INFO: renamed from: b */
    public int m96338b(int i11) {
        return (int) ((i11 * this.f96678a) + 0.5f);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43727b m96337a(@NonNull Context context) {
        return new C43727b(context.getResources().getDisplayMetrics().density);
    }

    public C43727b(float f11) {
        this.f96678a = f11;
    }
}

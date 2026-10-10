package ue0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ue0.a */
/* JADX INFO: compiled from: BlurAlgorithm.java */
/* JADX INFO: loaded from: classes60.dex */
public interface InterfaceC45194a {
    @NonNull
    /* JADX INFO: renamed from: a */
    Bitmap.Config mo99857a();

    /* JADX INFO: renamed from: b */
    boolean mo99858b();

    /* JADX INFO: renamed from: c */
    float mo99859c();

    /* JADX INFO: renamed from: d */
    void mo99860d(@NonNull Canvas canvas, @NonNull Bitmap bitmap);

    void destroy();

    /* JADX INFO: renamed from: e */
    Bitmap mo99861e(@NonNull Bitmap bitmap, @NonNull float f11);
}

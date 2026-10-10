package p526p5;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;

/* JADX INFO: renamed from: p5.c */
/* JADX INFO: compiled from: PlatformBitmapFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC43387c {
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> m95561b(int i11, int i12, Bitmap.Config config) {
        return m95562c(i11, i12, config, null);
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0110a<Bitmap> mo95559d(int i11, int i12, Bitmap.Config config);

    /* JADX INFO: renamed from: a */
    public AbstractC0110a<Bitmap> m95560a(int i11, int i12) {
        return m95561b(i11, i12, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0110a<Bitmap> m95562c(int i11, int i12, Bitmap.Config config, Object obj) {
        return mo95559d(i11, i12, config);
    }
}

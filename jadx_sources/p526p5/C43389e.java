package p526p5;

import android.graphics.Bitmap;
import p006a4.InterfaceC0117h;

/* JADX INFO: renamed from: p5.e */
/* JADX INFO: compiled from: SimpleBitmapReleaser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43389e implements InterfaceC0117h<Bitmap> {

    /* JADX INFO: renamed from: a */
    public static C43389e f95836a;

    /* JADX INFO: renamed from: a */
    public static C43389e m95564a() {
        if (f95836a == null) {
            f95836a = new C43389e();
        }
        return f95836a;
    }

    @Override // p006a4.InterfaceC0117h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}

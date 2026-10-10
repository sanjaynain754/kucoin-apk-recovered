package p683v4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: compiled from: AnimationBackend.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC45414a extends InterfaceC45417d {

    /* JADX INFO: renamed from: v4.a$a */
    /* JADX INFO: compiled from: AnimationBackend.java */
    public interface a {
    }

    /* JADX INFO: renamed from: c */
    int mo8744c();

    void clear();

    /* JADX INFO: renamed from: d */
    int mo8745d();

    /* JADX INFO: renamed from: e */
    void mo8746e(Rect rect);

    /* JADX INFO: renamed from: f */
    void mo8747f(ColorFilter colorFilter);

    /* JADX INFO: renamed from: j */
    void mo8748j(@IntRange(from = 0, m1553to = 255) int i11);

    /* JADX INFO: renamed from: l */
    void mo8749l(a aVar);

    /* JADX INFO: renamed from: m */
    boolean mo8750m(Drawable drawable, Canvas canvas, int i11);
}

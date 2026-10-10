package p683v4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import p683v4.InterfaceC45414a;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: compiled from: AnimationBackendDelegate.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45415b<T extends InterfaceC45414a> implements InterfaceC45414a {

    /* JADX INFO: renamed from: a */
    public T f102430a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = -1, m1553to = 255)
    public int f102431b = -1;

    /* JADX INFO: renamed from: c */
    public ColorFilter f102432c;

    /* JADX INFO: renamed from: d */
    public Rect f102433d;

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: a */
    public int mo4283a() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4283a();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: b */
    public int mo4284b() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4284b();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: c */
    public int mo8744c() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return -1;
        }
        return t11.mo8744c();
    }

    @Override // p683v4.InterfaceC45414a
    public void clear() {
        T t11 = this.f102430a;
        if (t11 != null) {
            t11.clear();
        }
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: d */
    public int mo8745d() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return -1;
        }
        return t11.mo8745d();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: e */
    public void mo8746e(Rect rect) {
        T t11 = this.f102430a;
        if (t11 != null) {
            t11.mo8746e(rect);
        }
        this.f102433d = rect;
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: f */
    public void mo8747f(ColorFilter colorFilter) {
        T t11 = this.f102430a;
        if (t11 != null) {
            t11.mo8747f(colorFilter);
        }
        this.f102432c = colorFilter;
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: g */
    public int mo4285g() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4285g();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: h */
    public int mo4286h() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4286h();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: i */
    public int mo4287i(int i11) {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4287i(i11);
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: j */
    public void mo8748j(@IntRange(from = 0, m1553to = 255) int i11) {
        T t11 = this.f102430a;
        if (t11 != null) {
            t11.mo8748j(i11);
        }
        this.f102431b = i11;
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: k */
    public int mo4288k() {
        T t11 = this.f102430a;
        if (t11 == null) {
            return 0;
        }
        return t11.mo4288k();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: l */
    public void mo8749l(InterfaceC45414a.a aVar) {
        T t11 = this.f102430a;
        if (t11 != null) {
            t11.mo8749l(aVar);
        }
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: m */
    public boolean mo8750m(Drawable drawable, Canvas canvas, int i11) {
        T t11 = this.f102430a;
        return t11 != null && t11.mo8750m(drawable, canvas, i11);
    }

    public C45415b(T t11) {
        this.f102430a = t11;
    }
}

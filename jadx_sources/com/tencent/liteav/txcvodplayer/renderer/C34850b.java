package com.tencent.liteav.txcvodplayer.renderer;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34850b {

    /* JADX INFO: renamed from: a */
    int f74059a;

    /* JADX INFO: renamed from: b */
    int f74060b;

    /* JADX INFO: renamed from: c */
    int f74061c;

    /* JADX INFO: renamed from: d */
    int f74062d = 0;

    /* JADX INFO: renamed from: e */
    private WeakReference<View> f74063e;

    /* JADX INFO: renamed from: f */
    private int f74064f;

    /* JADX INFO: renamed from: g */
    private int f74065g;

    /* JADX INFO: renamed from: h */
    private int f74066h;

    /* JADX INFO: renamed from: i */
    private int f74067i;

    /* JADX INFO: renamed from: a */
    public final void m76438a(int i11, int i12) {
        this.f74064f = i11;
        this.f74065g = i12;
    }

    /* JADX INFO: renamed from: b */
    public final void m76439b(int i11, int i12) {
        this.f74066h = i11;
        this.f74067i = i12;
    }

    /* JADX INFO: renamed from: c */
    public final void m76440c(int i11, int i12) {
        int i13;
        float f11;
        int i14;
        int i15 = this.f74059a;
        if (i15 == 90 || i15 == 270) {
            i12 = i11;
            i11 = i12;
        }
        int defaultSize = View.getDefaultSize(this.f74064f, i11);
        int defaultSize2 = View.getDefaultSize(this.f74065g, i12);
        if (this.f74062d != 3) {
            if (this.f74064f <= 0 || this.f74065g <= 0) {
                i11 = defaultSize;
                i12 = defaultSize2;
            } else {
                int mode = View.MeasureSpec.getMode(i11);
                i11 = View.MeasureSpec.getSize(i11);
                int mode2 = View.MeasureSpec.getMode(i12);
                i12 = View.MeasureSpec.getSize(i12);
                if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    float f12 = i11 / i12;
                    int i16 = this.f74062d;
                    if (i16 == 4) {
                        int i17 = this.f74059a;
                        f11 = (i17 == 90 || i17 == 270) ? 0.5625f : 1.7777778f;
                    } else if (i16 != 5) {
                        f11 = this.f74064f / this.f74065g;
                        int i18 = this.f74066h;
                        if (i18 > 0 && (i14 = this.f74067i) > 0) {
                            f11 = (f11 * i18) / i14;
                        }
                    } else {
                        int i19 = this.f74059a;
                        f11 = (i19 == 90 || i19 == 270) ? 0.75f : 1.3333334f;
                    }
                    boolean z11 = f11 > f12;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            if (z11) {
                                this.f74061c = i12;
                                this.f74060b = (int) (i12 * f11);
                                return;
                            } else {
                                this.f74060b = i11;
                                this.f74061c = (int) (i11 / f11);
                                return;
                            }
                        }
                        if (i16 != 4 && i16 != 5) {
                            if (z11) {
                                int iMin = Math.min(this.f74064f, i11);
                                this.f74060b = iMin;
                                this.f74061c = (int) (iMin / f11);
                                return;
                            } else {
                                int iMin2 = Math.min(this.f74065g, i12);
                                this.f74061c = iMin2;
                                this.f74060b = (int) (iMin2 * f11);
                                return;
                            }
                        }
                    }
                    if (z11) {
                        this.f74060b = i11;
                        this.f74061c = (int) (i11 / f11);
                        return;
                    } else {
                        this.f74061c = i12;
                        this.f74060b = (int) (i12 * f11);
                        return;
                    }
                }
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i21 = this.f74064f;
                    int i22 = i21 * i12;
                    int i23 = this.f74065g;
                    if (i22 < i11 * i23) {
                        i11 = (i21 * i12) / i23;
                    } else if (i21 * i12 > i11 * i23) {
                        i12 = (i23 * i11) / i21;
                    }
                } else if (mode == 1073741824) {
                    int i24 = (this.f74065g * i11) / this.f74064f;
                    if (mode2 != Integer.MIN_VALUE || i24 <= i12) {
                        i12 = i24;
                    }
                } else if (mode2 == 1073741824) {
                    int i25 = (this.f74064f * i12) / this.f74065g;
                    if (mode != Integer.MIN_VALUE || i25 <= i11) {
                        i11 = i25;
                    }
                } else {
                    int i26 = this.f74064f;
                    int i27 = this.f74065g;
                    if (mode2 != Integer.MIN_VALUE || i27 <= i12) {
                        i13 = i26;
                        i12 = i27;
                    } else {
                        i13 = (i12 * i26) / i27;
                    }
                    if (mode != Integer.MIN_VALUE || i13 <= i11) {
                        i11 = i13;
                    } else {
                        i12 = (i27 * i11) / i26;
                    }
                }
            }
        }
        this.f74060b = i11;
        this.f74061c = i12;
    }

    public C34850b(View view) {
        this.f74063e = new WeakReference<>(view);
    }
}

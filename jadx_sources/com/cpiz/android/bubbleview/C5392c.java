package com.cpiz.android.bubbleview;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import p746x2.C45993b;

/* JADX INFO: renamed from: com.cpiz.android.bubbleview.c */
/* JADX INFO: compiled from: BubblePopupWindow.java */
/* JADX INFO: loaded from: classes34.dex */
@SuppressLint({"RtlHardcoded"})
public class C5392c extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public int f7199a;

    /* JADX INFO: renamed from: b */
    public int f7200b;

    /* JADX INFO: renamed from: c */
    public BubbleStyle f7201c;

    /* JADX INFO: renamed from: d */
    public long f7202d;

    /* JADX INFO: renamed from: e */
    public Handler f7203e;

    /* JADX INFO: renamed from: f */
    public Runnable f7204f;

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.c$a */
    /* JADX INFO: compiled from: BubblePopupWindow.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5392c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.c$b */
    /* JADX INFO: compiled from: BubblePopupWindow.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5392c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.c$d */
    /* JADX INFO: compiled from: BubblePopupWindow.java */
    public class d {

        /* JADX INFO: renamed from: a */
        public BubbleStyle.ArrowDirection f7208a;

        /* JADX INFO: renamed from: b */
        public BubbleStyle.ArrowPosPolicy f7209b;

        /* JADX INFO: renamed from: c */
        public int f7210c;

        /* JADX INFO: renamed from: d */
        public int f7211d;

        /* JADX INFO: renamed from: e */
        public int f7212e;

        /* JADX INFO: renamed from: f */
        public int f7213f;

        /* JADX INFO: renamed from: g */
        public int f7214g;

        public d() {
        }

        public /* synthetic */ d(C5392c c5392c, a aVar) {
            this();
        }
    }

    public C5392c(View view, BubbleStyle bubbleStyle) {
        super(view, -2, -2);
        this.f7199a = C45993b.m101469b(2);
        this.f7200b = 0;
        this.f7202d = 0L;
        this.f7203e = new Handler(Looper.getMainLooper());
        this.f7204f = new a();
        if (bubbleStyle == null) {
            throw new NullPointerException("Bubble can not be null");
        }
        this.f7201c = bubbleStyle;
        setBackgroundDrawable(new ColorDrawable(0));
        m7077k(true);
        m7076j(true);
    }

    /* JADX INFO: renamed from: g */
    public static Rect m7073g(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i11 = iArr[0];
        return new Rect(i11, iArr[1], view.getWidth() + i11, iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: m */
    public void m7079m(View view, BubbleStyle.ArrowDirection arrowDirection) {
        m7080n(view, arrowDirection, 0);
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.c$c */
    /* JADX INFO: compiled from: BubblePopupWindow.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7207a;

        static {
            int[] iArr = new int[BubbleStyle.ArrowDirection.values().length];
            f7207a = iArr;
            try {
                iArr[BubbleStyle.ArrowDirection.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7207a[BubbleStyle.ArrowDirection.Down.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7207a[BubbleStyle.ArrowDirection.Left.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7207a[BubbleStyle.ArrowDirection.Right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7067a(BubbleStyle.ArrowDirection arrowDirection) {
        int i11 = c.f7207a[arrowDirection.ordinal()];
        if (i11 == 1) {
            return R$style.AnimationArrowUp;
        }
        if (i11 == 2) {
            return R$style.AnimationArrowDown;
        }
        if (i11 != 3) {
            return i11 != 4 ? R$style.AnimationArrowNone : R$style.AnimationArrowRight;
        }
        return R$style.AnimationArrowLeft;
    }

    /* JADX INFO: renamed from: c */
    public static void m7069c(int i11, int i12, int i13, Rect rect, int i14, int i15, C5393d c5393d, int i16, int i17, int i18, d dVar) {
        BubbleStyle.ArrowDirection arrowDirectionM7082a = c5393d.m7082a();
        dVar.f7208a = arrowDirectionM7082a;
        dVar.f7210c = m7067a(arrowDirectionM7082a);
        dVar.f7212e = 0;
        m7071e(i11, rect, i14, c5393d, i16, i18, dVar);
        m7070d(i11, rect, c5393d, i16, i18, dVar);
        m7072f(i12, i13, rect, c5393d, i17, dVar);
        int i19 = c.f7207a[dVar.f7208a.ordinal()];
        if (i19 == 1 || i19 == 2) {
            int iM7083b = c5393d.m7083b();
            if (iM7083b == 0) {
                dVar.f7209b = BubbleStyle.ArrowPosPolicy.TargetCenter;
                return;
            }
            if (iM7083b == 3) {
                dVar.f7209b = BubbleStyle.ArrowPosPolicy.SelfBegin;
                return;
            } else if (iM7083b != 4) {
                dVar.f7209b = BubbleStyle.ArrowPosPolicy.TargetCenter;
                return;
            } else {
                dVar.f7209b = BubbleStyle.ArrowPosPolicy.SelfEnd;
                return;
            }
        }
        if (i19 != 3 && i19 != 4) {
            dVar.f7209b = BubbleStyle.ArrowPosPolicy.TargetCenter;
            return;
        }
        int iM7084c = c5393d.m7084c();
        if (iM7084c == 0) {
            dVar.f7209b = BubbleStyle.ArrowPosPolicy.TargetCenter;
            return;
        }
        if (iM7084c == 3) {
            dVar.f7209b = BubbleStyle.ArrowPosPolicy.SelfBegin;
        } else if (iM7084c != 4) {
            dVar.f7209b = BubbleStyle.ArrowPosPolicy.TargetCenter;
        } else {
            dVar.f7209b = BubbleStyle.ArrowPosPolicy.SelfEnd;
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        this.f7203e.removeCallbacks(this.f7204f);
        super.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public void m7074h(int i11) {
        this.f7200b = i11;
    }

    /* JADX INFO: renamed from: i */
    public void m7075i(long j11) {
        this.f7203e.removeCallbacks(this.f7204f);
        this.f7202d = j11;
        if (j11 > 0) {
            this.f7203e.postDelayed(this.f7204f, j11);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m7078l(int i11) {
        this.f7199a = i11;
    }

    /* JADX INFO: renamed from: n */
    public void m7080n(View view, BubbleStyle.ArrowDirection arrowDirection, int i11) {
        C5393d c5393d;
        int i12 = c.f7207a[arrowDirection.ordinal()];
        if (i12 == 1) {
            c5393d = new C5393d(0, 2);
        } else if (i12 == 2) {
            c5393d = new C5393d(0, 1);
        } else if (i12 != 3) {
            c5393d = i12 != 4 ? new C5393d(0, 0) : new C5393d(1, 0);
        } else {
            c5393d = new C5393d(2, 0);
        }
        m7081o(view, c5393d, i11, i11);
    }

    /* JADX INFO: renamed from: b */
    public static int m7068b(View view) {
        return C45993b.m101471d(view);
    }

    /* JADX INFO: renamed from: d */
    public static void m7070d(int i11, Rect rect, C5393d c5393d, int i12, int i13, d dVar) {
        int iM7083b = c5393d.m7083b();
        if (iM7083b != 0) {
            if (iM7083b != 1) {
                if (iM7083b != 2) {
                    if (iM7083b != 3) {
                        if (iM7083b != 4) {
                            return;
                        }
                        dVar.f7211d = (rect.right - i12) - i13;
                        return;
                    }
                    dVar.f7211d = ((i11 - rect.left) - i12) - i13;
                    return;
                }
                dVar.f7211d = ((i11 - rect.right) - i12) - i13;
                return;
            }
            dVar.f7211d = (rect.left - i12) - i13;
            return;
        }
        dVar.f7211d = i11 - (i13 * 2);
    }

    /* JADX INFO: renamed from: e */
    public static void m7071e(int i11, Rect rect, int i12, C5393d c5393d, int i13, int i14, d dVar) {
        int iM7083b = c5393d.m7083b();
        if (iM7083b != 0) {
            if (iM7083b != 1) {
                if (iM7083b != 2) {
                    if (iM7083b != 3) {
                        if (iM7083b != 4) {
                            return;
                        }
                        dVar.f7212e |= 5;
                        dVar.f7213f = (i11 - rect.right) + i13;
                        return;
                    }
                    dVar.f7212e |= 3;
                    dVar.f7213f = rect.left + i13;
                    return;
                }
                dVar.f7212e |= 3;
                dVar.f7213f = rect.right + i13;
                return;
            }
            dVar.f7212e |= 5;
            dVar.f7213f = (i11 - rect.left) + i13;
            return;
        }
        int i15 = (i12 / 2) + i14;
        if (rect.centerX() < i15) {
            dVar.f7212e |= 3;
            dVar.f7213f = i14;
        } else if (i11 - rect.centerX() < i15) {
            dVar.f7212e |= 5;
            dVar.f7213f = i14;
        } else {
            dVar.f7212e = 1;
            dVar.f7213f = rect.centerX() - (i11 / 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7072f(int i11, int i12, Rect rect, C5393d c5393d, int i13, d dVar) {
        int iM7084c = c5393d.m7084c();
        if (iM7084c != 0) {
            if (iM7084c != 1) {
                if (iM7084c != 2) {
                    if (iM7084c != 3) {
                        if (iM7084c != 4) {
                            return;
                        }
                        dVar.f7212e |= 80;
                        dVar.f7214g = ((i11 + i12) - rect.bottom) + i13;
                        return;
                    }
                    dVar.f7212e |= 48;
                    dVar.f7214g = rect.top + i13;
                    return;
                }
                dVar.f7212e |= 48;
                dVar.f7214g = rect.bottom + i13;
                return;
            }
            dVar.f7212e |= 80;
            dVar.f7214g = ((i11 + i12) - rect.top) + i13;
            return;
        }
        dVar.f7212e |= 16;
        dVar.f7214g = (rect.centerY() - (i12 / 2)) - (i11 / 2);
    }

    /* JADX INFO: renamed from: j */
    public void m7076j(boolean z11) {
        b bVar;
        View contentView = getContentView();
        if (z11) {
            bVar = new b();
        } else {
            bVar = null;
        }
        contentView.setOnClickListener(bVar);
    }

    /* JADX INFO: renamed from: k */
    public void m7077k(boolean z11) {
        setOutsideTouchable(z11);
        setFocusable(z11);
    }

    /* JADX INFO: renamed from: o */
    public void m7081o(View view, C5393d c5393d, int i11, int i12) {
        dismiss();
        int i13 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i14 = Resources.getSystem().getDisplayMetrics().heightPixels;
        int iM7068b = m7068b(view);
        Rect rectM7073g = m7073g(view);
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i13 - (this.f7199a * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14 - (this.f7199a * 2), Integer.MIN_VALUE));
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        Log.d("BubblePopupWindow", String.format("w:%d, h:%d", Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)));
        d dVar = new d(this, null);
        m7069c(i13, i14, iM7068b, rectM7073g, measuredWidth, measuredHeight, c5393d, i11, i12, this.f7199a, dVar);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(dVar.f7210c);
        int i15 = dVar.f7211d;
        if (measuredWidth > i15) {
            setWidth(i15);
        }
        this.f7201c.setArrowDirection(dVar.f7208a);
        this.f7201c.setArrowPosPolicy(dVar.f7209b);
        this.f7201c.setArrowTo(view);
        this.f7201c.setArrowPosDelta(this.f7200b);
        showAtLocation(view, dVar.f7212e, dVar.f7213f, dVar.f7214g);
        long j11 = this.f7202d;
        if (j11 > 0) {
            m7075i(j11);
        }
    }
}

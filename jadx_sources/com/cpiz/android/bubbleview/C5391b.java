package com.cpiz.android.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import p746x2.C45993b;
import p746x2.InterfaceC45992a;

/* JADX INFO: renamed from: com.cpiz.android.bubbleview.b */
/* JADX INFO: compiled from: BubbleImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5391b implements BubbleStyle {

    /* JADX INFO: renamed from: b */
    public View f7167b;

    /* JADX INFO: renamed from: c */
    public InterfaceC45992a f7168c;

    /* JADX INFO: renamed from: d */
    public C5390a f7169d = new C5390a();

    /* JADX INFO: renamed from: e */
    public BubbleStyle.ArrowDirection f7170e = BubbleStyle.ArrowDirection.Auto;

    /* JADX INFO: renamed from: f */
    public BubbleStyle.ArrowDirection f7171f = BubbleStyle.ArrowDirection.None;

    /* JADX INFO: renamed from: g */
    public BubbleStyle.ArrowPosPolicy f7172g = BubbleStyle.ArrowPosPolicy.TargetCenter;

    /* JADX INFO: renamed from: h */
    public WeakReference<View> f7173h = null;

    /* JADX INFO: renamed from: i */
    public int f7174i = 0;

    /* JADX INFO: renamed from: j */
    public float f7175j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f7176k = 0.0f;

    /* JADX INFO: renamed from: l */
    public float f7177l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f7178m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f7179n = 0.0f;

    /* JADX INFO: renamed from: o */
    public float f7180o = 0.0f;

    /* JADX INFO: renamed from: p */
    public float f7181p = 0.0f;

    /* JADX INFO: renamed from: q */
    public int f7182q = 0;

    /* JADX INFO: renamed from: r */
    public int f7183r = 0;

    /* JADX INFO: renamed from: s */
    public int f7184s = 0;

    /* JADX INFO: renamed from: t */
    public int f7185t = 0;

    /* JADX INFO: renamed from: u */
    public int f7186u = -872415232;

    /* JADX INFO: renamed from: v */
    public int f7187v = -1;

    /* JADX INFO: renamed from: w */
    public float f7188w = 0.0f;

    /* JADX INFO: renamed from: x */
    public float f7189x = 0.0f;

    /* JADX INFO: renamed from: y */
    public View.OnLayoutChangeListener f7190y = new a();

    /* JADX INFO: renamed from: z */
    public int[] f7191z = new int[2];

    /* JADX INFO: renamed from: A */
    public Rect f7165A = new Rect();

    /* JADX INFO: renamed from: B */
    public Rect f7166B = new Rect();

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.b$a */
    /* JADX INFO: compiled from: BubbleImpl.java */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            C5391b.this.m7061u();
        }
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.b$b */
    /* JADX INFO: compiled from: BubbleImpl.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f7193b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f7194c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f7195d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f7196e;

        public b(int i11, int i12, int i13, int i14) {
            this.f7193b = i11;
            this.f7194c = i12;
            this.f7195d = i13;
            this.f7196e = i14;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5391b.this.f7168c.mo6996a(this.f7193b, this.f7194c, this.f7195d, this.f7196e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m7043b(int i11) {
        if (i11 == 0) {
            return null;
        }
        View view = this.f7167b;
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
            View viewFindViewById = view.findViewById(i11);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.b$c */
    /* JADX INFO: compiled from: BubbleImpl.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7198a;

        static {
            int[] iArr = new int[BubbleStyle.ArrowDirection.values().length];
            f7198a = iArr;
            try {
                iArr[BubbleStyle.ArrowDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7198a[BubbleStyle.ArrowDirection.Up.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7198a[BubbleStyle.ArrowDirection.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7198a[BubbleStyle.ArrowDirection.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7198a[BubbleStyle.ArrowDirection.Auto.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7198a[BubbleStyle.ArrowDirection.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static BubbleStyle.ArrowDirection m7035g(Rect rect, Rect rect2) {
        if (!rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom)) {
            Point point = new Point(rect.centerX() - rect2.centerX(), rect.centerY() - rect2.centerY());
            if (Math.abs(point.x) < (rect.width() / 2) + (rect2.width() / 2)) {
                int i11 = point.y;
                if (i11 < 0) {
                    return BubbleStyle.ArrowDirection.Down;
                }
                if (i11 > 0) {
                    return BubbleStyle.ArrowDirection.Up;
                }
            } else if (Math.abs(point.y) < (rect.height() / 2) + (rect2.height() / 2)) {
                int i12 = point.x;
                if (i12 < 0) {
                    return BubbleStyle.ArrowDirection.Right;
                }
                if (i12 > 0) {
                    return BubbleStyle.ArrowDirection.Left;
                }
            }
        }
        return BubbleStyle.ArrowDirection.None;
    }

    /* JADX INFO: renamed from: A */
    public void m7036A(float f11) {
        this.f7188w = f11;
    }

    /* JADX INFO: renamed from: C */
    public void m7038C(float f11, float f12, float f13, float f14) {
        this.f7178m = f11;
        this.f7179n = f12;
        this.f7181p = f13;
        this.f7180o = f14;
    }

    /* JADX INFO: renamed from: D */
    public void m7039D(int i11) {
        this.f7186u = i11;
    }

    /* JADX INFO: renamed from: E */
    public void m7040E(float f11) {
        this.f7189x = f11;
    }

    /* JADX INFO: renamed from: F */
    public void m7041F(int i11, int i12, int i13, int i14) {
        if (this.f7168c == null) {
            return;
        }
        this.f7185t = 0;
        this.f7184s = 0;
        this.f7183r = 0;
        this.f7182q = 0;
        int i15 = c.f7198a[this.f7171f.ordinal()];
        if (i15 == 1) {
            this.f7182q = (int) (this.f7182q + this.f7175j);
        } else if (i15 == 2) {
            this.f7183r = (int) (this.f7183r + this.f7175j);
        } else if (i15 == 3) {
            this.f7184s = (int) (this.f7184s + this.f7175j);
        } else if (i15 == 4) {
            this.f7185t = (int) (this.f7185t + this.f7175j);
        }
        int i16 = i11 + this.f7182q;
        int i17 = i12 + this.f7183r;
        int i18 = i13 + this.f7184s;
        int i19 = i14 + this.f7185t;
        if (i16 == this.f7168c.getSuperPaddingLeft() && i17 == this.f7168c.getSuperPaddingTop() && i18 == this.f7168c.getSuperPaddingRight() && i19 == this.f7168c.getSuperPaddingBottom()) {
            return;
        }
        this.f7167b.post(new b(i16, i17, i18, i19));
    }

    /* JADX INFO: renamed from: c */
    public float m7044c() {
        return this.f7177l;
    }

    /* JADX INFO: renamed from: d */
    public BubbleStyle.ArrowPosPolicy m7045d() {
        return this.f7172g;
    }

    /* JADX INFO: renamed from: e */
    public View m7046e() {
        WeakReference<View> weakReference = this.f7173h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public float m7047f() {
        return this.f7176k;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public BubbleStyle.ArrowDirection getArrowDirection() {
        return this.f7170e;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public float getArrowHeight() {
        return this.f7175j;
    }

    /* JADX INFO: renamed from: h */
    public int m7048h() {
        return this.f7187v;
    }

    /* JADX INFO: renamed from: i */
    public float m7049i() {
        return this.f7188w;
    }

    /* JADX INFO: renamed from: j */
    public float m7050j() {
        return this.f7180o;
    }

    /* JADX INFO: renamed from: k */
    public float m7051k() {
        return this.f7181p;
    }

    /* JADX INFO: renamed from: l */
    public float m7052l() {
        return this.f7178m;
    }

    /* JADX INFO: renamed from: m */
    public float m7053m() {
        return this.f7179n;
    }

    /* JADX INFO: renamed from: n */
    public int m7054n() {
        return this.f7186u;
    }

    /* JADX INFO: renamed from: o */
    public float m7055o() {
        return this.f7189x;
    }

    /* JADX INFO: renamed from: p */
    public int m7056p() {
        return this.f7168c.getSuperPaddingBottom() - this.f7185t;
    }

    /* JADX INFO: renamed from: q */
    public int m7057q() {
        return this.f7168c.getSuperPaddingLeft() - this.f7182q;
    }

    /* JADX INFO: renamed from: r */
    public int m7058r() {
        return this.f7168c.getSuperPaddingRight() - this.f7184s;
    }

    /* JADX INFO: renamed from: s */
    public int m7059s() {
        return this.f7168c.getSuperPaddingTop() - this.f7183r;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowDirection(BubbleStyle.ArrowDirection arrowDirection) {
        this.f7170e = arrowDirection;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowPosDelta(float f11) {
        this.f7177l = f11;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowPosPolicy(BubbleStyle.ArrowPosPolicy arrowPosPolicy) {
        this.f7172g = arrowPosPolicy;
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowTo(View view) {
        this.f7174i = view != null ? view.getId() : 0;
        m7064x(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m7060t(View view, Context context, AttributeSet attributeSet) {
        this.f7167b = view;
        this.f7168c = (InterfaceC45992a) view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleStyle);
            this.f7170e = BubbleStyle.ArrowDirection.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.BubbleStyle_bb_arrowDirection, BubbleStyle.ArrowDirection.Auto.getValue()));
            this.f7175j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_arrowHeight, C45993b.m101469b(6));
            this.f7176k = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_arrowWidth, C45993b.m101469b(10));
            this.f7172g = BubbleStyle.ArrowPosPolicy.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.BubbleStyle_bb_arrowPosPolicy, BubbleStyle.ArrowPosPolicy.TargetCenter.getValue()));
            this.f7177l = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_arrowPosDelta, 0.0f);
            this.f7174i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BubbleStyle_bb_arrowTo, 0);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_cornerRadius, C45993b.m101469b(4));
            this.f7181p = dimension;
            this.f7180o = dimension;
            this.f7179n = dimension;
            this.f7178m = dimension;
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_cornerTopLeftRadius, dimension);
            this.f7178m = dimension2;
            this.f7179n = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_cornerTopRightRadius, dimension2);
            this.f7180o = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_cornerBottomLeftRadius, this.f7178m);
            this.f7181p = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_cornerBottomRightRadius, this.f7178m);
            this.f7186u = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleStyle_bb_fillColor, -872415232);
            this.f7189x = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_fillPadding, 0.0f);
            this.f7187v = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleStyle_bb_borderColor, -1);
            this.f7188w = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleStyle_bb_borderWidth, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        m7042G(this.f7167b.getWidth(), this.f7167b.getHeight(), false);
    }

    /* JADX INFO: renamed from: u */
    public void m7061u() {
        m7042G(this.f7167b.getWidth(), this.f7167b.getHeight(), true);
    }

    /* JADX INFO: renamed from: v */
    public void m7062v(float f11) {
        this.f7175j = f11;
    }

    /* JADX INFO: renamed from: w */
    public void m7063w(int i11) {
        this.f7174i = i11;
        m7064x(null);
    }

    /* JADX INFO: renamed from: x */
    public final void m7064x(View view) {
        View view2;
        WeakReference<View> weakReference = this.f7173h;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            view2.removeOnLayoutChangeListener(this.f7190y);
        }
        this.f7173h = view != null ? new WeakReference<>(view) : null;
        if (view != null) {
            view.addOnLayoutChangeListener(this.f7190y);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m7065y(float f11) {
        this.f7176k = f11;
    }

    /* JADX INFO: renamed from: z */
    public void m7066z(int i11) {
        this.f7187v = i11;
    }

    /* JADX INFO: renamed from: B */
    public void m7037B(float f11) {
        m7038C(f11, f11, f11, f11);
    }

    /* JADX INFO: renamed from: G */
    public void m7042G(int i11, int i12, boolean z11) {
        int iCenterY;
        int i13;
        View viewM7046e = m7046e();
        if (viewM7046e == null && (i13 = this.f7174i) != 0) {
            viewM7046e = m7043b(i13);
            m7064x(viewM7046e);
        }
        this.f7171f = this.f7170e;
        int iCenterX = 0;
        if (viewM7046e != null) {
            viewM7046e.getLocationOnScreen(this.f7191z);
            Rect rect = this.f7165A;
            int[] iArr = this.f7191z;
            int i14 = iArr[0];
            rect.set(i14, iArr[1], viewM7046e.getWidth() + i14, this.f7191z[1] + viewM7046e.getHeight());
            this.f7167b.getLocationOnScreen(this.f7191z);
            Rect rect2 = this.f7166B;
            int[] iArr2 = this.f7191z;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            rect2.set(i15, i16, i15 + i11, i16 + i12);
            if (this.f7171f == BubbleStyle.ArrowDirection.Auto) {
                this.f7171f = m7035g(this.f7166B, this.f7165A);
            }
            iCenterX = this.f7165A.centerX() - this.f7166B.centerX();
            iCenterY = this.f7165A.centerY() - this.f7166B.centerY();
        } else {
            iCenterY = 0;
        }
        m7041F(this.f7167b.getPaddingLeft(), this.f7167b.getPaddingTop(), this.f7167b.getPaddingRight(), this.f7167b.getPaddingBottom());
        if (z11) {
            this.f7169d.m7019m(i11, i12);
            this.f7169d.m7028v(this.f7178m, this.f7179n, this.f7181p, this.f7180o);
            this.f7169d.m7029w(this.f7186u);
            this.f7169d.m7027u(this.f7188w);
            this.f7169d.m7030x(this.f7189x);
            this.f7169d.m7026t(this.f7187v);
            this.f7169d.m7020n(this.f7171f);
            this.f7169d.m7023q(this.f7172g);
            this.f7169d.m7024r(iCenterX, iCenterY);
            this.f7169d.m7022p(this.f7177l);
            this.f7169d.m7021o(this.f7175j);
            this.f7169d.m7025s(this.f7176k);
            this.f7169d.m7008D();
            this.f7167b.setBackground(this.f7169d);
        }
    }
}

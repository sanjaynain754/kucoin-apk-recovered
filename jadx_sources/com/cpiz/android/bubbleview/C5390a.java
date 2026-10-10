package com.cpiz.android.bubbleview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p746x2.C45993b;

/* JADX INFO: renamed from: com.cpiz.android.bubbleview.a */
/* JADX INFO: compiled from: BubbleDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5390a extends Drawable {

    /* JADX INFO: renamed from: c */
    public b f7139c;

    /* JADX INFO: renamed from: d */
    public b f7140d;

    /* JADX INFO: renamed from: e */
    public b f7141e;

    /* JADX INFO: renamed from: a */
    public BubbleStyle.ArrowDirection f7137a = BubbleStyle.ArrowDirection.None;

    /* JADX INFO: renamed from: b */
    public BubbleStyle.ArrowPosPolicy f7138b = BubbleStyle.ArrowPosPolicy.TargetCenter;

    /* JADX INFO: renamed from: f */
    public Paint f7142f = new Paint(1);

    /* JADX INFO: renamed from: g */
    public Path f7143g = new Path();

    /* JADX INFO: renamed from: h */
    public Paint f7144h = new Paint(1);

    /* JADX INFO: renamed from: i */
    public Path f7145i = new Path();

    /* JADX INFO: renamed from: j */
    public float f7146j = 0.0f;

    /* JADX INFO: renamed from: k */
    public int f7147k = -872415232;

    /* JADX INFO: renamed from: l */
    public int f7148l = -1;

    /* JADX INFO: renamed from: m */
    public PointF f7149m = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: n */
    public RectF f7150n = new RectF();

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.a$b */
    /* JADX INFO: compiled from: BubbleDrawable.java */
    public class b {

        /* JADX INFO: renamed from: a */
        public RectF f7153a;

        /* JADX INFO: renamed from: b */
        public float f7154b;

        /* JADX INFO: renamed from: c */
        public float f7155c;

        /* JADX INFO: renamed from: d */
        public float f7156d;

        /* JADX INFO: renamed from: e */
        public float f7157e;

        /* JADX INFO: renamed from: f */
        public float f7158f;

        /* JADX INFO: renamed from: g */
        public float f7159g;

        /* JADX INFO: renamed from: h */
        public float f7160h;

        /* JADX INFO: renamed from: i */
        public float f7161i;

        /* JADX INFO: renamed from: j */
        public float f7162j;

        /* JADX INFO: renamed from: k */
        public float f7163k;

        public b() {
            this.f7153a = new RectF();
            this.f7154b = 0.0f;
            this.f7155c = 0.0f;
            this.f7156d = 0.0f;
            this.f7157e = 0.0f;
            this.f7158f = 0.0f;
            this.f7159g = 0.0f;
            this.f7160h = 0.0f;
            this.f7161i = 0.0f;
            this.f7162j = 0.0f;
            this.f7163k = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m7033a(b bVar) {
            this.f7153a.set(bVar.f7153a);
            this.f7154b = bVar.f7154b;
            this.f7155c = bVar.f7155c;
            this.f7156d = bVar.f7156d;
            this.f7157e = bVar.f7157e;
            this.f7158f = bVar.f7158f;
            this.f7159g = bVar.f7159g;
            this.f7160h = bVar.f7160h;
            this.f7161i = bVar.f7161i;
            this.f7162j = bVar.f7162j;
            this.f7163k = bVar.f7163k;
        }

        public /* synthetic */ b(C5390a c5390a, a aVar) {
            this();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    /* JADX INFO: renamed from: com.cpiz.android.bubbleview.a$a */
    /* JADX INFO: compiled from: BubbleDrawable.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7151a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f7152b;

        static {
            int[] iArr = new int[BubbleStyle.ArrowPosPolicy.values().length];
            f7152b = iArr;
            try {
                iArr[BubbleStyle.ArrowPosPolicy.TargetCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7152b[BubbleStyle.ArrowPosPolicy.SelfCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7152b[BubbleStyle.ArrowPosPolicy.SelfBegin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7152b[BubbleStyle.ArrowPosPolicy.SelfEnd.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[BubbleStyle.ArrowDirection.values().length];
            f7151a = iArr2;
            try {
                iArr2[BubbleStyle.ArrowDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7151a[BubbleStyle.ArrowDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7151a[BubbleStyle.ArrowDirection.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7151a[BubbleStyle.ArrowDirection.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m7003A(BubbleStyle.ArrowDirection arrowDirection, b bVar, b bVar2) {
        int i11 = a.f7151a[arrowDirection.ordinal()];
        if (i11 == 1) {
            bVar2.f7158f = bVar2.f7153a.left - bVar2.f7155c;
            bVar2.f7159g = bVar.f7159g;
            return;
        }
        if (i11 == 2) {
            bVar2.f7158f = bVar2.f7153a.right + bVar2.f7155c;
            bVar2.f7159g = bVar.f7159g;
        } else if (i11 == 3) {
            bVar2.f7158f = bVar.f7158f;
            bVar2.f7159g = bVar2.f7153a.top - bVar2.f7155c;
        } else {
            if (i11 != 4) {
                return;
            }
            bVar2.f7158f = bVar.f7158f;
            bVar2.f7159g = bVar2.f7153a.bottom + bVar2.f7155c;
        }
    }

    /* JADX INFO: renamed from: k */
    public static float m7004k(BubbleStyle.ArrowPosPolicy arrowPosPolicy, PointF pointF, b bVar) {
        int i11 = a.f7152b[arrowPosPolicy.ordinal()];
        if (i11 == 1) {
            return bVar.f7153a.centerY() + pointF.y;
        }
        if (i11 == 2) {
            return bVar.f7153a.centerY();
        }
        if (i11 == 3) {
            return bVar.f7153a.top + bVar.f7157e;
        }
        if (i11 != 4) {
            return 0.0f;
        }
        return bVar.f7153a.bottom - bVar.f7157e;
    }

    /* JADX INFO: renamed from: l */
    public static float m7005l(BubbleStyle.ArrowPosPolicy arrowPosPolicy, PointF pointF, b bVar) {
        int i11 = a.f7152b[arrowPosPolicy.ordinal()];
        if (i11 == 1) {
            return bVar.f7153a.centerX() + pointF.x;
        }
        if (i11 == 2) {
            return bVar.f7153a.centerX();
        }
        if (i11 == 3) {
            return bVar.f7153a.left + bVar.f7157e;
        }
        if (i11 != 4) {
            return 0.0f;
        }
        return bVar.f7153a.right - bVar.f7157e;
    }

    /* JADX INFO: renamed from: B */
    public final void m7006B() {
        this.f7141e.m7033a(this.f7140d);
        b bVar = this.f7141e;
        bVar.f7154b = 0.0f;
        RectF rectF = bVar.f7153a;
        b bVar2 = this.f7139c;
        float f11 = bVar2.f7153a.left + bVar2.f7154b + this.f7146j + (this.f7137a.isLeft() ? this.f7139c.f7155c : 0.0f);
        b bVar3 = this.f7139c;
        float f12 = bVar3.f7153a.top + bVar3.f7154b + this.f7146j + (this.f7137a.isUp() ? this.f7139c.f7155c : 0.0f);
        b bVar4 = this.f7139c;
        float f13 = ((bVar4.f7153a.right - bVar4.f7154b) - this.f7146j) - (this.f7137a.isRight() ? this.f7139c.f7155c : 0.0f);
        b bVar5 = this.f7139c;
        rectF.set(f11, f12, f13, ((bVar5.f7153a.bottom - bVar5.f7154b) - this.f7146j) - (this.f7137a.isDown() ? this.f7139c.f7155c : 0.0f));
        b bVar6 = this.f7141e;
        b bVar7 = this.f7139c;
        bVar6.f7160h = Math.max(0.0f, (bVar7.f7160h - (bVar7.f7154b / 2.0f)) - this.f7146j);
        b bVar8 = this.f7141e;
        b bVar9 = this.f7139c;
        bVar8.f7161i = Math.max(0.0f, (bVar9.f7161i - (bVar9.f7154b / 2.0f)) - this.f7146j);
        b bVar10 = this.f7141e;
        b bVar11 = this.f7139c;
        bVar10.f7162j = Math.max(0.0f, (bVar11.f7162j - (bVar11.f7154b / 2.0f)) - this.f7146j);
        b bVar12 = this.f7141e;
        b bVar13 = this.f7139c;
        bVar12.f7163k = Math.max(0.0f, (bVar13.f7163k - (bVar13.f7154b / 2.0f)) - this.f7146j);
        b bVar14 = this.f7139c;
        float f14 = bVar14.f7156d;
        double dSin = ((double) f14) - (((double) (((bVar14.f7154b / 2.0f) + this.f7146j) * 2.0f)) / Math.sin(Math.atan(bVar14.f7155c / (f14 / 2.0f))));
        b bVar15 = this.f7139c;
        double d11 = dSin * ((double) bVar15.f7155c);
        float f15 = bVar15.f7156d;
        b bVar16 = this.f7141e;
        float f16 = (float) ((d11 / ((double) f15)) + ((double) (bVar15.f7154b / 2.0f)) + ((double) this.f7146j));
        bVar16.f7155c = f16;
        bVar16.f7156d = (f16 * f15) / bVar15.f7155c;
        m7003A(this.f7137a, this.f7140d, bVar16);
        m7007C(this.f7141e, this.f7145i);
    }

    /* JADX INFO: renamed from: a */
    public final void m7009a(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        float f11 = rectF.left;
        float f12 = rectF.bottom;
        float f13 = bVar.f7162j;
        m7018j(path, f11, f12 - (f13 * 2.0f), f11 + (f13 * 2.0f), f12, 90.0f, 90.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m7010b(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        float f11 = rectF.right;
        float f12 = bVar.f7163k;
        float f13 = rectF.bottom;
        m7018j(path, f11 - (f12 * 2.0f), f13 - (f12 * 2.0f), f11, f13, 0.0f, 90.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m7011c(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = bVar.f7160h;
        m7018j(path, f11, f12, f11 + (f13 * 2.0f), f12 + (f13 * 2.0f), 180.0f, 90.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7012d(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        float f11 = rectF.right;
        float f12 = bVar.f7161i;
        float f13 = rectF.top;
        m7018j(path, f11 - (f12 * 2.0f), f13, f11, f13 + (f12 * 2.0f), 270.0f, 90.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f7144h.setStyle(Paint.Style.FILL);
        this.f7144h.setColor(this.f7147k);
        canvas.drawPath(this.f7145i, this.f7144h);
        if (this.f7140d.f7154b > 0.0f) {
            this.f7142f.setStyle(Paint.Style.STROKE);
            this.f7142f.setStrokeCap(Paint.Cap.ROUND);
            this.f7142f.setStrokeJoin(Paint.Join.ROUND);
            this.f7142f.setStrokeWidth(this.f7140d.f7154b);
            this.f7142f.setColor(this.f7148l);
            canvas.drawPath(this.f7143g, this.f7142f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7013e(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        path.moveTo(bVar.f7158f, bVar.f7159g);
        path.lineTo(bVar.f7158f - (bVar.f7156d / 2.0f), rectF.bottom);
        path.lineTo(rectF.left + bVar.f7162j, rectF.bottom);
        m7009a(bVar, path);
        path.lineTo(rectF.left, rectF.top + bVar.f7160h);
        m7011c(bVar, path);
        path.lineTo(rectF.right - bVar.f7161i, rectF.top);
        m7012d(bVar, path);
        path.lineTo(rectF.right, rectF.bottom - bVar.f7163k);
        m7010b(bVar, path);
        path.lineTo(bVar.f7158f + (bVar.f7156d / 2.0f), rectF.bottom);
        path.lineTo(bVar.f7158f, bVar.f7159g);
    }

    /* JADX INFO: renamed from: f */
    public final void m7014f(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        path.moveTo(bVar.f7158f, bVar.f7159g);
        path.lineTo(rectF.left, bVar.f7159g - (bVar.f7156d / 2.0f));
        path.lineTo(rectF.left, rectF.top + bVar.f7160h);
        m7011c(bVar, path);
        path.lineTo(rectF.right - bVar.f7161i, rectF.top);
        m7012d(bVar, path);
        path.lineTo(rectF.right, rectF.bottom - bVar.f7163k);
        m7010b(bVar, path);
        path.lineTo(rectF.left + bVar.f7162j, rectF.bottom);
        m7009a(bVar, path);
        path.lineTo(rectF.left, bVar.f7159g + (bVar.f7156d / 2.0f));
        path.lineTo(bVar.f7158f, bVar.f7159g);
    }

    /* JADX INFO: renamed from: g */
    public final void m7015g(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        path.moveTo(rectF.left, rectF.top + bVar.f7160h);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = bVar.f7160h;
        m7018j(path, f11, f12, f11 + (f13 * 2.0f), f12 + (f13 * 2.0f), 180.0f, 90.0f);
        path.lineTo(rectF.right - bVar.f7161i, rectF.top);
        m7012d(bVar, path);
        path.lineTo(rectF.right, rectF.bottom - bVar.f7163k);
        m7010b(bVar, path);
        path.lineTo(rectF.left + bVar.f7162j, rectF.bottom);
        m7009a(bVar, path);
        path.lineTo(rectF.left, rectF.top + bVar.f7160h);
    }

    /* JADX INFO: renamed from: h */
    public final void m7016h(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        path.moveTo(bVar.f7158f, bVar.f7159g);
        path.lineTo(rectF.right, bVar.f7159g + (bVar.f7156d / 2.0f));
        path.lineTo(rectF.right, rectF.bottom - bVar.f7163k);
        m7010b(bVar, path);
        path.lineTo(rectF.left + bVar.f7162j, rectF.bottom);
        m7009a(bVar, path);
        path.lineTo(rectF.left, rectF.top + bVar.f7160h);
        m7011c(bVar, path);
        path.lineTo(rectF.right - bVar.f7161i, rectF.top);
        m7012d(bVar, path);
        path.lineTo(rectF.right, bVar.f7159g - (bVar.f7156d / 2.0f));
        path.lineTo(bVar.f7158f, bVar.f7159g);
    }

    /* JADX INFO: renamed from: i */
    public final void m7017i(b bVar, Path path) {
        RectF rectF = bVar.f7153a;
        path.moveTo(bVar.f7158f, bVar.f7159g);
        path.lineTo(bVar.f7158f + (bVar.f7156d / 2.0f), rectF.top);
        path.lineTo(rectF.right - bVar.f7161i, rectF.top);
        m7012d(bVar, path);
        path.lineTo(rectF.right, rectF.bottom - bVar.f7163k);
        m7010b(bVar, path);
        path.lineTo(rectF.left + bVar.f7162j, rectF.bottom);
        m7009a(bVar, path);
        path.lineTo(rectF.left, rectF.top + bVar.f7160h);
        m7011c(bVar, path);
        path.lineTo(bVar.f7158f - (bVar.f7156d / 2.0f), rectF.top);
        path.lineTo(bVar.f7158f, bVar.f7159g);
    }

    /* JADX INFO: renamed from: j */
    public final void m7018j(Path path, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f7150n.set(f11, f12, f13, f14);
        path.arcTo(this.f7150n, f15, f16);
    }

    /* JADX INFO: renamed from: m */
    public void m7019m(int i11, int i12) {
        this.f7139c.f7153a.set(0.0f, 0.0f, i11, i12);
    }

    /* JADX INFO: renamed from: n */
    public void m7020n(BubbleStyle.ArrowDirection arrowDirection) {
        this.f7137a = arrowDirection;
    }

    /* JADX INFO: renamed from: o */
    public void m7021o(float f11) {
        this.f7139c.f7155c = f11;
    }

    /* JADX INFO: renamed from: p */
    public void m7022p(float f11) {
        this.f7139c.f7157e = f11;
    }

    /* JADX INFO: renamed from: q */
    public void m7023q(BubbleStyle.ArrowPosPolicy arrowPosPolicy) {
        this.f7138b = arrowPosPolicy;
    }

    /* JADX INFO: renamed from: r */
    public void m7024r(float f11, float f12) {
        PointF pointF = this.f7149m;
        pointF.x = f11;
        pointF.y = f12;
    }

    /* JADX INFO: renamed from: s */
    public void m7025s(float f11) {
        this.f7139c.f7156d = f11;
    }

    /* JADX INFO: renamed from: t */
    public void m7026t(int i11) {
        this.f7148l = i11;
    }

    /* JADX INFO: renamed from: u */
    public void m7027u(float f11) {
        this.f7139c.f7154b = f11;
    }

    /* JADX INFO: renamed from: v */
    public void m7028v(float f11, float f12, float f13, float f14) {
        b bVar = this.f7139c;
        bVar.f7160h = f11;
        bVar.f7161i = f12;
        bVar.f7163k = f13;
        bVar.f7162j = f14;
    }

    /* JADX INFO: renamed from: w */
    public void m7029w(int i11) {
        this.f7147k = i11;
    }

    /* JADX INFO: renamed from: x */
    public void m7030x(float f11) {
        this.f7146j = f11;
    }

    /* JADX INFO: renamed from: y */
    public final void m7031y(BubbleStyle.ArrowDirection arrowDirection, BubbleStyle.ArrowPosPolicy arrowPosPolicy, PointF pointF, b bVar) {
        int i11 = a.f7151a[arrowDirection.ordinal()];
        if (i11 == 1) {
            RectF rectF = bVar.f7153a;
            bVar.f7158f = rectF.left - bVar.f7155c;
            bVar.f7159g = C45993b.m101468a(rectF.top + bVar.f7160h + (bVar.f7156d / 2.0f) + (bVar.f7154b / 2.0f), m7004k(arrowPosPolicy, pointF, bVar), ((bVar.f7153a.bottom - bVar.f7162j) - (bVar.f7156d / 2.0f)) - (bVar.f7154b / 2.0f));
        } else if (i11 == 2) {
            RectF rectF2 = bVar.f7153a;
            bVar.f7158f = rectF2.right + bVar.f7155c;
            bVar.f7159g = C45993b.m101468a(rectF2.top + bVar.f7161i + (bVar.f7156d / 2.0f) + (bVar.f7154b / 2.0f), m7004k(arrowPosPolicy, pointF, bVar), ((bVar.f7153a.bottom - bVar.f7163k) - (bVar.f7156d / 2.0f)) - (bVar.f7154b / 2.0f));
        } else if (i11 == 3) {
            bVar.f7158f = C45993b.m101468a(bVar.f7153a.left + bVar.f7160h + (bVar.f7156d / 2.0f) + (bVar.f7154b / 2.0f), m7005l(arrowPosPolicy, pointF, bVar), ((bVar.f7153a.right - bVar.f7161i) - (bVar.f7156d / 2.0f)) - (bVar.f7154b / 2.0f));
            bVar.f7159g = bVar.f7153a.top - bVar.f7155c;
        } else {
            if (i11 != 4) {
                return;
            }
            bVar.f7158f = C45993b.m101468a(bVar.f7153a.left + bVar.f7162j + (bVar.f7156d / 2.0f) + (bVar.f7154b / 2.0f), m7005l(arrowPosPolicy, pointF, bVar), ((bVar.f7153a.right - bVar.f7163k) - (bVar.f7156d / 2.0f)) - (bVar.f7154b / 2.0f));
            bVar.f7159g = bVar.f7153a.bottom + bVar.f7155c;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7032z() {
        this.f7140d.m7033a(this.f7139c);
        RectF rectF = this.f7140d.f7153a;
        b bVar = this.f7139c;
        float f11 = bVar.f7153a.left + (bVar.f7154b / 2.0f) + (this.f7137a.isLeft() ? this.f7139c.f7155c : 0.0f);
        b bVar2 = this.f7139c;
        float f12 = bVar2.f7153a.top + (bVar2.f7154b / 2.0f) + (this.f7137a.isUp() ? this.f7139c.f7155c : 0.0f);
        b bVar3 = this.f7139c;
        float f13 = (bVar3.f7153a.right - (bVar3.f7154b / 2.0f)) - (this.f7137a.isRight() ? this.f7139c.f7155c : 0.0f);
        b bVar4 = this.f7139c;
        rectF.set(f11, f12, f13, (bVar4.f7153a.bottom - (bVar4.f7154b / 2.0f)) - (this.f7137a.isDown() ? this.f7139c.f7155c : 0.0f));
        m7031y(this.f7137a, this.f7138b, this.f7149m, this.f7140d);
        m7007C(this.f7140d, this.f7143g);
    }

    public C5390a() {
        a aVar = null;
        this.f7139c = new b(this, aVar);
        this.f7140d = new b(this, aVar);
        this.f7141e = new b(this, aVar);
    }

    /* JADX INFO: renamed from: C */
    public final void m7007C(b bVar, Path path) {
        path.reset();
        int i11 = a.f7151a[this.f7137a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        m7015g(bVar, path);
                        return;
                    } else {
                        m7013e(bVar, path);
                        return;
                    }
                }
                m7017i(bVar, path);
                return;
            }
            m7016h(bVar, path);
            return;
        }
        m7014f(bVar, path);
    }

    /* JADX INFO: renamed from: D */
    public void m7008D() {
        m7032z();
        m7006B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

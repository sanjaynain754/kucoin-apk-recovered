package m10;

import android.annotation.SuppressLint;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.kubi.sdk.widget.shape.drawable.ShapeGradientOrientation;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: renamed from: m10.b */
/* JADX INFO: compiled from: ShapeDrawable.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42388b extends Drawable {

    /* JADX INFO: renamed from: a */
    public C42389c f93929a;

    /* JADX INFO: renamed from: b */
    public final Paint f93930b;

    /* JADX INFO: renamed from: c */
    public Rect f93931c;

    /* JADX INFO: renamed from: d */
    public final Paint f93932d;

    /* JADX INFO: renamed from: e */
    public Paint f93933e;

    /* JADX INFO: renamed from: f */
    public ColorFilter f93934f;

    /* JADX INFO: renamed from: g */
    public int f93935g;

    /* JADX INFO: renamed from: h */
    public boolean f93936h;

    /* JADX INFO: renamed from: i */
    public final Path f93937i;

    /* JADX INFO: renamed from: j */
    public final RectF f93938j;

    /* JADX INFO: renamed from: k */
    public final RectF f93939k;

    /* JADX INFO: renamed from: l */
    public final Path f93940l;

    /* JADX INFO: renamed from: m */
    public Paint f93941m;

    /* JADX INFO: renamed from: n */
    public boolean f93942n;

    /* JADX INFO: renamed from: o */
    public boolean f93943o;

    /* JADX INFO: renamed from: p */
    public Path f93944p;

    /* JADX INFO: renamed from: q */
    public boolean f93945q;

    public C42388b() {
        this(new C42389c());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x008c. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public final boolean m93021b() {
        float[] fArr;
        float level;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        if (this.f93942n) {
            this.f93942n = false;
            Rect bounds = getBounds();
            float strokeWidth = this.f93932d.getStrokeWidth() * 0.5f;
            C42389c c42389c = this.f93929a;
            float f27 = bounds.left + strokeWidth;
            int i11 = c42389c.f93954H;
            float f28 = f27 + i11;
            float f29 = bounds.top + strokeWidth + i11;
            float f31 = (bounds.right - strokeWidth) - i11;
            float f32 = (bounds.bottom - strokeWidth) - i11;
            this.f93938j.set(f28, f29, f31, f32);
            C42389c c42389c2 = this.f93929a;
            int i12 = c42389c2.f93956J;
            if (i12 > 0) {
                f28 += i12;
            } else {
                f31 += i12;
            }
            int i13 = c42389c2.f93957K;
            if (i13 > 0) {
                f29 += i13;
            } else {
                f32 += i13;
            }
            this.f93939k.set(f28, f29, f31, f32);
            float[] fArr2 = null;
            if (c42389c.f93963e == null) {
                this.f93930b.setShader(null);
            }
            if (c42389c.f93964f == null) {
                this.f93932d.setShader(null);
            }
            int[] iArr = c42389c.f93963e;
            if (iArr != null || c42389c.f93964f != null) {
                RectF rectF = this.f93938j;
                int i14 = c42389c.f93961c;
                if (i14 == 0) {
                    level = c42389c.f93951E ? getLevel() / 10000.0f : 1.0f;
                    switch (a.f93946a[c42389c.f93962d.ordinal()]) {
                        case 1:
                            f11 = rectF.left;
                            f12 = rectF.top;
                            f13 = rectF.bottom;
                            f22 = level * f13;
                            f23 = f11;
                            f24 = f23;
                            f25 = f12;
                            f26 = f22;
                            break;
                        case 2:
                            f14 = rectF.right;
                            f15 = rectF.top;
                            f16 = rectF.left * level;
                            f17 = rectF.bottom;
                            f22 = level * f17;
                            f23 = f14;
                            f25 = f15;
                            f24 = f16;
                            f26 = f22;
                            break;
                        case 3:
                            f18 = rectF.right;
                            f19 = rectF.top;
                            f21 = rectF.left;
                            f23 = f18;
                            f25 = f19;
                            f26 = f25;
                            f24 = f21 * level;
                            break;
                        case 4:
                            f14 = rectF.right;
                            f15 = rectF.bottom;
                            f16 = rectF.left * level;
                            f17 = rectF.top;
                            f22 = level * f17;
                            f23 = f14;
                            f25 = f15;
                            f24 = f16;
                            f26 = f22;
                            break;
                        case 5:
                            f11 = rectF.left;
                            f12 = rectF.bottom;
                            f13 = rectF.top;
                            f22 = level * f13;
                            f23 = f11;
                            f24 = f23;
                            f25 = f12;
                            f26 = f22;
                            break;
                        case 6:
                            f14 = rectF.left;
                            f15 = rectF.bottom;
                            f16 = rectF.right * level;
                            f17 = rectF.top;
                            f22 = level * f17;
                            f23 = f14;
                            f25 = f15;
                            f24 = f16;
                            f26 = f22;
                            break;
                        case 7:
                            f18 = rectF.left;
                            f19 = rectF.top;
                            f21 = rectF.right;
                            f23 = f18;
                            f25 = f19;
                            f26 = f25;
                            f24 = f21 * level;
                            break;
                        default:
                            f14 = rectF.left;
                            f15 = rectF.top;
                            f16 = rectF.right * level;
                            f17 = rectF.bottom;
                            f22 = level * f17;
                            f23 = f14;
                            f25 = f15;
                            f24 = f16;
                            f26 = f22;
                            break;
                    }
                    if (c42389c.f93963e != null) {
                        this.f93930b.setShader(new LinearGradient(f23, f25, f24, f26, c42389c.f93963e, c42389c.f93969k, Shader.TileMode.CLAMP));
                    }
                    if (c42389c.f93964f != null) {
                        this.f93932d.setShader(new LinearGradient(f23, f25, f24, f26, c42389c.f93964f, c42389c.f93969k, Shader.TileMode.CLAMP));
                    }
                } else if (i14 == 1) {
                    float f33 = rectF.left;
                    float f34 = f33 + ((rectF.right - f33) * c42389c.f93948B);
                    float f35 = rectF.top;
                    float f36 = f35 + ((rectF.bottom - f35) * c42389c.f93949C);
                    level = c42389c.f93951E ? getLevel() / 10000.0f : 1.0f;
                    if (c42389c.f93963e != null) {
                        this.f93930b.setShader(new RadialGradient(f34, f36, level * c42389c.f93950D, c42389c.f93963e, (float[]) null, Shader.TileMode.CLAMP));
                    }
                    if (c42389c.f93964f != null) {
                        this.f93932d.setShader(new RadialGradient(f34, f36, level * c42389c.f93950D, c42389c.f93964f, (float[]) null, Shader.TileMode.CLAMP));
                    }
                } else if (i14 == 2) {
                    float f37 = rectF.left;
                    float f38 = f37 + ((rectF.right - f37) * c42389c.f93948B);
                    float f39 = rectF.top;
                    float f41 = f39 + ((rectF.bottom - f39) * c42389c.f93949C);
                    if (iArr != null) {
                        if (c42389c.f93951E) {
                            int[] iArr2 = c42389c.f93965g;
                            int length = iArr.length;
                            if (iArr2 == null || iArr2.length != length + 1) {
                                iArr2 = new int[length + 1];
                                c42389c.f93965g = iArr2;
                            }
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                            int i15 = length - 1;
                            iArr2[length] = c42389c.f93963e[i15];
                            float[] fArr3 = c42389c.f93967i;
                            float f42 = 1.0f / i15;
                            if (fArr3 == null || fArr3.length != length + 1) {
                                fArr3 = new float[length + 1];
                                c42389c.f93967i = fArr3;
                            }
                            float level2 = getLevel() / 10000.0f;
                            for (int i16 = 0; i16 < length; i16++) {
                                fArr3[i16] = i16 * f42 * level2;
                            }
                            fArr3[length] = 1.0f;
                            int[] iArr3 = iArr2;
                            fArr = fArr3;
                            iArr = iArr3;
                        } else {
                            fArr = null;
                        }
                        this.f93930b.setShader(new SweepGradient(f38, f41, iArr, fArr));
                    }
                    int[] iArr4 = c42389c.f93964f;
                    if (iArr4 != null) {
                        if (c42389c.f93951E) {
                            int[] iArr5 = c42389c.f93966h;
                            int length2 = iArr4.length;
                            if (iArr5 == null || iArr5.length != length2 + 1) {
                                iArr5 = new int[length2 + 1];
                                c42389c.f93966h = iArr5;
                            }
                            System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            int i17 = length2 - 1;
                            iArr5[length2] = c42389c.f93964f[i17];
                            float[] fArr4 = c42389c.f93968j;
                            float f43 = 1.0f / i17;
                            if (fArr4 == null || fArr4.length != length2 + 1) {
                                fArr4 = new float[length2 + 1];
                                c42389c.f93968j = fArr4;
                            }
                            float level3 = getLevel() / 10000.0f;
                            for (int i18 = 0; i18 < length2; i18++) {
                                fArr4[i18] = i18 * f43 * level3;
                            }
                            fArr4[length2] = 1.0f;
                            int[] iArr6 = iArr5;
                            fArr2 = fArr4;
                            iArr4 = iArr6;
                        }
                        this.f93932d.setShader(new SweepGradient(f38, f41, iArr4, fArr2));
                    }
                }
                if (!c42389c.f93970l) {
                    this.f93930b.setColor(ViewCompat.MEASURED_STATE_MASK);
                }
                if (!c42389c.f93971m) {
                    this.f93932d.setColor(ViewCompat.MEASURED_STATE_MASK);
                }
            }
        }
        return !this.f93938j.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"WrongConstant"})
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        float f11;
        int i11;
        Canvas canvas3;
        int absoluteGravity;
        float f12;
        float f13;
        float f14;
        float fCenterY;
        float f15;
        if (m93021b()) {
            int alpha = this.f93930b.getAlpha();
            int alpha2 = this.f93932d.getAlpha();
            int iM93023d = m93023d(alpha);
            int iM93023d2 = m93023d(alpha2);
            boolean z11 = this.f93929a.f93954H > 0;
            boolean z12 = iM93023d2 > 0 && this.f93932d.getStrokeWidth() > 0.0f;
            boolean z13 = iM93023d > 0;
            C42389c c42389c = this.f93929a;
            boolean z14 = z12 && z13 && c42389c.f93960b != 2 && iM93023d2 < 255 && (this.f93935g < 255 || this.f93934f != null);
            if (z14) {
                if (this.f93941m == null) {
                    this.f93941m = new Paint();
                }
                this.f93941m.setDither(this.f93936h);
                this.f93941m.setAlpha(this.f93935g);
                this.f93941m.setColorFilter(this.f93934f);
                float strokeWidth = this.f93932d.getStrokeWidth();
                RectF rectF = this.f93938j;
                f11 = 0.0f;
                i11 = 255;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth, this.f93941m);
                canvas2 = canvas;
                this.f93930b.setColorFilter(null);
                this.f93932d.setColorFilter(null);
            } else {
                canvas2 = canvas;
                f11 = 0.0f;
                i11 = 255;
                this.f93930b.setAlpha(iM93023d);
                this.f93930b.setDither(this.f93936h);
                this.f93930b.setColorFilter(this.f93934f);
                if (this.f93934f != null && !this.f93929a.f93970l) {
                    this.f93930b.setColor(this.f93935g << 24);
                }
                if (z12) {
                    this.f93932d.setAlpha(iM93023d2);
                    this.f93932d.setDither(this.f93936h);
                    this.f93932d.setColorFilter(this.f93934f);
                }
            }
            if (z11) {
                if (this.f93933e == null) {
                    Paint paint = new Paint();
                    this.f93933e = paint;
                    paint.setColor(0);
                    this.f93933e.setStyle(Paint.Style.STROKE);
                }
                if (z12) {
                    this.f93933e.setStrokeWidth(this.f93932d.getStrokeWidth());
                } else {
                    this.f93933e.setStrokeWidth(this.f93929a.f93954H / 4.0f);
                }
                int alphaComponent = this.f93929a.f93955I;
                int alphaComponent2 = ColorUtils.setAlphaComponent(alphaComponent, i11);
                int i12 = this.f93929a.f93955I;
                if (alphaComponent2 == i12) {
                    alphaComponent = ColorUtils.setAlphaComponent(i12, 254);
                }
                this.f93933e.setColor(alphaComponent);
                this.f93933e.setMaskFilter(new BlurMaskFilter(this.f93929a.f93954H / 1.2f, BlurMaskFilter.Blur.NORMAL));
            } else {
                Paint paint2 = this.f93933e;
                if (paint2 != null) {
                    paint2.clearShadowLayer();
                }
            }
            int i13 = c42389c.f93960b;
            if (i13 == 0) {
                canvas3 = canvas2;
                if (c42389c.f93978t != null) {
                    if (this.f93945q || this.f93942n) {
                        this.f93937i.reset();
                        this.f93937i.addRoundRect(this.f93938j, c42389c.f93978t, Path.Direction.CW);
                        this.f93942n = false;
                        this.f93945q = false;
                    }
                    if (z11) {
                        this.f93940l.reset();
                        this.f93940l.addRoundRect(this.f93939k, c42389c.f93978t, Path.Direction.CW);
                        canvas3.drawPath(this.f93940l, this.f93933e);
                    }
                    canvas3.drawPath(this.f93937i, this.f93930b);
                    if (z12) {
                        canvas3.drawPath(this.f93937i, this.f93932d);
                    }
                } else {
                    float f16 = c42389c.f93977s;
                    if (f16 > f11) {
                        float fMin = Math.min(this.f93938j.width(), this.f93938j.height()) * 0.5f;
                        if (f16 > fMin) {
                            f16 = fMin;
                        }
                        if (z11) {
                            canvas3.drawRoundRect(this.f93939k, f16, f16, this.f93933e);
                        }
                        canvas3.drawRoundRect(this.f93938j, f16, f16, this.f93930b);
                        if (z12) {
                            canvas3.drawRoundRect(this.f93938j, f16, f16, this.f93932d);
                        }
                    } else {
                        if (z11) {
                            canvas3.drawRect(this.f93939k, this.f93933e);
                        }
                        if (this.f93930b.getColor() != 0 || this.f93934f != null || this.f93930b.getShader() != null) {
                            canvas3.drawRect(this.f93938j, this.f93930b);
                        }
                        if (z12) {
                            canvas3.drawRect(this.f93938j, this.f93932d);
                        }
                    }
                }
            } else if (i13 == 1) {
                canvas3 = canvas2;
                if (z11) {
                    canvas3.drawOval(this.f93939k, this.f93933e);
                }
                canvas3.drawOval(this.f93938j, this.f93930b);
                if (z12) {
                    canvas3.drawOval(this.f93938j, this.f93932d);
                }
            } else if (i13 != 2) {
                if (i13 == 3) {
                    Path pathM93020a = m93020a(c42389c);
                    if (z11) {
                        canvas2.drawPath(pathM93020a, this.f93933e);
                    }
                    canvas2.drawPath(pathM93020a, this.f93930b);
                    if (z12) {
                        canvas2.drawPath(pathM93020a, this.f93932d);
                    }
                }
                canvas3 = canvas2;
            } else {
                RectF rectF2 = this.f93938j;
                Drawable.Callback callback = getCallback();
                if (callback instanceof View) {
                    absoluteGravity = Gravity.getAbsoluteGravity(c42389c.f93958L, ((View) callback).getContext().getResources().getConfiguration().getLayoutDirection());
                } else {
                    absoluteGravity = c42389c.f93958L;
                }
                if (absoluteGravity == 3) {
                    f12 = rectF2.bottom;
                    f13 = f11;
                    f14 = f13;
                    fCenterY = f14;
                } else if (absoluteGravity == 5) {
                    f13 = rectF2.right;
                    f12 = rectF2.bottom;
                    f14 = f13;
                    fCenterY = f11;
                } else if (absoluteGravity == 48) {
                    f14 = rectF2.right;
                    f13 = f11;
                    f12 = f13;
                    fCenterY = f12;
                } else if (absoluteGravity != 80) {
                    fCenterY = rectF2.centerY();
                    f13 = rectF2.left;
                    f14 = rectF2.right;
                    f12 = fCenterY;
                } else {
                    float f17 = rectF2.bottom;
                    f14 = rectF2.right;
                    f12 = f17;
                    fCenterY = f12;
                    f13 = f11;
                }
                if (z11) {
                    Canvas canvas4 = canvas2;
                    f15 = fCenterY;
                    canvas4.drawLine(f13, f15, f14, f12, this.f93933e);
                } else {
                    f15 = fCenterY;
                }
                canvas3 = canvas;
                canvas3.drawLine(f13, f15, f14, f12, this.f93932d);
            }
            if (z14) {
                canvas3.restore();
                return;
            }
            this.f93930b.setAlpha(alpha);
            if (z12) {
                this.f93932d.setAlpha(alpha2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public C42388b m93033n(float f11, float f12, float f13, float f14) {
        if (f11 == f12 && f11 == f13 && f11 == f14) {
            return m93032m(f11);
        }
        this.f93929a.m93048c(new float[]{f11, f11, f12, f12, f14, f14, f13, f13});
        this.f93945q = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C42388b m93038s(int i11) {
        this.f93944p = null;
        this.f93929a.m93057l(i11);
        this.f93945q = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: m10.b$a */
    /* JADX INFO: compiled from: ShapeDrawable.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93946a;

        static {
            int[] iArr = new int[ShapeGradientOrientation.values().length];
            f93946a = iArr;
            try {
                iArr[ShapeGradientOrientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93946a[ShapeGradientOrientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93946a[ShapeGradientOrientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93946a[ShapeGradientOrientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93946a[ShapeGradientOrientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93946a[ShapeGradientOrientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93946a[ShapeGradientOrientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C42388b(C42389c c42389c) {
        this.f93930b = new Paint(1);
        Paint paint = new Paint(1);
        this.f93932d = paint;
        this.f93935g = 255;
        this.f93937i = new Path();
        this.f93938j = new RectF();
        this.f93939k = new RectF();
        this.f93940l = new Path();
        this.f93945q = true;
        this.f93929a = c42389c;
        m93022c(c42389c);
        this.f93942n = true;
        this.f93943o = false;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: A */
    public C42388b m93019A(boolean z11) {
        this.f93929a.f93951E = z11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final Path m93020a(C42389c c42389c) {
        Path path = this.f93944p;
        if (path != null && (!c42389c.f93952F || !this.f93945q)) {
            return path;
        }
        this.f93945q = false;
        float level = c42389c.f93952F ? (getLevel() * 360.0f) / 10000.0f : 360.0f;
        RectF rectF = new RectF(this.f93938j);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        int i11 = c42389c.f93947A;
        float fWidth2 = i11 != -1 ? i11 : rectF.width() / c42389c.f93983y;
        int i12 = c42389c.f93984z;
        float fWidth3 = i12 != -1 ? i12 : rectF.width() / c42389c.f93982x;
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fWidth - fWidth3, fHeight - fWidth3);
        RectF rectF3 = new RectF(rectF2);
        float f11 = -fWidth2;
        rectF3.inset(f11, f11);
        Path path2 = this.f93944p;
        if (path2 == null) {
            this.f93944p = new Path();
        } else {
            path2.reset();
        }
        Path path3 = this.f93944p;
        if (level >= 360.0f || level <= -360.0f) {
            path3.addOval(rectF3, Path.Direction.CW);
            path3.addOval(rectF2, Path.Direction.CCW);
            return path3;
        }
        path3.setFillType(Path.FillType.EVEN_ODD);
        float f12 = fWidth + fWidth3;
        path3.moveTo(f12, fHeight);
        path3.lineTo(f12 + fWidth2, fHeight);
        path3.arcTo(rectF3, 0.0f, level, false);
        path3.arcTo(rectF2, level, -level, false);
        path3.close();
        return path3;
    }

    /* JADX INFO: renamed from: c */
    public final void m93022c(C42389c c42389c) {
        if (c42389c.f93970l) {
            this.f93930b.setColor(c42389c.f93972n);
        } else if (c42389c.f93963e == null) {
            this.f93930b.setColor(0);
        } else {
            this.f93930b.setColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f93931c = c42389c.f93979u;
        if (c42389c.f93973o >= 0) {
            if (c42389c.f93971m) {
                m93041v(c42389c.f93974p);
            } else {
                m93041v(c42389c.f93964f);
            }
            m93043x(c42389c.f93973o);
            m93042w(c42389c.f93975q, c42389c.f93976r);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m93023d(int i11) {
        int i12 = this.f93935g;
        return (i11 * (i12 + (i12 >> 7))) >> 8;
    }

    /* JADX INFO: renamed from: e */
    public C42388b m93024e(int i11) {
        int i12 = i11 % TXVodDownloadDataSource.QUALITY_360P;
        if (i12 % 45 == 0) {
            if (i12 == 0) {
                m93026g(ShapeGradientOrientation.LEFT_RIGHT);
            } else {
                if (i12 == 45) {
                    m93026g(ShapeGradientOrientation.BL_TR);
                    return this;
                }
                if (i12 == 90) {
                    m93026g(ShapeGradientOrientation.BOTTOM_TOP);
                    return this;
                }
                if (i12 == 135) {
                    m93026g(ShapeGradientOrientation.BR_TL);
                    return this;
                }
                if (i12 == 180) {
                    m93026g(ShapeGradientOrientation.RIGHT_LEFT);
                    return this;
                }
                if (i12 == 225) {
                    m93026g(ShapeGradientOrientation.TR_BL);
                    return this;
                }
                if (i12 == 270) {
                    m93026g(ShapeGradientOrientation.TOP_BOTTOM);
                    return this;
                }
                if (i12 == 315) {
                    m93026g(ShapeGradientOrientation.TL_BR);
                    return this;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C42388b m93025f(float f11, float f12) {
        this.f93929a.m93050e(f11, f12);
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C42388b m93026g(ShapeGradientOrientation shapeGradientOrientation) {
        this.f93929a.f93962d = shapeGradientOrientation;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f93935g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.f93929a.f93959a = getChangingConfigurations();
        return this.f93929a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f93929a.f93981w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f93929a.f93980v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f93929a.f93953G ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f93931c;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public C42388b m93027h(float f11) {
        this.f93929a.m93051f(f11);
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C42388b m93028i(int i11) {
        this.f93929a.m93052g(i11);
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C42388b m93029j(int i11) {
        this.f93929a.f93984z = i11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C42388b m93030k(float f11) {
        this.f93929a.f93982x = f11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C42388b m93031l(int i11) {
        this.f93929a.f93958L = i11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C42388b m93032m(float f11) {
        this.f93929a.m93049d(f11);
        this.f93945q = true;
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f93943o && super.mutate() == this) {
            C42389c c42389c = new C42389c(this.f93929a);
            this.f93929a = c42389c;
            m93022c(c42389c);
            this.f93943o = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C42388b m93034o(int i11) {
        this.f93929a.m93053h(i11);
        this.f93945q = true;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return this.f93929a.f93960b == 2;
    }

    /* JADX INFO: renamed from: p */
    public C42388b m93035p(int i11) {
        this.f93929a.m93054i(i11);
        this.f93945q = true;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C42388b m93036q(int i11) {
        this.f93929a.m93055j(i11);
        this.f93945q = true;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C42388b m93037r(int i11) {
        this.f93929a.m93056k(i11);
        this.f93945q = true;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f93935g) {
            this.f93935g = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f93934f) {
            this.f93934f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        if (z11 != this.f93936h) {
            this.f93936h = z11;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public C42388b m93039t(int i11, int i12) {
        this.f93929a.m93058m(i11, i12);
        this.f93945q = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: u */
    public C42388b m93040u(int... iArr) {
        this.f93929a.m93059n(iArr);
        if (iArr == null) {
            this.f93930b.setColor(0);
        } else if (iArr.length == 1) {
            this.f93930b.setColor(iArr[0]);
            this.f93930b.clearShadowLayer();
        }
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C42388b m93041v(int... iArr) {
        this.f93929a.m93060o(iArr);
        if (iArr == null) {
            this.f93932d.setColor(0);
        } else if (iArr.length == 1) {
            this.f93932d.setColor(iArr[0]);
            this.f93932d.clearShadowLayer();
        }
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C42388b m93042w(float f11, float f12) {
        this.f93929a.m93061p(f11, f12);
        this.f93932d.setPathEffect(f11 > 0.0f ? new DashPathEffect(new float[]{f11, f12}, 0.0f) : null);
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C42388b m93043x(int i11) {
        this.f93929a.m93062q(i11);
        this.f93932d.setStrokeWidth(i11);
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C42388b m93044y(int i11) {
        this.f93929a.f93947A = i11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C42388b m93045z(float f11) {
        this.f93929a.f93983y = f11;
        this.f93942n = true;
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f93929a.f93959a;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f93944p = null;
        this.f93945q = true;
        this.f93942n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        super.onLevelChange(i11);
        this.f93942n = true;
        this.f93945q = true;
        invalidateSelf();
        return true;
    }
}

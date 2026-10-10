package com.kubi.resources.widget.wheel.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p293gx.InterfaceC38055a;
import p323hx.InterfaceC38362a;
import p350ix.C40188a;
import p350ix.InterfaceC40189b;
import p384jx.C40817a;
import p384jx.C40819c;
import p384jx.HandlerC40818b;

/* JADX INFO: loaded from: classes13.dex */
public class WheelView extends View {

    /* JADX INFO: renamed from: A */
    public boolean f45297A;

    /* JADX INFO: renamed from: B */
    public float f45298B;

    /* JADX INFO: renamed from: C */
    public float f45299C;

    /* JADX INFO: renamed from: D */
    public float f45300D;

    /* JADX INFO: renamed from: E */
    public float f45301E;

    /* JADX INFO: renamed from: F */
    public int f45302F;

    /* JADX INFO: renamed from: G */
    public int f45303G;

    /* JADX INFO: renamed from: H */
    public int f45304H;

    /* JADX INFO: renamed from: I */
    public int f45305I;

    /* JADX INFO: renamed from: J */
    public int f45306J;

    /* JADX INFO: renamed from: K */
    public int f45307K;

    /* JADX INFO: renamed from: L */
    public int f45308L;

    /* JADX INFO: renamed from: M */
    public int f45309M;

    /* JADX INFO: renamed from: N */
    public int f45310N;

    /* JADX INFO: renamed from: O */
    public float f45311O;

    /* JADX INFO: renamed from: P */
    public long f45312P;

    /* JADX INFO: renamed from: Q */
    public int f45313Q;

    /* JADX INFO: renamed from: R */
    public int f45314R;

    /* JADX INFO: renamed from: S */
    public int f45315S;

    /* JADX INFO: renamed from: T */
    public int f45316T;

    /* JADX INFO: renamed from: U */
    public float f45317U;

    /* JADX INFO: renamed from: V */
    public final float f45318V;

    /* JADX INFO: renamed from: b */
    public DividerType f45319b;

    /* JADX INFO: renamed from: c */
    public Context f45320c;

    /* JADX INFO: renamed from: d */
    public Handler f45321d;

    /* JADX INFO: renamed from: e */
    public GestureDetector f45322e;

    /* JADX INFO: renamed from: f */
    public InterfaceC40189b f45323f;

    /* JADX INFO: renamed from: g */
    public boolean f45324g;

    /* JADX INFO: renamed from: h */
    public boolean f45325h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f45326i;

    /* JADX INFO: renamed from: j */
    public ScheduledFuture<?> f45327j;

    /* JADX INFO: renamed from: k */
    public Paint f45328k;

    /* JADX INFO: renamed from: l */
    public Paint f45329l;

    /* JADX INFO: renamed from: m */
    public Paint f45330m;

    /* JADX INFO: renamed from: n */
    public InterfaceC38055a f45331n;

    /* JADX INFO: renamed from: o */
    public String f45332o;

    /* JADX INFO: renamed from: p */
    public int f45333p;

    /* JADX INFO: renamed from: q */
    public int f45334q;

    /* JADX INFO: renamed from: r */
    public int f45335r;

    /* JADX INFO: renamed from: s */
    public int f45336s;

    /* JADX INFO: renamed from: t */
    public float f45337t;

    /* JADX INFO: renamed from: u */
    public Typeface f45338u;

    /* JADX INFO: renamed from: v */
    public int f45339v;

    /* JADX INFO: renamed from: w */
    public float f45340w;

    /* JADX INFO: renamed from: x */
    public int f45341x;

    /* JADX INFO: renamed from: y */
    public int f45342y;

    /* JADX INFO: renamed from: z */
    public float f45343z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.wheel.view.WheelView$a */
    public class RunnableC23172a implements Runnable {
        public RunnableC23172a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WheelView.this.f45323f.mo88537a(WheelView.this.getCurrentItem());
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public int m55606e(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int iCeil = 0;
        for (int i11 = 0; i11 < length; i11++) {
            iCeil += (int) Math.ceil(fArr[i11]);
        }
        return iCeil;
    }

    public void setLineSpacingMultiplier(float f11) {
        if (f11 != 0.0f) {
            this.f45343z = f11;
            m55610i();
        }
        invalidate();
    }

    public final void setTextSize(float f11) {
        if (f11 > 0.0f) {
            int i11 = (int) (getResources().getDisplayMetrics().density * f11);
            this.f45333p = i11;
            this.f45328k.setTextSize(i11);
            this.f45329l.setTextSize(this.f45333p);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45324g = false;
        this.f45325h = true;
        this.f45326i = Executors.newSingleThreadScheduledExecutor();
        this.f45338u = Typeface.MONOSPACE;
        this.f45340w = 1.0f;
        this.f45343z = 1.8f;
        this.f45306J = 9;
        this.f45310N = 0;
        this.f45311O = 0.0f;
        this.f45312P = 0L;
        this.f45314R = 17;
        this.f45315S = 0;
        this.f45316T = 0;
        this.f45318V = 0.5f;
        float f11 = getResources().getDisplayMetrics().density;
        if (f11 < 1.0f) {
            this.f45317U = 2.4f;
        } else if (1.0f <= f11 && f11 < 2.0f) {
            this.f45317U = 3.6f;
        } else if (1.0f <= f11 && f11 < 2.0f) {
            this.f45317U = 4.5f;
        } else if (2.0f <= f11 && f11 < 3.0f) {
            this.f45317U = 6.0f;
        } else if (f11 >= 3.0f) {
            this.f45317U = f11 * 2.5f;
        }
        m55610i();
        m55607f(context);
    }

    /* JADX INFO: renamed from: b */
    public void m55603b() {
        ScheduledFuture<?> scheduledFuture = this.f45327j;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f45327j.cancel(true);
        this.f45327j = null;
    }

    /* JADX INFO: renamed from: c */
    public final String m55604c(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC38362a) {
            return ((InterfaceC38362a) obj).getPickerViewText();
        }
        return obj instanceof Integer ? String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, (Integer) obj) : obj.toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m55605d(int i11) {
        if (i11 < 0) {
            return m55605d(i11 + this.f45331n.mo85927a());
        }
        return i11 > this.f45331n.mo85927a() + (-1) ? m55605d(i11 - this.f45331n.mo85927a()) : i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m55607f(Context context) {
        this.f45320c = context;
        this.f45321d = new HandlerC40818b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C40188a(this));
        this.f45322e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f45297A = true;
        this.f45301E = 0.0f;
        this.f45302F = -1;
        m55608g();
    }

    /* JADX INFO: renamed from: g */
    public final void m55608g() {
        Paint paint = new Paint();
        this.f45328k = paint;
        paint.setColor(this.f45339v);
        this.f45328k.setAntiAlias(true);
        this.f45328k.setTypeface(this.f45338u);
        this.f45328k.setTextSize(this.f45333p);
        Paint paint2 = new Paint();
        this.f45329l = paint2;
        paint2.setColor(this.f45341x);
        this.f45329l.setAntiAlias(true);
        this.f45329l.setTextScaleX(1.1f);
        this.f45329l.setTypeface(this.f45338u);
        this.f45329l.setTextSize(this.f45333p);
        Paint paint3 = new Paint();
        this.f45330m = paint3;
        paint3.setColor(this.f45342y);
        this.f45330m.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final InterfaceC38055a getAdapter() {
        return this.f45331n;
    }

    public final int getCurrentItem() {
        int i11;
        InterfaceC38055a interfaceC38055a = this.f45331n;
        if (interfaceC38055a == null) {
            return 0;
        }
        return (!this.f45297A || ((i11 = this.f45303G) >= 0 && i11 < interfaceC38055a.mo85927a())) ? Math.max(0, Math.min(this.f45303G, this.f45331n.mo85927a() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.f45303G) - this.f45331n.mo85927a()), this.f45331n.mo85927a() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f45321d;
    }

    public int getInitPosition() {
        return this.f45302F;
    }

    public float getItemHeight() {
        return this.f45337t;
    }

    public int getItemsCount() {
        InterfaceC38055a interfaceC38055a = this.f45331n;
        if (interfaceC38055a != null) {
            return interfaceC38055a.mo85927a();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f45301E;
    }

    /* JADX INFO: renamed from: h */
    public boolean m55609h() {
        return this.f45297A;
    }

    /* JADX INFO: renamed from: i */
    public final void m55610i() {
        float f11 = this.f45343z;
        if (f11 < 1.0f) {
            this.f45343z = 1.0f;
        } else if (f11 > 4.0f) {
            this.f45343z = 4.0f;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m55611j() {
        Rect rect = new Rect();
        for (int i11 = 0; i11 < this.f45331n.mo85927a(); i11++) {
            String strM55604c = m55604c(this.f45331n.getItem(i11));
            this.f45329l.getTextBounds(strM55604c, 0, strM55604c.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f45334q) {
                this.f45334q = iWidth;
            }
            this.f45329l.getTextBounds("星期", 0, 2, rect);
            this.f45335r = rect.height() + 2;
        }
        this.f45337t = this.f45343z * this.f45335r;
    }

    /* JADX INFO: renamed from: k */
    public final void m55612k(String str) {
        String str2;
        Rect rect = new Rect();
        this.f45329l.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f45314R;
        if (i11 == 3) {
            this.f45315S = 0;
            return;
        }
        if (i11 == 5) {
            this.f45315S = (this.f45308L - rect.width()) - ((int) this.f45317U);
            return;
        }
        if (i11 != 17) {
            return;
        }
        if (this.f45324g || (str2 = this.f45332o) == null || str2.equals("") || !this.f45325h) {
            this.f45315S = (int) (((double) (this.f45308L - rect.width())) * 0.5d);
        } else {
            this.f45315S = (int) (((double) (this.f45308L - rect.width())) * 0.25d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m55613l(String str) {
        String str2;
        Rect rect = new Rect();
        this.f45328k.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f45314R;
        if (i11 == 3) {
            this.f45316T = 0;
            return;
        }
        if (i11 == 5) {
            this.f45316T = (this.f45308L - rect.width()) - ((int) this.f45317U);
            return;
        }
        if (i11 != 17) {
            return;
        }
        if (this.f45324g || (str2 = this.f45332o) == null || str2.equals("") || !this.f45325h) {
            this.f45316T = (int) (((double) (this.f45308L - rect.width())) * 0.5d);
        } else {
            this.f45316T = (int) (((double) (this.f45308L - rect.width())) * 0.25d);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m55614m() {
        if (this.f45323f != null) {
            postDelayed(new RunnableC23172a(), 200L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m55615n(String str) {
        Rect rect = new Rect();
        this.f45329l.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f45333p;
        for (int iWidth = rect.width(); iWidth > this.f45308L; iWidth = rect.width()) {
            i11--;
            this.f45329l.setTextSize(i11);
            this.f45329l.getTextBounds(str, 0, str.length(), rect);
        }
        this.f45328k.setTextSize(i11);
    }

    /* JADX INFO: renamed from: o */
    public final void m55616o() {
        if (this.f45331n == null) {
            return;
        }
        m55611j();
        int i11 = (int) (this.f45337t * (this.f45306J - 1));
        this.f45307K = (int) (((double) (i11 * 2)) / 3.141592653589793d);
        this.f45309M = (int) (((double) i11) / 3.141592653589793d);
        this.f45308L = View.MeasureSpec.getSize(this.f45313Q);
        int i12 = this.f45307K;
        float f11 = this.f45337t;
        this.f45298B = (i12 - f11) / 2.0f;
        float f12 = (i12 + f11) / 2.0f;
        this.f45299C = f12;
        this.f45300D = (f12 - ((f11 - this.f45335r) / 2.0f)) - this.f45317U;
        if (this.f45302F == -1) {
            if (this.f45297A) {
                this.f45302F = (this.f45331n.mo85927a() + 1) / 2;
            } else {
                this.f45302F = 0;
            }
        }
        this.f45304H = this.f45302F;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        Canvas canvas2;
        boolean z11;
        boolean z12;
        String strM55604c;
        int i12;
        if (this.f45331n == null) {
            return;
        }
        boolean z13 = false;
        int iMin = Math.min(Math.max(0, this.f45302F), this.f45331n.mo85927a() - 1);
        this.f45302F = iMin;
        Object[] objArr = new Object[this.f45306J];
        int i13 = (int) (this.f45301E / this.f45337t);
        this.f45305I = i13;
        try {
            this.f45304H = iMin + (i13 % this.f45331n.mo85927a());
            while (true) {
                int i14 = this.f45306J;
                if (i11 >= i14) {
                    break;
                }
                int i15 = this.f45304H - ((i14 / 2) - i11);
                if (this.f45297A) {
                    objArr[i11] = this.f45331n.getItem(m55605d(i15));
                } else if (i15 < 0) {
                    objArr[i11] = "";
                } else if (i15 > this.f45331n.mo85927a() - 1) {
                    objArr[i11] = "";
                } else {
                    objArr[i11] = this.f45331n.getItem(i15);
                }
                i11++;
            }
        } catch (ArithmeticException unused) {
            Log.e("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.f45297A) {
            if (this.f45304H < 0) {
                this.f45304H = this.f45331n.mo85927a() + this.f45304H;
            }
            if (this.f45304H > this.f45331n.mo85927a() - 1) {
                this.f45304H -= this.f45331n.mo85927a();
            }
        } else {
            if (this.f45304H < 0) {
                this.f45304H = 0;
            }
            if (this.f45304H > this.f45331n.mo85927a() - 1) {
                this.f45304H = this.f45331n.mo85927a() - 1;
            }
        }
        float f11 = this.f45301E % this.f45337t;
        i11 = 0;
        boolean z14 = false;
        if (this.f45319b == DividerType.WRAP) {
            float f12 = (TextUtils.isEmpty(this.f45332o) ? (this.f45308L - this.f45334q) / 2 : (this.f45308L - this.f45334q) / 4) - 12;
            if (f12 <= 0.0f) {
                f12 = 10.0f;
            }
            float f13 = f12;
            float f14 = this.f45308L - f13;
            float f15 = this.f45298B;
            canvas2 = canvas;
            canvas2.drawLine(f13, f15, f14, f15, this.f45330m);
            float f16 = this.f45299C;
            canvas2.drawLine(f13, f16, f14, f16, this.f45330m);
        } else {
            float f17 = this.f45298B;
            canvas.drawLine(0.0f, f17, this.f45308L, f17, this.f45330m);
            float f18 = this.f45299C;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f18, this.f45308L, f18, this.f45330m);
        }
        if (!TextUtils.isEmpty(this.f45332o) && this.f45325h) {
            canvas2.drawText(this.f45332o, (this.f45308L - m55606e(this.f45329l, this.f45332o)) - this.f45317U, this.f45300D, this.f45329l);
        }
        int i16 = 0;
        while (i16 < this.f45306J) {
            canvas2.save();
            double d11 = ((this.f45337t * i16) - f11) / this.f45309M;
            float f19 = (float) (90.0d - ((d11 / 3.141592653589793d) * 180.0d));
            if (f19 >= 90.0f || f19 <= -90.0f) {
                z11 = z13;
                z12 = z14;
                canvas2.restore();
            } else {
                float fPow = (float) Math.pow(Math.abs(f19) / 90.0f, 1.0d);
                if (this.f45325h || TextUtils.isEmpty(this.f45332o) || TextUtils.isEmpty(m55604c(objArr[i16]))) {
                    strM55604c = m55604c(objArr[i16]);
                } else {
                    strM55604c = m55604c(objArr[i16]) + this.f45332o;
                }
                m55615n(strM55604c);
                m55612k(strM55604c);
                m55613l(strM55604c);
                String str = strM55604c;
                float fCos = (float) ((((double) this.f45309M) - (Math.cos(d11) * ((double) this.f45309M))) - ((Math.sin(d11) * ((double) this.f45335r)) / 2.0d));
                canvas2.translate(0.0f, fCos);
                float f21 = this.f45298B;
                if (fCos > f21 || this.f45335r + fCos < f21) {
                    float f22 = this.f45299C;
                    if (fCos > f22 || this.f45335r + fCos < f22) {
                        if (fCos >= f21) {
                            int i17 = this.f45335r;
                            if (i17 + fCos <= f22) {
                                canvas2.drawText(str, this.f45315S, i17 - this.f45317U, this.f45329l);
                                this.f45303G = this.f45304H - ((this.f45306J / 2) - i16);
                            }
                            canvas2.restore();
                            this.f45329l.setTextSize(this.f45333p);
                        }
                        canvas2.save();
                        z11 = false;
                        canvas2.clipRect(0, 0, this.f45308L, (int) this.f45337t);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                        Paint paint = this.f45328k;
                        int i18 = this.f45336s;
                        if (i18 == 0) {
                            i12 = 0;
                        } else {
                            i12 = i18 > 0 ? 1 : -1;
                        }
                        z12 = false;
                        paint.setTextSkewX(i12 * (f19 <= 0.0f ? 1 : -1) * 0.5f * fPow);
                        this.f45328k.setAlpha((int) ((1.0f - fPow) * 255.0f * this.f45340w));
                        canvas2.drawText(str, this.f45316T + (this.f45336s * fPow), this.f45335r, this.f45328k);
                        canvas2.restore();
                        canvas2.restore();
                        this.f45329l.setTextSize(this.f45333p);
                    } else {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.f45308L, this.f45299C - fCos);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 1.0f);
                        canvas2.drawText(str, this.f45315S, this.f45335r - this.f45317U, this.f45329l);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.clipRect(0.0f, this.f45299C - fCos, this.f45308L, (int) this.f45337t);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                        canvas2.drawText(str, this.f45316T, this.f45335r, this.f45328k);
                        canvas2.restore();
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.f45308L, this.f45298B - fCos);
                    canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                    canvas2.drawText(str, this.f45316T, this.f45335r, this.f45328k);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipRect(0.0f, this.f45298B - fCos, this.f45308L, (int) this.f45337t);
                    canvas2.scale(1.0f, ((float) Math.sin(d11)) * 1.0f);
                    canvas2.drawText(str, this.f45315S, this.f45335r - this.f45317U, this.f45329l);
                    canvas2.restore();
                }
                z11 = false;
                z12 = false;
                canvas2.restore();
                this.f45329l.setTextSize(this.f45333p);
            }
            i16++;
            z13 = z11;
            z14 = z12;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        this.f45313Q = i11;
        m55616o();
        setMeasuredDimension(this.f45308L, this.f45307K);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f45322e.onTouchEvent(motionEvent);
        float f11 = (-this.f45302F) * this.f45337t;
        float fMo85927a = ((this.f45331n.mo85927a() - 1) - this.f45302F) * this.f45337t;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45312P = System.currentTimeMillis();
            m55603b();
            this.f45311O = motionEvent.getRawY();
        } else {
            if (action == 2) {
                float rawY = this.f45311O - motionEvent.getRawY();
                this.f45311O = motionEvent.getRawY();
                float f12 = this.f45301E + rawY;
                this.f45301E = f12;
                if (!this.f45297A) {
                    float f13 = this.f45337t;
                    if ((f12 - (f13 * 0.25f) < f11 && rawY < 0.0f) || ((f13 * 0.25f) + f12 > fMo85927a && rawY > 0.0f)) {
                        this.f45301E = f12 - rawY;
                    }
                }
                return true;
            }
            if (!zOnTouchEvent) {
                float y11 = motionEvent.getY();
                int i11 = this.f45309M;
                double dAcos = Math.acos((i11 - y11) / i11) * ((double) this.f45309M);
                float f14 = this.f45337t;
                this.f45310N = (int) (((((int) ((dAcos + ((double) (f14 / 2.0f))) / ((double) f14))) - (this.f45306J / 2)) * f14) - (((this.f45301E % f14) + f14) % f14));
                if (System.currentTimeMillis() - this.f45312P > 120) {
                    m55618q(ACTION.DAGGLE);
                } else {
                    m55618q(ACTION.CLICK);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC38055a interfaceC38055a) {
        this.f45331n = interfaceC38055a;
        m55616o();
        invalidate();
    }

    public final void setCurrentItem(int i11) {
        this.f45303G = i11;
        this.f45302F = i11;
        this.f45301E = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z11) {
        this.f45297A = z11;
    }

    public void setDividerColor(int i11) {
        this.f45342y = i11;
        this.f45330m.setColor(i11);
        invalidate();
    }

    public void setDividerType(DividerType dividerType) {
        this.f45319b = dividerType;
        invalidate();
    }

    public void setGravity(int i11) {
        this.f45314R = i11;
        invalidate();
    }

    public void setIsOptions(boolean z11) {
        this.f45324g = z11;
        invalidate();
    }

    public void setLabel(String str) {
        this.f45332o = str;
        invalidate();
    }

    public final void setOnItemSelectedListener(InterfaceC40189b interfaceC40189b) {
        this.f45323f = interfaceC40189b;
    }

    public void setTextColorCenter(int i11) {
        this.f45341x = i11;
        this.f45329l.setColor(i11);
        invalidate();
    }

    public void setTextColorOut(int i11) {
        this.f45339v = i11;
        this.f45328k.setColor(i11);
        invalidate();
    }

    public void setTextColorOutAlpha(float f11) {
        this.f45340w = f11;
        invalidate();
    }

    public void setTextXOffset(int i11) {
        this.f45336s = i11;
        if (i11 != 0) {
            this.f45329l.setTextScaleX(1.0f);
        }
        invalidate();
    }

    public void setTotalScrollY(float f11) {
        this.f45301E = f11;
    }

    public final void setTypeface(Typeface typeface) {
        this.f45338u = typeface;
        this.f45328k.setTypeface(typeface);
        this.f45329l.setTypeface(this.f45338u);
    }

    /* JADX INFO: renamed from: p */
    public final void m55617p(float f11) {
        m55603b();
        this.f45327j = this.f45326i.scheduleWithFixedDelay(new C40817a(this, f11), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: q */
    public void m55618q(ACTION action) {
        m55603b();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f11 = this.f45301E;
            float f12 = this.f45337t;
            int i11 = (int) (((f11 % f12) + f12) % f12);
            this.f45310N = i11;
            if (i11 > f12 / 2.0f) {
                this.f45310N = (int) (f12 - i11);
            } else {
                this.f45310N = -i11;
            }
        }
        this.f45327j = this.f45326i.scheduleWithFixedDelay(new C40819c(this, this.f45310N), 0L, 10L, TimeUnit.MILLISECONDS);
    }
}

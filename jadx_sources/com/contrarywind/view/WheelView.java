package com.contrarywind.view;

import android.content.Context;
import android.content.res.TypedArray;
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
import p629t2.InterfaceC44627a;
import p650u2.InterfaceC45095a;
import p681v2.C45363a;
import p681v2.InterfaceC45364b;
import p711w2.C45697a;
import p711w2.C45699c;
import p711w2.HandlerC45698b;

/* JADX INFO: loaded from: classes34.dex */
public class WheelView extends View {

    /* JADX INFO: renamed from: A */
    public float f7078A;

    /* JADX INFO: renamed from: B */
    public float f7079B;

    /* JADX INFO: renamed from: C */
    public float f7080C;

    /* JADX INFO: renamed from: D */
    public float f7081D;

    /* JADX INFO: renamed from: E */
    public int f7082E;

    /* JADX INFO: renamed from: F */
    public int f7083F;

    /* JADX INFO: renamed from: G */
    public int f7084G;

    /* JADX INFO: renamed from: H */
    public int f7085H;

    /* JADX INFO: renamed from: I */
    public int f7086I;

    /* JADX INFO: renamed from: J */
    public int f7087J;

    /* JADX INFO: renamed from: K */
    public int f7088K;

    /* JADX INFO: renamed from: L */
    public int f7089L;

    /* JADX INFO: renamed from: M */
    public int f7090M;

    /* JADX INFO: renamed from: N */
    public float f7091N;

    /* JADX INFO: renamed from: O */
    public long f7092O;

    /* JADX INFO: renamed from: P */
    public int f7093P;

    /* JADX INFO: renamed from: Q */
    public int f7094Q;

    /* JADX INFO: renamed from: R */
    public int f7095R;

    /* JADX INFO: renamed from: S */
    public int f7096S;

    /* JADX INFO: renamed from: T */
    public float f7097T;

    /* JADX INFO: renamed from: U */
    public final float f7098U;

    /* JADX INFO: renamed from: b */
    public DividerType f7099b;

    /* JADX INFO: renamed from: c */
    public Context f7100c;

    /* JADX INFO: renamed from: d */
    public Handler f7101d;

    /* JADX INFO: renamed from: e */
    public GestureDetector f7102e;

    /* JADX INFO: renamed from: f */
    public InterfaceC45364b f7103f;

    /* JADX INFO: renamed from: g */
    public boolean f7104g;

    /* JADX INFO: renamed from: h */
    public boolean f7105h;

    /* JADX INFO: renamed from: i */
    public ScheduledExecutorService f7106i;

    /* JADX INFO: renamed from: j */
    public ScheduledFuture<?> f7107j;

    /* JADX INFO: renamed from: k */
    public Paint f7108k;

    /* JADX INFO: renamed from: l */
    public Paint f7109l;

    /* JADX INFO: renamed from: m */
    public Paint f7110m;

    /* JADX INFO: renamed from: n */
    public InterfaceC44627a f7111n;

    /* JADX INFO: renamed from: o */
    public String f7112o;

    /* JADX INFO: renamed from: p */
    public int f7113p;

    /* JADX INFO: renamed from: q */
    public int f7114q;

    /* JADX INFO: renamed from: r */
    public int f7115r;

    /* JADX INFO: renamed from: s */
    public int f7116s;

    /* JADX INFO: renamed from: t */
    public float f7117t;

    /* JADX INFO: renamed from: u */
    public Typeface f7118u;

    /* JADX INFO: renamed from: v */
    public int f7119v;

    /* JADX INFO: renamed from: w */
    public int f7120w;

    /* JADX INFO: renamed from: x */
    public int f7121x;

    /* JADX INFO: renamed from: y */
    public float f7122y;

    /* JADX INFO: renamed from: z */
    public boolean f7123z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    /* JADX INFO: renamed from: com.contrarywind.view.WheelView$a */
    public class RunnableC5389a implements Runnable {
        public RunnableC5389a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WheelView.this.f7103f.mo33596a(WheelView.this.getCurrentItem());
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public int m6983e(Paint paint, String str) {
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
            this.f7122y = f11;
            m6987i();
        }
    }

    public final void setTextSize(float f11) {
        if (f11 > 0.0f) {
            int i11 = (int) (this.f7100c.getResources().getDisplayMetrics().density * f11);
            this.f7113p = i11;
            this.f7108k.setTextSize(i11);
            this.f7109l.setTextSize(this.f7113p);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7104g = false;
        this.f7105h = true;
        this.f7106i = Executors.newSingleThreadScheduledExecutor();
        this.f7118u = Typeface.MONOSPACE;
        this.f7122y = 1.6f;
        this.f7086I = 11;
        this.f7090M = 0;
        this.f7091N = 0.0f;
        this.f7092O = 0L;
        this.f7094Q = 17;
        this.f7095R = 0;
        this.f7096S = 0;
        this.f7098U = 0.5f;
        this.f7113p = getResources().getDimensionPixelSize(R$dimen.pickerview_textsize);
        float f11 = getResources().getDisplayMetrics().density;
        if (f11 < 1.0f) {
            this.f7097T = 2.4f;
        } else if (1.0f <= f11 && f11 < 2.0f) {
            this.f7097T = 3.6f;
        } else if (1.0f <= f11 && f11 < 2.0f) {
            this.f7097T = 4.5f;
        } else if (2.0f <= f11 && f11 < 3.0f) {
            this.f7097T = 6.0f;
        } else if (f11 >= 3.0f) {
            this.f7097T = f11 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.pickerview, 0, 0);
            this.f7094Q = typedArrayObtainStyledAttributes.getInt(R$styleable.pickerview_wheelview_gravity, 17);
            this.f7119v = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorOut, -5723992);
            this.f7120w = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorCenter, -14013910);
            this.f7121x = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_dividerColor, -2763307);
            this.f7113p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.pickerview_wheelview_textSize, this.f7113p);
            this.f7122y = typedArrayObtainStyledAttributes.getFloat(R$styleable.pickerview_wheelview_lineSpacingMultiplier, this.f7122y);
            typedArrayObtainStyledAttributes.recycle();
        }
        m6987i();
        m6984f(context);
    }

    /* JADX INFO: renamed from: b */
    public void m6980b() {
        ScheduledFuture<?> scheduledFuture = this.f7107j;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f7107j.cancel(true);
        this.f7107j = null;
    }

    /* JADX INFO: renamed from: c */
    public final String m6981c(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC45095a) {
            return ((InterfaceC45095a) obj).getPickerViewText();
        }
        return obj instanceof Integer ? String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, (Integer) obj) : obj.toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m6982d(int i11) {
        if (i11 < 0) {
            return m6982d(i11 + this.f7111n.mo33651a());
        }
        return i11 > this.f7111n.mo33651a() + (-1) ? m6982d(i11 - this.f7111n.mo33651a()) : i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m6984f(Context context) {
        this.f7100c = context;
        this.f7101d = new HandlerC45698b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C45363a(this));
        this.f7102e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f7123z = true;
        this.f7081D = 0.0f;
        this.f7082E = -1;
        m6985g();
    }

    /* JADX INFO: renamed from: g */
    public final void m6985g() {
        Paint paint = new Paint();
        this.f7108k = paint;
        paint.setColor(this.f7119v);
        this.f7108k.setAntiAlias(true);
        this.f7108k.setTypeface(this.f7118u);
        this.f7108k.setTextSize(this.f7113p);
        Paint paint2 = new Paint();
        this.f7109l = paint2;
        paint2.setColor(this.f7120w);
        this.f7109l.setAntiAlias(true);
        this.f7109l.setTextScaleX(1.1f);
        this.f7109l.setTypeface(this.f7118u);
        this.f7109l.setTextSize(this.f7113p);
        Paint paint3 = new Paint();
        this.f7110m = paint3;
        paint3.setColor(this.f7121x);
        this.f7110m.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final InterfaceC44627a getAdapter() {
        return this.f7111n;
    }

    public final int getCurrentItem() {
        int i11;
        InterfaceC44627a interfaceC44627a = this.f7111n;
        if (interfaceC44627a == null) {
            return 0;
        }
        return (!this.f7123z || ((i11 = this.f7083F) >= 0 && i11 < interfaceC44627a.mo33651a())) ? Math.max(0, Math.min(this.f7083F, this.f7111n.mo33651a() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.f7083F) - this.f7111n.mo33651a()), this.f7111n.mo33651a() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f7101d;
    }

    public int getInitPosition() {
        return this.f7082E;
    }

    public float getItemHeight() {
        return this.f7117t;
    }

    public int getItemsCount() {
        InterfaceC44627a interfaceC44627a = this.f7111n;
        if (interfaceC44627a != null) {
            return interfaceC44627a.mo33651a();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f7081D;
    }

    /* JADX INFO: renamed from: h */
    public boolean m6986h() {
        return this.f7123z;
    }

    /* JADX INFO: renamed from: i */
    public final void m6987i() {
        float f11 = this.f7122y;
        if (f11 < 1.0f) {
            this.f7122y = 1.0f;
        } else if (f11 > 4.0f) {
            this.f7122y = 4.0f;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6988j() {
        Rect rect = new Rect();
        for (int i11 = 0; i11 < this.f7111n.mo33651a(); i11++) {
            String strM6981c = m6981c(this.f7111n.getItem(i11));
            this.f7109l.getTextBounds(strM6981c, 0, strM6981c.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f7114q) {
                this.f7114q = iWidth;
            }
            this.f7109l.getTextBounds("星期", 0, 2, rect);
            this.f7115r = rect.height() + 2;
        }
        this.f7117t = this.f7122y * this.f7115r;
    }

    /* JADX INFO: renamed from: k */
    public final void m6989k(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7109l.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f7094Q;
        if (i11 == 3) {
            this.f7095R = 0;
            return;
        }
        if (i11 == 5) {
            this.f7095R = (this.f7088K - rect.width()) - ((int) this.f7097T);
            return;
        }
        if (i11 != 17) {
            return;
        }
        if (this.f7104g || (str2 = this.f7112o) == null || str2.equals("") || !this.f7105h) {
            this.f7095R = (int) (((double) (this.f7088K - rect.width())) * 0.5d);
        } else {
            this.f7095R = (int) (((double) (this.f7088K - rect.width())) * 0.25d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6990l(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7108k.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f7094Q;
        if (i11 == 3) {
            this.f7096S = 0;
            return;
        }
        if (i11 == 5) {
            this.f7096S = (this.f7088K - rect.width()) - ((int) this.f7097T);
            return;
        }
        if (i11 != 17) {
            return;
        }
        if (this.f7104g || (str2 = this.f7112o) == null || str2.equals("") || !this.f7105h) {
            this.f7096S = (int) (((double) (this.f7088K - rect.width())) * 0.5d);
        } else {
            this.f7096S = (int) (((double) (this.f7088K - rect.width())) * 0.25d);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6991m() {
        if (this.f7103f != null) {
            postDelayed(new RunnableC5389a(), 200L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6992n(String str) {
        Rect rect = new Rect();
        this.f7109l.getTextBounds(str, 0, str.length(), rect);
        int i11 = this.f7113p;
        for (int iWidth = rect.width(); iWidth > this.f7088K; iWidth = rect.width()) {
            i11--;
            this.f7109l.setTextSize(i11);
            this.f7109l.getTextBounds(str, 0, str.length(), rect);
        }
        this.f7108k.setTextSize(i11);
    }

    /* JADX INFO: renamed from: o */
    public final void m6993o() {
        if (this.f7111n == null) {
            return;
        }
        m6988j();
        int i11 = (int) (this.f7117t * (this.f7086I - 1));
        this.f7087J = (int) (((double) (i11 * 2)) / 3.141592653589793d);
        this.f7089L = (int) (((double) i11) / 3.141592653589793d);
        this.f7088K = View.MeasureSpec.getSize(this.f7093P);
        int i12 = this.f7087J;
        float f11 = this.f7117t;
        this.f7078A = (i12 - f11) / 2.0f;
        float f12 = (i12 + f11) / 2.0f;
        this.f7079B = f12;
        this.f7080C = (f12 - ((f11 - this.f7115r) / 2.0f)) - this.f7097T;
        if (this.f7082E == -1) {
            if (this.f7123z) {
                this.f7082E = (this.f7111n.mo33651a() + 1) / 2;
            } else {
                this.f7082E = 0;
            }
        }
        this.f7084G = this.f7082E;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        Canvas canvas2;
        boolean z11;
        boolean z12;
        String strM6981c;
        int i12;
        if (this.f7111n == null) {
            return;
        }
        boolean z13 = false;
        int iMin = Math.min(Math.max(0, this.f7082E), this.f7111n.mo33651a() - 1);
        this.f7082E = iMin;
        Object[] objArr = new Object[this.f7086I];
        int i13 = (int) (this.f7081D / this.f7117t);
        this.f7085H = i13;
        try {
            this.f7084G = iMin + (i13 % this.f7111n.mo33651a());
            while (true) {
                int i14 = this.f7086I;
                if (i11 >= i14) {
                    break;
                }
                int i15 = this.f7084G - ((i14 / 2) - i11);
                if (this.f7123z) {
                    objArr[i11] = this.f7111n.getItem(m6982d(i15));
                } else if (i15 < 0) {
                    objArr[i11] = "";
                } else if (i15 > this.f7111n.mo33651a() - 1) {
                    objArr[i11] = "";
                } else {
                    objArr[i11] = this.f7111n.getItem(i15);
                }
                i11++;
            }
        } catch (ArithmeticException unused) {
            Log.e("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.f7123z) {
            if (this.f7084G < 0) {
                this.f7084G = this.f7111n.mo33651a() + this.f7084G;
            }
            if (this.f7084G > this.f7111n.mo33651a() - 1) {
                this.f7084G -= this.f7111n.mo33651a();
            }
        } else {
            if (this.f7084G < 0) {
                this.f7084G = 0;
            }
            if (this.f7084G > this.f7111n.mo33651a() - 1) {
                this.f7084G = this.f7111n.mo33651a() - 1;
            }
        }
        float f11 = this.f7081D % this.f7117t;
        i11 = 0;
        boolean z14 = false;
        if (this.f7099b == DividerType.WRAP) {
            float f12 = (TextUtils.isEmpty(this.f7112o) ? (this.f7088K - this.f7114q) / 2 : (this.f7088K - this.f7114q) / 4) - 12;
            if (f12 <= 0.0f) {
                f12 = 10.0f;
            }
            float f13 = f12;
            float f14 = this.f7088K - f13;
            float f15 = this.f7078A;
            canvas2 = canvas;
            canvas2.drawLine(f13, f15, f14, f15, this.f7110m);
            float f16 = this.f7079B;
            canvas2.drawLine(f13, f16, f14, f16, this.f7110m);
        } else {
            float f17 = this.f7078A;
            canvas.drawLine(0.0f, f17, this.f7088K, f17, this.f7110m);
            float f18 = this.f7079B;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f18, this.f7088K, f18, this.f7110m);
        }
        if (!TextUtils.isEmpty(this.f7112o) && this.f7105h) {
            canvas2.drawText(this.f7112o, (this.f7088K - m6983e(this.f7109l, this.f7112o)) - this.f7097T, this.f7080C, this.f7109l);
        }
        int i16 = 0;
        while (i16 < this.f7086I) {
            canvas2.save();
            double d11 = ((this.f7117t * i16) - f11) / this.f7089L;
            float f19 = (float) (90.0d - ((d11 / 3.141592653589793d) * 180.0d));
            if (f19 >= 90.0f || f19 <= -90.0f) {
                z11 = z13;
                z12 = z14;
                canvas2.restore();
            } else {
                float fPow = (float) Math.pow(Math.abs(f19) / 90.0f, 2.2d);
                if (this.f7105h || TextUtils.isEmpty(this.f7112o) || TextUtils.isEmpty(m6981c(objArr[i16]))) {
                    strM6981c = m6981c(objArr[i16]);
                } else {
                    strM6981c = m6981c(objArr[i16]) + this.f7112o;
                }
                m6992n(strM6981c);
                m6989k(strM6981c);
                m6990l(strM6981c);
                String str = strM6981c;
                float fCos = (float) ((((double) this.f7089L) - (Math.cos(d11) * ((double) this.f7089L))) - ((Math.sin(d11) * ((double) this.f7115r)) / 2.0d));
                canvas2.translate(0.0f, fCos);
                float f21 = this.f7078A;
                if (fCos > f21 || this.f7115r + fCos < f21) {
                    float f22 = this.f7079B;
                    if (fCos > f22 || this.f7115r + fCos < f22) {
                        if (fCos >= f21) {
                            int i17 = this.f7115r;
                            if (i17 + fCos <= f22) {
                                canvas2.drawText(str, this.f7095R, i17 - this.f7097T, this.f7109l);
                                this.f7083F = this.f7084G - ((this.f7086I / 2) - i16);
                            }
                            canvas2.restore();
                            this.f7109l.setTextSize(this.f7113p);
                        }
                        canvas2.save();
                        z11 = false;
                        canvas2.clipRect(0, 0, this.f7088K, (int) this.f7117t);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                        Paint paint = this.f7108k;
                        int i18 = this.f7116s;
                        if (i18 == 0) {
                            i12 = 0;
                        } else {
                            i12 = i18 > 0 ? 1 : -1;
                        }
                        z12 = false;
                        paint.setTextSkewX(i12 * (f19 <= 0.0f ? 1 : -1) * 0.5f * fPow);
                        this.f7108k.setAlpha((int) ((1.0f - fPow) * 255.0f));
                        canvas2.drawText(str, this.f7096S + (this.f7116s * fPow), this.f7115r, this.f7108k);
                        canvas2.restore();
                        canvas2.restore();
                        this.f7109l.setTextSize(this.f7113p);
                    } else {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.f7088K, this.f7079B - fCos);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 1.0f);
                        canvas2.drawText(str, this.f7095R, this.f7115r - this.f7097T, this.f7109l);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.clipRect(0.0f, this.f7079B - fCos, this.f7088K, (int) this.f7117t);
                        canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                        canvas2.drawText(str, this.f7096S, this.f7115r, this.f7108k);
                        canvas2.restore();
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.f7088K, this.f7078A - fCos);
                    canvas2.scale(1.0f, ((float) Math.sin(d11)) * 0.8f);
                    canvas2.drawText(str, this.f7096S, this.f7115r, this.f7108k);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipRect(0.0f, this.f7078A - fCos, this.f7088K, (int) this.f7117t);
                    canvas2.scale(1.0f, ((float) Math.sin(d11)) * 1.0f);
                    canvas2.drawText(str, this.f7095R, this.f7115r - this.f7097T, this.f7109l);
                    canvas2.restore();
                }
                z11 = false;
                z12 = false;
                canvas2.restore();
                this.f7109l.setTextSize(this.f7113p);
            }
            i16++;
            z13 = z11;
            z14 = z12;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        this.f7093P = i11;
        m6993o();
        setMeasuredDimension(this.f7088K, this.f7087J);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f7102e.onTouchEvent(motionEvent);
        float f11 = (-this.f7082E) * this.f7117t;
        float fMo33651a = ((this.f7111n.mo33651a() - 1) - this.f7082E) * this.f7117t;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7092O = System.currentTimeMillis();
            m6980b();
            this.f7091N = motionEvent.getRawY();
        } else {
            if (action == 2) {
                float rawY = this.f7091N - motionEvent.getRawY();
                this.f7091N = motionEvent.getRawY();
                float f12 = this.f7081D + rawY;
                this.f7081D = f12;
                if (!this.f7123z) {
                    float f13 = this.f7117t;
                    if ((f12 - (f13 * 0.25f) < f11 && rawY < 0.0f) || ((f13 * 0.25f) + f12 > fMo33651a && rawY > 0.0f)) {
                        this.f7081D = f12 - rawY;
                    }
                }
                return true;
            }
            if (!zOnTouchEvent) {
                float y11 = motionEvent.getY();
                int i11 = this.f7089L;
                double dAcos = Math.acos((i11 - y11) / i11) * ((double) this.f7089L);
                float f14 = this.f7117t;
                this.f7090M = (int) (((((int) ((dAcos + ((double) (f14 / 2.0f))) / ((double) f14))) - (this.f7086I / 2)) * f14) - (((this.f7081D % f14) + f14) % f14));
                if (System.currentTimeMillis() - this.f7092O > 120) {
                    m6995q(ACTION.DAGGLE);
                } else {
                    m6995q(ACTION.CLICK);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC44627a interfaceC44627a) {
        this.f7111n = interfaceC44627a;
        m6993o();
        invalidate();
    }

    public final void setCurrentItem(int i11) {
        this.f7083F = i11;
        this.f7082E = i11;
        this.f7081D = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z11) {
        this.f7123z = z11;
    }

    public void setDividerColor(int i11) {
        this.f7121x = i11;
        this.f7110m.setColor(i11);
    }

    public void setDividerType(DividerType dividerType) {
        this.f7099b = dividerType;
    }

    public void setGravity(int i11) {
        this.f7094Q = i11;
    }

    public void setIsOptions(boolean z11) {
        this.f7104g = z11;
    }

    public void setLabel(String str) {
        this.f7112o = str;
    }

    public final void setOnItemSelectedListener(InterfaceC45364b interfaceC45364b) {
        this.f7103f = interfaceC45364b;
    }

    public void setTextColorCenter(int i11) {
        this.f7120w = i11;
        this.f7109l.setColor(i11);
    }

    public void setTextColorOut(int i11) {
        this.f7119v = i11;
        this.f7108k.setColor(i11);
    }

    public void setTextXOffset(int i11) {
        this.f7116s = i11;
        if (i11 != 0) {
            this.f7109l.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f11) {
        this.f7081D = f11;
    }

    public final void setTypeface(Typeface typeface) {
        this.f7118u = typeface;
        this.f7108k.setTypeface(typeface);
        this.f7109l.setTypeface(this.f7118u);
    }

    /* JADX INFO: renamed from: p */
    public final void m6994p(float f11) {
        m6980b();
        this.f7107j = this.f7106i.scheduleWithFixedDelay(new C45697a(this, f11), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: q */
    public void m6995q(ACTION action) {
        m6980b();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f11 = this.f7081D;
            float f12 = this.f7117t;
            int i11 = (int) (((f11 % f12) + f12) % f12);
            this.f7090M = i11;
            if (i11 > f12 / 2.0f) {
                this.f7090M = (int) (f12 - i11);
            } else {
                this.f7090M = -i11;
            }
        }
        this.f7107j = this.f7106i.scheduleWithFixedDelay(new C45699c(this, this.f7090M), 0L, 10L, TimeUnit.MILLISECONDS);
    }
}

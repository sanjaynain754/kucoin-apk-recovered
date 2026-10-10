package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.res.R$styleable;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class OrderBookItemView extends View {

    /* JADX INFO: renamed from: b */
    public int f43956b;

    /* JADX INFO: renamed from: c */
    public int f43957c;

    /* JADX INFO: renamed from: d */
    public int f43958d;

    /* JADX INFO: renamed from: e */
    public int f43959e;

    /* JADX INFO: renamed from: f */
    public String[] f43960f;

    /* JADX INFO: renamed from: g */
    public float[] f43961g;

    /* JADX INFO: renamed from: h */
    public float f43962h;

    /* JADX INFO: renamed from: i */
    public int f43963i;

    /* JADX INFO: renamed from: j */
    public int f43964j;

    /* JADX INFO: renamed from: k */
    public int f43965k;

    /* JADX INFO: renamed from: l */
    public float f43966l;

    /* JADX INFO: renamed from: m */
    public int f43967m;

    /* JADX INFO: renamed from: n */
    public final Paint f43968n;

    /* JADX INFO: renamed from: o */
    public boolean f43969o;

    /* JADX INFO: renamed from: p */
    public boolean f43970p;

    /* JADX INFO: renamed from: q */
    public float f43971q;

    /* JADX INFO: renamed from: r */
    public boolean f43972r;

    /* JADX INFO: renamed from: s */
    public int f43973s;

    /* JADX INFO: renamed from: t */
    public InterfaceC22934a f43974t;

    /* JADX INFO: renamed from: u */
    public final Paint f43975u;

    /* JADX INFO: renamed from: v */
    public final RectF f43976v;

    /* JADX INFO: renamed from: w */
    public final Bitmap f43977w;

    /* JADX INFO: renamed from: x */
    public final Bitmap f43978x;

    /* JADX INFO: renamed from: com.kubi.resources.widget.OrderBookItemView$a */
    public interface InterfaceC22934a {
        /* JADX INFO: renamed from: a */
        void mo22630a(int i11, String[] strArr);
    }

    public OrderBookItemView(Context context) {
        this(context, null);
    }

    public void setText(String... strArr) {
        this.f43970p = false;
        m54702b(strArr);
    }

    @SuppressLint({"RestrictedApi"})
    public OrderBookItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43962h = C5275i0.m6241f(14.0f);
        this.f43965k = 0;
        this.f43966l = -1.0f;
        this.f43967m = 0;
        this.f43969o = false;
        this.f43970p = false;
        this.f43971q = 0.0f;
        this.f43973s = 0;
        this.f43975u = new Paint(1);
        this.f43976v = new RectF(0.0f, 0.0f, 0.0f, getMeasuredHeight());
        this.f43977w = C5290q.m6354e(R$mipmap.icon_position_flag);
        this.f43978x = C5290q.m6354e(R$mipmap.icon_position_flag_right);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OrderBookItemView);
        this.f43956b = typedArrayObtainStyledAttributes.getColor(R$styleable.OrderBookItemView_buyProgressColor, Color.parseColor("#1401AA78"));
        this.f43957c = typedArrayObtainStyledAttributes.getColor(R$styleable.OrderBookItemView_sellProgressColor, Color.parseColor("#14FF5454"));
        this.f43958d = typedArrayObtainStyledAttributes.getColor(R$styleable.OrderBookItemView_sellColor, Color.parseColor("#DC5656"));
        this.f43959e = typedArrayObtainStyledAttributes.getColor(R$styleable.OrderBookItemView_buyColor, Color.parseColor("#2dbd96"));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.OrderBookItemView_order_text_size, C5275i0.m6241f(14.0f));
        Paint paint = new Paint();
        this.f43968n = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(dimensionPixelSize);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        setOrderBookType(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m54701a() {
        String[] strArr = this.f43960f;
        if (strArr == null || strArr.length != 2) {
            return;
        }
        float fM6236a = C5275i0.m6236a(5.0f);
        float fM6236a2 = C5275i0.m6236a(4.0f);
        String[] strArr2 = this.f43960f;
        String str = strArr2[0];
        String str2 = strArr2[1];
        this.f43968n.setTextSize(this.f43962h);
        for (float textSize = this.f43968n.getTextSize(); textSize > fM6236a; textSize -= 1.0f) {
            this.f43968n.setTextSize(textSize);
            float fMeasureText = this.f43968n.measureText(str);
            float fMeasureText2 = this.f43968n.measureText(str2);
            float paddingLeft = getPaddingLeft();
            float width = (getWidth() - getPaddingRight()) - fMeasureText2;
            if (fMeasureText + paddingLeft + fM6236a2 <= width) {
                float[] fArr = this.f43961g;
                fArr[0] = paddingLeft;
                fArr[1] = width;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54702b(String... strArr) {
        if (this.f43960f == null || this.f43961g == null) {
            setColumnCount(2);
        }
        for (int i11 = 0; i11 < this.f43967m; i11++) {
            if (i11 >= strArr.length) {
                this.f43960f[i11] = "--";
            } else {
                this.f43960f[i11] = strArr[i11];
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43970p) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f43974t == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            float x11 = motionEvent.getX();
            try {
                String[] strArr = new String[this.f43967m];
                int i11 = 0;
                while (true) {
                    float[] fArr = this.f43961g;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    String[] strArr2 = this.f43960f;
                    String str = strArr2[i11];
                    if (x11 < fArr[i11] && i11 == 0) {
                        break;
                    }
                    float fMeasureText = this.f43968n.measureText(this.f43965k == 0 ? str : strArr2[(this.f43967m - i11) - 1]);
                    float f11 = this.f43961g[i11];
                    if (x11 < f11) {
                        strArr[i11] = str;
                        this.f43974t.mo22630a(-i11, strArr);
                        break;
                    }
                    if (x11 < f11 + fMeasureText) {
                        strArr[i11] = str;
                        this.f43974t.mo22630a(i11, strArr);
                        break;
                    }
                    strArr[i11] = str;
                    i11++;
                }
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAmountColor(int i11) {
        this.f43964j = i11;
    }

    public void setBuyColor(@ColorInt int i11) {
        this.f43959e = i11;
    }

    public void setBuyProgressColor(@ColorInt int i11) {
        this.f43956b = i11;
    }

    public void setColumnCount(int i11) {
        this.f43967m = i11;
        this.f43960f = new String[i11];
        this.f43961g = new float[i11];
    }

    public void setDirection(int i11) {
        this.f43965k = i11;
    }

    public void setNeedDash(boolean z11) {
        this.f43972r = z11;
    }

    public void setNeedShowPosition(boolean z11) {
        this.f43969o = z11;
    }

    public void setOnSelectListener(InterfaceC22934a interfaceC22934a) {
        this.f43974t = interfaceC22934a;
    }

    public void setOrderBookType(int i11) {
        this.f43973s = i11;
        this.f43963i = i11 == 0 ? this.f43958d : this.f43959e;
    }

    public void setProgress(float f11) {
        this.f43966l = Math.min(f11, 100.0f);
    }

    public void setSellColor(@ColorInt int i11) {
        this.f43958d = i11;
    }

    public void setSellProgressColor(@ColorInt int i11) {
        this.f43957c = i11;
    }

    public void setTextFont(Typeface typeface) {
        this.f43968n.setTypeface(typeface);
    }

    public void setTextSize(float f11) {
        this.f43962h = f11;
        this.f43968n.setTextSize(f11);
        invalidate();
    }

    private Bitmap getBitmapLeft() {
        if (C5303w0.m6511a()) {
            return this.f43978x;
        }
        return this.f43977w;
    }

    private Bitmap getBitmapRight() {
        if (C5303w0.m6511a()) {
            return this.f43977w;
        }
        return this.f43978x;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String str;
        float paddingLeft;
        int i11;
        m54701a();
        super.onDraw(canvas);
        if (this.f43966l != -1.0f) {
            this.f43975u.setAntiAlias(true);
            this.f43975u.setStyle(Paint.Style.FILL);
            if (!this.f43970p) {
                Paint paint = this.f43975u;
                if (this.f43973s == 0) {
                    i11 = this.f43957c;
                } else {
                    i11 = this.f43956b;
                }
                paint.setColor(i11);
            } else {
                this.f43975u.setColor(0);
            }
            float measuredHeight = getMeasuredHeight();
            if (this.f43972r) {
                RectF rectF = this.f43976v;
                double d11 = measuredHeight;
                rectF.top = (float) (0.05d * d11);
                rectF.bottom = (float) (d11 * 0.95d);
            } else {
                this.f43976v.bottom = measuredHeight;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.f43965k == 0) {
                if (getLayoutDirection() == 1) {
                    RectF rectF2 = this.f43976v;
                    rectF2.right = 0.0f;
                    rectF2.left = (getMeasuredWidth() * this.f43966l) / 100.0f;
                } else {
                    RectF rectF3 = this.f43976v;
                    float f11 = measuredWidth;
                    rectF3.right = f11;
                    rectF3.left = f11 - ((this.f43966l / 100.0f) * f11);
                }
            } else if (this.f43973s != 0) {
                if (getLayoutDirection() == 1) {
                    RectF rectF4 = this.f43976v;
                    rectF4.right = 0.0f;
                    rectF4.left = (getMeasuredWidth() * this.f43966l) / 100.0f;
                } else {
                    RectF rectF5 = this.f43976v;
                    float f12 = measuredWidth;
                    rectF5.right = f12;
                    rectF5.left = f12 - ((this.f43966l / 100.0f) * f12);
                }
            } else if (getLayoutDirection() == 1) {
                RectF rectF6 = this.f43976v;
                float f13 = measuredWidth;
                rectF6.right = f13;
                rectF6.left = f13 - ((this.f43966l / 100.0f) * f13);
            } else {
                RectF rectF7 = this.f43976v;
                rectF7.right = 0.0f;
                rectF7.left = (getMeasuredWidth() * this.f43966l) / 100.0f;
            }
            canvas.drawRect(this.f43976v, this.f43975u);
        }
        if (this.f43960f == null || this.f43961g == null) {
            setColumnCount(2);
        }
        Paint.FontMetrics fontMetrics = this.f43968n.getFontMetrics();
        float f14 = fontMetrics.top;
        float f15 = fontMetrics.bottom;
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i12 = (int) ((measuredHeight2 - (f14 / 2.0f)) - (f15 / 2.0f));
        float measuredWidth2 = getMeasuredWidth();
        int i13 = this.f43967m;
        float f16 = this.f43971q;
        float f17 = (measuredWidth2 - (i13 * f16)) / i13;
        for (int i14 = 0; i14 < this.f43960f.length; i14++) {
            if (this.f43965k == 0) {
                if (getLayoutDirection() == 1) {
                    if (i14 == 0) {
                        this.f43968n.setColor(this.f43964j);
                        str = this.f43960f[i14 + 1];
                    } else {
                        this.f43968n.setColor(this.f43963i);
                        str = this.f43960f[i14 - 1];
                    }
                } else {
                    if (i14 == 0) {
                        this.f43968n.setColor(this.f43963i);
                    } else {
                        this.f43968n.setColor(this.f43964j);
                    }
                    str = this.f43960f[i14];
                }
            } else if (getLayoutDirection() == 1) {
                if (this.f43973s == 0) {
                    if (i14 == 0) {
                        this.f43968n.setColor(this.f43964j);
                        str = this.f43960f[i14 + 1];
                    } else {
                        this.f43968n.setColor(this.f43963i);
                        str = this.f43960f[i14 - 1];
                    }
                } else {
                    if (i14 == 0) {
                        this.f43968n.setColor(this.f43963i);
                    } else {
                        this.f43968n.setColor(this.f43964j);
                    }
                    str = this.f43960f[i14];
                }
            } else if (this.f43973s == 0) {
                if (i14 == 0) {
                    this.f43968n.setColor(this.f43963i);
                } else {
                    this.f43968n.setColor(this.f43964j);
                }
                str = this.f43960f[i14];
            } else if (i14 == 0) {
                this.f43968n.setColor(this.f43964j);
                str = this.f43960f[i14 + 1];
            } else {
                this.f43968n.setColor(this.f43963i);
                str = this.f43960f[i14 - 1];
            }
            Bitmap bitmapRight = getBitmapRight();
            Bitmap bitmapLeft = getBitmapLeft();
            if (this.f43967m == 2 && i14 == this.f43960f.length - 1) {
                paddingLeft = (getMeasuredWidth() - this.f43968n.measureText(str)) - getPaddingRight();
                if (this.f43969o && this.f43973s != 0 && this.f43965k != 0) {
                    canvas.drawBitmap(bitmapRight, paddingLeft - C5275i0.m6236a(8.0f), measuredHeight2 - C5275i0.m6236a(3.0f), (Paint) null);
                }
            } else {
                paddingLeft = f16 + getPaddingLeft();
                if (this.f43969o && (this.f43973s == 0 || this.f43965k == 0)) {
                    canvas.drawBitmap(bitmapLeft, this.f43968n.measureText(str) + paddingLeft + C5275i0.m6236a(4.0f), measuredHeight2 - C5275i0.m6236a(3.0f), (Paint) null);
                }
            }
            this.f43961g[i14] = paddingLeft;
            canvas.drawText(str, paddingLeft, i12, this.f43968n);
            f16 += this.f43971q + f17;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int iM6183e = C5267e0.m6183e();
        if (mode == 1073741824) {
            iM6183e = View.MeasureSpec.getSize(i11);
        }
        int iM6236a = C5275i0.m6236a(22.0f);
        if (View.MeasureSpec.getMode(i12) == 1073741824) {
            iM6236a = View.MeasureSpec.getSize(i12);
        }
        setMeasuredDimension(iM6183e, iM6236a);
    }

    public void setColumnPadding(float f11) {
        this.f43971q = C5275i0.m6236a(f11);
    }
}

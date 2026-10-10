package com.kubi.resources.widget.flyco;

import android.R;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kubi.otc.entity.OtcAd;
import com.kubi.uikit.R$id;
import com.kubi.uikit.R$layout;
import com.kubi.uikit.R$styleable;
import p739ww.C45938b;

/* JADX INFO: loaded from: classes13.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: A */
    public float f44712A;

    /* JADX INFO: renamed from: B */
    public float f44713B;

    /* JADX INFO: renamed from: C */
    public int f44714C;

    /* JADX INFO: renamed from: D */
    public int f44715D;

    /* JADX INFO: renamed from: E */
    public int f44716E;

    /* JADX INFO: renamed from: F */
    public boolean f44717F;

    /* JADX INFO: renamed from: G */
    public int f44718G;

    /* JADX INFO: renamed from: H */
    public int f44719H;

    /* JADX INFO: renamed from: I */
    public float f44720I;

    /* JADX INFO: renamed from: J */
    public int f44721J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f44722K;

    /* JADX INFO: renamed from: L */
    public OvershootInterpolator f44723L;

    /* JADX INFO: renamed from: M */
    public float[] f44724M;

    /* JADX INFO: renamed from: N */
    public boolean f44725N;

    /* JADX INFO: renamed from: O */
    public Paint f44726O;

    /* JADX INFO: renamed from: P */
    public SparseArray<Boolean> f44727P;

    /* JADX INFO: renamed from: Q */
    public C45938b f44728Q;

    /* JADX INFO: renamed from: R */
    public C23050b f44729R;

    /* JADX INFO: renamed from: S */
    public C23050b f44730S;

    /* JADX INFO: renamed from: b */
    public Context f44731b;

    /* JADX INFO: renamed from: c */
    public String[] f44732c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f44733d;

    /* JADX INFO: renamed from: e */
    public int f44734e;

    /* JADX INFO: renamed from: f */
    public int f44735f;

    /* JADX INFO: renamed from: g */
    public int f44736g;

    /* JADX INFO: renamed from: h */
    public Rect f44737h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f44738i;

    /* JADX INFO: renamed from: j */
    public GradientDrawable f44739j;

    /* JADX INFO: renamed from: k */
    public Paint f44740k;

    /* JADX INFO: renamed from: l */
    public float f44741l;

    /* JADX INFO: renamed from: m */
    public boolean f44742m;

    /* JADX INFO: renamed from: n */
    public float f44743n;

    /* JADX INFO: renamed from: o */
    public int f44744o;

    /* JADX INFO: renamed from: p */
    public float f44745p;

    /* JADX INFO: renamed from: q */
    public float f44746q;

    /* JADX INFO: renamed from: r */
    public float f44747r;

    /* JADX INFO: renamed from: s */
    public float f44748s;

    /* JADX INFO: renamed from: t */
    public float f44749t;

    /* JADX INFO: renamed from: u */
    public float f44750u;

    /* JADX INFO: renamed from: v */
    public long f44751v;

    /* JADX INFO: renamed from: w */
    public boolean f44752w;

    /* JADX INFO: renamed from: x */
    public boolean f44753x;

    /* JADX INFO: renamed from: y */
    public int f44754y;

    /* JADX INFO: renamed from: z */
    public float f44755z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SegmentTabLayout$a */
    public class ViewOnClickListenerC23049a implements View.OnClickListener {
        public ViewOnClickListenerC23049a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (SegmentTabLayout.this.f44734e != iIntValue) {
                SegmentTabLayout.this.setCurrentTab(iIntValue);
                if (SegmentTabLayout.this.f44728Q != null) {
                    SegmentTabLayout.this.f44728Q.mo18273b(iIntValue);
                    return;
                }
                return;
            }
            if (SegmentTabLayout.this.f44728Q != null) {
                SegmentTabLayout.this.f44728Q.mo31156a(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SegmentTabLayout$b */
    public class C23050b {

        /* JADX INFO: renamed from: a */
        public float f44757a;

        /* JADX INFO: renamed from: b */
        public float f44758b;

        public C23050b() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SegmentTabLayout$c */
    public class C23051c implements TypeEvaluator<C23050b> {
        public C23051c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C23050b evaluate(float f11, C23050b c23050b, C23050b c23050b2) {
            float f12 = c23050b.f44757a;
            float f13 = f12 + ((c23050b2.f44757a - f12) * f11);
            float f14 = c23050b.f44758b;
            float f15 = f14 + (f11 * (c23050b2.f44758b - f14));
            C23050b c23050b3 = SegmentTabLayout.this.new C23050b();
            c23050b3.f44757a = f13;
            c23050b3.f44758b = f15;
            return c23050b3;
        }
    }

    public SegmentTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: j */
    public final void m55244j(int i11) {
        int i12 = 0;
        while (i12 < this.f44736g) {
            View childAt = this.f44733d.getChildAt(i12);
            boolean z11 = i12 == i11;
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(z11 ? this.f44714C : this.f44715D);
            if (this.f44716E == 1) {
                textView.getPaint().setFakeBoldText(z11);
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55245k() {
        int i11 = 0;
        while (i11 < this.f44736g) {
            View childAt = this.f44733d.getChildAt(i11);
            float f11 = this.f44741l;
            childAt.setPadding((int) f11, 0, (int) f11, 0);
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(i11 == this.f44734e ? this.f44714C : this.f44715D);
            textView.setTextSize(0, this.f44713B);
            if (this.f44717F) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i12 = this.f44716E;
            if (i12 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i12 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            i11++;
        }
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m55237c(int i11, View view) {
        ((TextView) view.findViewById(R$id.tv_tab_title)).setText(this.f44732c[i11]);
        view.setOnClickListener(new ViewOnClickListenerC23049a());
        LinearLayout.LayoutParams layoutParams = this.f44742m ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f44743n > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f44743n, -1);
        }
        this.f44733d.addView(view, i11, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m55238d() {
        View childAt = this.f44733d.getChildAt(this.f44734e);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f44737h;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.f44752w) {
            float[] fArr = this.f44724M;
            float f11 = this.f44746q;
            fArr[0] = f11;
            fArr[1] = f11;
            fArr[2] = f11;
            fArr[3] = f11;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f11;
            fArr[7] = f11;
            return;
        }
        int i11 = this.f44734e;
        if (i11 == 0) {
            float[] fArr2 = this.f44724M;
            float f12 = this.f44746q;
            fArr2[0] = f12;
            fArr2[1] = f12;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = f12;
            fArr2[7] = f12;
            return;
        }
        if (i11 != this.f44736g - 1) {
            float[] fArr3 = this.f44724M;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[3] = 0.0f;
            fArr3[4] = 0.0f;
            fArr3[5] = 0.0f;
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
            return;
        }
        float[] fArr4 = this.f44724M;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        float f13 = this.f44746q;
        fArr4[2] = f13;
        fArr4[3] = f13;
        fArr4[4] = f13;
        fArr4[5] = f13;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m55239e() {
        View childAt = this.f44733d.getChildAt(this.f44734e);
        this.f44729R.f44757a = childAt.getLeft();
        this.f44729R.f44758b = childAt.getRight();
        View childAt2 = this.f44733d.getChildAt(this.f44735f);
        this.f44730S.f44757a = childAt2.getLeft();
        this.f44730S.f44758b = childAt2.getRight();
        C23050b c23050b = this.f44730S;
        float f11 = c23050b.f44757a;
        C23050b c23050b2 = this.f44729R;
        if (f11 == c23050b2.f44757a && c23050b.f44758b == c23050b2.f44758b) {
            invalidate();
            return;
        }
        this.f44722K.setObjectValues(c23050b, c23050b2);
        if (this.f44753x) {
            this.f44722K.setInterpolator(this.f44723L);
        }
        if (this.f44751v < 0) {
            this.f44751v = this.f44753x ? 500L : 250L;
        }
        this.f44722K.setDuration(this.f44751v);
        this.f44722K.start();
    }

    /* JADX INFO: renamed from: f */
    public int m55240f(float f11) {
        return (int) ((f11 * this.f44731b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: g */
    public void m55241g() {
        this.f44733d.removeAllViews();
        this.f44736g = this.f44732c.length;
        for (int i11 = 0; i11 < this.f44736g; i11++) {
            View viewInflate = View.inflate(this.f44731b, R$layout.layout_tab_segment, null);
            viewInflate.setTag(Integer.valueOf(i11));
            m55237c(i11, viewInflate);
        }
        m55245k();
    }

    public int getCurrentTab() {
        return this.f44734e;
    }

    public int getDividerColor() {
        return this.f44754y;
    }

    public float getDividerPadding() {
        return this.f44712A;
    }

    public float getDividerWidth() {
        return this.f44755z;
    }

    public long getIndicatorAnimDuration() {
        return this.f44751v;
    }

    public int getIndicatorColor() {
        return this.f44744o;
    }

    public float getIndicatorCornerRadius() {
        return this.f44746q;
    }

    public float getIndicatorHeight() {
        return this.f44745p;
    }

    public float getIndicatorMarginBottom() {
        return this.f44750u;
    }

    public float getIndicatorMarginLeft() {
        return this.f44747r;
    }

    public float getIndicatorMarginRight() {
        return this.f44749t;
    }

    public float getIndicatorMarginTop() {
        return this.f44748s;
    }

    public int getTabCount() {
        return this.f44736g;
    }

    public float getTabPadding() {
        return this.f44741l;
    }

    public float getTabWidth() {
        return this.f44743n;
    }

    public int getTextBold() {
        return this.f44716E;
    }

    public int getTextSelectColor() {
        return this.f44714C;
    }

    public int getTextUnselectColor() {
        return this.f44715D;
    }

    public float getTextsize() {
        return this.f44713B;
    }

    /* JADX INFO: renamed from: h */
    public final void m55242h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SegmentTabLayout);
        this.f44744o = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_indicator_color, Color.parseColor("#222831"));
        this.f44745p = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_height, -1.0f);
        this.f44746q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_corner_radius, -1.0f);
        this.f44747r = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_left, m55240f(0.0f));
        this.f44748s = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_top, 0.0f);
        this.f44749t = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_right, m55240f(0.0f));
        this.f44750u = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_bottom, 0.0f);
        this.f44752w = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_indicator_anim_enable, false);
        this.f44753x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_indicator_bounce_enable, true);
        this.f44751v = typedArrayObtainStyledAttributes.getInt(R$styleable.SegmentTabLayout_tl_indicator_anim_duration, -1);
        this.f44754y = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_divider_color, this.f44744o);
        this.f44755z = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_divider_width, m55240f(1.0f));
        this.f44712A = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_divider_padding, 0.0f);
        this.f44713B = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_textsize, m55243i(13.0f));
        this.f44714C = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_textSelectColor, -1);
        this.f44715D = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_textUnselectColor, this.f44744o);
        this.f44716E = typedArrayObtainStyledAttributes.getInt(R$styleable.SegmentTabLayout_tl_textBold, 0);
        this.f44717F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_textAllCaps, false);
        this.f44742m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_tab_width, m55240f(-1.0f));
        this.f44743n = dimension;
        this.f44741l = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_tab_padding, (this.f44742m || dimension > 0.0f) ? m55240f(0.0f) : m55240f(10.0f));
        this.f44718G = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_bar_color, 0);
        this.f44719H = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_bar_stroke_color, this.f44744o);
        this.f44720I = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_bar_stroke_width, m55240f(1.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i */
    public int m55243i(float f11) {
        return (int) ((f11 * this.f44731b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f44734e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f44734e != 0 && this.f44733d.getChildCount() > 0) {
                m55244j(this.f44734e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f44734e);
        return bundle;
    }

    public void setCurrentTab(int i11) {
        this.f44735f = this.f44734e;
        this.f44734e = i11;
        m55244j(i11);
        if (this.f44752w) {
            m55239e();
        } else {
            invalidate();
        }
    }

    public void setDividerColor(int i11) {
        this.f44754y = i11;
        invalidate();
    }

    public void setIndicatorAnimDuration(long j11) {
        this.f44751v = j11;
    }

    public void setIndicatorAnimEnable(boolean z11) {
        this.f44752w = z11;
    }

    public void setIndicatorBounceEnable(boolean z11) {
        this.f44753x = z11;
    }

    public void setIndicatorColor(int i11) {
        this.f44744o = i11;
        invalidate();
    }

    public void setOnTabSelectListener(C45938b c45938b) {
        this.f44728Q = c45938b;
    }

    public void setTabData(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be NULL or EMPTY !");
        }
        this.f44732c = strArr;
        m55241g();
    }

    public void setTabSpaceEqual(boolean z11) {
        this.f44742m = z11;
        m55245k();
    }

    public void setTextAllCaps(boolean z11) {
        this.f44717F = z11;
        m55245k();
    }

    public void setTextBold(int i11) {
        this.f44716E = i11;
        m55245k();
    }

    public void setTextSelectColor(int i11) {
        this.f44714C = i11;
        m55245k();
    }

    public void setTextUnselectColor(int i11) {
        this.f44715D = i11;
        m55245k();
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44737h = new Rect();
        this.f44738i = new GradientDrawable();
        this.f44739j = new GradientDrawable();
        this.f44740k = new Paint(1);
        this.f44723L = new OvershootInterpolator(0.8f);
        this.f44724M = new float[8];
        this.f44725N = true;
        this.f44726O = new Paint(1);
        this.f44727P = new SparseArray<>();
        this.f44729R = new C23050b();
        this.f44730S = new C23050b();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f44731b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44733d = linearLayout;
        addView(linearLayout);
        m55242h(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals(OtcAd.KYC_NOT_PASS) && !attributeValue.equals("-2")) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.f44721J = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C23051c(), this.f44730S, this.f44729R);
        this.f44722K = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C23050b c23050b = (C23050b) valueAnimator.getAnimatedValue();
        Rect rect = this.f44737h;
        rect.left = (int) c23050b.f44757a;
        rect.right = (int) c23050b.f44758b;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f44736g > 0) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            if (this.f44745p < 0.0f) {
                this.f44745p = (height - this.f44748s) - this.f44750u;
            }
            float f11 = this.f44746q;
            if (f11 < 0.0f || f11 > this.f44745p / 2.0f) {
                this.f44746q = this.f44745p / 2.0f;
            }
            this.f44739j.setColor(this.f44718G);
            this.f44739j.setStroke((int) this.f44720I, this.f44719H);
            this.f44739j.setCornerRadius(this.f44746q);
            this.f44739j.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f44739j.draw(canvas);
            if (!this.f44752w) {
                float f12 = this.f44755z;
                if (f12 > 0.0f) {
                    this.f44740k.setStrokeWidth(f12);
                    this.f44740k.setColor(this.f44754y);
                    for (int i11 = 0; i11 < this.f44736g - 1; i11++) {
                        View childAt = this.f44733d.getChildAt(i11);
                        canvas.drawLine(childAt.getRight() + paddingLeft, this.f44712A, childAt.getRight() + paddingLeft, height - this.f44712A, this.f44740k);
                    }
                }
            }
            if (this.f44752w) {
                if (this.f44725N) {
                    this.f44725N = false;
                    m55238d();
                }
            } else {
                m55238d();
            }
            this.f44738i.setColor(this.f44744o);
            GradientDrawable gradientDrawable = this.f44738i;
            int i12 = ((int) this.f44747r) + paddingLeft;
            Rect rect = this.f44737h;
            int i13 = i12 + rect.left;
            float f13 = this.f44748s;
            gradientDrawable.setBounds(i13, (int) f13, (int) ((paddingLeft + rect.right) - this.f44749t), (int) (f13 + this.f44745p));
            this.f44738i.setCornerRadii(this.f44724M);
            this.f44738i.draw(canvas);
        }
    }

    public void setDividerPadding(float f11) {
        this.f44712A = m55240f(f11);
        invalidate();
    }

    public void setDividerWidth(float f11) {
        this.f44755z = m55240f(f11);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f11) {
        this.f44746q = m55240f(f11);
        invalidate();
    }

    public void setIndicatorHeight(float f11) {
        this.f44745p = m55240f(f11);
        invalidate();
    }

    public void setTabPadding(float f11) {
        this.f44741l = m55240f(f11);
        m55245k();
    }

    public void setTabWidth(float f11) {
        this.f44743n = m55240f(f11);
        m55245k();
    }

    public void setTextsize(float f11) {
        this.f44713B = m55243i(f11);
        m55245k();
    }
}

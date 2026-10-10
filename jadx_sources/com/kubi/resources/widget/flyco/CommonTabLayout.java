package com.kubi.resources.widget.flyco;

import android.R;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kubi.otc.entity.OtcAd;
import com.kubi.resources.widget.flyco.CommonTabLayout;
import com.kubi.uikit.R$id;
import com.kubi.uikit.R$layout;
import com.kubi.uikit.R$styleable;
import java.util.ArrayList;
import p739ww.C45938b;
import p739ww.InterfaceC45937a;

/* JADX INFO: loaded from: classes12.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: i0 */
    public static int f44580i0;

    /* JADX INFO: renamed from: A */
    public boolean f44581A;

    /* JADX INFO: renamed from: B */
    public boolean f44582B;

    /* JADX INFO: renamed from: C */
    public int f44583C;

    /* JADX INFO: renamed from: D */
    public int f44584D;

    /* JADX INFO: renamed from: E */
    public float f44585E;

    /* JADX INFO: renamed from: F */
    public int f44586F;

    /* JADX INFO: renamed from: G */
    public int f44587G;

    /* JADX INFO: renamed from: H */
    public float f44588H;

    /* JADX INFO: renamed from: I */
    public float f44589I;

    /* JADX INFO: renamed from: J */
    public float f44590J;

    /* JADX INFO: renamed from: K */
    public int f44591K;

    /* JADX INFO: renamed from: L */
    public int f44592L;

    /* JADX INFO: renamed from: M */
    public int f44593M;

    /* JADX INFO: renamed from: N */
    public boolean f44594N;

    /* JADX INFO: renamed from: O */
    public boolean f44595O;

    /* JADX INFO: renamed from: P */
    public int f44596P;

    /* JADX INFO: renamed from: Q */
    public float f44597Q;

    /* JADX INFO: renamed from: R */
    public float f44598R;

    /* JADX INFO: renamed from: S */
    public float f44599S;

    /* JADX INFO: renamed from: T */
    public int f44600T;

    /* JADX INFO: renamed from: U */
    public boolean f44601U;

    /* JADX INFO: renamed from: V */
    public View.OnClickListener f44602V;

    /* JADX INFO: renamed from: W */
    public int f44603W;

    /* JADX INFO: renamed from: a0 */
    public ValueAnimator f44604a0;

    /* JADX INFO: renamed from: b */
    public Context f44605b;

    /* JADX INFO: renamed from: b0 */
    public OvershootInterpolator f44606b0;

    /* JADX INFO: renamed from: c */
    public ArrayList<InterfaceC45937a> f44607c;

    /* JADX INFO: renamed from: c0 */
    public boolean f44608c0;

    /* JADX INFO: renamed from: d */
    public LinearLayout f44609d;

    /* JADX INFO: renamed from: d0 */
    public Paint f44610d0;

    /* JADX INFO: renamed from: e */
    public int f44611e;

    /* JADX INFO: renamed from: e0 */
    public SparseArray<Boolean> f44612e0;

    /* JADX INFO: renamed from: f */
    public int f44613f;

    /* JADX INFO: renamed from: f0 */
    public C45938b f44614f0;

    /* JADX INFO: renamed from: g */
    public int f44615g;

    /* JADX INFO: renamed from: g0 */
    public C23045a f44616g0;

    /* JADX INFO: renamed from: h */
    public Rect f44617h;

    /* JADX INFO: renamed from: h0 */
    public C23045a f44618h0;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f44619i;

    /* JADX INFO: renamed from: j */
    public Paint f44620j;

    /* JADX INFO: renamed from: k */
    public Paint f44621k;

    /* JADX INFO: renamed from: l */
    public Paint f44622l;

    /* JADX INFO: renamed from: m */
    public Path f44623m;

    /* JADX INFO: renamed from: n */
    public int f44624n;

    /* JADX INFO: renamed from: o */
    public float f44625o;

    /* JADX INFO: renamed from: p */
    public boolean f44626p;

    /* JADX INFO: renamed from: q */
    public float f44627q;

    /* JADX INFO: renamed from: r */
    public int f44628r;

    /* JADX INFO: renamed from: s */
    public float f44629s;

    /* JADX INFO: renamed from: t */
    public float f44630t;

    /* JADX INFO: renamed from: u */
    public float f44631u;

    /* JADX INFO: renamed from: v */
    public float f44632v;

    /* JADX INFO: renamed from: w */
    public float f44633w;

    /* JADX INFO: renamed from: x */
    public float f44634x;

    /* JADX INFO: renamed from: y */
    public float f44635y;

    /* JADX INFO: renamed from: z */
    public long f44636z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.CommonTabLayout$a */
    /* JADX INFO: loaded from: classes13.dex */
    public class C23045a {

        /* JADX INFO: renamed from: a */
        public float f44637a;

        /* JADX INFO: renamed from: b */
        public float f44638b;

        public C23045a() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.CommonTabLayout$b */
    /* JADX INFO: loaded from: classes13.dex */
    public class C23046b implements TypeEvaluator<C23045a> {
        public C23046b() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C23045a evaluate(float f11, C23045a c23045a, C23045a c23045a2) {
            float f12 = c23045a.f44637a;
            float f13 = f12 + ((c23045a2.f44637a - f12) * f11);
            float f14 = c23045a.f44638b;
            float f15 = f14 + (f11 * (c23045a2.f44638b - f14));
            C23045a c23045a3 = CommonTabLayout.this.new C23045a();
            c23045a3.f44637a = f13;
            c23045a3.f44638b = f15;
            return c23045a3;
        }
    }

    public CommonTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m55199i(int i11) {
        int i12 = 0;
        while (i12 < this.f44615g) {
            View childAt = this.f44609d.getChildAt(i12);
            boolean z11 = i12 == i11;
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(z11 ? this.f44591K : this.f44592L);
            ImageView imageView = (ImageView) childAt.findViewById(R$id.iv_tab_icon);
            InterfaceC45937a interfaceC45937a = this.f44607c.get(i12);
            imageView.setImageResource(z11 ? interfaceC45937a.getTabSelectedIcon() : interfaceC45937a.getTabUnselectedIcon());
            if (this.f44593M == 1) {
                textView.getPaint().setFakeBoldText(z11);
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m55200j() {
        int i11 = 0;
        while (i11 < this.f44615g) {
            View childAt = this.f44609d.getChildAt(i11);
            float f11 = this.f44625o;
            childAt.setPadding((int) f11, 0, (int) f11, 0);
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(i11 == this.f44611e ? this.f44591K : this.f44592L);
            textView.setTextSize(0, this.f44590J);
            if (this.f44594N) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i12 = this.f44593M;
            if (i12 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i12 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            ImageView imageView = (ImageView) childAt.findViewById(R$id.iv_tab_icon);
            if (this.f44595O) {
                imageView.setVisibility(0);
                InterfaceC45937a interfaceC45937a = this.f44607c.get(i11);
                imageView.setImageResource(i11 == this.f44611e ? interfaceC45937a.getTabSelectedIcon() : interfaceC45937a.getTabUnselectedIcon());
                float f12 = this.f44597Q;
                int i13 = f12 <= 0.0f ? -2 : (int) f12;
                float f13 = this.f44598R;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, f13 > 0.0f ? (int) f13 : -2);
                int i14 = this.f44596P;
                if (i14 == 3) {
                    layoutParams.rightMargin = (int) this.f44599S;
                } else if (i14 == 5) {
                    layoutParams.leftMargin = (int) this.f44599S;
                } else if (i14 == 80) {
                    layoutParams.topMargin = (int) this.f44599S;
                } else {
                    layoutParams.bottomMargin = (int) this.f44599S;
                }
                imageView.setLayoutParams(layoutParams);
            } else {
                imageView.setVisibility(8);
            }
            i11++;
        }
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void setMoreIconRes(int i11) {
        f44580i0 = i11;
    }

    /* JADX INFO: renamed from: b */
    public final void m55192b(int i11, final View view) {
        ((TextView) view.findViewById(R$id.tv_tab_title)).setText(this.f44607c.get(i11).getTabTitle());
        ((ImageView) view.findViewById(R$id.iv_tab_icon)).setImageResource(this.f44607c.get(i11).getTabUnselectedIcon());
        view.setOnClickListener(new View.OnClickListener() { // from class: vw.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonTabLayout.m55191a(this.f102970b, view, view2);
            }
        });
        LinearLayout.LayoutParams layoutParams = this.f44626p ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f44627q > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f44627q, -1);
        }
        int i12 = this.f44603W;
        if (i12 > 0) {
            layoutParams.rightMargin = m55195e(i12);
        }
        this.f44609d.addView(view, i11, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m55193c() {
        View childAt = this.f44609d.getChildAt(this.f44611e);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f44617h;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.f44630t < 0.0f) {
            return;
        }
        float left2 = childAt.getLeft();
        float width = childAt.getWidth();
        float f11 = this.f44630t;
        float f12 = left2 + ((width - f11) / 2.0f);
        Rect rect2 = this.f44617h;
        int i11 = (int) f12;
        rect2.left = i11;
        rect2.right = (int) (i11 + f11);
    }

    /* JADX INFO: renamed from: d */
    public final void m55194d() {
        View childAt = this.f44609d.getChildAt(this.f44611e);
        this.f44616g0.f44637a = childAt.getLeft();
        this.f44616g0.f44638b = childAt.getRight();
        View childAt2 = this.f44609d.getChildAt(this.f44613f);
        this.f44618h0.f44637a = childAt2.getLeft();
        this.f44618h0.f44638b = childAt2.getRight();
        C23045a c23045a = this.f44618h0;
        float f11 = c23045a.f44637a;
        C23045a c23045a2 = this.f44616g0;
        if (f11 == c23045a2.f44637a && c23045a.f44638b == c23045a2.f44638b) {
            invalidate();
            return;
        }
        this.f44604a0.setObjectValues(c23045a, c23045a2);
        if (this.f44582B) {
            this.f44604a0.setInterpolator(this.f44606b0);
        }
        if (this.f44636z < 0) {
            this.f44636z = this.f44582B ? 500L : 250L;
        }
        this.f44604a0.setDuration(this.f44636z);
        this.f44604a0.start();
    }

    /* JADX INFO: renamed from: e */
    public int m55195e(float f11) {
        return (int) ((f11 * this.f44605b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: f */
    public void m55196f() {
        View viewInflate;
        this.f44609d.removeAllViews();
        this.f44615g = this.f44607c.size();
        for (int i11 = 0; i11 < this.f44615g; i11++) {
            int i12 = this.f44596P;
            if (i12 == 3) {
                viewInflate = View.inflate(this.f44605b, R$layout.layout_tab_left, null);
            } else if (i12 == 5) {
                viewInflate = View.inflate(this.f44605b, R$layout.layout_tab_right, null);
            } else {
                viewInflate = i12 == 80 ? View.inflate(this.f44605b, R$layout.layout_tab_bottom, null) : View.inflate(this.f44605b, R$layout.layout_tab_top, null);
            }
            if (i11 == this.f44615g - 1 && this.f44601U) {
                ImageView imageView = (ImageView) viewInflate.findViewById(R$id.icon_more);
                imageView.setVisibility(0);
                imageView.setImageResource(f44580i0);
            }
            viewInflate.setTag(Integer.valueOf(i11));
            m55192b(i11, viewInflate);
        }
        m55200j();
    }

    /* JADX INFO: renamed from: g */
    public final void m55197g(Context context, AttributeSet attributeSet) {
        float f11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CommonTabLayout);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_style, 0);
        this.f44624n = i11;
        this.f44628r = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_indicator_color, Color.parseColor(i11 == 2 ? "#4B6A87" : "#ffffff"));
        int i12 = R$styleable.CommonTabLayout_tl_indicator_height;
        int i13 = this.f44624n;
        if (i13 == 1) {
            f11 = 4.0f;
        } else {
            f11 = i13 == 2 ? -1 : 2;
        }
        this.f44629s = typedArrayObtainStyledAttributes.getDimension(i12, m55195e(f11));
        this.f44630t = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_width, m55195e(this.f44624n == 1 ? 10.0f : -1.0f));
        this.f44631u = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_corner_radius, m55195e(this.f44624n == 2 ? -1.0f : 0.0f));
        this.f44632v = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_left, m55195e(0.0f));
        this.f44633w = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_top, m55195e(this.f44624n == 2 ? 7.0f : 0.0f));
        this.f44634x = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_right, m55195e(0.0f));
        this.f44635y = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_bottom, m55195e(this.f44624n != 2 ? 0.0f : 7.0f));
        this.f44581A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_indicator_anim_enable, true);
        this.f44582B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_indicator_bounce_enable, true);
        this.f44636z = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_anim_duration, -1);
        this.f44583C = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_gravity, 80);
        this.f44584D = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_underline_color, -1);
        this.f44585E = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_underline_height, m55195e(0.0f));
        this.f44586F = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_underline_gravity, 80);
        this.f44587G = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_divider_color, -1);
        this.f44588H = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_divider_width, m55195e(0.0f));
        this.f44589I = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_divider_padding, m55195e(12.0f));
        this.f44590J = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_textsize, m55198h(13.0f));
        this.f44591K = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_textSelectColor, -1);
        this.f44592L = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_textUnselectColor, -1);
        this.f44593M = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_textBold, 0);
        this.f44594N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_textAllCaps, false);
        this.f44595O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_iconVisible, false);
        this.f44596P = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_iconGravity, 48);
        this.f44597Q = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconWidth, m55195e(0.0f));
        this.f44598R = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconHeight, m55195e(0.0f));
        this.f44599S = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconMargin, m55195e(2.5f));
        this.f44626p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_tab_width, m55195e(-1.0f));
        this.f44627q = dimension;
        this.f44625o = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_tab_padding, (this.f44626p || dimension > 0.0f) ? m55195e(0.0f) : m55195e(10.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCurrentTab() {
        return this.f44611e;
    }

    public int getDividerColor() {
        return this.f44587G;
    }

    public float getDividerPadding() {
        return this.f44589I;
    }

    public float getDividerWidth() {
        return this.f44588H;
    }

    public int getIconGravity() {
        return this.f44596P;
    }

    public float getIconHeight() {
        return this.f44598R;
    }

    public float getIconMargin() {
        return this.f44599S;
    }

    public float getIconWidth() {
        return this.f44597Q;
    }

    public long getIndicatorAnimDuration() {
        return this.f44636z;
    }

    public int getIndicatorColor() {
        return this.f44628r;
    }

    public float getIndicatorCornerRadius() {
        return this.f44631u;
    }

    public float getIndicatorHeight() {
        return this.f44629s;
    }

    public float getIndicatorMarginBottom() {
        return this.f44635y;
    }

    public float getIndicatorMarginLeft() {
        return this.f44632v;
    }

    public float getIndicatorMarginRight() {
        return this.f44634x;
    }

    public float getIndicatorMarginTop() {
        return this.f44633w;
    }

    public int getIndicatorStyle() {
        return this.f44624n;
    }

    public float getIndicatorWidth() {
        return this.f44630t;
    }

    public int getTabCount() {
        return this.f44615g;
    }

    public float getTabPadding() {
        return this.f44625o;
    }

    public float getTabWidth() {
        return this.f44627q;
    }

    public int getTextBold() {
        return this.f44593M;
    }

    public int getTextSelectColor() {
        return this.f44591K;
    }

    public int getTextUnselectColor() {
        return this.f44592L;
    }

    public float getTextsize() {
        return this.f44590J;
    }

    public int getUnderlineColor() {
        return this.f44584D;
    }

    public float getUnderlineHeight() {
        return this.f44585E;
    }

    public int getWrapMargin() {
        return this.f44603W;
    }

    /* JADX INFO: renamed from: h */
    public int m55198h(float f11) {
        return (int) ((f11 * this.f44605b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.f44609d.getChildAt(this.f44611e);
        C23045a c23045a = (C23045a) valueAnimator.getAnimatedValue();
        Rect rect = this.f44617h;
        float f11 = c23045a.f44637a;
        rect.left = (int) f11;
        rect.right = (int) c23045a.f44638b;
        if (this.f44630t >= 0.0f) {
            float width = childAt.getWidth();
            float f12 = this.f44630t;
            float f13 = f11 + ((width - f12) / 2.0f);
            Rect rect2 = this.f44617h;
            int i11 = (int) f13;
            rect2.left = i11;
            rect2.right = (int) (i11 + f12);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f44611e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f44611e != 0 && this.f44609d.getChildCount() > 0) {
                m55199i(this.f44611e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f44611e);
        return bundle;
    }

    public void setCurrentTab(int i11) {
        this.f44613f = this.f44611e;
        this.f44611e = i11;
        m55199i(i11);
        if (this.f44581A) {
            m55194d();
        } else {
            invalidate();
        }
    }

    public void setDividerColor(int i11) {
        this.f44587G = i11;
        invalidate();
    }

    public void setIconGravity(int i11) {
        this.f44596P = i11;
        m55196f();
    }

    public void setIconVisible(boolean z11) {
        this.f44595O = z11;
        m55200j();
    }

    public void setIndicatorAnimDuration(long j11) {
        this.f44636z = j11;
    }

    public void setIndicatorAnimEnable(boolean z11) {
        this.f44581A = z11;
    }

    public void setIndicatorBounceEnable(boolean z11) {
        this.f44582B = z11;
    }

    public void setIndicatorColor(int i11) {
        this.f44628r = i11;
        invalidate();
    }

    public void setIndicatorGravity(int i11) {
        this.f44583C = i11;
        invalidate();
    }

    public void setIndicatorStyle(int i11) {
        this.f44624n = i11;
        invalidate();
    }

    public void setLastMoreEnable(boolean z11) {
        this.f44601U = z11;
    }

    public void setLastText(String str) {
        if (this.f44601U) {
            ((TextView) this.f44609d.getChildAt(this.f44615g - 1).findViewById(R$id.tv_tab_title)).setText(str);
            setCurrentTab(this.f44615g - 1);
        }
    }

    public void setOnLastClick(View.OnClickListener onClickListener) {
        this.f44602V = onClickListener;
    }

    public void setOnTabSelectListener(C45938b c45938b) {
        this.f44614f0 = c45938b;
    }

    public void setTabData(ArrayList<InterfaceC45937a> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
        }
        this.f44607c.clear();
        this.f44607c.addAll(arrayList);
        m55196f();
    }

    public void setTabSpaceEqual(boolean z11) {
        this.f44626p = z11;
        m55200j();
    }

    public void setTextAllCaps(boolean z11) {
        this.f44594N = z11;
        m55200j();
    }

    public void setTextBold(int i11) {
        this.f44593M = i11;
        m55200j();
    }

    public void setTextSelectColor(int i11) {
        this.f44591K = i11;
        m55200j();
    }

    public void setTextUnselectColor(int i11) {
        this.f44592L = i11;
        m55200j();
    }

    public void setUnderlineColor(int i11) {
        this.f44584D = i11;
        invalidate();
    }

    public void setUnderlineGravity(int i11) {
        this.f44586F = i11;
        invalidate();
    }

    public void setWrapMargin(int i11) {
        this.f44603W = i11;
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44607c = new ArrayList<>();
        this.f44617h = new Rect();
        this.f44619i = new GradientDrawable();
        this.f44620j = new Paint(1);
        this.f44621k = new Paint(1);
        this.f44622l = new Paint(1);
        this.f44623m = new Path();
        this.f44624n = 0;
        this.f44601U = false;
        this.f44603W = 0;
        this.f44606b0 = new OvershootInterpolator(1.5f);
        this.f44608c0 = true;
        this.f44610d0 = new Paint(1);
        this.f44612e0 = new SparseArray<>();
        this.f44616g0 = new C23045a();
        this.f44618h0 = new C23045a();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f44605b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44609d = linearLayout;
        addView(linearLayout);
        m55197g(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals(OtcAd.KYC_NOT_PASS) && !attributeValue.equals("-2")) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.f44600T = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C23046b(), this.f44618h0, this.f44616g0);
        this.f44604a0 = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m55191a(CommonTabLayout commonTabLayout, View view, View view2) {
        commonTabLayout.getClass();
        int iIntValue = ((Integer) view2.getTag()).intValue();
        if (commonTabLayout.f44601U && iIntValue == commonTabLayout.f44615g - 1) {
            View.OnClickListener onClickListener = commonTabLayout.f44602V;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        if (commonTabLayout.f44611e != iIntValue) {
            commonTabLayout.setCurrentTab(iIntValue);
            C45938b c45938b = commonTabLayout.f44614f0;
            if (c45938b != null) {
                c45938b.mo18273b(iIntValue);
                return;
            }
            return;
        }
        C45938b c45938b2 = commonTabLayout.f44614f0;
        if (c45938b2 != null) {
            c45938b2.mo31156a(iIntValue);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f44615g > 0) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            float f11 = this.f44588H;
            if (f11 > 0.0f) {
                this.f44621k.setStrokeWidth(f11);
                this.f44621k.setColor(this.f44587G);
                for (int i11 = 0; i11 < this.f44615g - 1; i11++) {
                    View childAt = this.f44609d.getChildAt(i11);
                    canvas.drawLine(childAt.getRight() + paddingLeft, this.f44589I, childAt.getRight() + paddingLeft, height - this.f44589I, this.f44621k);
                }
            }
            if (this.f44585E > 0.0f) {
                this.f44620j.setColor(this.f44584D);
                if (this.f44586F == 80) {
                    float f12 = height;
                    canvas.drawRect(paddingLeft, f12 - this.f44585E, this.f44609d.getWidth() + paddingLeft, f12, this.f44620j);
                } else {
                    canvas.drawRect(paddingLeft, 0.0f, this.f44609d.getWidth() + paddingLeft, this.f44585E, this.f44620j);
                }
            }
            if (this.f44581A) {
                if (this.f44608c0) {
                    this.f44608c0 = false;
                    m55193c();
                }
            } else {
                m55193c();
            }
            int i12 = this.f44624n;
            if (i12 == 1) {
                if (this.f44629s > 0.0f) {
                    this.f44622l.setColor(this.f44628r);
                    this.f44623m.reset();
                    float f13 = height;
                    this.f44623m.moveTo(this.f44617h.left + paddingLeft, f13);
                    Path path = this.f44623m;
                    Rect rect = this.f44617h;
                    path.lineTo((rect.left / 2) + paddingLeft + (rect.right / 2), f13 - this.f44629s);
                    this.f44623m.lineTo(paddingLeft + this.f44617h.right, f13);
                    this.f44623m.close();
                    canvas.drawPath(this.f44623m, this.f44622l);
                    return;
                }
                return;
            }
            if (i12 == 2) {
                if (this.f44629s < 0.0f) {
                    this.f44629s = (height - this.f44633w) - this.f44635y;
                }
                float f14 = this.f44629s;
                if (f14 > 0.0f) {
                    float f15 = this.f44631u;
                    if (f15 < 0.0f || f15 > f14 / 2.0f) {
                        this.f44631u = f14 / 2.0f;
                    }
                    this.f44619i.setColor(this.f44628r);
                    GradientDrawable gradientDrawable = this.f44619i;
                    int i13 = ((int) this.f44632v) + paddingLeft;
                    Rect rect2 = this.f44617h;
                    int i14 = i13 + rect2.left;
                    float f16 = this.f44633w;
                    gradientDrawable.setBounds(i14, (int) f16, (int) ((paddingLeft + rect2.right) - this.f44634x), (int) (f16 + this.f44629s));
                    this.f44619i.setCornerRadius(this.f44631u);
                    this.f44619i.draw(canvas);
                    return;
                }
                return;
            }
            if (this.f44629s > 0.0f) {
                this.f44619i.setColor(this.f44628r);
                if (this.f44583C == 80) {
                    GradientDrawable gradientDrawable2 = this.f44619i;
                    int i15 = ((int) this.f44632v) + paddingLeft;
                    Rect rect3 = this.f44617h;
                    int i16 = i15 + rect3.left;
                    int i17 = height - ((int) this.f44629s);
                    float f17 = this.f44635y;
                    gradientDrawable2.setBounds(i16, i17 - ((int) f17), (paddingLeft + rect3.right) - ((int) this.f44634x), height - ((int) f17));
                } else {
                    GradientDrawable gradientDrawable3 = this.f44619i;
                    int i18 = ((int) this.f44632v) + paddingLeft;
                    Rect rect4 = this.f44617h;
                    int i19 = i18 + rect4.left;
                    float f18 = this.f44633w;
                    gradientDrawable3.setBounds(i19, (int) f18, (paddingLeft + rect4.right) - ((int) this.f44634x), ((int) this.f44629s) + ((int) f18));
                }
                this.f44619i.setCornerRadius(this.f44631u);
                this.f44619i.draw(canvas);
            }
        }
    }

    public void setDividerPadding(float f11) {
        this.f44589I = m55195e(f11);
        invalidate();
    }

    public void setDividerWidth(float f11) {
        this.f44588H = m55195e(f11);
        invalidate();
    }

    public void setIconHeight(float f11) {
        this.f44598R = m55195e(f11);
        m55200j();
    }

    public void setIconMargin(float f11) {
        this.f44599S = m55195e(f11);
        m55200j();
    }

    public void setIconWidth(float f11) {
        this.f44597Q = m55195e(f11);
        m55200j();
    }

    public void setIndicatorCornerRadius(float f11) {
        this.f44631u = m55195e(f11);
        invalidate();
    }

    public void setIndicatorHeight(float f11) {
        this.f44629s = m55195e(f11);
        invalidate();
    }

    public void setIndicatorWidth(float f11) {
        this.f44630t = m55195e(f11);
        invalidate();
    }

    public void setTabPadding(float f11) {
        this.f44625o = m55195e(f11);
        m55200j();
    }

    public void setTabWidth(float f11) {
        this.f44627q = m55195e(f11);
        m55200j();
    }

    public void setTextsize(float f11) {
        this.f44590J = m55198h(f11);
        m55200j();
    }

    public void setUnderlineHeight(float f11) {
        this.f44585E = m55195e(f11);
        invalidate();
    }
}

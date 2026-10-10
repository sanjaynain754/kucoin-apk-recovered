package com.kubi.resources.widget.flyco;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.resources.widget.flyco.widget.MsgView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p739ww.C45938b;
import p776xw.C46336a;

/* JADX INFO: loaded from: classes13.dex */
public class RankSlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: t0 */
    public static Typeface f44641t0;

    /* JADX INFO: renamed from: u0 */
    public static Typeface f44642u0;

    /* JADX INFO: renamed from: A */
    public float f44643A;

    /* JADX INFO: renamed from: B */
    public float f44644B;

    /* JADX INFO: renamed from: C */
    public float f44645C;

    /* JADX INFO: renamed from: D */
    public float f44646D;

    /* JADX INFO: renamed from: E */
    public float f44647E;

    /* JADX INFO: renamed from: F */
    public float f44648F;

    /* JADX INFO: renamed from: G */
    public float f44649G;

    /* JADX INFO: renamed from: H */
    public int f44650H;

    /* JADX INFO: renamed from: I */
    public boolean f44651I;

    /* JADX INFO: renamed from: J */
    public boolean f44652J;

    /* JADX INFO: renamed from: K */
    public int f44653K;

    /* JADX INFO: renamed from: L */
    public float f44654L;

    /* JADX INFO: renamed from: M */
    public int f44655M;

    /* JADX INFO: renamed from: N */
    public boolean f44656N;

    /* JADX INFO: renamed from: O */
    public int f44657O;

    /* JADX INFO: renamed from: P */
    public float f44658P;

    /* JADX INFO: renamed from: Q */
    public float f44659Q;

    /* JADX INFO: renamed from: R */
    public float f44660R;

    /* JADX INFO: renamed from: S */
    public int f44661S;

    /* JADX INFO: renamed from: T */
    public int f44662T;

    /* JADX INFO: renamed from: U */
    public int f44663U;

    /* JADX INFO: renamed from: V */
    public boolean f44664V;

    /* JADX INFO: renamed from: W */
    public int f44665W;

    /* JADX INFO: renamed from: a0 */
    public int f44666a0;

    /* JADX INFO: renamed from: b */
    public Context f44667b;

    /* JADX INFO: renamed from: b0 */
    public boolean f44668b0;

    /* JADX INFO: renamed from: c */
    public ViewPager f44669c;

    /* JADX INFO: renamed from: c0 */
    public float f44670c0;

    /* JADX INFO: renamed from: d */
    public ArrayList<CharSequence> f44671d;

    /* JADX INFO: renamed from: d0 */
    public final ArgbEvaluator f44672d0;

    /* JADX INFO: renamed from: e */
    public LinearLayout f44673e;

    /* JADX INFO: renamed from: e0 */
    public long f44674e0;

    /* JADX INFO: renamed from: f */
    public int f44675f;

    /* JADX INFO: renamed from: f0 */
    public Interpolator f44676f0;

    /* JADX INFO: renamed from: g */
    public float f44677g;

    /* JADX INFO: renamed from: g0 */
    public boolean f44678g0;

    /* JADX INFO: renamed from: h */
    public int f44679h;

    /* JADX INFO: renamed from: h0 */
    public final Paint f44680h0;

    /* JADX INFO: renamed from: i */
    public final Rect f44681i;

    /* JADX INFO: renamed from: i0 */
    public final SparseArray<Boolean> f44682i0;

    /* JADX INFO: renamed from: j */
    public final Rect f44683j;

    /* JADX INFO: renamed from: j0 */
    public int f44684j0;

    /* JADX INFO: renamed from: k */
    public final GradientDrawable f44685k;

    /* JADX INFO: renamed from: k0 */
    public int f44686k0;

    /* JADX INFO: renamed from: l */
    public final Paint f44687l;

    /* JADX INFO: renamed from: l0 */
    public boolean f44688l0;

    /* JADX INFO: renamed from: m */
    public final Paint f44689m;

    /* JADX INFO: renamed from: m0 */
    public boolean f44690m0;

    /* JADX INFO: renamed from: n */
    public final Paint f44691n;

    /* JADX INFO: renamed from: n0 */
    public boolean f44692n0;

    /* JADX INFO: renamed from: o */
    public final Path f44693o;

    /* JADX INFO: renamed from: o0 */
    public final int f44694o0;

    /* JADX INFO: renamed from: p */
    public int f44695p;

    /* JADX INFO: renamed from: p0 */
    public float f44696p0;

    /* JADX INFO: renamed from: q */
    public float f44697q;

    /* JADX INFO: renamed from: q0 */
    public float f44698q0;

    /* JADX INFO: renamed from: r */
    public boolean f44699r;

    /* JADX INFO: renamed from: r0 */
    public int f44700r0;

    /* JADX INFO: renamed from: s */
    public float f44701s;

    /* JADX INFO: renamed from: s0 */
    public C45938b f44702s0;

    /* JADX INFO: renamed from: t */
    public int f44703t;

    /* JADX INFO: renamed from: u */
    public int f44704u;

    /* JADX INFO: renamed from: v */
    public int f44705v;

    /* JADX INFO: renamed from: w */
    public float f44706w;

    /* JADX INFO: renamed from: x */
    public boolean f44707x;

    /* JADX INFO: renamed from: y */
    public Drawable f44708y;

    /* JADX INFO: renamed from: z */
    public Drawable f44709z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.RankSlidingTabLayout$a */
    public class ViewOnClickListenerC23047a implements View.OnClickListener {
        public ViewOnClickListenerC23047a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOfChild = RankSlidingTabLayout.this.f44673e.indexOfChild(view);
            if (iIndexOfChild != -1) {
                if (RankSlidingTabLayout.this.f44669c.getCurrentItem() == iIndexOfChild) {
                    if (RankSlidingTabLayout.this.f44702s0 != null) {
                        RankSlidingTabLayout.this.f44702s0.mo31156a(iIndexOfChild);
                        return;
                    }
                    return;
                }
                RankSlidingTabLayout.this.m55211D(iIndexOfChild);
                if (RankSlidingTabLayout.this.f44702s0 != null) {
                    RankSlidingTabLayout.this.f44702s0.mo18273b(iIndexOfChild);
                }
                if (RankSlidingTabLayout.this.f44695p == 2) {
                    RankSlidingTabLayout.this.f44669c.setCurrentItem(iIndexOfChild, true);
                } else if (RankSlidingTabLayout.this.f44668b0) {
                    RankSlidingTabLayout.this.f44669c.setCurrentItem(iIndexOfChild, false);
                } else {
                    RankSlidingTabLayout.this.f44669c.setCurrentItem(iIndexOfChild);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.RankSlidingTabLayout$b */
    public static class C23048b extends Scroller {

        /* JADX INFO: renamed from: a */
        public int f44711a;

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14, int i15) {
            super.startScroll(i11, i12, i13, i14, this.f44711a);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14) {
            super.startScroll(i11, i12, i13, i14, this.f44711a);
        }

        public C23048b(Context context, Interpolator interpolator, int i11) {
            super(context, interpolator);
            this.f44711a = i11;
        }
    }

    public RankSlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: B */
    public final void m55209B() {
        int i11 = 0;
        while (i11 < this.f44679h) {
            View childAt = this.f44673e.getChildAt(i11);
            boolean z11 = i11 == this.f44675f;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(R$id.tv_tab_title) : null;
            if (textView != null) {
                textView.setTextColor(z11 ? this.f44661S : this.f44662T);
                if (f44641t0 == null || f44642u0 == null || C5303w0.m6511a()) {
                    textView.getPaint().setFakeBoldText(z11);
                } else {
                    textView.setTypeface(z11 ? f44642u0 : f44641t0);
                }
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m55211D(int i11) {
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f44679h) {
            View childAt = this.f44673e.getChildAt(i14);
            boolean z11 = i14 == i11;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(R$id.tv_tab_title) : null;
            if (textView != null) {
                if (!this.f44690m0) {
                    textView.setTextColor(z11 ? this.f44661S : this.f44662T);
                }
                if (this.f44688l0 && this.f44663U == 1 && !this.f44690m0) {
                    if (f44641t0 == null || f44642u0 == null || C5303w0.m6511a()) {
                        textView.getPaint().setFakeBoldText(z11);
                    } else {
                        textView.setTypeface(z11 ? f44642u0 : f44641t0);
                    }
                }
            }
            if (!this.f44707x && this.f44695p == 2 && (i12 = this.f44704u) != -1 && (i13 = this.f44705v) != -1 && textView != null) {
                if (z11) {
                    i12 = i13;
                }
                textView.setBackgroundResource(i12);
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m55212E() {
        int i11 = 0;
        while (i11 < this.f44679h) {
            TextView textView = (TextView) this.f44673e.getChildAt(i11).findViewById(R$id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i11 == this.f44675f ? this.f44661S : this.f44662T);
                textView.setTextSize(0, this.f44660R);
                float f11 = this.f44697q;
                textView.setPaddingRelative((int) f11, 0, (int) f11, 0);
                if (this.f44664V) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                textView.setMinWidth((int) (m55220l(textView) + (this.f44697q * 2.0f) + m55221m(textView)));
                int i12 = this.f44663U;
                if (i12 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i12 == 1) {
                    m55211D(this.f44675f);
                } else if (i12 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (this.f44695p == 0 && (textView.getParent() instanceof RelativeLayout)) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.removeRule(13);
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    textView.setLayoutParams(layoutParams);
                    textView.setPaddingRelative(textView.getPaddingStart(), 0, textView.getPaddingEnd(), m55219k(11.0f));
                }
                if (this.f44695p == 2 && this.f44704u > 0) {
                    float f12 = this.f44697q;
                    float f13 = this.f44647E;
                    textView.setPaddingRelative((int) f12, ((int) f13) / 2, (int) f12, ((int) f13) / 2);
                    if (this.f44707x) {
                        textView.setBackgroundResource(this.f44704u);
                    } else {
                        textView.setBackgroundResource(i11 == this.f44675f ? this.f44705v : this.f44704u);
                    }
                    if (this.f44706w > 0.0f) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams2.setMarginEnd((int) this.f44706w);
                        textView.setLayoutParams(layoutParams2);
                    }
                }
            }
            i11++;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i11) {
        boolean z11 = true;
        if (i11 != 1 && i11 != 2) {
            z11 = false;
        }
        this.f44690m0 = z11;
        if (i11 == 0) {
            m55209B();
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m55225q() {
        int width;
        View childAt = getChildAt(0);
        return childAt != null && (width = (getWidth() - getPaddingLeft()) - getPaddingRight()) > 0 && childAt.getWidth() > width;
    }

    public RankSlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: A */
    public int m55208A(float f11) {
        return (int) ((f11 * this.f44667b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: C */
    public final void m55210C(CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView == null || charSequence == null) {
            return;
        }
        textView.setText(charSequence);
        m55214G(view);
        m55213F(textView);
    }

    /* JADX INFO: renamed from: G */
    public final void m55214G(View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        int i11 = this.f44684j0;
        if (i11 != -1) {
            textView.setMaxLines(i11);
        }
        if (this.f44686k0 != -1) {
            textView.setGravity(17);
            textView.setMinHeight(this.f44686k0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m55215g(int i11, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setOnClickListener(new ViewOnClickListenerC23047a());
        LinearLayout.LayoutParams layoutParams = this.f44699r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f44701s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f44701s, -1);
        }
        this.f44673e.addView(view, i11, layoutParams);
    }

    public int getCurrentTab() {
        return this.f44675f;
    }

    public int getDividerColor() {
        return this.f44657O;
    }

    public float getDividerPadding() {
        return this.f44659Q;
    }

    public float getDividerWidth() {
        return this.f44658P;
    }

    public int getIndicatorColor() {
        return this.f44703t;
    }

    public float getIndicatorCornerRadius() {
        return this.f44645C;
    }

    public float getIndicatorHeight() {
        return this.f44643A;
    }

    public float getIndicatorMarginBottom() {
        return this.f44649G;
    }

    public float getIndicatorMarginLeft() {
        return this.f44646D;
    }

    public float getIndicatorMarginRight() {
        return this.f44648F;
    }

    public float getIndicatorMarginTop() {
        return this.f44647E;
    }

    public int getIndicatorStyle() {
        return this.f44695p;
    }

    public float getIndicatorWidth() {
        return this.f44644B;
    }

    public int getTabCount() {
        return this.f44679h;
    }

    public float getTabPadding() {
        return this.f44697q;
    }

    public float getTabWidth() {
        return this.f44701s;
    }

    public int getTextBold() {
        return this.f44663U;
    }

    public int getTextSelectColor() {
        return this.f44661S;
    }

    public int getTextUnselectColor() {
        return this.f44662T;
    }

    public float getTextsize() {
        return this.f44660R;
    }

    public int getUnderlineColor() {
        return this.f44653K;
    }

    public float getUnderlineHeight() {
        return this.f44654L;
    }

    /* JADX INFO: renamed from: h */
    public final void m55216h() {
        if (this.f44669c != null && this.f44678g0) {
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                declaredField.set(this.f44669c, new C23048b(this.f44669c.getContext(), this.f44676f0, (int) this.f44674e0));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m55217i() {
        View childAt = this.f44673e.getChildAt(this.f44675f);
        if (childAt != null) {
            if (this.f44644B < 0.0f) {
                return;
            }
            int i11 = R$id.tv_tab_title;
            TextView textView = (TextView) childAt.findViewById(i11);
            this.f44680h0.setTextSize(this.f44660R);
            float fM55223o = (m55223o(textView) - this.f44644B) / 2.0f;
            float left = childAt.getLeft() + textView.getPaddingStart() + (m55227s() ? m55222n(textView) : 0);
            if (fM55223o <= 0.0f) {
                fM55223o = 0.0f;
            }
            float f11 = left + fM55223o;
            int i12 = this.f44675f;
            if (i12 < this.f44679h - 1) {
                View childAt2 = this.f44673e.getChildAt(i12 + 1);
                TextView textView2 = (TextView) childAt2.findViewById(i11);
                this.f44680h0.setTextSize(this.f44660R);
                float fM55223o2 = (m55223o(textView2) - this.f44644B) / 2.0f;
                float left2 = childAt2.getLeft() + textView2.getPaddingStart() + (m55227s() ? m55222n(textView2) : 0) + (fM55223o2 > 0.0f ? fM55223o2 : 0.0f);
                f11 = m55227s() ? f11 - (this.f44677g * (f11 - left2)) : f11 + (this.f44677g * (left2 - f11));
            }
            Rect rect = this.f44681i;
            int i13 = (int) f11;
            rect.left = i13;
            rect.right = (int) (i13 + this.f44644B);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m55218j() {
        if (this.f44652J) {
            m55217i();
            return;
        }
        View childAt = this.f44673e.getChildAt(this.f44675f);
        if (childAt == null) {
            return;
        }
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f44695p == 0 && this.f44651I) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            this.f44680h0.setTextSize(this.f44660R);
            this.f44670c0 = (((right - left) - m55223o(textView)) - m55221m(textView)) / 2.0f;
        }
        int i11 = this.f44675f;
        if (i11 < this.f44679h - 1) {
            View childAt2 = this.f44673e.getChildAt(i11 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f11 = this.f44677g;
            left += (left2 - left) * f11;
            right += f11 * (right2 - right);
            if (this.f44695p == 0 && this.f44651I) {
                TextView textView2 = (TextView) childAt2.findViewById(R$id.tv_tab_title);
                this.f44680h0.setTextSize(this.f44660R);
                float fM55223o = (((right2 - left2) - m55223o(textView2)) - m55221m(textView2)) / 2.0f;
                float f12 = this.f44670c0;
                this.f44670c0 = f12 + (this.f44677g * (fM55223o - f12));
            }
        }
        Rect rect = this.f44681i;
        int i12 = (int) left;
        rect.left = i12;
        int i13 = (int) right;
        rect.right = i13;
        if (this.f44695p == 0 && this.f44651I) {
            float f13 = this.f44670c0;
            rect.left = (int) ((left + f13) - 1.0f);
            rect.right = (int) ((right - f13) - 1.0f);
        }
        Rect rect2 = this.f44683j;
        rect2.left = i12;
        rect2.right = i13;
        if (this.f44644B >= 0.0f) {
            float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f44644B) / 2.0f);
            int i14 = this.f44675f;
            if (i14 < this.f44679h - 1) {
                View childAt3 = this.f44673e.getChildAt(i14 + 1);
                left3 = m55227s() ? left3 - (this.f44677g * ((childAt.getWidth() / 2.0f) + (childAt3.getWidth() / 2.0f))) : left3 + (this.f44677g * ((childAt.getWidth() / 2.0f) + (childAt3.getWidth() / 2.0f)));
            }
            Rect rect3 = this.f44681i;
            int i15 = (int) left3;
            rect3.left = i15;
            rect3.right = (int) (i15 + this.f44644B);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m55219k(float f11) {
        return (int) ((f11 * this.f44667b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: l */
    public final float m55220l(TextView textView) {
        Paint paint = new Paint(this.f44680h0);
        paint.setTextSize(this.f44660R);
        if (f44642u0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f44642u0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    /* JADX INFO: renamed from: o */
    public final float m55223o(TextView textView) {
        if (!this.f44688l0 || this.f44663U != 1) {
            return this.f44680h0.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
        }
        Paint paint = new Paint(this.f44680h0);
        if (f44642u0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f44642u0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i11, float f11, int i12) {
        this.f44675f = i11;
        this.f44677g = f11;
        m55231w();
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f44675f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f44675f != 0) {
                int childCount = this.f44673e.getChildCount();
                int i11 = this.f44675f;
                if (childCount > i11) {
                    m55211D(i11);
                    m55231w();
                }
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f44675f);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m55224p(MotionEvent motionEvent) {
        if (!this.f44692n0 || motionEvent == null) {
            return;
        }
        if (!m55225q()) {
            m55230v(false);
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44696p0 = motionEvent.getX();
            this.f44698q0 = motionEvent.getY();
            m55230v(true);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x11 = motionEvent.getX() - this.f44696p0;
                float y11 = motionEvent.getY() - this.f44698q0;
                if (Math.abs(x11) > this.f44694o0 || Math.abs(y11) > this.f44694o0) {
                    m55230v(Math.abs(x11) >= Math.abs(y11));
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        m55230v(false);
    }

    /* JADX INFO: renamed from: r */
    public void m55226r(int i11) {
        int i12 = this.f44679h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        MsgView msgView = (MsgView) this.f44673e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public void setApplyCustomViewPagerScroller(boolean z11) {
        this.f44678g0 = z11;
        m55216h();
    }

    public void setClickScrollDuration(long j11) {
        this.f44674e0 = j11;
        m55216h();
    }

    public void setClickScrollInterpolator(Interpolator interpolator) {
        if (interpolator != null) {
            this.f44676f0 = interpolator;
            m55216h();
        }
    }

    public void setCurrentTab(int i11) {
        this.f44675f = i11;
        ViewPager viewPager = this.f44669c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i11);
        }
    }

    public void setDisallowParentInterceptWhenScrollable(boolean z11) {
        this.f44692n0 = z11;
    }

    public void setDividerColor(int i11) {
        this.f44657O = i11;
        invalidate();
    }

    public void setEnableBlockSlideAnim(boolean z11) {
        if (this.f44707x != z11) {
            this.f44707x = z11;
            m55212E();
            invalidate();
        }
    }

    public void setIndicatorColor(int i11) {
        this.f44703t = i11;
        invalidate();
    }

    public void setIndicatorGravity(int i11) {
        this.f44650H = i11;
        invalidate();
    }

    public void setIndicatorStyle(int i11) {
        this.f44695p = i11;
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z11) {
        this.f44651I = z11;
        invalidate();
    }

    public void setNeedBold(boolean z11) {
        this.f44688l0 = z11;
    }

    public void setOnTabSelectListener(C45938b c45938b) {
        this.f44702s0 = c45938b;
    }

    public void setSnapOnTabClick(boolean z11) {
        this.f44668b0 = z11;
    }

    public void setTabMaxLine(int i11) {
        this.f44684j0 = i11;
    }

    public void setTabMinHeight(int i11) {
        this.f44686k0 = i11;
    }

    public void setTabSpaceEqual(boolean z11) {
        this.f44699r = z11;
        m55212E();
    }

    public void setTextAllCaps(boolean z11) {
        this.f44664V = z11;
        m55212E();
    }

    public void setTextBold(int i11) {
        this.f44663U = i11;
        m55212E();
    }

    public void setTextSelectColor(int i11) {
        this.f44661S = i11;
        m55212E();
    }

    public void setTextUnselectColor(int i11) {
        this.f44662T = i11;
        m55212E();
    }

    public void setUnderlineColor(int i11) {
        this.f44653K = i11;
        invalidate();
    }

    public void setUnderlineGravity(int i11) {
        this.f44655M = i11;
        invalidate();
    }

    public void setUnderlineIgnorePadding(boolean z11) {
        this.f44656N = z11;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f44669c = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.f44669c.addOnPageChangeListener(this);
        m55216h();
        m55228t();
    }

    /* JADX INFO: renamed from: t */
    public void m55228t() {
        ArrayList<CharSequence> arrayList = this.f44671d;
        int count = arrayList == null ? this.f44669c.getAdapter().getCount() : arrayList.size();
        int i11 = 0;
        if (count == this.f44679h) {
            while (i11 < this.f44679h) {
                ArrayList<CharSequence> arrayList2 = this.f44671d;
                m55210C(arrayList2 == null ? this.f44669c.getAdapter().getPageTitle(i11) : arrayList2.get(i11), this.f44673e.getChildAt(i11));
                i11++;
            }
        } else {
            this.f44679h = count;
            this.f44673e.removeAllViews();
            while (i11 < this.f44679h) {
                View viewInflate = View.inflate(this.f44667b, R$layout.layout_tab, null);
                m55214G(viewInflate);
                ArrayList<CharSequence> arrayList3 = this.f44671d;
                m55215g(i11, arrayList3 == null ? this.f44669c.getAdapter().getPageTitle(i11) : arrayList3.get(i11), viewInflate);
                i11++;
            }
        }
        m55212E();
    }

    /* JADX INFO: renamed from: u */
    public final void m55229u(Context context, AttributeSet attributeSet) {
        float f11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlidingTabLayout);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_style, 0);
            this.f44695p = i11;
            this.f44703t = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i11 == 2 ? "#4B6A87" : "#ffffff"));
            this.f44704u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_res, -1);
            this.f44705v = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_select_res, -1);
            int i12 = R$styleable.SlidingTabLayout_tl_indicator_height;
            int i13 = this.f44695p;
            if (i13 == 1) {
                f11 = 4.0f;
            } else {
                f11 = i13 == 2 ? -1 : 2;
            }
            this.f44643A = typedArrayObtainStyledAttributes.getDimension(i12, m55219k(f11));
            this.f44706w = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_block_margin, 0.0f);
            this.f44644B = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_width, m55219k(this.f44695p == 1 ? 10.0f : -1.0f));
            this.f44645C = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_corner_radius, m55219k(this.f44695p == 2 ? -1.0f : 0.0f));
            this.f44646D = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_left, m55219k(0.0f));
            float f12 = 7.0f;
            this.f44647E = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_top, m55219k(this.f44695p == 2 ? 7.0f : 0.0f));
            this.f44648F = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_right, m55219k(0.0f));
            int i14 = R$styleable.SlidingTabLayout_tl_indicator_margin_bottom;
            if (this.f44695p != 2) {
                f12 = 0.0f;
            }
            this.f44649G = typedArrayObtainStyledAttributes.getDimension(i14, m55219k(f12));
            this.f44650H = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_gravity, 80);
            this.f44651I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
            this.f44652J = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_center_with_text, false);
            this.f44653K = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_underline_color, -1);
            this.f44654L = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_underline_height, m55219k(0.0f));
            this.f44655M = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_underline_gravity, 80);
            this.f44657O = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_divider_color, -1);
            this.f44658P = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_width, m55219k(0.0f));
            this.f44659Q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_padding, m55219k(12.0f));
            this.f44660R = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_textsize, m55208A(14.0f));
            this.f44661S = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textSelectColor, -1);
            this.f44662T = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
            this.f44663U = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_textBold, 0);
            this.f44664V = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_textAllCaps, false);
            this.f44699r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_tab_space_equal, false);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_width, m55219k(-1.0f));
            this.f44701s = dimension;
            this.f44697q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_padding, (this.f44699r || dimension > 0.0f) ? m55219k(0.0f) : m55219k(12.0f));
            typedArrayObtainStyledAttributes.recycle();
            int i15 = this.f44704u;
            if (i15 != -1) {
                this.f44708y = ContextCompat.getDrawable(context, i15);
            }
            int i16 = this.f44705v;
            if (i16 != -1) {
                this.f44709z = ContextCompat.getDrawable(context, i16);
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m55231w() {
        if (this.f44679h <= 0 || this.f44673e.getChildAt(this.f44675f) == null) {
            return;
        }
        int width = (int) (this.f44677g * this.f44673e.getChildAt(this.f44675f).getWidth());
        int right = m55227s() ? this.f44673e.getChildAt(this.f44675f).getRight() - width : this.f44673e.getChildAt(this.f44675f).getLeft() + width;
        if (this.f44675f > 0 || width > 0) {
            int width2 = right - ((getWidth() / 2) - getPaddingStart());
            m55218j();
            if (m55227s()) {
                Rect rect = this.f44683j;
                right = width2 - ((rect.right - rect.left) / 2);
            } else {
                Rect rect2 = this.f44683j;
                right = width2 + ((rect2.right - rect2.left) / 2);
            }
        }
        if (right != this.f44665W) {
            this.f44665W = right;
            scrollTo(right, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m55232x(int i11, float f11, float f12) {
        float f13;
        int i12 = this.f44679h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        View childAt = this.f44673e.getChildAt(i11);
        MsgView msgView = (MsgView) childAt.findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            this.f44680h0.setTextSize(this.f44660R);
            float fM55223o = m55223o(textView);
            float fDescent = this.f44680h0.descent() - this.f44680h0.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f14 = this.f44701s;
            if (f14 >= 0.0f) {
                f13 = f14 / 2.0f;
                fM55223o /= 2.0f;
            } else {
                f13 = this.f44697q;
            }
            marginLayoutParams.setMarginStart((int) (f13 + fM55223o + m55219k(f11)));
            int i13 = this.f44666a0;
            marginLayoutParams.topMargin = i13 > 0 ? (((int) (i13 - fDescent)) / 2) - m55219k(f12) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m55233y(int i11) {
        int i12 = this.f44679h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        m55234z(i11, 0);
    }

    /* JADX INFO: renamed from: z */
    public void m55234z(int i11, int i12) {
        int i13 = this.f44679h;
        if (i11 >= i13) {
            i11 = i13 - 1;
        }
        MsgView msgView = (MsgView) this.f44673e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            C46336a.m102150a(msgView, i12);
            if (this.f44682i0.get(i11) == null || !this.f44682i0.get(i11).booleanValue()) {
                if (i12 > 0) {
                    m55232x(i11, 2.0f, 2.0f);
                } else {
                    m55232x(i11, 0.0f, 1.5f);
                }
                this.f44682i0.put(i11, Boolean.TRUE);
            }
        }
    }

    public RankSlidingTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44681i = new Rect();
        this.f44683j = new Rect();
        this.f44685k = new GradientDrawable();
        this.f44687l = new Paint(1);
        this.f44689m = new Paint(1);
        this.f44691n = new Paint(1);
        this.f44693o = new Path();
        this.f44695p = 0;
        this.f44707x = true;
        this.f44672d0 = new ArgbEvaluator();
        this.f44674e0 = 300L;
        this.f44676f0 = PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f);
        this.f44678g0 = true;
        this.f44680h0 = new Paint(1);
        this.f44682i0 = new SparseArray<>();
        this.f44684j0 = -1;
        this.f44686k0 = -1;
        this.f44688l0 = false;
        this.f44690m0 = false;
        this.f44692n0 = false;
        this.f44700r0 = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f44694o0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f44667b = context;
        this.f44673e = new LinearLayout(context);
        addView(this.f44673e, new ViewGroup.LayoutParams(-1, -1));
        m55229u(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (String.valueOf(-1).equals(attributeValue) || String.valueOf(-2).equals(attributeValue)) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
        try {
            this.f44666a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m55213F(TextView textView) {
        if (m55227s()) {
            ViewParent parent = textView.getParent();
            if (parent instanceof RelativeLayout) {
                ((RelativeLayout) parent).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m55221m(TextView textView) {
        int intrinsicWidth;
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        int compoundDrawablePadding = 0;
        Drawable drawable = compoundDrawablesRelative[0];
        Drawable drawable2 = compoundDrawablesRelative[2];
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        } else {
            intrinsicWidth = 0;
        }
        if (drawable2 != null) {
            intrinsicWidth += drawable2.getIntrinsicWidth();
        }
        if (intrinsicWidth > 0) {
            compoundDrawablePadding = textView.getCompoundDrawablePadding();
        }
        return intrinsicWidth + compoundDrawablePadding;
    }

    /* JADX INFO: renamed from: n */
    public final int m55222n(TextView textView) {
        int intrinsicWidth;
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        int compoundDrawablePadding = 0;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        } else {
            intrinsicWidth = 0;
        }
        if (intrinsicWidth > 0) {
            compoundDrawablePadding = textView.getCompoundDrawablePadding();
        }
        return intrinsicWidth + compoundDrawablePadding;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f11;
        super.onDraw(canvas);
        if (m55227s()) {
            int i11 = this.f44700r0;
            this.f44700r0 = i11 + 1;
            if (i11 < 3) {
                for (int i12 = 0; i12 < this.f44673e.getChildCount(); i12++) {
                    View childAt = this.f44673e.getChildAt(i12);
                    if (childAt != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.width = childAt.getRight() - childAt.getLeft();
                        childAt.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        if (!isInEditMode() && this.f44679h > 0) {
            int height = getHeight();
            int paddingStart = getPaddingStart();
            float f12 = this.f44658P;
            if (f12 > 0.0f) {
                this.f44689m.setStrokeWidth(f12);
                this.f44689m.setColor(this.f44657O);
                for (int i13 = 0; i13 < this.f44679h - 1; i13++) {
                    View childAt2 = this.f44673e.getChildAt(i13);
                    canvas.drawLine(childAt2.getRight() + paddingStart, this.f44659Q, childAt2.getRight() + paddingStart, height - this.f44659Q, this.f44689m);
                }
            }
            if (this.f44654L > 0.0f) {
                this.f44687l.setColor(this.f44653K);
                float f13 = paddingStart;
                if (this.f44656N) {
                    f11 = 0.0f;
                } else {
                    f11 = f13;
                }
                if (this.f44655M == 80) {
                    float f14 = height;
                    canvas.drawRect(f11, f14 - this.f44654L, this.f44673e.getWidth() + paddingStart, f14, this.f44687l);
                } else {
                    canvas.drawRect(f11, 0.0f, this.f44673e.getWidth() + paddingStart, this.f44654L, this.f44687l);
                }
            }
            m55218j();
            int height2 = getHeight();
            int paddingStart2 = getPaddingStart();
            int i14 = this.f44695p;
            if (i14 == 1) {
                if (this.f44643A > 0.0f) {
                    this.f44691n.setColor(this.f44703t);
                    this.f44693o.reset();
                    float f15 = height2;
                    this.f44693o.moveTo(this.f44681i.left + paddingStart2, f15);
                    Path path = this.f44693o;
                    Rect rect = this.f44681i;
                    path.lineTo(paddingStart2 + (rect.left / 2.0f) + (rect.right / 2.0f), f15 - this.f44643A);
                    this.f44693o.lineTo(paddingStart2 + this.f44681i.right, f15);
                    this.f44693o.close();
                    canvas.drawPath(this.f44693o, this.f44691n);
                    return;
                }
                return;
            }
            if (i14 == 2) {
                if (this.f44707x && this.f44673e.getChildAt(this.f44675f) != null) {
                    int i15 = ((int) this.f44646D) + paddingStart2;
                    Rect rect2 = this.f44681i;
                    int i16 = i15 + rect2.left;
                    int i17 = (paddingStart2 + rect2.right) - ((int) this.f44648F);
                    int paddingTop = getPaddingTop();
                    int paddingBottom = height2 - getPaddingBottom();
                    if (paddingTop < paddingBottom) {
                        Drawable drawable = this.f44709z;
                        if (drawable != null) {
                            drawable.setBounds(i16, paddingTop, i17, paddingBottom);
                            this.f44709z.draw(canvas);
                            return;
                        } else {
                            this.f44685k.setColor(this.f44703t);
                            this.f44685k.setBounds(i16, paddingTop, i17, paddingBottom);
                            this.f44685k.setCornerRadius(this.f44645C);
                            this.f44685k.draw(canvas);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (this.f44643A > 0.0f) {
                this.f44685k.setColor(this.f44703t);
                if (this.f44650H == 80) {
                    GradientDrawable gradientDrawable = this.f44685k;
                    int i18 = ((int) this.f44646D) + paddingStart2;
                    Rect rect3 = this.f44681i;
                    int i19 = i18 + rect3.left;
                    int i21 = height2 - ((int) this.f44643A);
                    float f16 = this.f44649G;
                    gradientDrawable.setBounds(i19, i21 - ((int) f16), (paddingStart2 + rect3.right) - ((int) this.f44648F), height2 - ((int) f16));
                } else {
                    GradientDrawable gradientDrawable2 = this.f44685k;
                    int i22 = ((int) this.f44646D) + paddingStart2;
                    Rect rect4 = this.f44681i;
                    int i23 = i22 + rect4.left;
                    float f17 = this.f44647E;
                    gradientDrawable2.setBounds(i23, (int) f17, (paddingStart2 + rect4.right) - ((int) this.f44648F), ((int) this.f44643A) + ((int) f17));
                }
                this.f44685k.setCornerRadius(this.f44645C);
                this.f44685k.draw(canvas);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m55224p(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i11) {
        m55211D(i11);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m55224p(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m55227s() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void setDividerPadding(float f11) {
        this.f44659Q = m55219k(f11);
        invalidate();
    }

    public void setDividerWidth(float f11) {
        this.f44658P = m55219k(f11);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f11) {
        this.f44645C = m55219k(f11);
        invalidate();
    }

    public void setIndicatorHeight(float f11) {
        this.f44643A = m55219k(f11);
        invalidate();
    }

    public void setIndicatorWidth(float f11) {
        this.f44644B = m55219k(f11);
        invalidate();
    }

    public void setTabPadding(float f11) {
        this.f44697q = m55219k(f11);
        m55212E();
    }

    public void setTabWidth(float f11) {
        this.f44701s = m55219k(f11);
        m55212E();
    }

    public void setTextsize(float f11) {
        this.f44660R = m55208A(f11);
        m55212E();
    }

    public void setUnderlineHeight(float f11) {
        this.f44654L = m55219k(f11);
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final void m55230v(boolean z11) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }
}

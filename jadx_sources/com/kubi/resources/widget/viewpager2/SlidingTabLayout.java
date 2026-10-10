package com.kubi.resources.widget.viewpager2;

import android.R;
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
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.monitor.MonitorLevel;
import com.kubi.otc.entity.OtcAd;
import com.kubi.resources.exception.ComponentException;
import com.kubi.resources.widget.flyco.widget.MsgView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import java.util.ArrayList;
import p569qq.C43846g;
import p739ww.C45938b;
import p776xw.C46336a;

/* JADX INFO: loaded from: classes12.dex */
public class SlidingTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: h0 */
    public static Typeface f45235h0;

    /* JADX INFO: renamed from: i0 */
    public static Typeface f45236i0;

    /* JADX INFO: renamed from: A */
    public float f45237A;

    /* JADX INFO: renamed from: B */
    public float f45238B;

    /* JADX INFO: renamed from: C */
    public float f45239C;

    /* JADX INFO: renamed from: D */
    public float f45240D;

    /* JADX INFO: renamed from: E */
    public float f45241E;

    /* JADX INFO: renamed from: F */
    public float f45242F;

    /* JADX INFO: renamed from: G */
    public int f45243G;

    /* JADX INFO: renamed from: H */
    public boolean f45244H;

    /* JADX INFO: renamed from: I */
    public int f45245I;

    /* JADX INFO: renamed from: J */
    public float f45246J;

    /* JADX INFO: renamed from: K */
    public int f45247K;

    /* JADX INFO: renamed from: L */
    public int f45248L;

    /* JADX INFO: renamed from: M */
    public float f45249M;

    /* JADX INFO: renamed from: N */
    public float f45250N;

    /* JADX INFO: renamed from: O */
    public float f45251O;

    /* JADX INFO: renamed from: P */
    public int f45252P;

    /* JADX INFO: renamed from: Q */
    public int f45253Q;

    /* JADX INFO: renamed from: R */
    public int f45254R;

    /* JADX INFO: renamed from: S */
    public boolean f45255S;

    /* JADX INFO: renamed from: T */
    public int f45256T;

    /* JADX INFO: renamed from: U */
    public int f45257U;

    /* JADX INFO: renamed from: V */
    public boolean f45258V;

    /* JADX INFO: renamed from: W */
    public boolean f45259W;

    /* JADX INFO: renamed from: a0 */
    public boolean f45260a0;

    /* JADX INFO: renamed from: b */
    public Context f45261b;

    /* JADX INFO: renamed from: b0 */
    public float f45262b0;

    /* JADX INFO: renamed from: c */
    public ViewPager2 f45263c;

    /* JADX INFO: renamed from: c0 */
    public float f45264c0;

    /* JADX INFO: renamed from: d */
    public ArrayList<CharSequence> f45265d;

    /* JADX INFO: renamed from: d0 */
    public final C23167b f45266d0;

    /* JADX INFO: renamed from: e */
    public LinearLayout f45267e;

    /* JADX INFO: renamed from: e0 */
    public Paint f45268e0;

    /* JADX INFO: renamed from: f */
    public int f45269f;

    /* JADX INFO: renamed from: f0 */
    public SparseArray<Boolean> f45270f0;

    /* JADX INFO: renamed from: g */
    public float f45271g;

    /* JADX INFO: renamed from: g0 */
    public C45938b f45272g0;

    /* JADX INFO: renamed from: h */
    public int f45273h;

    /* JADX INFO: renamed from: i */
    public Rect f45274i;

    /* JADX INFO: renamed from: j */
    public Rect f45275j;

    /* JADX INFO: renamed from: k */
    public GradientDrawable f45276k;

    /* JADX INFO: renamed from: l */
    public Paint f45277l;

    /* JADX INFO: renamed from: m */
    public Paint f45278m;

    /* JADX INFO: renamed from: n */
    public Paint f45279n;

    /* JADX INFO: renamed from: o */
    public Path f45280o;

    /* JADX INFO: renamed from: p */
    public int f45281p;

    /* JADX INFO: renamed from: q */
    public float f45282q;

    /* JADX INFO: renamed from: r */
    public boolean f45283r;

    /* JADX INFO: renamed from: s */
    public float f45284s;

    /* JADX INFO: renamed from: t */
    public int f45285t;

    /* JADX INFO: renamed from: u */
    public int f45286u;

    /* JADX INFO: renamed from: v */
    public int f45287v;

    /* JADX INFO: renamed from: w */
    public float f45288w;

    /* JADX INFO: renamed from: x */
    public boolean f45289x;

    /* JADX INFO: renamed from: y */
    public Drawable f45290y;

    /* JADX INFO: renamed from: z */
    public float f45291z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.viewpager2.SlidingTabLayout$a */
    /* JADX INFO: loaded from: classes13.dex */
    public class ViewOnClickListenerC23166a implements View.OnClickListener {
        public ViewOnClickListenerC23166a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOfChild = SlidingTabLayout.this.f45267e.indexOfChild(view);
            if (iIndexOfChild != -1) {
                if (SlidingTabLayout.this.f45263c.getCurrentItem() == iIndexOfChild) {
                    if (SlidingTabLayout.this.f45272g0 != null) {
                        SlidingTabLayout.this.f45272g0.mo31156a(iIndexOfChild);
                        return;
                    }
                    return;
                }
                SlidingTabLayout.this.m55584E(iIndexOfChild);
                if (SlidingTabLayout.this.f45272g0 != null) {
                    SlidingTabLayout.this.f45272g0.mo18273b(iIndexOfChild);
                }
                if (SlidingTabLayout.this.f45260a0) {
                    SlidingTabLayout.this.f45263c.setCurrentItem(iIndexOfChild, false);
                } else {
                    SlidingTabLayout.this.f45263c.setCurrentItem(iIndexOfChild);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.viewpager2.SlidingTabLayout$b */
    /* JADX INFO: loaded from: classes13.dex */
    public class C23167b extends ViewPager2.OnPageChangeCallback {
        public C23167b() {
        }

        public /* synthetic */ C23167b(SlidingTabLayout slidingTabLayout, ViewOnClickListenerC23166a viewOnClickListenerC23166a) {
            this();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            SlidingTabLayout slidingTabLayout = SlidingTabLayout.this;
            boolean z11 = true;
            if (i11 != 1 && i11 != 2) {
                z11 = false;
            }
            slidingTabLayout.f45259W = z11;
            if (i11 == 0) {
                if (SlidingTabLayout.this.f45263c != null) {
                    SlidingTabLayout slidingTabLayout2 = SlidingTabLayout.this;
                    slidingTabLayout2.f45269f = slidingTabLayout2.f45263c.getCurrentItem();
                }
                SlidingTabLayout.this.m55582C();
                SlidingTabLayout slidingTabLayout3 = SlidingTabLayout.this;
                slidingTabLayout3.m55584E(slidingTabLayout3.f45269f);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            SlidingTabLayout.this.f45269f = i11;
            SlidingTabLayout.this.f45271g = f11;
            SlidingTabLayout.this.m55599w();
            SlidingTabLayout.this.invalidate();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            SlidingTabLayout.this.m55584E(i11);
        }
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: C */
    public final void m55582C() {
        int i11 = 0;
        while (i11 < this.f45273h) {
            View childAt = this.f45267e.getChildAt(i11);
            boolean z11 = i11 == this.f45269f;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(R$id.tv_tab_title) : null;
            if (textView != null) {
                textView.setTextColor(z11 ? this.f45252P : this.f45253Q);
                if (this.f45258V && this.f45254R == 1) {
                    if (f45235h0 == null || f45236i0 == null || C5303w0.m6511a()) {
                        textView.getPaint().setFakeBoldText(z11);
                    } else {
                        textView.setTypeface(z11 ? f45236i0 : f45235h0);
                    }
                }
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m55584E(int i11) {
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f45273h) {
            View childAt = this.f45267e.getChildAt(i14);
            if (childAt != null) {
                boolean z11 = i14 == i11;
                TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
                if (textView != null) {
                    textView.setTextColor(z11 ? this.f45252P : this.f45253Q);
                    if (this.f45258V && this.f45254R == 1) {
                        if (f45235h0 == null || f45236i0 == null || C5303w0.m6511a()) {
                            textView.getPaint().setFakeBoldText(z11);
                        } else {
                            textView.setTypeface(z11 ? f45236i0 : f45235h0);
                        }
                    }
                }
                if (!this.f45289x && this.f45281p == 2 && (i12 = this.f45286u) != -1 && (i13 = this.f45287v) != -1 && textView != null) {
                    if (z11) {
                        i12 = i13;
                    }
                    textView.setBackgroundResource(i12);
                }
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m55585F() {
        int i11 = 0;
        while (i11 < this.f45273h) {
            TextView textView = (TextView) this.f45267e.getChildAt(i11).findViewById(R$id.tv_tab_title);
            if (textView != null) {
                textView.setSingleLine(getLayoutDirection() == 1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(i11 == this.f45269f ? this.f45252P : this.f45253Q);
                textView.setTextSize(0, this.f45251O);
                float f11 = this.f45282q;
                textView.setPaddingRelative((int) f11, 0, (int) f11, 0);
                if (this.f45255S) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                textView.setMinWidth((int) (m55590n(textView) + (this.f45282q * 2.0f) + m55591o(textView)));
                int i12 = this.f45254R;
                if (i12 == 1) {
                    textView.getPaint().setFakeBoldText(true);
                    m55584E(this.f45269f);
                } else if (i12 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i12 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (this.f45281p == 2 && this.f45286u > 0) {
                    float f12 = this.f45282q;
                    float f13 = this.f45240D;
                    textView.setPaddingRelative((int) f12, ((int) f13) / 2, (int) f12, ((int) f13) / 2);
                    if (this.f45289x) {
                        textView.setBackgroundResource(this.f45286u);
                    } else {
                        textView.setBackgroundResource(i11 == this.f45269f ? this.f45287v : this.f45286u);
                    }
                    if (this.f45288w > 0.0f && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.setMarginEnd((int) this.f45288w);
                        textView.setLayoutParams(layoutParams);
                    }
                }
            }
            i11++;
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: x */
    public static void m55579x(Typeface typeface, Typeface typeface2) {
        f45235h0 = typeface;
        f45236i0 = typeface2;
    }

    /* JADX INFO: renamed from: A */
    public void m55580A(int i11, int i12) {
        int i13 = this.f45273h;
        if (i11 >= i13) {
            i11 = i13 - 1;
        }
        MsgView msgView = (MsgView) this.f45267e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            C46336a.m102150a(msgView, i12);
            if (this.f45270f0.get(i11) == null || !this.f45270f0.get(i11).booleanValue()) {
                if (i12 > 0) {
                    m55600y(i11, 2.0f, 2.0f);
                } else {
                    m55600y(i11, 2.0f, -4.0f);
                }
                this.f45270f0.put(i11, Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public int m55581B(float f11) {
        return (int) ((f11 * this.f45261b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: D */
    public final void m55583D(CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView != null) {
            if (charSequence != null) {
                textView.setText(charSequence);
            }
            m55586G(textView);
        }
    }

    public int getCurrentTab() {
        return this.f45269f;
    }

    public int getDividerColor() {
        return this.f45248L;
    }

    public float getDividerPadding() {
        return this.f45250N;
    }

    public float getDividerWidth() {
        return this.f45249M;
    }

    public int getIndicatorColor() {
        return this.f45285t;
    }

    public float getIndicatorCornerRadius() {
        return this.f45238B;
    }

    public float getIndicatorHeight() {
        return this.f45291z;
    }

    public float getIndicatorMarginBottom() {
        return this.f45242F;
    }

    public float getIndicatorMarginLeft() {
        return this.f45239C;
    }

    public float getIndicatorMarginRight() {
        return this.f45241E;
    }

    public float getIndicatorMarginTop() {
        return this.f45240D;
    }

    public int getIndicatorStyle() {
        return this.f45281p;
    }

    public float getIndicatorWidth() {
        return this.f45237A;
    }

    public int getTabCount() {
        return this.f45273h;
    }

    public float getTabPadding() {
        return this.f45282q;
    }

    public float getTabWidth() {
        return this.f45284s;
    }

    public int getTextBold() {
        return this.f45254R;
    }

    public int getTextSelectColor() {
        return this.f45252P;
    }

    public int getTextUnselectColor() {
        return this.f45253Q;
    }

    public float getTextsize() {
        return this.f45251O;
    }

    public int getUnderlineColor() {
        return this.f45245I;
    }

    public float getUnderlineHeight() {
        return this.f45246J;
    }

    /* JADX INFO: renamed from: k */
    public final void m55587k(int i11, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView != null) {
            if (charSequence != null) {
                textView.setText(charSequence);
            }
            if (C5303w0.m6511a() && Build.VERSION.SDK_INT >= 28) {
                textView.setFallbackLineSpacing(false);
            }
        }
        view.setOnClickListener(new ViewOnClickListenerC23166a());
        LinearLayout.LayoutParams layoutParams = this.f45283r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f45284s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f45284s, -1);
        }
        this.f45267e.addView(view, i11, layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final void m55588l() {
        View childAt = this.f45267e.getChildAt(this.f45269f);
        if (childAt == null) {
            this.f45274i.set(0, 0, 0, 0);
            return;
        }
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f45281p == 0 && this.f45244H) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            this.f45277l.setTextSize(this.f45251O);
            this.f45262b0 = ((right - left) - m55594r(textView)) / 2.0f;
        }
        int i11 = this.f45269f;
        if (i11 < this.f45273h - 1) {
            View childAt2 = this.f45267e.getChildAt(i11 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f11 = this.f45271g;
            left += (left2 - left) * f11;
            right += f11 * (right2 - right);
            if (this.f45281p == 0 && this.f45244H) {
                TextView textView2 = (TextView) childAt2.findViewById(R$id.tv_tab_title);
                this.f45277l.setTextSize(this.f45251O);
                float fM55594r = ((right2 - left2) - m55594r(textView2)) / 2.0f;
                float f12 = this.f45262b0;
                this.f45262b0 = f12 + (this.f45271g * (fM55594r - f12));
            }
        }
        Rect rect = this.f45274i;
        int i12 = (int) left;
        rect.left = i12;
        int i13 = (int) right;
        rect.right = i13;
        if (this.f45281p == 0 && this.f45244H) {
            float f13 = this.f45262b0;
            rect.left = (int) ((left + f13) - 1.0f);
            rect.right = (int) ((right - f13) - 1.0f);
        }
        Rect rect2 = this.f45275j;
        rect2.left = i12;
        rect2.right = i13;
        if (this.f45237A < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f45237A) / 2.0f);
        int i14 = this.f45269f;
        if (i14 < this.f45273h - 1) {
            View childAt3 = this.f45267e.getChildAt(i14 + 1);
            left3 += this.f45271g * ((childAt3.getLeft() + ((childAt3.getWidth() - this.f45237A) / 2.0f)) - left3);
        }
        Rect rect3 = this.f45274i;
        int i15 = (int) left3;
        rect3.left = i15;
        rect3.right = (int) (i15 + this.f45237A);
    }

    /* JADX INFO: renamed from: m */
    public int m55589m(float f11) {
        return (int) ((f11 * this.f45261b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: n */
    public final float m55590n(TextView textView) {
        Paint paint = new Paint(this.f45268e0);
        paint.setTextSize(this.f45251O);
        if (f45236i0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f45236i0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewPager2 viewPager2 = this.f45263c;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f45266d0);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f45269f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f45269f != 0) {
                int childCount = this.f45267e.getChildCount();
                int i11 = this.f45269f;
                if (childCount > i11) {
                    m55584E(i11);
                    m55599w();
                }
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f45269f);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public MsgView m55592p(int i11) {
        int i12 = this.f45273h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        return (MsgView) this.f45267e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public View m55593q(int i11) {
        if (this.f45267e.getChildCount() <= i11) {
            return null;
        }
        return this.f45267e.getChildAt(i11);
    }

    /* JADX INFO: renamed from: r */
    public final float m55594r(TextView textView) {
        if (!this.f45258V || this.f45254R != 1) {
            return this.f45268e0.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
        }
        Paint paint = new Paint(this.f45268e0);
        if (f45236i0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f45236i0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    /* JADX INFO: renamed from: s */
    public void m55595s(int i11) {
        int i12 = this.f45273h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        MsgView msgView = (MsgView) this.f45267e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public void setCurrentTab(int i11) {
        this.f45269f = i11;
        ViewPager2 viewPager2 = this.f45263c;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i11);
        }
    }

    public void setDividerColor(int i11) {
        this.f45248L = i11;
        invalidate();
    }

    public void setEnableBlockSlideAnim(boolean z11) {
        this.f45289x = z11;
    }

    public void setIndicatorColor(int i11) {
        this.f45285t = i11;
        invalidate();
    }

    public void setIndicatorGravity(int i11) {
        this.f45243G = i11;
        invalidate();
    }

    public void setIndicatorStyle(int i11) {
        this.f45281p = i11;
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z11) {
        this.f45244H = z11;
        invalidate();
    }

    public void setNeedBold(boolean z11) {
        this.f45258V = z11;
    }

    public void setOnTabSelectListener(C45938b c45938b) {
        this.f45272g0 = c45938b;
    }

    public void setSnapOnTabClick(boolean z11) {
        this.f45260a0 = z11;
    }

    public void setTabSpaceEqual(boolean z11) {
        this.f45283r = z11;
        m55585F();
    }

    public void setTextAllCaps(boolean z11) {
        this.f45255S = z11;
        m55585F();
    }

    public void setTextBold(int i11) {
        this.f45254R = i11;
        m55585F();
    }

    public void setTextSelectColor(int i11) {
        this.f45252P = i11;
        m55585F();
    }

    public void setTextUnselectColor(int i11) {
        this.f45253Q = i11;
        m55585F();
    }

    public void setUnderlineColor(int i11) {
        this.f45245I = i11;
        invalidate();
    }

    public void setUnderlineGravity(int i11) {
        this.f45247K = i11;
        invalidate();
    }

    public void setViewPager(ViewPager2 viewPager2) {
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f45263c = viewPager2;
        viewPager2.unregisterOnPageChangeCallback(this.f45266d0);
        this.f45263c.registerOnPageChangeCallback(this.f45266d0);
        m55597u();
    }

    /* JADX INFO: renamed from: u */
    public void m55597u() {
        int i11 = 0;
        if (this.f45265d == null) {
            C43846g.m96566a(new ComponentException(new RuntimeException(""), "SlidingTabLayout", false, "viewPager2 SlidingTabLayout mTitle not null or empty"), MonitorLevel.ERROR);
            return;
        }
        if (this.f45263c.getAdapter() instanceof FragmentStateAdapter) {
            FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) this.f45263c.getAdapter();
            ArrayList<CharSequence> arrayList = this.f45265d;
            int itemCount = arrayList == null ? fragmentStateAdapter.getItemCount() : arrayList.size();
            if (itemCount == this.f45273h) {
                while (i11 < this.f45273h) {
                    m55583D(this.f45265d.get(i11), this.f45267e.getChildAt(i11));
                    i11++;
                }
            } else {
                this.f45273h = itemCount;
                this.f45267e.removeAllViews();
                while (i11 < this.f45273h) {
                    m55587k(i11, this.f45265d.get(i11), View.inflate(this.f45261b, R$layout.layout_tab, null));
                    i11++;
                }
            }
            m55585F();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m55598v(Context context, AttributeSet attributeSet) {
        float f11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlidingTabLayout);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_style, 0);
        this.f45281p = i11;
        this.f45285t = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i11 == 2 ? "#4B6A87" : "#ffffff"));
        this.f45286u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_res, -1);
        this.f45287v = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_select_res, -1);
        int i12 = R$styleable.SlidingTabLayout_tl_indicator_height;
        int i13 = this.f45281p;
        if (i13 == 1) {
            f11 = 4.0f;
        } else {
            f11 = i13 == 2 ? -1 : 2;
        }
        this.f45291z = typedArrayObtainStyledAttributes.getDimension(i12, m55589m(f11));
        this.f45288w = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_block_margin, 0.0f);
        this.f45237A = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_width, m55589m(this.f45281p == 1 ? 10.0f : -1.0f));
        this.f45238B = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_corner_radius, m55589m(this.f45281p == 2 ? -1.0f : 0.0f));
        this.f45239C = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_left, m55589m(0.0f));
        this.f45240D = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_top, m55589m(this.f45281p == 2 ? 7.0f : 0.0f));
        this.f45241E = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_right, m55589m(0.0f));
        this.f45242F = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_bottom, m55589m(this.f45281p != 2 ? 0.0f : 7.0f));
        this.f45243G = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_gravity, 80);
        this.f45244H = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
        this.f45245I = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_underline_color, -1);
        this.f45246J = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_underline_height, m55589m(0.0f));
        this.f45247K = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_underline_gravity, 80);
        this.f45248L = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_divider_color, -1);
        this.f45249M = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_width, m55589m(0.0f));
        this.f45250N = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_padding, m55589m(12.0f));
        this.f45251O = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_textsize, m55581B(14.0f));
        this.f45252P = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textSelectColor, -1);
        this.f45253Q = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.f45254R = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_textBold, 0);
        this.f45255S = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_textAllCaps, false);
        this.f45283r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_tab_space_equal, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_width, m55589m(-1.0f));
        this.f45284s = dimension;
        this.f45282q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_padding, (this.f45283r || dimension > 0.0f) ? m55589m(0.0f) : m55589m(12.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: w */
    public final void m55599w() {
        if (this.f45273h <= 0 || this.f45267e.getChildAt(this.f45269f) == null) {
            return;
        }
        int width = (int) (this.f45271g * this.f45267e.getChildAt(this.f45269f).getWidth());
        int right = getLayoutDirection() == 1 ? this.f45267e.getChildAt(this.f45269f).getRight() - width : this.f45267e.getChildAt(this.f45269f).getLeft() + width;
        if (this.f45269f > 0 || width > 0) {
            int width2 = right - ((getWidth() / 2) - getPaddingStart());
            m55588l();
            if (getLayoutDirection() == 1) {
                Rect rect = this.f45275j;
                right = width2 - ((rect.right - rect.left) / 2);
            } else {
                Rect rect2 = this.f45275j;
                right = width2 + ((rect2.right - rect2.left) / 2);
            }
        }
        if (right != this.f45256T) {
            this.f45256T = right;
            scrollTo(right, 0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m55600y(int i11, float f11, float f12) {
        float f13;
        int i12 = this.f45273h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        View childAt = this.f45267e.getChildAt(i11);
        MsgView msgView = (MsgView) childAt.findViewById(R$id.rtv_msg_tip);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            this.f45268e0.setTextSize(this.f45251O);
            float fMeasureText = this.f45268e0.measureText(textView.getText().toString());
            float fDescent = this.f45268e0.descent() - this.f45268e0.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f14 = this.f45284s;
            if (f14 >= 0.0f) {
                f13 = f14 / 2.0f;
                fMeasureText /= 2.0f;
            } else {
                f13 = this.f45282q;
            }
            marginLayoutParams.setMarginStart((int) (f13 + fMeasureText + m55589m(f11)));
            int i13 = this.f45257U;
            marginLayoutParams.topMargin = i13 > 0 ? (((int) (i13 - fDescent)) / 2) - m55589m(f12) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m55601z(ViewPager2 viewPager2, ArrayList<CharSequence> arrayList) {
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        if (arrayList.size() != viewPager2.getAdapter().getItemCount()) {
            throw new IllegalStateException("Titles length must be the same as the page count !");
        }
        this.f45263c = viewPager2;
        this.f45265d = arrayList;
        viewPager2.unregisterOnPageChangeCallback(this.f45266d0);
        this.f45263c.registerOnPageChangeCallback(this.f45266d0);
        m55597u();
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f45274i = new Rect();
        this.f45275j = new Rect();
        this.f45276k = new GradientDrawable();
        this.f45277l = new Paint(1);
        this.f45278m = new Paint(1);
        this.f45279n = new Paint(1);
        this.f45280o = new Path();
        this.f45281p = 0;
        this.f45289x = true;
        this.f45258V = false;
        this.f45259W = false;
        this.f45264c0 = 0.0f;
        this.f45266d0 = new C23167b(this, null);
        this.f45268e0 = new Paint(1);
        this.f45270f0 = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f45261b = context;
        this.f45267e = new LinearLayout(context);
        addView(this.f45267e, new ViewGroup.LayoutParams(-1, -1));
        m55598v(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals(OtcAd.KYC_NOT_PASS) || attributeValue.equals("-2")) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
        this.f45257U = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: G */
    public final void m55586G(TextView textView) {
        if (m55596t()) {
            ViewParent parent = textView.getParent();
            if (parent instanceof RelativeLayout) {
                ((RelativeLayout) parent).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            } else if (parent instanceof ConstraintLayout) {
                ((ConstraintLayout) parent).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m55591o(TextView textView) {
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager2 viewPager2 = this.f45263c;
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(this.f45266d0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        View childAt;
        super.onDraw(canvas);
        if (!isInEditMode() && this.f45273h > 0) {
            if (m55596t()) {
                for (int i11 = 0; i11 < this.f45267e.getChildCount(); i11++) {
                    View childAt2 = this.f45267e.getChildAt(i11);
                    if (childAt2 != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                        layoutParams.width = childAt2.getRight() - childAt2.getLeft();
                        childAt2.setLayoutParams(layoutParams);
                    }
                }
            }
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            if (this.f45246J > 0.0f) {
                this.f45277l.setColor(this.f45245I);
                if (this.f45247K == 80) {
                    float f11 = height;
                    canvas.drawRect(paddingLeft, f11 - this.f45246J, this.f45267e.getWidth() + paddingLeft, f11, this.f45277l);
                } else {
                    canvas.drawRect(paddingLeft, 0.0f, this.f45267e.getWidth() + paddingLeft, this.f45246J, this.f45277l);
                }
            }
            float f12 = this.f45249M;
            if (f12 > 0.0f) {
                this.f45278m.setStrokeWidth(f12);
                this.f45278m.setColor(this.f45248L);
                for (int i12 = 0; i12 < this.f45273h - 1; i12++) {
                    View childAt3 = this.f45267e.getChildAt(i12);
                    canvas.drawLine(childAt3.getRight() + paddingLeft, this.f45250N, childAt3.getRight() + paddingLeft, height - this.f45250N, this.f45278m);
                }
            }
            m55588l();
            int i13 = this.f45281p;
            if (i13 == 2) {
                if (this.f45289x && (childAt = this.f45267e.getChildAt(this.f45269f)) != null) {
                    int i14 = ((int) this.f45239C) + paddingLeft;
                    Rect rect = this.f45274i;
                    int i15 = i14 + rect.left;
                    int i16 = (paddingLeft + rect.right) - ((int) this.f45241E);
                    TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
                    if (textView != null) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        getLocationInWindow(iArr);
                        textView.getLocationInWindow(iArr2);
                        int i17 = iArr2[1] - iArr[1];
                        int height2 = textView.getHeight() + i17;
                        if (i17 < height2) {
                            if (this.f45290y == null) {
                                if (this.f45287v > 0) {
                                    this.f45290y = getResources().getDrawable(this.f45287v);
                                } else {
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    this.f45290y = gradientDrawable;
                                    gradientDrawable.setColor(this.f45285t);
                                }
                            }
                            Drawable drawable = this.f45290y;
                            if (drawable != null) {
                                drawable.setBounds(i15, i17, i16, height2);
                                Drawable drawable2 = this.f45290y;
                                if (drawable2 instanceof GradientDrawable) {
                                    ((GradientDrawable) drawable2).setCornerRadius(this.f45238B);
                                }
                                this.f45290y.draw(canvas);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i13 == 1) {
                if (this.f45291z > 0.0f) {
                    this.f45279n.setColor(this.f45285t);
                    this.f45280o.reset();
                    float f13 = height;
                    this.f45280o.moveTo(this.f45274i.left + paddingLeft, f13);
                    Path path = this.f45280o;
                    Rect rect2 = this.f45274i;
                    path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f13 - this.f45291z);
                    this.f45280o.lineTo(paddingLeft + this.f45274i.right, f13);
                    this.f45280o.close();
                    canvas.drawPath(this.f45280o, this.f45279n);
                    return;
                }
                return;
            }
            if (this.f45291z > 0.0f) {
                this.f45276k.setColor(this.f45285t);
                if (this.f45243G == 80) {
                    GradientDrawable gradientDrawable2 = this.f45276k;
                    int i18 = ((int) this.f45239C) + paddingLeft;
                    Rect rect3 = this.f45274i;
                    int i19 = i18 + rect3.left;
                    int i21 = height - ((int) this.f45291z);
                    float f14 = this.f45242F;
                    gradientDrawable2.setBounds(i19, i21 - ((int) f14), (paddingLeft + rect3.right) - ((int) this.f45241E), height - ((int) f14));
                } else {
                    GradientDrawable gradientDrawable3 = this.f45276k;
                    int i22 = ((int) this.f45239C) + paddingLeft;
                    Rect rect4 = this.f45274i;
                    int i23 = i22 + rect4.left;
                    float f15 = this.f45240D;
                    gradientDrawable3.setBounds(i23, (int) f15, (paddingLeft + rect4.right) - ((int) this.f45241E), ((int) this.f45291z) + ((int) f15));
                }
                this.f45276k.setCornerRadius(this.f45238B);
                this.f45276k.draw(canvas);
            }
        }
    }

    public void setDividerPadding(float f11) {
        this.f45250N = m55589m(f11);
        invalidate();
    }

    public void setDividerWidth(float f11) {
        this.f45249M = m55589m(f11);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f11) {
        this.f45238B = m55589m(f11);
        invalidate();
    }

    public void setIndicatorHeight(float f11) {
        this.f45291z = m55589m(f11);
        invalidate();
    }

    public void setIndicatorWidth(float f11) {
        this.f45237A = m55589m(f11);
        invalidate();
    }

    public void setTabPadding(float f11) {
        this.f45282q = m55589m(f11);
        m55585F();
    }

    public void setTabWidth(float f11) {
        this.f45284s = m55589m(f11);
        m55585F();
    }

    public void setTextsize(float f11) {
        this.f45251O = m55581B(f11);
        m55585F();
    }

    public void setUnderlineHeight(float f11) {
        this.f45246J = m55589m(f11);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m55596t() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}

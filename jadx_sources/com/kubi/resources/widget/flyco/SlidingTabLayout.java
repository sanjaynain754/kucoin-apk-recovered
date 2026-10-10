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
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.resources.widget.flyco.widget.MsgView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import p739ww.C45938b;
import p776xw.C46336a;

/* JADX INFO: loaded from: classes12.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: p0 */
    public static Typeface f44765p0;

    /* JADX INFO: renamed from: q0 */
    public static Typeface f44766q0;

    /* JADX INFO: renamed from: A */
    public float f44767A;

    /* JADX INFO: renamed from: B */
    public float f44768B;

    /* JADX INFO: renamed from: C */
    public float f44769C;

    /* JADX INFO: renamed from: D */
    public float f44770D;

    /* JADX INFO: renamed from: E */
    public float f44771E;

    /* JADX INFO: renamed from: F */
    public float f44772F;

    /* JADX INFO: renamed from: G */
    public float f44773G;

    /* JADX INFO: renamed from: H */
    public int f44774H;

    /* JADX INFO: renamed from: I */
    public boolean f44775I;

    /* JADX INFO: renamed from: J */
    public boolean f44776J;

    /* JADX INFO: renamed from: K */
    public int f44777K;

    /* JADX INFO: renamed from: L */
    public float f44778L;

    /* JADX INFO: renamed from: M */
    public int f44779M;

    /* JADX INFO: renamed from: N */
    public boolean f44780N;

    /* JADX INFO: renamed from: O */
    public int f44781O;

    /* JADX INFO: renamed from: P */
    public float f44782P;

    /* JADX INFO: renamed from: Q */
    public float f44783Q;

    /* JADX INFO: renamed from: R */
    public float f44784R;

    /* JADX INFO: renamed from: S */
    public int f44785S;

    /* JADX INFO: renamed from: T */
    public int f44786T;

    /* JADX INFO: renamed from: U */
    public int f44787U;

    /* JADX INFO: renamed from: V */
    public boolean f44788V;

    /* JADX INFO: renamed from: W */
    public int f44789W;

    /* JADX INFO: renamed from: a0 */
    public int f44790a0;

    /* JADX INFO: renamed from: b */
    public Context f44791b;

    /* JADX INFO: renamed from: b0 */
    public boolean f44792b0;

    /* JADX INFO: renamed from: c */
    public ViewPager f44793c;

    /* JADX INFO: renamed from: c0 */
    public float f44794c0;

    /* JADX INFO: renamed from: d */
    public ArrayList<CharSequence> f44795d;

    /* JADX INFO: renamed from: d0 */
    public final ArgbEvaluator f44796d0;

    /* JADX INFO: renamed from: e */
    public LinearLayout f44797e;

    /* JADX INFO: renamed from: e0 */
    public long f44798e0;

    /* JADX INFO: renamed from: f */
    public int f44799f;

    /* JADX INFO: renamed from: f0 */
    public Interpolator f44800f0;

    /* JADX INFO: renamed from: g */
    public float f44801g;

    /* JADX INFO: renamed from: g0 */
    public boolean f44802g0;

    /* JADX INFO: renamed from: h */
    public int f44803h;

    /* JADX INFO: renamed from: h0 */
    public final Paint f44804h0;

    /* JADX INFO: renamed from: i */
    public final Rect f44805i;

    /* JADX INFO: renamed from: i0 */
    public final SparseArray<Boolean> f44806i0;

    /* JADX INFO: renamed from: j */
    public final Rect f44807j;

    /* JADX INFO: renamed from: j0 */
    public int f44808j0;

    /* JADX INFO: renamed from: k */
    public final GradientDrawable f44809k;

    /* JADX INFO: renamed from: k0 */
    public int f44810k0;

    /* JADX INFO: renamed from: l */
    public final Paint f44811l;

    /* JADX INFO: renamed from: l0 */
    public boolean f44812l0;

    /* JADX INFO: renamed from: m */
    public final Paint f44813m;

    /* JADX INFO: renamed from: m0 */
    public boolean f44814m0;

    /* JADX INFO: renamed from: n */
    public final Paint f44815n;

    /* JADX INFO: renamed from: n0 */
    public boolean f44816n0;

    /* JADX INFO: renamed from: o */
    public final Path f44817o;

    /* JADX INFO: renamed from: o0 */
    public C45938b f44818o0;

    /* JADX INFO: renamed from: p */
    public int f44819p;

    /* JADX INFO: renamed from: q */
    public float f44820q;

    /* JADX INFO: renamed from: r */
    public boolean f44821r;

    /* JADX INFO: renamed from: s */
    public float f44822s;

    /* JADX INFO: renamed from: t */
    public int f44823t;

    /* JADX INFO: renamed from: u */
    public int f44824u;

    /* JADX INFO: renamed from: v */
    public int f44825v;

    /* JADX INFO: renamed from: w */
    public float f44826w;

    /* JADX INFO: renamed from: x */
    public boolean f44827x;

    /* JADX INFO: renamed from: y */
    public Drawable f44828y;

    /* JADX INFO: renamed from: z */
    public Drawable f44829z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SlidingTabLayout$a */
    public class ViewOnClickListenerC23052a implements View.OnClickListener {
        public ViewOnClickListenerC23052a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOfChild = SlidingTabLayout.this.f44797e.indexOfChild(view);
            if (iIndexOfChild != -1) {
                if (SlidingTabLayout.this.f44793c.getCurrentItem() == iIndexOfChild) {
                    if (SlidingTabLayout.this.f44818o0 != null) {
                        SlidingTabLayout.this.f44818o0.mo31156a(iIndexOfChild);
                        return;
                    }
                    return;
                }
                SlidingTabLayout.this.m55255L(iIndexOfChild);
                if (SlidingTabLayout.this.f44818o0 != null) {
                    SlidingTabLayout.this.f44818o0.mo18273b(iIndexOfChild);
                }
                if (SlidingTabLayout.this.f44819p == 2) {
                    SlidingTabLayout.this.f44793c.setCurrentItem(iIndexOfChild, true);
                } else if (SlidingTabLayout.this.f44792b0) {
                    SlidingTabLayout.this.f44793c.setCurrentItem(iIndexOfChild, false);
                } else {
                    SlidingTabLayout.this.f44793c.setCurrentItem(iIndexOfChild);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SlidingTabLayout$b */
    public static class C23053b extends Scroller {

        /* JADX INFO: renamed from: a */
        public int f44831a;

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14, int i15) {
            super.startScroll(i11, i12, i13, i14, this.f44831a);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14) {
            super.startScroll(i11, i12, i13, i14, this.f44831a);
        }

        public C23053b(Context context, Interpolator interpolator, int i11) {
            super(context, interpolator);
            this.f44831a = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.flyco.SlidingTabLayout$c */
    /* JADX INFO: loaded from: classes13.dex */
    public class C23054c extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public final ArrayList<Fragment> f44832a;

        /* JADX INFO: renamed from: b */
        public final CharSequence[] f44833b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        public C23054c(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, CharSequence[] charSequenceArr) {
            super(fragmentManager);
            this.f44832a = arrayList;
            this.f44833b = charSequenceArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f44832a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i11) {
            return this.f44832a.get(i11);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i11) {
            return this.f44833b[i11];
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i11, Object obj) {
        }
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: J */
    private void m55253J() {
        int i11 = 0;
        while (i11 < this.f44803h) {
            View childAt = this.f44797e.getChildAt(i11);
            boolean z11 = i11 == this.f44799f;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(R$id.tv_tab_title) : null;
            if (textView != null) {
                textView.setTextColor(z11 ? this.f44785S : this.f44786T);
                if (f44765p0 == null || f44766q0 == null || C5303w0.m6511a()) {
                    textView.getPaint().setFakeBoldText(z11);
                } else {
                    textView.setTypeface(z11 ? f44766q0 : f44765p0);
                }
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m55255L(int i11) {
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f44803h) {
            View childAt = this.f44797e.getChildAt(i14);
            boolean z11 = i14 == i11;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(R$id.tv_tab_title) : null;
            if (textView != null) {
                if (!this.f44814m0) {
                    textView.setTextColor(z11 ? this.f44785S : this.f44786T);
                }
                if (this.f44812l0 && this.f44787U == 1 && !this.f44814m0) {
                    if (f44765p0 == null || f44766q0 == null || C5303w0.m6511a()) {
                        textView.getPaint().setFakeBoldText(z11);
                    } else {
                        textView.setTypeface(z11 ? f44766q0 : f44765p0);
                    }
                }
            }
            if (!this.f44827x && this.f44819p == 2 && (i12 = this.f44824u) != -1 && (i13 = this.f44825v) != -1 && textView != null) {
                if (z11) {
                    i12 = i13;
                }
                textView.setBackgroundResource(i12);
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: M */
    private void m55256M() {
        int i11 = 0;
        while (i11 < this.f44803h) {
            TextView textView = (TextView) this.f44797e.getChildAt(i11).findViewById(R$id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i11 == this.f44799f ? this.f44785S : this.f44786T);
                textView.setTextSize(0, this.f44784R);
                float f11 = this.f44820q;
                textView.setPaddingRelative((int) f11, 0, (int) f11, 0);
                if (this.f44788V) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                textView.setMinWidth((int) (m55269m(textView) + (this.f44820q * 2.0f) + m55270n(textView)));
                int i12 = this.f44787U;
                if (i12 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i12 == 1) {
                    m55255L(this.f44799f);
                } else if (i12 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (this.f44819p == 2 && this.f44824u > 0) {
                    float f12 = this.f44820q;
                    float f13 = this.f44771E;
                    textView.setPaddingRelative((int) f12, ((int) f13) / 2, (int) f12, ((int) f13) / 2);
                    if (this.f44827x) {
                        textView.setBackgroundResource(this.f44824u);
                    } else {
                        textView.setBackgroundResource(i11 == this.f44799f ? this.f44825v : this.f44824u);
                    }
                    if (this.f44826w > 0.0f) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.setMarginEnd((int) this.f44826w);
                        textView.setLayoutParams(layoutParams);
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
        this.f44814m0 = z11;
        if (i11 == 0) {
            m55253J();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m55292y() {
        this.f44818o0 = null;
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: A */
    public static void m55252A(Typeface typeface, Typeface typeface2) {
        f44765p0 = typeface;
        f44766q0 = typeface2;
    }

    /* JADX INFO: renamed from: K */
    private void m55254K(CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView == null || charSequence == null) {
            return;
        }
        textView.setText(charSequence);
        m55258O(view);
        m55257N(textView);
    }

    /* JADX INFO: renamed from: O */
    private void m55258O(View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        int i11 = this.f44808j0;
        if (i11 != -1) {
            textView.setMaxLines(i11);
        }
        if (this.f44810k0 != -1) {
            textView.setGravity(17);
            textView.setMinHeight(this.f44810k0);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m55265g(int i11, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_tab_title);
        if (textView != null) {
            if (C5303w0.m6511a() && Build.VERSION.SDK_INT >= 28) {
                textView.setFallbackLineSpacing(false);
            }
            if (charSequence != null) {
                textView.setText(charSequence);
            }
        }
        view.setOnClickListener(new ViewOnClickListenerC23052a());
        LinearLayout.LayoutParams layoutParams = this.f44821r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f44822s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f44822s, -1);
        }
        this.f44797e.addView(view, i11, layoutParams);
    }

    /* JADX INFO: renamed from: h */
    private void m55266h() {
        if (this.f44793c != null && this.f44802g0) {
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                declaredField.set(this.f44793c, new C23053b(this.f44793c.getContext(), this.f44800f0, (int) this.f44798e0));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m55267i() {
        View childAt = this.f44797e.getChildAt(this.f44799f);
        if (childAt != null) {
            if (this.f44768B < 0.0f) {
                return;
            }
            int i11 = R$id.tv_tab_title;
            TextView textView = (TextView) childAt.findViewById(i11);
            this.f44804h0.setTextSize(this.f44784R);
            float fM55272s = (m55272s(textView) - this.f44768B) / 2.0f;
            float left = childAt.getLeft() + textView.getPaddingStart() + (m55273v() ? m55271o(textView) : 0);
            if (fM55272s <= 0.0f) {
                fM55272s = 0.0f;
            }
            float fM55286p = left + fM55272s;
            if (m55273v()) {
                fM55286p = m55286p(fM55286p);
            }
            int i12 = this.f44799f;
            if (i12 < this.f44803h - 1) {
                View childAt2 = this.f44797e.getChildAt(i12 + 1);
                TextView textView2 = (TextView) childAt2.findViewById(i11);
                this.f44804h0.setTextSize(this.f44784R);
                float fM55272s2 = (m55272s(textView2) - this.f44768B) / 2.0f;
                float left2 = childAt2.getLeft() + textView2.getPaddingStart() + (m55273v() ? m55271o(textView2) : 0) + (fM55272s2 > 0.0f ? fM55272s2 : 0.0f);
                fM55286p = m55273v() ? fM55286p - (this.f44801g * (fM55286p - m55286p(left2))) : fM55286p + (this.f44801g * (left2 - fM55286p));
            }
            Rect rect = this.f44805i;
            int i13 = (int) fM55286p;
            rect.left = i13;
            rect.right = (int) (i13 + this.f44768B);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m55268j() {
        if (this.f44776J) {
            m55267i();
            return;
        }
        View childAt = this.f44797e.getChildAt(this.f44799f);
        if (childAt == null) {
            return;
        }
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f44819p == 0 && this.f44775I) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            this.f44804h0.setTextSize(this.f44784R);
            this.f44794c0 = (((right - left) - m55272s(textView)) - m55270n(textView)) / 2.0f;
        }
        int i11 = this.f44799f;
        if (i11 < this.f44803h - 1) {
            View childAt2 = this.f44797e.getChildAt(i11 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f11 = this.f44801g;
            left += (left2 - left) * f11;
            right += f11 * (right2 - right);
            if (this.f44819p == 0 && this.f44775I) {
                TextView textView2 = (TextView) childAt2.findViewById(R$id.tv_tab_title);
                this.f44804h0.setTextSize(this.f44784R);
                float fM55272s = (((right2 - left2) - m55272s(textView2)) - m55270n(textView2)) / 2.0f;
                float f12 = this.f44794c0;
                this.f44794c0 = f12 + (this.f44801g * (fM55272s - f12));
            }
        }
        Rect rect = this.f44805i;
        int i12 = (int) left;
        rect.left = i12;
        int i13 = (int) right;
        rect.right = i13;
        if (this.f44819p == 0 && this.f44775I) {
            float f13 = this.f44794c0;
            rect.left = (int) ((left + f13) - 1.0f);
            rect.right = (int) ((right - f13) - 1.0f);
        }
        Rect rect2 = this.f44807j;
        rect2.left = i12;
        rect2.right = i13;
        if (this.f44768B >= 0.0f) {
            float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f44768B) / 2.0f);
            int i14 = this.f44799f;
            if (i14 < this.f44803h - 1) {
                View childAt3 = this.f44797e.getChildAt(i14 + 1);
                left3 = m55273v() ? left3 - (this.f44801g * ((childAt.getWidth() / 2.0f) + (childAt3.getWidth() / 2.0f))) : left3 + (this.f44801g * ((childAt.getWidth() / 2.0f) + (childAt3.getWidth() / 2.0f)));
            }
            Rect rect3 = this.f44805i;
            int i15 = (int) left3;
            rect3.left = i15;
            rect3.right = (int) (i15 + this.f44768B);
        }
    }

    /* JADX INFO: renamed from: m */
    private float m55269m(TextView textView) {
        Paint paint = new Paint(this.f44804h0);
        paint.setTextSize(this.f44784R);
        if (f44766q0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f44766q0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    /* JADX INFO: renamed from: s */
    private float m55272s(TextView textView) {
        if (!this.f44812l0 || this.f44787U != 1) {
            return this.f44804h0.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
        }
        Paint paint = new Paint(this.f44804h0);
        if (f44766q0 == null || C5303w0.m6511a()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(f44766q0);
        }
        return paint.measureText(BidiFormatter.getInstance().unicodeWrap(textView.getText().toString()));
    }

    /* JADX INFO: renamed from: x */
    private void m55274x(Context context, AttributeSet attributeSet) {
        float f11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlidingTabLayout);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_style, 0);
            this.f44819p = i11;
            this.f44823t = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i11 == 2 ? "#4B6A87" : "#ffffff"));
            this.f44824u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_res, -1);
            this.f44825v = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SlidingTabLayout_tl_block_select_res, -1);
            int i12 = R$styleable.SlidingTabLayout_tl_indicator_height;
            int i13 = this.f44819p;
            if (i13 == 1) {
                f11 = 4.0f;
            } else {
                f11 = i13 == 2 ? -1 : 2;
            }
            this.f44767A = typedArrayObtainStyledAttributes.getDimension(i12, m55285l(f11));
            this.f44826w = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_block_margin, 0.0f);
            this.f44768B = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_width, m55285l(this.f44819p == 1 ? 10.0f : -1.0f));
            this.f44769C = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_corner_radius, m55285l(this.f44819p == 2 ? -1.0f : 0.0f));
            this.f44770D = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_left, m55285l(0.0f));
            float f12 = 7.0f;
            this.f44771E = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_top, m55285l(this.f44819p == 2 ? 7.0f : 0.0f));
            this.f44772F = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_right, m55285l(0.0f));
            int i14 = R$styleable.SlidingTabLayout_tl_indicator_margin_bottom;
            if (this.f44819p != 2) {
                f12 = 0.0f;
            }
            this.f44773G = typedArrayObtainStyledAttributes.getDimension(i14, m55285l(f12));
            this.f44774H = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_gravity, 80);
            this.f44775I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
            this.f44776J = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_center_with_text, false);
            this.f44777K = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_underline_color, -1);
            this.f44778L = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_underline_height, m55285l(0.0f));
            this.f44779M = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_underline_gravity, 80);
            this.f44781O = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_divider_color, -1);
            this.f44782P = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_width, m55285l(0.0f));
            this.f44783Q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_padding, m55285l(12.0f));
            this.f44784R = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_textsize, m55283I(14.0f));
            this.f44785S = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textSelectColor, -1);
            this.f44786T = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
            this.f44787U = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_textBold, 0);
            this.f44788V = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_textAllCaps, false);
            this.f44821r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_tab_space_equal, false);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_width, m55285l(-1.0f));
            this.f44822s = dimension;
            this.f44820q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_padding, (this.f44821r || dimension > 0.0f) ? m55285l(0.0f) : m55285l(12.0f));
            typedArrayObtainStyledAttributes.recycle();
            int i15 = this.f44824u;
            if (i15 != -1) {
                this.f44828y = ContextCompat.getDrawable(context, i15);
            }
            int i16 = this.f44825v;
            if (i16 != -1) {
                this.f44829z = ContextCompat.getDrawable(context, i16);
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m55275z() {
        if (this.f44803h <= 0 || this.f44797e.getChildAt(this.f44799f) == null) {
            return;
        }
        int width = (int) (this.f44801g * this.f44797e.getChildAt(this.f44799f).getWidth());
        int right = m55273v() ? this.f44797e.getChildAt(this.f44799f).getRight() - width : this.f44797e.getChildAt(this.f44799f).getLeft() + width;
        if (this.f44799f > 0 || width > 0) {
            int width2 = right - ((getWidth() / 2) - getPaddingStart());
            m55268j();
            if (m55273v()) {
                Rect rect = this.f44807j;
                right = width2 - ((rect.right - rect.left) / 2);
            } else {
                Rect rect2 = this.f44807j;
                right = width2 + ((rect2.right - rect2.left) / 2);
            }
        }
        if (right != this.f44789W) {
            this.f44789W = right;
            scrollTo(right, 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m55276B(int i11, boolean z11) {
        this.f44799f = i11;
        ViewPager viewPager = this.f44793c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i11, z11);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m55278D(int i11, float f11, float f12) {
        MsgView msgView;
        float f13;
        int i12 = this.f44803h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        View childAt = this.f44797e.getChildAt(i11);
        if (childAt == null || (msgView = (MsgView) childAt.findViewById(R$id.rtv_msg_tip)) == null) {
            return;
        }
        TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
        this.f44804h0.setTextSize(this.f44784R);
        float fM55272s = m55272s(textView);
        float fDescent = this.f44804h0.descent() - this.f44804h0.ascent();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
        float f14 = this.f44822s;
        if (f14 >= 0.0f) {
            f13 = f14 / 2.0f;
            fM55272s /= 2.0f;
        } else {
            f13 = this.f44820q;
        }
        marginLayoutParams.setMarginStart((int) (f13 + fM55272s + m55285l(f11)));
        int i13 = this.f44790a0;
        marginLayoutParams.topMargin = i13 > 0 ? (((int) (i13 - fDescent)) / 2) - m55285l(f12) : 0;
        msgView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: E */
    public void m55279E(ViewPager viewPager, CharSequence[] charSequenceArr) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        if (charSequenceArr.length != viewPager.getAdapter().getCount()) {
            throw new IllegalStateException("Titles length must be the same as the page count !");
        }
        this.f44793c = viewPager;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        this.f44795d = arrayList;
        Collections.addAll(arrayList, charSequenceArr);
        this.f44793c.removeOnPageChangeListener(this);
        this.f44793c.addOnPageChangeListener(this);
        m55266h();
        m55291w();
    }

    /* JADX INFO: renamed from: F */
    public void m55280F(ViewPager viewPager, CharSequence[] charSequenceArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager can not be NULL !");
        }
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        this.f44793c = viewPager;
        viewPager.setAdapter(new C23054c(fragmentActivity.getSupportFragmentManager(), arrayList, charSequenceArr));
        this.f44793c.removeOnPageChangeListener(this);
        this.f44793c.addOnPageChangeListener(this);
        m55266h();
        m55291w();
    }

    /* JADX INFO: renamed from: G */
    public void m55281G(int i11) {
        int i12 = this.f44803h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        m55282H(i11, 0);
    }

    /* JADX INFO: renamed from: H */
    public void m55282H(int i11, int i12) {
        LinearLayout linearLayout;
        MsgView msgView;
        if (i11 < 0 || (linearLayout = this.f44797e) == null) {
            return;
        }
        int i13 = this.f44803h;
        if (i11 >= i13) {
            i11 = i13 - 1;
        }
        View childAt = linearLayout.getChildAt(i11);
        if (childAt == null || (msgView = (MsgView) childAt.findViewById(R$id.rtv_msg_tip)) == null) {
            return;
        }
        C46336a.m102150a(msgView, i12);
        if (this.f44806i0.get(i11) == null || !this.f44806i0.get(i11).booleanValue()) {
            if (i12 > 0) {
                m55278D(i11, 2.0f, 2.0f);
            } else {
                m55278D(i11, 0.0f, 1.5f);
            }
            this.f44806i0.put(i11, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public int m55283I(float f11) {
        return (int) ((f11 * this.f44791b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public int getCurrentTab() {
        return this.f44799f;
    }

    public int getDividerColor() {
        return this.f44781O;
    }

    public float getDividerPadding() {
        return this.f44783Q;
    }

    public float getDividerWidth() {
        return this.f44782P;
    }

    public int getIndicatorColor() {
        return this.f44823t;
    }

    public float getIndicatorCornerRadius() {
        return this.f44769C;
    }

    public float getIndicatorHeight() {
        return this.f44767A;
    }

    public float getIndicatorMarginBottom() {
        return this.f44773G;
    }

    public float getIndicatorMarginLeft() {
        return this.f44770D;
    }

    public float getIndicatorMarginRight() {
        return this.f44772F;
    }

    public float getIndicatorMarginTop() {
        return this.f44771E;
    }

    public int getIndicatorStyle() {
        return this.f44819p;
    }

    public float getIndicatorWidth() {
        return this.f44768B;
    }

    public int getTabCount() {
        return this.f44803h;
    }

    public float getTabPadding() {
        return this.f44820q;
    }

    public float getTabWidth() {
        return this.f44822s;
    }

    public int getTextBold() {
        return this.f44787U;
    }

    public int getTextSelectColor() {
        return this.f44785S;
    }

    public int getTextUnselectColor() {
        return this.f44786T;
    }

    public float getTextsize() {
        return this.f44784R;
    }

    public int getUnderlineColor() {
        return this.f44777K;
    }

    public float getUnderlineHeight() {
        return this.f44778L;
    }

    /* JADX INFO: renamed from: k */
    public void m55284k() {
        this.f44806i0.clear();
    }

    /* JADX INFO: renamed from: l */
    public int m55285l(float f11) {
        return (int) ((f11 * this.f44791b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i11, float f11, int i12) {
        this.f44799f = i11;
        this.f44801g = f11;
        m55275z();
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f44799f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f44799f != 0) {
                int childCount = this.f44797e.getChildCount();
                int i11 = this.f44799f;
                if (childCount > i11) {
                    m55255L(i11);
                    m55275z();
                }
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f44799f);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final float m55286p(float f11) {
        return this.f44816n0 ? f11 + getPaddingEnd() : f11;
    }

    /* JADX INFO: renamed from: q */
    public MsgView m55287q(int i11) {
        int i12 = this.f44803h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        return (MsgView) this.f44797e.getChildAt(i11).findViewById(R$id.rtv_msg_tip);
    }

    /* JADX INFO: renamed from: r */
    public View m55288r(int i11) {
        if (this.f44797e.getChildCount() <= i11) {
            return null;
        }
        return this.f44797e.getChildAt(i11);
    }

    public void setApplyCustomViewPagerScroller(boolean z11) {
        this.f44802g0 = z11;
        m55266h();
    }

    public void setClickScrollDuration(long j11) {
        this.f44798e0 = j11;
        m55266h();
    }

    public void setClickScrollInterpolator(Interpolator interpolator) {
        if (interpolator != null) {
            this.f44800f0 = interpolator;
            m55266h();
        }
    }

    public void setCurrentTab(int i11) {
        this.f44799f = i11;
        ViewPager viewPager = this.f44793c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i11);
        }
    }

    public void setDividerColor(int i11) {
        this.f44781O = i11;
        invalidate();
    }

    public void setEnableBlockSlideAnim(boolean z11) {
        if (this.f44827x != z11) {
            this.f44827x = z11;
            m55256M();
            invalidate();
        }
    }

    public void setIndicatorColor(int i11) {
        this.f44823t = i11;
        invalidate();
    }

    public void setIndicatorGravity(int i11) {
        this.f44774H = i11;
        invalidate();
    }

    public void setIndicatorStyle(int i11) {
        this.f44819p = i11;
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z11) {
        this.f44775I = z11;
        invalidate();
    }

    public void setNeedBold(boolean z11) {
        this.f44812l0 = z11;
    }

    public void setOnTabSelectListener(C45938b c45938b) {
        this.f44818o0 = c45938b;
    }

    public void setPreFixVersion(boolean z11) {
        this.f44816n0 = z11;
    }

    public void setSnapOnTabClick(boolean z11) {
        this.f44792b0 = z11;
    }

    public void setTabMaxLine(int i11) {
        this.f44808j0 = i11;
    }

    public void setTabMinHeight(int i11) {
        this.f44810k0 = i11;
    }

    public void setTabSpaceEqual(boolean z11) {
        this.f44821r = z11;
        m55256M();
    }

    public void setTextAllCaps(boolean z11) {
        this.f44788V = z11;
        m55256M();
    }

    public void setTextBold(int i11) {
        this.f44787U = i11;
        m55256M();
    }

    public void setTextSelectColor(int i11) {
        this.f44785S = i11;
        m55256M();
    }

    public void setTextUnselectColor(int i11) {
        this.f44786T = i11;
        m55256M();
    }

    public void setUnderlineColor(int i11) {
        this.f44777K = i11;
        invalidate();
    }

    public void setUnderlineGravity(int i11) {
        this.f44779M = i11;
        invalidate();
    }

    public void setUnderlineIgnorePadding(boolean z11) {
        this.f44780N = z11;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f44793c = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.f44793c.addOnPageChangeListener(this);
        m55266h();
        m55291w();
    }

    /* JADX INFO: renamed from: t */
    public TextView m55289t(int i11) {
        return (TextView) this.f44797e.getChildAt(i11).findViewById(R$id.tv_tab_title);
    }

    /* JADX INFO: renamed from: u */
    public void m55290u(int i11) {
        MsgView msgView;
        int i12 = this.f44803h;
        if (i11 >= i12) {
            i11 = i12 - 1;
        }
        View childAt = this.f44797e.getChildAt(i11);
        if (childAt == null || (msgView = (MsgView) childAt.findViewById(R$id.rtv_msg_tip)) == null) {
            return;
        }
        msgView.setVisibility(8);
    }

    /* JADX INFO: renamed from: w */
    public void m55291w() {
        ArrayList<CharSequence> arrayList = this.f44795d;
        int count = arrayList == null ? this.f44793c.getAdapter().getCount() : arrayList.size();
        int i11 = 0;
        if (count == this.f44803h) {
            while (i11 < this.f44803h) {
                ArrayList<CharSequence> arrayList2 = this.f44795d;
                m55254K(arrayList2 == null ? this.f44793c.getAdapter().getPageTitle(i11) : arrayList2.get(i11), this.f44797e.getChildAt(i11));
                i11++;
            }
        } else {
            this.f44803h = count;
            this.f44797e.removeAllViews();
            while (i11 < this.f44803h) {
                View viewInflate = View.inflate(this.f44791b, R$layout.layout_tab, null);
                m55258O(viewInflate);
                ArrayList<CharSequence> arrayList3 = this.f44795d;
                m55265g(i11, arrayList3 == null ? this.f44793c.getAdapter().getPageTitle(i11) : arrayList3.get(i11), viewInflate);
                i11++;
            }
        }
        m55256M();
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44805i = new Rect();
        this.f44807j = new Rect();
        this.f44809k = new GradientDrawable();
        this.f44811l = new Paint(1);
        this.f44813m = new Paint(1);
        this.f44815n = new Paint(1);
        this.f44817o = new Path();
        this.f44819p = 0;
        this.f44827x = true;
        this.f44796d0 = new ArgbEvaluator();
        this.f44798e0 = 300L;
        this.f44800f0 = PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f);
        this.f44802g0 = true;
        this.f44804h0 = new Paint(1);
        this.f44806i0 = new SparseArray<>();
        this.f44808j0 = -1;
        this.f44810k0 = -1;
        this.f44812l0 = false;
        this.f44814m0 = false;
        this.f44816n0 = false;
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f44791b = context;
        this.f44797e = new LinearLayout(context);
        addView(this.f44797e, new ViewGroup.LayoutParams(-1, -1));
        m55274x(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (String.valueOf(-1).equals(attributeValue) || String.valueOf(-2).equals(attributeValue)) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
        try {
            this.f44790a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: N */
    private void m55257N(TextView textView) {
        if (m55273v()) {
            ViewParent parent = textView.getParent();
            if (parent instanceof RelativeLayout) {
                ((RelativeLayout) parent).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private int m55270n(TextView textView) {
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

    /* JADX INFO: renamed from: o */
    private int m55271o(TextView textView) {
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

    /* JADX INFO: renamed from: v */
    private boolean m55273v() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m55277C(float f11, float f12, float f13, float f14) {
        this.f44770D = m55285l(f11);
        this.f44771E = m55285l(f12);
        this.f44772F = m55285l(f13);
        this.f44773G = m55285l(f14);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        View childAt;
        float f11;
        super.onDraw(canvas);
        if (m55273v()) {
            for (int i11 = 0; i11 < this.f44797e.getChildCount(); i11++) {
                View childAt2 = this.f44797e.getChildAt(i11);
                if (childAt2 != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    layoutParams.width = childAt2.getRight() - childAt2.getLeft();
                    childAt2.setLayoutParams(layoutParams);
                }
            }
        }
        if (!isInEditMode() && this.f44803h > 0) {
            int height = getHeight();
            int paddingStart = getPaddingStart();
            float f12 = this.f44782P;
            if (f12 > 0.0f) {
                this.f44813m.setStrokeWidth(f12);
                this.f44813m.setColor(this.f44781O);
                for (int i12 = 0; i12 < this.f44803h - 1; i12++) {
                    View childAt3 = this.f44797e.getChildAt(i12);
                    canvas.drawLine(childAt3.getRight() + paddingStart, this.f44783Q, childAt3.getRight() + paddingStart, height - this.f44783Q, this.f44813m);
                }
            }
            if (this.f44778L > 0.0f) {
                this.f44811l.setColor(this.f44777K);
                float f13 = paddingStart;
                if (this.f44780N) {
                    f11 = 0.0f;
                } else {
                    f11 = f13;
                }
                if (this.f44779M == 80) {
                    float f14 = height;
                    canvas.drawRect(f11, f14 - this.f44778L, this.f44797e.getWidth() + paddingStart, f14, this.f44811l);
                } else {
                    canvas.drawRect(f11, 0.0f, this.f44797e.getWidth() + paddingStart, this.f44778L, this.f44811l);
                }
            }
            m55268j();
            int height2 = getHeight();
            int paddingStart2 = getPaddingStart();
            int i13 = this.f44819p;
            if (i13 == 1) {
                if (this.f44767A > 0.0f) {
                    this.f44815n.setColor(this.f44823t);
                    this.f44817o.reset();
                    float f15 = height2;
                    this.f44817o.moveTo(this.f44805i.left + paddingStart2, f15);
                    Path path = this.f44817o;
                    Rect rect = this.f44805i;
                    path.lineTo(paddingStart2 + (rect.left / 2.0f) + (rect.right / 2.0f), f15 - this.f44767A);
                    this.f44817o.lineTo(paddingStart2 + this.f44805i.right, f15);
                    this.f44817o.close();
                    canvas.drawPath(this.f44817o, this.f44815n);
                    return;
                }
                return;
            }
            if (i13 == 2) {
                if (this.f44827x && (childAt = this.f44797e.getChildAt(this.f44799f)) != null) {
                    int i14 = ((int) this.f44770D) + paddingStart2;
                    Rect rect2 = this.f44805i;
                    int i15 = i14 + rect2.left;
                    int i16 = (paddingStart2 + rect2.right) - ((int) this.f44772F);
                    TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    getLocationInWindow(iArr);
                    textView.getLocationInWindow(iArr2);
                    int i17 = iArr2[1] - iArr[1];
                    int height3 = textView.getHeight() + i17;
                    if (i17 < height3) {
                        Drawable drawable = this.f44829z;
                        if (drawable != null) {
                            drawable.setBounds(i15, i17, i16, height3);
                            this.f44829z.draw(canvas);
                            return;
                        } else {
                            this.f44809k.setColor(this.f44823t);
                            this.f44809k.setBounds(i15, i17, i16, height3);
                            this.f44809k.setCornerRadius(this.f44769C);
                            this.f44809k.draw(canvas);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (this.f44767A > 0.0f) {
                this.f44809k.setColor(this.f44823t);
                if (this.f44774H == 80) {
                    GradientDrawable gradientDrawable = this.f44809k;
                    int i18 = ((int) this.f44770D) + paddingStart2;
                    Rect rect3 = this.f44805i;
                    int i19 = i18 + rect3.left;
                    int i21 = height2 - ((int) this.f44767A);
                    float f16 = this.f44773G;
                    gradientDrawable.setBounds(i19, i21 - ((int) f16), (paddingStart2 + rect3.right) - ((int) this.f44772F), height2 - ((int) f16));
                } else {
                    GradientDrawable gradientDrawable2 = this.f44809k;
                    int i22 = ((int) this.f44770D) + paddingStart2;
                    Rect rect4 = this.f44805i;
                    int i23 = i22 + rect4.left;
                    float f17 = this.f44771E;
                    gradientDrawable2.setBounds(i23, (int) f17, (paddingStart2 + rect4.right) - ((int) this.f44772F), ((int) this.f44767A) + ((int) f17));
                }
                this.f44809k.setCornerRadius(this.f44769C);
                this.f44809k.draw(canvas);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i11) {
        m55255L(i11);
    }

    public void setDividerPadding(float f11) {
        this.f44783Q = m55285l(f11);
        invalidate();
    }

    public void setDividerWidth(float f11) {
        this.f44782P = m55285l(f11);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f11) {
        this.f44769C = m55285l(f11);
        invalidate();
    }

    public void setIndicatorHeight(float f11) {
        this.f44767A = m55285l(f11);
        invalidate();
    }

    public void setIndicatorWidth(float f11) {
        this.f44768B = m55285l(f11);
        invalidate();
    }

    public void setTabPadding(float f11) {
        this.f44820q = m55285l(f11);
        m55256M();
    }

    public void setTabWidth(float f11) {
        this.f44822s = m55285l(f11);
        m55256M();
    }

    public void setTextsize(float f11) {
        this.f44784R = m55283I(f11);
        m55256M();
    }

    public void setUnderlineHeight(float f11) {
        this.f44778L = m55285l(f11);
        invalidate();
    }
}

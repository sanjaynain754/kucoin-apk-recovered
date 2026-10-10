package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ta.v4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44883v4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101001a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101002b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44750d5 f101003c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44807k6 f101004d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RelativeLayout f101005e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101006f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f101007g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101008h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f101009i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f101010j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RtlViewPager f101011k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final SlidingTabLayout f101012l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44883v4 m99290a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.iv_rollback_tip_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_include_withdraw_guide))) != null) {
            C44750d5 c44750d5M99014a = C44750d5.m99014a(viewFindChildViewById);
            i11 = R$id.layout_withdraw_navigation_bar;
            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById3 != null) {
                C44807k6 c44807k6M99134a = C44807k6.m99134a(viewFindChildViewById3);
                i11 = R$id.rl_rollback;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                if (relativeLayout != null) {
                    i11 = R$id.tvLockAmountTip;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_rollback;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_rollback_tip;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.v_divider))) != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i11 = R$id.withdrawPager;
                                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                                if (rtlViewPager != null) {
                                    i11 = R$id.withdrawTab;
                                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                                    if (slidingTabLayout != null) {
                                        return new C44883v4(linearLayout, imageView, c44750d5M99014a, c44807k6M99134a, relativeLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById2, linearLayout, rtlViewPager, slidingTabLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f101001a;
    }

    public C44883v4(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull C44750d5 c44750d5, @NonNull C44807k6 c44807k6, @NonNull RelativeLayout relativeLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f101001a = linearLayout;
        this.f101002b = imageView;
        this.f101003c = c44750d5;
        this.f101004d = c44807k6;
        this.f101005e = relativeLayout;
        this.f101006f = baseTextView;
        this.f101007g = baseTextView2;
        this.f101008h = baseTextView3;
        this.f101009i = view;
        this.f101010j = linearLayout2;
        this.f101011k = rtlViewPager;
        this.f101012l = slidingTabLayout;
    }
}

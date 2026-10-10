package p206dp;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dp.a */
/* JADX INFO: compiled from: BmarginActivityMarketBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36901a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81554a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C36930o0 f81555b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81556c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C36930o0 f81557d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LottieAnimationView f81558e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81559f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81560g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81561h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f81562i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C36932p0 f81563j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final SlidingTabLayout f81564k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81565l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81566m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81567n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f81568o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final CustomViewPager f81569p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36901a m82671a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.cl_activity;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById4 != null) {
            C36930o0 c36930o0M82728a = C36930o0.m82728a(viewFindChildViewById4);
            i11 = R$id.cl_header;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.cl_topic))) != null) {
                C36930o0 c36930o0M82728a2 = C36930o0.m82728a(viewFindChildViewById);
                i11 = R$id.iv_ai;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                if (lottieAnimationView != null) {
                    i11 = R$id.iv_alert;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.iv_back;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.iv_fav;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                i11 = R$id.iv_share;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.ll_bottom))) != null) {
                                    C36932p0 c36932p0M82732a = C36932p0.m82732a(viewFindChildViewById2);
                                    i11 = R$id.tablayout;
                                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                                    if (slidingTabLayout != null) {
                                        i11 = R$id.tv_coinpairs;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_coinpairs_price;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tv_label;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                    i11 = R$id.viewpager;
                                                    CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                                    if (customViewPager != null) {
                                                        return new C36901a((ConstraintLayout) view, c36930o0M82728a, constraintLayout, c36930o0M82728a2, lottieAnimationView, imageView, imageView2, imageView3, imageView4, c36932p0M82732a, slidingTabLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById3, customViewPager);
                                                    }
                                                }
                                            }
                                        }
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
    public ConstraintLayout getRoot() {
        return this.f81554a;
    }

    public C36901a(@NonNull ConstraintLayout constraintLayout, @NonNull C36930o0 c36930o0, @NonNull ConstraintLayout constraintLayout2, @NonNull C36930o0 c36930o1, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull C36932p0 c36932p0, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull CustomViewPager customViewPager) {
        this.f81554a = constraintLayout;
        this.f81555b = c36930o0;
        this.f81556c = constraintLayout2;
        this.f81557d = c36930o1;
        this.f81558e = lottieAnimationView;
        this.f81559f = imageView;
        this.f81560g = imageView2;
        this.f81561h = imageView3;
        this.f81562i = imageView4;
        this.f81563j = c36932p0;
        this.f81564k = slidingTabLayout;
        this.f81565l = baseTextView;
        this.f81566m = baseTextView2;
        this.f81567n = baseTextView3;
        this.f81568o = view;
        this.f81569p = customViewPager;
    }
}

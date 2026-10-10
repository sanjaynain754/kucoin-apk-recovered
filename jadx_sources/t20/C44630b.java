package t20;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.b */
/* JADX INFO: compiled from: BkucoinActivityMarketBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44630b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f98959a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44662r f98960b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f98961c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44662r f98962d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LottieAnimationView f98963e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f98964f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f98965g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f98966h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f98967i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C44664s f98968j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final SlidingTabLayout f98969k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f98970l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f98971m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f98972n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f98973o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final CustomViewPager f98974p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44630b m98738a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.cl_activity;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById4 != null) {
            C44662r c44662rM98800a = C44662r.m98800a(viewFindChildViewById4);
            i11 = R$id.cl_header;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.cl_topic))) != null) {
                C44662r c44662rM98800a2 = C44662r.m98800a(viewFindChildViewById);
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
                                    C44664s c44664sM98804a = C44664s.m98804a(viewFindChildViewById2);
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
                                                        return new C44630b((ConstraintLayout) view, c44662rM98800a, constraintLayout, c44662rM98800a2, lottieAnimationView, imageView, imageView2, imageView3, imageView4, c44664sM98804a, slidingTabLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById3, customViewPager);
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
        return this.f98959a;
    }

    public C44630b(@NonNull ConstraintLayout constraintLayout, @NonNull C44662r c44662r, @NonNull ConstraintLayout constraintLayout2, @NonNull C44662r c44662r2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull C44664s c44664s, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull CustomViewPager customViewPager) {
        this.f98959a = constraintLayout;
        this.f98960b = c44662r;
        this.f98961c = constraintLayout2;
        this.f98962d = c44662r2;
        this.f98963e = lottieAnimationView;
        this.f98964f = imageView;
        this.f98965g = imageView2;
        this.f98966h = imageView3;
        this.f98967i = imageView4;
        this.f98968j = c44664s;
        this.f98969k = slidingTabLayout;
        this.f98970l = baseTextView;
        this.f98971m = baseTextView2;
        this.f98972n = baseTextView3;
        this.f98973o = view;
        this.f98974p = customViewPager;
    }
}

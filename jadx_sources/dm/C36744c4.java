package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.c4 */
/* JADX INFO: compiled from: BkumexLayoutMarketInfoHeaderBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36744c4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79819a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f79820b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f79821c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f79822d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f79823e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FlexboxLayout f79824f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f79825g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LottieAnimationView f79826h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeTextView f79827i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeTextView f79828j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatImageView f79829k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatImageView f79830l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f79831m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f79832n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36744c4 m82339a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.alertIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.backIv;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                i11 = R$id.favIv;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    i11 = R$id.flexLayout;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                    if (flexboxLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.iv_ai;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                        if (lottieAnimationView != null) {
                            i11 = R$id.lowLiquidityLabel;
                            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                            if (shapeTextView != null) {
                                i11 = R$id.preMarketLabel;
                                ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                if (shapeTextView2 != null) {
                                    i11 = R$id.shareIv;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView4 != null) {
                                        i11 = R$id.symbolFilterIv;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatImageView5 != null) {
                                            i11 = R$id.symbolNameTv;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tv_coinpairs_price;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    return new C36744c4(constraintLayout, appCompatImageView, appCompatImageView2, viewFindChildViewById, appCompatImageView3, flexboxLayout, constraintLayout, lottieAnimationView, shapeTextView, shapeTextView2, appCompatImageView4, appCompatImageView5, baseTextView, baseTextView2);
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
        return this.f79819a;
    }

    public C36744c4(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull View view, @NonNull AppCompatImageView appCompatImageView3, @NonNull FlexboxLayout flexboxLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f79819a = constraintLayout;
        this.f79820b = appCompatImageView;
        this.f79821c = appCompatImageView2;
        this.f79822d = view;
        this.f79823e = appCompatImageView3;
        this.f79824f = flexboxLayout;
        this.f79825g = constraintLayout2;
        this.f79826h = lottieAnimationView;
        this.f79827i = shapeTextView;
        this.f79828j = shapeTextView2;
        this.f79829k = appCompatImageView4;
        this.f79830l = appCompatImageView5;
        this.f79831m = baseTextView;
        this.f79832n = baseTextView2;
    }
}

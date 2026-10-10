package p637ta;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.a2 */
/* JADX INFO: compiled from: AssetSortSettingFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44723a2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f99549a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f99550b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final HorizontalScrollView f99551c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f99552d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99553e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f99554f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99555g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LottieAnimationView f99556h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RecyclerView f99557i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C44908z1 f99558j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f99559k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99560l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99561m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44723a2 m98956a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.flPreviewTabLayout;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
            if (horizontalScrollView != null) {
                i11 = R$id.ivSortIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.layoutHeader;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.layoutSortByValue;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.layoutTip;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.lottieHandGuide;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                                if (lottieAnimationView != null) {
                                    i11 = R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.sortOptions))) != null) {
                                        C44908z1 c44908z1M99340a = C44908z1.m99340a(viewFindChildViewById);
                                        i11 = R$id.tabContainer;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout4 != null) {
                                            i11 = R$id.tvAssetCount;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvTipContent;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    return new C44723a2((CoordinatorLayout) view, appBarLayout, horizontalScrollView, appCompatImageView, linearLayout, linearLayout2, linearLayout3, lottieAnimationView, recyclerView, c44908z1M99340a, linearLayout4, baseTextView, baseTextView2);
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
    public CoordinatorLayout getRoot() {
        return this.f99549a;
    }

    public C44723a2(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LottieAnimationView lottieAnimationView, @NonNull RecyclerView recyclerView, @NonNull C44908z1 c44908z1, @NonNull LinearLayout linearLayout4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99549a = coordinatorLayout;
        this.f99550b = appBarLayout;
        this.f99551c = horizontalScrollView;
        this.f99552d = appCompatImageView;
        this.f99553e = linearLayout;
        this.f99554f = linearLayout2;
        this.f99555g = linearLayout3;
        this.f99556h = lottieAnimationView;
        this.f99557i = recyclerView;
        this.f99558j = c44908z1;
        this.f99559k = linearLayout4;
        this.f99560l = baseTextView;
        this.f99561m = baseTextView2;
    }
}

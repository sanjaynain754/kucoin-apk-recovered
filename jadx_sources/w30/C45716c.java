package w30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.R$layout;

/* JADX INFO: renamed from: w30.c */
/* JADX INFO: compiled from: KucoinFragmentTradeTabSortSettingBinding.java */
/* JADX INFO: loaded from: classes50.dex */
public final class C45716c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f103087a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HorizontalScrollView f103088b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f103089c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f103090d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f103091e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LottieAnimationView f103092f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f103093g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f103094h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45716c m100915a(@NonNull View view) {
        int i11 = R$id.flPreviewTabLayout;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
        if (horizontalScrollView != null) {
            i11 = R$id.ivCloseBanner;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.layoutBanner;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.layoutListHeader;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.lottieHandGuide;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                        if (lottieAnimationView != null) {
                            i11 = R$id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.tabContainer;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout3 != null) {
                                    return new C45716c((ConstraintLayout) view, horizontalScrollView, appCompatImageView, linearLayout, linearLayout2, lottieAnimationView, recyclerView, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45716c m100916c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_fragment_trade_tab_sort_setting, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100915a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f103087a;
    }

    public C45716c(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LottieAnimationView lottieAnimationView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout3) {
        this.f103087a = constraintLayout;
        this.f103088b = horizontalScrollView;
        this.f103089c = appCompatImageView;
        this.f103090d = linearLayout;
        this.f103091e = linearLayout2;
        this.f103092f = lottieAnimationView;
        this.f103093g = recyclerView;
        this.f103094h = linearLayout3;
    }
}

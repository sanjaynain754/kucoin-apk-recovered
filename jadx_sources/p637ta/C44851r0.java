package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.finance.FinanceRecommendView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.r0 */
/* JADX INFO: compiled from: AssetFragmentFinanceCommonBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44851r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100709a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100710b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeTextView f100711c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f100712d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FinanceRecommendView f100713e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f100714f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f100715g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100716h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100717i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final CustomViewPager f100718j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44851r0 m99227a(@NonNull View view) {
        int i11 = R$id.clTitle;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.cryptoTab;
            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
            if (shapeTextView != null) {
                i11 = R$id.productTab;
                ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView2 != null) {
                    i11 = R$id.recommendView;
                    FinanceRecommendView financeRecommendView = (FinanceRecommendView) ViewBindings.findChildViewById(view, i11);
                    if (financeRecommendView != null) {
                        i11 = R$id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                        if (nestedScrollView != null) {
                            i11 = R$id.tabContainer;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat2 != null) {
                                i11 = R$id.tvLeftName;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvRightName;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.viewPager;
                                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                        if (customViewPager != null) {
                                            return new C44851r0((ConstraintLayout) view, linearLayoutCompat, shapeTextView, shapeTextView2, financeRecommendView, nestedScrollView, linearLayoutCompat2, baseTextView, baseTextView2, customViewPager);
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
        return this.f100709a;
    }

    public C44851r0(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull FinanceRecommendView financeRecommendView, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull CustomViewPager customViewPager) {
        this.f100709a = constraintLayout;
        this.f100710b = linearLayoutCompat;
        this.f100711c = shapeTextView;
        this.f100712d = shapeTextView2;
        this.f100713e = financeRecommendView;
        this.f100714f = nestedScrollView;
        this.f100715g = linearLayoutCompat2;
        this.f100716h = baseTextView;
        this.f100717i = baseTextView2;
        this.f100718j = customViewPager;
    }
}

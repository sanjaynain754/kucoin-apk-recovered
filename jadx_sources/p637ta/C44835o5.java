package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.isolated.IsolatedPositionDetailView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.o5 */
/* JADX INFO: compiled from: LayoutIsolatedMarginAccountDetailBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44835o5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100552a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100553b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f100554c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f100555d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f100556e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SwipeRefreshRecyclerView f100557f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f100558g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final IsolatedPositionDetailView f100559h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f100560i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f100561j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100562k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcPrimaryButton f100563l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100564m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100565n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f100566o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcPrimaryButton f100567p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final KcPrimaryButton f100568q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f100569r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f100570s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44835o5 m99196a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.headerViewContainer;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.ivFilter;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.m_swipe_recycler_view;
                        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (swipeRefreshRecyclerView != null) {
                            i11 = R$id.margin_risk_view;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout != null) {
                                i11 = R$id.positionView;
                                IsolatedPositionDetailView isolatedPositionDetailView = (IsolatedPositionDetailView) ViewBindings.findChildViewById(view, i11);
                                if (isolatedPositionDetailView != null) {
                                    i11 = R$id.toTradeView;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout != null) {
                                        i11 = R$id.tradeDivider;
                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                        if (frameLayout2 != null) {
                                            i11 = R$id.tv1;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvCenter;
                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                if (kcPrimaryButton != null) {
                                                    i11 = R$id.tv_coin_changeRate;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_coin_lastDealPrice;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tv_coin_name;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.tvLeft;
                                                                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton2 != null) {
                                                                    i11 = R$id.tvRight;
                                                                    KcPrimaryButton kcPrimaryButton3 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcPrimaryButton3 != null) {
                                                                        i11 = R$id.tvSymbol;
                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView5 != null) {
                                                                            i11 = R$id.tvType;
                                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView6 != null) {
                                                                                return new C44835o5((FrameLayout) view, appBarLayout, coordinatorLayout, linearLayoutCompat, imageView, swipeRefreshRecyclerView, frameLayout, isolatedPositionDetailView, constraintLayout, frameLayout2, baseTextView, kcPrimaryButton, baseTextView2, baseTextView3, baseTextView4, kcPrimaryButton2, kcPrimaryButton3, baseTextView5, baseTextView6);
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
    public FrameLayout getRoot() {
        return this.f100552a;
    }

    public C44835o5(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull FrameLayout frameLayout2, @NonNull IsolatedPositionDetailView isolatedPositionDetailView, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout3, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull KcPrimaryButton kcPrimaryButton3, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f100552a = frameLayout;
        this.f100553b = appBarLayout;
        this.f100554c = coordinatorLayout;
        this.f100555d = linearLayoutCompat;
        this.f100556e = imageView;
        this.f100557f = swipeRefreshRecyclerView;
        this.f100558g = frameLayout2;
        this.f100559h = isolatedPositionDetailView;
        this.f100560i = constraintLayout;
        this.f100561j = frameLayout3;
        this.f100562k = baseTextView;
        this.f100563l = kcPrimaryButton;
        this.f100564m = baseTextView2;
        this.f100565n = baseTextView3;
        this.f100566o = baseTextView4;
        this.f100567p = kcPrimaryButton2;
        this.f100568q = kcPrimaryButton3;
        this.f100569r = baseTextView5;
        this.f100570s = baseTextView6;
    }
}

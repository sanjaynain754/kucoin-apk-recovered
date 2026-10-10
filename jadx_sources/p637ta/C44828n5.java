package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.autoearn.views.AutoEarnCoinEntryView;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.n5 */
/* JADX INFO: compiled from: LayoutBaseAccountDetailBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44828n5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100511a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100512b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AutoEarnCoinEntryView f100513c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoordinatorLayout f100514d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AccountDetailHeaderView f100515e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f100516f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f100517g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f100518h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SwipeRefreshRecyclerView f100519i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f100520j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f100521k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f100522l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcPrimaryButton f100523m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KcPrimaryButton f100524n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f100525o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcPrimaryButton f100526p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44828n5 m99182a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.autoEarnEntry;
            AutoEarnCoinEntryView autoEarnCoinEntryView = (AutoEarnCoinEntryView) ViewBindings.findChildViewById(view, i11);
            if (autoEarnCoinEntryView != null) {
                i11 = R$id.coordinator;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                if (coordinatorLayout != null) {
                    i11 = R$id.headerView;
                    AccountDetailHeaderView accountDetailHeaderView = (AccountDetailHeaderView) ViewBindings.findChildViewById(view, i11);
                    if (accountDetailHeaderView != null) {
                        i11 = R$id.headerViewContainer;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            i11 = R$id.ivFilter;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.llBottom;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat2 != null) {
                                    i11 = R$id.m_swipe_recycler_view;
                                    SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (swipeRefreshRecyclerView != null) {
                                        i11 = R$id.recyclerViewFunction;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                        if (recyclerView != null) {
                                            i11 = R$id.recyclerViewInfo;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                            if (recyclerView2 != null) {
                                                i11 = R$id.tradeDivider;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout != null) {
                                                    i11 = R$id.tvCenter;
                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcPrimaryButton != null) {
                                                        i11 = R$id.tvLeft;
                                                        KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                        if (kcPrimaryButton2 != null) {
                                                            i11 = R$id.tvMore;
                                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView != null) {
                                                                i11 = R$id.tvRight;
                                                                KcPrimaryButton kcPrimaryButton3 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton3 != null) {
                                                                    return new C44828n5((FrameLayout) view, appBarLayout, autoEarnCoinEntryView, coordinatorLayout, accountDetailHeaderView, linearLayoutCompat, imageView, linearLayoutCompat2, swipeRefreshRecyclerView, recyclerView, recyclerView2, frameLayout, kcPrimaryButton, kcPrimaryButton2, baseTextView, kcPrimaryButton3);
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
        return this.f100511a;
    }

    public C44828n5(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull AutoEarnCoinEntryView autoEarnCoinEntryView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AccountDetailHeaderView accountDetailHeaderView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull FrameLayout frameLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton3) {
        this.f100511a = frameLayout;
        this.f100512b = appBarLayout;
        this.f100513c = autoEarnCoinEntryView;
        this.f100514d = coordinatorLayout;
        this.f100515e = accountDetailHeaderView;
        this.f100516f = linearLayoutCompat;
        this.f100517g = imageView;
        this.f100518h = linearLayoutCompat2;
        this.f100519i = swipeRefreshRecyclerView;
        this.f100520j = recyclerView;
        this.f100521k = recyclerView2;
        this.f100522l = frameLayout2;
        this.f100523m = kcPrimaryButton;
        this.f100524n = kcPrimaryButton2;
        this.f100525o = baseTextView;
        this.f100526p = kcPrimaryButton3;
    }
}

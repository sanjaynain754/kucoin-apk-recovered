package v30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.flyco.SimpleScrollBarLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.x */
/* JADX INFO: compiled from: FragmentTradeHorizontalBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45411x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102378a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f102379b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BuySellRatioView f102380c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102381d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f102382e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f102383f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f102384g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f102385h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f102386i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f102387j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f102388k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final SimpleScrollBarLayout f102389l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102390m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102391n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f102392o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcPrimaryButton f102393p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f102394q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ShowHideTextView f102395r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f102396s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45411x m100359a(@NonNull View view) {
        int i11 = R$id.barrier_buy_sell_bottom;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.buy_sell_ratio_view;
            BuySellRatioView buySellRatioView = (BuySellRatioView) ViewBindings.findChildViewById(view, i11);
            if (buySellRatioView != null) {
                i11 = R$id.cb_orderbook_select_precision;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.fl_buy;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.fl_sell;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout2 != null) {
                            i11 = R$id.iv_etf_icon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.ivPriceTypeInfo;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView2 != null) {
                                    i11 = R$id.ll_center;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout != null) {
                                        i11 = R$id.rcv_buy;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                        if (recyclerView != null) {
                                            i11 = R$id.rcv_sell;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                            if (recyclerView2 != null) {
                                                i11 = R$id.scrollBarLayout;
                                                SimpleScrollBarLayout simpleScrollBarLayout = (SimpleScrollBarLayout) ViewBindings.findChildViewById(view, i11);
                                                if (simpleScrollBarLayout != null) {
                                                    i11 = R$id.tv_amount_unit;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_amount_unit_1;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tv_etf_value;
                                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView != null) {
                                                                i11 = R$id.tv_ho_login;
                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton != null) {
                                                                    i11 = R$id.tv_price_unit;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.tv_trade_currency;
                                                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView != null) {
                                                                            i11 = R$id.tv_trade_price;
                                                                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (showHideTextView2 != null) {
                                                                                return new C45411x((ConstraintLayout) view, barrier, buySellRatioView, baseTextView, frameLayout, frameLayout2, appCompatImageView, appCompatImageView2, constraintLayout, recyclerView, recyclerView2, simpleScrollBarLayout, baseTextView2, baseTextView3, dashTextView, kcPrimaryButton, baseTextView4, showHideTextView, showHideTextView2);
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
    public ConstraintLayout getRoot() {
        return this.f102378a;
    }

    public C45411x(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BuySellRatioView buySellRatioView, @NonNull BaseTextView baseTextView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull SimpleScrollBarLayout simpleScrollBarLayout, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2) {
        this.f102378a = constraintLayout;
        this.f102379b = barrier;
        this.f102380c = buySellRatioView;
        this.f102381d = baseTextView;
        this.f102382e = frameLayout;
        this.f102383f = frameLayout2;
        this.f102384g = appCompatImageView;
        this.f102385h = appCompatImageView2;
        this.f102386i = constraintLayout2;
        this.f102387j = recyclerView;
        this.f102388k = recyclerView2;
        this.f102389l = simpleScrollBarLayout;
        this.f102390m = baseTextView2;
        this.f102391n = baseTextView3;
        this.f102392o = dashTextView;
        this.f102393p = kcPrimaryButton;
        this.f102394q = baseTextView4;
        this.f102395r = showHideTextView;
        this.f102396s = showHideTextView2;
    }
}

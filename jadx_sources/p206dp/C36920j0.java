package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcPrecisionTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.flyco.SimpleScrollBarLayout;

/* JADX INFO: renamed from: dp.j0 */
/* JADX INFO: compiled from: BmarginFragmentTradeHorizontalBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36920j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81745a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BuySellRatioView f81746b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrecisionTextView f81747c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f81748d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81749e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f81750f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81751g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81752h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LeverageSettingBar f81753i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f81754j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f81755k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RecyclerView f81756l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final SimpleScrollBarLayout f81757m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81758n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81759o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DashTextView f81760p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81761q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81762r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f81763s;

    public C36920j0(@NonNull ConstraintLayout constraintLayout, @NonNull BuySellRatioView buySellRatioView, @NonNull KcPrecisionTextView kcPrecisionTextView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LeverageSettingBar leverageSettingBar, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull SimpleScrollBarLayout simpleScrollBarLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView) {
        this.f81745a = constraintLayout;
        this.f81746b = buySellRatioView;
        this.f81747c = kcPrecisionTextView;
        this.f81748d = view;
        this.f81749e = frameLayout;
        this.f81750f = frameLayout2;
        this.f81751g = imageView;
        this.f81752h = imageView2;
        this.f81753i = leverageSettingBar;
        this.f81754j = constraintLayout2;
        this.f81755k = recyclerView;
        this.f81756l = recyclerView2;
        this.f81757m = simpleScrollBarLayout;
        this.f81758n = baseTextView;
        this.f81759o = baseTextView2;
        this.f81760p = dashTextView;
        this.f81761q = baseTextView3;
        this.f81762r = baseTextView4;
        this.f81763s = showHideTextView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36920j0 m82708a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.buy_sell_ratio_view;
        BuySellRatioView buySellRatioView = (BuySellRatioView) ViewBindings.findChildViewById(view, i11);
        if (buySellRatioView != null) {
            i11 = R$id.cb_orderbook_select_precision;
            KcPrecisionTextView kcPrecisionTextView = (KcPrecisionTextView) ViewBindings.findChildViewById(view, i11);
            if (kcPrecisionTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                i11 = R$id.fl_buy;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.fl_sell;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout2 != null) {
                        i11 = R$id.iv_mark_price;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.ivPriceTypeInfo;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.leverSettingBar;
                                LeverageSettingBar leverageSettingBar = (LeverageSettingBar) ViewBindings.findChildViewById(view, i11);
                                if (leverageSettingBar != null) {
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
                                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView != null) {
                                                        i11 = R$id.tv_amount_unit_1;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null) {
                                                            i11 = R$id.tv_etf_value;
                                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView != null) {
                                                                i11 = R$id.tv_ho_login;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tv_price_unit;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.tv_trade_price;
                                                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView != null) {
                                                                            return new C36920j0((ConstraintLayout) view, buySellRatioView, kcPrecisionTextView, viewFindChildViewById, frameLayout, frameLayout2, imageView, imageView2, leverageSettingBar, constraintLayout, recyclerView, recyclerView2, simpleScrollBarLayout, baseTextView, baseTextView2, dashTextView, baseTextView3, baseTextView4, showHideTextView);
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
        return this.f81745a;
    }
}

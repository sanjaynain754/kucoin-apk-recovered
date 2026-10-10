package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.view.SubmitStubView;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.OrderBookShowView;

/* JADX INFO: renamed from: dm.g2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesBookBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36766g2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80116a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AnimateDrawableEndView f80117b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f80118c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f80119d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BuySellRatioView f80120e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SubmitStubView f80121f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final DashTextView f80122g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80123h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final OrderBookShowView f80124i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AutoTextView f80125j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f80126k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatImageView f80127l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f80128m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80129n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RecyclerView f80130o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final SubmitStubView f80131p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80132q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AnimateDrawableEndView f80133r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36766g2 m82386a(@NonNull View view) {
        int i11 = R$id.amountUnit;
        AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
        if (animateDrawableEndView != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier != null) {
                i11 = R$id.buyList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.buy_sell_ratio_view;
                    BuySellRatioView buySellRatioView = (BuySellRatioView) ViewBindings.findChildViewById(view, i11);
                    if (buySellRatioView != null) {
                        i11 = R$id.buyStub;
                        SubmitStubView submitStubView = (SubmitStubView) ViewBindings.findChildViewById(view, i11);
                        if (submitStubView != null) {
                            i11 = R$id.fundingLabel;
                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                            if (dashTextView != null) {
                                i11 = R$id.fundingValue;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.iv_order_type;
                                    OrderBookShowView orderBookShowView = (OrderBookShowView) ViewBindings.findChildViewById(view, i11);
                                    if (orderBookShowView != null) {
                                        i11 = R$id.lastPrice;
                                        AutoTextView autoTextView = (AutoTextView) ViewBindings.findChildViewById(view, i11);
                                        if (autoTextView != null) {
                                            i11 = R$id.llMarkPrice;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout != null) {
                                                i11 = R$id.markIcon;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatImageView != null) {
                                                    i11 = R$id.markPrice;
                                                    DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView2 != null) {
                                                        i11 = R$id.priceUnit;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null) {
                                                            i11 = R$id.sellList;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                            if (recyclerView2 != null) {
                                                                i11 = R$id.sellStub;
                                                                SubmitStubView submitStubView2 = (SubmitStubView) ViewBindings.findChildViewById(view, i11);
                                                                if (submitStubView2 != null) {
                                                                    i11 = R$id.settleTime;
                                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView3 != null) {
                                                                        i11 = R$id.tickSize;
                                                                        AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                                                        if (animateDrawableEndView2 != null) {
                                                                            return new C36766g2((ConstraintLayout) view, animateDrawableEndView, barrier, recyclerView, buySellRatioView, submitStubView, dashTextView, baseTextView, orderBookShowView, autoTextView, linearLayout, appCompatImageView, dashTextView2, baseTextView2, recyclerView2, submitStubView2, baseTextView3, animateDrawableEndView2);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36766g2 m82387c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_futures_book, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82386a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80116a;
    }

    public C36766g2(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull Barrier barrier, @NonNull RecyclerView recyclerView, @NonNull BuySellRatioView buySellRatioView, @NonNull SubmitStubView submitStubView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull OrderBookShowView orderBookShowView, @NonNull AutoTextView autoTextView, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView2, @NonNull RecyclerView recyclerView2, @NonNull SubmitStubView submitStubView2, @NonNull BaseTextView baseTextView3, @NonNull AnimateDrawableEndView animateDrawableEndView2) {
        this.f80116a = constraintLayout;
        this.f80117b = animateDrawableEndView;
        this.f80118c = barrier;
        this.f80119d = recyclerView;
        this.f80120e = buySellRatioView;
        this.f80121f = submitStubView;
        this.f80122g = dashTextView;
        this.f80123h = baseTextView;
        this.f80124i = orderBookShowView;
        this.f80125j = autoTextView;
        this.f80126k = linearLayout;
        this.f80127l = appCompatImageView;
        this.f80128m = dashTextView2;
        this.f80129n = baseTextView2;
        this.f80130o = recyclerView2;
        this.f80131p = submitStubView2;
        this.f80132q = baseTextView3;
        this.f80133r = animateDrawableEndView2;
    }
}

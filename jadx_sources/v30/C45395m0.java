package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.m0 */
/* JADX INFO: compiled from: TradeCoreViewMarketHoderBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45395m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102205a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f102206b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f102207c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f102208d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SpotInputProgressView f102209e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102210f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102211g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102212h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102213i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45395m0 m100324a(@NonNull View view) {
        int i11 = R$id.et_number;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_trigger_price;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.progress_percent;
                SpotInputProgressView spotInputProgressView = (SpotInputProgressView) ViewBindings.findChildViewById(view, i11);
                if (spotInputProgressView != null) {
                    i11 = R$id.tvErrorTip;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_fee;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_market_tips;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_trigger_price;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C45395m0(linearLayout, tradeInputLayoutProxy, tradeInputLayoutProxy2, linearLayout, spotInputProgressView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public LinearLayout getRoot() {
        return this.f102205a;
    }

    public C45395m0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull LinearLayout linearLayout2, @NonNull SpotInputProgressView spotInputProgressView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f102205a = linearLayout;
        this.f102206b = tradeInputLayoutProxy;
        this.f102207c = tradeInputLayoutProxy2;
        this.f102208d = linearLayout2;
        this.f102209e = spotInputProgressView;
        this.f102210f = baseTextView;
        this.f102211g = baseTextView2;
        this.f102212h = baseTextView3;
        this.f102213i = baseTextView4;
    }
}

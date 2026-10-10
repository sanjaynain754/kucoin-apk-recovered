package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.q0 */
/* JADX INFO: compiled from: ViewLimitHolderLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45403q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102295a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f102296b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f102297c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputLayoutProxy f102298d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TradeInputLayoutProxy f102299e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f102300f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f102301g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f102302h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SpotInputProgressView f102303i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102304j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102305k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102306l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102307m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102308n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45403q0 m100343a(@NonNull View view) {
        int i11 = R$id.et_deal_amount;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_limit_price;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                i11 = R$id.et_number;
                TradeInputLayoutProxy tradeInputLayoutProxy3 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                if (tradeInputLayoutProxy3 != null) {
                    i11 = R$id.et_trigger_price;
                    TradeInputLayoutProxy tradeInputLayoutProxy4 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                    if (tradeInputLayoutProxy4 != null) {
                        i11 = R$id.fl_limit_type;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.ivTriangle;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                LinearLayout linearLayout2 = (LinearLayout) view;
                                i11 = R$id.progress_percent;
                                SpotInputProgressView spotInputProgressView = (SpotInputProgressView) ViewBindings.findChildViewById(view, i11);
                                if (spotInputProgressView != null) {
                                    i11 = R$id.tv_currency_total;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_fee;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tv_limit_price;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_limit_type;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_trigger_price;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        return new C45403q0(linearLayout2, tradeInputLayoutProxy, tradeInputLayoutProxy2, tradeInputLayoutProxy3, tradeInputLayoutProxy4, linearLayout, appCompatImageView, linearLayout2, spotInputProgressView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
    public LinearLayout getRoot() {
        return this.f102295a;
    }

    public C45403q0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy3, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy4, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout3, @NonNull SpotInputProgressView spotInputProgressView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f102295a = linearLayout;
        this.f102296b = tradeInputLayoutProxy;
        this.f102297c = tradeInputLayoutProxy2;
        this.f102298d = tradeInputLayoutProxy3;
        this.f102299e = tradeInputLayoutProxy4;
        this.f102300f = linearLayout2;
        this.f102301g = appCompatImageView;
        this.f102302h = linearLayout3;
        this.f102303i = spotInputProgressView;
        this.f102304j = baseTextView;
        this.f102305k = baseTextView2;
        this.f102306l = baseTextView3;
        this.f102307m = baseTextView4;
        this.f102308n = baseTextView5;
    }
}

package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.r0 */
/* JADX INFO: compiled from: ViewSegmentHolderLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45405r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102315a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f102316b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTradeNumAbInputView f102317c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcTradeNumAbInputView f102318d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f102319e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f102320f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f102321g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f102322h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f102323i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f102324j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102325k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f102326l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102327m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45405r0 m100347a(@NonNull View view) {
        int i11 = R$id.et_number;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_order_count;
            KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
            if (kcTradeNumAbInputView != null) {
                i11 = R$id.et_price_max;
                KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                if (kcTradeNumAbInputView2 != null) {
                    i11 = R$id.et_price_min;
                    KcTradeNumAbInputView kcTradeNumAbInputView3 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView3 != null) {
                        i11 = R$id.fl_distribution_card;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.ll_avg_price_row;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout2 != null) {
                                i11 = R$id.ll_distribution_row;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout3 != null) {
                                    LinearLayout linearLayout4 = (LinearLayout) view;
                                    i11 = R$id.tv_avg_price_label;
                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView != null) {
                                        i11 = R$id.tv_avg_price_value;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_distribution_label;
                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView2 != null) {
                                                i11 = R$id.tv_distribution_value;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    return new C45405r0(linearLayout4, tradeInputLayoutProxy, kcTradeNumAbInputView, kcTradeNumAbInputView2, kcTradeNumAbInputView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, dashTextView, baseTextView, dashTextView2, baseTextView2);
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
        return this.f102315a;
    }

    public C45405r0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView2) {
        this.f102315a = linearLayout;
        this.f102316b = tradeInputLayoutProxy;
        this.f102317c = kcTradeNumAbInputView;
        this.f102318d = kcTradeNumAbInputView2;
        this.f102319e = kcTradeNumAbInputView3;
        this.f102320f = linearLayout2;
        this.f102321g = linearLayout3;
        this.f102322h = linearLayout4;
        this.f102323i = linearLayout5;
        this.f102324j = dashTextView;
        this.f102325k = baseTextView;
        this.f102326l = dashTextView2;
        this.f102327m = baseTextView2;
    }
}

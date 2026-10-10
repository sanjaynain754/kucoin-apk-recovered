package t20;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.u0 */
/* JADX INFO: compiled from: KucoinViewTrailingStopHolderBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44669u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99386a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RadioGroup f99387b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f99388c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputLayoutProxy f99389d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TradeInputLayoutProxy f99390e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TradeInputLayoutProxy f99391f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99392g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f99393h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SpotInputProgressView f99394i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f99395j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RadioButton f99396k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99397l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f99398m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99399n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99400o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44669u0 m98814a(@NonNull View view) {
        int i11 = R$id.callback_range_percent;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
        if (radioGroup != null) {
            i11 = R$id.et_act_price;
            TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy != null) {
                i11 = R$id.et_callback_range;
                TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                if (tradeInputLayoutProxy2 != null) {
                    i11 = R$id.et_limit_price;
                    TradeInputLayoutProxy tradeInputLayoutProxy3 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                    if (tradeInputLayoutProxy3 != null) {
                        i11 = R$id.et_number;
                        TradeInputLayoutProxy tradeInputLayoutProxy4 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                        if (tradeInputLayoutProxy4 != null) {
                            i11 = R$id.ll_fee;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                LinearLayout linearLayout2 = (LinearLayout) view;
                                i11 = R$id.progress_percent;
                                SpotInputProgressView spotInputProgressView = (SpotInputProgressView) ViewBindings.findChildViewById(view, i11);
                                if (spotInputProgressView != null) {
                                    i11 = R$id.rb_1;
                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton != null) {
                                        i11 = R$id.rb_5;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton2 != null) {
                                            i11 = R$id.tv_act_price;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tv_fee;
                                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView != null) {
                                                    i11 = R$id.tv_fee_value;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_limit_price;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            return new C44669u0(linearLayout2, radioGroup, tradeInputLayoutProxy, tradeInputLayoutProxy2, tradeInputLayoutProxy3, tradeInputLayoutProxy4, linearLayout, linearLayout2, spotInputProgressView, radioButton, radioButton2, baseTextView, dashTextView, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f99386a;
    }

    public C44669u0(@NonNull LinearLayout linearLayout, @NonNull RadioGroup radioGroup, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy3, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SpotInputProgressView spotInputProgressView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99386a = linearLayout;
        this.f99387b = radioGroup;
        this.f99388c = tradeInputLayoutProxy;
        this.f99389d = tradeInputLayoutProxy2;
        this.f99390e = tradeInputLayoutProxy3;
        this.f99391f = tradeInputLayoutProxy4;
        this.f99392g = linearLayout2;
        this.f99393h = linearLayout3;
        this.f99394i = spotInputProgressView;
        this.f99395j = radioButton;
        this.f99396k = radioButton2;
        this.f99397l = baseTextView;
        this.f99398m = dashTextView;
        this.f99399n = baseTextView2;
        this.f99400o = baseTextView3;
    }
}

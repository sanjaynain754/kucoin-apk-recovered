package p270ft;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.f */
/* JADX INFO: compiled from: BotcFragmentAddReceivedWayBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37616f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f83846a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f83847b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f83848c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f83849d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f83850e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f83851f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83852g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83853h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83854i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final PaymentMethodTextView f83855j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AlertTipsTextView f83856k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37616f m84813a(@NonNull View view) {
        int i11 = R$id.button_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.ll_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.ll_items;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout2 != null) {
                    i11 = R$id.ll_name;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout3 != null) {
                        i11 = R$id.ll_received_way;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout4 != null) {
                            i11 = R$id.tv_1;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_name;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_name_title;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_received_way;
                                        PaymentMethodTextView paymentMethodTextView = (PaymentMethodTextView) ViewBindings.findChildViewById(view, i11);
                                        if (paymentMethodTextView != null) {
                                            i11 = R$id.tv_tip_info;
                                            AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                            if (alertTipsTextView != null) {
                                                return new C37616f((ScrollView) view, button, linearLayout, linearLayout2, linearLayout3, linearLayout4, baseTextView, baseTextView2, baseTextView3, paymentMethodTextView, alertTipsTextView);
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
    public ScrollView getRoot() {
        return this.f83846a;
    }

    public C37616f(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull PaymentMethodTextView paymentMethodTextView, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f83846a = scrollView;
        this.f83847b = button;
        this.f83848c = linearLayout;
        this.f83849d = linearLayout2;
        this.f83850e = linearLayout3;
        this.f83851f = linearLayout4;
        this.f83852g = baseTextView;
        this.f83853h = baseTextView2;
        this.f83854i = baseTextView3;
        this.f83855j = paymentMethodTextView;
        this.f83856k = alertTipsTextView;
    }
}

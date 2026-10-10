package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fast.buy.widget.PaymentConfirmFooterLayout;
import com.kubi.payment.fast.buy.widget.PaymentConfirmHeaderLayout;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: ft.a2 */
/* JADX INFO: compiled from: PaymentFragmentRecurringCreditCardConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37594a2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83603a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PaymentConfirmFooterLayout f83604b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PaymentConfirmHeaderLayout f83605c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final PaymentConfirmRecurringLayout f83606d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KWebContainer f83607e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37594a2 m84772a(@NonNull View view) {
        PaymentConfirmHeaderLayout paymentConfirmHeaderLayoutFindChildViewById;
        PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutFindChildViewById;
        int i11 = R$id.layout_footer;
        PaymentConfirmFooterLayout paymentConfirmFooterLayoutFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (paymentConfirmFooterLayoutFindChildViewById != null && (paymentConfirmHeaderLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_header))) != null && (paymentConfirmRecurringLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_recurring))) != null) {
            i11 = R$id.web_view;
            KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
            if (kWebContainer != null) {
                return new C37594a2((ConstraintLayout) view, paymentConfirmFooterLayoutFindChildViewById, paymentConfirmHeaderLayoutFindChildViewById, paymentConfirmRecurringLayoutFindChildViewById, kWebContainer);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83603a;
    }

    public C37594a2(@NonNull ConstraintLayout constraintLayout, @NonNull PaymentConfirmFooterLayout paymentConfirmFooterLayout, @NonNull PaymentConfirmHeaderLayout paymentConfirmHeaderLayout, @NonNull PaymentConfirmRecurringLayout paymentConfirmRecurringLayout, @NonNull KWebContainer kWebContainer) {
        this.f83603a = constraintLayout;
        this.f83604b = paymentConfirmFooterLayout;
        this.f83605c = paymentConfirmHeaderLayout;
        this.f83606d = paymentConfirmRecurringLayout;
        this.f83607e = kWebContainer;
    }
}

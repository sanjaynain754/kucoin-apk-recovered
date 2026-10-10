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

/* JADX INFO: renamed from: ft.z1 */
/* JADX INFO: compiled from: PaymentFragmentRecurringBalanceConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37715z1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84970a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PaymentConfirmFooterLayout f84971b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PaymentConfirmHeaderLayout f84972c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final PaymentConfirmRecurringLayout f84973d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37715z1 m85015a(@NonNull View view) {
        PaymentConfirmHeaderLayout paymentConfirmHeaderLayoutFindChildViewById;
        PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutFindChildViewById;
        int i11 = R$id.layout_footer;
        PaymentConfirmFooterLayout paymentConfirmFooterLayoutFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (paymentConfirmFooterLayoutFindChildViewById == null || (paymentConfirmHeaderLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_header))) == null || (paymentConfirmRecurringLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_recurring))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37715z1((ConstraintLayout) view, paymentConfirmFooterLayoutFindChildViewById, paymentConfirmHeaderLayoutFindChildViewById, paymentConfirmRecurringLayoutFindChildViewById);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84970a;
    }

    public C37715z1(@NonNull ConstraintLayout constraintLayout, @NonNull PaymentConfirmFooterLayout paymentConfirmFooterLayout, @NonNull PaymentConfirmHeaderLayout paymentConfirmHeaderLayout, @NonNull PaymentConfirmRecurringLayout paymentConfirmRecurringLayout) {
        this.f84970a = constraintLayout;
        this.f84971b = paymentConfirmFooterLayout;
        this.f84972c = paymentConfirmHeaderLayout;
        this.f84973d = paymentConfirmRecurringLayout;
    }
}

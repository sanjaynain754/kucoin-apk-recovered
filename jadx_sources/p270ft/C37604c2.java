package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.c2 */
/* JADX INFO: compiled from: PaymentFragmentWithdrawPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37604c2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83754b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37604c2 m84791a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C37604c2((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83753a;
    }

    public C37604c2(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView) {
        this.f83753a = constraintLayout;
        this.f83754b = recyclerView;
    }
}

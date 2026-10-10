package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.WithdrawHeaderView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.u4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawAddrAddBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44876u4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100954a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100955b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f100956c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final WithdrawHeaderView f100957d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44876u4 m99276a(@NonNull View view) {
        int i11 = R$id.btn_next;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.view_header;
                WithdrawHeaderView withdrawHeaderView = (WithdrawHeaderView) ViewBindings.findChildViewById(view, i11);
                if (withdrawHeaderView != null) {
                    return new C44876u4((ConstraintLayout) view, kcPrimaryButton, recyclerView, withdrawHeaderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100954a;
    }

    public C44876u4(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull RecyclerView recyclerView, @NonNull WithdrawHeaderView withdrawHeaderView) {
        this.f100954a = constraintLayout;
        this.f100955b = kcPrimaryButton;
        this.f100956c = recyclerView;
        this.f100957d = withdrawHeaderView;
    }
}

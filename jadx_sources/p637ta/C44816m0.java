package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.m0 */
/* JADX INFO: compiled from: AssetFragmentContactsAddBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44816m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100442a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100443b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f100444c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44816m0 m99153a(@NonNull View view) {
        int i11 = R$id.btn_next;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C44816m0((ConstraintLayout) view, kcPrimaryButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100442a;
    }

    public C44816m0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull RecyclerView recyclerView) {
        this.f100442a = constraintLayout;
        this.f100443b = kcPrimaryButton;
        this.f100444c = recyclerView;
    }
}

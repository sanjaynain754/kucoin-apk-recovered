package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.z */
/* JADX INFO: compiled from: FragmentCallAuctionProgressBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44677z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99470a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99471b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f99472c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44677z m98830a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bt_i_know;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_top))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C44677z((ConstraintLayout) view, kcPrimaryButton, viewFindChildViewById);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99470a;
    }

    public C44677z(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view) {
        this.f99470a = constraintLayout;
        this.f99471b = kcPrimaryButton;
        this.f99472c = view;
    }
}

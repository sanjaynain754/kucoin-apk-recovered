package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.s */
/* JADX INFO: compiled from: BkucoinLayoutMarketDetailBottomBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44664s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99314a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f99315b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f99316c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f99317d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99318e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f99319f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f99320g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44664s m98804a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottomRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.coin_buy;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.coin_sell;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.leftLayer))) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.rightLayer;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                    if (viewFindChildViewById2 != null) {
                        return new C44664s(constraintLayout, recyclerView, kcPrimaryButton, kcPrimaryButton2, viewFindChildViewById, constraintLayout, viewFindChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99314a;
    }

    public C44664s(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2) {
        this.f99314a = constraintLayout;
        this.f99315b = recyclerView;
        this.f99316c = kcPrimaryButton;
        this.f99317d = kcPrimaryButton2;
        this.f99318e = view;
        this.f99319f = constraintLayout2;
        this.f99320g = view2;
    }
}

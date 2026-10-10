package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.p0 */
/* JADX INFO: compiled from: BmarginLayoutMarketDetailBottomBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36932p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81870a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81871b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81872c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f81873d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81874e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f81875f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36932p0 m82732a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.bottomRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.coin_buy;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.coin_sell;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.leftLayer))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.rightLayer))) != null) {
                    return new C36932p0((ConstraintLayout) view, recyclerView, kcPrimaryButton, kcPrimaryButton2, viewFindChildViewById, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81870a;
    }

    public C36932p0(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull View view, @NonNull View view2) {
        this.f81870a = constraintLayout;
        this.f81871b = recyclerView;
        this.f81872c = kcPrimaryButton;
        this.f81873d = kcPrimaryButton2;
        this.f81874e = view;
        this.f81875f = view2;
    }
}

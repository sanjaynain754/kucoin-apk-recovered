package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.f2 */
/* JADX INFO: compiled from: AssetViewAlphaEmptyBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44763f2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99897a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99898b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f99899c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44763f2 m99041a(@NonNull View view) {
        int i11 = R$id.btnTrade;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C44763f2((LinearLayoutCompat) view, kcPrimaryButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f99897a;
    }

    public C44763f2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull RecyclerView recyclerView) {
        this.f99897a = linearLayoutCompat;
        this.f99898b = kcPrimaryButton;
        this.f99899c = recyclerView;
    }
}

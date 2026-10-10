package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.f0 */
/* JADX INFO: compiled from: FragmentTradeFundsListBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44639f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99061a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f99062b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f99063c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f99064d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f99065e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f99066f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44639f0 m98755a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.cbHideSmall;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.founds_divider))) != null) {
            i11 = R$id.founds_setting_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.iv_sort_founds_btn;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        return new C44639f0((LinearLayout) view, kuCheckBox, viewFindChildViewById, constraintLayout, appCompatImageView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99061a;
    }

    public C44639f0(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView) {
        this.f99061a = linearLayout;
        this.f99062b = kuCheckBox;
        this.f99063c = view;
        this.f99064d = constraintLayout;
        this.f99065e = appCompatImageView;
        this.f99066f = recyclerView;
    }
}

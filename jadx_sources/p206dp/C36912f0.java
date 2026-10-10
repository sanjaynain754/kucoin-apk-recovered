package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: dp.f0 */
/* JADX INFO: compiled from: BmarginFragmentPositionIsolatedBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36912f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81689a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f81690b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81691c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f81692d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36912f0 m82693a(@NonNull View view) {
        int i11 = R$id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.f32665rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_only;
                KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox != null) {
                    return new C36912f0((ConstraintLayout) view, viewFindChildViewById, recyclerView, kuCheckBox);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81689a;
    }

    public C36912f0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull KuCheckBox kuCheckBox) {
        this.f81689a = constraintLayout;
        this.f81690b = view;
        this.f81691c = recyclerView;
        this.f81692d = kuCheckBox;
    }
}

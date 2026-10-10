package p205dn;

import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;

/* JADX INFO: renamed from: dn.e */
/* JADX INFO: compiled from: BusercenterFragmentKycBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36885e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81453a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f81454b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81455c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36885e m82639a(@NonNull View view) {
        int i11 = R$id.btn_apply;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C36885e((ConstraintLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81453a;
    }

    public C36885e(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull RecyclerView recyclerView) {
        this.f81453a = constraintLayout;
        this.f81454b = button;
        this.f81455c = recyclerView;
    }
}

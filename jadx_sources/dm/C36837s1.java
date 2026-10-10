package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.s1 */
/* JADX INFO: compiled from: BkumexFragmentAdvancedDelegateBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36837s1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81032a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81033b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f81034c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36837s1 m82538a(@NonNull View view) {
        int i11 = R$id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.refresh;
            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
            if (kuCoinRefreshLayout != null) {
                return new C36837s1((ConstraintLayout) view, recyclerView, kuCoinRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81032a;
    }

    public C36837s1(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout) {
        this.f81032a = constraintLayout;
        this.f81033b = recyclerView;
        this.f81034c = kuCoinRefreshLayout;
    }
}

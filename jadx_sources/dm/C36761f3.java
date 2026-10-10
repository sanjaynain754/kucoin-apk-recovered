package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.f3 */
/* JADX INFO: compiled from: BkumexFragmentRefreshListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36761f3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80054a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f80055b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f80056c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36761f3 m82374a(@NonNull View view) {
        int i11 = R$id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.refresh;
            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
            if (kuCoinRefreshLayout != null) {
                return new C36761f3((ConstraintLayout) view, recyclerView, kuCoinRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36761f3 m82375c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_refresh_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82374a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80054a;
    }

    public C36761f3(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout) {
        this.f80054a = constraintLayout;
        this.f80055b = recyclerView;
        this.f80056c = kuCoinRefreshLayout;
    }
}

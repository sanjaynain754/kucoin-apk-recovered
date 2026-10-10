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

/* JADX INFO: renamed from: dm.z1 */
/* JADX INFO: compiled from: BkumexFragmentDelegateHistTwapBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36878z1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81403a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81404b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f81405c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36878z1 m82624a(@NonNull View view) {
        int i11 = R$id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.refresh;
            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
            if (kuCoinRefreshLayout != null) {
                return new C36878z1((ConstraintLayout) view, recyclerView, kuCoinRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36878z1 m82625c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_delegate_hist_twap, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82624a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81403a;
    }

    public C36878z1(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout) {
        this.f81403a = constraintLayout;
        this.f81404b = recyclerView;
        this.f81405c = kuCoinRefreshLayout;
    }
}

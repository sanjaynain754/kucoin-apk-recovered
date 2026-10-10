package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.p3 */
/* JADX INFO: compiled from: BkumexFragmentWelfareHistoryListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36821p3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80806a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f80807b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f80808c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f80809d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36821p3 m82504a(@NonNull View view) {
        int i11 = R$id.recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.refresh;
            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
            if (kuCoinRefreshLayout != null) {
                i11 = R$id.section;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView2 != null) {
                    return new C36821p3((LinearLayout) view, recyclerView, kuCoinRefreshLayout, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f80806a;
    }

    public C36821p3(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView2) {
        this.f80806a = linearLayout;
        this.f80807b = recyclerView;
        this.f80808c = kuCoinRefreshLayout;
        this.f80809d = recyclerView2;
    }
}

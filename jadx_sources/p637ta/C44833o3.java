package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.o3 */
/* JADX INFO: compiled from: FragmentAssetFuturesCoinsBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44833o3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100540a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f100541b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f100542c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCoinRefreshLayout f100543d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44833o3 m99192a(@NonNull View view) {
        int i11 = R$id.futuresCoinsContent;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                return new C44833o3(kuCoinRefreshLayout, constraintLayout, recyclerView, kuCoinRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KuCoinRefreshLayout getRoot() {
        return this.f100540a;
    }

    public C44833o3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2) {
        this.f100540a = kuCoinRefreshLayout;
        this.f100541b = constraintLayout;
        this.f100542c = recyclerView;
        this.f100543d = kuCoinRefreshLayout2;
    }
}

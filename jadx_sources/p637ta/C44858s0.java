package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.exchange.p075ui.AssetConvertBottomPanelView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.s0 */
/* JADX INFO: compiled from: AssetFragmentMarginConvertBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44858s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100763a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AssetConvertBottomPanelView f100764b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f100765c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f100766d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44858s0 m99240a(@NonNull View view) {
        int i11 = R$id.bottomPanel;
        AssetConvertBottomPanelView assetConvertBottomPanelView = (AssetConvertBottomPanelView) ViewBindings.findChildViewById(view, i11);
        if (assetConvertBottomPanelView != null) {
            i11 = R$id.refreshLayout;
            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
            if (kuCoinRefreshLayout != null) {
                i11 = R$id.tradingRecycler;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    return new C44858s0((LinearLayout) view, assetConvertBottomPanelView, kuCoinRefreshLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100763a;
    }

    public C44858s0(@NonNull LinearLayout linearLayout, @NonNull AssetConvertBottomPanelView assetConvertBottomPanelView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView) {
        this.f100763a = linearLayout;
        this.f100764b = assetConvertBottomPanelView;
        this.f100765c = kuCoinRefreshLayout;
        this.f100766d = recyclerView;
    }
}

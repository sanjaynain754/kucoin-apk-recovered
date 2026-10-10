package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.exchange.p075ui.AssetConvertBottomPanelView;
import com.kubi.assets.exchange.p075ui.AssetHeaderFilterAvailableView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.w0 */
/* JADX INFO: compiled from: AssetFragmentTradingConvertBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44886w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f101033a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AssetConvertBottomPanelView f101034b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AssetHeaderFilterAvailableView f101035c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCoinRefreshLayout f101036d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f101037e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44886w0 m99296a(@NonNull View view) {
        int i11 = R$id.bottomPanel;
        AssetConvertBottomPanelView assetConvertBottomPanelView = (AssetConvertBottomPanelView) ViewBindings.findChildViewById(view, i11);
        if (assetConvertBottomPanelView != null) {
            i11 = R$id.headerView;
            AssetHeaderFilterAvailableView assetHeaderFilterAvailableView = (AssetHeaderFilterAvailableView) ViewBindings.findChildViewById(view, i11);
            if (assetHeaderFilterAvailableView != null) {
                i11 = R$id.refreshLayout;
                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                if (kuCoinRefreshLayout != null) {
                    i11 = R$id.tradingRecycler;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        return new C44886w0((LinearLayoutCompat) view, assetConvertBottomPanelView, assetHeaderFilterAvailableView, kuCoinRefreshLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f101033a;
    }

    public C44886w0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AssetConvertBottomPanelView assetConvertBottomPanelView, @NonNull AssetHeaderFilterAvailableView assetHeaderFilterAvailableView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView) {
        this.f101033a = linearLayoutCompat;
        this.f101034b = assetConvertBottomPanelView;
        this.f101035c = assetHeaderFilterAvailableView;
        this.f101036d = kuCoinRefreshLayout;
        this.f101037e = recyclerView;
    }
}

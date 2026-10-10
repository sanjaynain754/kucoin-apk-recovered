package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;

/* JADX INFO: renamed from: bv.i */
/* JADX INFO: compiled from: FragmentChainMarketSectorsBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4672i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4371a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f4372b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4672i m4656a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C4672i((LinearLayoutCompat) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4371a;
    }

    public C4672i(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView) {
        this.f4371a = linearLayoutCompat;
        this.f4372b = recyclerView;
    }
}

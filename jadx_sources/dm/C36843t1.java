package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.t1 */
/* JADX INFO: compiled from: BkumexFragmentAirdropListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36843t1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f81064a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C36870x4 f81065b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81066c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f81067d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36843t1 m82551a(@NonNull View view) {
        int i11 = R$id.airdropEmpty;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C36870x4 c36870x4M82608a = C36870x4.m82608a(viewFindChildViewById);
            int i12 = R$id.airdropRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i12);
            if (recyclerView != null) {
                i12 = R$id.airdropSection;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i12);
                if (recyclerView2 != null) {
                    return new C36843t1((LinearLayoutCompat) view, c36870x4M82608a, recyclerView, recyclerView2);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f81064a;
    }

    public C36843t1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C36870x4 c36870x4, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f81064a = linearLayoutCompat;
        this.f81065b = c36870x4;
        this.f81066c = recyclerView;
        this.f81067d = recyclerView2;
    }
}

package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.q3 */
/* JADX INFO: compiled from: BkumexFragmentWelfareListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36827q3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80904a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f80905b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f80906c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C36870x4 f80907d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36827q3 m82516a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.section;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.welfareEmpty))) != null) {
                return new C36827q3((LinearLayoutCompat) view, recyclerView, recyclerView2, C36870x4.m82608a(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f80904a;
    }

    public C36827q3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull C36870x4 c36870x4) {
        this.f80904a = linearLayoutCompat;
        this.f80905b = recyclerView;
        this.f80906c = recyclerView2;
        this.f80907d = c36870x4;
    }
}

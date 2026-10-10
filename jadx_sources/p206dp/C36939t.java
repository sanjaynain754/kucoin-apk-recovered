package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;

/* JADX INFO: renamed from: dp.t */
/* JADX INFO: compiled from: BmarginFragmentIndexPriceListBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36939t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81980a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81981b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36939t m82747a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C36939t((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81980a;
    }

    public C36939t(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f81980a = linearLayout;
        this.f81981b = recyclerView;
    }
}

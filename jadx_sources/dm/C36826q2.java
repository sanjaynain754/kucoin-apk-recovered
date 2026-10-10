package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.q2 */
/* JADX INFO: compiled from: BkumexFragmentListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36826q2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80901a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f80902b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f80903c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36826q2 m82514a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C36826q2(linearLayout, linearLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f80901a;
    }

    public C36826q2(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.f80901a = linearLayout;
        this.f80902b = linearLayout2;
        this.f80903c = recyclerView;
    }
}

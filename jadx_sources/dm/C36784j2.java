package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.j2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesMoreFeaturesBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36784j2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80323a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f80324b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f80325c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36784j2 m82426a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.unifyLayoutContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                return new C36784j2((ConstraintLayout) view, recyclerView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80323a;
    }

    public C36784j2(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout) {
        this.f80323a = constraintLayout;
        this.f80324b = recyclerView;
        this.f80325c = frameLayout;
    }
}

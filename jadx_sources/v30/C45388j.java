package v30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.j */
/* JADX INFO: compiled from: BkucoinTradeFunctionsFragmentBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45388j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102153a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f102154b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f102155c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45388j m100310a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.unifyLayoutContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                return new C45388j((ConstraintLayout) view, recyclerView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102153a;
    }

    public C45388j(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout) {
        this.f102153a = constraintLayout;
        this.f102154b = recyclerView;
        this.f102155c = frameLayout;
    }
}

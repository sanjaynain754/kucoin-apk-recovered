package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: ta.d */
/* JADX INFO: compiled from: AssetAccountBillFinanceFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44744d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99716a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44736c f99717b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SwipeRefreshRecyclerView f99718c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44744d m99000a(@NonNull View view) {
        int i11 = R$id.filter_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44736c c44736cM98982a = C44736c.m98982a(viewFindChildViewById);
            int i12 = R$id.swipeRecyclerView;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i12);
            if (swipeRefreshRecyclerView != null) {
                return new C44744d((ConstraintLayout) view, c44736cM98982a, swipeRefreshRecyclerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99716a;
    }

    public C44744d(@NonNull ConstraintLayout constraintLayout, @NonNull C44736c c44736c, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f99716a = constraintLayout;
        this.f99717b = c44736c;
        this.f99718c = swipeRefreshRecyclerView;
    }
}

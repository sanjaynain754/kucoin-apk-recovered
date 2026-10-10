package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: ta.a */
/* JADX INFO: compiled from: AssetAccountBillCommonFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44720a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99532a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44728b f99533b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SwipeRefreshRecyclerView f99534c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44720a m98950a(@NonNull View view) {
        int i11 = R$id.filter_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44728b c44728bM98966a = C44728b.m98966a(viewFindChildViewById);
            int i12 = R$id.swipeRecyclerView;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i12);
            if (swipeRefreshRecyclerView != null) {
                return new C44720a((ConstraintLayout) view, c44728bM98966a, swipeRefreshRecyclerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99532a;
    }

    public C44720a(@NonNull ConstraintLayout constraintLayout, @NonNull C44728b c44728b, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f99532a = constraintLayout;
        this.f99533b = c44728b;
        this.f99534c = swipeRefreshRecyclerView;
    }
}

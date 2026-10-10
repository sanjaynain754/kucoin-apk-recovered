package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: ta.g */
/* JADX INFO: compiled from: AssetAccountBillFutureFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44768g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99943a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44760f f99944b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SwipeRefreshRecyclerView f99945c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44768g m99051a(@NonNull View view) {
        int i11 = R$id.filter_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44760f c44760fM99034a = C44760f.m99034a(viewFindChildViewById);
            int i12 = R$id.swipeRecyclerView;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i12);
            if (swipeRefreshRecyclerView != null) {
                return new C44768g((ConstraintLayout) view, c44760fM99034a, swipeRefreshRecyclerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99943a;
    }

    public C44768g(@NonNull ConstraintLayout constraintLayout, @NonNull C44760f c44760f, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f99943a = constraintLayout;
        this.f99944b = c44760f;
        this.f99945c = swipeRefreshRecyclerView;
    }
}

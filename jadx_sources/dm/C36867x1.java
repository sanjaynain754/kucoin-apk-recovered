package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.x1 */
/* JADX INFO: compiled from: BkumexFragmentCouponListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36867x1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81321a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81322b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C36870x4 f81323c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36867x1 m82600a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.welfareEmpty))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C36867x1((FrameLayout) view, recyclerView, C36870x4.m82608a(viewFindChildViewById));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f81321a;
    }

    public C36867x1(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull C36870x4 c36870x4) {
        this.f81321a = frameLayout;
        this.f81322b = recyclerView;
        this.f81323c = c36870x4;
    }
}

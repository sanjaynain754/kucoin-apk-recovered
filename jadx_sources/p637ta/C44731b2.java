package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.b2 */
/* JADX INFO: compiled from: AssetTabSortFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44731b2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f99612a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f99613b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44739c2 f99614c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99615d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44731b2 m98972a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.sortOptions))) != null) {
            C44739c2 c44739c2M98988a = C44739c2.m98988a(viewFindChildViewById);
            int i12 = R$id.tvDragFlag;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i12);
            if (baseTextView != null) {
                return new C44731b2((NestedScrollView) view, recyclerView, c44739c2M98988a, baseTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f99612a;
    }

    public C44731b2(@NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull C44739c2 c44739c2, @NonNull BaseTextView baseTextView) {
        this.f99612a = nestedScrollView;
        this.f99613b = recyclerView;
        this.f99614c = c44739c2;
        this.f99615d = baseTextView;
    }
}

package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.s0 */
/* JADX INFO: compiled from: BmarginLayoutRecyclerBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36938s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81975a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f81976b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81977c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81978d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81979e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36938s0 m82745a(@NonNull View view) {
        View viewFindChildViewById;
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tv_cancel;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                return new C36938s0(linearLayout, linearLayout, recyclerView, baseTextView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81975a;
    }

    public C36938s0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull View view) {
        this.f81975a = linearLayout;
        this.f81976b = linearLayout2;
        this.f81977c = recyclerView;
        this.f81978d = baseTextView;
        this.f81979e = view;
    }
}

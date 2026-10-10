package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.NonInterceptRecyclerView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.y5 */
/* JADX INFO: compiled from: ViewFilterAssetRecyclerViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44905y5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101196a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f101197b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NonInterceptRecyclerView f101198c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NonInterceptRecyclerView f101199d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101200e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44905y5 m99334a(@NonNull View view) {
        int i11 = R$id.line1;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.recycler_view_left;
            NonInterceptRecyclerView nonInterceptRecyclerView = (NonInterceptRecyclerView) ViewBindings.findChildViewById(view, i11);
            if (nonInterceptRecyclerView != null) {
                i11 = R$id.recycler_view_right;
                NonInterceptRecyclerView nonInterceptRecyclerView2 = (NonInterceptRecyclerView) ViewBindings.findChildViewById(view, i11);
                if (nonInterceptRecyclerView2 != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C44905y5((LinearLayout) view, viewFindChildViewById, nonInterceptRecyclerView, nonInterceptRecyclerView2, baseTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f101196a;
    }

    public C44905y5(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView2, @NonNull BaseTextView baseTextView) {
        this.f101196a = linearLayout;
        this.f101197b = view;
        this.f101198c = nonInterceptRecyclerView;
        this.f101199d = nonInterceptRecyclerView2;
        this.f101200e = baseTextView;
    }
}

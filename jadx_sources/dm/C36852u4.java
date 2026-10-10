package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.view.NonInterceptRecyclerView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.u4 */
/* JADX INFO: compiled from: BkumexViewFilterAssetRecyclerViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36852u4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81151a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f81152b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NonInterceptRecyclerView f81153c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NonInterceptRecyclerView f81154d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81155e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36852u4 m82569a(@NonNull View view) {
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
                        return new C36852u4((LinearLayout) view, viewFindChildViewById, nonInterceptRecyclerView, nonInterceptRecyclerView2, baseTextView);
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
        return this.f81151a;
    }

    public C36852u4(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView2, @NonNull BaseTextView baseTextView) {
        this.f81151a = linearLayout;
        this.f81152b = view;
        this.f81153c = nonInterceptRecyclerView;
        this.f81154d = nonInterceptRecyclerView2;
        this.f81155e = baseTextView;
    }
}

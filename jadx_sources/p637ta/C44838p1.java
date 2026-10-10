package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.NonInterceptRecyclerView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.p1 */
/* JADX INFO: compiled from: AssetKumexViewFilterAssetRecyclerViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44838p1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100585a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f100586b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NonInterceptRecyclerView f100587c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NonInterceptRecyclerView f100588d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100589e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44838p1 m99202a(@NonNull View view) {
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
                        return new C44838p1((LinearLayout) view, viewFindChildViewById, nonInterceptRecyclerView, nonInterceptRecyclerView2, baseTextView);
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
        return this.f100585a;
    }

    public C44838p1(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView, @NonNull NonInterceptRecyclerView nonInterceptRecyclerView2, @NonNull BaseTextView baseTextView) {
        this.f100585a = linearLayout;
        this.f100586b = view;
        this.f100587c = nonInterceptRecyclerView;
        this.f100588d = nonInterceptRecyclerView2;
        this.f100589e = baseTextView;
    }
}

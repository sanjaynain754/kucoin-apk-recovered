package dm;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.z2 */
/* JADX INFO: compiled from: BkumexFragmentPnlHistoryBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36879z2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81406a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81407b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f81408c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81409d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81410e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f81411f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCoinRefreshLayout f81412g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HorizontalScrollView f81413h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81414i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36879z2 m82627a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.accountFilter;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.accountFilterDivider))) != null) {
            i11 = R$id.contract;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                i11 = R$id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.refresh;
                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                    if (kuCoinRefreshLayout != null) {
                        i11 = R$id.scrollView;
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                        if (horizontalScrollView != null) {
                            i11 = R$id.time;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C36879z2((LinearLayout) view, baseTextView, viewFindChildViewById, baseTextView2, viewFindChildViewById2, recyclerView, kuCoinRefreshLayout, horizontalScrollView, baseTextView3);
                            }
                        }
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
        return this.f81406a;
    }

    public C36879z2(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull BaseTextView baseTextView3) {
        this.f81406a = linearLayout;
        this.f81407b = baseTextView;
        this.f81408c = view;
        this.f81409d = baseTextView2;
        this.f81410e = view2;
        this.f81411f = recyclerView;
        this.f81412g = kuCoinRefreshLayout;
        this.f81413h = horizontalScrollView;
        this.f81414i = baseTextView3;
    }
}

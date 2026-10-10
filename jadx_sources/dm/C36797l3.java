package dm;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.l3 */
/* JADX INFO: compiled from: BkumexFragmentTradeRecordBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36797l3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80484a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80485b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f80486c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80487d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f80488e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f80489f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f80490g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KuCoinRefreshLayout f80491h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final HorizontalScrollView f80492i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80493j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80494k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36797l3 m82455a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.accountFilter;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.accountFilterDivider))) != null) {
            i11 = R$id.contractFilter;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.filter;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                    i11 = R$id.list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.refresh;
                        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                        if (kuCoinRefreshLayout != null) {
                            i11 = R$id.scrollView;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                            if (horizontalScrollView != null) {
                                i11 = R$id.timeFilter;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.typeFilter;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        return new C36797l3((ConstraintLayout) view, baseTextView, viewFindChildViewById, baseTextView2, linearLayoutCompat, viewFindChildViewById2, recyclerView, kuCoinRefreshLayout, horizontalScrollView, baseTextView3, baseTextView4);
                                    }
                                }
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
    public ConstraintLayout getRoot() {
        return this.f80484a;
    }

    public C36797l3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f80484a = constraintLayout;
        this.f80485b = baseTextView;
        this.f80486c = view;
        this.f80487d = baseTextView2;
        this.f80488e = linearLayoutCompat;
        this.f80489f = view2;
        this.f80490g = recyclerView;
        this.f80491h = kuCoinRefreshLayout;
        this.f80492i = horizontalScrollView;
        this.f80493j = baseTextView3;
        this.f80494k = baseTextView4;
    }
}

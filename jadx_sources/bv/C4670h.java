package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: bv.h */
/* JADX INFO: compiled from: FragmentChainMarketListBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4670h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4350a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4351b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4352c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SwipeRefreshRecyclerView f4353d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KuCoinRefreshLayout f4354e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4355f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4356g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4670h m4652a(@NonNull View view) {
        int i11 = R$id.layout_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.layout_holdings_place;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.swipe_recycler_layout;
                SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                if (swipeRefreshRecyclerView != null) {
                    i11 = R$id.take_place_swipeLayout;
                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                    if (kuCoinRefreshLayout != null) {
                        i11 = R$id.tv_update;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_update_time;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C4670h((ConstraintLayout) view, linearLayout, linearLayout2, swipeRefreshRecyclerView, kuCoinRefreshLayout, baseTextView, baseTextView2);
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
        return this.f4350a;
    }

    public C4670h(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f4350a = constraintLayout;
        this.f4351b = linearLayout;
        this.f4352c = linearLayout2;
        this.f4353d = swipeRefreshRecyclerView;
        this.f4354e = kuCoinRefreshLayout;
        this.f4355f = baseTextView;
        this.f4356g = baseTextView2;
    }
}

package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.DropMenuView;

/* JADX INFO: renamed from: dp.l */
/* JADX INFO: compiled from: BmarginFragmentDelegationBorrowingBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36923l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81776a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C36928n0 f81777b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81778c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RelativeLayout f81779d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final DropMenuView f81780e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SwipeRefreshRecyclerView f81781f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f81782g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81783h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81784i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36923l m82714a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.delegation_empty;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C36928n0 c36928n0M82724a = C36928n0.m82724a(viewFindChildViewById2);
            i11 = R$id.iv_filter;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.ll_top;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                if (relativeLayout != null) {
                    i11 = R$id.m_drop_menu_view;
                    DropMenuView dropMenuView = (DropMenuView) ViewBindings.findChildViewById(view, i11);
                    if (dropMenuView != null) {
                        i11 = R$id.m_swipe_recycler_view;
                        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (swipeRefreshRecyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.split1))) != null) {
                            i11 = R$id.tv_choose_coin;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_choose_pairs;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C36923l((LinearLayout) view, c36928n0M82724a, baseTextView, relativeLayout, dropMenuView, swipeRefreshRecyclerView, viewFindChildViewById, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f81776a;
    }

    public C36923l(@NonNull LinearLayout linearLayout, @NonNull C36928n0 c36928n0, @NonNull BaseTextView baseTextView, @NonNull RelativeLayout relativeLayout, @NonNull DropMenuView dropMenuView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81776a = linearLayout;
        this.f81777b = c36928n0;
        this.f81778c = baseTextView;
        this.f81779d = relativeLayout;
        this.f81780e = dropMenuView;
        this.f81781f = swipeRefreshRecyclerView;
        this.f81782g = view;
        this.f81783h = baseTextView2;
        this.f81784i = baseTextView3;
    }
}

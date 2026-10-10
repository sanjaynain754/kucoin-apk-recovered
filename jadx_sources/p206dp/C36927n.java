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

/* JADX INFO: renamed from: dp.n */
/* JADX INFO: compiled from: BmarginFragmentDelegationLiquidationBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36927n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81839a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C36928n0 f81840b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f81841c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81842d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RelativeLayout f81843e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final DropMenuView f81844f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final SwipeRefreshRecyclerView f81845g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81846h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81847i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36927n m82722a(@NonNull View view) {
        int i11 = R$id.delegation_empty;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C36928n0 c36928n0M82724a = C36928n0.m82724a(viewFindChildViewById);
            i11 = R$id.filter_divider;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
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
                            if (swipeRefreshRecyclerView != null) {
                                i11 = R$id.tv_choose_biz_type;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_choose_pairs;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        return new C36927n((LinearLayout) view, c36928n0M82724a, viewFindChildViewById2, baseTextView, relativeLayout, dropMenuView, swipeRefreshRecyclerView, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f81839a;
    }

    public C36927n(@NonNull LinearLayout linearLayout, @NonNull C36928n0 c36928n0, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull RelativeLayout relativeLayout, @NonNull DropMenuView dropMenuView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81839a = linearLayout;
        this.f81840b = c36928n0;
        this.f81841c = view;
        this.f81842d = baseTextView;
        this.f81843e = relativeLayout;
        this.f81844f = dropMenuView;
        this.f81845g = swipeRefreshRecyclerView;
        this.f81846h = baseTextView2;
        this.f81847i = baseTextView3;
    }
}

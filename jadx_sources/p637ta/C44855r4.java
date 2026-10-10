package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.DropMenuView;

/* JADX INFO: renamed from: ta.r4 */
/* JADX INFO: compiled from: KucoinFragmentInOutHisBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44855r4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100735a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f100736b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final DashTextView f100737c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f100738d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f100739e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f100740f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final DropMenuView f100741g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SwipeRefreshRecyclerView f100742h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100743i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100744j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100745k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100746l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100747m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100748n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44855r4 m99234a(@NonNull View view) {
        int i11 = R$id.clSubTitle;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.delistHistoryText;
            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
            if (dashTextView != null) {
                i11 = R$id.fl_empty;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.iv_empty_his;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.ll_top;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.m_drop_menu_view;
                            DropMenuView dropMenuView = (DropMenuView) ViewBindings.findChildViewById(view, i11);
                            if (dropMenuView != null) {
                                i11 = R$id.m_swipe_recycler_view;
                                SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (swipeRefreshRecyclerView != null) {
                                    i11 = R$id.tv_click;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_coin_type;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tv_empty_tips;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_filter;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_history_tip;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_tip;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            return new C44855r4((LinearLayout) view, constraintLayout, dashTextView, linearLayout, imageView, linearLayout2, dropMenuView, swipeRefreshRecyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        return this.f100735a;
    }

    public C44855r4(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull DashTextView dashTextView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull DropMenuView dropMenuView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f100735a = linearLayout;
        this.f100736b = constraintLayout;
        this.f100737c = dashTextView;
        this.f100738d = linearLayout2;
        this.f100739e = imageView;
        this.f100740f = linearLayout3;
        this.f100741g = dropMenuView;
        this.f100742h = swipeRefreshRecyclerView;
        this.f100743i = baseTextView;
        this.f100744j = baseTextView2;
        this.f100745k = baseTextView3;
        this.f100746l = baseTextView4;
        this.f100747m = baseTextView5;
        this.f100748n = baseTextView6;
    }
}

package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import v30.C45375c0;
import v30.C45377d0;

/* JADX INFO: renamed from: dp.p */
/* JADX INFO: compiled from: BmarginFragmentDelegationTodoBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36931p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81864a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C45375c0 f81865b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C45377d0 f81866c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f81867d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SwipeRefreshRecyclerView f81868e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81869f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36931p m82730a(@NonNull View view) {
        int i11 = R$id.layoutGuideAddFundsLayout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C45375c0 c45375c0M100280a = C45375c0.m100280a(viewFindChildViewById);
            i11 = R$id.layoutGuideTradeLayout;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C45377d0 c45377d0M100284a = C45377d0.m100284a(viewFindChildViewById2);
                i11 = R$id.ll_entrance;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.m_swipe_recycler_view;
                    SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (swipeRefreshRecyclerView != null) {
                        i11 = R$id.tv_cancel;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C36931p((ConstraintLayout) view, c45375c0M100280a, c45377d0M100284a, linearLayout, swipeRefreshRecyclerView, baseTextView);
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
        return this.f81864a;
    }

    public C36931p(@NonNull ConstraintLayout constraintLayout, @NonNull C45375c0 c45375c0, @NonNull C45377d0 c45377d0, @NonNull LinearLayout linearLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView) {
        this.f81864a = constraintLayout;
        this.f81865b = c45375c0;
        this.f81866c = c45377d0;
        this.f81867d = linearLayout;
        this.f81868e = swipeRefreshRecyclerView;
        this.f81869f = baseTextView;
    }
}

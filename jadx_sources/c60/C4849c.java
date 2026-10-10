package c60;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.c */
/* JADX INFO: compiled from: BtransferFragmentSearchBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4849c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4936a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f4937b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f4938c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AlertTipsTextView f4939d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f4940e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4941f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f4942g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SwipeRefreshRecyclerView f4943h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final C4851e f4944i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f4945j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f4946k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4849c m4975a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.financeTipView;
                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                if (alertTipsTextView != null) {
                    i11 = R$id.hisRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.ivDelete;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.layoutHistory;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.m_swipe_recycler_view;
                                SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (swipeRefreshRecyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.searchHeader))) != null) {
                                    C4851e c4851eM4979a = C4851e.m4979a(viewFindChildViewById);
                                    i11 = R$id.tvAccountAvailable;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView != null) {
                                        i11 = R$id.tvTitle;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView2 != null) {
                                            return new C4849c((LinearLayout) view, appBarLayout, coordinatorLayout, alertTipsTextView, recyclerView, imageView, constraintLayout, swipeRefreshRecyclerView, c4851eM4979a, textView, textView2);
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
        return this.f4936a;
    }

    public C4849c(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AlertTipsTextView alertTipsTextView, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull C4851e c4851e, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f4936a = linearLayout;
        this.f4937b = appBarLayout;
        this.f4938c = coordinatorLayout;
        this.f4939d = alertTipsTextView;
        this.f4940e = recyclerView;
        this.f4941f = imageView;
        this.f4942g = constraintLayout;
        this.f4943h = swipeRefreshRecyclerView;
        this.f4944i = c4851e;
        this.f4945j = textView;
        this.f4946k = textView2;
    }
}

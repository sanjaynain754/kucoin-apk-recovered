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
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.b */
/* JADX INFO: compiled from: BtransferFragmentIsolatedSearchBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4848b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4926a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f4927b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f4928c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ClearEditText f4929d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f4930e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4931f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f4932g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SwipeRefreshRecyclerView f4933h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f4934i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f4935j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4848b m4973a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.etSearch;
                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                if (clearEditText != null) {
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
                                if (swipeRefreshRecyclerView != null) {
                                    i11 = R$id.tvAccountAvailable;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView != null) {
                                        i11 = R$id.tvTitle;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView2 != null) {
                                            return new C4848b((LinearLayout) view, appBarLayout, coordinatorLayout, clearEditText, recyclerView, imageView, constraintLayout, swipeRefreshRecyclerView, textView, textView2);
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
        return this.f4926a;
    }

    public C4848b(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f4926a = linearLayout;
        this.f4927b = appBarLayout;
        this.f4928c = coordinatorLayout;
        this.f4929d = clearEditText;
        this.f4930e = recyclerView;
        this.f4931f = imageView;
        this.f4932g = constraintLayout;
        this.f4933h = swipeRefreshRecyclerView;
        this.f4934i = textView;
        this.f4935j = textView2;
    }
}

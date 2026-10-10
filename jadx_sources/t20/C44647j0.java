package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.spot.R$id;
import v30.C45413z;

/* JADX INFO: renamed from: t20.j0 */
/* JADX INFO: compiled from: KucoinFragmentDelegationHistoryBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44647j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99145a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f99146b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f99147c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f99148d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SwipeRefreshRecyclerView f99149e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C45413z f99150f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44647j0 m98770a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.ctx_current;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.flContentContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                i11 = R$id.m_swipe_recycler_view;
                SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                if (swipeRefreshRecyclerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.toolbar))) != null) {
                    return new C44647j0((LinearLayout) view, kuCheckBox, frameLayout, viewFindChildViewById, swipeRefreshRecyclerView, C45413z.m100363a(viewFindChildViewById2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99145a;
    }

    public C44647j0(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull C45413z c45413z) {
        this.f99145a = linearLayout;
        this.f99146b = kuCheckBox;
        this.f99147c = frameLayout;
        this.f99148d = view;
        this.f99149e = swipeRefreshRecyclerView;
        this.f99150f = c45413z;
    }
}

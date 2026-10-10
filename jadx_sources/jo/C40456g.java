package jo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: jo.g */
/* JADX INFO: compiled from: BloanFragmentLeverRecordBorrowBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40456g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89789a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwipeRefreshRecyclerView f89790b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f89791c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40456g m89101a(@NonNull View view) {
        int i11 = R$id.m_swipe_recycler_view;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
        if (swipeRefreshRecyclerView != null) {
            i11 = R$id.tv_repay;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C40456g((LinearLayout) view, swipeRefreshRecyclerView, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f89789a;
    }

    public C40456g(@NonNull LinearLayout linearLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f89789a = linearLayout;
        this.f89790b = swipeRefreshRecyclerView;
        this.f89791c = kcPrimaryButton;
    }
}

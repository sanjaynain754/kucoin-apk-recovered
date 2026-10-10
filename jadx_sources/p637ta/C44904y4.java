package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.WithdrawHeaderView;
import p385jy.C40821b;

/* JADX INFO: renamed from: ta.y4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawInternelBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44904y4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101189a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44814l5 f101190b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C40821b f101191c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final WithdrawHeaderView f101192d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C44782h5 f101193e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C44798j5 f101194f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f101195g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44904y4 m99332a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.view_content;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C44814l5 c44814l5M99149a = C44814l5.m99149a(viewFindChildViewById2);
            i11 = R$id.view_error;
            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById3 != null) {
                C40821b c40821bM89304a = C40821b.m89304a(viewFindChildViewById3);
                i11 = R$id.view_header;
                WithdrawHeaderView withdrawHeaderView = (WithdrawHeaderView) ViewBindings.findChildViewById(view, i11);
                if (withdrawHeaderView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_internel_bottom))) != null) {
                    C44782h5 c44782h5M99081a = C44782h5.m99081a(viewFindChildViewById);
                    i11 = R$id.view_internel_empty;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
                    if (viewFindChildViewById4 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new C44904y4(constraintLayout, c44814l5M99149a, c40821bM89304a, withdrawHeaderView, c44782h5M99081a, C44798j5.m99115a(viewFindChildViewById4), constraintLayout);
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
        return this.f101189a;
    }

    public C44904y4(@NonNull ConstraintLayout constraintLayout, @NonNull C44814l5 c44814l5, @NonNull C40821b c40821b, @NonNull WithdrawHeaderView withdrawHeaderView, @NonNull C44782h5 c44782h5, @NonNull C44798j5 c44798j5, @NonNull ConstraintLayout constraintLayout2) {
        this.f101189a = constraintLayout;
        this.f101190b = c44814l5;
        this.f101191c = c40821b;
        this.f101192d = withdrawHeaderView;
        this.f101193e = c44782h5;
        this.f101194f = c44798j5;
        this.f101195g = constraintLayout2;
    }
}

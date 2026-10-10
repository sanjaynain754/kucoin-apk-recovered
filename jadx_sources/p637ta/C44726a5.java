package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.WithdrawHeaderView;
import p385jy.C40821b;

/* JADX INFO: renamed from: ta.a5 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawOnchainNewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44726a5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99572a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44782h5 f99573b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44790i5 f99574c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44798j5 f99575d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C40821b f99576e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final WithdrawHeaderView f99577f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f99578g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44726a5 m98962a(@NonNull View view) {
        int i11 = R$id.view_bottom;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44782h5 c44782h5M99081a = C44782h5.m99081a(viewFindChildViewById);
            i11 = R$id.view_content;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C44790i5 c44790i5M99098a = C44790i5.m99098a(viewFindChildViewById2);
                i11 = R$id.view_empty;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                if (viewFindChildViewById3 != null) {
                    C44798j5 c44798j5M99115a = C44798j5.m99115a(viewFindChildViewById3);
                    i11 = R$id.view_error;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
                    if (viewFindChildViewById4 != null) {
                        C40821b c40821bM89304a = C40821b.m89304a(viewFindChildViewById4);
                        i11 = R$id.view_header;
                        WithdrawHeaderView withdrawHeaderView = (WithdrawHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (withdrawHeaderView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new C44726a5(constraintLayout, c44782h5M99081a, c44790i5M99098a, c44798j5M99115a, c40821bM89304a, withdrawHeaderView, constraintLayout);
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
        return this.f99572a;
    }

    public C44726a5(@NonNull ConstraintLayout constraintLayout, @NonNull C44782h5 c44782h5, @NonNull C44790i5 c44790i5, @NonNull C44798j5 c44798j5, @NonNull C40821b c40821b, @NonNull WithdrawHeaderView withdrawHeaderView, @NonNull ConstraintLayout constraintLayout2) {
        this.f99572a = constraintLayout;
        this.f99573b = c44782h5;
        this.f99574c = c44790i5;
        this.f99575d = c44798j5;
        this.f99576e = c40821b;
        this.f99577f = withdrawHeaderView;
        this.f99578g = constraintLayout2;
    }
}

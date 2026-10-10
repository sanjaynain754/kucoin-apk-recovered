package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.i1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyHistoryBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37633i1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84033a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f84034b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84035c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84036d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37633i1 m84848a(@NonNull View view) {
        int i11 = R$id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.tv_one_time_purchase;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_recurring;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C37633i1((ConstraintLayout) view, fragmentContainerView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84033a;
    }

    public C37633i1(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84033a = constraintLayout;
        this.f84034b = fragmentContainerView;
        this.f84035c = baseTextView;
        this.f84036d = baseTextView2;
    }
}

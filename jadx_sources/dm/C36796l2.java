package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.AlignTopTextView;

/* JADX INFO: renamed from: dm.l2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesTradeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36796l2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80479a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80480b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AlignTopTextView f80481c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FragmentContainerView f80482d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FragmentContainerView f80483e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36796l2 m82452a(@NonNull View view) {
        int i11 = R$id.cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.europeCompliance;
            AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
            if (alignTopTextView != null) {
                i11 = R$id.fragment_orderbook;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                if (fragmentContainerView != null) {
                    i11 = R$id.fragment_submit;
                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView2 != null) {
                        return new C36796l2((LinearLayoutCompat) view, constraintLayout, alignTopTextView, fragmentContainerView, fragmentContainerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36796l2 m82453c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_futures_trade, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82452a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f80479a;
    }

    public C36796l2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout, @NonNull AlignTopTextView alignTopTextView, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f80479a = linearLayoutCompat;
        this.f80480b = constraintLayout;
        this.f80481c = alignTopTextView;
        this.f80482d = fragmentContainerView;
        this.f80483e = fragmentContainerView2;
    }
}

package w30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.SpotKycLeadView;

/* JADX INFO: renamed from: w30.a */
/* JADX INFO: compiled from: KucoinFragmentRnTradeMainBinding.java */
/* JADX INFO: loaded from: classes50.dex */
public final class C45714a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f103055a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SpotKycLeadView f103056b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f103057c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45714a m100911a(@NonNull View view) {
        int i11 = R$id.kycLeadView;
        SpotKycLeadView spotKycLeadView = (SpotKycLeadView) ViewBindings.findChildViewById(view, i11);
        if (spotKycLeadView != null) {
            i11 = R$id.rnTradeMainContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                return new C45714a((ConstraintLayout) view, spotKycLeadView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f103055a;
    }

    public C45714a(@NonNull ConstraintLayout constraintLayout, @NonNull SpotKycLeadView spotKycLeadView, @NonNull FrameLayout frameLayout) {
        this.f103055a = constraintLayout;
        this.f103056b = spotKycLeadView;
        this.f103057c = frameLayout;
    }
}

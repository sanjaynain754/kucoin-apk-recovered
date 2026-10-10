package p701vs;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;

/* JADX INFO: renamed from: vs.g */
/* JADX INFO: compiled from: OperationHomecardMaincoinBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45630g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f102838a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f102839b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f102840c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final MaterialCardView f102841d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45630g m100745a(@NonNull View view) {
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i12 = R$id.maincoinCard;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i12);
            if (materialCardView != null) {
                return new C45630g(frameLayout, bGABanner, frameLayout, materialCardView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f102838a;
    }

    public C45630g(@NonNull FrameLayout frameLayout, @NonNull BGABanner bGABanner, @NonNull FrameLayout frameLayout2, @NonNull MaterialCardView materialCardView) {
        this.f102838a = frameLayout;
        this.f102839b = bGABanner;
        this.f102840c = frameLayout2;
        this.f102841d = materialCardView;
    }
}

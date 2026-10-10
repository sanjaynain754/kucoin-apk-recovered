package v30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.ComplianceNoticeView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.c */
/* JADX INFO: compiled from: BkcoinCoreSpotBannerLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45374c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f102029a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f102030b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ComplianceNoticeView f102031c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BGABanner f102032d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45374c m100278a(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.complianceNoticeView;
        ComplianceNoticeView complianceNoticeView = (ComplianceNoticeView) ViewBindings.findChildViewById(view, i11);
        if (complianceNoticeView != null) {
            i11 = R$id.spot_banner;
            BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
            if (bGABanner != null) {
                return new C45374c(frameLayout, frameLayout, complianceNoticeView, bGABanner);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f102029a;
    }

    public C45374c(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ComplianceNoticeView complianceNoticeView, @NonNull BGABanner bGABanner) {
        this.f102029a = frameLayout;
        this.f102030b = frameLayout2;
        this.f102031c = complianceNoticeView;
        this.f102032d = bGABanner;
    }
}

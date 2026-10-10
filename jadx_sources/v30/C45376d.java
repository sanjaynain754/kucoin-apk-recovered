package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.core.spot.view.SpotTradeComplianceInfoView;

/* JADX INFO: renamed from: v30.d */
/* JADX INFO: compiled from: BkcoinCoreSpotComplianceInfoLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45376d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final SpotTradeComplianceInfoView f102038a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SpotTradeComplianceInfoView f102039b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45376d m100282a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SpotTradeComplianceInfoView spotTradeComplianceInfoView = (SpotTradeComplianceInfoView) view;
        return new C45376d(spotTradeComplianceInfoView, spotTradeComplianceInfoView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SpotTradeComplianceInfoView getRoot() {
        return this.f102038a;
    }

    public C45376d(@NonNull SpotTradeComplianceInfoView spotTradeComplianceInfoView, @NonNull SpotTradeComplianceInfoView spotTradeComplianceInfoView2) {
        this.f102038a = spotTradeComplianceInfoView;
        this.f102039b = spotTradeComplianceInfoView2;
    }
}

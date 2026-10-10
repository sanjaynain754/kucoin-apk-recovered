package p205dn;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.vendor.jumio.p095ui.JumioLayoutConfirmScan;
import com.kubi.kyc.vendor.jumio.p095ui.JumioLayoutLoading;
import com.kubi.kyc.vendor.jumio.p095ui.JumioLayoutRejectScan;
import com.kubi.kyc.vendor.jumio.p095ui.JumioLayoutScanCard;
import com.kubi.kyc.vendor.jumio.p095ui.JumioNFCLayoutScan;

/* JADX INFO: renamed from: dn.a */
/* JADX INFO: compiled from: ActivityJumioKubiBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36881a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81418a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final JumioLayoutConfirmScan f81419b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final JumioLayoutLoading f81420c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final JumioNFCLayoutScan f81421d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final JumioLayoutRejectScan f81422e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final JumioLayoutScanCard f81423f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36881a m82631a(@NonNull View view) {
        int i11 = R$id.layoutConfirmScan;
        JumioLayoutConfirmScan jumioLayoutConfirmScan = (JumioLayoutConfirmScan) ViewBindings.findChildViewById(view, i11);
        if (jumioLayoutConfirmScan != null) {
            i11 = R$id.layoutLoading;
            JumioLayoutLoading jumioLayoutLoading = (JumioLayoutLoading) ViewBindings.findChildViewById(view, i11);
            if (jumioLayoutLoading != null) {
                i11 = R$id.layoutNfcScan;
                JumioNFCLayoutScan jumioNFCLayoutScan = (JumioNFCLayoutScan) ViewBindings.findChildViewById(view, i11);
                if (jumioNFCLayoutScan != null) {
                    i11 = R$id.layoutRejectScan;
                    JumioLayoutRejectScan jumioLayoutRejectScan = (JumioLayoutRejectScan) ViewBindings.findChildViewById(view, i11);
                    if (jumioLayoutRejectScan != null) {
                        i11 = R$id.layoutScanCard;
                        JumioLayoutScanCard jumioLayoutScanCard = (JumioLayoutScanCard) ViewBindings.findChildViewById(view, i11);
                        if (jumioLayoutScanCard != null) {
                            return new C36881a((FrameLayout) view, jumioLayoutConfirmScan, jumioLayoutLoading, jumioNFCLayoutScan, jumioLayoutRejectScan, jumioLayoutScanCard);
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
    public FrameLayout getRoot() {
        return this.f81418a;
    }

    public C36881a(@NonNull FrameLayout frameLayout, @NonNull JumioLayoutConfirmScan jumioLayoutConfirmScan, @NonNull JumioLayoutLoading jumioLayoutLoading, @NonNull JumioNFCLayoutScan jumioNFCLayoutScan, @NonNull JumioLayoutRejectScan jumioLayoutRejectScan, @NonNull JumioLayoutScanCard jumioLayoutScanCard) {
        this.f81418a = frameLayout;
        this.f81419b = jumioLayoutConfirmScan;
        this.f81420c = jumioLayoutLoading;
        this.f81421d = jumioNFCLayoutScan;
        this.f81422e = jumioLayoutRejectScan;
        this.f81423f = jumioLayoutScanCard;
    }
}

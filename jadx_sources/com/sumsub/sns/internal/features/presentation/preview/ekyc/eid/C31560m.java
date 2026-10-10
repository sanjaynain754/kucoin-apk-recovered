package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import androidx.fragment.app.FragmentActivity;
import com.sumsub.sns.internal.log.C33272c;
import de.authada.library.api.authentication.Authentication;
import de.authada.library.api.pinChanger.PinChanger;
import de.authada.library.api.unblock.Unblocker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31560m {

    /* JADX INFO: renamed from: a */
    public final WeakReference f64089a;

    /* JADX INFO: renamed from: b */
    public Authentication f64090b;

    /* JADX INFO: renamed from: c */
    public PinChanger f64091c;

    /* JADX INFO: renamed from: d */
    public Unblocker f64092d;

    /* JADX INFO: renamed from: a */
    public final void m70757a() {
        try {
            Authentication authentication = this.f64090b;
            if (authentication != null) {
                authentication.stop();
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("AuthadaWrapper", "Error closing auth", th2);
        }
        this.f64090b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m70758b() {
        try {
            PinChanger pinChanger = this.f64091c;
            if (pinChanger != null) {
                pinChanger.stop();
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("AuthadaWrapper", "Error closing pin changer", th2);
        }
        this.f64091c = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m70759c() {
        try {
            Unblocker unblocker = this.f64092d;
            if (unblocker != null) {
                unblocker.stop();
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("AuthadaWrapper", "Error closing pin unblock", th2);
        }
        this.f64092d = null;
    }

    public C31560m(FragmentActivity fragmentActivity) {
        this.f64089a = new WeakReference(fragmentActivity);
    }
}

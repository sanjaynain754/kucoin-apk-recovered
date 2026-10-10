package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.CountDownTimer;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.presentation.preview.selfie.AbstractC31959s;
import kotlinx.coroutines.C41696j;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class CountDownTimerC30761E extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30763G f62149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC30761E(C30763G c30763g) {
        super(3000L, 50L);
        this.f62149a = c30763g;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C30763G c30763g = this.f62149a;
        int i11 = C30763G.f62152V;
        AbstractC31959s.m70965a("Countdown is finished");
        AbstractC28073M0.updateState$default(c30763g, false, new C30788u(null), 1, null);
        CountDownTimer countDownTimer = c30763g.f62157e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c30763g.f62157e = null;
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30763g), null, null, new C30789v(c30763g, null), 3, null);
        c30763g.f62157e = new CountDownTimerC30790w(c30763g).start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
        this.f62149a.fireEvent(new C30781n(SNSVideoSelfieViewModel$State.Countdown, j11));
    }
}

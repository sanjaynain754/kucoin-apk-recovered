package com.sumsub.sns.internal.features.presentation.prooface;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.prooface.C29803F;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.network.prooface.C29888c;
import com.sumsub.sns.internal.features.data.network.prooface.C29889d;
import com.sumsub.sns.internal.features.data.network.prooface.C29890e;
import com.sumsub.sns.internal.features.data.network.prooface.C29891f;
import com.sumsub.sns.internal.features.data.network.prooface.C29892g;
import com.sumsub.sns.internal.features.data.network.prooface.C29893h;
import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import com.sumsub.sns.internal.features.data.network.prooface.C29895j;
import com.sumsub.sns.internal.features.data.network.prooface.InterfaceC29887b;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32065b0 implements InterfaceC29887b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32109k0 f65239a;

    public C32065b0(C32109k0 c32109k0) {
        this.f65239a = c32109k0;
    }

    @Override // com.sumsub.sns.internal.features.data.network.prooface.InterfaceC29887b
    /* JADX INFO: renamed from: a */
    public final void mo69942a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult) {
        C29818c c29818c;
        String str;
        Integer num;
        AbstractC32267d.m71078a("repository callback " + liveness3dFaceRepository$LivenessRepositoryResult);
        C32109k0 c32109k0 = this.f65239a;
        Timer timer = c32109k0.f65367l;
        if (timer != null) {
            timer.cancel();
        }
        c32109k0.f65367l = null;
        Timer timer2 = c32109k0.f65366k;
        if (timer2 != null) {
            timer2.cancel();
        }
        c32109k0.f65366k = null;
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29893h) {
            C32109k0 c32109k1 = this.f65239a;
            C29893h c29893h = (C29893h) liveness3dFaceRepository$LivenessRepositoryResult;
            C29810M c29810m = c29893h.f59994a;
            c32109k1.f65381z = (c29810m == null || (num = c29810m.f59886c) == null) ? 0 : num.intValue();
            C32109k0 c32109k2 = this.f65239a;
            c32109k2.f65345B = 0L;
            C29810M c29810m2 = c29893h.f59994a;
            if (c29810m2 != null && (str = c29810m2.f59885b) != null) {
                try {
                    c32109k2.f65359d.m69940a(str);
                    c32109k2.f65347D = str;
                } catch (Exception e11) {
                    c32109k2.m71043a(e11);
                }
            }
            C29810M c29810m3 = c29893h.f59994a;
            boolean zAreEqual = c29810m3 != null ? Intrinsics.areEqual(c29810m3.f59889f, Boolean.TRUE) : false;
            boolean z11 = !zAreEqual;
            C32109k0 c32109k3 = this.f65239a;
            if (zAreEqual) {
                c32109k3.showProgress(false);
                C29818c.Companion.getClass();
                c29818c = C29818c.f59895e;
            } else {
                c29818c = new C29818c(null, new ArrayList(), 4);
            }
            c32109k3.f65372q = c29818c;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this.f65239a), null, null, new C32050X(this.f65239a, z11, null), 3, null);
            return;
        }
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29891f) {
            C29810M c29810m4 = ((C29891f) liveness3dFaceRepository$LivenessRepositoryResult).f59992a;
            if (Intrinsics.areEqual(c29810m4 != null ? c29810m4.f59887d : null, AnswerType.Yellow.getValue())) {
                C32109k0 c32109k4 = this.f65239a;
                c32109k4.f65344A = 0;
                C41696j.m91104d(ViewModelKt.getViewModelScope(c32109k4), null, null, new C32053Y(this.f65239a, null), 3, null);
                return;
            }
            return;
        }
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29889d) {
            C32109k0 c32109k5 = this.f65239a;
            c32109k5.f65381z = 0;
            c32109k5.showProgress(false);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this.f65239a), null, null, new C32056Z(this.f65239a, null), 3, null);
            return;
        }
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29894i) {
            C32109k0 c32109k6 = this.f65239a;
            c32109k6.f65381z = 0;
            c32109k6.showProgress(false);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this.f65239a), null, null, new C32060a0(this.f65239a, liveness3dFaceRepository$LivenessRepositoryResult, null), 3, null);
            AbstractC32267d.m71078a("Liveness session terminated. Stopping session.");
            this.f65239a.m71046f();
            return;
        }
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29895j) {
            return;
        }
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29890e) {
            this.f65239a.f65381z = 0;
            SNSException.Network network = new SNSException.Network((Exception) ((C29890e) liveness3dFaceRepository$LivenessRepositoryResult).f59991a);
            this.f65239a.m71042a(new C29803F(network), (String) null);
            this.f65239a.m71043a(network);
            return;
        }
        if (Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29888c.f59989a)) {
            C32109k0 c32109k7 = this.f65239a;
            c32109k7.f65381z = 0;
            c32109k7.m71042a(new C29803F(new IOException()), (String) null);
        } else {
            if (!Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29892g.f59993a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f65239a.f65381z = 0;
        }
    }
}

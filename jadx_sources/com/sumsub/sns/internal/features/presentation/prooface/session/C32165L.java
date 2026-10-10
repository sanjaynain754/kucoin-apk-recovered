package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.network.prooface.C29888c;
import com.sumsub.sns.internal.features.data.network.prooface.C29889d;
import com.sumsub.sns.internal.features.data.network.prooface.C29890e;
import com.sumsub.sns.internal.features.data.network.prooface.C29891f;
import com.sumsub.sns.internal.features.data.network.prooface.C29892g;
import com.sumsub.sns.internal.features.data.network.prooface.C29893h;
import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import com.sumsub.sns.internal.features.data.network.prooface.C29895j;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32165L extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public C32165L(C32169N c32169n) {
        super(2, c32169n, C32169N.class, "handleLivenessRepositoryMessageInternal", "handleLivenessRepositoryMessageInternal(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V", 4);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnswerType answerType;
        String str;
        Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult = (Liveness3dFaceRepository$LivenessRepositoryResult) obj;
        C32169N c32169n = (C32169N) this.receiver;
        C32202c1 c32202c1 = c32169n.f65499d;
        C41696j.m91104d(c32202c1.f65578a, null, null, new C32172O0(c32202c1, null), 3, null);
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29891f) {
            C29810M c29810m = ((C29891f) liveness3dFaceRepository$LivenessRepositoryResult).f59992a;
            if (c29810m == null || (str = c29810m.f59887d) == null) {
                answerType = null;
            } else {
                AnswerType.Companion.getClass();
                AnswerType[] answerTypeArrValues = AnswerType.values();
                int length = answerTypeArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        answerType = null;
                        break;
                    }
                    answerType = answerTypeArrValues[i11];
                    if (Intrinsics.areEqual(answerType.getValue(), str)) {
                        break;
                    }
                    i11++;
                }
                if (answerType == null) {
                    answerType = AnswerType.Error;
                }
            }
            if (answerType != null) {
                C41696j.m91104d(c32169n.f65496a, null, null, new C32157H(c32169n, answerType, null), 3, null);
            }
        } else if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29889d) {
            C41696j.m91104d(c32169n.f65496a, null, null, new C32159I(c32169n, null), 3, null);
        } else if (!(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29893h) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29894i) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29895j) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29890e) && !Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29888c.f59989a) && !Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29892g.f59993a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

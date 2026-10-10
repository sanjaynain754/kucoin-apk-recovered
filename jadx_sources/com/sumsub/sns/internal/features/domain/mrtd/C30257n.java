package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.nfc.api.SNSKinegramNfcDocumentReader;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30257n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30261r f60832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function1 f60833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30257n(C30261r c30261r, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f60832b = c30261r;
        this.f60833c = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30257n c30257n = new C30257n(this.f60832b, this.f60833c, continuation);
        c30257n.f60831a = obj;
        return c30257n;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30257n) create((SNSKinegramNfcDocumentReader.State) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SNSKinegramNfcDocumentReader.Status status = (SNSKinegramNfcDocumentReader.State) this.f60831a;
        if (status instanceof SNSKinegramNfcDocumentReader.Status) {
            SNSKinegramNfcDocumentReader.Status status2 = status;
            this.f60832b.getClass();
            if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusConnectingToServer.INSTANCE)) {
                num = 8;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadAtrInfo.INSTANCE)) {
                num = 16;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusAccessControl.INSTANCE)) {
                num = 24;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadSod.INSTANCE)) {
                num = 32;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg14.INSTANCE)) {
                num = 40;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusChipAuthentication.INSTANCE)) {
                num = 48;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg1.INSTANCE)) {
                num = 56;
            } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg2.INSTANCE)) {
                num = 64;
            } else if (!Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg7.INSTANCE) && !Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg11.INSTANCE) && !Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg12.INSTANCE) && !Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusReadDg15.INSTANCE)) {
                if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusPassiveAuthentication.INSTANCE)) {
                    num = 84;
                } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusActiveAuthentication.INSTANCE)) {
                    num = 92;
                } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusDone.INSTANCE)) {
                    num = 100;
                } else if (Intrinsics.areEqual(status2, SNSKinegramNfcDocumentReader.StatusUnknown.INSTANCE)) {
                    num = null;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                num = 72;
            }
            if (num != null) {
                this.f60833c.invoke(Boxing.boxInt(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }
}

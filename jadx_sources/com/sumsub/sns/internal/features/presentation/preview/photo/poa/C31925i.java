package com.sumsub.sns.internal.features.presentation.preview.photo.poa;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30073G;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.documents.C30149t;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32638P;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.poa.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31925i extends AbstractC31770c0 {

    /* JADX INFO: renamed from: m */
    public final C30073G f64902m;

    /* JADX INFO: renamed from: n */
    public boolean f64903n;

    public C31925i(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C28547d c28547d, C30156e c30156e, C32635M c32635m, C30237b c30237b, C30073G c30073g, C30149t c30149t) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c28547d, c32635m, c30149t, c30156e, c30237b);
        this.f64902m = c30073g;
        this.f64903n = true;
        Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSProofOfAddressOld", "Proof of Address document is created", null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (super.mo70740a(r6, r7, r0) == r1) goto L29;
     */
    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0, com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        C31923g c31923g;
        Object objM70100a;
        Boolean bool;
        if (continuation instanceof C31923g) {
            c31923g = (C31923g) continuation;
            int i11 = c31923g.f64898e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31923g.f64898e = i11 - Integer.MIN_VALUE;
            } else {
                c31923g = new C31923g(this, (ContinuationImpl) continuation);
            }
        } else {
            c31923g = new C31923g(this, (ContinuationImpl) continuation);
        }
        Object obj = c31923g.f64896c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31923g.f64898e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30073G c30073g = this.f64902m;
            c31923g.f64894a = abstractC29172p;
            c31923g.f64895b = c29124h;
            c31923g.f64898e = 1;
            objM70100a = c30073g.m70100a(c31923g);
            if (objM70100a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29124h = c31923g.f64895b;
            abstractC29172p = c31923g.f64894a;
            ResultKt.throwOnFailure(obj);
            objM70100a = ((Result) obj).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (Result.m103850isFailureimpl(objM70100a)) {
            objM70100a = null;
        }
        C29046Q2 c29046q2 = (C29046Q2) objM70100a;
        if (c29046q2 != null && (bool = c29046q2.f58984c) != null) {
            this.f64903n = bool.booleanValue();
        }
        c31923g.f64894a = null;
        c31923g.f64895b = null;
        c31923g.f64898e = 2;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: g */
    public final Unit mo70870g() {
        if (this.f64903n) {
            fireEvent(C32638P.f66633a);
        } else {
            m70869f();
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return this.f64476a.getType().f59014a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (m70861a((p852kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L21;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C31924h c31924h;
        if (continuation instanceof C31924h) {
            c31924h = (C31924h) continuation;
            int i11 = c31924h.f64901c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31924h.f64901c = i11 - Integer.MIN_VALUE;
            } else {
                c31924h = new C31924h(this, (ContinuationImpl) continuation);
            }
        } else {
            c31924h = new C31924h(this, (ContinuationImpl) continuation);
        }
        Object obj = c31924h.f64899a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31924h.f64901c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31924h.f64901c = 1;
            if (AbstractC31770c0.m70856a(this, c31924h) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        c31924h.f64901c = 2;
    }
}

package com.sumsub.sns.internal.log.logger;

import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.log.cacher.C33278f;
import com.sumsub.sns.internal.log.cacher.InterfaceC33273a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33301g implements InterfaceC33273a {

    /* JADX INFO: renamed from: a */
    public final C30002b f67889a;

    /* JADX INFO: renamed from: b */
    public final AbstractC46162a f67890b = AbstractC28400J.m69286a(C28468k0.f57988f);

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68970a(Object obj, ByteArrayOutputStream byteArrayOutputStream, C33278f c33278f) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C33297c(byteArrayOutputStream, this, (LogParams) obj, null), c33278f);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33275c
    public final Object send(Object obj, Continuation continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new C33300f(this, (LogParams) obj, null), (ContinuationImpl) continuation);
    }

    public C33301g(C30002b c30002b) {
        this.f67889a = c30002b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r8 == r1) goto L23;
     */
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo68969a(ByteArrayInputStream byteArrayInputStream, Continuation continuation) {
        C33298d c33298d;
        boolean zBooleanValue;
        if (continuation instanceof C33298d) {
            c33298d = (C33298d) continuation;
            int i11 = c33298d.f67881c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33298d.f67881c = i11 - Integer.MIN_VALUE;
            } else {
                c33298d = new C33298d(this, (ContinuationImpl) continuation);
            }
        } else {
            c33298d = new C33298d(this, (ContinuationImpl) continuation);
        }
        Object objM91049g = c33298d.f67879a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33298d.f67881c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            c33298d.f67881c = 1;
            objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C33299e(byteArrayInputStream, this, null), c33298d);
            if (objM91049g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM91049g);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        zBooleanValue = ((Boolean) objM91049g).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
        LogParams logParams = (LogParams) objM91049g;
        if (logParams != null) {
            c33298d.f67881c = 2;
            objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C33300f(this, logParams, null), c33298d);
        } else {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}

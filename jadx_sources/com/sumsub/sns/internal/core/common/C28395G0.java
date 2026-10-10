package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.data.model.common.LogParams;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.CloseableKt;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28395G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteArrayOutputStream f57882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28403K0 f57883b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LogParams f57884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28395G0(ByteArrayOutputStream byteArrayOutputStream, C28403K0 c28403k0, LogParams logParams, Continuation continuation) {
        super(2, continuation);
        this.f57882a = byteArrayOutputStream;
        this.f57883b = c28403k0;
        this.f57884c = logParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28395G0(this.f57882a, this.f57883b, this.f57884c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28395G0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f57882a);
        C28403K0 c28403k0 = this.f57883b;
        LogParams logParams = this.f57884c;
        try {
            AbstractC46162a abstractC46162a = c28403k0.f57900e;
            abstractC46162a.getSerializersModule();
            outputStreamWriter.write(abstractC46162a.mo99409b(LogParams.Companion.serializer(), logParams));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, null);
            return unit;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(outputStreamWriter, th2);
                throw th3;
            }
        }
    }
}

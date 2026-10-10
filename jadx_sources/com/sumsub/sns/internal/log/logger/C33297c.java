package com.sumsub.sns.internal.log.logger;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33297c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteArrayOutputStream f67876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33301g f67877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LogParams f67878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33297c(ByteArrayOutputStream byteArrayOutputStream, C33301g c33301g, LogParams logParams, Continuation continuation) {
        super(2, continuation);
        this.f67876a = byteArrayOutputStream;
        this.f67877b = c33301g;
        this.f67878c = logParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C33297c(this.f67876a, this.f67877b, this.f67878c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C33297c) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f67876a);
        C33301g c33301g = this.f67877b;
        LogParams logParams = this.f67878c;
        try {
            AbstractC46162a abstractC46162a = c33301g.f67890b;
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

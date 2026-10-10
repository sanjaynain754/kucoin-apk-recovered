package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.TextStreamsKt;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28399I0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InputStream f57889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28403K0 f57890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28399I0(InputStream inputStream, C28403K0 c28403k0, Continuation continuation) {
        super(2, continuation);
        this.f57889b = inputStream;
        this.f57890c = c28403k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28399I0 c28399i0 = new C28399I0(this.f57889b, this.f57890c, continuation);
        c28399i0.f57888a = obj;
        return c28399i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28399I0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LogParams logParams;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f57888a;
        InputStreamReader inputStreamReader = new InputStreamReader(this.f57889b);
        try {
            try {
                AbstractC46162a abstractC46162a = this.f57890c.f57900e;
                String text = TextStreamsKt.readText(inputStreamReader);
                abstractC46162a.getSerializersModule();
                logParams = (LogParams) abstractC46162a.mo99408a(LogParams.Companion.serializer(), text);
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(interfaceC41709m0), "Can't restore params", e11);
                logParams = null;
            }
            CloseableKt.closeFinally(inputStreamReader, null);
            return logParams;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStreamReader, th2);
                throw th3;
            }
        }
    }
}

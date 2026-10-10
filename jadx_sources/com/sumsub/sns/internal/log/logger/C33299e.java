package com.sumsub.sns.internal.log.logger;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33299e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InputStream f67883b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33301g f67884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33299e(InputStream inputStream, C33301g c33301g, Continuation continuation) {
        super(2, continuation);
        this.f67883b = inputStream;
        this.f67884c = c33301g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C33299e c33299e = new C33299e(this.f67883b, this.f67884c, continuation);
        c33299e.f67882a = obj;
        return c33299e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C33299e) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LogParams logParams;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f67882a;
        InputStreamReader inputStreamReader = new InputStreamReader(this.f67883b);
        try {
            try {
                AbstractC46162a abstractC46162a = this.f67884c.f67890b;
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

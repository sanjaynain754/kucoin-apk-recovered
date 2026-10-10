package com.sumsub.sns.internal.core.analytics;

import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28464j;
import com.sumsub.sns.internal.core.common.SNSSession;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.serialization.internal.C41813f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28375n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28378q f57854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f57855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteArrayOutputStream f57856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28375n(C28378q c28378q, List list, ByteArrayOutputStream byteArrayOutputStream, Continuation continuation) {
        super(2, continuation);
        this.f57854a = c28378q;
        this.f57855b = list;
        this.f57856c = byteArrayOutputStream;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28375n(this.f57854a, this.f57855b, this.f57856c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28375n) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC46162a abstractC46162a = this.f57854a.f57865b;
        List list = this.f57855b;
        abstractC46162a.getSerializersModule();
        String strMo99409b = abstractC46162a.mo99409b(new C41813f(SNSTrackEvents.INSTANCE.serializer()), list);
        if (AbstractC28413P0.f57921a) {
            SNSSession sNSSession = AbstractC28413P0.f57923c;
            if (sNSSession == null) {
                sNSSession = null;
            }
            String sessionId = sNSSession.getSessionId();
            byte[] bArrM69272a = C28378q.m69272a();
            if (bArrM69272a == null) {
                return Unit.INSTANCE;
            }
            C28374m c28374m = new C28374m(sessionId, AbstractC28464j.m69367a(strMo99409b.getBytes(Charsets.UTF_8), bArrM69272a));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f57856c);
            try {
                AbstractC46162a abstractC46162a2 = this.f57854a.f57865b;
                abstractC46162a2.getSerializersModule();
                outputStreamWriter.write(abstractC46162a2.mo99409b(C28374m.Companion.serializer(), c28374m));
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
        throw new IllegalArgumentException("Failed requirement.");
    }
}

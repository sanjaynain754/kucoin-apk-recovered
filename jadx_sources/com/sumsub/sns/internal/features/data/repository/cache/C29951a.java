package com.sumsub.sns.internal.features.data.repository.cache;

import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.cache.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29951a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29952b f60145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f60146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29951a(C29952b c29952b, String str, Continuation continuation) {
        super(2, continuation);
        this.f60145b = c29952b;
        this.f60146c = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C29951a c29951a = new C29951a(this.f60145b, this.f60146c, continuation);
        c29951a.f60144a = obj;
        return c29951a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C29951a) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f60144a;
        File file = new File(this.f60145b.f60147a.getCacheDir(), this.f60146c);
        try {
            file.createNewFile();
            return file;
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(interfaceC41709m0);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, e11);
            return file;
        }
    }
}

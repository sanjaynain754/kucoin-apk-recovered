package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.domain.utils.C30316a;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30802A extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30808G f62227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f62228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f62229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30802A(AbstractC30808G abstractC30808G, File file, int i11, Continuation continuation) {
        super(2, continuation);
        this.f62227a = abstractC30808G;
        this.f62228b = file;
        this.f62229c = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30802A(this.f62227a, this.f62228b, this.f62229c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30802A) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30316a.m70183b(this.f62227a.f62237b, "SNSImageDocumentsAwareViewModel", "imageRotationChanged, " + this.f62228b + ", " + this.f62229c);
        this.f62227a.f62236a.m71238a(this.f62229c, this.f62228b);
        this.f62227a.mo70461a(this.f62229c, this.f62228b);
        return Unit.INSTANCE;
    }
}

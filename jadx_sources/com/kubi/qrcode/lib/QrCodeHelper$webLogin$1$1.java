package com.kubi.qrcode.lib;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.router.protocol.KCRouterBridgeSafeCenterScanTokenEntity;
import f00.C37304a;
import g00.InterfaceC37759k;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: QrCodeHelper.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.qrcode.lib.QrCodeHelper$webLogin$1$1", m90122f = "QrCodeHelper.kt", m90123i = {}, m90124l = {62}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QrCodeHelper$webLogin$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $token;
    int label;

    /* JADX INFO: renamed from: com.kubi.qrcode.lib.QrCodeHelper$webLogin$1$1$1 */
    /* JADX INFO: compiled from: QrCodeHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/sdk/protocol/router/protocol/KCRouterBridgeSafeCenterScanTokenEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.qrcode.lib.QrCodeHelper$webLogin$1$1$1", m90122f = "QrCodeHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C215401 extends SuspendLambda implements Function2<KCRouterBridgeSafeCenterScanTokenEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(KCRouterBridgeSafeCenterScanTokenEntity kCRouterBridgeSafeCenterScanTokenEntity, Continuation<? super Unit> continuation) {
            return ((C215401) create(kCRouterBridgeSafeCenterScanTokenEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C215401(String str, Continuation<? super C215401> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215401 c215401 = new C215401(this.$token, continuation);
            c215401.L$0 = obj;
            return c215401;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRouterBridgeSafeCenterScanTokenEntity kCRouterBridgeSafeCenterScanTokenEntity = (KCRouterBridgeSafeCenterScanTokenEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC37759k.a.m85167a(C37304a.f82764a, this.$token, kCRouterBridgeSafeCenterScanTokenEntity, null, null, null, 28, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeHelper$webLogin$1$1(String str, Continuation<? super QrCodeHelper$webLogin$1$1> continuation) {
        super(2, continuation);
        this.$token = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QrCodeHelper$webLogin$1$1(this.$token, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QrCodeHelper$webLogin$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<KCRouterBridgeSafeCenterScanTokenEntity> interfaceC41634eM50100a = ((QrCodeApi) RetrofitFlowExKt.m42820a(QrCodeApi.class)).m50100a(this.$token);
            C215401 c215401 = new C215401(this.$token, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM50100a, false, c215401, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

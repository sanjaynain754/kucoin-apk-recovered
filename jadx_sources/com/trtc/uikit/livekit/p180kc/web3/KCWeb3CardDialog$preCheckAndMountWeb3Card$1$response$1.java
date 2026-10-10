package com.trtc.uikit.livekit.p180kc.web3;

import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.PrecheckCard;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCWeb3CardDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.web3.KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1", m90122f = "KCWeb3CardDialog.kt", m90123i = {}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super PrecheckCard.ResponseEntity>, Object> {
    int label;
    final /* synthetic */ KCWeb3CardDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1(KCWeb3CardDialog kCWeb3CardDialog, Continuation<? super KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1> continuation) {
        super(2, continuation);
        this.this$0 = kCWeb3CardDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super PrecheckCard.ResponseEntity> continuation) {
        return ((KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
        PrecheckCard.Request request = new PrecheckCard.Request(this.this$0.f79196r0, SearchCategory$Companion.WEB3);
        this.label = 1;
        Object objM92621i = interfaceC42178aM89024b.m92621i(request, this);
        if (objM92621i == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM92621i;
    }
}

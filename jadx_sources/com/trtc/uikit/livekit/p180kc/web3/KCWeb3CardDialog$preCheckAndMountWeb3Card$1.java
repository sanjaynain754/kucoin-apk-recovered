package com.trtc.uikit.livekit.p180kc.web3;

import com.kubi.utils.extensions.C27025c;
import com.trtc.uikit.livekit.p180kc.data.entity.PrecheckCard;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import ne0.C42817b;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCWeb3CardDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.web3.KCWeb3CardDialog$preCheckAndMountWeb3Card$1", m90122f = "KCWeb3CardDialog.kt", m90123i = {}, m90124l = {100}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCWeb3CardDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCWeb3CardDialog.kt\ncom/trtc/uikit/livekit/kc/web3/KCWeb3CardDialog$preCheckAndMountWeb3Card$1\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,239:1\n43#2,4:240\n*S KotlinDebug\n*F\n+ 1 KCWeb3CardDialog.kt\ncom/trtc/uikit/livekit/kc/web3/KCWeb3CardDialog$preCheckAndMountWeb3Card$1\n*L\n126#1:240,4\n*E\n"})
public final class KCWeb3CardDialog$preCheckAndMountWeb3Card$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KCWeb3CardDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCWeb3CardDialog$preCheckAndMountWeb3Card$1(KCWeb3CardDialog kCWeb3CardDialog, Continuation<? super KCWeb3CardDialog$preCheckAndMountWeb3Card$1> continuation) {
        super(2, continuation);
        this.this$0 = kCWeb3CardDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCWeb3CardDialog$preCheckAndMountWeb3Card$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCWeb3CardDialog$preCheckAndMountWeb3Card$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.this$0.m81602E4(false);
                AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
                KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1 kCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1 = new KCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1(this.this$0, null);
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M91392b, kCWeb3CardDialog$preCheckAndMountWeb3Card$1$response$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PrecheckCard.ResponseEntity responseEntity = (PrecheckCard.ResponseEntity) obj;
            if (!C27025c.m66566d(responseEntity.isTips())) {
                this.this$0.m81601C4(true, false);
            } else {
                String tips = responseEntity.getTips();
                if (tips == null) {
                    tips = "";
                }
                if (!StringsKt.isBlank(tips)) {
                    this.this$0.m81603F4(tips);
                } else {
                    C44128b.m97261e("Live", "KCWeb3CardDialog: preCheck web3 card not passed but tips is blank");
                    this.this$0.m81600B4();
                }
            }
        } catch (Exception e11) {
            C44128b.m97261e("Live", "KCWeb3CardDialog: preCheck web3 card failed - " + e11.getMessage());
            if (!C42899b.m94075e(e11)) {
                C42817b.m93883b(e11, "KCWeb3CardDialog#preCheckAndMountWeb3Card");
            }
            this.this$0.m81600B4();
        }
        return Unit.INSTANCE;
    }
}

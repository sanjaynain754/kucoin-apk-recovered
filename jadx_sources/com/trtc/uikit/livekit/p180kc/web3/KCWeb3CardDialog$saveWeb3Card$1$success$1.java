package com.trtc.uikit.livekit.p180kc.web3;

import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.SaveLiveCard;
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
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.web3.KCWeb3CardDialog$saveWeb3Card$1$success$1", m90122f = "KCWeb3CardDialog.kt", m90123i = {}, m90124l = {152}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCWeb3CardDialog$saveWeb3Card$1$success$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $mount;
    int label;
    final /* synthetic */ KCWeb3CardDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCWeb3CardDialog$saveWeb3Card$1$success$1(KCWeb3CardDialog kCWeb3CardDialog, boolean z11, Continuation<? super KCWeb3CardDialog$saveWeb3Card$1$success$1> continuation) {
        super(2, continuation);
        this.this$0 = kCWeb3CardDialog;
        this.$mount = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCWeb3CardDialog$saveWeb3Card$1$success$1(this.this$0, this.$mount, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((KCWeb3CardDialog$saveWeb3Card$1$success$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
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
        String str2 = this.this$0.f79196r0;
        boolean z11 = this.$mount;
        String str3 = null;
        if (z11) {
            str = "web3-entry";
        } else {
            str = null;
        }
        if (!z11) {
            str3 = "web3-entry";
        }
        SaveLiveCard.Request request = new SaveLiveCard.Request(str2, SearchCategory$Companion.WEB3, str, str3);
        this.label = 1;
        Object objM92623k = interfaceC42178aM89024b.m92623k(request, this);
        if (objM92623k == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM92623k;
    }
}

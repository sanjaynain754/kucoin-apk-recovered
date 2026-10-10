package com.kubi.user.thirdaccount.telegram;

import com.kubi.otc.entity.OtcAd;
import com.kubi.user.track.LoginV3TrackDesc;
import kotlinx.coroutines.InterfaceC41709m0;
import l70.C42124h;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.thirdaccount.telegram.TelegramAuthActivity$HybridJsInterface$prompt$2", m90122f = "TelegramAuthActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TelegramAuthActivity$HybridJsInterface$prompt$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TelegramAuthActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelegramAuthActivity$HybridJsInterface$prompt$2(TelegramAuthActivity telegramAuthActivity, Continuation<? super TelegramAuthActivity$HybridJsInterface$prompt$2> continuation) {
        super(2, continuation);
        this.this$0 = telegramAuthActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TelegramAuthActivity$HybridJsInterface$prompt$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TelegramAuthActivity$HybridJsInterface$prompt$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C42124h.m92414h(C42124h.f93552a, LoginV3TrackDesc.THIRD_ACCOUNT_AUTH, false, OtcAd.KYC_NOT_PASS, "third account auth cancel", null, 16, null);
        TelegramAuthActivity.m65800d0(this.this$0, 1, null, null, true, 6, null);
        return Unit.INSTANCE;
    }
}

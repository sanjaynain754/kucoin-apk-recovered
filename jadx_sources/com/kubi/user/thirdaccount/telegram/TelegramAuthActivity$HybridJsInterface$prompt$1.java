package com.kubi.user.thirdaccount.telegram;

import com.kubi.user.track.LoginV3TrackDesc;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import l70.C42124h;
import o00.C42911a;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.thirdaccount.telegram.TelegramAuthActivity$HybridJsInterface$prompt$1", m90122f = "TelegramAuthActivity.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {662}, m90125m = "invokeSuspend", m90126n = {"it", "this_$iv", "json$iv", "$completion$iv", "$i$a$-let-TelegramAuthActivity$HybridJsInterface$prompt$1$info$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nTelegramAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$HybridJsInterface$prompt$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,658:1\n1#2:659\n196#3,3:660\n*S KotlinDebug\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$HybridJsInterface$prompt$1\n*L\n357#1:660,3\n*E\n"})
public final class TelegramAuthActivity$HybridJsInterface$prompt$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ JSONObject $params;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TelegramAuthActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelegramAuthActivity$HybridJsInterface$prompt$1(JSONObject jSONObject, TelegramAuthActivity telegramAuthActivity, Continuation<? super TelegramAuthActivity$HybridJsInterface$prompt$1> continuation) {
        super(2, continuation);
        this.$params = jSONObject;
        this.this$0 = telegramAuthActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TelegramAuthActivity$HybridJsInterface$prompt$1(this.$params, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TelegramAuthActivity$HybridJsInterface$prompt$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM90914f0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                String strOptString = this.$params.optString("info");
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.checkNotNull(strOptString);
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26812xd0e9a8ac(strOptString, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(strOptString);
                this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$2 = SpillingKt.nullOutSpilledVariable(strOptString);
                this.L$3 = SpillingKt.nullOutSpilledVariable(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM90914f0 = obj;
            }
            TelegramAuthActivity.ResultData resultData = (TelegramAuthActivity.ResultData) objM90914f0;
            if (resultData == null) {
                C42124h.m92414h(C42124h.f93552a, LoginV3TrackDesc.THIRD_ACCOUNT_AUTH, false, "-120012", "third account auth failed", null, 16, null);
                TelegramAuthActivity.m65800d0(this.this$0, 10, null, "result is null", false, 10, null);
            } else {
                C43840a.m96551e("tgAuth code:" + resultData.getCode() + ",error:" + resultData.getError() + ",msg:" + resultData.getMsg(), null, 2, null);
                TelegramAuthActivity telegramAuthActivity = this.this$0;
                Integer code = resultData.getCode();
                TelegramAuthActivity.m65800d0(telegramAuthActivity, code != null ? code.intValue() : 10, resultData.getData(), resultData.getError(), false, 8, null);
            }
        } catch (Exception e11) {
            TelegramAuthActivity.m65800d0(this.this$0, 10, null, "parse result error", false, 10, null);
            C44128b.m97261e("TelegramAuthActivity", "tgAuth exception: " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}

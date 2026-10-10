package com.kubi.kyc.ui.kycv2;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.kubi.kyc.R$string;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.ui.KycSeniorFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
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

/* JADX INFO: compiled from: KycBridgeManager.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.KycBridgeManager$launchManual$2", m90122f = "KycBridgeManager.kt", m90123i = {0, 0, 0}, m90124l = {472}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKycBridgeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycBridgeManager.kt\ncom/kubi/kyc/ui/kycv2/KycBridgeManager$launchManual$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,469:1\n196#2,3:470\n*S KotlinDebug\n*F\n+ 1 KycBridgeManager.kt\ncom/kubi/kyc/ui/kycv2/KycBridgeManager$launchManual$2\n*L\n294#1:470,3\n*E\n"})
public final class KycBridgeManager$launchManual$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ String $kycInfoJson;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycBridgeManager$launchManual$2(String str, FragmentActivity fragmentActivity, Continuation<? super KycBridgeManager$launchManual$2> continuation) {
        super(2, continuation);
        this.$kycInfoJson = str;
        this.$context = fragmentActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycBridgeManager$launchManual$2(this.$kycInfoJson, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KycBridgeManager$launchManual$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C27099x c27099x = C27099x.f54458a;
            String str = this.$kycInfoJson;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C17184x387cf9e(str, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Intent intentPutExtra = new Intent(this.$context, (Class<?>) BaseFragmentActivity.class).putExtra("data", (KycInfoEntity) obj).putExtra("type", 0).putExtra("title", this.$context.getString(R$string.kyc_advanced_title)).putExtra("fragment", KycSeniorFragment.class.getName());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        this.$context.startActivity(intentPutExtra);
        return Unit.INSTANCE;
    }
}

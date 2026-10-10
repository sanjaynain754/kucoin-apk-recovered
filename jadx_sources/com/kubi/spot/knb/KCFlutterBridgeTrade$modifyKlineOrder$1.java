package com.kubi.spot.knb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.entity.DelegationEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeTrade.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.knb.KCFlutterBridgeTrade$modifyKlineOrder$1", m90122f = "KCFlutterBridgeTrade.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeTrade$modifyKlineOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $orderInfo;
    final /* synthetic */ String $targetPrice;
    int label;
    final /* synthetic */ KCFlutterBridgeTrade this$0;

    /* JADX INFO: renamed from: f */
    public static final Unit m62157f(KCFlutterBridgeTrade kCFlutterBridgeTrade, DelegationEntity delegationEntity, String str, String str2, Function2 function2, FragmentActivity fragmentActivity) {
        kCFlutterBridgeTrade.m62152g(fragmentActivity, delegationEntity, str, str2, function2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeTrade$modifyKlineOrder$1(String str, String str2, KCFlutterBridgeTrade kCFlutterBridgeTrade, Context context, String str3, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeTrade$modifyKlineOrder$1> continuation) {
        super(2, continuation);
        this.$orderInfo = str;
        this.$bizType = str2;
        this.this$0 = kCFlutterBridgeTrade;
        this.$ctx = context;
        this.$targetPrice = str3;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeTrade$modifyKlineOrder$1(this.$orderInfo, this.$bizType, this.this$0, this.$ctx, this.$targetPrice, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeTrade$modifyKlineOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44128b.m97266j("KCFlutterBridgeTrade", "modifyKlineOrder orderInfo=" + this.$orderInfo);
            String str = this.$bizType;
            if (!Intrinsics.areEqual(str, SearchCategory$Companion.SPOT) && !Intrinsics.areEqual(str, ViewProps.MARGIN)) {
                IKuMexService.f28731a.get().mo33258G(this.$ctx, this.$orderInfo, this.$targetPrice, this.$callback);
            } else {
                KCFlutterBridgeTrade kCFlutterBridgeTrade = this.this$0;
                String str2 = this.$orderInfo;
                this.label = 1;
                obj = kCFlutterBridgeTrade.m62153h(str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        final DelegationEntity delegationEntity = (DelegationEntity) obj;
        final KCFlutterBridgeTrade kCFlutterBridgeTrade2 = this.this$0;
        final String str3 = this.$bizType;
        final String str4 = this.$targetPrice;
        final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
        C42899b.m94073c(new Function1() { // from class: com.kubi.spot.knb.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCFlutterBridgeTrade$modifyKlineOrder$1.m62157f(kCFlutterBridgeTrade2, delegationEntity, str3, str4, function2, (FragmentActivity) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}

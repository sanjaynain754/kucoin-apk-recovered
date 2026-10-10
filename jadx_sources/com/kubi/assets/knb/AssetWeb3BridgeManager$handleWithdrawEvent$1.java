package com.kubi.assets.knb;

import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexWithdrawResult;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$handleWithdrawEvent$1", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {}, m90124l = {339}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetWeb3BridgeManager$handleWithdrawEvent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> $callback;
    final /* synthetic */ HashMap<String, String> $event;
    final /* synthetic */ String $id;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetWeb3BridgeManager$handleWithdrawEvent$1(String str, Function1<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> function1, HashMap<String, String> map, Continuation<? super AssetWeb3BridgeManager$handleWithdrawEvent$1> continuation) {
        super(2, continuation);
        this.$id = str;
        this.$callback = function1;
        this.$event = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetWeb3BridgeManager$handleWithdrawEvent$1(this.$id, this.$callback, this.$event, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$handleWithdrawEvent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
            String str = this.$id;
            Function1<KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> function1 = this.$callback;
            this.label = 1;
            obj = assetWeb3BridgeManager.m17506v(str, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((KCFlutterBridgeAssetsWalletCexWithdrawResult) obj) == null) {
            AssetWeb3BridgeManager.f17841a.m17499o(this.$event.get("amount"), this.$callback);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

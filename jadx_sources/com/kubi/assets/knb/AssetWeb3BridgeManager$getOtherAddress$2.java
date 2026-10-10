package com.kubi.assets.knb;

import com.kubi.assets.entity.CoinAddressEntity;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/assets/entity/CoinAddressEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$getOtherAddress$2", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {0}, m90124l = {138}, m90125m = "invokeSuspend", m90126n = {"data"}, m90127s = {"L$0"})
public final class AssetWeb3BridgeManager$getOtherAddress$2 extends SuspendLambda implements Function2<CoinAddressEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> $callback;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $coinName;
    final /* synthetic */ String $depositMinSize;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(CoinAddressEntity coinAddressEntity, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$getOtherAddress$2) create(coinAddressEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetWeb3BridgeManager$getOtherAddress$2(Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function1, String str, String str2, String str3, Continuation<? super AssetWeb3BridgeManager$getOtherAddress$2> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.$coinName = str;
        this.$chainId = str2;
        this.$depositMinSize = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetWeb3BridgeManager$getOtherAddress$2 assetWeb3BridgeManager$getOtherAddress$2 = new AssetWeb3BridgeManager$getOtherAddress$2(this.$callback, this.$coinName, this.$chainId, this.$depositMinSize, continuation);
        assetWeb3BridgeManager$getOtherAddress$2.L$0 = obj;
        return assetWeb3BridgeManager$getOtherAddress$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        CoinAddressEntity coinAddressEntity = (CoinAddressEntity) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (coinAddressEntity.isMultipleAddress()) {
                Function1<List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function2 = this.$callback;
                AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
                String str = this.$coinName;
                String str2 = this.$chainId;
                String str3 = this.$depositMinSize;
                this.L$0 = SpillingKt.nullOutSpilledVariable(coinAddressEntity);
                this.L$1 = function2;
                this.label = 1;
                Object objM17495E = assetWeb3BridgeManager.m17495E(str, str2, str3, this);
                if (objM17495E == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objM17495E;
            } else {
                this.$callback.invoke(AssetWeb3BridgeManager.f17841a.m17498n(coinAddressEntity, this.$depositMinSize));
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) this.L$1;
        ResultKt.throwOnFailure(obj);
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}

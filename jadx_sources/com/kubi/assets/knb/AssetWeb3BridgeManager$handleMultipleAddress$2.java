package com.kubi.assets.knb;

import com.kubi.assets.entity.DepositAddressEntity;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import java.util.List;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/DepositAddressEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$handleMultipleAddress$2", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetWeb3BridgeManager$handleMultipleAddress$2 extends SuspendLambda implements Function2<DepositAddressEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<List<KCFlutterBridgeAssetsWalletCexAddress>> $completableDeferred;
    final /* synthetic */ String $depositMinSize;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(DepositAddressEntity depositAddressEntity, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$handleMultipleAddress$2) create(depositAddressEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetWeb3BridgeManager$handleMultipleAddress$2(InterfaceC41769w<List<KCFlutterBridgeAssetsWalletCexAddress>> interfaceC41769w, String str, Continuation<? super AssetWeb3BridgeManager$handleMultipleAddress$2> continuation) {
        super(2, continuation);
        this.$completableDeferred = interfaceC41769w;
        this.$depositMinSize = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetWeb3BridgeManager$handleMultipleAddress$2 assetWeb3BridgeManager$handleMultipleAddress$2 = new AssetWeb3BridgeManager$handleMultipleAddress$2(this.$completableDeferred, this.$depositMinSize, continuation);
        assetWeb3BridgeManager$handleMultipleAddress$2.L$0 = obj;
        return assetWeb3BridgeManager$handleMultipleAddress$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DepositAddressEntity depositAddressEntity = (DepositAddressEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$completableDeferred.mo91370n(AssetWeb3BridgeManager.f17841a.m17503s(depositAddressEntity, this.$depositMinSize));
        return Unit.INSTANCE;
    }
}

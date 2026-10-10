package com.kubi.assets.knb;

import com.kubi.assets.AssetRemoteConfig;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAsset;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
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
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$getAssets$1", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {}, m90124l = {230, 232, 234}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetWeb3BridgeManager$getAssets$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<KCFlutterBridgeAssetsWalletCexAsset>, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetWeb3BridgeManager$getAssets$1(Function1<? super List<KCFlutterBridgeAssetsWalletCexAsset>, Unit> function1, Continuation<? super AssetWeb3BridgeManager$getAssets$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetWeb3BridgeManager$getAssets$1(this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$getAssets$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r13 == r0) goto L23;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AssetWeb3BridgeManager$getAssets$1 assetWeb3BridgeManager$getAssets$1;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        assetWeb3BridgeManager$getAssets$1 = this;
                        list = (List) ((C19334f) obj).m42846a();
                        assetWeb3BridgeManager$getAssets$1.$callback.invoke(AssetWeb3BridgeManager.f17841a.m17500p(list));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                assetWeb3BridgeManager$getAssets$1 = this;
                list = (List) ((C19334f) obj).m42846a();
                assetWeb3BridgeManager$getAssets$1.$callback.invoke(AssetWeb3BridgeManager.f17841a.m17500p(list));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ExchangeRateHelper exchangeRateHelper = ExchangeRateHelper.f17844a;
            this.label = 1;
            if (exchangeRateHelper.m17513b(this) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (AssetRemoteConfig.f18903a.m19582z()) {
            InterfaceC41634e interfaceC41634eM17536j = KnbApi.m17536j(AssetWeb3BridgeManager.f17841a.m17492B(), 0, 1, null);
            this.label = 2;
            assetWeb3BridgeManager$getAssets$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM17536j, false, null, assetWeb3BridgeManager$getAssets$1, 2, null);
        } else {
            assetWeb3BridgeManager$getAssets$1 = this;
            InterfaceC41634e interfaceC41634eM17534h = KnbApi.m17534h(AssetWeb3BridgeManager.f17841a.m17492B(), 0, 1, null);
            assetWeb3BridgeManager$getAssets$1.label = 3;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM17534h, false, null, assetWeb3BridgeManager$getAssets$1, 2, null);
        }
        return coroutine_suspended;
    }
}

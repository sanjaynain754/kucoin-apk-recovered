package com.kubi.assets.knb;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$getWithdrawChains$1", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {}, m90124l = {274}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetWeb3BridgeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager$getWithdrawChains$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,374:1\n774#2:375\n865#2,2:376\n1563#2:378\n1634#2,3:379\n*S KotlinDebug\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager$getWithdrawChains$1\n*L\n276#1:375\n276#1:376,2\n277#1:378\n277#1:379,3\n*E\n"})
public final class AssetWeb3BridgeManager$getWithdrawChains$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<KCFlutterBridgeAssetsWalletCexChain>, Unit> $callback;
    final /* synthetic */ String $coinName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetWeb3BridgeManager$getWithdrawChains$1(String str, Function1<? super List<KCFlutterBridgeAssetsWalletCexChain>, Unit> function1, Continuation<? super AssetWeb3BridgeManager$getWithdrawChains$1> continuation) {
        super(2, continuation);
        this.$coinName = str;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetWeb3BridgeManager$getWithdrawChains$1(this.$coinName, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$getWithdrawChains$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetWeb3BridgeManager$getWithdrawChains$1 assetWeb3BridgeManager$getWithdrawChains$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        List<KCFlutterBridgeAssetsWalletCexChain> listEmptyList = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                assetWeb3BridgeManager$getWithdrawChains$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM17533g = KnbApi.m17533g(AssetWeb3BridgeManager.f17841a.m17492B(), this.$coinName, null, 2, null);
            this.label = 1;
            assetWeb3BridgeManager$getWithdrawChains$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM17533g, false, null, assetWeb3BridgeManager$getWithdrawChains$1, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list = (List) ((C19334f) obj).m42846a();
        Function1<List<KCFlutterBridgeAssetsWalletCexChain>, Unit> function1 = assetWeb3BridgeManager$getWithdrawChains$1.$callback;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                MultiChainEntity multiChainEntity = (MultiChainEntity) obj2;
                if (Intrinsics.areEqual(multiChainEntity.isChainEnabled(), CredentialEntry.TRUE_STRING) && multiChainEntity.isWithdrawEnabled()) {
                    arrayList.add(obj2);
                }
            }
            AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(assetWeb3BridgeManager.m17502r((MultiChainEntity) it.next()));
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        function1.invoke(listEmptyList);
        return Unit.INSTANCE;
    }
}

package com.kubi.assets.knb;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager$getAddress$1", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {1, 1, 1, 2, 2, 2}, m90124l = {56, 64, 72}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT, "it", "$i$a$-let-AssetWeb3BridgeManager$getAddress$1$2", DbParams.KEY_CHANNEL_RESULT, "it", "$i$a$-let-AssetWeb3BridgeManager$getAddress$1$4"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nAssetWeb3BridgeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager$getAddress$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,374:1\n774#2:375\n865#2,2:376\n*S KotlinDebug\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager$getAddress$1\n*L\n59#1:375\n59#1:376,2\n*E\n"})
public final class AssetWeb3BridgeManager$getAddress$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> $callback;
    final /* synthetic */ String $chainName;
    final /* synthetic */ String $coinName;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetWeb3BridgeManager$getAddress$1(String str, Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function1, String str2, Continuation<? super AssetWeb3BridgeManager$getAddress$1> continuation) {
        super(2, continuation);
        this.$coinName = str;
        this.$callback = function1;
        this.$chainName = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetWeb3BridgeManager$getAddress$1(this.$coinName, this.$callback, this.$chainName, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetWeb3BridgeManager$getAddress$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r4.m17510z(r2, r1, r12) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
    
        if (r6.m17493C(r7, r8, r9, r10, r11) == r0) goto L50;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AssetWeb3BridgeManager$getAddress$1 assetWeb3BridgeManager$getAddress$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                assetWeb3BridgeManager$getAddress$1 = this;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e interfaceC41634eM17533g = KnbApi.m17533g(AssetWeb3BridgeManager.f17841a.m17492B(), this.$coinName, null, 2, null);
        this.label = 1;
        assetWeb3BridgeManager$getAddress$1 = this;
        obj = RetrofitFlowExKt.m42826g(interfaceC41634eM17533g, false, null, assetWeb3BridgeManager$getAddress$1, 2, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list = (List) ((C19334f) obj).m42846a();
        if (Intrinsics.areEqual(assetWeb3BridgeManager$getAddress$1.$coinName, "BTC")) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    MultiChainEntity multiChainEntity = (MultiChainEntity) obj3;
                    if (Intrinsics.areEqual(multiChainEntity.isChainEnabled(), CredentialEntry.TRUE_STRING) && multiChainEntity.isDepositEnabled() && (Intrinsics.areEqual(multiChainEntity.getChainId(), "bech32") || Intrinsics.areEqual(multiChainEntity.getChainId(), "btc"))) {
                        arrayList.add(obj3);
                    }
                }
                Function1<List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function1 = assetWeb3BridgeManager$getAddress$1.$callback;
                AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
                assetWeb3BridgeManager$getAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                assetWeb3BridgeManager$getAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                assetWeb3BridgeManager$getAddress$1.I$0 = 0;
                assetWeb3BridgeManager$getAddress$1.label = 2;
            } else {
                assetWeb3BridgeManager$getAddress$1.$callback.invoke(CollectionsKt.emptyList());
            }
            return Unit.INSTANCE;
        }
        if (list != null) {
            String str = assetWeb3BridgeManager$getAddress$1.$chainName;
            for (Object obj4 : list) {
                MultiChainEntity multiChainEntity2 = (MultiChainEntity) obj4;
                if (Intrinsics.areEqual(multiChainEntity2.isChainEnabled(), CredentialEntry.TRUE_STRING) && multiChainEntity2.isDepositEnabled() && Intrinsics.areEqual(multiChainEntity2.getChainName(), str)) {
                    obj2 = obj4;
                    break;
                }
            }
            MultiChainEntity multiChainEntity3 = (MultiChainEntity) obj2;
            if (multiChainEntity3 != null) {
                String str2 = assetWeb3BridgeManager$getAddress$1.$coinName;
                Function1<List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function2 = assetWeb3BridgeManager$getAddress$1.$callback;
                AssetWeb3BridgeManager assetWeb3BridgeManager2 = AssetWeb3BridgeManager.f17841a;
                String chainId = multiChainEntity3.getChainId();
                AssetWeb3BridgeManager$getAddress$1 assetWeb3BridgeManager$getAddress$2 = assetWeb3BridgeManager$getAddress$1;
                String depositMinSize = multiChainEntity3.getDepositMinSize();
                assetWeb3BridgeManager$getAddress$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
                assetWeb3BridgeManager$getAddress$2.L$1 = SpillingKt.nullOutSpilledVariable(multiChainEntity3);
                assetWeb3BridgeManager$getAddress$2.I$0 = 0;
                assetWeb3BridgeManager$getAddress$2.label = 3;
            } else {
                assetWeb3BridgeManager$getAddress$1.$callback.invoke(CollectionsKt.emptyList());
            }
        } else {
            assetWeb3BridgeManager$getAddress$1.$callback.invoke(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }
}

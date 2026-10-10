package com.kubi.assets.knb;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.assets.entity.Addresse;
import com.kubi.assets.entity.CoinAddressEntity;
import com.kubi.assets.entity.DepositAddressEntity;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAsset;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexChain;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexWithdrawResult;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\u0015J8\u0010\u0018\u001a\u00020\u000e2\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u0082@¢\u0006\u0002\u0010\u001bJD\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\u0015H\u0082@¢\u0006\u0002\u0010\u001fJ0\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0002\u0010!J\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020'2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\u0019\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0002\u0010,J \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020.2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J*\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u000200\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\u0015J\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00162\u000e\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u0016H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u000203H\u0002J2\u00106\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\u0015J\u0010\u00108\u001a\u0002072\u0006\u00105\u001a\u00020\u001aH\u0002J<\u00109\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000e0\u0015J \u0010;\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002JN\u0010<\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120>j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012`?2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J.\u0010@\u001a\u0004\u0018\u00010:2\u0006\u0010A\u001a\u00020\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000e0\u0015H\u0082@¢\u0006\u0002\u0010BJ(\u0010C\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006E"}, m90084d2 = {"Lcom/kubi/assets/knb/AssetWeb3BridgeManager;", "", "<init>", "()V", "successFlowEvent", "Lkotlinx/coroutines/Job;", "mApi", "Lcom/kubi/assets/knb/KnbApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/assets/knb/KnbApi;", "mApi$delegate", "Lkotlin/Lazy;", "getAddress", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "coinName", "", "chainName", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAddress;", "getBtcAddress", "addressTypes", "Lcom/kubi/assets/entity/MultiChainEntity;", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOtherAddress", "chainId", "depositMinSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleMultipleAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildMultipleAddressData", "data", "Lcom/kubi/assets/entity/DepositAddressEntity;", "buildMultipleAddressItem", "address", "Lcom/kubi/assets/entity/Addresse;", "getAccountType", "", "accountType", "Lcom/kubi/data/coin/AccountType;", "(Lcom/kubi/data/coin/AccountType;)Ljava/lang/Long;", "buildAddressData", "Lcom/kubi/assets/entity/CoinAddressEntity;", "getAssets", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAsset;", "buildAssetCoin", "entities", "Lcom/kubi/data/entity/CoinInfoEntity;", "buildAssetCoinItem", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getWithdrawChains", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexChain;", "buildChainItem", "requestWithdraw", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexWithdrawResult;", "buildWeb3Address", "handleWithdrawEvent", "event", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchWithdrawRecord", "id", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildAmountAndTime", "amount", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetWeb3BridgeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,374:1\n1869#2,2:375\n1617#2,9:383\n1869#2:392\n1870#2:394\n1626#2:395\n1617#2,9:396\n1869#2:405\n1870#2:407\n1626#2:408\n25#3:377\n26#3:379\n25#3:380\n26#3:382\n1#4:378\n1#4:381\n1#4:393\n1#4:406\n1#4:411\n81#5,2:409\n*S KotlinDebug\n*F\n+ 1 AssetWeb3BridgeManager.kt\ncom/kubi/assets/knb/AssetWeb3BridgeManager\n*L\n112#1:375,2\n169#1:383,9\n169#1:392\n169#1:394\n169#1:395\n244#1:396,9\n244#1:405\n244#1:407\n244#1:408\n142#1:377\n142#1:379\n159#1:380\n159#1:382\n142#1:378\n159#1:381\n169#1:393\n244#1:406\n308#1:409,2\n*E\n"})
public final class AssetWeb3BridgeManager {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f17842b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetWeb3BridgeManager f17841a = new AssetWeb3BridgeManager();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f17843c = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.knb.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetWeb3BridgeManager.m17478G();
        }
    });

    /* JADX INFO: renamed from: w */
    public final Long m17507w(AccountType accountType) {
        Object objM103844constructorimpl;
        Long l11;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = accountType == null ? -1 : C10253a.$EnumSwitchMapping$0[accountType.ordinal()];
            if (i11 == 1) {
                l11 = 1L;
            } else if (i11 == 2) {
                l11 = 2L;
            } else if (i11 != 3) {
                l11 = i11 != 4 ? null : 4L;
            } else {
                l11 = 3L;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(l11);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (Long) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: com.kubi.assets.knb.AssetWeb3BridgeManager$a */
    /* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C10253a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.TRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.MARGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: A */
    public static final Object m17477A(String str, String str2, Continuation<? super List<KCFlutterBridgeAssetsWalletCexAddress>> continuation) {
        AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1;
        String str3;
        Object objM42826g;
        String str4;
        if (continuation instanceof AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1) {
            assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 = (AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1) continuation;
            int i11 = assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 = new AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1(continuation);
            }
        } else {
            assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 = new AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1(continuation);
        }
        AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2 = assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1;
        Object obj = assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM17535i = KnbApi.m17535i(f17841a.m17492B(), "BTC", str, null, 4, null);
            assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$0 = str;
            str3 = str2;
            assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$1 = str3;
            assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM17535i, false, null, assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2, 2, null);
            if (objM42826g != coroutine_suspended) {
                str4 = str;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        String str5 = (String) assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$1;
        str4 = (String) assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$0;
        ResultKt.throwOnFailure(obj);
        objM42826g = obj;
        str3 = str5;
        CoinAddressEntity coinAddressEntity = (CoinAddressEntity) ((C19334f) objM42826g).m42846a();
        if (coinAddressEntity == null || !coinAddressEntity.isMultipleAddress()) {
            if (coinAddressEntity != null) {
                return f17841a.m17498n(coinAddressEntity, str3);
            }
            return null;
        }
        AssetWeb3BridgeManager assetWeb3BridgeManager = f17841a;
        assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
        assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$1 = SpillingKt.nullOutSpilledVariable(str3);
        assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.L$2 = SpillingKt.nullOutSpilledVariable(coinAddressEntity);
        assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2.label = 2;
        Object objM17495E = assetWeb3BridgeManager.m17495E("BTC", str4, str3, assetWeb3BridgeManager$getBtcAddress$handleBtcAddress$2);
        return objM17495E == coroutine_suspended ? coroutine_suspended : objM17495E;
    }

    /* JADX INFO: renamed from: B */
    public final KnbApi m17492B() {
        return (KnbApi) f17843c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m17493C(String str, String str2, String str3, Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function1, Continuation<? super Unit> continuation) {
        AssetWeb3BridgeManager$getOtherAddress$1 assetWeb3BridgeManager$getOtherAddress$1;
        Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function2;
        if (continuation instanceof AssetWeb3BridgeManager$getOtherAddress$1) {
            assetWeb3BridgeManager$getOtherAddress$1 = (AssetWeb3BridgeManager$getOtherAddress$1) continuation;
            int i11 = assetWeb3BridgeManager$getOtherAddress$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetWeb3BridgeManager$getOtherAddress$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetWeb3BridgeManager$getOtherAddress$1 = new AssetWeb3BridgeManager$getOtherAddress$1(this, continuation);
            }
        } else {
            assetWeb3BridgeManager$getOtherAddress$1 = new AssetWeb3BridgeManager$getOtherAddress$1(this, continuation);
        }
        Object objM42823d = assetWeb3BridgeManager$getOtherAddress$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetWeb3BridgeManager$getOtherAddress$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e interfaceC41634eM17535i = KnbApi.m17535i(m17492B(), str, str2, null, 4, null);
            AssetWeb3BridgeManager$getOtherAddress$2 assetWeb3BridgeManager$getOtherAddress$2 = new AssetWeb3BridgeManager$getOtherAddress$2(function1, str, str2, str3, null);
            assetWeb3BridgeManager$getOtherAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            assetWeb3BridgeManager$getOtherAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            assetWeb3BridgeManager$getOtherAddress$1.L$2 = SpillingKt.nullOutSpilledVariable(str3);
            assetWeb3BridgeManager$getOtherAddress$1.L$3 = function1;
            assetWeb3BridgeManager$getOtherAddress$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17535i, false, assetWeb3BridgeManager$getOtherAddress$2, assetWeb3BridgeManager$getOtherAddress$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
            function2 = function1;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) assetWeb3BridgeManager$getOtherAddress$1.L$3;
            ResultKt.throwOnFailure(objM42823d);
        }
        if (((C19334f) objM42823d).getThrowable() != null) {
            function2.invoke(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m17494D(@NotNull FragmentActivity activity, @NotNull String coinName, @NotNull Function1<? super List<KCFlutterBridgeAssetsWalletCexChain>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), C42911a.m94120b(), null, new AssetWeb3BridgeManager$getWithdrawChains$1(coinName, callback, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public final Object m17495E(String str, String str2, String str3, Continuation<? super List<KCFlutterBridgeAssetsWalletCexAddress>> continuation) {
        AssetWeb3BridgeManager$handleMultipleAddress$1 assetWeb3BridgeManager$handleMultipleAddress$1;
        String str4;
        InterfaceC41769w interfaceC41769w;
        if (continuation instanceof AssetWeb3BridgeManager$handleMultipleAddress$1) {
            assetWeb3BridgeManager$handleMultipleAddress$1 = (AssetWeb3BridgeManager$handleMultipleAddress$1) continuation;
            int i11 = assetWeb3BridgeManager$handleMultipleAddress$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetWeb3BridgeManager$handleMultipleAddress$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetWeb3BridgeManager$handleMultipleAddress$1 = new AssetWeb3BridgeManager$handleMultipleAddress$1(this, continuation);
            }
        } else {
            assetWeb3BridgeManager$handleMultipleAddress$1 = new AssetWeb3BridgeManager$handleMultipleAddress$1(this, continuation);
        }
        Object objM42823d = assetWeb3BridgeManager$handleMultipleAddress$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetWeb3BridgeManager$handleMultipleAddress$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41634e<DepositAddressEntity> interfaceC41634eM17541e = m17492B().m17541e(str, str2);
            AssetWeb3BridgeManager$handleMultipleAddress$2 assetWeb3BridgeManager$handleMultipleAddress$2 = new AssetWeb3BridgeManager$handleMultipleAddress$2(interfaceC41769wM91388c, str3, null);
            assetWeb3BridgeManager$handleMultipleAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            assetWeb3BridgeManager$handleMultipleAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            assetWeb3BridgeManager$handleMultipleAddress$1.L$2 = SpillingKt.nullOutSpilledVariable(str3);
            assetWeb3BridgeManager$handleMultipleAddress$1.L$3 = interfaceC41769wM91388c;
            assetWeb3BridgeManager$handleMultipleAddress$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17541e, false, assetWeb3BridgeManager$handleMultipleAddress$2, assetWeb3BridgeManager$handleMultipleAddress$1);
            if (objM42823d != coroutine_suspended) {
                str4 = str;
                interfaceC41769w = interfaceC41769wM91388c;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
            return objM42823d;
        }
        interfaceC41769w = (InterfaceC41769w) assetWeb3BridgeManager$handleMultipleAddress$1.L$3;
        str3 = (String) assetWeb3BridgeManager$handleMultipleAddress$1.L$2;
        str2 = (String) assetWeb3BridgeManager$handleMultipleAddress$1.L$1;
        str4 = (String) assetWeb3BridgeManager$handleMultipleAddress$1.L$0;
        ResultKt.throwOnFailure(objM42823d);
        if (((C19334f) objM42823d).getThrowable() != null) {
            interfaceC41769w.mo91370n(CollectionsKt.emptyList());
        }
        assetWeb3BridgeManager$handleMultipleAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(str4);
        assetWeb3BridgeManager$handleMultipleAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
        assetWeb3BridgeManager$handleMultipleAddress$1.L$2 = SpillingKt.nullOutSpilledVariable(str3);
        assetWeb3BridgeManager$handleMultipleAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41769w);
        assetWeb3BridgeManager$handleMultipleAddress$1.label = 2;
        Object objMo91198h = interfaceC41769w.mo91198h(assetWeb3BridgeManager$handleMultipleAddress$1);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    /* JADX INFO: renamed from: F */
    public final void m17496F(FragmentActivity fragmentActivity, HashMap<String, String> map, Function1<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> function1) {
        String str = map.get("id");
        if (str == null || str.length() == 0) {
            m17499o(map.get("amount"), function1);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), C42911a.m94120b(), null, new AssetWeb3BridgeManager$handleWithdrawEvent$1(str, function1, map, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m17497H(@NotNull FragmentActivity activity, @NotNull String coinName, @NotNull String chainName, @NotNull String address, @NotNull Function1<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37749a.a.m85118m(C37304a.f82764a, null, null, m17505u(chainName, address, coinName), null, null, null, null, 123, null);
        InterfaceC41775x1 interfaceC41775x1 = f17842b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        String name = AssetWeb3BridgeManager.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        f17842b = C12572a.m23692a(activity, true, new AssetWeb3BridgeManager$requestWithdraw$$inlined$bindFlowEvent$1(name, null, activity, callback));
    }

    /* JADX INFO: renamed from: o */
    public final void m17499o(String str, Function1<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> function1) {
        function1.invoke(new KCFlutterBridgeAssetsWalletCexWithdrawResult(C27041f.m66668h(str), String.valueOf(System.currentTimeMillis() / ((long) 1000))));
    }

    /* JADX INFO: renamed from: p */
    public final List<KCFlutterBridgeAssetsWalletCexAsset> m17500p(List<? extends CoinInfoEntity> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KCFlutterBridgeAssetsWalletCexAsset kCFlutterBridgeAssetsWalletCexAssetM17501q = f17841a.m17501q((CoinInfoEntity) it.next());
            if (kCFlutterBridgeAssetsWalletCexAssetM17501q != null) {
                arrayList.add(kCFlutterBridgeAssetsWalletCexAssetM17501q);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public final String m17505u(String str, String str2, String str3) {
        return str + ':' + str2 + "?coin=" + str3 + "&platFrom=WEB3";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m17506v(String str, Function1<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, Unit> function1, Continuation<? super KCFlutterBridgeAssetsWalletCexWithdrawResult> continuation) {
        AssetWeb3BridgeManager$fetchWithdrawRecord$1 assetWeb3BridgeManager$fetchWithdrawRecord$1;
        if (continuation instanceof AssetWeb3BridgeManager$fetchWithdrawRecord$1) {
            assetWeb3BridgeManager$fetchWithdrawRecord$1 = (AssetWeb3BridgeManager$fetchWithdrawRecord$1) continuation;
            int i11 = assetWeb3BridgeManager$fetchWithdrawRecord$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetWeb3BridgeManager$fetchWithdrawRecord$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetWeb3BridgeManager$fetchWithdrawRecord$1 = new AssetWeb3BridgeManager$fetchWithdrawRecord$1(this, continuation);
            }
        } else {
            assetWeb3BridgeManager$fetchWithdrawRecord$1 = new AssetWeb3BridgeManager$fetchWithdrawRecord$1(this, continuation);
        }
        Object objM42830k = assetWeb3BridgeManager$fetchWithdrawRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetWeb3BridgeManager$fetchWithdrawRecord$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<HistoryRecordEntity> interfaceC41634eM17539c = m17492B().m17539c(str);
            assetWeb3BridgeManager$fetchWithdrawRecord$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            assetWeb3BridgeManager$fetchWithdrawRecord$1.L$1 = function1;
            assetWeb3BridgeManager$fetchWithdrawRecord$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17539c, assetWeb3BridgeManager$fetchWithdrawRecord$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) assetWeb3BridgeManager$fetchWithdrawRecord$1.L$1;
            ResultKt.throwOnFailure(objM42830k);
        }
        HistoryRecordEntity historyRecordEntity = (HistoryRecordEntity) objM42830k;
        if (historyRecordEntity == null) {
            return null;
        }
        long jM66652l = C27039d.m66652l(Boxing.boxLong(historyRecordEntity.getCreatedAt()));
        KCFlutterBridgeAssetsWalletCexWithdrawResult kCFlutterBridgeAssetsWalletCexWithdrawResult = new KCFlutterBridgeAssetsWalletCexWithdrawResult(String.valueOf(historyRecordEntity.amount), String.valueOf(jM66652l > 0 ? jM66652l / ((long) 1000) : -1L));
        function1.invoke(kCFlutterBridgeAssetsWalletCexWithdrawResult);
        return kCFlutterBridgeAssetsWalletCexWithdrawResult;
    }

    /* JADX INFO: renamed from: x */
    public final void m17508x(@NotNull FragmentActivity activity, @NotNull String coinName, @NotNull String chainName, @NotNull Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), C42911a.m94120b(), null, new AssetWeb3BridgeManager$getAddress$1(coinName, callback, chainName, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m17509y(@NotNull FragmentActivity activity, @NotNull Function1<? super List<KCFlutterBridgeAssetsWalletCexAsset>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), C42911a.m94120b(), null, new AssetWeb3BridgeManager$getAssets$1(callback, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c3 -> B:25:0x00c9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: z */
    public final Object m17510z(Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function1, List<MultiChainEntity> list, Continuation<? super Unit> continuation) {
        AssetWeb3BridgeManager$getBtcAddress$1 assetWeb3BridgeManager$getBtcAddress$1;
        Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function2;
        List arrayList;
        int i11;
        Iterator it;
        List<MultiChainEntity> list2;
        AssetWeb3BridgeManager$getBtcAddress$1 assetWeb3BridgeManager$getBtcAddress$2;
        Iterable iterable;
        Object objM17477A;
        List<MultiChainEntity> list3;
        List list4;
        if (continuation instanceof AssetWeb3BridgeManager$getBtcAddress$1) {
            assetWeb3BridgeManager$getBtcAddress$1 = (AssetWeb3BridgeManager$getBtcAddress$1) continuation;
            int i12 = assetWeb3BridgeManager$getBtcAddress$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                assetWeb3BridgeManager$getBtcAddress$1.label = i12 - Integer.MIN_VALUE;
            } else {
                assetWeb3BridgeManager$getBtcAddress$1 = new AssetWeb3BridgeManager$getBtcAddress$1(this, continuation);
            }
        } else {
            assetWeb3BridgeManager$getBtcAddress$1 = new AssetWeb3BridgeManager$getBtcAddress$1(this, continuation);
        }
        Object obj = assetWeb3BridgeManager$getBtcAddress$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = assetWeb3BridgeManager$getBtcAddress$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            if (list.isEmpty()) {
                function1.invoke(CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            function2 = function1;
            arrayList = new ArrayList();
            i11 = 0;
            it = list.iterator();
            list2 = list;
            assetWeb3BridgeManager$getBtcAddress$2 = assetWeb3BridgeManager$getBtcAddress$1;
            iterable = list2;
            if (it.hasNext()) {
                function2.invoke(arrayList);
                return Unit.INSTANCE;
            }
            Object next = it.next();
            MultiChainEntity multiChainEntity = (MultiChainEntity) next;
            String chainId = multiChainEntity.getChainId();
            String depositMinSize = multiChainEntity.getDepositMinSize();
            assetWeb3BridgeManager$getBtcAddress$2.L$0 = function2;
            assetWeb3BridgeManager$getBtcAddress$2.L$1 = SpillingKt.nullOutSpilledVariable(list2);
            assetWeb3BridgeManager$getBtcAddress$2.L$2 = arrayList;
            assetWeb3BridgeManager$getBtcAddress$2.L$3 = SpillingKt.nullOutSpilledVariable(iterable);
            assetWeb3BridgeManager$getBtcAddress$2.L$4 = it;
            assetWeb3BridgeManager$getBtcAddress$2.L$5 = SpillingKt.nullOutSpilledVariable(next);
            assetWeb3BridgeManager$getBtcAddress$2.L$6 = SpillingKt.nullOutSpilledVariable(multiChainEntity);
            assetWeb3BridgeManager$getBtcAddress$2.I$0 = i11;
            assetWeb3BridgeManager$getBtcAddress$2.I$1 = 0;
            assetWeb3BridgeManager$getBtcAddress$2.label = 1;
            objM17477A = m17477A(chainId, depositMinSize, assetWeb3BridgeManager$getBtcAddress$2);
            if (objM17477A == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list5 = arrayList;
            list3 = list2;
            obj = objM17477A;
            list4 = list5;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = assetWeb3BridgeManager$getBtcAddress$1.I$0;
            Iterator it2 = (Iterator) assetWeb3BridgeManager$getBtcAddress$1.L$4;
            Iterable iterable2 = (Iterable) assetWeb3BridgeManager$getBtcAddress$1.L$3;
            List list6 = (List) assetWeb3BridgeManager$getBtcAddress$1.L$2;
            list3 = (List) assetWeb3BridgeManager$getBtcAddress$1.L$1;
            Function1<? super List<KCFlutterBridgeAssetsWalletCexAddress>, Unit> function3 = (Function1) assetWeb3BridgeManager$getBtcAddress$1.L$0;
            ResultKt.throwOnFailure(obj);
            assetWeb3BridgeManager$getBtcAddress$2 = assetWeb3BridgeManager$getBtcAddress$1;
            iterable = iterable2;
            i11 = i14;
            function2 = function3;
            list4 = list6;
            it = it2;
        }
        List list7 = (List) obj;
        if (list7 != null || list7.isEmpty()) {
            function2.invoke(CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }
        list4.addAll(list7);
        list2 = list3;
        arrayList = list4;
        if (it.hasNext()) {
            function2.invoke(arrayList);
            return Unit.INSTANCE;
        }
        Object next2 = it.next();
        MultiChainEntity multiChainEntity2 = (MultiChainEntity) next2;
        String chainId2 = multiChainEntity2.getChainId();
        String depositMinSize2 = multiChainEntity2.getDepositMinSize();
        assetWeb3BridgeManager$getBtcAddress$2.L$0 = function2;
        assetWeb3BridgeManager$getBtcAddress$2.L$1 = SpillingKt.nullOutSpilledVariable(list2);
        assetWeb3BridgeManager$getBtcAddress$2.L$2 = arrayList;
        assetWeb3BridgeManager$getBtcAddress$2.L$3 = SpillingKt.nullOutSpilledVariable(iterable);
        assetWeb3BridgeManager$getBtcAddress$2.L$4 = it;
        assetWeb3BridgeManager$getBtcAddress$2.L$5 = SpillingKt.nullOutSpilledVariable(next2);
        assetWeb3BridgeManager$getBtcAddress$2.L$6 = SpillingKt.nullOutSpilledVariable(multiChainEntity2);
        assetWeb3BridgeManager$getBtcAddress$2.I$0 = i11;
        assetWeb3BridgeManager$getBtcAddress$2.I$1 = 0;
        assetWeb3BridgeManager$getBtcAddress$2.label = 1;
        objM17477A = m17477A(chainId2, depositMinSize2, assetWeb3BridgeManager$getBtcAddress$2);
        if (objM17477A == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list8 = arrayList;
        list3 = list2;
        obj = objM17477A;
        list4 = list8;
        List list9 = (List) obj;
        if (list9 != null) {
        }
        function2.invoke(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final KnbApi m17478G() {
        return (KnbApi) C42597a.m93387c().create(KnbApi.class);
    }

    /* JADX INFO: renamed from: n */
    public final List<KCFlutterBridgeAssetsWalletCexAddress> m17498n(CoinAddressEntity coinAddressEntity, String str) {
        String memo = coinAddressEntity.getMemo();
        if (memo != null && memo.length() != 0) {
            return CollectionsKt.emptyList();
        }
        Long lM17507w = m17507w(coinAddressEntity.getToAccountType());
        if (lM17507w != null) {
            long jLongValue = lM17507w.longValue();
            String address = coinAddressEntity.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            List<KCFlutterBridgeAssetsWalletCexAddress> listListOf = CollectionsKt.listOf(new KCFlutterBridgeAssetsWalletCexAddress(address, jLongValue, C27041f.m66668h(str)));
            if (listListOf != null) {
                return listListOf;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: q */
    public final KCFlutterBridgeAssetsWalletCexAsset m17501q(CoinInfoEntity coinInfoEntity) {
        if (coinInfoEntity.isDisplayWithdraw() && coinInfoEntity.isWithdrawEnabled() && coinInfoEntity.getAvailableBalance() > 0.0d) {
            String strValueOf = String.valueOf(coinInfoEntity.getAvailableBalance());
            String currency = coinInfoEntity.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            return new KCFlutterBridgeAssetsWalletCexAsset(currency, strValueOf, ExchangeRateHelper.f17844a.m17514c(strValueOf, coinInfoEntity.getCurrency()));
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final KCFlutterBridgeAssetsWalletCexChain m17502r(MultiChainEntity multiChainEntity) {
        String strM66668h = C27041f.m66668h(multiChainEntity.getWithdrawMinFee());
        String chainName = multiChainEntity.getChainName();
        String strM17514c = ExchangeRateHelper.f17844a.m17514c(strM66668h, multiChainEntity.getCurrency());
        String currency = multiChainEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String str = currency;
        String withdrawPredictTime = multiChainEntity.getWithdrawPredictTime();
        long jM66545o = -1;
        if (withdrawPredictTime != null) {
            jM66545o = DowngradeExKt.m66545o(withdrawPredictTime, -1L) * ((long) 60);
        }
        return new KCFlutterBridgeAssetsWalletCexChain(chainName, strM66668h, strM17514c, str, jM66545o);
    }

    /* JADX INFO: renamed from: s */
    public final List<KCFlutterBridgeAssetsWalletCexAddress> m17503s(DepositAddressEntity depositAddressEntity, String str) {
        List<Addresse> addresses = depositAddressEntity.getAddresses();
        if (addresses != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = addresses.iterator();
            while (it.hasNext()) {
                KCFlutterBridgeAssetsWalletCexAddress kCFlutterBridgeAssetsWalletCexAddressM17504t = f17841a.m17504t((Addresse) it.next(), str);
                if (kCFlutterBridgeAssetsWalletCexAddressM17504t != null) {
                    arrayList.add(kCFlutterBridgeAssetsWalletCexAddressM17504t);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final KCFlutterBridgeAssetsWalletCexAddress m17504t(Addresse addresse, String str) {
        String memo = addresse.getMemo();
        if (memo != null && memo.length() != 0) {
            return null;
        }
        AccountType accountTypeOfName = AccountType.INSTANCE.ofName(addresse.getToAccountType());
        if (accountTypeOfName == null) {
            accountTypeOfName = AccountType.UNKNOWN;
        }
        Long lM17507w = m17507w(accountTypeOfName);
        if (lM17507w == null) {
            return null;
        }
        return new KCFlutterBridgeAssetsWalletCexAddress(C27041f.m66668h(addresse.getAddress()), lM17507w.longValue(), C27041f.m66668h(str));
    }
}

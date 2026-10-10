package com.kubi.transfer.helper;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.transfer.TransferApi;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.AccountInfo;
import com.kubi.transfer.entity.CoinListEntity;
import com.kubi.transfer.entity.QueryBalanceParam;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import g60.C37827c;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TransferCoinHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001aJ\u001c\u0010,\u001a\u00020*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0011J\u0006\u0010/\u001a\u000200Jx\u00101\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00102\u001a\u0004\u0018\u00010\u001a2\b\u00103\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u001c\u00104\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020*052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*072\f\u00108\u001a\b\u0012\u0004\u0012\u00020*09JH\u0010:\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00102\u001a\u0004\u0018\u00010\u001a2\b\u00103\u001a\u0004\u0018\u00010\u001a2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*072\f\u00108\u001a\b\u0012\u0004\u0012\u00020*09H\u0002J>\u0010;\u001a\u00020<2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*072\f\u00108\u001a\b\u0012\u0004\u0012\u00020*09H\u0002J\u001c\u0010=\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011Jp\u0010>\u001a\u00020<2\b\u00102\u001a\u0004\u0018\u00010\u001a2\b\u00103\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u001c\u00104\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020*052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*072\f\u00108\u001a\b\u0012\u0004\u0012\u00020*09H\u0002J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010@J\u001c\u0010A\u001a\u0004\u0018\u00010\u00112\b\u0010B\u001a\u0004\u0018\u00010\u001a2\b\u0010C\u001a\u0004\u0018\u00010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\"\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006D"}, m90084d2 = {"Lcom/kubi/transfer/helper/TransferCoinHelper;", "", "<init>", "()V", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfo", "()Lcom/kubi/data/entity/CoinInfoEntity;", "setCoinInfo", "(Lcom/kubi/data/entity/CoinInfoEntity;)V", "coinListEntity", "Lcom/kubi/transfer/entity/CoinListEntity;", "getCoinListEntity", "()Lcom/kubi/transfer/entity/CoinListEntity;", "setCoinListEntity", "(Lcom/kubi/transfer/entity/CoinListEntity;)V", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "setFromSymbolBean", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "toSymbolBean", "getToSymbolBean", "setToSymbolBean", "baseCurrency", "", "getBaseCurrency", "()Ljava/lang/String;", "setBaseCurrency", "(Ljava/lang/String;)V", "quoteCurrency", "getQuoteCurrency", "setQuoteCurrency", "api", "Lcom/kubi/transfer/TransferApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/transfer/TransferApi;", "api$delegate", "Lkotlin/Lazy;", "updateCoinInfo", "", "coin", "updateSymbolBean", "fromSymbol", "toSymbol", "buildQueryBalanceParam", "Lcom/kubi/transfer/entity/QueryBalanceParam;", "checkCoinInAccount", "fromType", "toType", "coinPairAction", "Lkotlin/Function2;", "singleCoinAction", "Lkotlin/Function1;", "noCoinAction", "Lkotlin/Function0;", "checkCoinInAccountNotIsolate", "checkCoinInAccountBothIsolate", "", "getBothIsoLateResult", "checkCoinInAccountSingleIsolate", "getFirstSymbol", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSymbolBean", "accountType", "symbolBean", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferCoinHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferCoinHelper.kt\ncom/kubi/transfer/helper/TransferCoinHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n774#3:280\n865#3:281\n1761#3,3:282\n866#3:285\n1761#3,3:286\n*S KotlinDebug\n*F\n+ 1 TransferCoinHelper.kt\ncom/kubi/transfer/helper/TransferCoinHelper\n*L\n139#1:280\n139#1:281\n140#1:282,3\n139#1:285\n143#1:286,3\n*E\n"})
public final class TransferCoinHelper {

    /* JADX INFO: renamed from: a */
    @Nullable
    public CoinInfoEntity f52695a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public CoinListEntity f52696b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public SymbolInfoEntity f52697c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public SymbolInfoEntity f52698d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f52699e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f52700f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f52701g = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.helper.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferCoinHelper.m64584b();
        }
    });

    /* JADX INFO: renamed from: g */
    public final boolean m64590g(String str, String str2, SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function0<Unit> function0) {
        AccountCoin accountCoin;
        AccountCoin accountCoin2;
        Object next;
        Object next2;
        Map<String, List<AccountCoin>> primary;
        List<AccountCoin> list;
        AccountCoin accountCoin3;
        AccountCoin accountCoin4;
        Object next3;
        Object next4;
        Map<String, List<AccountCoin>> primary2;
        List<AccountCoin> list2;
        if (Intrinsics.areEqual(str, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            CoinListEntity coinListEntity = this.f52696b;
            List listM66560c = (coinListEntity == null || (primary2 = coinListEntity.getPrimary()) == null || (list2 = primary2.get(str2)) == null) ? null : C27024b.m66560c(list2);
            if (listM66560c != null) {
                Iterator it = listM66560c.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (!Intrinsics.areEqual(((AccountCoin) next4).getCurrency(), symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null));
                accountCoin3 = (AccountCoin) next4;
            } else {
                accountCoin3 = null;
            }
            if (listM66560c != null) {
                Iterator it2 = listM66560c.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (!Intrinsics.areEqual(((AccountCoin) next3).getCurrency(), symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null));
                accountCoin4 = (AccountCoin) next3;
            } else {
                accountCoin4 = null;
            }
            if (accountCoin3 != null && accountCoin4 != null) {
                function2.invoke(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null);
                return false;
            }
            if (accountCoin3 != null) {
                function1.invoke(C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null));
                return false;
            }
            if (accountCoin4 != null) {
                function1.invoke(C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null));
                return false;
            }
            function0.invoke();
            return false;
        }
        CoinListEntity coinListEntity2 = this.f52696b;
        List listM66560c2 = (coinListEntity2 == null || (primary = coinListEntity2.getPrimary()) == null || (list = primary.get(str)) == null) ? null : C27024b.m66560c(list);
        if (listM66560c2 != null) {
            Iterator it3 = listM66560c2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Intrinsics.areEqual(((AccountCoin) next2).getCurrency(), symbolInfoEntity2 != null ? symbolInfoEntity2.getBaseCurrency() : null));
            accountCoin = (AccountCoin) next2;
        } else {
            accountCoin = null;
        }
        if (listM66560c2 != null) {
            Iterator it4 = listM66560c2.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!Intrinsics.areEqual(((AccountCoin) next).getCurrency(), symbolInfoEntity2 != null ? symbolInfoEntity2.getQuoteCurrency() : null));
            accountCoin2 = (AccountCoin) next;
        } else {
            accountCoin2 = null;
        }
        if (accountCoin != null && accountCoin2 != null) {
            function2.invoke(symbolInfoEntity2 != null ? symbolInfoEntity2.getBaseCurrency() : null, symbolInfoEntity2 != null ? symbolInfoEntity2.getQuoteCurrency() : null);
            return false;
        }
        if (accountCoin != null) {
            function1.invoke(C27041f.m66668h(symbolInfoEntity2 != null ? symbolInfoEntity2.getBaseCurrency() : null));
            return false;
        }
        if (accountCoin2 != null) {
            function1.invoke(C27041f.m66668h(symbolInfoEntity2 != null ? symbolInfoEntity2.getQuoteCurrency() : null));
            return false;
        }
        function0.invoke();
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final String m64593j(@Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2) {
        List listSplit$default;
        String symbol = symbolInfoEntity != null ? symbolInfoEntity.getSymbol() : null;
        String symbol2 = symbolInfoEntity2 != null ? symbolInfoEntity2.getSymbol() : null;
        List listSplit$default2 = symbol != null ? StringsKt.split$default((CharSequence) symbol, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null) : null;
        if (symbol2 != null) {
            listSplit$default = StringsKt.split$default((CharSequence) symbol2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null);
        } else {
            listSplit$default = null;
        }
        Set setIntersect = listSplit$default2 != null ? CollectionsKt.intersect(listSplit$default2, CollectionsKt.toSet(C27024b.m66560c(listSplit$default))) : null;
        if (setIntersect != null) {
            return CollectionsKt.joinToString$default(setIntersect, null, null, null, 0, null, null, 63, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m64602s(@Nullable String str) {
        CoinInfoEntity coinInfoEntity = null;
        Iterator it = CollectionsKt.listOfNotNull((Object[]) new String[]{C27041f.m66668h(str != null ? C27041f.m66677q(str) : null), "USDT", "BTC", "ETH"}).iterator();
        while (it.hasNext()) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u((String) it.next());
            if (coinInfoEntityM85613u != null) {
                coinInfoEntity = coinInfoEntityM85613u;
                break;
            }
        }
        this.f52695a = coinInfoEntity;
        if (coinInfoEntity == null) {
            TransferLog.f52948a.m64779a("coinInfo为null");
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m64585u(TransferCoinHelper transferCoinHelper, SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            symbolInfoEntity = null;
        }
        transferCoinHelper.m64603t(symbolInfoEntity, symbolInfoEntity2);
    }

    /* JADX INFO: renamed from: d */
    public final void m64587d(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2, @NotNull Function2<? super String, ? super String, Unit> coinPairAction, @NotNull Function1<? super String, Unit> singleCoinAction, @NotNull Function0<Unit> noCoinAction) {
        Intrinsics.checkNotNullParameter(coinPairAction, "coinPairAction");
        Intrinsics.checkNotNullParameter(singleCoinAction, "singleCoinAction");
        Intrinsics.checkNotNullParameter(noCoinAction, "noCoinAction");
        if (Intrinsics.areEqual(str2, SharedPositionInfo.MARGIN_MODE_ISOLATED) && Intrinsics.areEqual(str3, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            m64588e(symbolInfoEntity, symbolInfoEntity2, singleCoinAction, noCoinAction);
            return;
        }
        if ((!Intrinsics.areEqual(str2, SharedPositionInfo.MARGIN_MODE_ISOLATED) || Intrinsics.areEqual(str3, SharedPositionInfo.MARGIN_MODE_ISOLATED)) && (Intrinsics.areEqual(str2, SharedPositionInfo.MARGIN_MODE_ISOLATED) || !Intrinsics.areEqual(str3, SharedPositionInfo.MARGIN_MODE_ISOLATED))) {
            m64589f(str, str2, str3, singleCoinAction, noCoinAction);
        } else {
            m64590g(str2, str3, symbolInfoEntity, symbolInfoEntity2, coinPairAction, singleCoinAction, noCoinAction);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m64589f(String str, String str2, String str3, Function1<? super String, Unit> function1, Function0<Unit> function0) {
        AccountCoin accountCoin;
        String currency;
        Map<String, List<AccountCoin>> primary;
        List<AccountCoin> list;
        Map<String, List<AccountCoin>> primary2;
        List<AccountCoin> list2;
        CoinListEntity coinListEntity = this.f52696b;
        ArrayList arrayList = null;
        List listM66560c = (coinListEntity == null || (primary2 = coinListEntity.getPrimary()) == null || (list2 = primary2.get(str2)) == null) ? null : C27024b.m66560c(list2);
        CoinListEntity coinListEntity2 = this.f52696b;
        List listM66560c2 = (coinListEntity2 == null || (primary = coinListEntity2.getPrimary()) == null || (list = primary.get(str3)) == null) ? null : C27024b.m66560c(list);
        if (listM66560c != null) {
            arrayList = new ArrayList();
            for (Object obj : listM66560c) {
                AccountCoin accountCoin2 = (AccountCoin) obj;
                if (listM66560c2 != null && !listM66560c2.isEmpty()) {
                    Iterator it = listM66560c2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(accountCoin2.getCurrency(), C27041f.m66668h(((AccountCoin) it.next()).getCurrency()))) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        String str4 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((AccountCoin) it2.next()).getCurrency(), str)) {
                    if (str == null) {
                        str = "";
                    }
                    function1.invoke(str);
                    return;
                }
            }
        }
        if (Intrinsics.areEqual(str3, "SAVINGS")) {
            function0.invoke();
            return;
        }
        if (arrayList != null && (accountCoin = (AccountCoin) CollectionsKt.firstOrNull((List) arrayList)) != null && (currency = accountCoin.getCurrency()) != null) {
            str4 = currency;
        }
        function1.invoke(str4);
        TransferLog.f52948a.m64781c("币种" + str + "不存在" + str2 + "账户和" + str3 + "账户交集中");
    }

    /* JADX INFO: renamed from: h */
    public final TransferApi m64591h() {
        return (TransferApi) this.f52701g.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF52699e() {
        return this.f52699e;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final CoinInfoEntity getF52695a() {
        return this.f52695a;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final CoinListEntity getF52696b() {
        return this.f52696b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m64596m(@NotNull Continuation<? super SymbolInfoEntity> continuation) {
        TransferCoinHelper$getFirstSymbol$1 transferCoinHelper$getFirstSymbol$1;
        SearchSymbolEntity searchSymbolEntity;
        SymbolInfoEntity symbolInfoEntityM85601B;
        if (continuation instanceof TransferCoinHelper$getFirstSymbol$1) {
            transferCoinHelper$getFirstSymbol$1 = (TransferCoinHelper$getFirstSymbol$1) continuation;
            int i11 = transferCoinHelper$getFirstSymbol$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                transferCoinHelper$getFirstSymbol$1.label = i11 - Integer.MIN_VALUE;
            } else {
                transferCoinHelper$getFirstSymbol$1 = new TransferCoinHelper$getFirstSymbol$1(this, continuation);
            }
        } else {
            transferCoinHelper$getFirstSymbol$1 = new TransferCoinHelper$getFirstSymbol$1(this, continuation);
        }
        Object objM42830k = transferCoinHelper$getFirstSymbol$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = transferCoinHelper$getFirstSymbol$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e interfaceC41634eM64495h = TransferApi.m64495h(m64591h(), null, 1, null);
            transferCoinHelper$getFirstSymbol$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM64495h, transferCoinHelper$getFirstSymbol$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        List list = (List) objM42830k;
        return (list == null || (searchSymbolEntity = (SearchSymbolEntity) CollectionsKt.firstOrNull(list)) == null || (symbolInfoEntityM85601B = C37890n.f85269a.m85601B(searchSymbolEntity.getSymbol())) == null) ? (SymbolInfoEntity) CollectionsKt.firstOrNull((List) C37890n.f85269a.m85616x()) : symbolInfoEntityM85601B;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getF52700f() {
        return this.f52700f;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final SymbolInfoEntity getF52698d() {
        return this.f52698d;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final SymbolInfoEntity m64599p(@Nullable String str, @Nullable SymbolInfoEntity symbolInfoEntity) {
        if (!Intrinsics.areEqual(str, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            return null;
        }
        this.f52699e = symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null;
        this.f52700f = symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null;
        return symbolInfoEntity;
    }

    /* JADX INFO: renamed from: q */
    public final void m64600q(@Nullable CoinListEntity coinListEntity) {
        this.f52696b = coinListEntity;
    }

    /* JADX INFO: renamed from: r */
    public final void m64601r(@Nullable SymbolInfoEntity symbolInfoEntity) {
        this.f52698d = symbolInfoEntity;
    }

    /* JADX INFO: renamed from: t */
    public final void m64603t(@Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2) {
        this.f52697c = symbolInfoEntity;
        this.f52698d = symbolInfoEntity2;
    }

    /* JADX INFO: renamed from: b */
    public static final TransferApi m64584b() {
        return (TransferApi) C42597a.m93387c().create(TransferApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final QueryBalanceParam m64586c() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new AccountInfo("MAIN"));
        listCreateListBuilder.add(new AccountInfo("TRADE"));
        if (C37827c.m85382a()) {
            listCreateListBuilder.add(new AccountInfo("UNIFIED"));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing) && C37827c.m85383b()) {
            listCreateListBuilder.add(new AccountInfo("SAVINGS"));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            listCreateListBuilder.add(new AccountInfo("MARGIN"));
        }
        if (C26320a.m64604a()) {
            listCreateListBuilder.add(new AccountInfo("CONTRACT"));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Option)) {
            listCreateListBuilder.add(new AccountInfo("OPTION"));
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        String strM89965c = C41016c.m89965c();
        Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
        return new QueryBalanceParam(strM89965c, listBuild);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m64588e(SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, Function1<? super String, Unit> function1, Function0<Unit> function0) {
        String strM64593j = m64593j(symbolInfoEntity, symbolInfoEntity2);
        if (strM64593j != null && strM64593j.length() != 0) {
            function1.invoke(strM64593j);
            return true;
        }
        function0.invoke();
        return false;
    }
}

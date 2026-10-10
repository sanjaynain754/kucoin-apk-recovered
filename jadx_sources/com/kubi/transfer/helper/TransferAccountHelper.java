package com.kubi.transfer.helper;

import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.transfer.TransferApi;
import com.kubi.transfer.TransferHelper;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import g60.C37827c;
import gf.C37887k;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TransferAccountHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0005*\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010!\u001a\u00020\u001dH\u0002JP\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010(2\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001b0*H\u0086@¢\u0006\u0002\u0010+J@\u0010,\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001b0*H\u0002J2\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00052\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001dJ2\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00052\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u001c\u00104\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u0010j\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0005`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u00067"}, m90084d2 = {"Lcom/kubi/transfer/helper/TransferAccountHelper;", "", "<init>", "()V", "transferType", "", "Lcom/kubi/data/coin/Direction;", "multiAccountToTypes", "Lcom/kubi/data/coin/AccountType;", "multiAccountFromAccounts", "", "getMultiAccountFromAccounts", "()Ljava/util/List;", "setMultiAccountFromAccounts", "(Ljava/util/List;)V", "balanceMap", "Ljava/util/HashMap;", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "Lkotlin/collections/HashMap;", "api", "Lcom/kubi/transfer/TransferApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/transfer/TransferApi;", "api$delegate", "Lkotlin/Lazy;", "initTransferAccountType", "", "isMultiAccountMode", "", "fromType", "toType", "reorderUnifiedIfNeeded", "isLast", "fetchBalanceList", "coin", "precision", "", "isContract", "contractBalance", "Lcom/kubi/kumex/entity/BalanceEntity;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "(Ljava/lang/String;ILjava/lang/String;ZLcom/kubi/kumex/entity/BalanceEntity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleContractAccount", "balances", "buildTransferFromAccountList", "Lcom/kubi/transfer/entity/AccountItem;", "buildTransferToAccountList", "isReverseTransferSupported", "reverseFrom", "reverseTo", "getAccountBalance", "accountType", "Companion", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferAccountHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferAccountHelper.kt\ncom/kubi/transfer/helper/TransferAccountHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n774#2:289\n865#2,2:290\n774#2:292\n865#2,2:293\n827#2:295\n855#2,2:296\n827#2:298\n855#2,2:299\n827#2:301\n855#2,2:302\n827#2:304\n855#2,2:305\n1563#2:307\n1634#2,2:308\n774#2:310\n865#2,2:311\n1636#2:313\n1563#2:314\n1634#2,3:315\n827#2:318\n855#2,2:319\n774#2:321\n865#2,2:322\n774#2:325\n865#2,2:326\n1999#2,14:328\n774#2:342\n865#2,2:343\n1563#2:345\n1634#2,3:346\n774#2:349\n865#2,2:350\n827#2:352\n855#2,2:353\n1563#2:355\n1634#2,3:356\n774#2:359\n865#2,2:360\n1563#2:362\n1634#2,3:363\n774#2:366\n865#2,2:367\n1563#2:369\n1634#2,3:370\n774#2:373\n865#2,2:374\n1761#2,2:376\n1761#2,3:378\n1763#2:381\n1#3:324\n*S KotlinDebug\n*F\n+ 1 TransferAccountHelper.kt\ncom/kubi/transfer/helper/TransferAccountHelper\n*L\n87#1:289\n87#1:290,2\n88#1:292\n88#1:293,2\n89#1:295\n89#1:296,2\n90#1:298\n90#1:299,2\n91#1:301\n91#1:302,2\n92#1:304\n92#1:305,2\n95#1:307\n95#1:308,2\n99#1:310\n99#1:311,2\n95#1:313\n107#1:314\n107#1:315,3\n124#1:318\n124#1:319,2\n135#1:321\n135#1:322,2\n183#1:325\n183#1:326,2\n183#1:328,14\n205#1:342\n205#1:343,2\n206#1:345\n206#1:346,3\n213#1:349\n213#1:350,2\n222#1:352\n222#1:353,2\n224#1:355\n224#1:356,3\n229#1:359\n229#1:360,2\n247#1:362\n247#1:363,3\n253#1:366\n253#1:367,2\n258#1:369\n258#1:370,3\n264#1:373\n264#1:374,2\n277#1:376,2\n278#1:378,3\n277#1:381\n*E\n"})
public final class TransferAccountHelper {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f52689f = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public List<C37887k> f52690a = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<? extends AccountType> f52691b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c */
    @NotNull
    public List<String> f52692c = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d */
    @NotNull
    public HashMap<String, List<SingleCurrencyBalance>> f52693d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f52694e = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.helper.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferAccountHelper.m64572b();
        }
    });

    /* JADX INFO: compiled from: TransferAccountHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;", "", "<init>", "()V", "isContractOpen", "", "isLeverOpen", "isOptionOpen", "isSavingsOpen", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean isLeverOpen() {
            return IUserService.a.get().d0().isHasOpenLever() && C24129b.m58030b(SiteVisibleConfigKey.Margin);
        }

        public final boolean isOptionOpen() {
            return IUserService.a.get().d0().getHasMarginOption() && C24129b.m58030b(SiteVisibleConfigKey.Option);
        }

        public final boolean isSavingsOpen() {
            return C24129b.m58030b(SiteVisibleConfigKey.Financing) && C37827c.m85383b();
        }

        public final boolean isContractOpen() {
            if (C26320a.m64604a() && IUserService.a.get().d0().isHasOpenContract() && !IKuMexService.m33248N(IKuMexService.f28731a.get(), null, 1, null)) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m64575e(@NotNull String str, int i11, @Nullable String str2, boolean z11, @Nullable BalanceEntity balanceEntity, @NotNull Function1<? super AccountType, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        TransferAccountHelper$fetchBalanceList$1 transferAccountHelper$fetchBalanceList$1;
        String str3;
        BalanceEntity balanceEntity2;
        Function1<? super AccountType, Unit> function2;
        int i12;
        boolean z12;
        Object objM42830k;
        Object next;
        String str4 = str;
        if (continuation instanceof TransferAccountHelper$fetchBalanceList$1) {
            transferAccountHelper$fetchBalanceList$1 = (TransferAccountHelper$fetchBalanceList$1) continuation;
            int i13 = transferAccountHelper$fetchBalanceList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                transferAccountHelper$fetchBalanceList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                transferAccountHelper$fetchBalanceList$1 = new TransferAccountHelper$fetchBalanceList$1(this, continuation);
            }
        } else {
            transferAccountHelper$fetchBalanceList$1 = new TransferAccountHelper$fetchBalanceList$1(this, continuation);
        }
        Object obj = transferAccountHelper$fetchBalanceList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = transferAccountHelper$fetchBalanceList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(obj);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add("MAIN");
            listCreateListBuilder.add("TRADE");
            if (C37827c.m85382a()) {
                listCreateListBuilder.add("UNIFIED");
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.Financing) && C37827c.m85383b()) {
                listCreateListBuilder.add("SAVINGS");
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
                listCreateListBuilder.add("MARGIN");
            }
            if (C26320a.m64604a()) {
                listCreateListBuilder.add("CONTRACT");
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.Option)) {
                listCreateListBuilder.add("OPTION");
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ",", null, null, 0, null, null, 62, null);
            InterfaceC41634e<List<SingleCurrencyBalance>> interfaceC41634eM64498c = m64576f().m64498c(str4, strJoinToString$default);
            transferAccountHelper$fetchBalanceList$1.L$0 = str4;
            str3 = str2;
            transferAccountHelper$fetchBalanceList$1.L$1 = str3;
            balanceEntity2 = balanceEntity;
            transferAccountHelper$fetchBalanceList$1.L$2 = balanceEntity2;
            function2 = function1;
            transferAccountHelper$fetchBalanceList$1.L$3 = function2;
            transferAccountHelper$fetchBalanceList$1.L$4 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
            i12 = i11;
            transferAccountHelper$fetchBalanceList$1.I$0 = i12;
            z12 = z11;
            transferAccountHelper$fetchBalanceList$1.Z$0 = z12;
            transferAccountHelper$fetchBalanceList$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM64498c, transferAccountHelper$fetchBalanceList$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = transferAccountHelper$fetchBalanceList$1.Z$0;
            int i15 = transferAccountHelper$fetchBalanceList$1.I$0;
            Function1<? super AccountType, Unit> function3 = (Function1) transferAccountHelper$fetchBalanceList$1.L$3;
            BalanceEntity balanceEntity3 = (BalanceEntity) transferAccountHelper$fetchBalanceList$1.L$2;
            str3 = (String) transferAccountHelper$fetchBalanceList$1.L$1;
            String str5 = (String) transferAccountHelper$fetchBalanceList$1.L$0;
            ResultKt.throwOnFailure(obj);
            z12 = z13;
            str4 = str5;
            function2 = function3;
            balanceEntity2 = balanceEntity3;
            objM42830k = obj;
            i12 = i15;
        }
        List<SingleCurrencyBalance> list = (List) objM42830k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((SingleCurrencyBalance) next).getAccountType(), "CONTRACT"));
            SingleCurrencyBalance singleCurrencyBalance = (SingleCurrencyBalance) next;
            if (singleCurrencyBalance != null) {
                singleCurrencyBalance.setAvailableBalance(C27039d.m66656p(balanceEntity2 != null ? balanceEntity2.getWithdrawBalance() : null));
            }
        } else {
            list = null;
        }
        this.f52693d.put(str4, list == null ? CollectionsKt.emptyList() : list);
        if (z12) {
            m64579i(i12, str3, list, function2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m64579i(int i11, String str, List<SingleCurrencyBalance> list, Function1<? super AccountType, Unit> function1) {
        SingleCurrencyBalance singleCurrencyBalance;
        Object next;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual(((SingleCurrencyBalance) obj).getAccountType(), str)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    BigDecimal availableBalance = ((SingleCurrencyBalance) next).getAvailableBalance();
                    do {
                        Object next2 = it.next();
                        BigDecimal availableBalance2 = ((SingleCurrencyBalance) next2).getAvailableBalance();
                        if (availableBalance.compareTo(availableBalance2) < 0) {
                            next = next2;
                            availableBalance = availableBalance2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            singleCurrencyBalance = (SingleCurrencyBalance) next;
        } else {
            singleCurrencyBalance = null;
        }
        function1.invoke(DowngradeExKt.m66538h(C41014a.m89941o(C27039d.m66647g(singleCurrencyBalance != null ? singleCurrencyBalance.getAvailableBalance() : null), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66650j(Integer.valueOf(i11)), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null), 0.0d, 1, null) <= 0.0d ? AccountType.MAIN : AccountType.INSTANCE.ofName(singleCurrencyBalance != null ? singleCurrencyBalance.getAccountType() : null));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<AccountItem> m64573c(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        SingleCurrencyBalance singleCurrencyBalance;
        SingleCurrencyBalance singleCurrencyBalancePrevious;
        SingleCurrencyBalance singleCurrencyBalance2;
        SingleCurrencyBalance singleCurrencyBalancePrevious2;
        if (!z11) {
            List<C37887k> list = this.f52690a;
            ArrayList<C37887k> arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual(((C37887k) obj).getF85267a().name(), str3) || Intrinsics.areEqual(str3, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (C37887k c37887k : arrayList) {
                AccountType f85267a = c37887k.getF85267a();
                boolean zAreEqual = Intrinsics.areEqual(c37887k.getF85267a().name(), str2);
                List<SingleCurrencyBalance> list2 = this.f52693d.get(str);
                if (list2 != null) {
                    ListIterator<SingleCurrencyBalance> listIterator = list2.listIterator(list2.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            singleCurrencyBalancePrevious = null;
                            break;
                        }
                        singleCurrencyBalancePrevious = listIterator.previous();
                    } while (!Intrinsics.areEqual(singleCurrencyBalancePrevious.getAccountType(), c37887k.getF85267a().name()));
                    singleCurrencyBalance = singleCurrencyBalancePrevious;
                } else {
                    singleCurrencyBalance = null;
                }
                arrayList2.add(new AccountItem(f85267a, zAreEqual, singleCurrencyBalance));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                SingleCurrencyBalance singleCurrencyBalance3 = ((AccountItem) obj2).getSingleCurrencyBalance();
                if (singleCurrencyBalance3 == null || (singleCurrencyBalance3.isOpen() && singleCurrencyBalance3.isSupportOut())) {
                    arrayList3.add(obj2);
                }
            }
            return arrayList3;
        }
        List<? extends AccountType> list3 = this.f52691b;
        ArrayList<AccountType> arrayList4 = new ArrayList();
        for (Object obj3 : list3) {
            AccountType accountType = (AccountType) obj3;
            if (Intrinsics.areEqual(accountType.name(), SharedPositionInfo.MARGIN_MODE_ISOLATED) || !Intrinsics.areEqual(accountType.name(), str3)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (AccountType accountType2 : arrayList4) {
            boolean zAreEqual2 = Intrinsics.areEqual(accountType2.name(), str2);
            List<SingleCurrencyBalance> list4 = this.f52693d.get(str);
            if (list4 != null) {
                ListIterator<SingleCurrencyBalance> listIterator2 = list4.listIterator(list4.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        singleCurrencyBalancePrevious2 = null;
                        break;
                    }
                    singleCurrencyBalancePrevious2 = listIterator2.previous();
                } while (!Intrinsics.areEqual(singleCurrencyBalancePrevious2.getAccountType(), accountType2.name()));
                singleCurrencyBalance2 = singleCurrencyBalancePrevious2;
            } else {
                singleCurrencyBalance2 = null;
            }
            arrayList5.add(new AccountItem(accountType2, zAreEqual2, singleCurrencyBalance2));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            SingleCurrencyBalance singleCurrencyBalance4 = ((AccountItem) obj4).getSingleCurrencyBalance();
            if (singleCurrencyBalance4 == null || (singleCurrencyBalance4.isOpen() && singleCurrencyBalance4.isSupportOut())) {
                arrayList6.add(obj4);
            }
        }
        List<AccountItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList6);
        new TransferHelper().m64492s(mutableList);
        return mutableList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<AccountItem> m64574d(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        C37887k c37887kPrevious;
        List<AccountType> listM85582b;
        SingleCurrencyBalance singleCurrencyBalance;
        SingleCurrencyBalance singleCurrencyBalancePrevious;
        SingleCurrencyBalance singleCurrencyBalance2;
        SingleCurrencyBalance singleCurrencyBalancePrevious2;
        if (z11) {
            List<? extends AccountType> list = this.f52691b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AccountType accountType : list) {
                boolean zAreEqual = Intrinsics.areEqual(accountType.name(), str3);
                List<SingleCurrencyBalance> list2 = this.f52693d.get(str);
                if (list2 != null) {
                    ListIterator<SingleCurrencyBalance> listIterator = list2.listIterator(list2.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            singleCurrencyBalancePrevious2 = null;
                            break;
                        }
                        singleCurrencyBalancePrevious2 = listIterator.previous();
                    } while (!Intrinsics.areEqual(singleCurrencyBalancePrevious2.getAccountType(), accountType.name()));
                    singleCurrencyBalance2 = singleCurrencyBalancePrevious2;
                } else {
                    singleCurrencyBalance2 = null;
                }
                arrayList.add(new AccountItem(accountType, zAreEqual, singleCurrencyBalance2));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                SingleCurrencyBalance singleCurrencyBalance3 = ((AccountItem) obj).getSingleCurrencyBalance();
                if (singleCurrencyBalance3 == null || (singleCurrencyBalance3.isOpen() && singleCurrencyBalance3.isSupportIn())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        List<C37887k> list3 = this.f52690a;
        ListIterator<C37887k> listIterator2 = list3.listIterator(list3.size());
        do {
            if (!listIterator2.hasPrevious()) {
                c37887kPrevious = null;
                break;
            }
            c37887kPrevious = listIterator2.previous();
        } while (!Intrinsics.areEqual(c37887kPrevious.getF85267a().name(), str2));
        C37887k c37887k = c37887kPrevious;
        if (c37887k == null || (listM85582b = c37887k.m85582b()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85582b, 10));
        for (AccountType accountType2 : listM85582b) {
            boolean zAreEqual2 = Intrinsics.areEqual(accountType2.name(), str3);
            List<SingleCurrencyBalance> list4 = this.f52693d.get(str);
            if (list4 != null) {
                ListIterator<SingleCurrencyBalance> listIterator3 = list4.listIterator(list4.size());
                do {
                    if (!listIterator3.hasPrevious()) {
                        singleCurrencyBalancePrevious = null;
                        break;
                    }
                    singleCurrencyBalancePrevious = listIterator3.previous();
                } while (!Intrinsics.areEqual(singleCurrencyBalancePrevious.getAccountType(), accountType2.name()));
                singleCurrencyBalance = singleCurrencyBalancePrevious;
            } else {
                singleCurrencyBalance = null;
            }
            arrayList3.add(new AccountItem(accountType2, zAreEqual2, singleCurrencyBalance));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            SingleCurrencyBalance singleCurrencyBalance4 = ((AccountItem) obj2).getSingleCurrencyBalance();
            if (singleCurrencyBalance4 == null || (singleCurrencyBalance4.isOpen() && singleCurrencyBalance4.isSupportIn())) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: f */
    public final TransferApi m64576f() {
        return (TransferApi) this.f52694e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<String> m64577g() {
        return this.f52692c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<String> m64578h(boolean z11, @Nullable String str, @Nullable String str2) {
        if (!z11) {
            return CollectionsKt.listOf(C27041f.m66668h(str));
        }
        List<String> list = this.f52692c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual((String) obj, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Intrinsics.areEqual((String) obj2, str2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: j */
    public final void m64580j() {
        List arrayList;
        Companion companion = f52689f;
        boolean zIsContractOpen = companion.isContractOpen();
        boolean zIsLeverOpen = companion.isLeverOpen();
        boolean zIsOptionOpen = companion.isOptionOpen();
        boolean zIsSavingsOpen = companion.isSavingsOpen();
        EnumEntries<AccountType> entries = AccountType.getEntries();
        ArrayList arrayList2 = new ArrayList();
        for (AccountType accountType : entries) {
            if (accountType.getSupportTransfer()) {
                arrayList2.add(accountType);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            AccountType accountType2 = (AccountType) obj;
            if (zIsSavingsOpen || accountType2 != AccountType.SAVINGS) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            AccountType accountType3 = (AccountType) obj2;
            if (zIsContractOpen || accountType3 != AccountType.CONTRACT) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            AccountType accountType4 = (AccountType) obj3;
            if (zIsLeverOpen || (accountType4 != AccountType.MARGIN && accountType4 != AccountType.ISOLATED)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            AccountType accountType5 = (AccountType) obj4;
            if (zIsOptionOpen || accountType5 != AccountType.OPTION) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : arrayList6) {
            AccountType accountType6 = (AccountType) obj5;
            if (C37827c.m85382a() || accountType6 != AccountType.UNIFIED) {
                arrayList7.add(obj5);
            }
        }
        List<AccountType> listM64582l = m64582l(arrayList7, !IUnifyAccountService.f53155a.get().mo64979C());
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM64582l, 10));
        for (AccountType accountType7 : listM64582l) {
            if (accountType7 != AccountType.ISOLATED) {
                arrayList = new ArrayList();
                for (Object obj6 : listM64582l) {
                    if (accountType7 != ((AccountType) obj6)) {
                        arrayList.add(obj6);
                    }
                }
            } else {
                arrayList = listM64582l;
            }
            arrayList8.add(new C37887k(accountType7, arrayList));
        }
        this.f52690a = arrayList8;
        this.f52691b = listM64582l;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM64582l, 10));
        Iterator<T> it = listM64582l.iterator();
        while (it.hasNext()) {
            arrayList9.add(((AccountType) it.next()).name());
        }
        this.f52692c = arrayList9;
        TransferLog.f52948a.m64781c("划转账户支持列表：" + this.f52690a);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m64581k(@NotNull String reverseFrom, @NotNull String reverseTo) {
        List<AccountType> listM85582b;
        Intrinsics.checkNotNullParameter(reverseFrom, "reverseFrom");
        Intrinsics.checkNotNullParameter(reverseTo, "reverseTo");
        List<C37887k> list = this.f52690a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (C37887k c37887k : list) {
            if (Intrinsics.areEqual(c37887k.getF85267a().name(), reverseFrom) && ((listM85582b = c37887k.m85582b()) == null || !listM85582b.isEmpty())) {
                Iterator<T> it = listM85582b.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((AccountType) it.next()).name(), reverseTo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final List<AccountType> m64582l(List<? extends AccountType> list, boolean z11) {
        if (!list.contains(AccountType.UNIFIED) || !z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountType) obj) != AccountType.UNIFIED) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(AccountType.UNIFIED));
    }

    /* JADX INFO: renamed from: b */
    public static final TransferApi m64572b() {
        return (TransferApi) C42597a.m93387c().create(TransferApi.class);
    }
}

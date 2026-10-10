package com.kubi.assets.sort;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.SaveAccountOrderConfigBody;
import com.kubi.assets.entity.SetAccountSortEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27017c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AccountTabSortSettingVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0094@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cJ\u000e\u0010'\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cJ\u000e\u0010(\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cJ$\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortSettingVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/assets/sort/AccountTabSortContract$UIState;", "<init>", "()V", "assetApiV2", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "cachedDisplayMode", "Lcom/kubi/assets/sort/DisplayMode;", "cachedSortType", "Lcom/kubi/assets/sort/SortType;", "cachedAccountList", "", "Lcom/kubi/assets/sort/AccountTabSortData;", "balanceCurrency", "", "getBalanceCurrency", "()Ljava/lang/String;", "initState", "getInitState", "()Lcom/kubi/assets/sort/AccountTabSortContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAccountData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSortMode", "mode", "(Lcom/kubi/assets/sort/DisplayMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAssetOverviewResponse", "assetOverview", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "onSortChanged", "accounts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortByAssetValue", "applySortByAssetValue", "cancelSortByAssetValue", "uploadSortConfig", "sortType", "(Lcom/kubi/assets/sort/SortType;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAccountOrder", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabSortSettingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortSettingVM.kt\ncom/kubi/assets/sort/AccountTabSortSettingVM\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,320:1\n32#2:321\n23#2,2:322\n23#2,2:324\n1563#3:326\n1634#3,3:327\n1563#3:330\n1634#3,3:331\n1068#3:334\n774#3:335\n865#3,2:336\n1563#3:338\n1634#3,3:339\n*S KotlinDebug\n*F\n+ 1 AccountTabSortSettingVM.kt\ncom/kubi/assets/sort/AccountTabSortSettingVM\n*L\n48#1:321\n143#1:322,2\n145#1:324,2\n174#1:326\n174#1:327,3\n178#1:330\n178#1:331,3\n218#1:334\n265#1:335\n265#1:336,2\n266#1:338\n266#1:339,3\n*E\n"})
public final class AccountTabSortSettingVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f18767b0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    public final AssetV2Api f18768X = (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public DisplayMode f18769Y = DisplayMode.RECOMMEND;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public SortType f18770Z = SortType.DEFAULT;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public List<AccountTabSortData> f18771a0 = CollectionsKt.emptyList();

    /* JADX INFO: compiled from: AccountTabSortSettingVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortSettingVM$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 AccountTabSortSettingVM.kt\ncom/kubi/assets/sort/AccountTabSortSettingVM\n*L\n1#1,328:1\n218#2:329\n*E\n"})
    public static final class C10985a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((AccountTabSortData) t12).getAssetValue(), ((AccountTabSortData) t11).getAssetValue());
        }
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m19311A(Exception exc, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, exc.getMessage(), 14, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m19312C(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, SortType.MANUAL, list, null, 19, null);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m19324q(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, SortType.VALUE_DESC, list, null, 19, null);
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m19325s(AccountTabSortSettingVM accountTabSortSettingVM, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, SortType.DEFAULT, accountTabSortSettingVM.f18771a0, null, 19, null);
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m19326w(DisplayMode displayMode, SortType sortType, List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(false, displayMode, sortType, list, null);
    }

    /* JADX INFO: renamed from: y */
    public static final UIState m19327y(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, true, null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m19328z(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, C27017c.f54310a.m66516f(R$string.failed, new Object[0]), 14, null);
    }

    /* JADX INFO: renamed from: B */
    public final Object m19329B(List<AccountTabSortData> list, Continuation<? super Unit> continuation) {
        AssetsLog assetsLog = AssetsLog.Common;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AccountTabSortSettingVM onSortChanged: ");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AccountTabSortData) it.next()).getBiz().getKey());
        }
        sb2.append(arrayList);
        assetsLog.m15236i(sb2.toString());
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AccountTabSortData.m19351b((AccountTabSortData) it2.next(), null, false, null, 7, null));
        }
        this.f18771a0 = arrayList2;
        AccountTabSortManager.f18789a.m19366i(arrayList2);
        updateState(new Function1() { // from class: com.kubi.assets.sort.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortSettingVM.m19312C(arrayList2, (UIState) obj);
            }
        });
        Object objM19333G = m19333G(SortType.MANUAL, arrayList2, continuation);
        return objM19333G == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19333G : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m19330D(Continuation<? super Unit> continuation) {
        AccountTabSortSettingVM$refreshAccountOrder$1 accountTabSortSettingVM$refreshAccountOrder$1;
        if (continuation instanceof AccountTabSortSettingVM$refreshAccountOrder$1) {
            accountTabSortSettingVM$refreshAccountOrder$1 = (AccountTabSortSettingVM$refreshAccountOrder$1) continuation;
            int i11 = accountTabSortSettingVM$refreshAccountOrder$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountTabSortSettingVM$refreshAccountOrder$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountTabSortSettingVM$refreshAccountOrder$1 = new AccountTabSortSettingVM$refreshAccountOrder$1(this, continuation);
            }
        } else {
            accountTabSortSettingVM$refreshAccountOrder$1 = new AccountTabSortSettingVM$refreshAccountOrder$1(this, continuation);
        }
        Object objM17178y1 = accountTabSortSettingVM$refreshAccountOrder$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountTabSortSettingVM$refreshAccountOrder$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM17178y1);
                AssetV2Api assetV2Api = this.f18768X;
                String strM19336t = m19336t();
                accountTabSortSettingVM$refreshAccountOrder$1.label = 1;
                objM17178y1 = assetV2Api.m17178y1(strM19336t, accountTabSortSettingVM$refreshAccountOrder$1);
                if (objM17178y1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM17178y1);
            }
            AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) ((BaseEntity) objM17178y1).getData();
            AssetsLog assetsLog = AssetsLog.Common;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountTabSortSettingVM refreshAccountOrder response: displayMode=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getDisplayMode() : null);
            sb2.append(", sortType=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getSortType() : null);
            assetsLog.m15236i(sb2.toString());
            if (assetV2OverviewEntity != null) {
                m19338v(assetV2OverviewEntity);
                send(C10992g.f18784a);
            } else {
                send(new LoadFailed(C27017c.f54310a.m66516f(R$string.failed, new Object[0])));
            }
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("AccountTabSortSettingVM refreshAccountOrder exception: " + e11.getMessage());
            String message = e11.getMessage();
            if (message == null) {
                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
            }
            send(new LoadFailed(message));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final Object m19331E(Continuation<? super Unit> continuation) {
        AssetsLog.Common.m15236i("AccountTabSortSettingVM sortByAssetValue, current sortType: " + this.f18770Z);
        if (this.f18770Z == SortType.VALUE_DESC) {
            Object objM19335r = m19335r(continuation);
            return objM19335r == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19335r : Unit.INSTANCE;
        }
        Object objM19334p = m19334p(continuation);
        return objM19334p == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19334p : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m19332F(DisplayMode displayMode, Continuation<? super Unit> continuation) {
        AccountTabSortSettingVM$updateSortMode$1 accountTabSortSettingVM$updateSortMode$1;
        if (continuation instanceof AccountTabSortSettingVM$updateSortMode$1) {
            accountTabSortSettingVM$updateSortMode$1 = (AccountTabSortSettingVM$updateSortMode$1) continuation;
            int i11 = accountTabSortSettingVM$updateSortMode$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountTabSortSettingVM$updateSortMode$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountTabSortSettingVM$updateSortMode$1 = new AccountTabSortSettingVM$updateSortMode$1(this, continuation);
            }
        } else {
            accountTabSortSettingVM$updateSortMode$1 = new AccountTabSortSettingVM$updateSortMode$1(this, continuation);
        }
        Object objM17152o0 = accountTabSortSettingVM$updateSortMode$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountTabSortSettingVM$updateSortMode$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM17152o0);
                if (this.f18769Y == displayMode) {
                    return Unit.INSTANCE;
                }
                AssetsLog.Common.m15236i("AccountTabSortSettingVM updateSortMode: " + displayMode);
                send(C10993h.f18785a);
                SetAccountSortEntity setAccountSortEntity = new SetAccountSortEntity(displayMode.getServerValue(), m19336t());
                AssetV2Api assetV2Api = this.f18768X;
                accountTabSortSettingVM$updateSortMode$1.L$0 = SpillingKt.nullOutSpilledVariable(displayMode);
                accountTabSortSettingVM$updateSortMode$1.L$1 = SpillingKt.nullOutSpilledVariable(setAccountSortEntity);
                accountTabSortSettingVM$updateSortMode$1.label = 1;
                objM17152o0 = assetV2Api.m17152o0(setAccountSortEntity, accountTabSortSettingVM$updateSortMode$1);
                if (objM17152o0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM17152o0);
            }
            AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) ((BaseEntity) objM17152o0).getData();
            AssetsLog assetsLog = AssetsLog.Common;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountTabSortSettingVM updateSortMode response: displayMode=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getDisplayMode() : null);
            sb2.append(", sortType=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getSortType() : null);
            assetsLog.m15236i(sb2.toString());
            if (assetV2OverviewEntity == null) {
                assetsLog.m15234e("AccountTabSortSettingVM updateSortMode failed: response is null");
                send(new LoadFailed(C27017c.f54310a.m66516f(R$string.failed, new Object[0])));
                return Unit.INSTANCE;
            }
            m19338v(assetV2OverviewEntity);
            send(C10992g.f18784a);
            return Unit.INSTANCE;
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("AccountTabSortSettingVM updateSortMode exception: " + e11.getMessage());
            String message = e11.getMessage();
            if (message == null) {
                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
            }
            send(new LoadFailed(message));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        if (m19330D(r0) == r1) goto L44;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19333G(SortType sortType, List<AccountTabSortData> list, Continuation<? super Unit> continuation) {
        AccountTabSortSettingVM$uploadSortConfig$1 accountTabSortSettingVM$uploadSortConfig$1;
        List arrayList;
        if (continuation instanceof AccountTabSortSettingVM$uploadSortConfig$1) {
            accountTabSortSettingVM$uploadSortConfig$1 = (AccountTabSortSettingVM$uploadSortConfig$1) continuation;
            int i11 = accountTabSortSettingVM$uploadSortConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountTabSortSettingVM$uploadSortConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountTabSortSettingVM$uploadSortConfig$1 = new AccountTabSortSettingVM$uploadSortConfig$1(this, continuation);
            }
        } else {
            accountTabSortSettingVM$uploadSortConfig$1 = new AccountTabSortSettingVM$uploadSortConfig$1(this, continuation);
        }
        Object objM17105U = accountTabSortSettingVM$uploadSortConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountTabSortSettingVM$uploadSortConfig$1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    List list2 = (List) accountTabSortSettingVM$uploadSortConfig$1.L$2;
                    list = (List) accountTabSortSettingVM$uploadSortConfig$1.L$1;
                    SortType sortType2 = (SortType) accountTabSortSettingVM$uploadSortConfig$1.L$0;
                    ResultKt.throwOnFailure(objM17105U);
                    arrayList = list2;
                    sortType = sortType2;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM17105U);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM17105U);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((AccountTabSortData) obj).getIsHide()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountTabSortData) it.next()).getBiz().getKey());
            }
            if (arrayList.isEmpty()) {
                AssetsLog.Common.m15234e("AccountTabSortSettingVM uploadSortConfig: accountTypeList is empty");
                return Unit.INSTANCE;
            }
            AssetsLog.Common.m15236i("AccountTabSortSettingVM uploadSortConfig: sortType=" + sortType.getServerValue() + ", accounts=" + arrayList);
            send(C10993h.f18785a);
            AssetV2Api assetV2Api = this.f18768X;
            SaveAccountOrderConfigBody saveAccountOrderConfigBody = new SaveAccountOrderConfigBody(sortType.getServerValue(), arrayList);
            accountTabSortSettingVM$uploadSortConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(sortType);
            accountTabSortSettingVM$uploadSortConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
            accountTabSortSettingVM$uploadSortConfig$1.L$2 = SpillingKt.nullOutSpilledVariable(arrayList);
            accountTabSortSettingVM$uploadSortConfig$1.label = 1;
            objM17105U = assetV2Api.m17105U(saveAccountOrderConfigBody, accountTabSortSettingVM$uploadSortConfig$1);
            if (objM17105U == coroutine_suspended) {
            }
            return coroutine_suspended;
            BaseEntity baseEntity = (BaseEntity) objM17105U;
            if (baseEntity.getSuccess()) {
                AssetsLog.Common.m15236i("AccountTabSortSettingVM uploadSortConfig success");
                accountTabSortSettingVM$uploadSortConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(sortType);
                accountTabSortSettingVM$uploadSortConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                accountTabSortSettingVM$uploadSortConfig$1.L$2 = SpillingKt.nullOutSpilledVariable(arrayList);
                accountTabSortSettingVM$uploadSortConfig$1.L$3 = SpillingKt.nullOutSpilledVariable(baseEntity);
                accountTabSortSettingVM$uploadSortConfig$1.label = 2;
            } else {
                AssetsLog.Common.m15234e("AccountTabSortSettingVM uploadSortConfig failed: " + baseEntity.getMsg());
                String msg = baseEntity.getMsg();
                if (msg == null) {
                    msg = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
                }
                send(new LoadFailed(msg));
            }
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("AccountTabSortSettingVM uploadSortConfig exception: " + e11.getMessage());
            String message = e11.getMessage();
            if (message == null) {
                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
            }
            send(new LoadFailed(message));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        AssetsLog.Common.m15236i("AccountTabSortSettingVM dispatchIntent: " + interfaceC19282d);
        if (interfaceC19282d instanceof AccountTabSortContract$UiIntent.LoadData) {
            Object objM19339x = m19339x(continuation);
            return objM19339x == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19339x : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof AccountTabSortContract$UiIntent.UpdateSortMode) {
            Object objM19332F = m19332F(((AccountTabSortContract$UiIntent.UpdateSortMode) interfaceC19282d).getMode(), continuation);
            return objM19332F == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19332F : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof AccountTabSortContract$UiIntent.OnSortChanged) {
            Object objM19329B = m19329B(((AccountTabSortContract$UiIntent.OnSortChanged) interfaceC19282d).getAccounts(), continuation);
            return objM19329B == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19329B : Unit.INSTANCE;
        }
        if (!(interfaceC19282d instanceof AccountTabSortContract$UiIntent.SortByAssetValue)) {
            return Unit.INSTANCE;
        }
        Object objM19331E = m19331E(continuation);
        return objM19331E == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19331E : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final Object m19334p(Continuation<? super Unit> continuation) {
        AssetsLog.Common.m15236i("AccountTabSortSettingVM applySortByAssetValue");
        final List<AccountTabSortData> listSortedWith = CollectionsKt.sortedWith(this.f18771a0, new C10985a());
        this.f18771a0 = listSortedWith;
        SortType sortType = SortType.VALUE_DESC;
        this.f18770Z = sortType;
        AccountTabSortManager.f18789a.m19366i(listSortedWith);
        updateState(new Function1() { // from class: com.kubi.assets.sort.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortSettingVM.m19324q(listSortedWith, (UIState) obj);
            }
        });
        Object objM19333G = m19333G(sortType, listSortedWith, continuation);
        return objM19333G == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19333G : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public final Object m19335r(Continuation<? super Unit> continuation) {
        AssetsLog.Common.m15236i("AccountTabSortSettingVM cancelSortByAssetValue");
        SortType sortType = SortType.DEFAULT;
        this.f18770Z = sortType;
        AccountTabSortManager.f18789a.m19366i(this.f18771a0);
        updateState(new Function1() { // from class: com.kubi.assets.sort.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortSettingVM.m19325s(this.f18798b, (UIState) obj);
            }
        });
        Object objM19333G = m19333G(sortType, this.f18771a0, continuation);
        return objM19333G == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19333G : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final String m19336t() {
        return AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        DisplayMode displayModeFromServerValue = DisplayMode.INSTANCE.fromServerValue(C46392a.m102326h(C42153h.f93593a.m92513c(), DisplayMode.RECOMMEND.getServerValue()));
        this.f18769Y = displayModeFromServerValue;
        return new UIState(false, displayModeFromServerValue, null, null, null, 29, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m19338v(AssetV2OverviewEntity assetV2OverviewEntity) {
        final DisplayMode displayModeFromServerValue = DisplayMode.INSTANCE.fromServerValue(assetV2OverviewEntity.getDisplayMode());
        final SortType sortTypeFromServerValue = SortType.INSTANCE.fromServerValue(assetV2OverviewEntity.getSortType());
        this.f18769Y = displayModeFromServerValue;
        this.f18770Z = sortTypeFromServerValue;
        C42153h c42153h = C42153h.f93593a;
        C46392a.m102333p(c42153h.m92513c(), displayModeFromServerValue.getServerValue());
        C46392a.m102333p(c42153h.m92536z(), sortTypeFromServerValue.getServerValue());
        AccountTabSortManager accountTabSortManager = AccountTabSortManager.f18789a;
        accountTabSortManager.m19365h();
        final List<AccountTabSortData> listM19358a = accountTabSortManager.m19358a(assetV2OverviewEntity);
        this.f18771a0 = listM19358a;
        accountTabSortManager.m19366i(listM19358a);
        AssetsLog.Common.m15236i("AccountTabSortSettingVM handleAssetOverviewResponse: mode=" + displayModeFromServerValue + ", sortType=" + sortTypeFromServerValue + ", accounts=" + listM19358a.size());
        updateState(new Function1() { // from class: com.kubi.assets.sort.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortSettingVM.m19326w(displayModeFromServerValue, sortTypeFromServerValue, listM19358a, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m19339x(Continuation<? super Unit> continuation) {
        AccountTabSortSettingVM$loadAccountData$1 accountTabSortSettingVM$loadAccountData$1;
        if (continuation instanceof AccountTabSortSettingVM$loadAccountData$1) {
            accountTabSortSettingVM$loadAccountData$1 = (AccountTabSortSettingVM$loadAccountData$1) continuation;
            int i11 = accountTabSortSettingVM$loadAccountData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountTabSortSettingVM$loadAccountData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountTabSortSettingVM$loadAccountData$1 = new AccountTabSortSettingVM$loadAccountData$1(this, continuation);
            }
        } else {
            accountTabSortSettingVM$loadAccountData$1 = new AccountTabSortSettingVM$loadAccountData$1(this, continuation);
        }
        Object objM17178y1 = accountTabSortSettingVM$loadAccountData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountTabSortSettingVM$loadAccountData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM17178y1);
                AssetsLog.Common.m15236i("AccountTabSortSettingVM loadAccountData start");
                updateState(new Function1() { // from class: com.kubi.assets.sort.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountTabSortSettingVM.m19327y((UIState) obj);
                    }
                });
                AssetV2Api assetV2Api = this.f18768X;
                String strM19336t = m19336t();
                accountTabSortSettingVM$loadAccountData$1.label = 1;
                objM17178y1 = assetV2Api.m17178y1(strM19336t, accountTabSortSettingVM$loadAccountData$1);
                if (objM17178y1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM17178y1);
            }
            AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) ((BaseEntity) objM17178y1).getData();
            AssetsLog assetsLog = AssetsLog.Common;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountTabSortSettingVM loadAccountData response: displayMode=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getDisplayMode() : null);
            sb2.append(", sortType=");
            sb2.append(assetV2OverviewEntity != null ? assetV2OverviewEntity.getSortType() : null);
            assetsLog.m15236i(sb2.toString());
            if (assetV2OverviewEntity != null) {
                m19338v(assetV2OverviewEntity);
                send(C10992g.f18784a);
                return Unit.INSTANCE;
            }
            assetsLog.m15234e("AccountTabSortSettingVM loadAccountData failed: assetOverview is null");
            updateState(new Function1() { // from class: com.kubi.assets.sort.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountTabSortSettingVM.m19328z((UIState) obj);
                }
            });
            send(new LoadFailed(C27017c.f54310a.m66516f(R$string.failed, new Object[0])));
            return Unit.INSTANCE;
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("AccountTabSortSettingVM loadAccountData exception: " + e11.getMessage());
            updateState(new Function1() { // from class: com.kubi.assets.sort.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountTabSortSettingVM.m19311A(e11, (UIState) obj);
                }
            });
            String message = e11.getMessage();
            if (message == null) {
                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
            }
            send(new LoadFailed(message));
        }
    }
}

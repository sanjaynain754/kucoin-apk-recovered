package com.kubi.assets.filter;

import android.content.Context;
import android.text.TextUtils;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27059l;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0010J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J$\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b0$2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J$\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0017JG\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00172\u0006\u0010+\u001a\u00020,2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010/\u001a\u00020\u0010¢\u0006\u0002\u00100R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bRH\u0010\u000b\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\fj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r`\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013RH\u0010\u0014\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\fj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r`\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013RF\u0010\u0019\u001a:\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b0\u001aj\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterHelper;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "defaultGroupList", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "", "", "Lkotlin/collections/ArrayList;", "getDefaultGroupList", "()Ljava/util/ArrayList;", "unifiedGroupList", "getUnifiedGroupList", "getAssetsMostUsed", "", "fromType", "cacheFilterTypeList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getFilterTypeList", "type", "fetchFilterTypeList", "", "callBack", "Lio/reactivex/functions/Action;", "getFilterTypeApi", "Lkotlinx/coroutines/flow/Flow;", "getFilterDataByType", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "initParams", "Lcom/kubi/assets/filter/ParcelizePair;", "groupList", "Lcom/kubi/assets/filter/AssetFilterRecyclerView$FilterGroupList;", "context", "Landroid/content/Context;", "filterData", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "filterKey", "(Landroid/content/Context;Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$IFilter;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1869#2,2:296\n1563#2:298\n1634#2,2:299\n1056#2:309\n1636#2:310\n1869#2:315\n1869#2,2:316\n1870#2:318\n11318#3:301\n11429#3,4:302\n3829#3:306\n4344#3,2:307\n4154#3:311\n4254#3,2:312\n1#4:314\n*S KotlinDebug\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper\n*L\n233#1:296,2\n237#1:298\n237#1:299,2\n246#1:309\n237#1:310\n273#1:315\n274#1:316,2\n273#1:318\n239#1:301\n239#1:302,4\n245#1:306\n245#1:307,2\n258#1:311\n258#1:312,2\n*E\n"})
public final class AssetFilterHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetFilterHelper f17335a = new AssetFilterHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17336b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.filter.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterHelper.m16576d();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, Map<String, String>> f17337c = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.assets.filter.AssetFilterHelper$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper\n*L\n1#1,328:1\n246#2:329\n*E\n"})
    public static final class C9924a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f17338b;

        public C9924a(Map map) {
            this.f17338b = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues((Integer) this.f17338b.get(((FilterType.InterfaceC23033b) t11).getF44545b()), (Integer) this.f17338b.get(((FilterType.InterfaceC23033b) t12).getF44545b()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m16577f(AssetFilterHelper assetFilterHelper, String str, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 2) != 0) {
            action = null;
        }
        assetFilterHelper.m16578e(str, action);
    }

    /* JADX INFO: renamed from: e */
    public final void m16578e(@NotNull String type, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(type, "type");
        String str = MultiLanguageManager.f46811g.getLocalString() + type;
        Map<String, String> map = f17337c.get(str);
        if (map == null || map.isEmpty()) {
            MviExKt.m42518n(new AssetFilterHelper$fetchFilterTypeList$1(type, str, action, null));
        } else if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public final AssetV2Api m16579g() {
        return (AssetV2Api) f17336b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final List<Pair<Integer, String[]>> m16580h(String str) {
        return Intrinsics.areEqual(str, "UNIFIED") ? m16585m() : m16581i();
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList<Pair<Integer, String[]>> m16581i() {
        ArrayList<Pair<Integer, String[]>> arrayList = new ArrayList<>();
        if (AssetExKt.m15129q()) {
            arrayList.add(new Pair<>(Integer.valueOf(R$string.assets_most_used), new String[]{"DEPOSIT", "WITHDRAW", "BUY_CURRENCY", "SELL_CURRENCY", "FIAT_BALANCE_DEAL", "FIAT_OUT", AccountDetailEntity.FLASH_TRADE, "FLASH_CONVERT", "EARN_REDEEM", "EARN_INCOME", "EARN_LOCK", "EARN_HOLD_INCOME"}));
            return arrayList;
        }
        arrayList.add(new Pair<>(Integer.valueOf(R$string.assets_most_used), new String[]{"DEPOSIT", "WITHDRAW", "TRANSFER", "MARGIN_LOAN_LEND", "REWARDS", "AIRDROP_FORK", "TRADE_EXCHANGE", AccountDetailEntity.FLASH_TRADE, "EARN_INCOME"}));
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<C23034a.a> m16582j(@Nullable String str, @NotNull List<ParcelizePair> initParams) {
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return FilterAccountType.C9929c.f17353a.m16605a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return FilterAccountType.C9932f.f17356a.m16608a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case 2157622:
                    if (str.equals("FIAT")) {
                        return FilterAccountType.C9930d.f17354a.m16606a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case 2358713:
                    if (str.equals("MAIN")) {
                        return FilterAccountType.C9927a.f17351a.m16603a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case 80083268:
                    if (str.equals("TRADE")) {
                        return FilterAccountType.C9928b.f17352a.m16604a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case 431050098:
                    if (str.equals("UNIFIED")) {
                        return FilterAccountType.C9933g.f17357a.m16609a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
                case 1358406937:
                    if (str.equals(SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                        return FilterAccountType.C9931e.f17355a.m16607a(C27059l.f54343a.m66757a(), initParams);
                    }
                    break;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC41634e<Map<String, String>> m16583k(String str) {
        return Intrinsics.areEqual(str, "UNIFIED") ? m16579g().m17123c1() : m16579g().m17118b(str);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Map<String, String> m16584l(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f17337c.get(MultiLanguageManager.f46811g.getLocalString() + type);
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList<Pair<Integer, String[]>> m16585m() {
        ArrayList<Pair<Integer, String[]>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>(Integer.valueOf(R$string.assets_most_used), new String[]{"SPOT_EXCHANGE", "FUTURES_EXCHANGE_OPEN", "FUTURES_EXCHANGE_CLOSE", "FUNDING_FEE", "TRANSFER"}));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<AssetFilterRecyclerView.FilterGroupList> m16586n(@NotNull Context context, @Nullable String str, @NotNull FilterType.InterfaceC23033b[] filterData, @NotNull List<ParcelizePair> initParams, @NotNull String filterKey) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(filterKey, "filterKey");
        List<Pair<Integer, String[]>> listM16580h = m16580h(str == null ? "" : str);
        HashSet hashSet = new HashSet();
        Iterator<T> it = listM16580h.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, (Object[]) ((Pair) it.next()).getSecond());
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16580h, 10));
        Iterator it2 = listM16580h.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            Object[] objArr = (Object[]) pair.getSecond();
            ArrayList arrayList2 = new ArrayList(objArr.length);
            int length = objArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList2.add(TuplesKt.m90091to((String) objArr[i11], Integer.valueOf(i12)));
                i11++;
                i12++;
            }
            Map map = MapsKt.toMap(arrayList2);
            String string = context.getString(((Number) pair.getFirst()).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ArrayList arrayList3 = new ArrayList();
            int length2 = filterData.length;
            int i13 = 0;
            while (i13 < length2) {
                FilterType.InterfaceC23033b interfaceC23033b = filterData[i13];
                Iterator it3 = it2;
                if (ArraysKt.contains((String[]) pair.getSecond(), interfaceC23033b.getF44545b())) {
                    arrayList3.add(interfaceC23033b);
                }
                i13++;
                it2 = it3;
            }
            Iterator it4 = it2;
            List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList3, new C9924a(map)));
            String string2 = context.getString(R$string.all);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            mutableList.add(0, new FilterType.C23032a(string2, ""));
            Unit unit = Unit.INSTANCE;
            arrayList.add(new AssetFilterRecyclerView.FilterGroupList(false, string, mutableList));
            it2 = it4;
        }
        List<AssetFilterRecyclerView.FilterGroupList> mutableList2 = CollectionsKt.toMutableList((Collection) arrayList);
        String string3 = context.getString(R$string.more);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ArrayList arrayList4 = new ArrayList();
        for (FilterType.InterfaceC23033b interfaceC23033b2 : filterData) {
            if (!hashSet.contains(interfaceC23033b2.getF44545b())) {
                arrayList4.add(interfaceC23033b2);
            }
        }
        List mutableList3 = CollectionsKt.toMutableList((Collection) arrayList4);
        String string4 = context.getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        mutableList3.add(0, new FilterType.C23032a(string4, ""));
        Unit unit2 = Unit.INSTANCE;
        mutableList2.add(new AssetFilterRecyclerView.FilterGroupList(false, string3, mutableList3));
        Iterator<T> it5 = initParams.iterator();
        do {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
        } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), filterKey));
        ParcelizePair parcelizePair = (ParcelizePair) next;
        String value = parcelizePair != null ? parcelizePair.getValue() : null;
        String str2 = value != null ? value : "";
        if (TextUtils.isEmpty(str2)) {
            Iterator<T> it6 = mutableList2.iterator();
            while (it6.hasNext()) {
                for (FilterType.InterfaceC23033b interfaceC23033b3 : ((AssetFilterRecyclerView.FilterGroupList) it6.next()).m16594b()) {
                    interfaceC23033b3.mo55155c(Intrinsics.areEqual(interfaceC23033b3.getF44545b(), str2));
                }
            }
            AssetFilterRecyclerView.FilterGroupList filterGroupList = (AssetFilterRecyclerView.FilterGroupList) CollectionsKt.firstOrNull((List) mutableList2);
            if (filterGroupList != null) {
                filterGroupList.m16596d(true);
                return mutableList2;
            }
        } else {
            int size = mutableList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                AssetFilterRecyclerView.FilterGroupList filterGroupList2 = mutableList2.get(i14);
                int size2 = filterGroupList2.m16594b().size();
                for (int i15 = 0; i15 < size2; i15++) {
                    FilterType.InterfaceC23033b interfaceC23033b4 = filterGroupList2.m16594b().get(i15);
                    interfaceC23033b4.mo55155c(Intrinsics.areEqual(interfaceC23033b4.getF44545b(), str2));
                    if (interfaceC23033b4.getF44546c()) {
                        filterGroupList2.m16596d(true);
                        return mutableList2;
                    }
                }
            }
        }
        return mutableList2;
    }

    /* JADX INFO: renamed from: d */
    public static final AssetV2Api m16576d() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}

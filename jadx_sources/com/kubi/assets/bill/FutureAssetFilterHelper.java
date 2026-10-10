package com.kubi.assets.bill;

import android.content.Context;
import android.text.TextUtils;
import com.kubi.assets.R$string;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FutureRecordFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\tH\u0002J\u001c\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\tJ\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)J6\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+0\u0005j\b\u0012\u0004\u0012\u00020+`\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010/\u001a\u000200J?\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010,\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\b2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0002\u00106RO\u0010\u0004\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013RO\u0010\u0015\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\u0013RF\u0010\u001b\u001a:\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d0\u001cj\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d`\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/kubi/assets/bill/FutureAssetFilterHelper;", "", "<init>", "()V", "groupListSelf", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "", "", "Lkotlin/collections/ArrayList;", "getGroupListSelf", "()Ljava/util/ArrayList;", "groupListSelf$delegate", "Lkotlin/Lazy;", "groupAllListSelf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getGroupAllListSelf", "()Ljava/util/HashSet;", "groupAllListSelf$delegate", "groupListTrial", "getGroupListTrial", "groupListTrial$delegate", "groupAllListTrial", "getGroupAllListTrial", "groupAllListTrial$delegate", "cacheFilterTypeList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getFilterTypeList", "type", "getBizNameStr", "fundsType", "bizType", "fetchFilterTypeList", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "callBack", "Lio/reactivex/functions/Action;", "getFilterDataByType", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "context", "Landroid/content/Context;", "initFundsType", "isSameFundsType", "", "groupList", "", "Lcom/kubi/assets/bill/FutureRecordFilterRecyclerView$FilterGroupList;", "filterData", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "(Landroid/content/Context;[Lcom/kubi/resources/widget/drop/FilterType$IFilter;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureRecordFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureRecordFilterHelper.kt\ncom/kubi/assets/bill/FutureAssetFilterHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n47#2,4:218\n13472#3,2:222\n13472#3,2:224\n3829#3:229\n4344#3,2:230\n4154#3:233\n4254#3,2:234\n1563#4:226\n1634#4,2:227\n1636#4:232\n1869#4:236\n1869#4,2:237\n1870#4:239\n1869#4,2:240\n1869#4,2:242\n*S KotlinDebug\n*F\n+ 1 FutureRecordFilterHelper.kt\ncom/kubi/assets/bill/FutureAssetFilterHelper\n*L\n103#1:218,4\n138#1:222,2\n148#1:224,2\n170#1:229\n170#1:230,2\n181#1:233\n181#1:234,2\n167#1:226\n167#1:227,2\n167#1:232\n195#1:236\n196#1:237,2\n195#1:239\n48#1:240,2\n69#1:242,2\n*E\n"})
public final class FutureAssetFilterHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FutureAssetFilterHelper f16700a = new FutureAssetFilterHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f16701b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.x1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureAssetFilterHelper.m15758r();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f16702c = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.y1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureAssetFilterHelper.m15756o();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f16703d = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.z1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureAssetFilterHelper.m15759s();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f16704e = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.a2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureAssetFilterHelper.m15757p();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final HashMap<String, Map<String, String>> f16705f = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.assets.bill.FutureAssetFilterHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FutureRecordFilterHelper.kt\ncom/kubi/assets/bill/FutureAssetFilterHelper\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,49:1\n104#2:50\n107#2:53\n19#3,2:51\n*S KotlinDebug\n*F\n+ 1 FutureRecordFilterHelper.kt\ncom/kubi/assets/bill/FutureAssetFilterHelper\n*L\n104#1:51,2\n*E\n"})
    public static final class C9571a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Action f16706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9571a(CoroutineExceptionHandler.Companion companion, Action action) {
            super(companion);
            this.f16706b = action;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C42917g.m94139e().execute(new RunnableC9572b(this.f16706b));
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.FutureAssetFilterHelper$b */
    /* JADX INFO: compiled from: FutureRecordFilterHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC9572b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Action f16707b;

        public RunnableC9572b(Action action) {
            this.f16707b = action;
        }

        @Override // java.lang.Runnable
        public final void run() throws Exception {
            Action action = this.f16707b;
            if (action != null) {
                action.run();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15755g(FutureAssetFilterHelper futureAssetFilterHelper, InterfaceC41709m0 interfaceC41709m0, String str, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            action = null;
        }
        futureAssetFilterHelper.m15760f(interfaceC41709m0, str, action);
    }

    /* JADX INFO: renamed from: o */
    public static final HashSet m15756o() {
        HashSet hashSet = new HashSet();
        Iterator<T> it = f16700a.m15766m().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, (Object[]) ((Pair) it.next()).getSecond());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: p */
    public static final HashSet m15757p() {
        HashSet hashSet = new HashSet();
        Iterator<T> it = f16700a.m15767n().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, (Object[]) ((Pair) it.next()).getSecond());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: r */
    public static final ArrayList m15758r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(R$string.assets_most_used), new String[]{"PNL", "FUNDING_FEE", "TRANSFER", "TRADE_FEE", "TAX", "TRIAL_WITHDRAW"}));
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m15759s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(R$string.assets_most_used), new String[]{"REWARD", "PNL", "TRADE_FEE", "FUNDING_FEE", "RECYCLE"}));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m15760f(@NotNull InterfaceC41709m0 coroutineScope, @NotNull String type, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(type, "type");
        String str = MultiLanguageManager.f46811g.getLocalString() + type;
        Map<String, String> map = f16705f.get(str);
        if (map == null || map.isEmpty()) {
            C41696j.m91104d(coroutineScope, C42911a.m94120b().plus(new C9571a(CoroutineExceptionHandler.INSTANCE, action)), null, new FutureAssetFilterHelper$fetchFilterTypeList$1(type, str, action, null), 2, null);
        } else if (action != null) {
            action.run();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ArrayList<C23034a.a> m15762i(@NotNull Context context, @NotNull String initFundsType, @NotNull String bizType, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initFundsType, "initFundsType");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        ArrayList<C23034a.a> arrayList = new ArrayList<>();
        String string = context.getString(R$string.kumex_funds_type);
        String string2 = context.getString(R$string.kumex_self_balance);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        FilterType.C23032a c23032a = new FilterType.C23032a(string2, "selfFunds");
        String string3 = context.getString(R$string.kumex_trial_balance);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C23034a.a aVar = new C23034a.a(string, new FilterType.C23032a[]{c23032a, new FilterType.C23032a(string3, "trialFunds")});
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b : interfaceC23033bArrM55168b) {
            interfaceC23033b.mo55155c(Intrinsics.areEqual(interfaceC23033b.getF44545b(), initFundsType));
        }
        arrayList.add(aVar);
        Map<String, String> mapM15763j = m15763j(initFundsType);
        if (mapM15763j == null) {
            mapM15763j = MapsKt.emptyMap();
        }
        C23034a.a aVar2 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(FilterType.f44543a, mapM15763j, false, 2, null));
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b2 : interfaceC23033bArrM55168b2) {
            interfaceC23033b2.mo55155c(Intrinsics.areEqual(interfaceC23033b2.getF44545b(), z11 ? bizType : ""));
        }
        arrayList.add(aVar2);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, String> m15763j(String str) {
        return f16705f.get(MultiLanguageManager.f46811g.getLocalString() + str);
    }

    /* JADX INFO: renamed from: k */
    public final HashSet<String> m15764k() {
        return (HashSet) f16702c.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final HashSet<String> m15765l() {
        return (HashSet) f16704e.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList<Pair<Integer, String[]>> m15766m() {
        return (ArrayList) f16701b.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final ArrayList<Pair<Integer, String[]>> m15767n() {
        return (ArrayList) f16703d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<FutureRecordFilterRecyclerView.FilterGroupList> m15768q(@NotNull Context context, @NotNull FilterType.InterfaceC23033b[] filterData, boolean z11, @NotNull String bizType, @NotNull String fundsType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        ArrayList<Pair<Integer, String[]>> arrayListM15766m = Intrinsics.areEqual(fundsType, "selfFunds") ? m15766m() : m15767n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM15766m, 10));
        Iterator it = arrayListM15766m.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String string = context.getString(((Number) pair.getFirst()).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ArrayList arrayList2 = new ArrayList();
            int length = filterData.length;
            int i11 = 0;
            while (i11 < length) {
                FilterType.InterfaceC23033b interfaceC23033b = filterData[i11];
                Iterator it2 = it;
                if (ArraysKt.contains((String[]) pair.getSecond(), interfaceC23033b.getF44545b())) {
                    arrayList2.add(interfaceC23033b);
                }
                i11++;
                it = it2;
            }
            Iterator it3 = it;
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
            String string2 = context.getString(R$string.all);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            mutableList.add(0, new FilterType.C23032a(string2, ""));
            Unit unit = Unit.INSTANCE;
            arrayList.add(new FutureRecordFilterRecyclerView.FilterGroupList(false, string, mutableList));
            it = it3;
        }
        List<FutureRecordFilterRecyclerView.FilterGroupList> mutableList2 = CollectionsKt.toMutableList((Collection) arrayList);
        String string3 = context.getString(R$string.more);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ArrayList arrayList3 = new ArrayList();
        for (FilterType.InterfaceC23033b interfaceC23033b2 : filterData) {
            if (!(Intrinsics.areEqual(fundsType, "selfFunds") ? f16700a.m15764k() : f16700a.m15765l()).contains(interfaceC23033b2.getF44545b())) {
                arrayList3.add(interfaceC23033b2);
            }
        }
        List mutableList3 = CollectionsKt.toMutableList((Collection) arrayList3);
        String string4 = context.getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        mutableList3.add(0, new FilterType.C23032a(string4, ""));
        Unit unit2 = Unit.INSTANCE;
        mutableList2.add(new FutureRecordFilterRecyclerView.FilterGroupList(false, string3, mutableList3));
        if (TextUtils.isEmpty(bizType) || !z11) {
            Iterator<T> it4 = mutableList2.iterator();
            while (it4.hasNext()) {
                for (FilterType.InterfaceC23033b interfaceC23033b3 : ((FutureRecordFilterRecyclerView.FilterGroupList) it4.next()).m15790b()) {
                    interfaceC23033b3.mo55155c(Intrinsics.areEqual(interfaceC23033b3.getF44545b(), ""));
                }
            }
            FutureRecordFilterRecyclerView.FilterGroupList filterGroupList = (FutureRecordFilterRecyclerView.FilterGroupList) CollectionsKt.firstOrNull((List) mutableList2);
            if (filterGroupList != null) {
                filterGroupList.m15792d(true);
            }
        } else {
            int size = mutableList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                FutureRecordFilterRecyclerView.FilterGroupList filterGroupList2 = mutableList2.get(i12);
                int size2 = filterGroupList2.m15790b().size();
                for (int i13 = 0; i13 < size2; i13++) {
                    FilterType.InterfaceC23033b interfaceC23033b4 = filterGroupList2.m15790b().get(i13);
                    interfaceC23033b4.mo55155c(Intrinsics.areEqual(interfaceC23033b4.getF44545b(), bizType));
                    if (interfaceC23033b4.getF44546c()) {
                        filterGroupList2.m15792d(true);
                        return mutableList2;
                    }
                }
            }
        }
        return mutableList2;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m15761h(@Nullable String str, @Nullable String str2) {
        Map<String, String> mapM15763j = m15763j(C27041f.m66668h(str));
        if (mapM15763j != null) {
            return mapM15763j.get(str2);
        }
        return null;
    }
}

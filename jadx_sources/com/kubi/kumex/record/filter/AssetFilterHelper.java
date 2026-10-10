package com.kubi.kumex.record.filter;

import android.content.Context;
import android.text.TextUtils;
import com.kubi.kumex.R$string;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.function.language.MultiLanguageManager;
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

/* JADX INFO: compiled from: RecordFilterHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\tH\u0002J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&JF\u0010'\u001a\u0012\u0012\u0004\u0012\u00020(0\u0005j\b\u0012\u0004\u0012\u00020(`\n2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200J?\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010)\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\b2\u0006\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020\t2\u0006\u00106\u001a\u00020\t¢\u0006\u0002\u00107RO\u0010\u0004\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013RO\u0010\u0015\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\u0013RF\u0010\u001b\u001a:\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d0\u001cj\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d`\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/kumex/record/filter/AssetFilterHelper;", "", "<init>", "()V", "groupListSelf", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "", "", "Lkotlin/collections/ArrayList;", "getGroupListSelf", "()Ljava/util/ArrayList;", "groupListSelf$delegate", "Lkotlin/Lazy;", "groupAllListSelf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getGroupAllListSelf", "()Ljava/util/HashSet;", "groupAllListSelf$delegate", "groupListTrial", "getGroupListTrial", "groupListTrial$delegate", "groupAllListTrial", "getGroupAllListTrial", "groupAllListTrial$delegate", "cacheFilterTypeList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getFilterTypeList", "type", "fetchFilterTypeList", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "callBack", "Lio/reactivex/functions/Action;", "getFilterDataByType", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "context", "Landroid/content/Context;", "sideType", "timeType", "initFundsType", "bizType", "isSameFundsType", "", "groupList", "", "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$FilterGroupList;", "filterData", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "fundsType", "(Landroid/content/Context;[Lcom/kubi/resources/widget/drop/FilterType$IFilter;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n47#2,4:244\n13472#3,2:248\n13472#3,2:250\n13472#3,2:252\n13472#3,2:254\n3829#3:259\n4344#3,2:260\n4154#3:263\n4254#3,2:264\n1563#4:256\n1634#4,2:257\n1636#4:262\n1869#4:266\n1869#4,2:267\n1870#4:269\n1869#4,2:270\n1869#4,2:272\n*S KotlinDebug\n*F\n+ 1 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n*L\n101#1:244,4\n139#1:248,2\n152#1:250,2\n164#1:252,2\n174#1:254,2\n196#1:259\n196#1:260,2\n207#1:263\n207#1:264,2\n193#1:256\n193#1:257,2\n193#1:262\n221#1:266\n222#1:267,2\n221#1:269\n53#1:270,2\n74#1:272,2\n*E\n"})
public final class AssetFilterHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetFilterHelper f30236a = new AssetFilterHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f30237b = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterHelper.m35746q();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f30238c = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterHelper.m35744n();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f30239d = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterHelper.m35747r();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f30240e = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterHelper.m35745o();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final HashMap<String, Map<String, String>> f30241f = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.kumex.record.filter.AssetFilterHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,49:1\n102#2:50\n105#2:53\n19#3,2:51\n*S KotlinDebug\n*F\n+ 1 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n*L\n102#1:51,2\n*E\n"})
    public static final class C16705a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Action f30242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16705a(CoroutineExceptionHandler.Companion companion, Action action) {
            super(companion);
            this.f30242b = action;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C42917g.m94139e().execute(new RunnableC16706b(this.f30242b));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.filter.AssetFilterHelper$b */
    /* JADX INFO: compiled from: RecordFilterHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC16706b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Action f30243b;

        public RunnableC16706b(Action action) {
            this.f30243b = action;
        }

        @Override // java.lang.Runnable
        public final void run() throws Exception {
            Action action = this.f30243b;
            if (action != null) {
                action.run();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m35743g(AssetFilterHelper assetFilterHelper, InterfaceC41709m0 interfaceC41709m0, String str, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            action = null;
        }
        assetFilterHelper.m35748f(interfaceC41709m0, str, action);
    }

    /* JADX INFO: renamed from: n */
    public static final HashSet m35744n() {
        HashSet hashSet = new HashSet();
        Iterator<T> it = f30236a.m35753l().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, (Object[]) ((Pair) it.next()).getSecond());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: o */
    public static final HashSet m35745o() {
        HashSet hashSet = new HashSet();
        Iterator<T> it = f30236a.m35754m().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, (Object[]) ((Pair) it.next()).getSecond());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: q */
    public static final ArrayList m35746q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(R$string.assets_most_used), new String[]{"PNL", "FUNDING_FEE", "TRANSFER", "TRADE_FEE", "TAX", "TRIAL_WITHDRAW"}));
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static final ArrayList m35747r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(R$string.assets_most_used), new String[]{"REWARD", "PNL", "TRADE_FEE", "FUNDING_FEE", "RECYCLE"}));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m35748f(@NotNull InterfaceC41709m0 coroutineScope, @NotNull String type, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(type, "type");
        String str = MultiLanguageManager.f46811g.getLocalString() + type;
        Map<String, String> map = f30241f.get(str);
        if (map == null || map.isEmpty()) {
            C41696j.m91104d(coroutineScope, C42911a.m94120b().plus(new C16705a(CoroutineExceptionHandler.INSTANCE, action)), null, new AssetFilterHelper$fetchFilterTypeList$1(type, str, action, null), 2, null);
        } else if (action != null) {
            action.run();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ArrayList<C23034a.a> m35749h(@NotNull Context context, @NotNull String sideType, @NotNull String timeType, @NotNull String initFundsType, @NotNull String bizType, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sideType, "sideType");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(initFundsType, "initFundsType");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        ArrayList<C23034a.a> arrayList = new ArrayList<>();
        String string = context.getString(R$string.direction);
        String string2 = context.getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        FilterType.C23032a c23032a = new FilterType.C23032a(string2, "");
        String string3 = context.getString(R$string.in_account);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FilterType.C23032a c23032a2 = new FilterType.C23032a(string3, "IN");
        String string4 = context.getString(R$string.out_account);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        C23034a.a aVar = new C23034a.a(string, new FilterType.C23032a[]{c23032a, c23032a2, new FilterType.C23032a(string4, "OUT")});
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b : interfaceC23033bArrM55168b) {
            interfaceC23033b.mo55155c(Intrinsics.areEqual(interfaceC23033b.getF44545b(), sideType));
        }
        arrayList.add(aVar);
        String string5 = context.getString(R$string.time);
        String string6 = context.getString(R$string.one_week);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        FilterType.C23032a c23032a3 = new FilterType.C23032a(string6, "ONE_WEEK");
        String string7 = context.getString(R$string.half_month);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        FilterType.C23032a c23032a4 = new FilterType.C23032a(string7, "HALF_MONTH");
        String string8 = context.getString(R$string.one_month);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        C23034a.a aVar2 = new C23034a.a(string5, new FilterType.C23032a[]{c23032a3, c23032a4, new FilterType.C23032a(string8, "ONE_MONTH")});
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b2 : interfaceC23033bArrM55168b2) {
            interfaceC23033b2.mo55155c(Intrinsics.areEqual(interfaceC23033b2.getF44545b(), timeType));
        }
        arrayList.add(aVar2);
        String string9 = context.getString(R$string.kumex_funds_type);
        String string10 = context.getString(R$string.kumex_self_balance);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        FilterType.C23032a c23032a5 = new FilterType.C23032a(string10, "selfFunds");
        String string11 = context.getString(R$string.kumex_trial_balance);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        C23034a.a aVar3 = new C23034a.a(string9, new FilterType.C23032a[]{c23032a5, new FilterType.C23032a(string11, "trialFunds")});
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b3 : interfaceC23033bArrM55168b3) {
            interfaceC23033b3.mo55155c(Intrinsics.areEqual(interfaceC23033b3.getF44545b(), initFundsType));
        }
        arrayList.add(aVar3);
        Map<String, String> mapM35750i = m35750i(initFundsType);
        if (mapM35750i == null) {
            mapM35750i = MapsKt.emptyMap();
        }
        C23034a.a aVar4 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(FilterType.f44543a, mapM35750i, false, 2, null));
        FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b4 = aVar4.m55168b();
        Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b4, "getList(...)");
        for (FilterType.InterfaceC23033b interfaceC23033b4 : interfaceC23033bArrM55168b4) {
            interfaceC23033b4.mo55155c(Intrinsics.areEqual(interfaceC23033b4.getF44545b(), z11 ? bizType : ""));
        }
        arrayList.add(aVar4);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, String> m35750i(String str) {
        return f30241f.get(MultiLanguageManager.f46811g.getLocalString() + str);
    }

    /* JADX INFO: renamed from: j */
    public final HashSet<String> m35751j() {
        return (HashSet) f30238c.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final HashSet<String> m35752k() {
        return (HashSet) f30240e.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<Pair<Integer, String[]>> m35753l() {
        return (ArrayList) f30237b.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList<Pair<Integer, String[]>> m35754m() {
        return (ArrayList) f30239d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<RecordFilterRecyclerView.FilterGroupList> m35755p(@NotNull Context context, @NotNull FilterType.InterfaceC23033b[] filterData, boolean z11, @NotNull String bizType, @NotNull String fundsType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        ArrayList<Pair<Integer, String[]>> arrayListM35753l = Intrinsics.areEqual(fundsType, "selfFunds") ? m35753l() : m35754m();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM35753l, 10));
        Iterator it = arrayListM35753l.iterator();
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
            arrayList.add(new RecordFilterRecyclerView.FilterGroupList(false, string, mutableList));
            it = it3;
        }
        List<RecordFilterRecyclerView.FilterGroupList> mutableList2 = CollectionsKt.toMutableList((Collection) arrayList);
        String string3 = context.getString(R$string.more);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ArrayList arrayList3 = new ArrayList();
        for (FilterType.InterfaceC23033b interfaceC23033b2 : filterData) {
            if (!(Intrinsics.areEqual(fundsType, "selfFunds") ? f30236a.m35751j() : f30236a.m35752k()).contains(interfaceC23033b2.getF44545b())) {
                arrayList3.add(interfaceC23033b2);
            }
        }
        List mutableList3 = CollectionsKt.toMutableList((Collection) arrayList3);
        String string4 = context.getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        mutableList3.add(0, new FilterType.C23032a(string4, ""));
        Unit unit2 = Unit.INSTANCE;
        mutableList2.add(new RecordFilterRecyclerView.FilterGroupList(false, string3, mutableList3));
        if (TextUtils.isEmpty(bizType) || !z11) {
            Iterator<T> it4 = mutableList2.iterator();
            while (it4.hasNext()) {
                for (FilterType.InterfaceC23033b interfaceC23033b3 : ((RecordFilterRecyclerView.FilterGroupList) it4.next()).m35782b()) {
                    interfaceC23033b3.mo55155c(Intrinsics.areEqual(interfaceC23033b3.getF44545b(), ""));
                }
            }
            RecordFilterRecyclerView.FilterGroupList filterGroupList = (RecordFilterRecyclerView.FilterGroupList) CollectionsKt.firstOrNull((List) mutableList2);
            if (filterGroupList != null) {
                filterGroupList.m35784d(true);
            }
        } else {
            int size = mutableList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                RecordFilterRecyclerView.FilterGroupList filterGroupList2 = mutableList2.get(i12);
                int size2 = filterGroupList2.m35782b().size();
                for (int i13 = 0; i13 < size2; i13++) {
                    FilterType.InterfaceC23033b interfaceC23033b4 = filterGroupList2.m35782b().get(i13);
                    interfaceC23033b4.mo55155c(Intrinsics.areEqual(interfaceC23033b4.getF44545b(), bizType));
                    if (interfaceC23033b4.getF44546c()) {
                        filterGroupList2.m35784d(true);
                        return mutableList2;
                    }
                }
            }
        }
        return mutableList2;
    }
}

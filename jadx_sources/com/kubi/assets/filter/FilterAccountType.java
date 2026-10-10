package com.kubi.assets.filter;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.tencent.bugly.proguard.C33820nf;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FilterAccountType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 \u00042\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType;", "", "<init>", "()V", "Companion", "AccountMain", "FiatMain", "AccountTrade", "CrossMarginTrade", "IsolatedMarginTrade", "OptionTrade", "UnifyTrade", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FilterAccountType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f17350a = new Companion(null);

    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$Companion;", "", "<init>", "()V", "initStatus", "", "filterData", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "initKey", "", "initStatus$AssetsCenterLib_googleRelease", "([Lcom/kubi/resources/widget/drop/FilterType$IFilter;Ljava/util/List;Ljava/lang/String;)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFilterAccountType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAccountType.kt\ncom/kubi/assets/filter/FilterAccountType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,372:1\n1#2:373\n13472#3,2:374\n*S KotlinDebug\n*F\n+ 1 FilterAccountType.kt\ncom/kubi/assets/filter/FilterAccountType$Companion\n*L\n27#1:374,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void initStatus$AssetsCenterLib_googleRelease(@NotNull FilterType.InterfaceC23033b[] filterData, @NotNull List<ParcelizePair> initParams, @NotNull String initKey) {
            Object next;
            Intrinsics.checkNotNullParameter(filterData, "filterData");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            Intrinsics.checkNotNullParameter(initKey, "initKey");
            Iterator<T> it = initParams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), initKey));
            ParcelizePair parcelizePair = (ParcelizePair) next;
            String value = parcelizePair != null ? parcelizePair.getValue() : null;
            if (value == null) {
                value = "";
            }
            for (FilterType.InterfaceC23033b interfaceC23033b : filterData) {
                interfaceC23033b.mo55155c(Intrinsics.areEqual(interfaceC23033b.getF44545b(), value));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$a */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$AccountMain;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9927a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9927a f17351a = new C9927a();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16603a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("MAIN");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$b */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$AccountTrade;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9928b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9928b f17352a = new C9928b();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16604a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("TRADE");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$c */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$CrossMarginTrade;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9929c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9929c f17353a = new C9929c();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16605a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("MARGIN");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$d */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$FiatMain;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9930d {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9930d f17354a = new C9930d();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16606a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("FIAT");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$e */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$IsolatedMarginTrade;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFilterAccountType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAccountType.kt\ncom/kubi/assets/filter/FilterAccountType$IsolatedMarginTrade\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    public static final class C9931e {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9931e f17355a = new C9931e();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16607a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Object next;
            List arrayList;
            String value;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList2 = new ArrayList<>();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = initParams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), "tag"));
            ParcelizePair parcelizePair = (ParcelizePair) next;
            if (parcelizePair == null || (value = parcelizePair.getValue()) == null || (arrayList = StringsKt.split$default((CharSequence) value, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty() && arrayList.size() == 2) {
                linkedHashMap.put(arrayList.get(0), C42828b.m93913n((String) arrayList.get(0)));
                linkedHashMap.put(arrayList.get(1), C42828b.m93913n((String) arrayList.get(1)));
            }
            String string = context.getString(R$string.coin);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, linkedHashMap, false, 2, null));
            aVar.f44552a = FirebaseAnalytics.Param.CURRENCY;
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList2.add(aVar);
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.direction), FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar2.f44552a = "direction";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList2.add(aVar2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap2.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap2.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar3 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap2, false));
            aVar3.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
            String filterKey3 = aVar3.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
            arrayList2.add(aVar3);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l(SharedPositionInfo.MARGIN_MODE_ISOLATED);
            if (mapM16584l != null) {
                C23034a.a aVar4 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar4.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b4 = aVar4.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b4, "getList(...)");
                String filterKey4 = aVar4.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey4, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b4, initParams, filterKey4);
                arrayList2.add(aVar4);
            }
            return arrayList2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$f */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$OptionTrade;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9932f {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9932f f17356a = new C9932f();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16608a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("OPTION");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.filter.FilterAccountType$g */
    /* JADX INFO: compiled from: FilterAccountType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/filter/FilterAccountType$UnifyTrade;", "", "<init>", "()V", "filterList", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9933g {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C9933g f17357a = new C9933g();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArrayList<C23034a.a> m16609a(@NotNull Context context, @NotNull List<ParcelizePair> initParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            String string = context.getString(R$string.direction);
            FilterType.Companion companion = FilterType.f44543a;
            C23034a.a aVar = new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, AccountDetailEntity.getOtcDirectionTypeMap(context), false, 2, null));
            aVar.f44552a = "direction";
            Companion companion2 = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
            linkedHashMap.put("HALF_MONTH", context.getString(R$string.half_month));
            linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
            C23034a.a aVar2 = new C23034a.a(context.getString(R$string.time), companion.convert2Filter(linkedHashMap, false));
            aVar2.f44552a = "time";
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar2.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
            String filterKey2 = aVar2.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey2, "filterKey");
            companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b2, initParams, filterKey2);
            arrayList.add(aVar2);
            Map<String, String> mapM16584l = AssetFilterHelper.f17335a.m16584l("UNIFIED");
            if (mapM16584l != null) {
                C23034a.a aVar3 = new C23034a.a(context.getString(R$string.type), FilterType.Companion.convert2Filter$default(companion, mapM16584l, false, 2, null));
                aVar3.f44552a = "bizType";
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b3 = aVar3.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b3, "getList(...)");
                String filterKey3 = aVar3.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey3, "filterKey");
                companion2.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b3, initParams, filterKey3);
                arrayList.add(aVar3);
            }
            return arrayList;
        }
    }
}

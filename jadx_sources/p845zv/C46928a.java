package p845zv;

import com.kubi.redpackage.entity.CurrenciesConfig;
import com.kubi.redpackage.utils.RedPkgCategory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: zv.a */
/* JADX INFO: compiled from: RedpkgEx.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u001aE\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b*\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"track", "", "Lcom/kubi/redpackage/utils/RedPkgCategory;", "success", "", "msg", "", "code", "sortCurrencies", "Ljava/util/ArrayList;", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "Lkotlin/collections/ArrayList;", "descendUSDT", "isMainBalance", "(Ljava/util/ArrayList;ZLjava/lang/Boolean;)Ljava/util/ArrayList;", "RedpackageLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedpkgEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedpkgEx.kt\ncom/kubi/redpackage/utils/RedpkgExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1#2:103\n1021#3,2:104\n1021#3,2:106\n3301#3,10:108\n*S KotlinDebug\n*F\n+ 1 RedpkgEx.kt\ncom/kubi/redpackage/utils/RedpkgExKt\n*L\n74#1:104,2\n83#1:106,2\n85#1:108,10\n*E\n"})
public final class C46928a {

    /* JADX INFO: renamed from: zv.a$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RedpkgEx.kt\ncom/kubi/redpackage/utils/RedpkgExKt\n*L\n1#1,328:1\n75#2,5:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean f104793b;

        public a(Boolean bool) {
            this.f104793b = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalAdd;
            CurrenciesConfig currenciesConfig = (CurrenciesConfig) t12;
            Boolean bool = this.f104793b;
            Boolean bool2 = Boolean.TRUE;
            BigDecimal bigDecimalAdd2 = null;
            if (Intrinsics.areEqual(bool, bool2)) {
                bigDecimalAdd = currenciesConfig.getMainCurrencyBalance();
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                bigDecimalAdd = currenciesConfig.getTradeCurrencyBalance();
            } else {
                BigDecimal mainCurrencyBalance = currenciesConfig.getMainCurrencyBalance();
                bigDecimalAdd = mainCurrencyBalance != null ? mainCurrencyBalance.add(currenciesConfig.getTradeCurrencyBalance()) : null;
            }
            CurrenciesConfig currenciesConfig2 = (CurrenciesConfig) t11;
            Boolean bool3 = this.f104793b;
            if (Intrinsics.areEqual(bool3, bool2)) {
                bigDecimalAdd2 = currenciesConfig2.getMainCurrencyBalance();
            } else if (Intrinsics.areEqual(bool3, Boolean.FALSE)) {
                bigDecimalAdd2 = currenciesConfig2.getTradeCurrencyBalance();
            } else {
                BigDecimal mainCurrencyBalance2 = currenciesConfig2.getMainCurrencyBalance();
                if (mainCurrencyBalance2 != null) {
                    bigDecimalAdd2 = mainCurrencyBalance2.add(currenciesConfig2.getTradeCurrencyBalance());
                }
            }
            return ComparisonsKt.compareValues(bigDecimalAdd, bigDecimalAdd2);
        }
    }

    /* JADX INFO: renamed from: zv.a$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RedpkgEx.kt\ncom/kubi/redpackage/utils/RedpkgExKt\n*L\n1#1,328:1\n83#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(!Intrinsics.areEqual(((CurrenciesConfig) t12).getCurrencyName(), "USDT")), Boolean.valueOf(!Intrinsics.areEqual(((CurrenciesConfig) t11).getCurrencyName(), "USDT")));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ArrayList<CurrenciesConfig> m103395a(@NotNull ArrayList<CurrenciesConfig> arrayList, boolean z11, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList<CurrenciesConfig> arrayList2 = new ArrayList<>();
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new a(bool));
        }
        if (!z11) {
            arrayList2.addAll(mutableList);
            return arrayList2;
        }
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new b());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : mutableList) {
            CurrenciesConfig currenciesConfig = (CurrenciesConfig) obj;
            BigDecimal bigDecimalM89922G = C41014a.m89922G(currenciesConfig.getMainCurrencyBalance(), null, 1, null);
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(currenciesConfig.getTradeCurrencyBalance(), null, 1, null);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                if (C41014a.m89919D(bigDecimalM89922G)) {
                    arrayList4.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                if (C41014a.m89919D(bigDecimalM89922G2)) {
                    arrayList4.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            } else if (C41014a.m89919D(bigDecimalM89922G.add(bigDecimalM89922G2))) {
                arrayList4.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        arrayList2.addAll(list);
        arrayList2.addAll(list2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m103396b(ArrayList arrayList, boolean z11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        return m103395a(arrayList, z11, bool);
    }

    /* JADX INFO: renamed from: c */
    public static final void m103397c(@NotNull RedPkgCategory redPkgCategory, boolean z11, @Nullable String str, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(redPkgCategory, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", redPkgCategory.name());
        jSONObject.put("is_success", z11);
        if (str != null) {
            jSONObject.put("fail_reason", str);
        }
        if (str2 != null) {
            jSONObject.put("fail_reason_code", str2);
        }
        C43852m.m96605q("redpkg", jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m103398d(RedPkgCategory redPkgCategory, boolean z11, String str, String str2, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        m103397c(redPkgCategory, z11, str, str2);
    }
}

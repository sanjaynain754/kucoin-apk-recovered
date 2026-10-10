package com.kubi.tradebase.business.klineSettings;

import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: KLineSettingsManager.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0015\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;", "", "<init>", "()V", "category", "", "key", "allTimeList", "", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "getAllTimeList", "()Ljava/util/List;", "allTimeList$delegate", "Lkotlin/Lazy;", "saveTimeCycle", "", "value", "getTimeCycle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reBuildTimeCycle", "list", "getAllTimeCycle", "getPopTimeCycle", "showTimeList", "buildDefaultData", "buildAllData", "convert", "tag", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineSettingsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n196#2,3:183\n1#3:186\n1011#4,2:187\n1021#4,2:189\n1021#4,2:191\n1011#4,2:193\n774#4:195\n865#4,2:196\n1011#4,2:198\n*S KotlinDebug\n*F\n+ 1 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n30#1:183,3\n32#1:187,2\n52#1:189,2\n53#1:191,2\n79#1:193,2\n96#1:195\n96#1:196,2\n116#1:198,2\n*E\n"})
public final class KLineSettingsManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineSettingsManager f51515a = new KLineSettingsManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f51516b = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.business.klineSettings.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineSettingsManager.m63117b();
        }
    });

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingsManager$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n1#1,328:1\n116#2:329\n*E\n"})
    public static final class C25852a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((KLineTimeEntity) t11).getTag()), Integer.valueOf(((KLineTimeEntity) t12).getTag()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingsManager$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n1#1,328:1\n32#2:329\n*E\n"})
    public static final class C25853b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((KLineTimeEntity) t11).getTag()), Integer.valueOf(((KLineTimeEntity) t12).getTag()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingsManager$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n1#1,328:1\n79#2:329\n*E\n"})
    public static final class C25854c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((KLineTimeEntity) t11).getTag()), Integer.valueOf(((KLineTimeEntity) t12).getTag()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingsManager$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n1#1,328:1\n52#2:329\n*E\n"})
    public static final class C25855d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((KLineTimeEntity) t12).getTag()), Integer.valueOf(((KLineTimeEntity) t11).getTag()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingsManager$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n1#1,328:1\n53#2:329\n*E\n"})
    public static final class C25856e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((KLineTimeEntity) t12).getTag()), Integer.valueOf(((KLineTimeEntity) t11).getTag()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m63120e(@Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return C27017c.f54310a.m66516f(R$string.k_linke_min_time, new Object[0]);
        }
        if (num != null && num.intValue() == 1) {
            return C27017c.f54310a.m66516f(R$string.one_min, new Object[0]);
        }
        if (num != null && num.intValue() == 2) {
            return C27017c.f54310a.m66516f(R$string.five_min, new Object[0]);
        }
        if (num != null && num.intValue() == 3) {
            return C27017c.f54310a.m66516f(R$string.fiveteen_min, new Object[0]);
        }
        if (num != null && num.intValue() == 4) {
            return C27017c.f54310a.m66516f(R$string.thirty_min, new Object[0]);
        }
        if (num != null && num.intValue() == 5) {
            return C27017c.f54310a.m66516f(R$string.one_hour, new Object[0]);
        }
        if (num != null && num.intValue() == 6) {
            return C27017c.f54310a.m66516f(R$string.two_hour, new Object[0]);
        }
        if (num != null && num.intValue() == 7) {
            return C27017c.f54310a.m66516f(R$string.four_hour, new Object[0]);
        }
        if (num != null && num.intValue() == 8) {
            return C27017c.f54310a.m66516f(R$string.k_linke_8_h, new Object[0]);
        }
        if (num != null && num.intValue() == 9) {
            return C27017c.f54310a.m66516f(R$string.k_linke_one_day, new Object[0]);
        }
        if (num != null && num.intValue() == 10) {
            return C27017c.f54310a.m66516f(R$string.k_linke_one_week, new Object[0]);
        }
        return (num != null && num.intValue() == 11) ? C27017c.f54310a.m66516f(R$string.k_linke_one_month, new Object[0]) : C27017c.f54310a.m66516f(R$string.fiveteen_min, new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static final List m63117b() {
        return f51515a.m63118c();
    }

    /* JADX INFO: renamed from: c */
    public final List<KLineTimeEntity> m63118c() {
        ArrayList arrayList = new ArrayList();
        C27017c c27017c = C27017c.f54310a;
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_min_time, new Object[0]), 0, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.one_min, new Object[0]), 1, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.five_min, new Object[0]), 2, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.fiveteen_min, new Object[0]), 3, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.thirty_min, new Object[0]), 4, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.one_hour, new Object[0]), 5, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.two_hour, new Object[0]), 6, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.four_hour, new Object[0]), 7, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_8_h, new Object[0]), 8, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_one_day, new Object[0]), 9, false, 4, null));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_one_week, new Object[0]), 10, false, 4, null));
        if (C38190h.f85888a.m86167l()) {
            arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_one_month, new Object[0]), 11, false, 4, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final List<KLineTimeEntity> m63119d() {
        ArrayList arrayList = new ArrayList();
        C27017c c27017c = C27017c.f54310a;
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_min_time, new Object[0]), 0, true));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.fiveteen_min, new Object[0]), 3, true));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.one_hour, new Object[0]), 5, true));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_8_h, new Object[0]), 8, true));
        arrayList.add(new KLineTimeEntity(c27017c.m66516f(R$string.k_linke_one_day, new Object[0]), 9, true));
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C25852a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<KLineTimeEntity> m63122g() {
        return (List) f51516b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<KLineTimeEntity> m63123h(@NotNull List<KLineTimeEntity> showTimeList) {
        Intrinsics.checkNotNullParameter(showTimeList, "showTimeList");
        List<KLineTimeEntity> listM63121f = m63121f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM63121f) {
            if (!showTimeList.contains((KLineTimeEntity) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m63124i(@NotNull Continuation<? super List<KLineTimeEntity>> continuation) {
        KLineSettingsManager$getTimeCycle$1 kLineSettingsManager$getTimeCycle$1;
        if (continuation instanceof KLineSettingsManager$getTimeCycle$1) {
            kLineSettingsManager$getTimeCycle$1 = (KLineSettingsManager$getTimeCycle$1) continuation;
            int i11 = kLineSettingsManager$getTimeCycle$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineSettingsManager$getTimeCycle$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineSettingsManager$getTimeCycle$1 = new KLineSettingsManager$getTimeCycle$1(this, continuation);
            }
        } else {
            kLineSettingsManager$getTimeCycle$1 = new KLineSettingsManager$getTimeCycle$1(this, continuation);
        }
        Object objM90914f0 = kLineSettingsManager$getTimeCycle$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineSettingsManager$getTimeCycle$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            String strM102351h = C46396e.m102351h("trade", "kline_time_cycle", "");
            if (strM102351h.length() == 0) {
                return m63119d();
            }
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new KLineSettingsManager$getTimeCycle$$inlined$fromJsonOrNull$1(strM102351h, null)), C42911a.m94120b());
            kLineSettingsManager$getTimeCycle$1.L$0 = SpillingKt.nullOutSpilledVariable(strM102351h);
            kLineSettingsManager$getTimeCycle$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            kLineSettingsManager$getTimeCycle$1.L$2 = SpillingKt.nullOutSpilledVariable(strM102351h);
            kLineSettingsManager$getTimeCycle$1.I$0 = 0;
            kLineSettingsManager$getTimeCycle$1.label = 1;
            objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, kLineSettingsManager$getTimeCycle$1);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
        }
        List<KLineTimeEntity> listM63119d = (List) objM90914f0;
        if (listM63119d == null) {
            listM63119d = m63119d();
        }
        if (!C38190h.f85888a.m86167l()) {
            return m63125j(listM63119d);
        }
        if (listM63119d.size() > 1) {
            CollectionsKt.sortWith(listM63119d, new C25853b());
        }
        return listM63119d;
    }

    /* JADX INFO: renamed from: k */
    public final void m63126k(@NotNull List<KLineTimeEntity> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String strM66606i = C27029c.m66606i(value);
        Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
        C46396e.m102358o("trade", "kline_time_cycle", strM66606i);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KLineTimeEntity> m63121f() {
        return m63122g();
    }

    /* JADX INFO: renamed from: j */
    public final List<KLineTimeEntity> m63125j(List<KLineTimeEntity> list) {
        Iterator<KLineTimeEntity> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getTag() == 11) {
                it.remove();
                ArrayList arrayList = new ArrayList(m63122g());
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new C25855d());
                }
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new C25856e());
                }
                KLineTimeEntity kLineTimeEntity = (KLineTimeEntity) CollectionsKt.lastOrNull((List) list);
                int size = arrayList.size();
                loop1: for (int i11 = 0; i11 < size; i11++) {
                    KLineTimeEntity kLineTimeEntity2 = (KLineTimeEntity) arrayList.get(i11);
                    if (kLineTimeEntity2.getTag() != 11) {
                        if (kLineTimeEntity != null && kLineTimeEntity2.getTag() < kLineTimeEntity.getTag()) {
                            Intrinsics.checkNotNull(kLineTimeEntity2);
                            list.add(kLineTimeEntity2);
                            break;
                        }
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            KLineTimeEntity kLineTimeEntity3 = list.get(i12);
                            if (kLineTimeEntity3.getTag() == kLineTimeEntity2.getTag()) {
                                break;
                            }
                            if (kLineTimeEntity2.getTag() > kLineTimeEntity3.getTag()) {
                                Intrinsics.checkNotNull(kLineTimeEntity2);
                                list.add(kLineTimeEntity2);
                                break loop1;
                            }
                        }
                    }
                }
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new C25854c());
                }
                m63126k(list);
                break;
            }
        }
        return list;
    }
}

package com.kubi.sdk.pkg.bundle;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.s */
/* JADX INFO: compiled from: StartupBundlePriority.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"", "d", "(Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "", "criticalBizList", "Lkotlin/Function1;", "bizSelector", "Lcom/kubi/sdk/pkg/bundle/q;", "c", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/pkg/bundle/q;", "cloudItems", "packagePlatformBizList", "Lcom/kubi/sdk/pkg/bundle/r;", "b", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/pkg/bundle/r;", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupBundlePriority.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupBundlePriority.kt\ncom/kubi/sdk/pkg/bundle/StartupBundlePriorityKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1#2:71\n1#2:98\n1855#3,2:72\n766#3:74\n857#3,2:75\n1549#3:77\n1620#3,3:78\n819#3:81\n847#3,2:82\n1549#3:84\n1620#3,3:85\n1603#3,9:88\n1855#3:97\n1856#3:99\n1612#3:100\n819#3:101\n847#3,2:102\n3190#3,10:104\n*S KotlinDebug\n*F\n+ 1 StartupBundlePriority.kt\ncom/kubi/sdk/pkg/bundle/StartupBundlePriorityKt\n*L\n58#1:98\n27#1:72,2\n36#1:74\n36#1:75,2\n41#1:77\n41#1:78,3\n43#1:81\n43#1:82,2\n44#1:84\n44#1:85,3\n58#1:88,9\n58#1:97\n58#1:99\n58#1:100\n59#1:101\n59#1:102,2\n65#1:104,10\n*E\n"})
public final class C23966s {

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.s$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 StartupBundlePriority.kt\ncom/kubi/sdk/pkg/bundle/StartupBundlePriorityKt\n*L\n1#1,328:1\n38#2:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinkedHashMap f47375b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f47376c;

        public a(LinkedHashMap linkedHashMap, Function1 function1) {
            this.f47375b = linkedHashMap;
            this.f47376c = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues((Comparable) this.f47375b.get(C23966s.m57686d((String) this.f47376c.invoke(((IndexedValue) t11).getValue()))), (Comparable) this.f47375b.get(C23966s.m57686d((String) this.f47376c.invoke(((IndexedValue) t12).getValue()))));
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.s$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 StartupBundlePriority.kt\ncom/kubi/sdk/pkg/bundle/StartupBundlePriorityKt\n*L\n1#1,328:1\n39#2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f47377b;

        public b(Comparator comparator) {
            this.f47377b = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f47377b.compare(t11, t12);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((IndexedValue) t11).getIndex()), Integer.valueOf(((IndexedValue) t12).getIndex()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m57686d(String str) {
        String string;
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null && lowerCase.length() > 0) {
                return lowerCase;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> StartupBundleFilterResult<T> m57684b(@NotNull List<? extends T> cloudItems, @NotNull Collection<String> packagePlatformBizList, @NotNull Function1<? super T, String> bizSelector) {
        Intrinsics.checkNotNullParameter(cloudItems, "cloudItems");
        Intrinsics.checkNotNullParameter(packagePlatformBizList, "packagePlatformBizList");
        Intrinsics.checkNotNullParameter(bizSelector, "bizSelector");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packagePlatformBizList.iterator();
        while (it.hasNext()) {
            String strM57686d = m57686d((String) it.next());
            if (strM57686d != null) {
                arrayList.add(strM57686d);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : arrayList) {
            if (!Intrinsics.areEqual((String) t11, "krnbase")) {
                arrayList2.add(t11);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        if (set.isEmpty()) {
            return new StartupBundleFilterResult<>(cloudItems, CollectionsKt.emptyList());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : cloudItems) {
            if (CollectionsKt.contains(set, m57686d(bizSelector.invoke(obj)))) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        return new StartupBundleFilterResult<>((List) pair.component2(), (List) pair.component1());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> StartupBundleBatches<T> m57685c(@NotNull List<? extends T> items, @NotNull Collection<String> criticalBizList, @NotNull Function1<? super T, String> bizSelector) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(criticalBizList, "criticalBizList");
        Intrinsics.checkNotNullParameter(bizSelector, "bizSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = criticalBizList.iterator();
        while (it.hasNext()) {
            String strM57686d = m57686d((String) it.next());
            if (strM57686d != null) {
                linkedHashMap.putIfAbsent(strM57686d, Integer.valueOf(linkedHashMap.size()));
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new StartupBundleBatches<>(CollectionsKt.emptyList(), items);
        }
        Iterable iterableWithIndex = CollectionsKt.withIndex(items);
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterableWithIndex) {
            if (linkedHashMap.containsKey(m57686d(bizSelector.invoke((Object) ((IndexedValue) t11).getValue())))) {
                arrayList.add(t11);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new b(new a(linkedHashMap, bizSelector)));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator<T> it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IndexedValue) it2.next()).getValue());
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t12 : iterableWithIndex) {
            if (!linkedHashMap.containsKey(m57686d(bizSelector.invoke((Object) ((IndexedValue) t12).getValue())))) {
                arrayList3.add(t12);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator<T> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((IndexedValue) it3.next()).getValue());
        }
        return new StartupBundleBatches<>(arrayList2, arrayList4);
    }
}

package p852kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1193#2,2:342\n1267#2,4:344\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n340#1:342,2\n340#1:344,4\n*E\n"})
public final class StandardClassIdsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId annotationId(String str) {
        FqName base_annotation_package = StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_annotation_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId atomicsId(String str) {
        FqName base_concurrent_atomics_package = StandardClassIds.INSTANCE.getBASE_CONCURRENT_ATOMICS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_concurrent_atomics_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId baseId(String str) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId collectionsId(String str) {
        FqName base_collections_package = StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_collections_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId coroutinesId(String str) {
        FqName base_coroutines_package = StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_coroutines_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId enumsId(String str) {
        FqName base_enums_package = StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_enums_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId primitiveArrayId(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        Name nameIdentifier = Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier());
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(packageFqName, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId rangesId(String str) {
        FqName base_ranges_package = StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_ranges_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId reflectId(String str) {
        FqName base_reflect_package = StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_reflect_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId unsignedId(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier('U' + classId.getShortClassName().getIdentifier());
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> inverseMap(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM90091to = TuplesKt.m90091to(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }
}

package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: typeEnhancementUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1#2:74\n1#2:85\n1#2:98\n1#2:111\n1617#3,9:75\n1869#3:84\n1870#3:86\n1626#3:87\n1617#3,9:88\n1869#3:97\n1870#3:99\n1626#3:100\n1617#3,9:101\n1869#3:110\n1870#3:112\n1626#3:113\n1761#3,3:114\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n43#1:85\n45#1:98\n47#1:111\n43#1:75,9\n43#1:84\n43#1:86\n43#1:87\n45#1:88,9\n45#1:97\n45#1:99\n45#1:100\n47#1:101,9\n47#1:110\n47#1:112\n47#1:113\n58#1:114,3\n*E\n"})
public final class TypeEnhancementUtilsKt {
    private static final <T> T select(Set<? extends T> set, T t11, T t12, T t13, boolean z11) {
        Set<? extends T> set2;
        T t14;
        if (!z11) {
            if (t13 != null && (set2 = CollectionsKt.toSet(SetsKt.plus(set, t13))) != null) {
                set = set2;
            }
            return (T) CollectionsKt.singleOrNull(set);
        }
        if (set.contains(t11)) {
            t14 = t11;
        } else {
            t14 = set.contains(t12) ? t12 : null;
        }
        if (Intrinsics.areEqual(t14, t11) && Intrinsics.areEqual(t13, t12)) {
            return null;
        }
        return t13 == null ? t14 : t13;
    }

    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> superQualifiers, boolean z11, boolean z12, boolean z13) {
        NullabilityQualifier nullabilityQualifierSelect;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = superQualifiers.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityForErrors = getNullabilityForErrors((JavaTypeQualifiers) it.next());
            if (nullabilityForErrors != null) {
                arrayList.add(nullabilityForErrors);
            }
        }
        NullabilityQualifier nullabilityQualifierSelect2 = select(CollectionsKt.toSet(arrayList), getNullabilityForErrors(javaTypeQualifiers), z11);
        if (nullabilityQualifierSelect2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            nullabilityQualifierSelect = select(CollectionsKt.toSet(arrayList2), javaTypeQualifiers.getNullability(), z11);
        } else {
            nullabilityQualifierSelect = nullabilityQualifierSelect2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = superQualifiers.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) select(CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z11);
        if (nullabilityQualifierSelect == null || z13 || (z12 && nullabilityQualifierSelect == NullabilityQualifier.NULLABLE)) {
            nullabilityQualifierSelect = null;
        }
        boolean z14 = false;
        boolean z15 = nullabilityQualifierSelect != null && nullabilityQualifierSelect2 == null;
        if (nullabilityQualifierSelect == NullabilityQualifier.NOT_NULL) {
            if (isDefinitelyNotNullAndSameSeverity(javaTypeQualifiers, z15)) {
                z14 = true;
                break;
            }
            if (!superQualifiers.isEmpty()) {
                Iterator<T> it4 = superQualifiers.iterator();
                while (it4.hasNext()) {
                    if (isDefinitelyNotNullAndSameSeverity((JavaTypeQualifiers) it4.next(), z15)) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        return new JavaTypeQualifiers(nullabilityQualifierSelect, mutabilityQualifier, z14, z15);
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final NullabilityQualifier getNullabilityForErrors(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return javaTypeQualifiers.getNullability();
    }

    private static final boolean isDefinitelyNotNullAndSameSeverity(JavaTypeQualifiers javaTypeQualifiers, boolean z11) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning() == z11 && javaTypeQualifiers.getDefinitelyNotNull()) {
            return true;
        }
        return false;
    }

    private static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z11) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z11);
    }
}

package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1563#2:184\n1634#2,3:185\n1563#2:188\n1634#2,3:189\n1563#2:192\n1634#2,3:193\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n*L\n26#1:184\n26#1:185,3\n38#1:188\n38#1:189,3\n58#1:192\n58#1:193,3\n*E\n"})
public final class IntersectionTypeKt {
    @NotNull
    public static final UnwrappedType intersectTypes(@NotNull Collection<? extends UnwrappedType> types) {
        SimpleType lowerBound;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
                boolean z11 = false;
                boolean z12 = false;
                for (UnwrappedType unwrappedType : types) {
                    if (!z11 && !KotlinTypeKt.isError(unwrappedType)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (unwrappedType instanceof SimpleType) {
                        lowerBound = (SimpleType) unwrappedType;
                    } else if (unwrappedType instanceof FlexibleType) {
                        if (DynamicTypesKt.isDynamic(unwrappedType)) {
                            return unwrappedType;
                        }
                        lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                        z12 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(lowerBound);
                }
                if (z11) {
                    return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
                }
                if (!z12) {
                    return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
                Iterator<T> it = types.iterator();
                while (it.hasNext()) {
                    arrayList2.add(FlexibleTypesKt.upperIfFlexible((UnwrappedType) it.next()));
                }
                TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
                return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
            }
            return (UnwrappedType) CollectionsKt.single(types);
        }
        throw new IllegalStateException("Expected some types");
    }
}

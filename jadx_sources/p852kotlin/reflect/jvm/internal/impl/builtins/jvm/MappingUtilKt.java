package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: mappingUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nmappingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1563#2:25\n1634#2,3:26\n1563#2:29\n1634#2,3:30\n*S KotlinDebug\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n*L\n20#1:25\n20#1:26,3\n21#1:29\n21#1:30,3\n*E\n"})
public final class MappingUtilKt {
    @NotNull
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(@NotNull ClassDescriptor from, @NotNull ClassDescriptor to2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        from.getDeclaredTypeParameters().size();
        to2.getDeclaredTypeParameters().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
        List<TypeParameterDescriptor> declaredTypeParameters = from.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(declaredTypeParameters, 10));
        Iterator<T> it = declaredTypeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
        }
        List<TypeParameterDescriptor> declaredTypeParameters2 = to2.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(declaredTypeParameters2, 10));
        Iterator<T> it2 = declaredTypeParameters2.iterator();
        while (it2.hasNext()) {
            SimpleType defaultType = ((TypeParameterDescriptor) it2.next()).getDefaultType();
            Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
            arrayList2.add(TypeUtilsKt.asTypeProjection(defaultType));
        }
        return TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, MapsKt.toMap(CollectionsKt.zip(arrayList, arrayList2)), false, 2, null);
    }
}

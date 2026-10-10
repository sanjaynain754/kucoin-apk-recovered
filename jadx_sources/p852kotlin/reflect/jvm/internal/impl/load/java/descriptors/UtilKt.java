package p852kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1563#2:66\n1634#2,3:67\n*S KotlinDebug\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n*L\n40#1:66\n40#1:67,3\n*E\n"})
public final class UtilKt {
    @NotNull
    public static final List<ValueParameterDescriptor> copyValueParameters(@NotNull Collection<? extends KotlinType> newValueParameterTypes, @NotNull Collection<? extends ValueParameterDescriptor> oldValueParameters, @NotNull CallableDescriptor newOwner) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listZip = CollectionsKt.zip(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            KotlinType kotlinType = (KotlinType) pair.component1();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component2();
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean zDeclaresDefaultValue = valueParameterDescriptor.declaresDefaultValue();
            boolean zIsCrossinline = valueParameterDescriptor.isCrossinline();
            boolean zIsNoinline = valueParameterDescriptor.isNoinline();
            KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? DescriptorUtilsKt.getModule(newOwner).getBuiltIns().getArrayElementType(kotlinType) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
            arrayList.add(new ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, kotlinType, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    @Nullable
    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        ClassDescriptor superClassNotAny = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        if (superClassNotAny == null) {
            return null;
        }
        MemberScope staticScope = superClassNotAny.getStaticScope();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = staticScope instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) staticScope : null;
        return lazyJavaStaticClassScope == null ? getParentJavaStaticClassScope(superClassNotAny) : lazyJavaStaticClassScope;
    }
}

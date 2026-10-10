package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: LazyJavaTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1563#2:76\n1634#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91371c;

    @NotNull
    private final JavaTypeParameter javaTypeParameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext c11, @NotNull JavaTypeParameter javaTypeParameter, int i11, @NotNull DeclarationDescriptor containingDeclaration) {
        super(c11.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c11, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i11, SourceElement.NO_SOURCE, c11.getComponents().getSupertypeLoopChecker());
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f91371c = c11;
        this.javaTypeParameter = javaTypeParameter;
    }

    private final List<KotlinType> computeNotEnhancedBounds() {
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f91371c.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
            SimpleType nullableAnyType = this.f91371c.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
            return CollectionsKt.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91371c.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> processBoundsWithoutCycles(@NotNull List<? extends KotlinType> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return this.f91371c.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, bounds, this.f91371c);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    public void mo105129reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        return computeNotEnhancedBounds();
    }
}

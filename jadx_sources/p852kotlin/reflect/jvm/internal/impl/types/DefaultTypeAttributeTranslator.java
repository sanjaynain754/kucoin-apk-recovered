package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: TypeAttributeTranslator.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    @NotNull
    public static final DefaultTypeAttributeTranslator INSTANCE = new DefaultTypeAttributeTranslator();

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    @NotNull
    public TypeAttributes toAttributes(@NotNull Annotations annotations, @Nullable TypeConstructor typeConstructor, @Nullable DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.create(CollectionsKt.listOf(new AnnotationsTypeAttribute(annotations)));
    }

    private DefaultTypeAttributeTranslator() {
    }
}

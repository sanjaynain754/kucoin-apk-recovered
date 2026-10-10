package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: TypeAttributeTranslator.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeAttributeTranslator {

    /* JADX INFO: compiled from: TypeAttributeTranslator.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ TypeAttributes toAttributes$default(TypeAttributeTranslator typeAttributeTranslator, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i11 & 2) != 0) {
                typeConstructor = null;
            }
            if ((i11 & 4) != 0) {
                declarationDescriptor = null;
            }
            return typeAttributeTranslator.toAttributes(annotations, typeConstructor, declarationDescriptor);
        }
    }

    @NotNull
    TypeAttributes toAttributes(@NotNull Annotations annotations, @Nullable TypeConstructor typeConstructor, @Nullable DeclarationDescriptor declarationDescriptor);
}

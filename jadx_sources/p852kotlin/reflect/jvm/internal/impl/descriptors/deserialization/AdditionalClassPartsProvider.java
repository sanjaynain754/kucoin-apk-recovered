package p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface AdditionalClassPartsProvider {

    /* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
    public static final class None implements AdditionalClassPartsProvider {

        @NotNull
        public static final None INSTANCE = new None();

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.emptyList();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.emptyList();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.emptyList();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.emptyList();
        }

        private None() {
        }
    }

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor);
}

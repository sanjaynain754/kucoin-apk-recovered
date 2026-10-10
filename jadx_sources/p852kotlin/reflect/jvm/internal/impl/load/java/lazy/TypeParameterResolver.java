package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeParameterResolver {

    /* JADX INFO: compiled from: resolvers.kt */
    public static final class EMPTY implements TypeParameterResolver {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        @Nullable
        public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter) {
            Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
            return null;
        }

        private EMPTY() {
        }
    }

    @Nullable
    TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter);
}

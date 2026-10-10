package p852kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface SyntheticJavaPartsProvider {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final CompositeSyntheticJavaPartsProvider EMPTY = new CompositeSyntheticJavaPartsProvider(CollectionsKt.emptyList());

        @NotNull
        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return EMPTY;
        }

        private Companion() {
        }
    }

    void generateConstructors(@NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    void generateMethods(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    void generateNestedClass(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    void generateStaticFunctions(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    List<Name> getMethodNames(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    List<Name> getNestedClassNames(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    List<Name> getStaticFunctionNames(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    PropertyDescriptorImpl modifyField(@NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl, @NotNull LazyJavaResolverContext lazyJavaResolverContext);
}

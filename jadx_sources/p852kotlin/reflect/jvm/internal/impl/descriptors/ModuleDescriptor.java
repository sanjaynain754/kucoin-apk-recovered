package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ModuleDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {
    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Nullable
    <T> T getCapability(@NotNull ModuleCapability<T> moduleCapability);

    @NotNull
    List<ModuleDescriptor> getExpectedByModules();

    @NotNull
    PackageViewDescriptor getPackage(@NotNull FqName fqName);

    @NotNull
    Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);

    boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor);

    /* JADX INFO: compiled from: ModuleDescriptor.kt */
    public static final class DefaultImpls {
        @Nullable
        public static DeclarationDescriptor getContainingDeclaration(@NotNull ModuleDescriptor moduleDescriptor) {
            return null;
        }

        @Nullable
        public static <R, D> R accept(@NotNull ModuleDescriptor moduleDescriptor, @NotNull DeclarationDescriptorVisitor<R, D> visitor, D d11) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            return visitor.visitModuleDeclaration(moduleDescriptor, d11);
        }
    }
}

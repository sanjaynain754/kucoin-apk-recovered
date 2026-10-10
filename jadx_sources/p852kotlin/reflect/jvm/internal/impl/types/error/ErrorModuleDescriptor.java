package p852kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ErrorModuleDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {

    @NotNull
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();

    @NotNull
    private static final List<ModuleDescriptor> allDependencyModules;

    @NotNull
    private static final Set<ModuleDescriptor> allExpectedByModules;

    @NotNull
    private static final Lazy builtIns$delegate;

    @NotNull
    private static final List<ModuleDescriptor> expectedByModules;

    @NotNull
    private static final Name stableName;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    static {
        Name nameSpecial = Name.special(ErrorEntity.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        stableName = nameSpecial;
        allDependencyModules = CollectionsKt.emptyList();
        expectedByModules = CollectionsKt.emptyList();
        allExpectedByModules = SetsKt.emptySet();
        builtIns$delegate = LazyKt.lazy(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return ErrorModuleDescriptor.builtIns_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns builtIns_delegate$lambda$0() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return (KotlinBuiltIns) builtIns$delegate.getValue();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        return expectedByModules;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @NotNull
    public Name getStableName() {
        return stableName;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.emptyList();
    }

    private ErrorModuleDescriptor() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return getStableName();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }
}

package p852kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n808#2,11:71\n808#2,11:82\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n55#1:71,11\n59#1:82,11\n*E\n"})
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final StorageManager storageManager;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        FqName packageFqName;
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String strAsString = classId.getRelativeClassName().asString();
        if (!StringsKt.contains$default((CharSequence) strAsString, (CharSequence) "Function", false, 2, (Object) null) || (functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), strAsString)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindComponent1 = functionalClassKindWithArity.component1();
        int iComponent2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull((List) arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, functionTypeKindComponent1, iComponent2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return (StringsKt.startsWith$default(strAsString, "Function", false, 2, (Object) null) || StringsKt.startsWith$default(strAsString, "KFunction", false, 2, (Object) null) || StringsKt.startsWith$default(strAsString, "SuspendFunction", false, 2, (Object) null) || StringsKt.startsWith$default(strAsString, "KSuspendFunction", false, 2, (Object) null)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(packageFqName, strAsString) != null;
    }

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
        this.module = module;
    }
}

package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmBuiltInClassDescriptorFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n808#2,11:58\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory\n*L\n23#1:58,11\n*E\n"})
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    @NotNull
    private static final ClassId CLONEABLE_CLASS_ID;

    @NotNull
    private static final Name CLONEABLE_NAME;

    @NotNull
    private final NotNullLazyValue cloneable$delegate;

    @NotNull
    private final Function1<ModuleDescriptor, DeclarationDescriptor> computeContainingDeclaration;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final FqName KOTLIN_FQ_NAME = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@NotNull final StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> computeContainingDeclaration) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.moduleDescriptor = moduleDescriptor;
        this.computeContainingDeclaration = computeContainingDeclaration;
        this.cloneable$delegate = storageManager.createLazyValue(new Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$$Lambda$0
            private final JvmBuiltInClassDescriptorFactory arg$0;
            private final StorageManager arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltInClassDescriptorFactory.cloneable_delegate$lambda$2(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = this;
                this.arg$1 = storageManager;
            }
        });
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        CLONEABLE_NAME = fqNameUnsafe.shortName();
        CLONEABLE_CLASS_ID = ClassId.Companion.topLevel(fqNameUnsafe.toSafe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuiltInsPackageFragment _init_$lambda$0(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        List<PackageFragmentDescriptor> fragments = module.getPackage(KOTLIN_FQ_NAME).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptorImpl cloneable_delegate$lambda$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.computeContainingDeclaration.invoke(jvmBuiltInClassDescriptorFactory.moduleDescriptor), CLONEABLE_NAME, Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(jvmBuiltInClassDescriptorFactory.moduleDescriptor.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(new CloneableClassScope(storageManager, classDescriptorImpl), SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    private final ClassDescriptorImpl getCloneable() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (Intrinsics.areEqual(classId, CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return Intrinsics.areEqual(packageFqName, KOTLIN_FQ_NAME) ? SetsKt.setOf(getCloneable()) : SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, CLONEABLE_NAME) && Intrinsics.areEqual(packageFqName, KOTLIN_FQ_NAME);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i11 & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return JvmBuiltInClassDescriptorFactory._init_$lambda$0((ModuleDescriptor) obj);
            }
        } : function1);
    }
}

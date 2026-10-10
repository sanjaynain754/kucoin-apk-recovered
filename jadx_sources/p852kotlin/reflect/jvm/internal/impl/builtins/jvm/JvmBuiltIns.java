package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: JvmBuiltIns.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,103:1\n1#2:104\n19#3:105\n*S KotlinDebug\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n*L\n80#1:105\n*E\n"})
public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    @NotNull
    private final NotNullLazyValue customizer$delegate;

    @NotNull
    private final Kind kind;

    @Nullable
    private Function0<Settings> settingsComputation;

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class Settings {
        private final boolean isAdditionalBuiltInsFeatureSupported;

        @NotNull
        private final ModuleDescriptor ownerModuleDescriptor;

        public Settings(@NotNull ModuleDescriptor ownerModuleDescriptor, boolean z11) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.ownerModuleDescriptor = ownerModuleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z11;
        }

        @NotNull
        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.ownerModuleDescriptor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.isAdditionalBuiltInsFeatureSupported;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JvmBuiltInsCustomizer customizer_delegate$lambda$5(final JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
        return new JvmBuiltInsCustomizer(builtInsModule, storageManager, new Function0(jvmBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$2
            private final JvmBuiltIns arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.customizer_delegate$lambda$5$lambda$4(this.arg$0);
            }

            {
                this.arg$0 = jvmBuiltIns;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings customizer_delegate$lambda$5$lambda$4(JvmBuiltIns jvmBuiltIns) {
        Function0<Settings> function0 = jvmBuiltIns.settingsComputation;
        if (function0 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        Settings settingsInvoke = function0.invoke();
        jvmBuiltIns.settingsComputation = null;
        return settingsInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings initialize$lambda$1(ModuleDescriptor moduleDescriptor, boolean z11) {
        return new Settings(moduleDescriptor, z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        Intrinsics.checkNotNullExpressionValue(classDescriptorFactories, "getClassDescriptorFactories(...)");
        StorageManager storageManager = getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "getStorageManager(...)");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
        return CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    @NotNull
    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.customizer$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void initialize(@NotNull final ModuleDescriptor moduleDescriptor, final boolean z11) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new Function0(moduleDescriptor, z11) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$1
            private final ModuleDescriptor arg$0;
            private final boolean arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.initialize$lambda$1(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = moduleDescriptor;
                this.arg$1 = z11;
            }
        });
    }

    public final void setPostponedSettingsComputation(@NotNull Function0<Settings> computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.settingsComputation = computation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@NotNull final StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.customizer$delegate = storageManager.createLazyValue(new Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$0
            private final JvmBuiltIns arg$0;
            private final StorageManager arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.customizer_delegate$lambda$5(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = this;
                this.arg$1 = storageManager;
            }
        });
        int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    createBuiltInsModule(true);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            createBuiltInsModule(false);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }
}

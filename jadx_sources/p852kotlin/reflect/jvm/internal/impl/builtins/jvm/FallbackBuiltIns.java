package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes61.dex */
final class FallbackBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final KotlinBuiltIns Instance = new FallbackBuiltIns();

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.Instance;
        }
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public PlatformDependentDeclarationFilter.All getPlatformDependentDeclarationFilter() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}

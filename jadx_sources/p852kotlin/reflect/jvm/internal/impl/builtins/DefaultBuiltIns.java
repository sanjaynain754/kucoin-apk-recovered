package p852kotlin.reflect.jvm.internal.impl.builtins;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: DefaultBuiltIns.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy<DefaultBuiltIns> Instance$delegate = LazyKt.lazy(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$$Lambda$0
        @Override // p852kotlin.jvm.functions.Function0
        public Object invoke() {
            return DefaultBuiltIns.Instance_delegate$lambda$0();
        }
    });

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.Instance$delegate.getValue();
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z11) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z11) {
            createBuiltInsModule(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns Instance_delegate$lambda$0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public /* synthetic */ DefaultBuiltIns(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}

package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyWrappedType extends WrappedType {

    @NotNull
    private final Function0<KotlinType> computation;

    @NotNull
    private final NotNullLazyValue<KotlinType> lazyValue;

    @NotNull
    private final StorageManager storageManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType refine$lambda$0(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.refineType((KotlinTypeMarker) lazyWrappedType.computation.invoke());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return this.lazyValue.invoke();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.storageManager, new Function0(kotlinTypeRefiner, this) { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$$Lambda$0
            private final KotlinTypeRefiner arg$0;
            private final LazyWrappedType arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyWrappedType.refine$lambda$0(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = kotlinTypeRefiner;
                this.arg$1 = this;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.storageManager = storageManager;
        this.computation = computation;
        this.lazyValue = storageManager.createLazyValue(computation);
    }
}

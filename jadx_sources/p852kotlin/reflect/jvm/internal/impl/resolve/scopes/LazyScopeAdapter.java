package p852kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: LazyScopeAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    @NotNull
    private final NotNullLazyValue<MemberScope> lazyScope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LazyScopeAdapter(@NotNull Function0<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(StorageManager NO_LOCKS, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
            Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, function0);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return this.lazyScope.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope lazyScope$lambda$1(Function0 function0) {
        MemberScope memberScope = (MemberScope) function0.invoke();
        if (memberScope instanceof AbstractScopeAdapter) {
            return ((AbstractScopeAdapter) memberScope).getActualScope();
        }
        return memberScope;
    }

    @JvmOverloads
    public LazyScopeAdapter(@NotNull StorageManager storageManager, @NotNull final Function0<? extends MemberScope> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.lazyScope = storageManager.createLazyValue(new Function0(getScope) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$$Lambda$0
            private final Function0 arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyScopeAdapter.lazyScope$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = getScope;
            }
        });
    }
}

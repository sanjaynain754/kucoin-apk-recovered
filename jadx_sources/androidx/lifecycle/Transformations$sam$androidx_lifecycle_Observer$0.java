package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p852kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

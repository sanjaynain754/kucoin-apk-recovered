package p694vk;

import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vk.j0 */
/* JADX INFO: compiled from: ChoosePhoneAreaActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class C45577j0 implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f102671b;

    public C45577j0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f102671b = function;
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
        return this.f102671b;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f102671b.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

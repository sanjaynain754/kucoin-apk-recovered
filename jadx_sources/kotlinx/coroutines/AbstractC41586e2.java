package kotlinx.coroutines;

import og0.C43066l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.e2 */
/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "toStringInternalImpl", "getImmediate", "()Lkotlinx/coroutines/e2;", "immediate", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41586e2 extends AbstractC41697j0 {
    @NotNull
    public abstract AbstractC41586e2 getImmediate();

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        return C43066l.m94608b(this, name);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl == null) {
            return C41717o0.m91174a(this) + '@' + C41717o0.m91175b(this);
        }
        return stringInternalImpl;
    }

    @Nullable
    public final String toStringInternalImpl() {
        AbstractC41586e2 immediate;
        AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
        if (this == abstractC41586e2M91393c) {
            return "Dispatchers.Main";
        }
        try {
            immediate = abstractC41586e2M91393c.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this != immediate) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }
}

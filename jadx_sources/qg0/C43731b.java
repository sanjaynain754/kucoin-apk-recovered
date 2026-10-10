package qg0;

import kotlinx.coroutines.AbstractC41697j0;
import og0.C43066l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: qg0.b */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lqg0/b;", "Lqg0/e;", "<init>", "()V", "", "parallelism", "", "name", "Lkotlinx/coroutines/j0;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43731b extends C43734e {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final C43731b f96681h = new C43731b();

    public C43731b() {
        super(C43738i.f96693c, C43738i.f96694d, C43738i.f96695e, C43738i.f96691a);
    }

    @Override // kotlinx.coroutines.AbstractC41710m1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        if (parallelism >= C43738i.f96693c) {
            return C43066l.m94608b(this, name);
        }
        return super.limitedParallelism(parallelism, name);
    }
}

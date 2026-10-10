package ci;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ci.c */
/* JADX INFO: compiled from: FuturesCoreApiException.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/exception/CrossGrayApiException;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "symbol", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getSymbol", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4982c implements InterfaceC4984e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f5556a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Throwable f5557b;

    public C4982c(@NotNull String symbol, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f5556a = symbol;
        this.f5557b = throwable;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF5556a() {
        return this.f5556a;
    }
}

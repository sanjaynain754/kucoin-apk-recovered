package ci;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ci.b */
/* JADX INFO: compiled from: FuturesCoreApiException.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/exception/ComposeDataException;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4981b implements InterfaceC4984e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Throwable f5555a;

    public C4981b(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f5555a = throwable;
    }
}

package bi;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.f */
/* JADX INFO: compiled from: FuturesPositionModeEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/event/FuturesPositionModeEvent;", "", "positionMode", "", "<init>", "(Ljava/lang/String;)V", "getPositionMode", "()Ljava/lang/String;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4614f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f4143a;

    public C4614f(@NotNull String positionMode) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        this.f4143a = positionMode;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF4143a() {
        return this.f4143a;
    }
}

package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(26)
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/lifecycle/Api26Impl;", "", "<init>", "()V", "toMillis", "", "timeout", "Ljava/time/Duration;", "lifecycle-livedata_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Api26Impl {

    @NotNull
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(@NotNull Duration timeout) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        return timeout.toMillis();
    }
}

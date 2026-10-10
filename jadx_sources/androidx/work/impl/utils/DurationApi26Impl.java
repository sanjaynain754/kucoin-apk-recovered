package androidx.work.impl.utils;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.time.Duration;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationApi26.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(26)
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, m90084d2 = {"toMillisCompat", "", "Ljava/time/Duration;", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
@JvmName(name = "DurationApi26Impl")
public final class DurationApi26Impl {
    @DoNotInline
    public static final long toMillisCompat(@NotNull Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return duration.toMillis();
    }
}

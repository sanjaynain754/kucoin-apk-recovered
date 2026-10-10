package p852kotlin.time.jdk8;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.time.ExperimentalTime;

/* JADX INFO: compiled from: InstantConversions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, m90084d2 = {"toJavaInstant", "Ljava/time/Instant;", "Lkotlin/time/Instant;", "toKotlinInstant", "kotlin-stdlib-jdk8"}, m90085k = 2, m90086mv = {2, 2, 0}, m90087pn = "kotlin.time", m90088xi = 48)
@JvmName(name = "InstantConversionsJDK8Kt")
public final class InstantConversionsJDK8Kt {
    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @NotNull
    public static final Instant toJavaInstant(@NotNull p852kotlin.time.Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @NotNull
    public static final p852kotlin.time.Instant toKotlinInstant(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return p852kotlin.time.Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}

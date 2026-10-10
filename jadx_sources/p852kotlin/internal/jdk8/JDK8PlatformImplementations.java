package p852kotlin.internal.jdk8;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.internal.jdk7.JDK7PlatformImplementations;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import p852kotlin.random.jdk8.PlatformThreadLocalRandom;
import p852kotlin.ranges.IntRange;
import p852kotlin.text.MatchGroup;
import p852kotlin.time.Clock;
import p852kotlin.time.ExperimentalTime;
import p852kotlin.time.Instant;
import p852kotlin.time.jdk8.InstantConversionsJDK8Kt;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0017¨\u0006\u0013"}, m90084d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "sdkIsNullOrAtLeast", "", "version", "", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "defaultPlatformRandom", "Lkotlin/random/Random;", "getSystemClock", "Lkotlin/time/Clock;", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    public static final class ReflectSdkVersion {

        @NotNull
        public static final ReflectSdkVersion INSTANCE = new ReflectSdkVersion();

        @JvmField
        @Nullable
        public static final Integer sdkVersion;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            sdkVersion = num2;
        }

        private ReflectSdkVersion() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int version) {
        Integer num = ReflectSdkVersion.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // p852kotlin.internal.PlatformImplementations
    @NotNull
    public Random defaultPlatformRandom() {
        return sdkIsNullOrAtLeast(34) ? new PlatformThreadLocalRandom() : super.defaultPlatformRandom();
    }

    @Override // p852kotlin.internal.PlatformImplementations
    @ExperimentalTime
    @NotNull
    public Clock getSystemClock() {
        return sdkIsNullOrAtLeast(26) ? new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations.getSystemClock.1
            @Override // p852kotlin.time.Clock
            public Instant now() {
                java.time.Instant instantNow = java.time.Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                return InstantConversionsJDK8Kt.toKotlinInstant(instantNow);
            }
        } : new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations.getSystemClock.2
            @Override // p852kotlin.time.Clock
            public Instant now() {
                return Instant.INSTANCE.fromEpochMilliseconds(System.currentTimeMillis());
            }
        };
    }

    @Override // p852kotlin.internal.PlatformImplementations
    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            IntRange intRange = new IntRange(matcher.start(name), matcher.end(name) - 1);
            if (intRange.getStart().intValue() >= 0) {
                String strGroup = matcher.group(name);
                Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                return new MatchGroup(strGroup, intRange);
            }
            return null;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}

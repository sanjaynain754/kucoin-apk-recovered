package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.ReplaceWith;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "2.1")
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\u0019\u0010!\u001a\u00020\"2\n\u0010#\u001a\u00060$j\u0002`%H\u0002¢\u0006\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, m90084d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toEpochMilliseconds", "plus", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "equals", "", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,864:1\n1#2:865\n803#3,14:866\n786#3,6:880\n803#3,14:886\n786#3,6:900\n786#3,6:907\n548#4:906\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n150#1:866,14\n153#1:880,6\n161#1:886,14\n164#1:900,6\n188#1:907,6\n184#1:906\n*E\n"})
@ExperimentalTime
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Instant MIN = new Instant(-31557014167219200L, 0);

    @NotNull
    private static final Instant MAX = new Instant(31556889864403199L, 999999999);

    /* JADX INFO: compiled from: Instant.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m90084d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "now", "Lkotlin/time/Instant;", "fromEpochMilliseconds", "epochMilliseconds", "", "fromEpochSeconds", "epochSeconds", "nanosecondAdjustment", "", "parse", "input", "", "parseOrNull", "DISTANT_PAST", "getDISTANT_PAST", "()Lkotlin/time/Instant;", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,864:1\n786#2,6:865\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n312#1:865,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
            long j11 = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j11 * 1000000000 != nanosecondAdjustment) {
                j11--;
            }
            long j12 = epochSeconds + j11;
            if ((epochSeconds ^ j12) < 0 && (j11 ^ epochSeconds) >= 0) {
                return epochSeconds > 0 ? Instant.INSTANCE.getMAX$kotlin_stdlib() : Instant.INSTANCE.getMIN$kotlin_stdlib();
            }
            if (j12 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j12 > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j13 = nanosecondAdjustment % 1000000000;
            return new Instant(j12, (int) (j13 + ((((j13 ^ 1000000000) & ((-j13) | j13)) >> 63) & 1000000000)));
        }

        private Companion() {
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion companion, long j11, long j12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j12 = 0;
            }
            return companion.fromEpochSeconds(j11, j12);
        }

        @NotNull
        public final Instant fromEpochMilliseconds(long epochMilliseconds) {
            long j11 = epochMilliseconds / 1000;
            if ((epochMilliseconds ^ 1000) < 0 && j11 * 1000 != epochMilliseconds) {
                j11--;
            }
            long j12 = epochMilliseconds % 1000;
            int i11 = (int) ((j12 + (1000 & (((j12 ^ 1000) & ((-j12) | j12)) >> 63))) * ((long) 1000000));
            if (j11 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            return j11 > 31556889864403199L ? getMAX$kotlin_stdlib() : fromEpochSeconds(j11, i11);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        @NotNull
        public final Instant now() {
            throw new NotImplementedError(null, 1, null);
        }

        @NotNull
        public final Instant parse(@NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.parseIso(input).toInstant();
        }

        @SinceKotlin(version = "2.2")
        @Nullable
        public final Instant parseOrNull(@NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.parseIso(input).toInstantOrNull();
        }

        @NotNull
        public final Instant getMAX$kotlin_stdlib() {
            return Instant.MAX;
        }

        @NotNull
        public final Instant getMIN$kotlin_stdlib() {
            return Instant.MIN;
        }

        @NotNull
        public final Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        @NotNull
        public final Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        @NotNull
        public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompare = Intrinsics.compare(this.epochSeconds, other.epochSeconds);
        return iCompare != 0 ? iCompare : Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m105286minusUwyO8pc(@NotNull Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m105216plusLRDsOJo(DurationKt.toDuration(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS), DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    public final long toEpochMilliseconds() {
        long j11 = this.epochSeconds;
        long j12 = 1000;
        if (j11 >= 0) {
            if (j11 != 1) {
                if (j11 != 0) {
                    long j13 = j11 * 1000;
                    if (j13 / 1000 != j11) {
                        return Long.MAX_VALUE;
                    }
                    j12 = j13;
                } else {
                    j12 = 0;
                }
            }
            long j14 = this.nanosecondsOfSecond / 1000000;
            long j15 = j12 + j14;
            if ((j12 ^ j15) >= 0 || (j14 ^ j12) < 0) {
                return j15;
            }
            return Long.MAX_VALUE;
        }
        long j16 = j11 + 1;
        if (j16 != 1) {
            if (j16 != 0) {
                long j17 = j16 * 1000;
                if (j17 / 1000 != j16) {
                    return Long.MIN_VALUE;
                }
                j12 = j17;
            } else {
                j12 = 0;
            }
        }
        long j18 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j19 = j12 + j18;
        if ((j12 ^ j19) >= 0 || (j18 ^ j12) < 0) {
            return j19;
        }
        return Long.MIN_VALUE;
    }

    public Instant(long j11, int i11) {
        this.epochSeconds = j11;
        this.nanosecondsOfSecond = i11;
        if (-31557014167219200L <= j11 && j11 < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final Object writeReplace() {
        return InstantJvmKt.serializedInstant(this);
    }

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m105285minusLRDsOJo(long duration) {
        return m105287plusLRDsOJo(Duration.m105231unaryMinusUwyO8pc(duration));
    }

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m105287plusLRDsOJo(long duration) {
        long jM105201getInWholeSecondsimpl = Duration.m105201getInWholeSecondsimpl(duration);
        int iM105203getNanosecondsComponentimpl = Duration.m105203getNanosecondsComponentimpl(duration);
        if (jM105201getInWholeSecondsimpl == 0 && iM105203getNanosecondsComponentimpl == 0) {
            return this;
        }
        long j11 = this.epochSeconds;
        long j12 = j11 + jM105201getInWholeSecondsimpl;
        if ((j11 ^ j12) < 0 && (jM105201getInWholeSecondsimpl ^ j11) >= 0) {
            if (Duration.m105214isPositiveimpl(duration)) {
                return MAX;
            }
            return MIN;
        }
        return INSTANCE.fromEpochSeconds(j12, this.nanosecondsOfSecond + iM105203getNanosecondsComponentimpl);
    }

    @NotNull
    public String toString() {
        return InstantKt.formatIso(this);
    }
}

package p852kotlin.time;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m90084d2 = {"Lkotlin/time/InstantParseResult;", "", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", "Success", "Failure", "Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult$Success;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@ExperimentalTime
interface InstantParseResult {

    /* JADX INFO: compiled from: Instant.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "input", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getError", "()Ljava/lang/String;", "getInput", "()Ljava/lang/CharSequence;", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Failure implements InstantParseResult {

        @NotNull
        private final String error;

        @NotNull
        private final CharSequence input;

        @Override // p852kotlin.time.InstantParseResult
        @Nullable
        public Instant toInstantOrNull() {
            return null;
        }

        public Failure(@NotNull String error, @NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(input, "input");
            this.error = error;
            this.input = input;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final CharSequence getInput() {
            return this.input;
        }

        @Override // p852kotlin.time.InstantParseResult
        @NotNull
        public Instant toInstant() {
            throw new InstantFormatException(this.error + " when parsing an Instant from \"" + InstantKt.truncateForErrorMessage(this.input, 64) + '\"');
        }
    }

    /* JADX INFO: compiled from: Instant.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lkotlin/time/InstantParseResult$Success;", "Lkotlin/time/InstantParseResult;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Success implements InstantParseResult {
        private final long epochSeconds;
        private final int nanosecondsOfSecond;

        public final long getEpochSeconds() {
            return this.epochSeconds;
        }

        public final int getNanosecondsOfSecond() {
            return this.nanosecondsOfSecond;
        }

        @Override // p852kotlin.time.InstantParseResult
        @NotNull
        public Instant toInstant() {
            long j11 = this.epochSeconds;
            Instant.Companion companion = Instant.INSTANCE;
            if (j11 >= companion.getMIN$kotlin_stdlib().getEpochSeconds() && this.epochSeconds <= companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                return companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
            }
            throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + this.epochSeconds + ')');
        }

        @Override // p852kotlin.time.InstantParseResult
        @Nullable
        public Instant toInstantOrNull() {
            long j11 = this.epochSeconds;
            Instant.Companion companion = Instant.INSTANCE;
            if (j11 < companion.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                return null;
            }
            return companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }

        public Success(long j11, int i11) {
            this.epochSeconds = j11;
            this.nanosecondsOfSecond = i11;
        }
    }

    @NotNull
    Instant toInstant();

    @Nullable
    Instant toInstantOrNull();
}

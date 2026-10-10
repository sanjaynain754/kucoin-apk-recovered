package kotlinx.coroutines.flow;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "Lkotlinx/coroutines/flow/w;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/w;)Lkotlinx/coroutines/flow/e;", "Companion", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SharingStarted {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f91642a;

    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed", "(JJ)Lkotlinx/coroutines/flow/SharingStarted;", "b", "Lkotlinx/coroutines/flow/SharingStarted;", "getEagerly", "()Lkotlinx/coroutines/flow/SharingStarted;", "Eagerly", "c", "getLazily", "Lazily", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f91642a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final SharingStarted Eagerly = new C41677v();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final SharingStarted Lazily = new StartedLazily();

        public static /* synthetic */ SharingStarted WhileSubscribed$default(Companion companion, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = 0;
            }
            if ((i11 & 2) != 0) {
                j12 = Long.MAX_VALUE;
            }
            return companion.WhileSubscribed(j11, j12);
        }

        @NotNull
        public final SharingStarted WhileSubscribed(long stopTimeoutMillis, long replayExpirationMillis) {
            return new StartedWhileSubscribed(stopTimeoutMillis, replayExpirationMillis);
        }

        @NotNull
        public final SharingStarted getEagerly() {
            return Eagerly;
        }

        @NotNull
        public final SharingStarted getLazily() {
            return Lazily;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SharingCommand> mo90862a(@NotNull InterfaceC41678w<Integer> subscriptionCount);
}

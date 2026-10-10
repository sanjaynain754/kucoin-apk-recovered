package androidx.core.os;

import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 35)
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/core/os/BufferFillPolicy;", "", "value", "", "(I)V", "getValue$core_release", "()I", "Companion", "Discard", "RingBuffer", "Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy$RingBuffer;", "core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class BufferFillPolicy {

    @JvmField
    @NotNull
    public static final BufferFillPolicy DISCARD = new Discard();

    @JvmField
    @NotNull
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    /* JADX INFO: compiled from: Profiling.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy;", "()V", "core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Landroidx/core/os/BufferFillPolicy$RingBuffer;", "Landroidx/core/os/BufferFillPolicy;", "()V", "core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    private BufferFillPolicy(int i11) {
        this.value = i11;
    }

    /* JADX INFO: renamed from: getValue$core_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}

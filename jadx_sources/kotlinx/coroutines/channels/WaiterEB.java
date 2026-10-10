package kotlinx.coroutines.channels;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41784z2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.q, reason: from toString */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/channels/q;", "", "Lkotlinx/coroutines/z2;", "waiter", "<init>", "(Lkotlinx/coroutines/z2;)V", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/z2;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class WaiterEB {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final InterfaceC41784z2 waiter;

    @NotNull
    public String toString() {
        return "WaiterEB(" + this.waiter + ')';
    }

    public WaiterEB(@NotNull InterfaceC41784z2 interfaceC41784z2) {
        this.waiter = interfaceC41784z2;
    }
}

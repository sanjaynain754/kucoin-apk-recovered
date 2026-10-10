package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.InterfaceC41751f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.o */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/coroutines/channels/o;", ExifInterface.LONGITUDE_EAST, "", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "p", "o", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f;", "iterator", "()Lkotlinx/coroutines/channels/f;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/selects/f;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lkotlinx/coroutines/selects/f;", "onReceive", "f", "onReceiveCatching", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41576o<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.o$a */
    /* JADX INFO: compiled from: Channel.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m90713a(InterfaceC41576o interfaceC41576o, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC41576o.mo90585a(cancellationException);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    InterfaceC41751f<E> mo90546A();

    @Nullable
    /* JADX INFO: renamed from: D */
    Object mo90550D(@NotNull Continuation<? super E> continuation);

    /* JADX INFO: renamed from: a */
    void mo90585a(@Nullable CancellationException cause);

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41751f<ChannelResult<E>> mo90596f();

    @NotNull
    InterfaceC41567f<E> iterator();

    @NotNull
    /* JADX INFO: renamed from: o */
    Object mo90609o();

    @Nullable
    /* JADX INFO: renamed from: p */
    Object mo90611p(@NotNull Continuation<? super ChannelResult<? extends E>> continuation);
}

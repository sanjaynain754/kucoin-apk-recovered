package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.g */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {ExifInterface.LONGITUDE_EAST, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lkotlinx/coroutines/channels/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/channels/d;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41568g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> InterfaceC41565d<E> m90690a(int i11, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        if (i11 == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(InterfaceC41565d.INSTANCE.m90687a(), function1) : new C41572k(1, bufferOverflow, function1);
        }
        if (i11 == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new C41572k(1, BufferOverflow.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i11 == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, function1) : new C41572k(1, bufferOverflow, function1);
        }
        if (i11 != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i11, function1) : new C41572k(i11, bufferOverflow, function1);
        }
        return new BufferedChannel(Integer.MAX_VALUE, function1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41565d m90691b(int i11, BufferOverflow bufferOverflow, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        return m90690a(i11, bufferOverflow, function1);
    }
}

package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43047b0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.d */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlinx/coroutines/channels/d;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/p;", "Lkotlinx/coroutines/channels/o;", "O0", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41565d<E> extends InterfaceC41577p<E>, InterfaceC41576o<E> {

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f91520a;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lkotlinx/coroutines/channels/d$a;", "", "<init>", "()V", "", "b", "I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f91520a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int CHANNEL_DEFAULT_CAPACITY = C43047b0.m94539b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* JADX INFO: renamed from: a */
        public final int m90687a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}

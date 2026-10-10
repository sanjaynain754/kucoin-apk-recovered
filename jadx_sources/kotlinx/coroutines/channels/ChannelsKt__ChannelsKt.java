package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.C41690i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/p;", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/channels/p;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n1009#2,2:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,2\n*E\n"})
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> Object m90680a(@NotNull InterfaceC41577p<? super E> interfaceC41577p, E e11) {
        Object objMo90594e = interfaceC41577p.mo90594e(e11);
        if (!(objMo90594e instanceof ChannelResult.C41560b)) {
            return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
        }
        return ((ChannelResult) C41690i.m91067b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(interfaceC41577p, e11, null), 1, null)).getHolder();
    }
}

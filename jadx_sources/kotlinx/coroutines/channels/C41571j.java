package kotlinx.coroutines.channels;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41702k1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.j */
/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lkotlinx/coroutines/channels/o;", "", "cause", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/channels/o;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,204:1\n94#1,8:205\n160#1:213\n94#1,3:214\n161#1,2:217\n101#1:219\n97#1,3:220\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n160#1:205,8\n192#1:213\n192#1:214,3\n192#1:217,2\n192#1:219\n192#1:220,3\n*E\n"})
public final /* synthetic */ class C41571j {
    @PublishedApi
    /* JADX INFO: renamed from: a */
    public static final void m90708a(@NotNull InterfaceC41576o<?> interfaceC41576o, @Nullable Throwable th2) {
        CancellationException cancellationExceptionM91113a = null;
        if (th2 != null) {
            cancellationExceptionM91113a = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionM91113a == null) {
                cancellationExceptionM91113a = C41702k1.m91113a("Channel was consumed, consumer had failed", th2);
            }
        }
        interfaceC41576o.mo90585a(cancellationExceptionM91113a);
    }
}

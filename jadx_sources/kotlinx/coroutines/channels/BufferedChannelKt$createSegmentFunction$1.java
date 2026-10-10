package kotlinx.coroutines.channels;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements Function2<Long, C41569h<E>, C41569h<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj) {
        return invoke(l11.longValue(), (C41569h) obj);
    }

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final C41569h<E> invoke(long j11, C41569h<E> c41569h) {
        return BufferedChannelKt.m90665x(j11, c41569h);
    }
}

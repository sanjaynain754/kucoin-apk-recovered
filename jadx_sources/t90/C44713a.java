package t90;

import aa0.InterfaceC0214b;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27355a;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;

/* JADX INFO: renamed from: t90.a */
/* JADX INFO: compiled from: Reader.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Lt90/a;", "Lcom/otaliastudios/transcoder/internal/pipeline/a;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lt90/c;", "Lt90/b;", "Laa0/b;", "source", "Lcom/otaliastudios/transcoder/common/TrackType;", "track", "<init>", "(Laa0/b;Lcom/otaliastudios/transcoder/common/TrackType;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "c", "Laa0/b;", "d", "Lcom/otaliastudios/transcoder/common/TrackType;", "Lw90/i;", "e", "Lw90/i;", "log", "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", "f", "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", "i", "()Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", AppsFlyerProperties.CHANNEL, "Laa0/b$a;", "g", "Laa0/b$a;", "chunk", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C44713a extends AbstractC27355a<Unit, InterfaceC27356b, ReaderData, InterfaceC44714b> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0214b source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TrackType track;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC27356b.Companion channel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0214b.a chunk;

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public InterfaceC27356b.Companion getChannel() {
        return this.channel;
    }

    public C44713a(@NotNull InterfaceC0214b source, @NotNull TrackType track) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(track, "track");
        this.source = source;
        this.track = track;
        this.log = new C45770i("Reader");
        this.channel = InterfaceC27356b.INSTANCE;
        this.chunk = new InterfaceC0214b.a();
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC44714b m98938h(C44713a c44713a) {
        return c44713a.m68050f();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<ReaderData> mo67997b(@NotNull AbstractC27360f.b<Unit> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.source.mo789b()) {
            this.log.m101066c("Source is drained! Returning Eos as soon as possible.");
            Pair<ByteBuffer, Integer> pairBuffer = m98938h(this).buffer();
            if (pairBuffer == null) {
                this.log.m101070h("Returning State.Wait because buffer is null.");
                return AbstractC27360f.d.f55760a;
            }
            ByteBuffer first = pairBuffer.getFirst();
            int iIntValue = pairBuffer.getSecond().intValue();
            ByteBuffer byteBuffer = first;
            byteBuffer.limit(0);
            InterfaceC0214b.a aVar = this.chunk;
            aVar.f630a = byteBuffer;
            aVar.f631b = false;
            aVar.f633d = true;
            return new AbstractC27360f.a(new ReaderData(aVar, iIntValue));
        }
        if (!this.source.mo788a(this.track)) {
            this.log.m101066c("Returning State.Wait because source can't read " + this.track + " right now.");
            return AbstractC27360f.d.f55760a;
        }
        Pair<ByteBuffer, Integer> pairBuffer2 = m98938h(this).buffer();
        if (pairBuffer2 == null) {
            this.log.m101070h("Returning State.Wait because buffer is null.");
            return AbstractC27360f.d.f55760a;
        }
        ByteBuffer first2 = pairBuffer2.getFirst();
        int iIntValue2 = pairBuffer2.getSecond().intValue();
        InterfaceC0214b.a aVar2 = this.chunk;
        aVar2.f630a = first2;
        this.source.mo793f(aVar2);
        return new AbstractC27360f.b(new ReaderData(this.chunk, iIntValue2));
    }
}

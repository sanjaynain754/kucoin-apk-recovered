package com.otaliastudios.transcoder.internal.data;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import t90.InterfaceC44714b;
import t90.InterfaceC44718f;
import t90.ReaderData;
import t90.WriterData;
import w90.C45770i;

/* JADX INFO: compiled from: Bridge.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\n \"*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006)"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/data/Bridge;", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "Lt90/c;", "Lt90/b;", "Lt90/g;", "Lt90/f;", "Landroid/media/MediaFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "<init>", "(Landroid/media/MediaFormat;)V", "Lkotlin/Pair;", "Ljava/nio/ByteBuffer;", "", "buffer", "()Lkotlin/Pair;", "next", "", "g", "(Lt90/f;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "Landroid/media/MediaFormat;", "Lw90/i;", "c", "Lw90/i;", "log", "d", "I", "bufferSize", "kotlin.jvm.PlatformType", "e", "Ljava/nio/ByteBuffer;", "f", "Lcom/otaliastudios/transcoder/internal/data/Bridge;", "()Lcom/otaliastudios/transcoder/internal/data/Bridge;", AppsFlyerProperties.CHANNEL, "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class Bridge implements InterfaceC27361g<ReaderData, InterfaceC44714b, WriterData, InterfaceC44718f>, InterfaceC44714b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MediaFormat format;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int bufferSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final ByteBuffer buffer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Bridge channel;

    public Bridge(@NotNull MediaFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        this.log = new C45770i("Bridge");
        int integer = format.getInteger("max-input-size");
        this.bufferSize = integer;
        this.buffer = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
        this.channel = this;
    }

    @Override // t90.InterfaceC44714b
    @NotNull
    public Pair<ByteBuffer, Integer> buffer() {
        this.buffer.clear();
        return TuplesKt.m90091to(this.buffer, 0);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public Bridge getChannel() {
        return this.channel;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<WriterData> mo67997b(@NotNull AbstractC27360f.b<ReaderData> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC0214b.a chunk = state.m68053a().getChunk();
        boolean z11 = chunk.f631b;
        ByteBuffer byteBuffer = chunk.f630a;
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "chunk.buffer");
        WriterData writerData = new WriterData(byteBuffer, chunk.f632c, z11 ? 1 : 0, new Function0<Unit>() { // from class: com.otaliastudios.transcoder.internal.data.Bridge$step$result$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        if (state instanceof AbstractC27360f.a) {
            return new AbstractC27360f.a(writerData);
        }
        return new AbstractC27360f.b(writerData);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo67962c(@NotNull InterfaceC44718f next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.log.m101066c(Intrinsics.stringPlus("initialize(): format=", this.format));
        next.mo98944d(this.format);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        InterfaceC27361g.a.m68055b(this);
    }
}

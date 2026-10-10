package com.otaliastudios.transcoder.internal.pipeline;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.c */
/* JADX INFO: compiled from: steps.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00028\u00018\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/c;", "", "D", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "C", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "<init>", "()V", "next", "", "c", "(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V", "b", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "getChannel", "()Lcom/otaliastudios/transcoder/internal/pipeline/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, AppsFlyerProperties.CHANNEL, "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27357c<D, C extends InterfaceC27356b> implements InterfaceC27361g<D, C, D, C> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C channel;

    /* JADX INFO: renamed from: a */
    public void m68051a(@NotNull C c11) {
        Intrinsics.checkNotNullParameter(c11, "<set-?>");
        this.channel = c11;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    public C getChannel() {
        C c11 = this.channel;
        if (c11 != null) {
            return c11;
        }
        Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: c */
    public void mo67962c(@NotNull C next) {
        Intrinsics.checkNotNullParameter(next, "next");
        m68051a(next);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        InterfaceC27361g.a.m68055b(this);
    }
}

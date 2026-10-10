package com.otaliastudios.transcoder.internal.pipeline;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.e */
/* JADX INFO: compiled from: steps.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u0001*\b\b\u0003\u0010\u0006*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH$¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/e;", "", "Input", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "InputChannel", "Output", "OutputChannel", "Lcom/otaliastudios/transcoder/internal/pipeline/a;", "<init>", "()V", "data", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;)V", "i", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "g", "()Lcom/otaliastudios/transcoder/internal/pipeline/f;", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27359e<Input, InputChannel extends InterfaceC27356b, Output, OutputChannel extends InterfaceC27356b> extends AbstractC27355a<Input, InputChannel, Output, OutputChannel> {
    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract AbstractC27360f<Output> mo67920g();

    /* JADX INFO: renamed from: h */
    public abstract void mo67921h(@NotNull Input data);

    /* JADX INFO: renamed from: i */
    public abstract void mo67922i(@NotNull Input data);

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC27360f<Output> mo67997b(@NotNull AbstractC27360f.b<Input> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (fresh) {
            if (state instanceof AbstractC27360f.a) {
                mo67922i(state.m68053a());
            } else {
                mo67921h(state.m68053a());
            }
        }
        return mo67920g();
    }
}

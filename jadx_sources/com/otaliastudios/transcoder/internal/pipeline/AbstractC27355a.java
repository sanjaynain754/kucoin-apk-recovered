package com.otaliastudios.transcoder.internal.pipeline;

import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.a */
/* JADX INFO: compiled from: steps.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u0001*\b\b\u0003\u0010\u0006*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\n\u001a\u00028\u00032\u0006\u0010\u000e\u001a\u00028\u00038\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/a;", "", "Input", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "InputChannel", "Output", "OutputChannel", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "<init>", "()V", "next", "", "c", "(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V", "<set-?>", "b", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "f", "()Lcom/otaliastudios/transcoder/internal/pipeline/b;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27355a<Input, InputChannel extends InterfaceC27356b, Output, OutputChannel extends InterfaceC27356b> implements InterfaceC27361g<Input, InputChannel, Output, OutputChannel> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public OutputChannel next;

    @NotNull
    /* JADX INFO: renamed from: f */
    public final OutputChannel m68050f() {
        OutputChannel outputchannel = this.next;
        if (outputchannel != null) {
            return outputchannel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("next");
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: c */
    public void mo67962c(@NotNull OutputChannel next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.next = next;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        InterfaceC27361g.a.m68055b(this);
    }
}

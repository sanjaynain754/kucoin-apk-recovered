package com.otaliastudios.transcoder.internal.pipeline;

import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.g */
/* JADX INFO: compiled from: Step.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u0001*\b\b\u0003\u0010\u0006*\u00020\u00032\u00020\u0001J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/g;", "", "Input", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "InputChannel", "Output", "OutputChannel", "next", "", "c", "(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "release", "()V", "getChannel", "()Lcom/otaliastudios/transcoder/internal/pipeline/b;", AppsFlyerProperties.CHANNEL, "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC27361g<Input, InputChannel extends InterfaceC27356b, Output, OutputChannel extends InterfaceC27356b> {
    @NotNull
    /* JADX INFO: renamed from: b */
    AbstractC27360f<Output> mo67997b(@NotNull AbstractC27360f.b<Input> state, boolean fresh);

    /* JADX INFO: renamed from: c */
    void mo67962c(@NotNull OutputChannel next);

    @NotNull
    InputChannel getChannel();

    void release();

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.g$a */
    /* JADX INFO: compiled from: Step.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <Input, InputChannel extends InterfaceC27356b, Output, OutputChannel extends InterfaceC27356b> void m68054a(@NotNull InterfaceC27361g<Input, InputChannel, Output, OutputChannel> interfaceC27361g, @NotNull OutputChannel next) {
            Intrinsics.checkNotNullParameter(interfaceC27361g, "this");
            Intrinsics.checkNotNullParameter(next, "next");
        }

        /* JADX INFO: renamed from: b */
        public static <Input, InputChannel extends InterfaceC27356b, Output, OutputChannel extends InterfaceC27356b> void m68055b(@NotNull InterfaceC27361g<Input, InputChannel, Output, OutputChannel> interfaceC27361g) {
            Intrinsics.checkNotNullParameter(interfaceC27361g, "this");
        }
    }
}

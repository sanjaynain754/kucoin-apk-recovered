package com.facebook.imagepipeline.producers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821z5.InterfaceC46704c;
import p821z5.InterfaceC46705d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d0 */
/* JADX INFO: compiled from: InternalRequestListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/d0;", "Lcom/facebook/imagepipeline/producers/c0;", "Lz5/c;", "Lz5/d;", "requestListener", "requestListener2", "<init>", "(Lz5/d;Lz5/c;)V", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "c", "(Lcom/facebook/imagepipeline/producers/w0;)V", "e", "", "throwable", "i", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/Throwable;)V", "g", "Lz5/d;", "d", "Lz5/c;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5686d0 extends C5683c0 implements InterfaceC46704c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC46705d requestListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC46704c requestListener2;

    public C5686d0(@Nullable InterfaceC46705d interfaceC46705d, @Nullable InterfaceC46704c interfaceC46704c) {
        super(interfaceC46705d, interfaceC46704c);
        this.requestListener = interfaceC46705d;
        this.requestListener2 = interfaceC46704c;
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: c */
    public void mo9455c(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        InterfaceC46705d interfaceC46705d = this.requestListener;
        if (interfaceC46705d != null) {
            interfaceC46705d.onRequestStart(producerContext.mo9666h(), producerContext.mo9663a(), producerContext.getId(), producerContext.mo9672n());
        }
        InterfaceC46704c interfaceC46704c = this.requestListener2;
        if (interfaceC46704c != null) {
            interfaceC46704c.mo9455c(producerContext);
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: e */
    public void mo9457e(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        InterfaceC46705d interfaceC46705d = this.requestListener;
        if (interfaceC46705d != null) {
            interfaceC46705d.onRequestSuccess(producerContext.mo9666h(), producerContext.getId(), producerContext.mo9672n());
        }
        InterfaceC46704c interfaceC46704c = this.requestListener2;
        if (interfaceC46704c != null) {
            interfaceC46704c.mo9457e(producerContext);
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: g */
    public void mo9459g(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        InterfaceC46705d interfaceC46705d = this.requestListener;
        if (interfaceC46705d != null) {
            interfaceC46705d.onRequestCancellation(producerContext.getId());
        }
        InterfaceC46704c interfaceC46704c = this.requestListener2;
        if (interfaceC46704c != null) {
            interfaceC46704c.mo9459g(producerContext);
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: i */
    public void mo9461i(@NotNull InterfaceC5733w0 producerContext, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        InterfaceC46705d interfaceC46705d = this.requestListener;
        if (interfaceC46705d != null) {
            interfaceC46705d.onRequestFailure(producerContext.mo9666h(), producerContext.getId(), throwable, producerContext.mo9672n());
        }
        InterfaceC46704c interfaceC46704c = this.requestListener2;
        if (interfaceC46704c != null) {
            interfaceC46704c.mo9461i(producerContext, throwable);
        }
    }
}

package vc0;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vc0.d */
/* JADX INFO: compiled from: CompletionHandlerBuilder.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"completionHandler", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "block", "Lkotlin/Function1;", "Lcom/trtc/uikit/livekit/common/CompletionHandlerBuilder;", "", "Lkotlin/ExtensionFunctionType;", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45495d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CompletionHandler m100463a(@NotNull Function1<? super C45494c, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C45494c c45494c = new C45494c();
        block.invoke(c45494c);
        return c45494c.m100460g();
    }
}

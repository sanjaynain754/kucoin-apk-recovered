package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 */
/* JADX INFO: compiled from: ExtensionWindowBackendApi1.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class C4268xa108efe7 extends FunctionReferenceImpl implements Function1<WindowLayoutInfo, Unit> {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowLayoutInfo windowLayoutInfo) {
        invoke2(windowLayoutInfo);
        return Unit.INSTANCE;
    }

    public C4268xa108efe7(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull WindowLayoutInfo p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        ((MulticastConsumer) this.receiver).accept(p11);
    }
}

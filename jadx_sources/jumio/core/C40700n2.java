package jumio.core;

import android.view.Choreographer;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.n2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40700n2 extends AbstractChoreographerFrameCallbackC40607V1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40700n2(long j11, C40759z1 frameRateCallback) {
        super(j11, frameRateCallback);
        Intrinsics.checkNotNullParameter(frameRateCallback, "frameRateCallback");
    }

    @Override // jumio.core.AbstractChoreographerFrameCallbackC40607V1
    /* JADX INFO: renamed from: a */
    public final String mo89240a() {
        String simpleName = C40700n2.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // jumio.core.AbstractChoreographerFrameCallbackC40607V1
    /* JADX INFO: renamed from: b */
    public final void mo89241b() {
        Choreographer.getInstance().postFrameCallback(this);
    }
}

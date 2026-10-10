package jumio.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.b4 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40641b4 extends AbstractChoreographerFrameCallbackC40607V1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40641b4(long j11, C40759z1 frameRateCallback) {
        super(j11, frameRateCallback);
        Intrinsics.checkNotNullParameter(frameRateCallback, "frameRateCallback");
    }

    @Override // jumio.core.AbstractChoreographerFrameCallbackC40607V1
    /* JADX INFO: renamed from: a */
    public final String mo89240a() {
        String simpleName = C40641b4.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // jumio.core.AbstractChoreographerFrameCallbackC40607V1
    /* JADX INFO: renamed from: b */
    public final void mo89241b() {
    }
}

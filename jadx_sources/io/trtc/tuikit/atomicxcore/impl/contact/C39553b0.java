package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.Map;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.b0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39553b0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f87840b;

    public C39553b0(C39531G0 c39531g0, C41716o c41716o) {
        this.f87839a = c39531g0;
        this.f87840b = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87840b;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Map mapEmptyMap = (Map) obj;
        InterfaceC41669n interfaceC41669n = this.f87839a.f87776r;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        interfaceC41669n.setValue(mapEmptyMap);
        C41716o c41716o = this.f87840b;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}

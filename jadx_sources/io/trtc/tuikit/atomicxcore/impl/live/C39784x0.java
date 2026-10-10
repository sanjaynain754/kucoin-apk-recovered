package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.x0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39784x0 extends TUILiveListManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88409a;

    public C39784x0(C39695N0 c39695n0) {
        this.f88409a = c39695n0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.Observer
    public final void onLiveInfoChanged(TUILiveListManager.LiveInfo liveInfo, List modifyFlagList) {
        Object value;
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        C39510r c39510r = this.f88409a.f88203d;
        String message = "onLiveInfoChanged: " + liveInfo + ", " + modifyFlagList;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = 0;
        c39510r.m88251a(0, message);
        C39695N0 c39695n0 = this.f88409a;
        LiveInfo liveInfoM88330a = AbstractC39778u0.m88330a(liveInfo);
        c39695n0.getClass();
        if (Intrinsics.areEqual(liveInfoM88330a.getLiveID(), ((LiveInfo) c39695n0.f88202c.getValue()).getLiveID())) {
            InterfaceC41669n interfaceC41669n = c39695n0.f88202c;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, C39695N0.m88306a((LiveInfo) value, liveInfoM88330a, modifyFlagList)));
        }
        Iterator it = ((List) c39695n0.f88200a.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.areEqual(((LiveInfo) it.next()).getLiveID(), liveInfoM88330a.getLiveID())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) c39695n0.f88200a.getValue());
        mutableList.set(i11, C39695N0.m88306a((LiveInfo) ((List) c39695n0.f88200a.getValue()).get(i11), liveInfoM88330a, modifyFlagList));
        c39695n0.f88200a.setValue(mutableList);
    }
}

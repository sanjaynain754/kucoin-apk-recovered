package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.G0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39681G0 implements TUILiveListManager.LiveInfoListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88158c;

    public C39681G0(C39695N0 c39695n0, String str, CompletionHandler completionHandler) {
        this.f88156a = c39695n0;
        this.f88157b = str;
        this.f88158c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88156a.f88203d;
        String message2 = "fetchLiveList onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88158c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoListCallback
    public final void onSuccess(TUILiveListManager.LiveInfoListResult result) {
        Object value;
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC39465b.m88232a(this.f88156a.f88203d, "fetchLiveList onSuccess", "message", 0, "fetchLiveList onSuccess");
        List<TUILiveListManager.LiveInfo> list = result.liveInfoList;
        String str = result.cursor;
        String str2 = this.f88157b;
        if (str2 == null || str2.length() == 0) {
            InterfaceC41669n interfaceC41669n = this.f88156a.f88200a;
            Intrinsics.checkNotNull(list);
            ArrayList arrayList = new ArrayList();
            for (TUILiveListManager.LiveInfo liveInfo : list) {
                Intrinsics.checkNotNull(liveInfo);
                arrayList.add(AbstractC39778u0.m88330a(liveInfo));
            }
            interfaceC41669n.setValue(arrayList);
        } else {
            C39695N0 c39695n0 = this.f88156a;
            Intrinsics.checkNotNull(list);
            ArrayList arrayList2 = new ArrayList();
            for (TUILiveListManager.LiveInfo liveInfo2 : list) {
                Intrinsics.checkNotNull(liveInfo2);
                arrayList2.add(AbstractC39778u0.m88330a(liveInfo2));
            }
            c39695n0.getClass();
            if (!arrayList2.isEmpty()) {
                Iterable iterable = (Iterable) c39695n0.f88200a.getValue();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((LiveInfo) it.next()).getLiveID());
                }
                Set set = CollectionsKt.toSet(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!set.contains(((LiveInfo) obj).getLiveID())) {
                        arrayList4.add(obj);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    InterfaceC41669n interfaceC41669n2 = c39695n0.f88200a;
                    do {
                        value = interfaceC41669n2.getValue();
                    } while (!interfaceC41669n2.compareAndSet(value, CollectionsKt.plus((Collection) value, (Iterable) arrayList4)));
                }
            }
        }
        InterfaceC41669n interfaceC41669n3 = this.f88156a.f88201b;
        Intrinsics.checkNotNull(str);
        interfaceC41669n3.setValue(str);
        CompletionHandler completionHandler = this.f88158c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}

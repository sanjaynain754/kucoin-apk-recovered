package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.Z */
/* JADX INFO: loaded from: classes61.dex */
public final class C39717Z implements TUILiveListManager.LiveInfoListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39726c0 f88247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88249c;

    public C39717Z(C39726c0 c39726c0, String str, CompletionHandler completionHandler) {
        this.f88247a = c39726c0;
        this.f88248b = str;
        this.f88249c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88247a.f88268i;
        String message2 = "getCoHostCandidates onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88249c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoListCallback
    public final void onSuccess(TUILiveListManager.LiveInfoListResult result) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC39465b.m88232a(this.f88247a.f88268i, "getCoHostCandidates onSuccess", "message", 0, "getCoHostCandidates onSuccess");
        List<TUILiveListManager.LiveInfo> list = result.liveInfoList;
        String str = result.cursor;
        if (this.f88248b.length() == 0) {
            InterfaceC41669n interfaceC41669n = this.f88247a.f88264e;
            do {
                value2 = interfaceC41669n.getValue();
                Intrinsics.checkNotNull(list);
                arrayList = new ArrayList();
                for (TUILiveListManager.LiveInfo liveInfo : list) {
                    Intrinsics.checkNotNull(liveInfo);
                    Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
                    String str2 = liveInfo.roomId;
                    String str3 = liveInfo.ownerId;
                    String str4 = liveInfo.ownerName;
                    String str5 = liveInfo.ownerAvatarUrl;
                    Intrinsics.checkNotNull(str3);
                    Intrinsics.checkNotNull(str4);
                    Intrinsics.checkNotNull(str5);
                    Intrinsics.checkNotNull(str2);
                    arrayList.add(new SeatUserInfo(str3, str4, str5, null, str2, null, false, null, false, null, 1000, null));
                }
            } while (!interfaceC41669n.compareAndSet(value2, arrayList));
        } else {
            C39726c0 c39726c0 = this.f88247a;
            Intrinsics.checkNotNull(list);
            c39726c0.getClass();
            if (!list.isEmpty()) {
                Iterable iterable = (Iterable) c39726c0.f88264e.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SeatUserInfo) it.next()).getLiveID());
                }
                Set set = CollectionsKt.toSet(arrayList2);
                Iterable iterable2 = (Iterable) c39726c0.f88263d.getValue();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((SeatUserInfo) it2.next()).getLiveID());
                }
                Set setPlus = SetsKt.plus(set, (Iterable) CollectionsKt.toSet(arrayList3));
                ArrayList<TUILiveListManager.LiveInfo> arrayList4 = new ArrayList();
                for (Object obj : list) {
                    if (!setPlus.contains(((TUILiveListManager.LiveInfo) obj).roomId)) {
                        arrayList4.add(obj);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                    for (TUILiveListManager.LiveInfo liveInfo2 : arrayList4) {
                        Intrinsics.checkNotNullParameter(liveInfo2, "liveInfo");
                        String str6 = liveInfo2.roomId;
                        String str7 = liveInfo2.ownerId;
                        String str8 = liveInfo2.ownerName;
                        String str9 = liveInfo2.ownerAvatarUrl;
                        Intrinsics.checkNotNull(str7);
                        Intrinsics.checkNotNull(str8);
                        Intrinsics.checkNotNull(str9);
                        Intrinsics.checkNotNull(str6);
                        arrayList5.add(new SeatUserInfo(str7, str8, str9, null, str6, null, false, null, false, null, 1000, null));
                    }
                    InterfaceC41669n interfaceC41669n2 = c39726c0.f88264e;
                    do {
                        value = interfaceC41669n2.getValue();
                    } while (!interfaceC41669n2.compareAndSet(value, CollectionsKt.plus((Collection) value, (Iterable) arrayList5)));
                }
            }
        }
        InterfaceC41669n interfaceC41669n3 = this.f88247a.f88265f;
        Intrinsics.checkNotNull(str);
        interfaceC41669n3.setValue(str);
        CompletionHandler completionHandler = this.f88249c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}

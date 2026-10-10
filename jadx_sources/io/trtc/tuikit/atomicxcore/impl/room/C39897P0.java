package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.P0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39897P0 implements TUIConferenceListManager.FetchScheduledConferenceListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39904T0 f88677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ListResultCompletionHandler f88678c;

    public C39897P0(String str, C39904T0 c39904t0, ListResultCompletionHandler listResultCompletionHandler) {
        this.f88676a = str;
        this.f88677b = c39904t0;
        this.f88678c = listResultCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchScheduledConferenceListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        ListResultCompletionHandler listResultCompletionHandler = this.f88678c;
        if (listResultCompletionHandler != null) {
            listResultCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchScheduledConferenceListCallback
    public final void onSuccess(TUIConferenceListManager.ScheduledConferenceListResult result) {
        Object value;
        Intrinsics.checkNotNullParameter(result, "result");
        List<TUIConferenceListManager.ConferenceInfo> conferenceInfoList = result.conferenceInfoList;
        Intrinsics.checkNotNullExpressionValue(conferenceInfoList, "conferenceInfoList");
        ArrayList arrayList = new ArrayList();
        for (TUIConferenceListManager.ConferenceInfo conferenceInfo : conferenceInfoList) {
            Intrinsics.checkNotNull(conferenceInfo);
            RoomInfo roomInfoM88364a = AbstractC39939m0.m88364a(conferenceInfo);
            if (roomInfoM88364a != null) {
                arrayList.add(roomInfoM88364a);
            }
        }
        String str = result.cursor;
        if (this.f88676a.length() == 0) {
            this.f88677b.f88695a.setValue(arrayList);
        } else {
            C39904T0 c39904t0 = this.f88677b;
            c39904t0.getClass();
            if (!arrayList.isEmpty()) {
                Iterable iterable = (Iterable) c39904t0.f88695a.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((RoomInfo) it.next()).getRoomID());
                }
                Set set = CollectionsKt.toSet(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!set.contains(((RoomInfo) obj).getRoomID())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    InterfaceC41669n interfaceC41669n = c39904t0.f88695a;
                    do {
                        value = interfaceC41669n.getValue();
                    } while (!interfaceC41669n.compareAndSet(value, CollectionsKt.plus((Collection) value, (Iterable) arrayList3)));
                }
            }
        }
        InterfaceC41669n interfaceC41669n2 = this.f88677b.f88696b;
        Intrinsics.checkNotNull(str);
        interfaceC41669n2.setValue(str);
        ListResultCompletionHandler listResultCompletionHandler = this.f88678c;
        if (listResultCompletionHandler != null) {
            listResultCompletionHandler.onSuccess(arrayList, str);
        }
    }
}

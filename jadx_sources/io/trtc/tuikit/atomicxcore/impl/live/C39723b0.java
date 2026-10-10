package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.b0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39723b0 implements TUILiveConnectionManager.ConnectionRequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39726c0 f88255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88257c;

    public C39723b0(C39726c0 c39726c0, String str, CompletionHandler completionHandler) {
        this.f88255a = c39726c0;
        this.f88256b = str;
        this.f88257c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionRequestCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88255a.f88268i;
        String message2 = "Response: requestHostConnection failed code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        InterfaceC41669n interfaceC41669n = this.f88255a.f88266g;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        String str = this.f88256b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), str)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        CompletionHandler completionHandler = this.f88257c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionRequestCallback
    public final void onSuccess(Map map) {
        String strName;
        AbstractC39465b.m88232a(this.f88255a.f88268i, "Response: requestHostConnection success", "message", 0, "Response: requestHostConnection success");
        if (map != null) {
            String str = this.f88256b;
            CompletionHandler completionHandler = this.f88257c;
            C39726c0 c39726c0 = this.f88255a;
            String str2 = "";
            if (!map.containsKey(str)) {
                InterfaceC41669n interfaceC41669n = c39726c0.f88266g;
                Iterable iterable = (Iterable) interfaceC41669n.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), str)) {
                        arrayList.add(obj);
                    }
                }
                interfaceC41669n.setValue(arrayList);
                if (completionHandler != null) {
                    completionHandler.onFailure(-1, "");
                    return;
                }
                return;
            }
            TUILiveConnectionManager.ConnectionCode connectionCode = (TUILiveConnectionManager.ConnectionCode) map.get(str);
            if (connectionCode == TUILiveConnectionManager.ConnectionCode.SUCCESS) {
                if (completionHandler != null) {
                    completionHandler.onSuccess();
                    return;
                }
                return;
            }
            InterfaceC41669n interfaceC41669n2 = c39726c0.f88266g;
            Iterable iterable2 = (Iterable) interfaceC41669n2.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterable2) {
                if (!Intrinsics.areEqual(((SeatUserInfo) obj2).getLiveID(), str)) {
                    arrayList2.add(obj2);
                }
            }
            interfaceC41669n2.setValue(arrayList2);
            if (completionHandler != null) {
                int value = connectionCode != null ? connectionCode.getValue() : -1;
                if (connectionCode != null && (strName = connectionCode.name()) != null) {
                    str2 = strName;
                }
                completionHandler.onFailure(value, str2);
            }
        }
    }
}

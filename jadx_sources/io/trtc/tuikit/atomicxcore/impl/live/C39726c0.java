package io.trtc.tuikit.atomicxcore.impl.live;

import android.util.Log;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoHostLayoutTemplate;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import io.trtc.tuikit.atomicxcore.api.live.CoHostState;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStatus;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import io.trtc.tuikit.atomicxcore.impl.live.C39726c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.c0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39726c0 extends CoHostStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88260a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f88261b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88262c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88263d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88264e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f88265f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f88266g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f88267h;

    /* JADX INFO: renamed from: i */
    public final C39510r f88268i;

    /* JADX INFO: renamed from: j */
    public final C39509q f88269j;

    /* JADX INFO: renamed from: k */
    public final TUILiveConnectionManager f88270k;

    /* JADX INFO: renamed from: l */
    public final int f88271l;

    /* JADX INFO: renamed from: m */
    public final TUILiveListManager f88272m;

    /* JADX INFO: renamed from: n */
    public final C39713X f88273n;

    /* JADX INFO: renamed from: o */
    public final CoHostState f88274o;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88268i;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    /* JADX INFO: renamed from: c */
    public static final void m88319c(String str) {
        Log.e("CoHostStoreImpl", "setCoHostLayoutTemplateID:[onResponse:[result:" + str + "]]");
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void acceptHostConnection(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: acceptHostConnection called with fromHostLiveID=", str, this.f88268i, "message", 0);
        this.f88267h.setValue(null);
        this.f88270k.acceptConnection(str, new C39694N(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void addCoHostListener(CoHostListener coHostListener) {
        C39510r c39510r = this.f88268i;
        String message = "API: addCoHostListener called with listener=" + coHostListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88269j.m88248a(coHostListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88268i, "message", 0);
        this.f88270k.addObserver(this.f88273n);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void cancelHostConnection(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: cancelHostConnection called with toHostLiveID=", str, this.f88268i, "message", 0);
        InterfaceC41669n interfaceC41669n = this.f88266g;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), str)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        this.f88270k.cancelConnectionRequest(CollectionsKt.listOf(str), new C39696O(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void exitHostConnection(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88268i, "API: exitHostConnection called", "message", 0, "API: exitHostConnection called");
        this.f88263d.setValue(CollectionsKt.emptyList());
        this.f88270k.disconnect(new C39715Y(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void getCoHostCandidates(String cursor, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        C39510r c39510r = this.f88268i;
        String message = "API: getCoHostCandidates: cursor=" + cursor + ", count=" + this.f88271l;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88272m.fetchLiveList(cursor, this.f88271l, new C39717Z(this, cursor, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final CoHostState getCoHostState() {
        return this.f88274o;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void rejectHostConnection(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: rejectHostConnection called with fromHostLiveID=", str, this.f88268i, "message", 0);
        this.f88267h.setValue(null);
        this.f88270k.rejectConnection(str, new C39720a0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void removeCoHostListener(CoHostListener coHostListener) {
        C39510r c39510r = this.f88268i;
        String message = "API: removeCoHostListener called with listener=" + coHostListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88269j.m88250b(coHostListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostStore
    public final void requestHostConnection(String str, CoHostLayoutTemplate layoutTemplate, int i11, String str2, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(layoutTemplate, "layoutTemplate");
        C39510r c39510r = this.f88268i;
        String message = "API: requestHostConnection called with targetHostLiveID=" + str + ", layoutTemplate=" + layoutTemplate + ", timeout=" + i11 + ", extraInfo=" + str2 + ", completion=" + completionHandler;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        SeatUserInfo seatUserInfo = new SeatUserInfo(null, null, null, null, str == null ? "" : str, null, false, null, false, null, 1007, null);
        InterfaceC41669n interfaceC41669n = this.f88266g;
        interfaceC41669n.setValue(CollectionsKt.plus((Collection<? extends SeatUserInfo>) interfaceC41669n.getValue(), seatUserInfo));
        m88320a(layoutTemplate);
        this.f88270k.requestConnection(CollectionsKt.listOf(str), i11, str2, new C39723b0(this, str, completionHandler));
    }

    public C39726c0(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88260a = liveID;
        this.f88261b = roomEngine;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CoHostStatus.DISCONNECTED);
        this.f88262c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88263d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88264e = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a("");
        this.f88265f = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88266g = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(null);
        this.f88267h = interfaceC41669nM91009a6;
        this.f88268i = AbstractC39398a.m88229a("CoHostStoreImpl", "file", "AtomicXCore-Live", "CoHostStoreImpl");
        this.f88269j = new C39509q();
        this.f88270k = roomEngine.getLiveConnectionManager();
        this.f88271l = 20;
        Object extension = roomEngine.getExtension(TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager");
        this.f88272m = (TUILiveListManager) extension;
        this.f88273n = new C39713X(this);
        this.f88274o = new CoHostState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a5, interfaceC41669nM91009a6, interfaceC41669nM91009a4, interfaceC41669nM91009a3);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88268i, "message", 0);
        CollectionsKt.removeAll((List) this.f88269j.f87705a, (Function1) C39506n.f87702a);
        this.f88270k.removeObserver(this.f88273n);
    }

    /* JADX INFO: renamed from: a */
    public final void m88320a(CoHostLayoutTemplate coHostLayoutTemplate) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateId", coHostLayoutTemplate.getValue());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "setCoHostLayoutTemplateId");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f88261b.callExperimentalAPI(string, new TUIRoomDefine.ExperimentalAPIResponseCallback() { // from class: fg0.b
                @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ExperimentalAPIResponseCallback
                public final void onResponse(String str) {
                    C39726c0.m88319c(str);
                }
            });
        } catch (Exception unused) {
            Log.e("CoHostStoreImpl", hashCode() + " setCoHostLayoutTemplateID:[Exception]");
        }
    }
}

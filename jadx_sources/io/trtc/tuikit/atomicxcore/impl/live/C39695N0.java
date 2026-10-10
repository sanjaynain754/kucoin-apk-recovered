package io.trtc.tuikit.atomicxcore.impl.live;

import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListState;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.MetaDataCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.N0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39695N0 extends LiveListStore {

    /* JADX INFO: renamed from: j */
    public static final Lazy f88198j = LazyKt.lazy(C39780v0.f88404a);

    /* JADX INFO: renamed from: k */
    public static int f88199k = 26;

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88200a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88201b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88202c;

    /* JADX INFO: renamed from: d */
    public final C39510r f88203d;

    /* JADX INFO: renamed from: e */
    public final C39509q f88204e;

    /* JADX INFO: renamed from: f */
    public final TUIRoomEngine f88205f;

    /* JADX INFO: renamed from: g */
    public final TUILiveListManager f88206g;

    /* JADX INFO: renamed from: h */
    public final C39509q f88207h;

    /* JADX INFO: renamed from: i */
    public final LiveListState f88208i;

    /* JADX INFO: renamed from: a */
    public static boolean m88307a(int i11) {
        return 1 <= i11 && i11 < 200;
    }

    public C39695N0() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88200a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a("");
        this.f88201b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        this.f88202c = interfaceC41669nM91009a3;
        this.f88203d = AbstractC39398a.m88229a("LiveListStoreImpl", "file", "AtomicXCore-Live", "LiveListStoreImpl");
        this.f88204e = new C39509q();
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(tUIRoomEngineSharedInstance, "sharedInstance(...)");
        this.f88205f = tUIRoomEngineSharedInstance;
        Object extension = tUIRoomEngineSharedInstance.getExtension(TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager");
        TUILiveListManager tUILiveListManager = (TUILiveListManager) extension;
        this.f88206g = tUILiveListManager;
        C39671B0 c39671b0 = new C39671B0(this);
        C39784x0 c39784x0 = new C39784x0(this);
        this.f88207h = new C39509q();
        this.f88208i = new LiveListState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3);
        tUIRoomEngineSharedInstance.addObserver(c39671b0);
        tUILiveListManager.addObserver(c39784x0);
    }

    /* JADX INFO: renamed from: a */
    public final void m88309a(boolean z11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("api", "enableLiveQos");
            jSONObject2.put(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, z11);
            jSONObject.put(ReportDataTable.COLUMN_PARAMS, jSONObject2);
            this.f88205f.callExperimentalAPI(jSONObject.toString(), null);
        } catch (JSONException e11) {
            C39510r c39510r = this.f88203d;
            String message = "enableLiveQos:" + e11.getMessage();
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(2, message);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void addLiveListListener(LiveListListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C39510r c39510r = this.f88203d;
        String message = "API: addLiveListListener called with listener=" + listener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88204e.m88248a(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void createLive(LiveInfo liveInfo, LiveInfoCompletionHandler liveInfoCompletionHandler) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88203d;
        String message = "API: fcreateLive: " + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        m88308a();
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88326a(liveInfo.getLiveID());
        if (!m88307a(liveInfo.getSeatLayoutTemplateID())) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("api", "enableUnlimitedRoom");
                jSONObject2.put(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, true);
                jSONObject.put(ReportDataTable.COLUMN_PARAMS, jSONObject2);
                this.f88205f.callExperimentalAPI(jSONObject.toString(), null);
            } catch (JSONException e11) {
                C39510r c39510r2 = this.f88203d;
                String message2 = "enableUnlimitedRoom:" + e11.getMessage();
                c39510r2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                c39510r2.m88251a(2, message2);
            }
        }
        m88309a(true);
        this.f88206g.startLive(AbstractC39778u0.m88329a(liveInfo), new C39673C0(this, liveInfoCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void endLive(StopLiveCompletionHandler stopLiveCompletionHandler) {
        C39510r c39510r = this.f88203d;
        String message = "API: endLive: " + ((LiveInfo) this.f88202c.getValue()).getLiveID();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (!m88307a(((LiveInfo) this.f88202c.getValue()).getSeatLayoutTemplateID())) {
            m88309a(false);
        }
        String liveID = ((LiveInfo) this.f88202c.getValue()).getLiveID();
        this.f88207h.m88249a((Function1) new C39675D0(liveID));
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88328b(liveID);
        this.f88206g.stopLive(new C39677E0(this, stopLiveCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void fetchLiveInfo(String liveID, LiveInfoCompletionHandler liveInfoCompletionHandler) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: getLiveInfo: liveID = ", liveID, this.f88203d, "message", 0);
        this.f88206g.getLiveInfo(liveID, new C39679F0(this, liveInfoCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void fetchLiveList(String str, int i11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88203d;
        String message = "API: fetchLiveList: cursor=" + str + ", count=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88206g.fetchLiveList(str, i11, new C39681G0(this, str, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final LiveListState getLiveState() {
        return this.f88208i;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void joinLive(String str, LiveInfoCompletionHandler liveInfoCompletionHandler) {
        AbstractC39662a.m88299a("API: joinLive: ", str, this.f88203d, "message", 0);
        m88308a();
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88326a(str == null ? "" : str);
        m88309a(true);
        this.f88206g.joinLive(str, new C39683H0(this, liveInfoCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void leaveLive(CompletionHandler completionHandler) {
        C39510r c39510r = this.f88203d;
        String message = "API: leaveLive: " + ((LiveInfo) this.f88202c.getValue()).getLiveID();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (!m88307a(((LiveInfo) this.f88202c.getValue()).getSeatLayoutTemplateID())) {
            m88309a(false);
        }
        String liveID = ((LiveInfo) this.f88202c.getValue()).getLiveID();
        this.f88207h.m88249a((Function1) new C39685I0(liveID));
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88328b(liveID);
        this.f88206g.leaveLive(new C39687J0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void queryMetaData(List keys, MetaDataCompletionHandler metaDataCompletionHandler) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        C39510r c39510r = this.f88203d;
        String message = "API: queryMetaData: " + keys;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88205f.getRoomMetadata(keys, new C39689K0(this, metaDataCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void removeLiveListListener(LiveListListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C39510r c39510r = this.f88203d;
        String message = "API: removeLiveListListener called with listener=" + listener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88204e.m88250b(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void reset() {
        AbstractC39465b.m88232a(this.f88203d, "API: reset", "message", 0, "API: reset");
        this.f88200a.setValue(CollectionsKt.emptyList());
        this.f88201b.setValue("");
        this.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void updateLiveInfo(LiveInfo liveInfo, List modifyFlagList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        C39510r c39510r = this.f88203d;
        String message = "API: updateLiveInfo: " + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUILiveListManager tUILiveListManager = this.f88206g;
        TUILiveListManager.LiveInfo liveInfoM88329a = AbstractC39778u0.m88329a(liveInfo);
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        ArrayList arrayList = new ArrayList();
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.LIVE_NAME)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.NAME);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.NOTICE)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.NOTICE);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.IS_MESSAGE_DISABLE)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.DISABLE_MESSAGE);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.IS_PUBLIC_VISIBLE)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.PUBLISH);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.SEAT_MODE)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.TAKE_SEAT_MODE);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.COVER_URL)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.COVER_URL);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.BACKGROUND_URL)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.BACKGROUND_URL);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.CATEGORY_LIST)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.CATEGORY);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.ACTIVITY_STATUS)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.ACTIVITY_STATUS);
        }
        if (modifyFlagList.contains(LiveInfo.ModifyFlag.SEAT_LAYOUT_TEMPLATE_ID)) {
            arrayList.add(TUILiveListManager.LiveModifyFlag.SEAT_LAYOUT_TEMPLATE_ID);
        }
        tUILiveListManager.setLiveInfo(liveInfoM88329a, arrayList, new C39691L0(this, modifyFlagList, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListStore
    public final void updateLiveMetaData(HashMap metaData, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        C39510r c39510r = this.f88203d;
        String message = "API: updateLiveMetaData: " + metaData;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88205f.setRoomMetadataByAdmin(metaData, new C39693M0(this, completionHandler));
    }

    /* JADX INFO: renamed from: a */
    public static LiveInfo m88306a(LiveInfo liveInfo, LiveInfo liveInfo2, List list) {
        String liveName = list.contains(TUILiveListManager.LiveModifyFlag.NAME) ? liveInfo2.getLiveName() : liveInfo.getLiveName();
        String notice = list.contains(TUILiveListManager.LiveModifyFlag.NOTICE) ? liveInfo2.getNotice() : liveInfo.getNotice();
        String coverURL = list.contains(TUILiveListManager.LiveModifyFlag.COVER_URL) ? liveInfo2.getCoverURL() : liveInfo.getCoverURL();
        String backgroundURL = list.contains(TUILiveListManager.LiveModifyFlag.BACKGROUND_URL) ? liveInfo2.getBackgroundURL() : liveInfo.getBackgroundURL();
        return LiveInfo.copy$default(liveInfo, null, liveName, notice, list.contains(TUILiveListManager.LiveModifyFlag.DISABLE_MESSAGE) ? liveInfo2.isMessageDisable() : liveInfo.isMessageDisable(), list.contains(TUILiveListManager.LiveModifyFlag.PUBLISH) ? liveInfo2.isPublicVisible() : liveInfo.isPublicVisible(), false, false, 0, list.contains(TUILiveListManager.LiveModifyFlag.TAKE_SEAT_MODE) ? liveInfo2.getSeatMode() : liveInfo.getSeatMode(), list.contains(TUILiveListManager.LiveModifyFlag.SEAT_LAYOUT_TEMPLATE_ID) ? liveInfo2.getSeatLayoutTemplateID() : liveInfo.getSeatLayoutTemplateID(), coverURL, backgroundURL, list.contains(TUILiveListManager.LiveModifyFlag.CATEGORY) ? liveInfo2.getCategoryList() : liveInfo.getCategoryList(), list.contains(TUILiveListManager.LiveModifyFlag.ACTIVITY_STATUS) ? liveInfo2.getActivityStatus() : liveInfo.getActivityStatus(), null, 0L, 0, false, null, 508129, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m88308a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framework", 1);
            jSONObject.put(Constants.COMPONENT, f88199k);
            jSONObject.put("language", 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework);
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            C39510r c39510r = this.f88203d;
            String message = "reportComponent: " + jSONObject2;
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(2, message);
            TUIRoomEngine.sharedInstance().callExperimentalAPI(jSONObject2.toString(), null);
        } catch (JSONException e11) {
            C39510r c39510r2 = this.f88203d;
            String message2 = "reportComponent: exception -> " + e11.getMessage();
            c39510r2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
        }
    }
}

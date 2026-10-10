package com.trtc.uikit.livekit.features.audiencecontainer.store;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.TypedValue;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import com.trtc.uikit.livekit.features.audiencecontainer.store.MediaStore;
import ee0.MediaState;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 52\u00020\u0001:\u000245B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u001cJ\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020\u001cJ\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\bJ\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0002J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\nJ\u000e\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0003J\u0018\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00066"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;", "", "liveID", "", "<init>", "(Ljava/lang/String;)V", "_isPictureInPictureMode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_playbackQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "_playbackQualityList", "", "_bigMuteBitmap", "Landroid/graphics/Bitmap;", "_smallMuteBitmap", "roomEngine", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;", "kotlin.jvm.PlatformType", "roomEngineObserver", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$RoomEngineObserver;", "coGuestState", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "mediaState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", "getMediaState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "createVideoMuteBitmap", "context", "Landroid/content/Context;", "bigResId", "", "smallResId", "releaseVideoMuteBitmap", "createMuteBitmap", "resId", "setCustomVideoProcess", "enablePictureInPictureMode", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onUserVideoSizeChanged", "width", "height", "enableSwitchPlaybackQuality", "getMultiPlaybackQuality", "roomId", "switchPlaybackQuality", C33757kf.f70665k, "parseQualityJsonString", "jsonString", "getVideoQuality", "RoomEngineObserver", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MediaStore {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f78574j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final LiveKitLogger f78575k = LiveKitLogger.f77564c.getLiveStreamLogger("MediaManager");

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<Boolean> f78576a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<VideoQuality> f78577b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<List<VideoQuality>> f78578c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41669n<Bitmap> f78579d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<Bitmap> f78580e;

    /* JADX INFO: renamed from: f */
    public final TUIRoomEngine f78581f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C36203a f78582g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final CoGuestState f78583h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MediaState f78584i;

    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.MediaStore$a */
    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$RoomEngineObserver;", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;)V", "onUserVideoSizeChanged", "", "roomId", "", "userId", "streamType", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;", "width", "", "height", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C36203a extends TUIRoomObserver {
        public C36203a() {
        }

        @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
        public void onUserVideoSizeChanged(@NotNull String roomId, @NotNull String userId, @NotNull TUIRoomDefine.VideoStreamType streamType, int width, int height) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(streamType, "streamType");
            MediaStore.this.m80779k(width, height);
        }
    }

    /* JADX INFO: renamed from: j */
    public final VideoQuality m80778j(int i11, int i12) {
        int i13 = i11 * i12;
        if (i13 <= 230400) {
            return VideoQuality.QUALITY_360P;
        }
        if (i13 <= 518400) {
            return VideoQuality.QUALITY_540P;
        }
        return i13 <= 921600 ? VideoQuality.QUALITY_720P : VideoQuality.QUALITY_1080P;
    }

    public MediaStore(@NotNull String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        InterfaceC41669n<Boolean> interfaceC41669nM91009a = C41679x.m91009a(Boolean.FALSE);
        this.f78576a = interfaceC41669nM91009a;
        InterfaceC41669n<VideoQuality> interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f78577b = interfaceC41669nM91009a2;
        InterfaceC41669n<List<VideoQuality>> interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f78578c = interfaceC41669nM91009a3;
        InterfaceC41669n<Bitmap> interfaceC41669nM91009a4 = C41679x.m91009a(null);
        this.f78579d = interfaceC41669nM91009a4;
        InterfaceC41669n<Bitmap> interfaceC41669nM91009a5 = C41679x.m91009a(null);
        this.f78580e = interfaceC41669nM91009a5;
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        this.f78581f = tUIRoomEngineSharedInstance;
        C36203a c36203a = new C36203a();
        this.f78582g = c36203a;
        this.f78583h = CoGuestStore.INSTANCE.create(liveID).getCoGuestState();
        this.f78584i = new MediaState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4, interfaceC41669nM91009a5);
        tUIRoomEngineSharedInstance.addObserver(c36203a);
        m80775f(true);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m80772c(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getResources().openRawResource(i11, typedValue);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = typedValue.density;
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i11, options);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        return bitmapDecodeResource;
    }

    /* JADX INFO: renamed from: d */
    public final void m80773d(@NotNull Context context, int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f78579d.getValue() == null) {
            this.f78579d.setValue(m80772c(context, i11));
        }
        if (this.f78580e.getValue() == null) {
            this.f78580e.setValue(m80772c(context, i12));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m80774e(boolean z11) {
        f78575k.m79404b("enablePictureInPictureMode enable:" + z11);
        this.f78576a.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: f */
    public final void m80775f(boolean z11) {
        HashMap map = new HashMap();
        map.put(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, Boolean.valueOf(z11));
        TUICore.callService("AdvanceSettingManager", "enableSwitchPlaybackQuality", map);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final MediaState getF78584i() {
        return this.f78584i;
    }

    /* JADX INFO: renamed from: h */
    public final void m80777h(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        TUIRoomEngine.sharedInstance().callExperimentalAPI("{\"api\":\"queryPlaybackQualityList\", \"params\":{\"roomId\": \"" + roomId + "\"}}", new TUIRoomDefine.ExperimentalAPIResponseCallback() { // from class: ee0.i
            @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ExperimentalAPIResponseCallback
            public final void onResponse(String str) {
                MediaStore.m80771i(this.f82441a, str);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m80780l(@NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            JSONArray jSONArray = new JSONObject(jsonString).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = jSONArray.getInt(i11);
                VideoQuality videoQuality = VideoQuality.QUALITY_1080P;
                if (i12 == videoQuality.getValue()) {
                    arrayList.add(videoQuality);
                }
                VideoQuality videoQuality2 = VideoQuality.QUALITY_720P;
                if (i12 == videoQuality2.getValue()) {
                    arrayList.add(videoQuality2);
                }
                VideoQuality videoQuality3 = VideoQuality.QUALITY_540P;
                if (i12 == videoQuality3.getValue()) {
                    arrayList.add(videoQuality3);
                }
                VideoQuality videoQuality4 = VideoQuality.QUALITY_360P;
                if (i12 == videoQuality4.getValue()) {
                    arrayList.add(videoQuality4);
                }
            }
            this.f78578c.setValue(arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f78577b.setValue((VideoQuality) arrayList.get(0));
        } catch (JSONException e11) {
            f78575k.m79403a("Failed to decode JSON: " + jsonString + ',' + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80781m() {
        Bitmap value;
        Bitmap value2;
        if (this.f78579d.getValue() != null && (value = this.f78579d.getValue()) != null && !value.isRecycled() && (value2 = this.f78579d.getValue()) != null) {
            value2.recycle();
        }
        if (this.f78580e.getValue() != null) {
            Bitmap value3 = this.f78580e.getValue();
            Intrinsics.checkNotNull(value3);
            if (!value3.isRecycled()) {
                Bitmap value4 = this.f78580e.getValue();
                Intrinsics.checkNotNull(value4);
                value4.recycle();
            }
        }
        this.f78579d.setValue(null);
        this.f78580e.setValue(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m80782n() {
        TEBeautyManager.f77696a.m79595s();
    }

    /* JADX INFO: renamed from: o */
    public final void m80783o(@NotNull VideoQuality quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C33757kf.f70665k, quality.getValue());
            jSONObject.put("autoSwitch", false);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "switchPlaybackQuality");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            TUIRoomEngine.sharedInstance().callExperimentalAPI(jSONObject2.toString(), null);
        } catch (JSONException e11) {
            f78575k.m79403a("Failed to build JSON for switchPlaybackQuality: " + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m80771i(MediaStore mediaStore, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intrinsics.checkNotNull(str);
        mediaStore.m80780l(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m80779k(int i11, int i12) {
        VideoQuality videoQualityM80778j = m80778j(i11, i12);
        if (videoQualityM80778j != this.f78577b.getValue() && this.f78578c.getValue().size() > 1 && this.f78578c.getValue().contains(videoQualityM80778j) && this.f78583h.getConnected().getValue().size() <= 1 && this.f78583h.getApplicants().getValue().isEmpty() && this.f78583h.getInvitees().getValue().isEmpty()) {
            this.f78577b.setValue(videoQualityM80778j);
        }
    }
}

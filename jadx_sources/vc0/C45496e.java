package vc0;

import android.util.Log;
import com.google.gson.Gson;
import com.kubi.p110rn.Constants;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vc0.e */
/* JADX INFO: compiled from: DataReporter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"LIVEKIT_METRICS_PANEL_SHOW_SEAT_GRID_VIEW", "", "LIVEKIT_METRICS_PANEL_HIDE_SEAT_GRID_VIEW", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_START_MICROPHONE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_STOP_MICROPHONE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_MUTE_MICROPHONE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_UNMUTE_MICROPHONE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_START_ROOM", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_STOP_ROOM", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_JOIN_ROOM", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_LEAVE_ROOM", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_UPDATE_SEAT_MODE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_RESPONSE_REQUEST", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_CANCEL_REQUEST", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_TAKE_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_MOVE_TO_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_LEAVE_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_TAKE_USER_ON_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_KICK_USER_OFF_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_LOCK_SEAT", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_SET_LAYOUT_MODE", "LIVEKIT_METRICS_METHOD_CALL_SEAT_GRID_VIEW_SET_SEAT_VIEW_ADAPTER", "COMPONENT_VOICE_ROOM", "COMPONENT_LIVE_STREAM", "reportEventData", "", "eventKey", "setComponent", Constants.COMPONENT, "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45496e {
    /* JADX INFO: renamed from: a */
    public static final void m100464a(int i11) {
        String json = new Gson().toJson(MapsKt.mapOf(TuplesKt.m90091to("api", "KeyMetricsStats"), TuplesKt.m90091to(ReportDataTable.COLUMN_PARAMS, MapsKt.mapOf(TuplesKt.m90091to("key", Integer.valueOf(i11))))));
        TUIRoomEngine.sharedInstance().callExperimentalAPI(json, null);
        Log.i("DataReporter", "reportEventData:[json:" + json + ']');
    }

    /* JADX INFO: renamed from: b */
    public static final void m100465b(int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", Constants.COMPONENT);
            jSONObject.put(Constants.COMPONENT, i11);
            LiveCoreViewDeprecated.Companion companion = LiveCoreViewDeprecated.INSTANCE;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            companion.callExperimentalAPI(string);
        } catch (JSONException e11) {
            Log.e("DataReporter", "dataReport:" + e11.getMessage());
        }
    }
}

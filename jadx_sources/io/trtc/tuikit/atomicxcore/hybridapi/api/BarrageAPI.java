package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appendLocalTip", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "sendCustomMessage", "sendTextMessage", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBarrageAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarrageAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,95:1\n215#2,2:96\n45#3,5:98\n45#3,5:103\n*S KotlinDebug\n*F\n+ 1 BarrageAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI\n*L\n23#1:96,2\n31#1:98,5\n86#1:103,5\n*E\n"})
public final class BarrageAPI {

    @NotNull
    private final Context context;

    public BarrageAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    public final void appendLocalTip(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Barrage barrage;
        Object objFromJson;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("message") : null;
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (map != null) {
            String json = JsonParserKt.getSharedGson().toJson(map);
            Intrinsics.checkNotNull(json);
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson(json, (Class<Object>) Barrage.class);
            } catch (Exception unused) {
                objFromJson = null;
            }
            barrage = (Barrage) objFromJson;
            if (barrage == null) {
                barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            }
        } else {
            barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        BarrageStore.INSTANCE.create(str).appendLocalTip(barrage);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void sendCustomMessage(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("businessID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        Object obj3 = mapM88231a != null ? mapM88231a.get("data") : null;
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        BarrageStore.INSTANCE.create(str).sendCustomMessage(str2, str3 != null ? str3 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BarrageAPI$sendCustomMessage$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendTextMessage(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Map linkedHashMap = null;
        Object objFromJson = null;
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("text") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 != null ? str2 : "";
        Object obj3 = mapM88231a != null ? mapM88231a.get("extensionInfo") : null;
        if (obj3 instanceof Map) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj3).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    linkedHashMap.put(key, value);
                }
            }
        } else if (obj3 instanceof String) {
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson((String) obj3, (Class<Object>) Map.class);
            } catch (Exception unused) {
            }
            linkedHashMap = (Map) objFromJson;
        }
        BarrageStore.INSTANCE.create(str).sendTextMessage(str3, linkedHashMap, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BarrageAPI$sendTextMessage$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
            }
        });
    }
}

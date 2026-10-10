package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.MetaDataCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createLive", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "endLive", "fetchLiveList", "joinLive", "leaveLive", "queryMetaData", "reset", "updateLiveInfo", "updateLiveMetaData", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveListAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,249:1\n45#2,5:250\n45#2,5:255\n45#2,5:286\n45#2,5:293\n1603#3,9:260\n1855#3:269\n1856#3:271\n1612#3:272\n1603#3,9:273\n1855#3:282\n1856#3:284\n1612#3:285\n1#4:270\n1#4:283\n215#5,2:291\n*S KotlinDebug\n*F\n+ 1 LiveListAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI\n*L\n47#1:250,5\n127#1:255,5\n187#1:286,5\n223#1:293,5\n133#1:260,9\n133#1:269\n133#1:271\n133#1:272\n179#1:273,9\n179#1:282\n179#1:284\n179#1:285\n133#1:270\n179#1:283\n215#1:291,2\n*E\n"})
public final class LiveListAPI {

    @NotNull
    private final Context context;

    public LiveListAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public final void createLive(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        LiveInfo liveInfo;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object objFromJson = null;
        Object obj = mapM88231a != null ? mapM88231a.get("liveInfo") : null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            String json = JsonParserKt.getSharedGson().toJson(map);
            Intrinsics.checkNotNull(json);
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson(json, (Class<Object>) LiveInfo.class);
            } catch (Exception unused) {
            }
            liveInfo = (LiveInfo) objFromJson;
            if (liveInfo == null) {
                liveInfo = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
            }
        } else {
            liveInfo = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
        }
        LiveListStore.INSTANCE.shared().createLive(liveInfo, new LiveInfoCompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$createLive$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
            public void onSuccess(@NotNull LiveInfo liveInfo2) {
                Intrinsics.checkNotNullParameter(liveInfo2, "liveInfo");
                Function1<String, Unit> function1 = callback;
                HybridResponse.Companion companion = HybridResponse.INSTANCE;
                String api = request.getApi();
                String json2 = JsonParserKt.getSharedGson().toJson(liveInfo2);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                function1.invoke(companion.success(api, json2));
            }
        });
    }

    public final void endLive(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        LiveListStore.INSTANCE.shared().endLive(new StopLiveCompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$endLive$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
            public void onSuccess(@NotNull TUILiveListManager.LiveStatisticsData statisticsData) {
                Intrinsics.checkNotNullParameter(statisticsData, "statisticsData");
                callback.invoke(HybridResponse.INSTANCE.success(request.getApi(), JsonParserKt.getSharedGson().toJson(statisticsData)));
            }
        });
    }

    public final void fetchLiveList(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        Object obj = mapM88231a != null ? mapM88231a.get(InterfaceC33953u5.f72198E) : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("count") : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        LiveListStore.INSTANCE.shared().fetchLiveList(str, number != null ? number.intValue() : 20, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$fetchLiveList$completionHandler$1
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

    public final void joinLive(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        LiveListStore.INSTANCE.shared().joinLive(str, new LiveInfoCompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$joinLive$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
            public void onSuccess(@NotNull LiveInfo liveInfo) {
                Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
                Function1<String, Unit> function1 = callback;
                HybridResponse.Companion companion = HybridResponse.INSTANCE;
                String api = request.getApi();
                String json = JsonParserKt.getSharedGson().toJson(liveInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                function1.invoke(companion.success(api, json));
            }
        });
    }

    public final void leaveLive(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        LiveListStore.INSTANCE.shared().leaveLive(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$leaveLive$completionHandler$1
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

    public final void queryMetaData(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        List<String> listEmptyList;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object objFromJson = null;
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        Object obj = mapM88231a != null ? mapM88231a.get("keys") : null;
        if (obj instanceof List) {
            listEmptyList = new ArrayList<>();
            for (Object obj2 : (Iterable) obj) {
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    listEmptyList.add(str);
                }
            }
        } else if (obj instanceof String) {
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson((String) obj, (Class<Object>) List.class);
            } catch (Exception unused) {
            }
            listEmptyList = (List) objFromJson;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        LiveListStore.INSTANCE.shared().queryMetaData(listEmptyList, new MetaDataCompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$queryMetaData$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.live.MetaDataCompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.MetaDataCompletionHandler
            public void onSuccess(@NotNull HashMap<String, String> metaData) {
                Intrinsics.checkNotNullParameter(metaData, "metaData");
                Function1<String, Unit> function1 = callback;
                HybridResponse.Companion companion = HybridResponse.INSTANCE;
                String api = request.getApi();
                String json = JsonParserKt.getSharedGson().toJson(metaData);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                function1.invoke(companion.success(api, json));
            }
        });
    }

    public final void reset(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LiveListStore.INSTANCE.shared().reset();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public final void updateLiveInfo(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        LiveInfo liveInfo;
        List<? extends LiveInfo.ModifyFlag> listEmptyList;
        LiveInfo.ModifyFlag modifyFlagValueOf;
        Object objFromJson;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        Object obj = mapM88231a != null ? mapM88231a.get("liveInfo") : null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            String json = JsonParserKt.getSharedGson().toJson(map);
            Intrinsics.checkNotNull(json);
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson(json, (Class<Object>) LiveInfo.class);
            } catch (Exception unused) {
                objFromJson = null;
            }
            liveInfo = (LiveInfo) objFromJson;
            if (liveInfo == null) {
                liveInfo = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
            }
        } else {
            liveInfo = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("modifyFlagList") : null;
        if (obj2 instanceof List) {
            listEmptyList = new ArrayList<>();
            for (Object obj3 : (Iterable) obj2) {
                if (obj3 instanceof String) {
                    try {
                        modifyFlagValueOf = LiveInfo.ModifyFlag.valueOf((String) obj3);
                    } catch (IllegalArgumentException | Exception unused2) {
                    }
                } else {
                    modifyFlagValueOf = obj3 instanceof Number ? (LiveInfo.ModifyFlag) ArraysKt.getOrNull(LiveInfo.ModifyFlag.values(), ((Number) obj3).intValue()) : null;
                }
                if (modifyFlagValueOf != null) {
                    listEmptyList.add(modifyFlagValueOf);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        LiveListStore.INSTANCE.shared().updateLiveInfo(liveInfo, listEmptyList, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$updateLiveInfo$completionHandler$1
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
    public final void updateLiveMetaData(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        HashMap map;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object objFromJson = null;
        boolean z11 = (mapM88231a != null ? mapM88231a.get("liveID") : null) instanceof String;
        Object obj = mapM88231a != null ? mapM88231a.get("metaData") : null;
        if (obj instanceof Map) {
            map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    map.put(key, value);
                }
            }
        } else if (obj instanceof String) {
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson((String) obj, (Class<Object>) HashMap.class);
            } catch (Exception unused) {
            }
            map = (HashMap) objFromJson;
            if (map == null) {
                map = new HashMap();
            }
        } else {
            map = new HashMap();
        }
        LiveListStore.INSTANCE.shared().updateLiveMetaData(map, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI$updateLiveMetaData$completionHandler$1
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

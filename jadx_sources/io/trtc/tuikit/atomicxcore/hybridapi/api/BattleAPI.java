package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "acceptBattle", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "cancelBattleRequest", "exitBattle", "rejectBattle", "requestBattle", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBattleAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n45#2,5:157\n45#2,5:175\n45#2,5:193\n1603#3,9:162\n1855#3:171\n1856#3:173\n1612#3:174\n1603#3,9:180\n1855#3:189\n1856#3:191\n1612#3:192\n1#4:172\n1#4:190\n*S KotlinDebug\n*F\n+ 1 BattleAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI\n*L\n22#1:157,5\n28#1:175,5\n67#1:193,5\n27#1:162,9\n27#1:171\n27#1:173\n27#1:174\n66#1:180,9\n66#1:189\n66#1:191\n66#1:192\n27#1:172\n66#1:190\n*E\n"})
public final class BattleAPI {

    @NotNull
    private final Context context;

    public BattleAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void acceptBattle(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("battleID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        BattleStore.Companion companion = BattleStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).acceptBattle(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI$acceptBattle$completionHandler$1
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

    public final void cancelBattleRequest(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        List<String> listEmptyList;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object objFromJson = null;
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("battleID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = mapM88231a != null ? mapM88231a.get("userIDList") : null;
        if (obj3 instanceof List) {
            listEmptyList = new ArrayList<>();
            for (Object obj4 : (Iterable) obj3) {
                String str3 = obj4 instanceof String ? (String) obj4 : null;
                if (str3 != null) {
                    listEmptyList.add(str3);
                }
            }
        } else if (obj3 instanceof String) {
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson((String) obj3, (Class<Object>) List.class);
            } catch (Exception unused) {
            }
            listEmptyList = (List) objFromJson;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        BattleStore.Companion companion = BattleStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).cancelBattleRequest(str2, listEmptyList, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI$cancelBattleRequest$completionHandler$1
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

    public final void exitBattle(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("battleID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        BattleStore.Companion companion = BattleStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).exitBattle(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI$exitBattle$completionHandler$1
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

    public final void rejectBattle(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("battleID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        BattleStore.Companion companion = BattleStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).rejectBattle(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI$rejectBattle$completionHandler$1
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

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final void requestBattle(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        BattleConfig battleConfig;
        List<String> listEmptyList;
        Object objFromJson;
        Object objFromJson2;
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("config") : null;
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (map != null) {
            String json = JsonParserKt.getSharedGson().toJson(map);
            Intrinsics.checkNotNull(json);
            try {
                objFromJson2 = JsonParserKt.getSharedGson().fromJson(json, (Class<Object>) BattleConfig.class);
            } catch (Exception unused) {
                objFromJson2 = null;
            }
            battleConfig = (BattleConfig) objFromJson2;
            if (battleConfig == null) {
                battleConfig = new BattleConfig(0, false, null, 7, null);
            }
        } else {
            battleConfig = new BattleConfig(0, false, null, 7, null);
        }
        Object obj3 = mapM88231a != null ? mapM88231a.get("userIDList") : null;
        if (obj3 instanceof List) {
            listEmptyList = new ArrayList<>();
            for (Object obj4 : (Iterable) obj3) {
                String str2 = obj4 instanceof String ? (String) obj4 : null;
                if (str2 != null) {
                    listEmptyList.add(str2);
                }
            }
        } else if (obj3 instanceof String) {
            try {
                objFromJson = JsonParserKt.getSharedGson().fromJson((String) obj3, (Class<Object>) List.class);
            } catch (Exception unused2) {
                objFromJson = null;
            }
            listEmptyList = (List) objFromJson;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Object obj5 = mapM88231a != null ? mapM88231a.get("timeout") : null;
        Number number = obj5 instanceof Number ? (Number) obj5 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        BattleStore.Companion companion = BattleStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).requestBattle(battleConfig, listEmptyList, iIntValue, new BattleRequestCallback() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI$requestBattle$battleRequestCallback$1
            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
            public void onError(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
            public void onSuccess(@NotNull BattleInfo battleInfo, @NotNull Map<String, Integer> resultMap) {
                Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
                Intrinsics.checkNotNullParameter(resultMap, "resultMap");
                Function1<String, Unit> function1 = callback;
                HybridResponse.Companion companion2 = HybridResponse.INSTANCE;
                String api = request.getApi();
                String json2 = JsonParserKt.getSharedGson().toJson(battleInfo);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                function1.invoke(companion2.success(api, MapsKt.mapOf(TuplesKt.m90091to("battleInfo", json2), TuplesKt.m90091to("resultMap", resultMap))));
            }
        });
    }
}

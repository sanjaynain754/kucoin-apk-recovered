package io.trtc.tuikit.atomicxcore.hybridapi.bridge;

import android.content.Context;
import android.util.Log;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridBridge;", "", "appContext", "Landroid/content/Context;", "eventEmitter", "Lkotlin/Function2;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "apiManager", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/APIManager;", "eventManager", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;", "addListener", "key", "callAPI", JPushConstants.Analysis.KEY_JSON, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "removeListener", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHybridBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridBridge.kt\nio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridBridge\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,37:1\n45#2,5:38\n45#2,5:43\n*S KotlinDebug\n*F\n+ 1 HybridBridge.kt\nio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridBridge\n*L\n21#1:38,5\n29#1:43,5\n*E\n"})
public final class HybridBridge {

    @NotNull
    private final APIManager apiManager;

    @NotNull
    private final Context appContext;

    @NotNull
    private final EventManager eventManager;

    public HybridBridge(@NotNull Context appContext, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.appContext = appContext;
        this.eventManager = new EventManager(eventEmitter);
        this.apiManager = new APIManager(appContext);
    }

    public final void addListener(@NotNull String key) {
        Object objFromJson;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            objFromJson = JsonParserKt.getSharedGson().fromJson(key, (Class<Object>) HybridListenerKey.class);
        } catch (Exception unused) {
            objFromJson = null;
        }
        HybridListenerKey hybridListenerKey = (HybridListenerKey) objFromJson;
        if (hybridListenerKey == null) {
            return;
        }
        Log.d("HybridBridge-kt", "addListener for key: type=" + hybridListenerKey.getType() + ", store=" + hybridListenerKey.getStore() + ", name=" + hybridListenerKey.getName() + ", roomID=" + hybridListenerKey.getRoomID());
        this.eventManager.addListener(hybridListenerKey);
    }

    public final void callAPI(@NotNull String json, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.apiManager.callAPI(json, callback);
    }

    public final void removeListener(@NotNull String key) {
        Object objFromJson;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            objFromJson = JsonParserKt.getSharedGson().fromJson(key, (Class<Object>) HybridListenerKey.class);
        } catch (Exception unused) {
            objFromJson = null;
        }
        HybridListenerKey hybridListenerKey = (HybridListenerKey) objFromJson;
        if (hybridListenerKey == null) {
            return;
        }
        Log.d("HybridBridge-kt", "removeListener for key: type=" + hybridListenerKey.getType() + ", store=" + hybridListenerKey.getStore() + ", name=" + hybridListenerKey.getName() + ", roomID=" + hybridListenerKey.getRoomID());
        this.eventManager.removeListener(hybridListenerKey);
    }
}

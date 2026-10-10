package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveAudienceAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "disableSendMessage", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "fetchAudienceList", "kickUserOutOfRoom", "revokeAdministrator", "setAdministrator", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LiveAudienceAPI {

    @NotNull
    private final Context context;

    public LiveAudienceAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void disableSendMessage(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 != null ? str2 : "";
        Object obj3 = mapM88231a != null ? mapM88231a.get("isDisable") : null;
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        LiveAudienceStore.INSTANCE.create(str).disableSendMessage(str3, bool != null ? bool.booleanValue() : false, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI$disableSendMessage$completionHandler$1
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

    public final void fetchAudienceList(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        LiveAudienceStore.INSTANCE.create(str).fetchAudienceList(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI$fetchAudienceList$completionHandler$1
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

    public final void kickUserOutOfRoom(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveAudienceStore.INSTANCE.create(str).kickUserOutOfRoom(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI$kickUserOutOfRoom$completionHandler$1
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

    public final void revokeAdministrator(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveAudienceStore.INSTANCE.create(str).revokeAdministrator(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI$revokeAdministrator$completionHandler$1
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

    public final void setAdministrator(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveAudienceStore.INSTANCE.create(str).setAdministrator(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI$setAdministrator$completionHandler$1
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

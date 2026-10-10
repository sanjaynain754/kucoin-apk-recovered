package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.MoveSeatPolicy;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "closeRemoteCamera", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "closeRemoteMicrophone", "kickUserOutOfSeat", "leaveSeat", "lockSeat", "moveUserToSeat", "muteMicrophone", "openRemoteCamera", "openRemoteMicrophone", "takeSeat", "unlockSeat", "unmuteMicrophone", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LiveSeatAPI {

    @NotNull
    private final Context context;

    public LiveSeatAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void closeRemoteCamera(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).closeRemoteCamera(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$closeRemoteCamera$completionHandler$1
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

    public final void closeRemoteMicrophone(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).closeRemoteMicrophone(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$closeRemoteMicrophone$completionHandler$1
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

    public final void kickUserOutOfSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).kickUserOutOfSeat(str2 != null ? str2 : "", new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$kickUserOutOfSeat$completionHandler$1
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

    public final void leaveSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).leaveSeat(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$leaveSeat$completionHandler$1
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

    public final void lockSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("seatIndex") : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).lockSeat(number != null ? number.intValue() : 0, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$lockSeat$completionHandler$1
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

    public final void moveUserToSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 != null ? str2 : "";
        Object obj3 = mapM88231a != null ? mapM88231a.get("targetIndex") : null;
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        MoveSeatPolicy.Companion companion = MoveSeatPolicy.INSTANCE;
        Object obj4 = mapM88231a != null ? mapM88231a.get("policy") : null;
        Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
        LiveSeatStore.INSTANCE.create(str).moveUserToSeat(str3, iIntValue, companion.parse(number2 != null ? number2.intValue() : 0), new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$moveUserToSeat$completionHandler$1
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

    public final void muteMicrophone(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).muteMicrophone();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void openRemoteCamera(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 != null ? str2 : "";
        DeviceControlPolicy.Companion companion = DeviceControlPolicy.INSTANCE;
        Object obj3 = mapM88231a != null ? mapM88231a.get("policy") : null;
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        LiveSeatStore.INSTANCE.create(str).openRemoteCamera(str3, companion.parse(number != null ? number.intValue() : 1), new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$openRemoteCamera$completionHandler$1
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

    public final void openRemoteMicrophone(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 != null ? str2 : "";
        DeviceControlPolicy.Companion companion = DeviceControlPolicy.INSTANCE;
        Object obj3 = mapM88231a != null ? mapM88231a.get("policy") : null;
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        LiveSeatStore.INSTANCE.create(str).openRemoteMicrophone(str3, companion.parse(number != null ? number.intValue() : 1), new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$openRemoteMicrophone$completionHandler$1
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

    public final void takeSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("seatIndex") : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).takeSeat(number != null ? number.intValue() : 0, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$takeSeat$completionHandler$1
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

    public final void unlockSeat(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = mapM88231a != null ? mapM88231a.get("seatIndex") : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        LiveSeatStore.INSTANCE.create(str).unlockSeat(number != null ? number.intValue() : 0, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$unlockSeat$completionHandler$1
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

    public final void unmuteMicrophone(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).unmuteMicrophone(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI$unmuteMicrophone$completionHandler$1
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

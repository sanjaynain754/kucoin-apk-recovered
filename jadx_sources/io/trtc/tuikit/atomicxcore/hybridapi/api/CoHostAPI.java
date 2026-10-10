package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoHostLayoutTemplate;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoHostAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "acceptHostConnection", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "cancelHostConnection", "exitHostConnection", "rejectHostConnection", "requestHostConnection", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class CoHostAPI {

    @NotNull
    private final Context context;

    public CoHostAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void acceptHostConnection(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("fromHostLiveID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).acceptHostConnection(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI$acceptHostConnection$completionHandler$1
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

    public final void cancelHostConnection(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("toHostLiveID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).cancelHostConnection(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI$cancelHostConnection$completionHandler$1
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

    public final void exitHostConnection(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).exitHostConnection(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI$exitHostConnection$completionHandler$1
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

    public final void rejectHostConnection(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("fromHostLiveID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion.create(str).rejectHostConnection(str2, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI$rejectHostConnection$completionHandler$1
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

    public final void requestHostConnection(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("liveID") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapM88231a != null ? mapM88231a.get("targetHostLiveID") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String str3 = str2 == null ? "" : str2;
        CoHostLayoutTemplate.Companion companion = CoHostLayoutTemplate.INSTANCE;
        Object obj3 = mapM88231a != null ? mapM88231a.get("layoutTemplate") : null;
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        CoHostLayoutTemplate coHostLayoutTemplate = companion.parse(number != null ? number.intValue() : 1);
        Object obj4 = mapM88231a != null ? mapM88231a.get("timeout") : null;
        Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
        int iIntValue = number2 != null ? number2.intValue() : 0;
        Object obj5 = mapM88231a != null ? mapM88231a.get("extraInfo") : null;
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        CoHostStore.Companion companion2 = CoHostStore.INSTANCE;
        if (str == null) {
            str = "";
        }
        companion2.create(str).requestHostConnection(str3, coHostLayoutTemplate, iIntValue, str4, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI$requestHostConnection$completionHandler$1
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

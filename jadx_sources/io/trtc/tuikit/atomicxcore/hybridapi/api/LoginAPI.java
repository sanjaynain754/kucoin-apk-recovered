package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/LoginAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", FirebaseAnalytics.Event.LOGIN, "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "logout", "setSelfInfo", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LoginAPI {

    @NotNull
    private final Context context;

    public LoginAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void login(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("userID") : null;
        String str = obj instanceof String ? (String) obj : null;
        final String str2 = str == null ? "" : str;
        Object obj2 = mapM88231a != null ? mapM88231a.get("sdkAppID") : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        final int iIntValue = number != null ? number.intValue() : 0;
        Object obj3 = mapM88231a != null ? mapM88231a.get(TUIConstants.TUILive.USER_SIG) : null;
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        final String str4 = str3 == null ? "" : str3;
        LoginStore.shared.login(this.context, iIntValue, str2, str4, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI$login$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                Context context = this.this$0.context;
                int i11 = iIntValue;
                String str5 = str2;
                String str6 = str4;
                final Function1<String, Unit> function1 = callback;
                final HybridRequest hybridRequest = request;
                TUIRoomEngine.login(context, i11, str5, str6, new TUIRoomDefine.ActionCallback() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI$login$completionHandler$1$onSuccess$1
                    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
                    public void onError(@Nullable TUICommonDefine.Error error, @Nullable String message) {
                        int value = error != null ? error.getValue() : -1;
                        Function1<String, Unit> function2 = function1;
                        HybridResponse.Companion companion = HybridResponse.INSTANCE;
                        String api = hybridRequest.getApi();
                        if (message == null) {
                            message = "";
                        }
                        function2.invoke(HybridResponse.Companion.failure$default(companion, api, value, message, null, 8, null));
                    }

                    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
                    public void onSuccess() {
                        function1.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, hybridRequest.getApi(), null, 2, null));
                    }
                });
            }
        });
    }

    public final void logout(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoginStore.shared.logout(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI$logout$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                final Function1<String, Unit> function1 = callback;
                final HybridRequest hybridRequest = request;
                TUIRoomEngine.logout(new TUIRoomDefine.ActionCallback() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI$logout$completionHandler$1$onSuccess$1
                    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
                    public void onError(@Nullable TUICommonDefine.Error error, @Nullable String message) {
                        int value = error != null ? error.getValue() : -1;
                        Function1<String, Unit> function2 = function1;
                        HybridResponse.Companion companion = HybridResponse.INSTANCE;
                        String api = hybridRequest.getApi();
                        if (message == null) {
                            message = "";
                        }
                        function2.invoke(HybridResponse.Companion.failure$default(companion, api, value, message, null, 8, null));
                    }

                    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
                    public void onSuccess() {
                        function1.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, hybridRequest.getApi(), null, 2, null));
                    }
                });
            }
        });
    }

    public final void setSelfInfo(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("userProfile") : null;
        UserProfile userProfile = (UserProfile) JsonParserKt.getSharedGson().fromJson(JsonParserKt.getSharedGson().toJson(obj instanceof Map ? (Map) obj : null), UserProfile.class);
        CompletionHandler completionHandler = new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI$setSelfInfo$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
            }
        };
        LoginStore loginStore = LoginStore.shared;
        Intrinsics.checkNotNull(userProfile);
        loginStore.setSelfInfo(userProfile, completionHandler);
    }
}

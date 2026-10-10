package com.trtc.uikit.livekit.features.anchorprepare.store;

import android.content.Context;
import be0.C4579a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareViewListener;
import com.trtc.uikit.livekit.features.anchorprepare.PrepareState;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vc0.C45497f;

/* JADX INFO: compiled from: AnchorPrepareStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "", "<init>", "()V", "internalState", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareState;", "externalState", "Lcom/trtc/uikit/livekit/features/anchorprepare/PrepareState;", "listenerManager", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareListenerDispatch;", "getState", "setCoverURL", "", "coverURL", "", "setRoomName", "roomName", "setLiveMode", "value", "Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;", "setCoGuestTemplate", "template", "", "setCoHostTemplate", "startLive", "getDefaultRoomName", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getExternalState", "startPreview", TUIConstants.TUIChat.CALL_BACK, "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "stopPreview", "addAnchorPrepareViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;", "removeAnchorPrepareViewListener", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorPrepareStore {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f78480d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final LiveKitLogger f78481e = LiveKitLogger.f77564c.getFeaturesLogger("AnchorPrepareManager");

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AnchorPrepareState f78482a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PrepareState f78483b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AnchorPrepareListenerDispatch f78484c;

    /* JADX INFO: compiled from: AnchorPrepareStore.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "CAMERA_NOT_AUTHORIZED", "", "disableFeatureMenu", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "disableMenuSwitchButton", "disableMenuBeautyButton", "disableMenuAudioEffectButton", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void disableFeatureMenu(boolean enable) {
            C4579a c4579a = C4579a.f4058a;
            if (c4579a.m4445a().getValue().booleanValue() == enable) {
                return;
            }
            c4579a.m4445a().setValue(Boolean.valueOf(enable));
        }

        public final void disableMenuAudioEffectButton(boolean enable) {
            C4579a c4579a = C4579a.f4058a;
            if (c4579a.m4446b().getValue().booleanValue() == enable) {
                return;
            }
            c4579a.m4446b().setValue(Boolean.valueOf(enable));
        }

        public final void disableMenuBeautyButton(boolean enable) {
            C4579a c4579a = C4579a.f4058a;
            if (c4579a.m4447c().getValue().booleanValue() == enable) {
                return;
            }
            c4579a.m4447c().setValue(Boolean.valueOf(enable));
        }

        public final void disableMenuSwitchButton(boolean enable) {
            C4579a c4579a = C4579a.f4058a;
            if (c4579a.m4448d().getValue().booleanValue() == enable) {
                return;
            }
            c4579a.m4448d().setValue(Boolean.valueOf(enable));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore$a */
    /* JADX INFO: compiled from: AnchorPrepareStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore$startPreview$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onRequesting", "", "onGranted", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36179a extends AbstractC35867d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CompletionHandler f78486b;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore$a$a */
        /* JADX INFO: compiled from: AnchorPrepareStore.kt */
        @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore$startPreview$1$onGranted$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements CompletionHandler {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CompletionHandler f78487a;

            /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AnchorPrepareStore.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore$startPreview$1$onGranted$1$onSuccess$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C47003a extends AbstractC35867d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CompletionHandler f78488a;

                /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: AnchorPrepareStore.kt */
                @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore$startPreview$1$onGranted$1$onSuccess$1$onGranted$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
                public static final class C47004a implements CompletionHandler {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ CompletionHandler f78489a;

                    public C47004a(CompletionHandler completionHandler) {
                        this.f78489a = completionHandler;
                    }

                    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
                    public void onFailure(int code, String desc) {
                        Intrinsics.checkNotNullParameter(desc, "desc");
                        AnchorPrepareStore.f78481e.m79403a("startMicrophone failed:code:" + code + ",desc:" + desc);
                        CompletionHandler completionHandler = this.f78489a;
                        if (completionHandler != null) {
                            completionHandler.onFailure(code, desc);
                        }
                    }

                    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
                    public void onSuccess() {
                        CompletionHandler completionHandler = this.f78489a;
                        if (completionHandler != null) {
                            completionHandler.onSuccess();
                        }
                    }
                }

                public C47003a(CompletionHandler completionHandler) {
                    this.f78488a = completionHandler;
                }

                @Override // com.trtc.tuikit.common.permission.AbstractC35867d
                /* JADX INFO: renamed from: a */
                public void mo79393a() {
                    AnchorPrepareStore.f78481e.m79403a("requestCameraPermissions:[onDenied]");
                    CompletionHandler completionHandler = this.f78488a;
                    if (completionHandler != null) {
                        completionHandler.onFailure(-1101, "requestCameraPermissions:[onDenied]");
                    }
                }

                @Override // com.trtc.tuikit.common.permission.AbstractC35867d
                /* JADX INFO: renamed from: b */
                public void mo79394b() {
                    AnchorPrepareStore.f78481e.m79404b("requestMicrophonePermissions success");
                    DeviceStore.INSTANCE.shared().openLocalMicrophone(new C47004a(this.f78488a));
                }
            }

            public a(CompletionHandler completionHandler) {
                this.f78487a = completionHandler;
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                AnchorPrepareStore.f78481e.m79403a("startCamera failed:code:" + code + ",desc:" + desc);
                CompletionHandler completionHandler = this.f78487a;
                if (completionHandler != null) {
                    completionHandler.onFailure(code, desc);
                }
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                AnchorPrepareStore.f78481e.m79404b("startCamera success, requestMicrophonePermissions");
                C45497f c45497f = C45497f.f102528a;
                Context contextM79397b = ContextProvider.m79397b();
                Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
                c45497f.m100467b(contextM79397b, new C47003a(this.f78487a));
            }
        }

        public C36179a(CompletionHandler completionHandler) {
            this.f78486b = completionHandler;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            AnchorPrepareStore.f78481e.m79403a("requestCameraPermissions:[onDenied]");
            CompletionHandler completionHandler = this.f78486b;
            if (completionHandler != null) {
                completionHandler.onFailure(-1101, "requestCameraPermissions:[onDenied]");
            }
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() throws Exception {
            AnchorPrepareStore.f78481e.m79404b("requestCameraPermissions:[onGranted]");
            DeviceStore deviceStoreShared = DeviceStore.INSTANCE.shared();
            boolean z11 = true;
            if (!AnchorPrepareStore.this.f78482a.m80627h().getValue().booleanValue()) {
                z11 = false;
            }
            deviceStoreShared.openLocalCamera(z11, new a(this.f78486b));
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: c */
        public void mo79395c() {
            AnchorPrepareStore.f78481e.m79404b("requestCameraPermissions:[onRequesting]");
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m80635l(AnchorPrepareViewListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.mo80619p();
    }

    /* JADX INFO: renamed from: o */
    public static final void m80636o(AnchorPrepareViewListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.mo80618n();
    }

    /* JADX INFO: renamed from: e */
    public final void m80637e(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78484c.m80646a(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PrepareState getF78483b() {
        return this.f78483b;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final AnchorPrepareState getF78482a() {
        return this.f78482a;
    }

    /* JADX INFO: renamed from: h */
    public final void m80640h(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78484c.m80648c(listener);
    }

    /* JADX INFO: renamed from: i */
    public final void m80641i(int i11) {
        this.f78482a.m80621b().setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: j */
    public final void m80642j(int i11) {
        this.f78482a.m80622c().setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: k */
    public final void m80643k() {
        this.f78484c.m80647b(new AnchorPrepareListenerDispatch.a() { // from class: be0.c
            @Override // com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareListenerDispatch.a
            /* JADX INFO: renamed from: a */
            public final void mo4449a(AnchorPrepareViewListener anchorPrepareViewListener) {
                AnchorPrepareStore.m80635l(anchorPrepareViewListener);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m80644m(@Nullable CompletionHandler completionHandler) {
        f78481e.m79404b("requestCameraPermissions:[]");
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100466a(contextM79397b, new C36179a(completionHandler));
    }

    /* JADX INFO: renamed from: n */
    public final void m80645n() {
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().closeLocalCamera();
        companion.shared().closeLocalMicrophone();
        this.f78484c.m80647b(new AnchorPrepareListenerDispatch.a() { // from class: be0.b
            @Override // com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareListenerDispatch.a
            /* JADX INFO: renamed from: a */
            public final void mo4449a(AnchorPrepareViewListener anchorPrepareViewListener) {
                AnchorPrepareStore.m80636o(anchorPrepareViewListener);
            }
        });
    }

    public AnchorPrepareStore() {
        String nickname;
        String userID;
        AnchorPrepareState anchorPrepareState = new AnchorPrepareState();
        LoginStore loginStore = LoginStore.shared;
        UserProfile value = loginStore.getLoginState().getLoginUserInfo().getValue();
        String str = "";
        anchorPrepareState.m80629j((value == null || (userID = value.getUserID()) == null) ? "" : userID);
        UserProfile value2 = loginStore.getLoginState().getLoginUserInfo().getValue();
        if (value2 != null && (nickname = value2.getNickname()) != null) {
            str = nickname;
        }
        anchorPrepareState.m80630k(str);
        this.f78482a = anchorPrepareState;
        this.f78483b = new PrepareState(anchorPrepareState.m80623d(), anchorPrepareState.m80624e(), anchorPrepareState.m80626g(), anchorPrepareState.m80621b(), anchorPrepareState.m80622c());
        this.f78484c = new AnchorPrepareListenerDispatch();
    }
}

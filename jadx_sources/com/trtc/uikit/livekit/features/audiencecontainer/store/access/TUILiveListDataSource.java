package com.trtc.uikit.livekit.features.audiencecontainer.store.access;

import android.text.TextUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import de0.C36665b;
import de0.InterfaceC36666c;
import de0.InterfaceC36667d;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TUILiveListDataSource.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListDataSource;", "<init>", "()V", "fetchLiveList", "", "param", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$FetchLiveListParam;", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TUILiveListDataSource implements InterfaceC36667d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f78598a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final LiveKitLogger f78599b = LiveKitLogger.f77564c.getComponentLogger("AudienceDataSource");

    /* JADX INFO: compiled from: TUILiveListDataSource.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "FETCH_LIST_COUNT", "", "SDK_NOT_INITIALIZED", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.access.TUILiveListDataSource$a */
    /* JADX INFO: compiled from: TUILiveListDataSource.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$fetchLiveList$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36205a implements CompletionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC36666c f78600a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveListStore f78601b;

        public C36205a(InterfaceC36666c interfaceC36666c, LiveListStore liveListStore) {
            this.f78600a = interfaceC36666c;
            this.f78601b = liveListStore;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
            this.f78600a.onError(code, desc);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            this.f78600a.onSuccess(this.f78601b.getLiveState().getLiveListCursor().getValue(), this.f78601b.getLiveState().getLiveList().getValue());
        }
    }

    @Override // de0.InterfaceC36667d
    /* JADX INFO: renamed from: a */
    public void mo80793a(@NotNull C36665b param, @NotNull InterfaceC36666c callback) throws Exception {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value == null || TextUtils.isEmpty(value.getUserID())) {
            f78599b.m79406d("TUIRoomEngine login first");
            callback.onError(-1002, "message");
        } else {
            LiveListStore liveListStoreShared = LiveListStore.INSTANCE.shared();
            liveListStoreShared.fetchLiveList(param.getF79465a(), 20, new C36205a(callback, liveListStoreShared));
        }
    }
}

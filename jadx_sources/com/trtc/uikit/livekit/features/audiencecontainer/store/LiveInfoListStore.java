package com.trtc.uikit.livekit.features.audiencecontainer.store;

import android.text.TextUtils;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import de0.C36665b;
import de0.InterfaceC36666c;
import de0.InterfaceC36667d;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveInfoListStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016J\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/LiveInfoListStore;", "", "liveListDataSource", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListDataSource;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListDataSource;)V", InterfaceC33953u5.f72198E, "", "firstLiveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveInfoList", "", "setFirstData", "", "liveInfo", "refreshLiveList", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;", "fetchLiveList", "isRefresh", "", "getLiveList", "", "getLiveListDataCursor", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveInfoListStore {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f78565e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final LiveKitLogger f78566f = LiveKitLogger.f77564c.getComponentLogger("LiveInfoListStore");

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC36667d f78567a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f78568b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LiveInfo f78569c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<LiveInfo> f78570d;

    /* JADX INFO: compiled from: LiveInfoListStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/LiveInfoListStore$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.LiveInfoListStore$a */
    /* JADX INFO: compiled from: LiveInfoListStore.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/LiveInfoListStore$fetchLiveList$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;", "onSuccess", "", InterfaceC33953u5.f72198E, "", "liveInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onError", "code", "", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36202a implements InterfaceC36666c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f78572b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC36666c f78573c;

        public C36202a(boolean z11, InterfaceC36666c interfaceC36666c) {
            this.f78572b = z11;
            this.f78573c = interfaceC36666c;
        }

        @Override // de0.InterfaceC36666c
        public void onError(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            LiveInfoListStore.f78566f.m79403a("fetchLiveList onError. code:" + code + ",message:" + message);
            this.f78573c.onError(code, message);
        }

        @Override // de0.InterfaceC36666c
        public void onSuccess(String cursor, List<LiveInfo> liveInfoList) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(liveInfoList, "liveInfoList");
            LiveInfoListStore.f78566f.m79404b("fetchLiveList onSuccess. result.liveInfoList.size:" + liveInfoList.size());
            ArrayList arrayList = new ArrayList();
            for (LiveInfo liveInfo : liveInfoList) {
                if (LiveInfoListStore.this.f78569c != null) {
                    String liveID = liveInfo.getLiveID();
                    LiveInfo liveInfo2 = LiveInfoListStore.this.f78569c;
                    Intrinsics.checkNotNull(liveInfo2);
                    if (TextUtils.equals(liveID, liveInfo2.getLiveID())) {
                    }
                }
                arrayList.add(liveInfo);
            }
            if (this.f78572b) {
                LiveInfoListStore.this.f78570d.clear();
            }
            LiveInfoListStore.this.f78570d.addAll(arrayList);
            LiveInfoListStore.this.f78568b = cursor;
            this.f78573c.onSuccess(cursor, arrayList);
        }
    }

    public LiveInfoListStore(@NotNull InterfaceC36667d liveListDataSource) {
        Intrinsics.checkNotNullParameter(liveListDataSource, "liveListDataSource");
        this.f78567a = liveListDataSource;
        this.f78568b = "";
        this.f78570d = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public final void m80764e(@NotNull InterfaceC36666c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m80765f(false, callback);
    }

    /* JADX INFO: renamed from: f */
    public final void m80765f(boolean z11, InterfaceC36666c interfaceC36666c) {
        f78566f.m79404b("fetchLiveList start,isRefresh:" + z11);
        C36665b c36665b = new C36665b();
        String str = z11 ? "" : this.f78568b;
        c36665b.m82032b(str);
        this.f78568b = str;
        this.f78567a.mo80793a(c36665b, new C36202a(z11, interfaceC36666c));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<LiveInfo> m80766g() {
        return this.f78570d;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF78568b() {
        return this.f78568b;
    }

    /* JADX INFO: renamed from: i */
    public final void m80768i(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78569c = liveInfo;
    }
}

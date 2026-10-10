package io.trtc.tuikit.atomicxcore.api.call;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.call.C39491w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J2\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH&J \u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J*\u0010\u0019\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\"\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010!\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallStore;", "", "()V", "observerState", "Lio/trtc/tuikit/atomicxcore/api/call/CallState;", "getObserverState", "()Lio/trtc/tuikit/atomicxcore/api/call/CallState;", "accept", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/call/CallListener;", "calls", "userIdList", "", "", "mediaType", "Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;", ReportDataTable.COLUMN_PARAMS, "Lio/trtc/tuikit/atomicxcore/api/call/CallParams;", "deleteRecentCalls", "callIdList", "hangup", "invite", "participantIds", "join", TUIConstants.TUICalling.CALL_ID, "queryRecentCalls", InterfaceC33953u5.f72198E, "count", "", "reject", "removeListener", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class CallStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CallStore shared = (C39491w) C39491w.f87667l.getValue();

    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;", "", "()V", "shared", "Lio/trtc/tuikit/atomicxcore/api/call/CallStore;", "getShared$annotations", "getShared", "()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CallStore getShared() {
            return CallStore.shared;
        }

        @JvmStatic
        public static /* synthetic */ void getShared$annotations() {
        }
    }

    public abstract void accept(@Nullable CompletionHandler completion);

    public abstract void addListener(@NotNull CallListener listener);

    public abstract void calls(@NotNull List<String> userIdList, @NotNull CallMediaType mediaType, @Nullable CallParams params, @Nullable CompletionHandler completion);

    public abstract void deleteRecentCalls(@NotNull List<String> callIdList, @Nullable CompletionHandler completion);

    @NotNull
    public abstract CallState getObserverState();

    public abstract void hangup(@Nullable CompletionHandler completion);

    public abstract void invite(@NotNull List<String> participantIds, @Nullable CallParams params, @Nullable CompletionHandler completion);

    public abstract void join(@NotNull String callId, @Nullable CompletionHandler completion);

    public abstract void queryRecentCalls(@NotNull String cursor, int count, @Nullable CompletionHandler completion);

    public abstract void reject(@Nullable CompletionHandler completion);

    public abstract void removeListener(@NotNull CallListener listener);

    @NotNull
    public static final CallStore getShared() {
        return INSTANCE.getShared();
    }
}

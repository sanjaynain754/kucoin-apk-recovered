package io.trtc.tuikit.atomicxcore.api.live.deprecated;

import android.graphics.Rect;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine;", "", "()V", "BattleObserver", "BattleRequestCallback", "BattleState", "BattleUserViewModel", "CoGuestState", "CoHostState", "CoHostUser", "ConnectionObserver", "CoreState", "ErrorInfo", "ErrorSate", "LayoutMode", "LayoutState", "MediaState", "RoomState", "UserInfoModifyFlag", "UserState", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LiveCoreViewDefine {

    @NotNull
    public static final LiveCoreViewDefine INSTANCE = new LiveCoreViewDefine();

    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'J&\u0010\f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'J&\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'J&\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'J&\u0010\u000f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'J'\u0010\u0010\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u0013H'J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u001c\u0010\u0015\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH'J\u001c\u0010\u0017\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH'¨\u0006\u0018"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;", "", "onBattleEnded", "", "battleInfo", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;", "onBattleRequestAccept", "battleId", "", "inviter", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;", "invitee", "onBattleRequestCancelled", "onBattleRequestReceived", "onBattleRequestReject", "onBattleRequestTimeout", "onBattleScoreChanged", "battleUserList", "", "Lkotlin/jvm/JvmSuppressWildcards;", "onBattleStarted", "onUserExitBattle", "battleUser", "onUserJoinBattle", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public interface BattleObserver {
        @Deprecated(message = "")
        void onBattleEnded(@Nullable TUILiveBattleManager.BattleInfo battleInfo);

        @Deprecated(message = "")
        void onBattleRequestAccept(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser inviter, @Nullable TUILiveBattleManager.BattleUser invitee);

        @Deprecated(message = "")
        void onBattleRequestCancelled(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser inviter, @Nullable TUILiveBattleManager.BattleUser invitee);

        @Deprecated(message = "")
        void onBattleRequestReceived(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser inviter, @Nullable TUILiveBattleManager.BattleUser invitee);

        @Deprecated(message = "")
        void onBattleRequestReject(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser inviter, @Nullable TUILiveBattleManager.BattleUser invitee);

        @Deprecated(message = "")
        void onBattleRequestTimeout(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser inviter, @Nullable TUILiveBattleManager.BattleUser invitee);

        @Deprecated(message = "")
        void onBattleScoreChanged(@Nullable String battleId, @Nullable List<TUILiveBattleManager.BattleUser> battleUserList);

        @Deprecated(message = "")
        void onBattleStarted(@Nullable TUILiveBattleManager.BattleInfo battleInfo);

        @Deprecated(message = "")
        void onUserExitBattle(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser battleUser);

        @Deprecated(message = "")
        void onUserJoinBattle(@Nullable String battleId, @Nullable TUILiveBattleManager.BattleUser battleUser);
    }

    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J'\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\fH&¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;", "message", "", "onSuccess", "battleId", "requestedUserIdList", "", "Lkotlin/jvm/JvmSuppressWildcards;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public interface BattleRequestCallback {
        void onError(@Nullable TUICommonDefine.Error error, @Nullable String message);

        void onSuccess(@Nullable String battleId, @Nullable List<String> requestedUserIdList);
    }

    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleState;", "", "()V", "battleId", "Landroidx/lifecycle/LiveData;", "", "battlingUserList", "", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;", "inviteeList", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class BattleState {

        @JvmField
        @NotNull
        public final LiveData<String> battleId = new MutableLiveData("");

        @JvmField
        @NotNull
        public final LiveData<List<TUILiveBattleManager.BattleUser>> inviteeList = new MutableLiveData(new ArrayList());

        @JvmField
        @NotNull
        public final LiveData<List<TUILiveBattleManager.BattleUser>> battlingUserList = new MutableLiveData(new ArrayList());
    }

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleUserViewModel;", "", "()V", "battleUser", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;", "rect", "Landroid/graphics/Rect;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class BattleUserViewModel {

        @JvmField
        @Nullable
        public TUILiveBattleManager.BattleUser battleUser;

        @JvmField
        @Nullable
        public Rect rect;
    }

    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoGuestState;", "", "()V", "applicantList", "Landroidx/lifecycle/LiveData;", "", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "connectedUserList", "", "inviteeList", "seatList", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class CoGuestState {

        @JvmField
        @NotNull
        public final LiveData<List<TUIRoomDefine.SeatInfo>> seatList = new MutableLiveData(new ArrayList());

        @JvmField
        @NotNull
        public final LiveData<List<TUIRoomDefine.UserInfo>> connectedUserList = new MutableLiveData(new ArrayList());

        @JvmField
        @NotNull
        public final LiveData<Set<TUIRoomDefine.UserInfo>> applicantList = new MutableLiveData(new HashSet());

        @JvmField
        @NotNull
        public final LiveData<Set<TUIRoomDefine.UserInfo>> inviteeList = new MutableLiveData(new HashSet());
    }

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoHostState;", "", "()V", "connectedUserList", "Landroidx/lifecycle/LiveData;", "", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;", "receivedConnectionRequest", "sentConnectionRequestList", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class CoHostState {

        @JvmField
        @NotNull
        public final LiveData<List<TUILiveConnectionManager.ConnectionUser>> connectedUserList = new MutableLiveData(new ArrayList());

        @JvmField
        @NotNull
        public final LiveData<List<TUILiveConnectionManager.ConnectionUser>> sentConnectionRequestList = new MutableLiveData(new ArrayList());

        @JvmField
        @NotNull
        public final LiveData<TUILiveConnectionManager.ConnectionUser> receivedConnectionRequest = new MutableLiveData(null);
    }

    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoHostUser;", "", "()V", "connectionUser", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;", TUIConstantDefine.HAS_AUDIO_STREAM, "", "Ljava/lang/Boolean;", TUIConstantDefine.HAS_VIDEO_STREAM, "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class CoHostUser {

        @JvmField
        @Nullable
        public TUILiveConnectionManager.ConnectionUser connectionUser;

        @JvmField
        @Nullable
        public Boolean hasAudioStream;

        @JvmField
        @Nullable
        public Boolean hasVideoStream;
    }

    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0013\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007H'JG\u0010\b\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\b\u00072\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\b\u00072\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\b\u0007H'J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u001c\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H'J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH'J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\nH'J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH'J\u0012\u0010\u001e\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH'J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\nH'J\b\u0010 \u001a\u00020\u0003H'J\u0012\u0010!\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH'¨\u0006\""}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;", "", "onConnectedRoomsUpdated", "", "hostUserList", "", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;", "Lkotlin/jvm/JvmSuppressWildcards;", "onConnectedUsersUpdated", "userList", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "joinList", "leaveList", "onCrossRoomConnectionAccepted", "hostUser", "onCrossRoomConnectionCancelled", "onCrossRoomConnectionExited", "onCrossRoomConnectionRejected", "onCrossRoomConnectionRequest", "onCrossRoomConnectionTimeout", "inviter", "invitee", "onRoomDismissed", "roomId", "", "onUserConnectionAccepted", "userInfo", "onUserConnectionCancelled", "inviterUser", "onUserConnectionExited", "onUserConnectionRejected", "onUserConnectionRequest", "onUserConnectionTerminated", "onUserConnectionTimeout", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public interface ConnectionObserver {
        @Deprecated(message = "")
        void onConnectedRoomsUpdated(@Nullable List<TUILiveConnectionManager.ConnectionUser> hostUserList);

        @Deprecated(message = "")
        void onConnectedUsersUpdated(@Nullable List<TUIRoomDefine.UserInfo> userList, @Nullable List<TUIRoomDefine.UserInfo> joinList, @Nullable List<TUIRoomDefine.UserInfo> leaveList);

        @Deprecated(message = "")
        void onCrossRoomConnectionAccepted(@Nullable TUILiveConnectionManager.ConnectionUser hostUser);

        @Deprecated(message = "")
        void onCrossRoomConnectionCancelled(@Nullable TUILiveConnectionManager.ConnectionUser hostUser);

        @Deprecated(message = "")
        void onCrossRoomConnectionExited(@Nullable TUILiveConnectionManager.ConnectionUser hostUser);

        @Deprecated(message = "")
        void onCrossRoomConnectionRejected(@Nullable TUILiveConnectionManager.ConnectionUser hostUser);

        @Deprecated(message = "")
        void onCrossRoomConnectionRequest(@Nullable TUILiveConnectionManager.ConnectionUser hostUser);

        @Deprecated(message = "")
        void onCrossRoomConnectionTimeout(@Nullable TUILiveConnectionManager.ConnectionUser inviter, @Nullable TUILiveConnectionManager.ConnectionUser invitee);

        @Deprecated(message = "")
        void onRoomDismissed(@Nullable String roomId);

        @Deprecated(message = "")
        void onUserConnectionAccepted(@Nullable TUIRoomDefine.UserInfo userInfo);

        @Deprecated(message = "")
        void onUserConnectionCancelled(@Nullable TUIRoomDefine.UserInfo inviterUser);

        @Deprecated(message = "")
        void onUserConnectionExited(@Nullable TUIRoomDefine.UserInfo userInfo);

        @Deprecated(message = "")
        void onUserConnectionRejected(@Nullable TUIRoomDefine.UserInfo userInfo);

        @Deprecated(message = "")
        void onUserConnectionRequest(@Nullable TUIRoomDefine.UserInfo inviterUser);

        @Deprecated(message = "")
        void onUserConnectionTerminated();

        @Deprecated(message = "")
        void onUserConnectionTimeout(@Nullable TUIRoomDefine.UserInfo userInfo);
    }

    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;", "", "()V", "battleState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleState;", "coGuestState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoGuestState;", "coHostState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoHostState;", "errorState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorSate;", "layoutState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutState;", "mediaState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;", "roomState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;", "userState", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserState;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class CoreState {

        @JvmField
        @NotNull
        public RoomState roomState = new RoomState();

        @JvmField
        @NotNull
        public UserState userState = new UserState();

        @JvmField
        @NotNull
        public MediaState mediaState = new MediaState();

        @JvmField
        @NotNull
        public CoGuestState coGuestState = new CoGuestState();

        @JvmField
        @NotNull
        public CoHostState coHostState = new CoHostState();

        @JvmField
        @NotNull
        public BattleState battleState = new BattleState();

        @JvmField
        @NotNull
        public LayoutState layoutState = new LayoutState();

        @JvmField
        @NotNull
        public ErrorSate errorState = new ErrorSate();
    }

    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorSate;", "", "()V", "errorInfo", "Landroidx/lifecycle/LiveData;", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class ErrorSate {

        @JvmField
        @NotNull
        public final LiveData<ErrorInfo> errorInfo = new MutableLiveData(new ErrorInfo());
    }

    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;", "", "(Ljava/lang/String;I)V", "GRID_LAYOUT", "FLOAT_LAYOUT", "FREE_LAYOUT", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public enum LayoutMode {
        GRID_LAYOUT,
        FLOAT_LAYOUT,
        FREE_LAYOUT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<LayoutMode> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutState;", "", "()V", "isShowEmptySeat", "Landroidx/lifecycle/LiveData;", "", "videoLayoutMode", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class LayoutState {

        @JvmField
        @NotNull
        public final LiveData<LayoutMode> videoLayoutMode = new MutableLiveData(LayoutMode.GRID_LAYOUT);

        @JvmField
        @NotNull
        public final LiveData<Boolean> isShowEmptySeat = new MutableLiveData(Boolean.FALSE);
    }

    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;", "", "()V", "maxCoGuestCount", "Landroidx/lifecycle/LiveData;", "", "ownerInfo", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "roomId", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class RoomState {

        @JvmField
        @NotNull
        public final LiveData<String> roomId = new MutableLiveData("");

        @JvmField
        @NotNull
        public final LiveData<TUIRoomDefine.UserInfo> ownerInfo = new MutableLiveData(new TUIRoomDefine.UserInfo());

        @JvmField
        @NotNull
        public final LiveData<Integer> maxCoGuestCount = new MutableLiveData(0);
    }

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "USER_ROLE", "NAME_CARD", "HAS_VIDEO_STREAM", "HAS_AUDIO_STREAM", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public enum UserInfoModifyFlag {
        NONE(0),
        USER_ROLE(1),
        NAME_CARD(2),
        HAS_VIDEO_STREAM(4),
        HAS_AUDIO_STREAM(8);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion;", "", "()V", "fromInt", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;", "value", "", "(Ljava/lang/Integer;)Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nLiveCoreViewDefineDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveCoreViewDefineDeprecated.kt\nio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,271:1\n1282#2,2:272\n*S KotlinDebug\n*F\n+ 1 LiveCoreViewDefineDeprecated.kt\nio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion\n*L\n139#1:272,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001e  */
            /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
            @NotNull
            public final UserInfoModifyFlag fromInt(@Nullable Integer value) {
                for (UserInfoModifyFlag userInfoModifyFlag : UserInfoModifyFlag.values()) {
                    int value2 = userInfoModifyFlag.getValue();
                    if (value != null && value2 == value.intValue()) {
                        if (userInfoModifyFlag == null) {
                            return UserInfoModifyFlag.NONE;
                        }
                        return userInfoModifyFlag;
                    }
                }
                userInfoModifyFlag = null;
                if (userInfoModifyFlag == null) {
                    return UserInfoModifyFlag.NONE;
                }
                return userInfoModifyFlag;
            }
        }

        @NotNull
        public static EnumEntries<UserInfoModifyFlag> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        UserInfoModifyFlag(int i11) {
            this.value = i11;
        }
    }

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;", "", "()V", "isCameraOpened", "Landroidx/lifecycle/LiveData;", "", "isFrontCamera", "isMicrophoneMuted", "isMicrophoneOpened", "isMirrorEnabled", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class MediaState {

        @JvmField
        @NotNull
        public final LiveData<Boolean> isCameraOpened;

        @JvmField
        @NotNull
        public final LiveData<Boolean> isFrontCamera;

        @JvmField
        @NotNull
        public final LiveData<Boolean> isMicrophoneMuted;

        @JvmField
        @NotNull
        public final LiveData<Boolean> isMicrophoneOpened;

        @JvmField
        @NotNull
        public final LiveData<Boolean> isMirrorEnabled;

        public MediaState() {
            Boolean bool = Boolean.FALSE;
            this.isMicrophoneOpened = new MutableLiveData(bool);
            this.isMicrophoneMuted = new MutableLiveData(bool);
            this.isCameraOpened = new MutableLiveData(bool);
            this.isFrontCamera = new MutableLiveData(Boolean.TRUE);
            this.isMirrorEnabled = new MutableLiveData(bool);
        }
    }

    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserState;", "", "()V", "hasAudioStreamUserList", "Landroidx/lifecycle/LiveData;", "", "", "hasVideoStreamUserList", "selfInfo", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class UserState {

        @JvmField
        @NotNull
        public final LiveData<Set<String>> hasAudioStreamUserList;

        @JvmField
        @NotNull
        public final LiveData<Set<String>> hasVideoStreamUserList;

        @JvmField
        @NotNull
        public final LiveData<TUIRoomDefine.UserInfo> selfInfo;

        public UserState() {
            TUIRoomDefine.LoginUserInfo login = TUIRoomEngineImpl.getSelfInfo();
            Intrinsics.checkNotNullExpressionValue(login, "getSelfInfo(...)");
            Intrinsics.checkNotNullParameter(login, "login");
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = login.userId;
            userInfo.userName = login.userName;
            userInfo.avatarUrl = login.avatarUrl;
            this.selfInfo = new MutableLiveData(userInfo);
            this.hasAudioStreamUserList = new MutableLiveData(new HashSet());
            this.hasVideoStreamUserList = new MutableLiveData(new HashSet());
        }
    }

    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;", "", "()V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;", "message", "", "(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class ErrorInfo {

        @JvmField
        @NotNull
        public TUICommonDefine.Error error;

        @JvmField
        @NotNull
        public String message;

        public ErrorInfo() {
            this.error = TUICommonDefine.Error.SUCCESS;
            this.message = "";
        }

        public ErrorInfo(@NotNull TUICommonDefine.Error error, @NotNull String message) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(message, "message");
            TUICommonDefine.Error error2 = TUICommonDefine.Error.SUCCESS;
            this.error = error;
            this.message = message;
        }
    }

    private LiveCoreViewDefine() {
    }
}

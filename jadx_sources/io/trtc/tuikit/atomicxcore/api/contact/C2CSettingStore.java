package io.trtc.tuikit.atomicxcore.api.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.contact.C39586s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0014\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0014\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0014\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0014\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001c\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001c\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingStore;", "", "userID", "", "(Ljava/lang/String;)V", "c2cSettingState", "Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingState;", "getC2cSettingState", "()Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingState;", "getUserID", "()Ljava/lang/String;", "addToBlacklist", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "checkBlacklistStatus", "deleteFriend", "fetchUserInfo", "removeFromBlacklist", "setReceiveMessageOpt", "opt", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "setUserRemark", "remark", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class C2CSettingStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String userID;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingStore;", "userID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final C2CSettingStore create(@NotNull String userID) {
            Intrinsics.checkNotNullParameter(userID, "userID");
            return new C39586s(userID);
        }
    }

    public abstract void addToBlacklist(@Nullable CompletionHandler completion);

    public abstract void checkBlacklistStatus(@Nullable CompletionHandler completion);

    public abstract void deleteFriend(@Nullable CompletionHandler completion);

    public abstract void fetchUserInfo(@Nullable CompletionHandler completion);

    @NotNull
    public abstract C2CSettingState getC2cSettingState();

    public abstract void removeFromBlacklist(@Nullable CompletionHandler completion);

    public abstract void setReceiveMessageOpt(@NotNull ReceiveMessageOpt opt, @Nullable CompletionHandler completion);

    public abstract void setUserRemark(@NotNull String remark, @Nullable CompletionHandler completion);

    public static /* synthetic */ void addToBlacklist$default(C2CSettingStore c2CSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToBlacklist");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.addToBlacklist(completionHandler);
    }

    public static /* synthetic */ void checkBlacklistStatus$default(C2CSettingStore c2CSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkBlacklistStatus");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.checkBlacklistStatus(completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final C2CSettingStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public static /* synthetic */ void deleteFriend$default(C2CSettingStore c2CSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteFriend");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.deleteFriend(completionHandler);
    }

    public static /* synthetic */ void fetchUserInfo$default(C2CSettingStore c2CSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUserInfo");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.fetchUserInfo(completionHandler);
    }

    public static /* synthetic */ void removeFromBlacklist$default(C2CSettingStore c2CSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFromBlacklist");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.removeFromBlacklist(completionHandler);
    }

    public static /* synthetic */ void setReceiveMessageOpt$default(C2CSettingStore c2CSettingStore, ReceiveMessageOpt receiveMessageOpt, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReceiveMessageOpt");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.setReceiveMessageOpt(receiveMessageOpt, completionHandler);
    }

    public static /* synthetic */ void setUserRemark$default(C2CSettingStore c2CSettingStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUserRemark");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        c2CSettingStore.setUserRemark(str, completionHandler);
    }

    @NotNull
    public String getUserID() {
        return this.userID;
    }

    public C2CSettingStore(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
    }
}

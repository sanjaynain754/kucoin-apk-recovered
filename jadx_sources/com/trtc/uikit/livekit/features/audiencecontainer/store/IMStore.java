package com.trtc.uikit.livekit.features.audiencecontainer.store;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.imsdk.p128v2.V2TIMFollowOperationResult;
import com.tencent.imsdk.p128v2.V2TIMFollowTypeCheckResult;
import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import com.tencent.imsdk.p128v2.V2TIMFriendshipManager;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ee0.IMState;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IMStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fJ\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0002J\u001e\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001cH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;", "", "<init>", "()V", "imFriendshipManager", "Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;", "kotlin.jvm.PlatformType", "roomEngine", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;", "_followingUserList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "imState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;", "getImState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;", "imFriendshipListener", "com/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$imFriendshipListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$imFriendshipListener$1;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "followUser", "userId", "unfollowUser", "checkFollowUser", "onAudienceMessageDisabled", "isDisable", "", "checkFollowUserList", "userIDList", "", "onFollowingListChanged", "userInfoList", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "isAdd", "updateFollowUserList", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIMStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMStore.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,161:1\n230#2,5:162\n*S KotlinDebug\n*F\n+ 1 IMStore.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore\n*L\n146#1:162,5\n*E\n"})
public final class IMStore {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f78552f = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final LiveKitLogger f78553g = LiveKitLogger.f77564c.getLiveStreamLogger("UserManager");

    /* JADX INFO: renamed from: a */
    public final V2TIMFriendshipManager f78554a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f78555b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<Set<String>> f78556c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final IMState f78557d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C36200c f78558e;

    /* JADX INFO: compiled from: IMStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore$a */
    /* JADX INFO: compiled from: IMStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$checkFollowUserList$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;", "onSuccess", "", "v2TIMFollowTypeCheckResults", "onError", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36198a implements V2TIMValueCallback<List<? extends V2TIMFollowTypeCheckResult>> {
        public C36198a() {
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowTypeCheckResult> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            V2TIMFollowTypeCheckResult v2TIMFollowTypeCheckResult = list.get(0);
            if (v2TIMFollowTypeCheckResult == null) {
                return;
            }
            boolean z11 = 1 == v2TIMFollowTypeCheckResult.getFollowType() || 3 == v2TIMFollowTypeCheckResult.getFollowType();
            IMStore iMStore = IMStore.this;
            String userID = v2TIMFollowTypeCheckResult.getUserID();
            Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
            iMStore.m80756k(userID, z11);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            IMStore.f78553g.m79403a("checkFollowType failed:errorCode:message:" + desc);
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + desc, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore$b */
    /* JADX INFO: compiled from: IMStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$followUser$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowOperationResult;", "onSuccess", "", "v2TIMFollowOperationResults", "onError", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36199b implements V2TIMValueCallback<List<? extends V2TIMFollowOperationResult>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f78561b;

        public C36199b(String str) {
            this.f78561b = str;
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowOperationResult> v2TIMFollowOperationResults) {
            Intrinsics.checkNotNullParameter(v2TIMFollowOperationResults, "v2TIMFollowOperationResults");
            IMStore.this.m80756k(this.f78561b, true);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            IMStore.f78553g.m79403a("followUser failed:errorCode:message:" + desc);
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + desc, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore$c */
    /* JADX INFO: compiled from: IMStore.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$imFriendshipListener$1", "Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;", "onMyFollowingListChanged", "", "userInfoList", "", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "isAdd", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36200c extends V2TIMFriendshipListener {
        public C36200c() {
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
        public void onMyFollowingListChanged(List<? extends V2TIMUserFullInfo> userInfoList, boolean isAdd) {
            Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
            IMStore.this.m80754i(CollectionsKt.toMutableList((Collection) userInfoList), isAdd);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore$d */
    /* JADX INFO: compiled from: IMStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/store/IMStore$unfollowUser$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowOperationResult;", "onSuccess", "", "v2TIMFollowOperationResults", "onError", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36201d implements V2TIMValueCallback<List<? extends V2TIMFollowOperationResult>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f78564b;

        public C36201d(String str) {
            this.f78564b = str;
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowOperationResult> v2TIMFollowOperationResults) {
            Intrinsics.checkNotNullParameter(v2TIMFollowOperationResults, "v2TIMFollowOperationResults");
            IMStore.this.m80756k(this.f78564b, false);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            IMStore.f78553g.m79403a("unfollowUser failed:errorCode:message:" + desc);
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + desc, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m80749d(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        ArrayList arrayList = new ArrayList();
        arrayList.add(userId);
        m80750e(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final void m80750e(List<String> list) {
        this.f78554a.checkFollowType(list, new C36198a());
    }

    /* JADX INFO: renamed from: f */
    public final void m80751f(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        ArrayList arrayList = new ArrayList();
        arrayList.add(userId);
        this.f78554a.followUser(arrayList, new C36199b(userId));
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final IMState getF78557d() {
        return this.f78557d;
    }

    /* JADX INFO: renamed from: h */
    public final void m80753h(@NotNull String userId, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (Intrinsics.areEqual(userId, value != null ? value.getUserID() : null)) {
            Context contextM79397b = ContextProvider.m79397b();
            if (z11) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Intrinsics.checkNotNull(contextM79397b);
                String string = contextM79397b.getResources().getString(R$string.common_send_message_disabled);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, contextM79397b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
                return;
            }
            AtomicToast atomicToast2 = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            String string2 = contextM79397b.getResources().getString(R$string.common_send_message_enable);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            AtomicToast.m88196j(atomicToast2, contextM79397b, string2, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m80754i(List<? extends V2TIMUserFullInfo> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends V2TIMUserFullInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserID());
        }
        m80750e(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final void m80755j(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        ArrayList arrayList = new ArrayList();
        arrayList.add(userId);
        this.f78554a.unfollowUser(arrayList, new C36201d(userId));
    }

    public IMStore() {
        V2TIMFriendshipManager friendshipManager = V2TIMManager.getFriendshipManager();
        this.f78554a = friendshipManager;
        this.f78555b = TUIRoomEngine.sharedInstance();
        InterfaceC41669n<Set<String>> interfaceC41669nM91009a = C41679x.m91009a(new LinkedHashSet());
        this.f78556c = interfaceC41669nM91009a;
        this.f78557d = new IMState(interfaceC41669nM91009a);
        C36200c c36200c = new C36200c();
        this.f78558e = c36200c;
        friendshipManager.addFriendListener(c36200c);
    }

    /* JADX INFO: renamed from: k */
    public final void m80756k(String str, boolean z11) {
        Set<String> value;
        Set<String> mutableSet;
        if (!TextUtils.isEmpty(str)) {
            InterfaceC41669n<Set<String>> interfaceC41669n = this.f78556c;
            do {
                value = interfaceC41669n.getValue();
                mutableSet = CollectionsKt.toMutableSet(value);
                if (z11) {
                    mutableSet.add(str);
                } else {
                    mutableSet.remove(str);
                }
            } while (!interfaceC41669n.compareAndSet(value, mutableSet));
        }
    }
}

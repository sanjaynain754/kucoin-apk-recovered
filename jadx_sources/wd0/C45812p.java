package wd0;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.tencent.imsdk.p128v2.V2TIMFollowOperationResult;
import com.tencent.imsdk.p128v2.V2TIMFollowTypeCheckResult;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: wd0.p */
/* JADX INFO: compiled from: UserStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J\u001c\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;", "", "<init>", "()V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "_followingUserList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "userState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "getUserState$tuilivekit_googleRelease", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "disableSendingMessageByAdmin", "", "userId", "isDisable", "", "kickRemoteUserOutOfRoom", "followUser", "unfollowUser", "checkFollowUser", "checkFollowUserList", "userIDList", "", "onMyFollowingListChanged", "userInfoList", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "isAdd", "onAudienceMessageDisabled", "updateFollowUserList", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n1#3:176\n230#4,5:177\n*S KotlinDebug\n*F\n+ 1 UserStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore\n*L\n133#1:172\n133#1:173,3\n169#1:177,5\n*E\n"})
public final class C45812p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveKitLogger f103269a = LiveKitLogger.f77564c.getFeaturesLogger("UserManager");

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<LinkedHashSet<String>> f103270b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final UserState f103271c;

    /* JADX INFO: renamed from: wd0.p$a */
    /* JADX INFO: compiled from: UserStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/UserStore$checkFollowUserList$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;", "onSuccess", "", "results", "onError", "code", "", "message", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements V2TIMValueCallback<List<? extends V2TIMFollowTypeCheckResult>> {
        public a() {
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowTypeCheckResult> results) {
            Intrinsics.checkNotNullParameter(results, "results");
            C45812p.this.f103269a.m79404b(hashCode() + " checkFollowType:[onSuccess:[results:" + new Gson().toJson(results) + "]]");
            if (results.isEmpty()) {
                return;
            }
            V2TIMFollowTypeCheckResult v2TIMFollowTypeCheckResult = results.get(0);
            boolean z11 = 1 == v2TIMFollowTypeCheckResult.getFollowType() || 3 == v2TIMFollowTypeCheckResult.getFollowType();
            C45812p c45812p = C45812p.this;
            String userID = v2TIMFollowTypeCheckResult.getUserID();
            Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
            c45812p.m101198l(userID, z11);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C45812p.this.f103269a.m79403a(hashCode() + " checkFollowType:[onSuccess:[code:" + code + ",message:" + message + "]]");
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + message, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: wd0.p$b */
    /* JADX INFO: compiled from: UserStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/UserStore$disableSendingMessageByAdmin$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements CompletionHandler {
        public b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            C45812p.this.f103269a.m79403a("disableSendingMessageByAdmin failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: wd0.p$c */
    /* JADX INFO: compiled from: UserStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/UserStore$followUser$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowOperationResult;", "onSuccess", "", "results", "onError", "code", "", "message", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements V2TIMValueCallback<List<? extends V2TIMFollowOperationResult>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f103275b;

        public c(String str) {
            this.f103275b = str;
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowOperationResult> results) {
            Intrinsics.checkNotNullParameter(results, "results");
            C45812p.this.f103269a.m79404b(hashCode() + " followUser:[onSuccess:[results:" + new Gson().toJson(results) + "]]");
            C45812p.this.m101198l(this.f103275b, true);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C45812p.this.f103269a.m79403a(hashCode() + " followUser:[onSuccess:[code:" + code + ",message:" + message + "]]");
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + message, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: wd0.p$d */
    /* JADX INFO: compiled from: UserStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/UserStore$kickRemoteUserOutOfRoom$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d implements CompletionHandler {
        public d() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            C45812p.this.f103269a.m79403a("disableSendingMessageByAdmin failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: wd0.p$e */
    /* JADX INFO: compiled from: UserStore.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/UserStore$unfollowUser$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowOperationResult;", "onSuccess", "", "results", "onError", "code", "", "message", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e implements V2TIMValueCallback<List<? extends V2TIMFollowOperationResult>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f103278b;

        public e(String str) {
            this.f103278b = str;
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowOperationResult> results) {
            Intrinsics.checkNotNullParameter(results, "results");
            C45812p.this.f103269a.m79404b(hashCode() + " unfollowUser:[onSuccess:[results:" + new Gson().toJson(results) + "]]");
            C45812p.this.m101198l(this.f103278b, false);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C45812p.this.f103269a.m79403a(hashCode() + " unfollowUser:[onSuccess:[code:" + code + ",message:" + message + "]]");
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + message, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m101189c(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (Intrinsics.areEqual(userId, value != null ? value.getUserID() : null)) {
            return;
        }
        m101190d(CollectionsKt.listOf(userId));
    }

    /* JADX INFO: renamed from: d */
    public final void m101190d(List<String> list) {
        this.f103269a.m79404b(hashCode() + " checkFollowType:[userIDList:" + list + ']');
        V2TIMManager.getFriendshipManager().checkFollowType(list, new a());
    }

    /* JADX INFO: renamed from: e */
    public final void m101191e(@NotNull String userId, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        LiveAudienceStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).disableSendMessage(userId, z11, new b());
    }

    /* JADX INFO: renamed from: f */
    public final void m101192f(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<String> listListOf = CollectionsKt.listOf(userId);
        this.f103269a.m79404b(hashCode() + " followUser:[userIDList:" + listListOf + ']');
        V2TIMManager.getFriendshipManager().followUser(listListOf, new c(userId));
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final UserState getF103271c() {
        return this.f103271c;
    }

    /* JADX INFO: renamed from: h */
    public final void m101194h(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        LiveAudienceStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).kickUserOutOfRoom(userId, new d());
    }

    /* JADX INFO: renamed from: i */
    public final void m101195i(@NotNull String userId, boolean z11) {
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

    /* JADX INFO: renamed from: j */
    public final void m101196j(@NotNull List<? extends V2TIMUserFullInfo> userInfoList, boolean z11) {
        Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(userInfoList, 10));
        Iterator<T> it = userInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(((V2TIMUserFullInfo) it.next()).getUserID());
        }
        m101190d(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public final void m101197k(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<String> listListOf = CollectionsKt.listOf(userId);
        this.f103269a.m79404b(hashCode() + " unfollowUser:[userIDList:" + listListOf + ']');
        V2TIMManager.getFriendshipManager().unfollowUser(listListOf, new e(userId));
    }

    public C45812p() {
        InterfaceC41669n<LinkedHashSet<String>> interfaceC41669nM91009a = C41679x.m91009a(new LinkedHashSet());
        this.f103270b = interfaceC41669nM91009a;
        this.f103271c = new UserState(interfaceC41669nM91009a);
    }

    /* JADX INFO: renamed from: l */
    public final void m101198l(String str, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            Set mutableSet = CollectionsKt.toMutableSet(this.f103271c.m101186a().getValue());
            if (z11) {
                mutableSet.add(str);
            } else {
                mutableSet.remove(str);
            }
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(mutableSet);
            InterfaceC41669n<LinkedHashSet<String>> interfaceC41669n = this.f103270b;
            while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), linkedHashSet)) {
            }
        }
    }
}

package wd0;

import android.content.Context;
import android.text.TextUtils;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.features.anchorboardcast.store.ConnectionStatus;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: wd0.f */
/* JADX INFO: compiled from: AnchorCoHostStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u001a\u0010!\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0014\u0010$\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\nJ\u0016\u0010&\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "getLiveInfo", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "_recommendUsers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/CoHostAnchor;", "coHostState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "getCoHostState$tuilivekit_googleRelease", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "isSelfInCoHost", "", "getCoHostCandidates", "", "isRefresh", "isConnected", "roomId", "", "setCoHostTemplateId", "id", "", "onConnectionRequestReceived", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onConnectionRequestAccept", "invitee", "onConnectionRequestReject", "onConnectionRequestTimeout", "isInviting", "updateRecommendListStatus", "handleCandidatesChange", "candidatesList", "restoreConnectionStatus", "connectionStatus", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/ConnectionStatus;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnchorCoHostStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorCoHostStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,183:1\n1761#2,3:184\n1761#2,3:187\n1761#2,3:190\n1563#2:196\n1634#2,3:197\n1563#2:202\n1634#2,3:203\n827#2:206\n855#2,2:207\n1563#2:209\n1634#2,3:210\n1563#2:221\n1634#2,3:222\n230#3,3:193\n233#3,2:200\n230#3,5:213\n230#3,3:218\n233#3,2:225\n*S KotlinDebug\n*F\n+ 1 AnchorCoHostStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore\n*L\n62#1:184,3\n89#1:187,3\n137#1:190,3\n142#1:196\n142#1:197,3\n155#1:202\n155#1:203,3\n156#1:206\n156#1:207,2\n156#1:209\n156#1:210,3\n173#1:221\n173#1:222,3\n141#1:193,3\n141#1:200,2\n168#1:213,5\n172#1:218,3\n172#1:225,2\n*E\n"})
public final class C45802f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveInfo f103234a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<List<CoHostAnchor>> f103235b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AnchorCoHostState f103236c;

    /* JADX INFO: renamed from: wd0.f$a */
    /* JADX INFO: compiled from: AnchorCoHostStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore$getCoHostCandidates$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements CompletionHandler {
        public a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
            C45802f.this.getF103236c().m101140e(false);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            C45802f.this.getF103236c().m101140e(false);
        }
    }

    public C45802f(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f103234a = liveInfo;
        InterfaceC41669n<List<CoHostAnchor>> interfaceC41669nM91009a = C41679x.m91009a(new ArrayList());
        this.f103235b = interfaceC41669nM91009a;
        this.f103236c = new AnchorCoHostState(interfaceC41669nM91009a, false, false, 600);
    }

    /* JADX INFO: renamed from: a */
    public final void m101141a(boolean z11) {
        CoHostStore.Companion companion = CoHostStore.INSTANCE;
        String value = z11 ? "" : companion.create(this.f103234a.getLiveID()).getCoHostState().getCandidatesCursor().getValue();
        this.f103236c.m101140e(true);
        companion.create(this.f103234a.getLiveID()).getCoHostCandidates(value, new a());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnchorCoHostState getF103236c() {
        return this.f103236c;
    }

    /* JADX INFO: renamed from: c */
    public final void m101143c(@NotNull List<SeatUserInfo> candidatesList) {
        Intrinsics.checkNotNullParameter(candidatesList, "candidatesList");
        ArrayList arrayList = new ArrayList();
        List<SeatUserInfo> value = CoHostStore.INSTANCE.create(this.f103234a.getLiveID()).getCoHostState().getConnected().getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SeatUserInfo) it.next()).getLiveID());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : candidatesList) {
            if (!set.contains(((SeatUserInfo) obj).getLiveID())) {
                arrayList3.add(obj);
            }
        }
        ArrayList<CoHostAnchor> arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(C45803g.m101153a((SeatUserInfo) it2.next()));
        }
        for (CoHostAnchor coHostAnchor : arrayList4) {
            if (m101144d(coHostAnchor.getRoomId())) {
                coHostAnchor.m101180h(ConnectionStatus.INVITING);
            } else {
                coHostAnchor.m101180h(ConnectionStatus.UNKNOWN);
            }
            arrayList.add(coHostAnchor);
        }
        InterfaceC41669n<List<CoHostAnchor>> interfaceC41669n = this.f103235b;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), arrayList)) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m101144d(String str) {
        List<SeatUserInfo> value = CoHostStore.INSTANCE.create(this.f103234a.getLiveID()).getCoHostState().getInvitees().getValue();
        if (value != null && value.isEmpty()) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((SeatUserInfo) it.next()).getLiveID(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m101145e() {
        String userID;
        List<SeatUserInfo> value = CoHostStore.INSTANCE.create(this.f103234a.getLiveID()).getCoHostState().getConnected().getValue();
        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value2 == null || (userID = value2.getUserID()) == null || (value != null && value.isEmpty())) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(userID, ((SeatUserInfo) it.next()).getUserID())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m101148h(@Nullable SeatUserInfo seatUserInfo) {
        if (seatUserInfo != null) {
            m101152l(seatUserInfo);
            String userName = seatUserInfo.getUserName();
            if (userName.length() == 0) {
                userName = seatUserInfo.getUserID();
            }
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            String string = contextM79397b.getResources().getString(R$string.common_request_rejected, userName);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, contextM79397b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m101149i(@Nullable SeatUserInfo seatUserInfo, @Nullable SeatUserInfo seatUserInfo2) {
        if (seatUserInfo2 != null) {
            m101152l(seatUserInfo2);
        }
        if (seatUserInfo != null) {
            String userID = seatUserInfo.getUserID();
            UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null)) {
                Context contextM79397b = ContextProvider.m79397b();
                AtomicToast atomicToast = AtomicToast.f87566a;
                Intrinsics.checkNotNull(contextM79397b);
                String string = contextM79397b.getResources().getString(R$string.common_connect_invitation_timeout);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AtomicToast.m88196j(atomicToast, contextM79397b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m101150j(@NotNull String roomId, @NotNull ConnectionStatus connectionStatus) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        ConnectionStatus connectionStatus2 = connectionStatus;
        Intrinsics.checkNotNullParameter(connectionStatus2, "connectionStatus");
        InterfaceC41669n<List<CoHostAnchor>> interfaceC41669n = this.f103235b;
        while (true) {
            List<CoHostAnchor> value = interfaceC41669n.getValue();
            List<CoHostAnchor> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CoHostAnchor coHostAnchorM101173b : list) {
                if (Intrinsics.areEqual(coHostAnchorM101173b.getRoomId(), roomId)) {
                    coHostAnchorM101173b = CoHostAnchor.m101173b(coHostAnchorM101173b, null, null, null, null, 0L, connectionStatus2, 31, null);
                }
                arrayList.add(coHostAnchorM101173b);
                connectionStatus2 = connectionStatus;
            }
            if (interfaceC41669n.compareAndSet(value, CollectionsKt.toList(arrayList))) {
                return;
            } else {
                connectionStatus2 = connectionStatus;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m101151k(int i11) {
        this.f103236c.m101139d(i11);
    }

    /* JADX INFO: renamed from: l */
    public final void m101152l(SeatUserInfo seatUserInfo) {
        List<CoHostAnchor> value;
        ArrayList arrayList;
        InterfaceC41669n<List<CoHostAnchor>> interfaceC41669n = this.f103235b;
        do {
            value = interfaceC41669n.getValue();
            List<CoHostAnchor> list = value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CoHostAnchor coHostAnchorM101173b : list) {
                if (Intrinsics.areEqual(coHostAnchorM101173b.getRoomId(), seatUserInfo.getLiveID())) {
                    coHostAnchorM101173b = CoHostAnchor.m101173b(coHostAnchorM101173b, null, null, null, null, 0L, ConnectionStatus.UNKNOWN, 31, null);
                }
                arrayList.add(coHostAnchorM101173b);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    /* JADX INFO: renamed from: f */
    public final void m101146f(@Nullable SeatUserInfo seatUserInfo) {
    }

    /* JADX INFO: renamed from: g */
    public final void m101147g(@Nullable SeatUserInfo seatUserInfo) {
    }
}

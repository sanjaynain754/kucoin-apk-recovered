package com.trtc.uikit.livekit.features.anchorboardcast.store;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXLiveBase;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wd0.AnchorBattleState;
import wd0.BattleUser;
import wd0.C45800d;

/* JADX INFO: compiled from: AnchorBattleStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0014\u0010%\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ&\u0010'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\nJ\u0010\u0010-\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)J\u0016\u0010.\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\nJ\u0010\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010+J\u001a\u00102\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u00103\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u00104\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010+J\u0010\u00106\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010+J\u001a\u00107\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u00105\u001a\u0004\u0018\u00010+J\u0006\u00108\u001a\u00020\u001cJ\b\u00109\u001a\u00020:H\u0002J\u0016\u0010;\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0<H\u0002J\b\u0010=\u001a\u00020\u001cH\u0002J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\rH\u0002J\b\u0010@\u001a\u00020\u001cH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "getLiveInfo", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "_battledUsers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "_sentBattleRequests", "", "_receivedBattleRequest", "_isInWaiting", "", "_isBattleRunning", "_isOnDisplayResult", "_durationCountDown", "", "battleState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "getBattleState$tuilivekit_googleRelease", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "mainHandler", "Landroid/os/Handler;", "onRequestBattle", "", "battleId", "requestedUserIdList", "onCanceledBattle", "onResponseBattle", "onExitBattle", "resetOnDisplayResult", "isBattleDraw", "isSelfInBattle", "updateBattleUsers", "users", "onBattleStarted", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitees", "onBattleEnded", "onBattleScoreChanged", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;", "onUserExitBattle", "user", "onBattleRequestReceived", "onBattleRequestCancelled", "onBattleRequestAccept", "invitee", "onBattleRequestReject", "onBattleRequestTimeout", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getCurrentTimestamp", "", "sortBattleUsersByScore", "", "removeBattleRequestReceived", "removeSentBattleRequest", "userId", "resetState", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnchorBattleStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorBattleStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n230#2,5:367\n230#2,5:372\n230#2,5:377\n230#2,5:382\n230#2,5:387\n230#2,5:395\n230#2,5:400\n230#2,5:405\n230#2,5:410\n230#2,5:415\n230#2,5:420\n230#2,5:425\n230#2,5:430\n230#2,5:435\n230#2,5:440\n230#2,5:445\n230#2,5:450\n230#2,5:455\n230#2,5:460\n230#2,5:465\n230#2,5:472\n230#2,5:477\n230#2,5:482\n1761#3,3:392\n1021#3,2:470\n*S KotlinDebug\n*F\n+ 1 AnchorBattleStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore\n*L\n85#1:367,5\n88#1:372,5\n92#1:377,5\n93#1:382,5\n107#1:387,5\n128#1:395,5\n140#1:400,5\n165#1:405,5\n166#1:410,5\n167#1:415,5\n176#1:420,5\n185#1:425,5\n187#1:430,5\n192#1:435,5\n196#1:440,5\n217#1:445,5\n238#1:450,5\n247#1:455,5\n282#1:460,5\n283#1:465,5\n333#1:472,5\n335#1:477,5\n198#1:482,5\n124#1:392,3\n306#1:470,2\n*E\n"})
public final class AnchorBattleStore {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f78155k = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveInfo f78156a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<List<BattleUser>> f78157b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<List<String>> f78158c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41669n<BattleUser> f78159d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<Boolean> f78160e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC41669n<Boolean> f78161f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41669n<Boolean> f78162g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41669n<Integer> f78163h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AnchorBattleState f78164i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Handler f78165j;

    /* JADX INFO: compiled from: AnchorBattleStore.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore$Companion;", "", "<init>", "()V", "BATTLE_REQUEST_TIMEOUT", "", "BATTLE_DURATION", "BATTLE_END_INFO_DURATION", "showToast", "", "tips", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final void m80215a(String str) {
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, str, AtomicToast.Style.INFO, null, Integer.valueOf(R$drawable.livekit_connection_toast_icon), null, null, null, 232, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore$a */
    /* JADX INFO: compiled from: AnchorBattleStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore$onBattleStarted$countdownRunnable$1", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnchorBattleStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorBattleStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore$onBattleStarted$countdownRunnable$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,366:1\n230#2,5:367\n*S KotlinDebug\n*F\n+ 1 AnchorBattleStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore$onBattleStarted$countdownRunnable$1\n*L\n146#1:367,5\n*E\n"})
    public static final class RunnableC36058a implements Runnable {
        public RunnableC36058a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object value;
            int iIntValue = ((Number) AnchorBattleStore.this.f78163h.getValue()).intValue();
            if (iIntValue > 0) {
                InterfaceC41669n interfaceC41669n = AnchorBattleStore.this.f78163h;
                do {
                    value = interfaceC41669n.getValue();
                    ((Number) value).intValue();
                } while (!interfaceC41669n.compareAndSet(value, Integer.valueOf(iIntValue - 1)));
                AnchorBattleStore.this.f78165j.postDelayed(this, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 AnchorBattleStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore\n*L\n1#1,328:1\n306#2:329\n*E\n"})
    public static final class C36059b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BattleUser) t12).getScore()), Integer.valueOf(((BattleUser) t11).getScore()));
        }
    }

    public AnchorBattleStore(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78156a = liveInfo;
        InterfaceC41669n<List<BattleUser>> interfaceC41669nM91009a = C41679x.m91009a(new ArrayList());
        this.f78157b = interfaceC41669nM91009a;
        InterfaceC41669n<List<String>> interfaceC41669nM91009a2 = C41679x.m91009a(new ArrayList());
        this.f78158c = interfaceC41669nM91009a2;
        InterfaceC41669n<BattleUser> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f78159d = interfaceC41669nM91009a3;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a4 = C41679x.m91009a(null);
        this.f78160e = interfaceC41669nM91009a4;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a5 = C41679x.m91009a(null);
        this.f78161f = interfaceC41669nM91009a5;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a6 = C41679x.m91009a(null);
        this.f78162g = interfaceC41669nM91009a6;
        InterfaceC41669n<Integer> interfaceC41669nM91009a7 = C41679x.m91009a(0);
        this.f78163h = interfaceC41669nM91009a7;
        this.f78164i = new AnchorBattleState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4, interfaceC41669nM91009a5, interfaceC41669nM91009a6, interfaceC41669nM91009a7, new BattleConfig(0, false, null, 7, null), "", false);
        this.f78165j = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: k */
    public static final void m80190k(final AnchorBattleStore anchorBattleStore) {
        InterfaceC41669n<Boolean> interfaceC41669n = anchorBattleStore.f78162g;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), Boolean.FALSE)) {
        }
        anchorBattleStore.f78165j.postDelayed(new Runnable() { // from class: wd0.c
            @Override // java.lang.Runnable
            public final void run() {
                AnchorBattleStore.m80191l(this.f103229b);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: A */
    public final void m80192A() {
        this.f78157b.setValue(new ArrayList());
        this.f78158c.setValue(new ArrayList());
        this.f78159d.setValue(null);
        this.f78160e.setValue(null);
        this.f78161f.setValue(null);
        this.f78162g.setValue(null);
        this.f78163h.setValue(0);
        this.f78164i.m101132h(new BattleConfig(0, false, null, 7, null));
        this.f78164i.m101133i("");
        this.f78164i.m101134j(false);
    }

    /* JADX INFO: renamed from: C */
    public final void m80194C(@NotNull List<BattleUser> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        InterfaceC41669n<List<BattleUser>> interfaceC41669n = this.f78157b;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), users)) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m80195e() {
        this.f78165j.removeCallbacksAndMessages(null);
        m80192A();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final AnchorBattleState getF78164i() {
        return this.f78164i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m80198h() {
        List<BattleUser> value = this.f78157b.getValue();
        if (value.isEmpty()) {
            return false;
        }
        return value.get(0).getRanking() == value.get(value.size() - 1).getRanking();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m80199i() {
        List<BattleUser> value = this.f78157b.getValue();
        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID = value2 != null ? value2.getUserID() : null;
        if (value != null && value.isEmpty()) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(userID, ((BattleUser) it.next()).getUserId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m80200j(@Nullable BattleInfo battleInfo) {
        this.f78165j.removeCallbacksAndMessages(null);
        this.f78164i.m101134j(false);
        this.f78164i.m101133i("");
        this.f78164i.m101132h(new BattleConfig(0, false, null, 7, null));
        InterfaceC41669n<List<String>> interfaceC41669n = this.f78158c;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), new ArrayList())) {
        }
        if (battleInfo != null) {
            List<BattleUser> mutableList = CollectionsKt.toMutableList((Collection) this.f78157b.getValue());
            for (BattleUser battleUser : mutableList) {
                Integer num = BattleStore.INSTANCE.create(this.f78156a.getLiveID()).getBattleState().getBattleScore().getValue().get(battleUser.getUserId());
                battleUser.m101172g(num != null ? num.intValue() : 0);
            }
            m80193B(mutableList);
            InterfaceC41669n<List<BattleUser>> interfaceC41669n2 = this.f78157b;
            while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), mutableList)) {
            }
        }
        InterfaceC41669n<Boolean> interfaceC41669n3 = this.f78161f;
        while (!interfaceC41669n3.compareAndSet(interfaceC41669n3.getValue(), Boolean.FALSE)) {
        }
        this.f78165j.removeCallbacksAndMessages(null);
        if (CoHostStore.INSTANCE.create(this.f78156a.getLiveID()).getCoHostState().getConnected().getValue().isEmpty()) {
            InterfaceC41669n<Boolean> interfaceC41669n4 = this.f78162g;
            while (!interfaceC41669n4.compareAndSet(interfaceC41669n4.getValue(), Boolean.FALSE)) {
            }
            m80192A();
        } else {
            InterfaceC41669n<Boolean> interfaceC41669n5 = this.f78162g;
            while (!interfaceC41669n5.compareAndSet(interfaceC41669n5.getValue(), Boolean.TRUE)) {
            }
            this.f78165j.postDelayed(new Runnable() { // from class: wd0.b
                @Override // java.lang.Runnable
                public final void run() {
                    AnchorBattleStore.m80190k(this.f103228b);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80201m(@Nullable SeatUserInfo seatUserInfo) {
        if (seatUserInfo != null) {
            m80213y(seatUserInfo.getUserID());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m80203o(@Nullable String str, @Nullable SeatUserInfo seatUserInfo) {
        if (str != null) {
            this.f78164i.m101133i(str);
        }
        if (seatUserInfo != null) {
            InterfaceC41669n<BattleUser> interfaceC41669n = this.f78159d;
            while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), C45800d.m101135a(seatUserInfo))) {
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m80204p(@Nullable SeatUserInfo seatUserInfo) {
        if (seatUserInfo != null) {
            m80213y(seatUserInfo.getUserID());
            String string = ContextProvider.m79397b().getString(R$string.common_battle_invitee_reject, seatUserInfo.getUserName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            f78155k.m80215a(string);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m80205q(@Nullable SeatUserInfo seatUserInfo, @Nullable SeatUserInfo seatUserInfo2) {
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (TextUtils.equals(seatUserInfo != null ? seatUserInfo.getUserID() : null, value != null ? value.getUserID() : null)) {
            InterfaceC41669n<List<String>> interfaceC41669n = this.f78158c;
            while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), new ArrayList())) {
            }
            InterfaceC41669n<Boolean> interfaceC41669n2 = this.f78160e;
            while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), Boolean.FALSE)) {
            }
        } else {
            m80212x();
            if (seatUserInfo2 != null) {
                m80213y(seatUserInfo2.getUserID());
            }
        }
        Context contextM79397b = ContextProvider.m79397b();
        Companion companion = f78155k;
        String string = contextM79397b.getString(R$string.common_battle_invitation_timeout);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.m80215a(string);
    }

    /* JADX INFO: renamed from: r */
    public final void m80206r(@Nullable BattleInfo battleInfo, @NotNull SeatUserInfo inviter, @NotNull List<SeatUserInfo> invitees) {
        Integer value;
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        if (battleInfo == null || Intrinsics.areEqual(this.f78161f.getValue(), Boolean.TRUE)) {
            return;
        }
        this.f78164i.m101133i(battleInfo.getBattleID());
        this.f78164i.m101132h(battleInfo.getConfig());
        int iMax = Math.max(Math.min((int) ((((long) battleInfo.getConfig().getDuration()) + battleInfo.getStartTime()) - (m80197g() / ((long) 1000))), battleInfo.getConfig().getDuration()), 0);
        InterfaceC41669n<Integer> interfaceC41669n = this.f78163h;
        do {
            value = interfaceC41669n.getValue();
            value.intValue();
        } while (!interfaceC41669n.compareAndSet(value, Integer.valueOf(iMax)));
        this.f78165j.postDelayed(new RunnableC36058a(), 1000L);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(invitees);
        arrayList.add(inviter);
        List<BattleUser> mutableList = CollectionsKt.toMutableList((Collection) this.f78157b.getValue());
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SeatUserInfo seatUserInfo = (SeatUserInfo) next;
            BattleUser battleUserM101135a = C45800d.m101135a(seatUserInfo);
            Integer num = BattleStore.INSTANCE.create(this.f78156a.getLiveID()).getBattleState().getBattleScore().getValue().get(seatUserInfo.getUserID());
            battleUserM101135a.m101172g(num != null ? num.intValue() : 0);
            mutableList.add(battleUserM101135a);
        }
        m80193B(mutableList);
        InterfaceC41669n<Boolean> interfaceC41669n2 = this.f78160e;
        while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), Boolean.FALSE)) {
        }
        InterfaceC41669n<Boolean> interfaceC41669n3 = this.f78161f;
        while (!interfaceC41669n3.compareAndSet(interfaceC41669n3.getValue(), Boolean.TRUE)) {
        }
        InterfaceC41669n<List<BattleUser>> interfaceC41669n4 = this.f78157b;
        while (!interfaceC41669n4.compareAndSet(interfaceC41669n4.getValue(), mutableList)) {
        }
        this.f78164i.m101134j(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m80207s() {
        InterfaceC41669n<Boolean> interfaceC41669n = this.f78160e;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), Boolean.FALSE)) {
        }
        InterfaceC41669n<List<String>> interfaceC41669n2 = this.f78158c;
        while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), new ArrayList())) {
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m80209u(@NotNull String battleId, @NotNull List<String> requestedUserIdList) {
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        Intrinsics.checkNotNullParameter(requestedUserIdList, "requestedUserIdList");
        this.f78164i.m101133i(battleId);
        InterfaceC41669n<Boolean> interfaceC41669n = this.f78160e;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), Boolean.TRUE)) {
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) this.f78158c.getValue());
        mutableList.addAll(requestedUserIdList);
        InterfaceC41669n<List<String>> interfaceC41669n2 = this.f78158c;
        while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), mutableList)) {
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m80211w(@Nullable SeatUserInfo seatUserInfo) {
        BattleUser next;
        if (seatUserInfo == null) {
            return;
        }
        List<BattleUser> mutableList = CollectionsKt.toMutableList((Collection) this.f78157b.getValue());
        Iterator<BattleUser> it = mutableList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(next.getUserId(), seatUserInfo.getUserID()));
        if (mutableList.size() == 2 || next == null) {
            return;
        }
        mutableList.remove(next);
        m80193B(mutableList);
        InterfaceC41669n<List<BattleUser>> interfaceC41669n = this.f78157b;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), mutableList)) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m80212x() {
        this.f78159d.setValue(null);
    }

    /* JADX INFO: renamed from: y */
    public final void m80213y(String str) {
        List<String> mutableList = CollectionsKt.toMutableList((Collection) this.f78158c.getValue());
        Iterator<String> it = mutableList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                it.remove();
                break;
            }
        }
        if (mutableList.isEmpty()) {
            InterfaceC41669n<Boolean> interfaceC41669n = this.f78160e;
            while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), Boolean.FALSE)) {
            }
        }
        InterfaceC41669n<List<String>> interfaceC41669n2 = this.f78158c;
        while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), mutableList)) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m80214z() {
        this.f78165j.removeCallbacksAndMessages(null);
        if (Intrinsics.areEqual(this.f78162g.getValue(), Boolean.TRUE)) {
            InterfaceC41669n<Boolean> interfaceC41669n = this.f78162g;
            while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), Boolean.FALSE)) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m80191l(AnchorBattleStore anchorBattleStore) {
        anchorBattleStore.m80192A();
    }

    /* JADX INFO: renamed from: B */
    public final void m80193B(List<BattleUser> list) {
        int ranking;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new C36059b());
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            BattleUser battleUser = list.get(i11);
            if (i11 == 0) {
                ranking = 1;
            } else {
                BattleUser battleUser2 = list.get(i11 - 1);
                int score = battleUser2.getScore();
                int score2 = battleUser.getScore();
                ranking = battleUser2.getRanking();
                if (score != score2) {
                    ranking++;
                }
            }
            battleUser.m101171f(ranking);
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m80197g() {
        long networkTimestamp = TXLiveBase.getNetworkTimestamp();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (networkTimestamp > 0) {
            return networkTimestamp;
        }
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: n */
    public final void m80202n(@Nullable SeatUserInfo seatUserInfo) {
        String userName;
        m80212x();
        Context contextM79397b = ContextProvider.m79397b();
        int i11 = R$string.common_battle_inviter_cancel;
        if (seatUserInfo != null) {
            userName = seatUserInfo.getUserName();
        } else {
            userName = null;
        }
        String string = contextM79397b.getString(i11, userName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f78155k.m80215a(string);
    }

    /* JADX INFO: renamed from: t */
    public final void m80208t() {
        m80192A();
    }

    /* JADX INFO: renamed from: v */
    public final void m80210v() {
        m80212x();
    }
}

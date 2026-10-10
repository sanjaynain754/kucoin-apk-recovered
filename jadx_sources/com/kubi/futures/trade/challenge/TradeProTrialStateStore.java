package com.kubi.futures.trade.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.trade.challenge.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002J\u001a\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/TradeProTrialStateStore;", "", "<init>", "()V", "TRADE_PRO_PRIZE_TYPE", "", "_tradeProTrialState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/trade/challenge/TradeProTrialState;", "tradeProTrialState", "Landroidx/lifecycle/LiveData;", "getTradeProTrialState", "()Landroidx/lifecycle/LiveData;", "requestSeq", "", "nextRequestSeq", "clear", "", "seq", "refreshFromChallenge", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "refreshFromWelfareCompose", "compose", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "isTradeProPrizeType", "", "prizeType", "isClassicTrialSupported", "markTrialUsed", "markTrialActivated", "updateTrialPanelStatus", "fromStatus", "toStatus", "applyState", "incoming", "trialStatusPriority", "", "status", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeProTrialState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeProTrialState.kt\ncom/kubi/futures/trade/challenge/TradeProTrialStateStore\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n183#2,2:256\n1#3:258\n*S KotlinDebug\n*F\n+ 1 TradeProTrialState.kt\ncom/kubi/futures/trade/challenge/TradeProTrialStateStore\n*L\n104#1:256,2\n*E\n"})
public final class TradeProTrialStateStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeProTrialStateStore f23763a = new TradeProTrialStateStore();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final MutableLiveData<TradeProTrialState> f23764b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final LiveData<TradeProTrialState> f23765c;

    /* JADX INFO: renamed from: d */
    public static volatile long f23766d;

    /* JADX INFO: renamed from: b */
    public final void m26982b(long j11) {
        m26981a(null, j11);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized long m26987h() {
        f23766d++;
        return f23766d;
    }

    /* JADX INFO: renamed from: k */
    public final void m26990k(String str, String str2) {
        synchronized (this) {
            MutableLiveData<TradeProTrialState> mutableLiveData = f23764b;
            TradeProTrialState value = mutableLiveData.getValue();
            if (value == null) {
                return;
            }
            if (Intrinsics.areEqual(value.getStatus(), str)) {
                long jM26987h = f23763a.m26987h();
                f23766d = jM26987h;
                mutableLiveData.postValue(TradeProTrialState.copy$default(value, null, null, null, null, null, null, str2, null, null, jM26987h, 447, null));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    static {
        MutableLiveData<TradeProTrialState> mutableLiveData = new MutableLiveData<>();
        f23764b = mutableLiveData;
        f23765c = mutableLiveData;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m26980c(TradeProTrialStateStore tradeProTrialStateStore, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = tradeProTrialStateStore.m26987h();
        }
        tradeProTrialStateStore.m26982b(j11);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m26981a(TradeProTrialState tradeProTrialState, long j11) {
        TradeProTrialState tradeProTrialStateCopy$default;
        try {
            if (j11 < f23766d) {
                return;
            }
            MutableLiveData<TradeProTrialState> mutableLiveData = f23764b;
            TradeProTrialState value = mutableLiveData.getValue();
            TradeProTrialState tradeProTrialState2 = null;
            if (tradeProTrialState == null) {
                tradeProTrialStateCopy$default = null;
            } else {
                tradeProTrialStateCopy$default = (value != null && Intrinsics.areEqual(tradeProTrialState.getCode(), value.getCode()) && m26989j(tradeProTrialState.getStatus()) < m26989j(value.getStatus())) ? TradeProTrialState.copy$default(tradeProTrialState, null, null, null, null, null, null, value.getStatus(), null, null, j11, 447, null) : tradeProTrialState;
            }
            f23766d = j11;
            if (tradeProTrialStateCopy$default != null && tradeProTrialStateCopy$default.isActive()) {
                tradeProTrialState2 = tradeProTrialStateCopy$default;
            }
            mutableLiveData.postValue(tradeProTrialState2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final LiveData<TradeProTrialState> m26983d() {
        return f23765c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26984e() {
        if (BrokerConfig.f19211a.m20201d().mo4515x() != MultiBizType.CLASSIC) {
            return false;
        }
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        return kuMexDepend.m35905g().c() && kuMexDepend.m35906h();
    }

    /* JADX INFO: renamed from: f */
    public final void m26985f() {
        m26990k("USE_FINISHED", "ACTIVATE_FINISHED");
    }

    /* JADX INFO: renamed from: g */
    public final void m26986g() {
        m26990k("ACTIVATE_FINISHED", "USE_FINISHED");
    }

    /* JADX INFO: renamed from: j */
    public final int m26989j(String str) {
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1267657911) {
            return !str.equals("SEND_FINISHED") ? 0 : 1;
        }
        if (iHashCode != -1211024310) {
            return (iHashCode == 996474430 && str.equals("ACTIVATE_FINISHED")) ? 2 : 0;
        }
        return str.equals("USE_FINISHED") ? 3 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m26988i(@Nullable UserJoinChallengeEntity userJoinChallengeEntity, long j11) {
        if (!m26984e()) {
            m26981a(null, j11);
        } else {
            m26981a(FuturesTraderProChallengeMapper.f23762a.m26976e(userJoinChallengeEntity, j11), j11);
        }
    }
}

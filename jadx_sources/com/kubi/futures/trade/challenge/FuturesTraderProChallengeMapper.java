package com.kubi.futures.trade.challenge;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37569d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.futures.trade.challenge.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesTraderProChallengeMapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeMapper;", "", "<init>", "()V", "TRADE_PRO_TIMER_TAG", "", "defaultProgressText", "defaultUseText", "defaultActivateText", "defaultTitleText", "mapChallengeToTradeProState", "Lcom/kubi/futures/trade/challenge/TradeProTrialState;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "requestSeq", "", "mapWelfareTrialToTradeProState", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "mapStateToChallengeUiState", "Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeUiState;", "state", "mapStateToWelfareTrial", "fallback", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTraderProChallengeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTraderProChallengeMapper.kt\ncom/kubi/futures/trade/challenge/FuturesTraderProChallengeMapper\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n20#2:149\n1#3:150\n*S KotlinDebug\n*F\n+ 1 FuturesTraderProChallengeMapper.kt\ncom/kubi/futures/trade/challenge/FuturesTraderProChallengeMapper\n*L\n107#1:149\n*E\n"})
public final class FuturesTraderProChallengeMapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesTraderProChallengeMapper f23762a = new FuturesTraderProChallengeMapper();

    @Nullable
    /* JADX INFO: renamed from: e */
    public final TradeProTrialState m26976e(@Nullable UserJoinChallengeEntity userJoinChallengeEntity, long j11) {
        if (userJoinChallengeEntity == null) {
            return null;
        }
        String strM26979b = C13713k.m26979b(userJoinChallengeEntity.getStatus());
        if (C13713k.m26978a(strM26979b)) {
            return null;
        }
        String strM66668h = C27041f.m66668h(userJoinChallengeEntity.getCode());
        if (StringsKt.isBlank(strM66668h)) {
            return null;
        }
        Log.f30813a.m36615a("TradeProTrialTimer", "challengeSource code=" + strM66668h + " status=" + userJoinChallengeEntity.getStatus() + " normalizedStatus=" + strM26979b + " startTime=" + userJoinChallengeEntity.getStartTime() + " endTime=" + userJoinChallengeEntity.getEndTime() + " campaignCode=" + userJoinChallengeEntity.getCampaignCode());
        return new TradeProTrialState(userJoinChallengeEntity.getCampaignCode(), strM66668h, userJoinChallengeEntity.getCurrency(), userJoinChallengeEntity.getFaceValue(), userJoinChallengeEntity.getStartTime(), userJoinChallengeEntity.getEndTime(), strM26979b, null, C37569d.m84660a(userJoinChallengeEntity), j11);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final FuturesTraderProChallengeUiState m26977f(@Nullable TradeProTrialState tradeProTrialState) {
        PropertyEntity properties;
        Integer shortDisplayPrecision = null;
        if (tradeProTrialState == null) {
            return null;
        }
        String strM66668h = C27041f.m66668h(tradeProTrialState.getCode());
        if (StringsKt.isBlank(strM66668h) || tradeProTrialState.getCountdownEndTimeMillis() <= 0) {
            return null;
        }
        boolean showActivateButton = tradeProTrialState.getShowActivateButton();
        boolean z11 = tradeProTrialState.getShowUseButton() && !showActivateButton;
        boolean z12 = tradeProTrialState.getShowProgressButton() && !showActivateButton;
        if (!showActivateButton && !z11 && !z12) {
            return null;
        }
        Log.f30813a.m36615a("TradeProTrialTimer", "challengeUiState code=" + strM66668h + " status=" + tradeProTrialState.getStatus() + " countdownEnd=" + tradeProTrialState.getCountdownEndTimeMillis() + " showActivate=" + showActivateButton + " showUse=" + z11 + " showProgress=" + z12);
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(tradeProTrialState.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        String strM66668h2 = C27041f.m66668h(C27041f.m66677q(tradeProTrialState.getCurrency()));
        String challengeId = tradeProTrialState.getChallengeId();
        String strM66668h3 = C27041f.m66668h(tradeProTrialState.getTitle());
        if (StringsKt.isBlank(strM66668h3)) {
            strM66668h3 = f23762a.m26974c();
        }
        return new FuturesTraderProChallengeUiState(challengeId, strM66668h3, tradeProTrialState.getCountdownEndTimeMillis(), C42180b.m92640e(C27039d.m66656p(tradeProTrialState.getFaceValue()), null, iM66651k, true, false, true, 0, null, 105, null), strM66668h2, m26973b(), m26972a(), m26975d(), C27041f.m66668h(tradeProTrialState.getProgressUrl()), "", strM66668h, showActivateButton, z11, z12);
    }

    /* JADX INFO: renamed from: a */
    public final String m26972a() {
        return C27017c.f54310a.m66516f(R$string.kumex_welfare_activate, new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public final String m26973b() {
        return C27017c.f54310a.m66516f(R$string.kumex_trade_pro_view_progress, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final String m26974c() {
        return C27017c.f54310a.m66516f(R$string.kumex_trade_pro_position_in_progress, new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public final String m26975d() {
        return C27017c.f54310a.m66516f(R$string.kumex_trade_pro_use, new Object[0]);
    }
}

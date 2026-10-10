package com.kubi.tradebase.marketamount;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketAmountUnitStore.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountUnitStore;", "", "preferences", "Lcom/kubi/tradebase/marketamount/MarketAmountUnitPreferences;", "<init>", "(Lcom/kubi/tradebase/marketamount/MarketAmountUnitPreferences;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/kubi/tradebase/marketamount/MarketAmountUnitState;", "kotlin.jvm.PlatformType", "loadState", "state", "unit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "side", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "observe", "Lio/reactivex/Observable;", "update", "", "toUnitOrNull", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAmountUnitStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAmountUnitStore.kt\ncom/kubi/tradebase/marketamount/MarketAmountUnitStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n295#2,2:81\n*S KotlinDebug\n*F\n+ 1 MarketAmountUnitStore.kt\ncom/kubi/tradebase/marketamount/MarketAmountUnitStore\n*L\n72#1:81,2\n*E\n"})
public final class MarketAmountUnitStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MarketAmountUnitPreferences f51581a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BehaviorSubject<MarketAmountUnitState> f51582b;

    /* JADX INFO: renamed from: com.kubi.tradebase.marketamount.k$a */
    /* JADX INFO: compiled from: MarketAmountUnitStore.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketAmountSide.values().length];
            try {
                iArr[MarketAmountSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketAmountSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MarketAmountUnitStore(@NotNull MarketAmountUnitPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f51581a = preferences;
        BehaviorSubject<MarketAmountUnitState> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(m63243a());
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.f51582b = behaviorSubjectCreateDefault;
    }

    /* JADX INFO: renamed from: a */
    public final MarketAmountUnitState m63243a() {
        MarketAmountUnit marketAmountUnitM63246d = m63246d(this.f51581a.mo63228a(MarketAmountSide.BUY));
        if (marketAmountUnitM63246d == null) {
            marketAmountUnitM63246d = MarketAmountUnit.QUOTE;
        }
        MarketAmountUnit marketAmountUnitM63246d2 = m63246d(this.f51581a.mo63228a(MarketAmountSide.SELL));
        if (marketAmountUnitM63246d2 == null) {
            marketAmountUnitM63246d2 = MarketAmountUnit.BASE;
        }
        return new MarketAmountUnitState(marketAmountUnitM63246d, marketAmountUnitM63246d2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Observable<MarketAmountUnitState> m63244b() {
        Observable<MarketAmountUnitState> observableDistinctUntilChanged = this.f51582b.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final MarketAmountUnitState m63245c() {
        MarketAmountUnitState value = this.f51582b.getValue();
        return value == null ? new MarketAmountUnitState(null, null, 3, null) : value;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final MarketAmountUnit m63247e(@NotNull MarketAmountSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return m63245c().m63242c(side);
    }

    /* JADX INFO: renamed from: f */
    public final void m63248f(@NotNull MarketAmountSide side, @NotNull MarketAmountUnit unit) {
        MarketAmountUnitState marketAmountUnitStateM63240b;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unit, "unit");
        MarketAmountUnitState marketAmountUnitStateM63245c = m63245c();
        int i11 = a.$EnumSwitchMapping$0[side.ordinal()];
        if (i11 == 1) {
            marketAmountUnitStateM63240b = MarketAmountUnitState.m63240b(marketAmountUnitStateM63245c, unit, null, 2, null);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            marketAmountUnitStateM63240b = MarketAmountUnitState.m63240b(marketAmountUnitStateM63245c, null, unit, 1, null);
        }
        if (Intrinsics.areEqual(marketAmountUnitStateM63240b, marketAmountUnitStateM63245c)) {
            return;
        }
        this.f51581a.mo63229b(side, unit);
        this.f51582b.onNext(marketAmountUnitStateM63240b);
    }

    /* JADX INFO: renamed from: d */
    public final MarketAmountUnit m63246d(String str) {
        MarketAmountUnit next;
        Iterator<MarketAmountUnit> it = MarketAmountUnit.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(next.name(), str)) {
                return next;
            }
        }
        next = null;
        return next;
    }
}

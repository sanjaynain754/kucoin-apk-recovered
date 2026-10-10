package p025av;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: av.c */
/* JADX INFO: compiled from: RankConstant.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\b\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\"\u000e\u0010\t\u001a\u00020\u0002X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"isFromHome", "", "", "isNewRankTab", "isVolumeRankTab", "isMarketCapRankTab", "isRankCoinSubTab", "isRankSpotSubTab", "isRankFutureSubTab", "WIDGET_MOVE_ACTION", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4392c {
    /* JADX INFO: renamed from: a */
    public static final boolean m4013a(@Nullable String str) {
        return Intrinsics.areEqual(str, "HOMEPAGE");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4014b(@Nullable String str) {
        return Intrinsics.areEqual(str, "MARKET_CAP");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4015c(@Nullable String str) {
        return Intrinsics.areEqual(str, "NEW_CURRENCY_V2");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m4016d(@Nullable String str) {
        return Intrinsics.areEqual(str, "COIN");
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m4017e(@Nullable String str) {
        return Intrinsics.areEqual(str, "CONTRACT");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4018f(@Nullable String str) {
        return Intrinsics.areEqual(str, "SPOT");
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4019g(@Nullable String str) {
        return Intrinsics.areEqual(str, "VOLUME_CHANGE_24H_UP_RATE");
    }
}

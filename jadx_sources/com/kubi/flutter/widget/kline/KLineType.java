package com.kubi.flutter.widget.kline;

import com.tencent.mmkv.MMKV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KLineType.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineType;", "", "type", "", "name", "period", "", "pageSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getType", "()Ljava/lang/String;", "getName", "getPeriod", "()I", "getPageSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KLineType {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f22375e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final KLineType f22376f = new KLineType("1min", "ONE_MINUTE", 60, 1000);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final KLineType f22377g = new KLineType("3min", "THREE_MINUTE", 180, 1000);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final KLineType f22378h = new KLineType("5min", "FIVE_MINUTE", 300, 1000);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final KLineType f22379i = new KLineType("15min", "FIFTEEN_MINUTE", 900, 1000);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final KLineType f22380j = new KLineType("30min", "THIRTY_MINUTE", 1800, 1000);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final KLineType f22381k = new KLineType("1hour", "ONE_HOUR", 3600, 500);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final KLineType f22382l = new KLineType("2hour", "TWO_HOUR", 7200, 500);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final KLineType f22383m = new KLineType("4hour", "FOUR_HOUR", 14400, 500);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final KLineType f22384n = new KLineType("6hour", "SIX_HOUR", 21600, 500);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final KLineType f22385o = new KLineType("8hour", "EIGHT_HOUR", 28800, 500);

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final KLineType f22386p = new KLineType("12hour", "TWELVE_HOUR", 43200, 500);

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final KLineType f22387q = new KLineType("1day", "ONE_DAY", 86400, 500);

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final KLineType f22388r = new KLineType("1week", "ONE_WEEK", 604800, 500);

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final KLineType f22389s = new KLineType("1month", "ONE_MONTH", MMKV.ExpireInMonth, 500);

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int period;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int pageSize;

    /* JADX INFO: compiled from: KLineType.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007¨\u0006\""}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineType$Companion;", "", "<init>", "()V", "ONE_MINUTE", "Lcom/kubi/flutter/widget/kline/KLineType;", "getONE_MINUTE", "()Lcom/kubi/flutter/widget/kline/KLineType;", "THREE_MINUTE", "getTHREE_MINUTE", "FIVE_MINUTE", "getFIVE_MINUTE", "FIFTEEN_MINUTE", "getFIFTEEN_MINUTE", "THIRTY_MINUTE", "getTHIRTY_MINUTE", "ONE_HOUR", "getONE_HOUR", "TWO_HOUR", "getTWO_HOUR", "FOUR_HOUR", "getFOUR_HOUR", "SIX_HOUR", "getSIX_HOUR", "EIGHT_HOUR", "getEIGHT_HOUR", "TWELVE_HOUR", "getTWELVE_HOUR", "ONE_DAY", "getONE_DAY", "ONE_WEEK", "getONE_WEEK", "ONE_MONTH", "getONE_MONTH", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KLineType getEIGHT_HOUR() {
            return KLineType.f22385o;
        }

        @NotNull
        public final KLineType getFIFTEEN_MINUTE() {
            return KLineType.f22379i;
        }

        @NotNull
        public final KLineType getFIVE_MINUTE() {
            return KLineType.f22378h;
        }

        @NotNull
        public final KLineType getFOUR_HOUR() {
            return KLineType.f22383m;
        }

        @NotNull
        public final KLineType getONE_DAY() {
            return KLineType.f22387q;
        }

        @NotNull
        public final KLineType getONE_HOUR() {
            return KLineType.f22381k;
        }

        @NotNull
        public final KLineType getONE_MINUTE() {
            return KLineType.f22376f;
        }

        @NotNull
        public final KLineType getONE_MONTH() {
            return KLineType.f22389s;
        }

        @NotNull
        public final KLineType getONE_WEEK() {
            return KLineType.f22388r;
        }

        @NotNull
        public final KLineType getSIX_HOUR() {
            return KLineType.f22384n;
        }

        @NotNull
        public final KLineType getTHIRTY_MINUTE() {
            return KLineType.f22380j;
        }

        @NotNull
        public final KLineType getTHREE_MINUTE() {
            return KLineType.f22377g;
        }

        @NotNull
        public final KLineType getTWELVE_HOUR() {
            return KLineType.f22386p;
        }

        @NotNull
        public final KLineType getTWO_HOUR() {
            return KLineType.f22382l;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KLineType)) {
            return false;
        }
        KLineType kLineType = (KLineType) other;
        return Intrinsics.areEqual(this.type, kLineType.type) && Intrinsics.areEqual(this.name, kLineType.name) && this.period == kLineType.period && this.pageSize == kLineType.pageSize;
    }

    public KLineType(@NotNull String type, @NotNull String name, int i11, int i12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = type;
        this.name = name;
        this.period = i11;
        this.pageSize = i12;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + Integer.hashCode(this.pageSize);
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "KLineType(type=" + this.type + ", name=" + this.name + ", period=" + this.period + ", pageSize=" + this.pageSize + ')';
    }
}

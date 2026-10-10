package com.kubi.operation.api.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareGuideInfo.kt */
/* JADX INFO: loaded from: classes31.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0012BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/operation/api/entity/WelfareGuideInfo;", "", "guideType", "Lcom/kubi/operation/api/entity/WelfareGuideInfo$GuideType;", "subtitle", "", "amount", "rewardTitle", "rewardText", "<init>", "(Lcom/kubi/operation/api/entity/WelfareGuideInfo$GuideType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuideType", "()Lcom/kubi/operation/api/entity/WelfareGuideInfo$GuideType;", "getSubtitle", "()Ljava/lang/String;", "getAmount", "getRewardTitle", "getRewardText", "GuideType", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WelfareGuideInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final GuideType f36583a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f36584b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f36585c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f36586d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f36587e;

    /* JADX INFO: compiled from: WelfareGuideInfo.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/operation/api/entity/WelfareGuideInfo$GuideType;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Kyc", "Deposit", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum GuideType {
        None,
        Kyc,
        Deposit;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f36589c = EnumEntriesKt.enumEntries(m43258a());

        @NotNull
        public static EnumEntries<GuideType> getEntries() {
            return f36589c;
        }
    }

    public WelfareGuideInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public WelfareGuideInfo(@NotNull GuideType guideType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(guideType, "guideType");
        this.f36583a = guideType;
        this.f36584b = str;
        this.f36585c = str2;
        this.f36586d = str3;
        this.f36587e = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final GuideType getF36583a() {
        return this.f36583a;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF36587e() {
        return this.f36587e;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF36586d() {
        return this.f36586d;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF36584b() {
        return this.f36584b;
    }

    public /* synthetic */ WelfareGuideInfo(GuideType guideType, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? GuideType.None : guideType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }
}

package com.kubi.unify.api.entity;

import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: UnifyEnum.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/unify/api/entity/UnifyOrderFillTypeEnum;", "", "utaType", "", "classicType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getUtaType", "()Ljava/lang/String;", "getClassicType", "UTA_NORMAL", "UTA_LIQUID", "UTA_ADL", "UTA_SETTLEMENT", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum UnifyOrderFillTypeEnum {
    UTA_NORMAL(OtcAd.STATUS_NORMAL, "trade"),
    UTA_LIQUID("LIQUID", "liquid"),
    UTA_ADL("ADL", "adl"),
    UTA_SETTLEMENT("SETTLEMENT", "settlement");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53162c = EnumEntriesKt.enumEntries(m65013a());

    @NotNull
    private final String classicType;

    @NotNull
    private final String utaType;

    @NotNull
    public static EnumEntries<UnifyOrderFillTypeEnum> getEntries() {
        return f53162c;
    }

    @NotNull
    public final String getClassicType() {
        return this.classicType;
    }

    @NotNull
    public final String getUtaType() {
        return this.utaType;
    }

    UnifyOrderFillTypeEnum(String str, String str2) {
        this.utaType = str;
        this.classicType = str2;
    }
}

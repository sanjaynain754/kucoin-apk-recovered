package com.kubi.assets.entity;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: LineChartEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/entity/RangeName;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTH", "SIX_MONTH", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum RangeName {
    ONE_DAY("ONE_DAY"),
    ONE_WEEK("ONE_WEEK"),
    ONE_MONTH("ONE_MONTH"),
    THREE_MONTH("THREE_MONTH"),
    SIX_MONTH("SIX_MONTH");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String label;

    @NotNull
    public static EnumEntries<RangeName> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    RangeName(String str) {
        this.label = str;
    }
}

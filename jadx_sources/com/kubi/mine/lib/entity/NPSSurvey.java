package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSSurvey;", "", "id", "", "surveyDesc", "", "surveyName", "surveyThxMsg", "surveyTitle", "surveyType", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSurveyDesc", "()Ljava/lang/String;", "getSurveyName", "getSurveyThxMsg", "getSurveyTitle", "getSurveyType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/mine/lib/entity/NPSSurvey;", "equals", "", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSSurvey {

    @Nullable
    private final Long id;

    @Nullable
    private final String surveyDesc;

    @Nullable
    private final String surveyName;

    @Nullable
    private final String surveyThxMsg;

    @Nullable
    private final String surveyTitle;

    @Nullable
    private final Integer surveyType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSSurvey)) {
            return false;
        }
        NPSSurvey nPSSurvey = (NPSSurvey) other;
        return Intrinsics.areEqual(this.id, nPSSurvey.id) && Intrinsics.areEqual(this.surveyDesc, nPSSurvey.surveyDesc) && Intrinsics.areEqual(this.surveyName, nPSSurvey.surveyName) && Intrinsics.areEqual(this.surveyThxMsg, nPSSurvey.surveyThxMsg) && Intrinsics.areEqual(this.surveyTitle, nPSSurvey.surveyTitle) && Intrinsics.areEqual(this.surveyType, nPSSurvey.surveyType);
    }

    public static /* synthetic */ NPSSurvey copy$default(NPSSurvey nPSSurvey, Long l11, String str, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = nPSSurvey.id;
        }
        if ((i11 & 2) != 0) {
            str = nPSSurvey.surveyDesc;
        }
        if ((i11 & 4) != 0) {
            str2 = nPSSurvey.surveyName;
        }
        if ((i11 & 8) != 0) {
            str3 = nPSSurvey.surveyThxMsg;
        }
        if ((i11 & 16) != 0) {
            str4 = nPSSurvey.surveyTitle;
        }
        if ((i11 & 32) != 0) {
            num = nPSSurvey.surveyType;
        }
        String str5 = str4;
        Integer num2 = num;
        return nPSSurvey.copy(l11, str, str2, str3, str5, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurveyDesc() {
        return this.surveyDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSurveyName() {
        return this.surveyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurveyThxMsg() {
        return this.surveyThxMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurveyTitle() {
        return this.surveyTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSurveyType() {
        return this.surveyType;
    }

    @NotNull
    public final NPSSurvey copy(@Nullable Long id2, @Nullable String surveyDesc, @Nullable String surveyName, @Nullable String surveyThxMsg, @Nullable String surveyTitle, @Nullable Integer surveyType) {
        return new NPSSurvey(id2, surveyDesc, surveyName, surveyThxMsg, surveyTitle, surveyType);
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getSurveyDesc() {
        return this.surveyDesc;
    }

    @Nullable
    public final String getSurveyName() {
        return this.surveyName;
    }

    @Nullable
    public final String getSurveyThxMsg() {
        return this.surveyThxMsg;
    }

    @Nullable
    public final String getSurveyTitle() {
        return this.surveyTitle;
    }

    @Nullable
    public final Integer getSurveyType() {
        return this.surveyType;
    }

    public int hashCode() {
        Long l11 = this.id;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.surveyDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.surveyName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surveyThxMsg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.surveyTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.surveyType;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NPSSurvey(id=" + this.id + ", surveyDesc=" + this.surveyDesc + ", surveyName=" + this.surveyName + ", surveyThxMsg=" + this.surveyThxMsg + ", surveyTitle=" + this.surveyTitle + ", surveyType=" + this.surveyType + ')';
    }

    public NPSSurvey(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.id = l11;
        this.surveyDesc = str;
        this.surveyName = str2;
        this.surveyThxMsg = str3;
        this.surveyTitle = str4;
        this.surveyType = num;
    }
}

package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\\\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSQuestion;", "", "options", "", "Lcom/kubi/mine/lib/entity/NPSOption;", "questionId", "", "sort", "surveyId", "title", "", "type", "", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getOptions", "()Ljava/util/List;", "getQuestionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSort", "getSurveyId", "getTitle", "()Ljava/lang/String;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/mine/lib/entity/NPSQuestion;", "equals", "", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSQuestion {

    @Nullable
    private final List<NPSOption> options;

    @Nullable
    private final Long questionId;

    @Nullable
    private final Long sort;

    @Nullable
    private final Long surveyId;

    @Nullable
    private final String title;

    @Nullable
    private final Integer type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSQuestion)) {
            return false;
        }
        NPSQuestion nPSQuestion = (NPSQuestion) other;
        return Intrinsics.areEqual(this.options, nPSQuestion.options) && Intrinsics.areEqual(this.questionId, nPSQuestion.questionId) && Intrinsics.areEqual(this.sort, nPSQuestion.sort) && Intrinsics.areEqual(this.surveyId, nPSQuestion.surveyId) && Intrinsics.areEqual(this.title, nPSQuestion.title) && Intrinsics.areEqual(this.type, nPSQuestion.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NPSQuestion copy$default(NPSQuestion nPSQuestion, List list, Long l11, Long l12, Long l13, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nPSQuestion.options;
        }
        if ((i11 & 2) != 0) {
            l11 = nPSQuestion.questionId;
        }
        if ((i11 & 4) != 0) {
            l12 = nPSQuestion.sort;
        }
        if ((i11 & 8) != 0) {
            l13 = nPSQuestion.surveyId;
        }
        if ((i11 & 16) != 0) {
            str = nPSQuestion.title;
        }
        if ((i11 & 32) != 0) {
            num = nPSQuestion.type;
        }
        String str2 = str;
        Integer num2 = num;
        return nPSQuestion.copy(list, l11, l12, l13, str2, num2);
    }

    @Nullable
    public final List<NPSOption> component1() {
        return this.options;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getQuestionId() {
        return this.questionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSurveyId() {
        return this.surveyId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final NPSQuestion copy(@Nullable List<NPSOption> options, @Nullable Long questionId, @Nullable Long sort, @Nullable Long surveyId, @Nullable String title, @Nullable Integer type) {
        return new NPSQuestion(options, questionId, sort, surveyId, title, type);
    }

    @Nullable
    public final List<NPSOption> getOptions() {
        return this.options;
    }

    @Nullable
    public final Long getQuestionId() {
        return this.questionId;
    }

    @Nullable
    public final Long getSort() {
        return this.sort;
    }

    @Nullable
    public final Long getSurveyId() {
        return this.surveyId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        List<NPSOption> list = this.options;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l11 = this.questionId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sort;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.surveyId;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NPSQuestion(options=" + this.options + ", questionId=" + this.questionId + ", sort=" + this.sort + ", surveyId=" + this.surveyId + ", title=" + this.title + ", type=" + this.type + ')';
    }

    public NPSQuestion(@Nullable List<NPSOption> list, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str, @Nullable Integer num) {
        this.options = list;
        this.questionId = l11;
        this.sort = l12;
        this.surveyId = l13;
        this.title = str;
        this.type = num;
    }
}

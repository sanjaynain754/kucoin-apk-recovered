package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\\\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSQuestionEntity;", "", "deliverId", "", "collected", "", "deliverNo", "", "exist", "questions", "", "Lcom/kubi/mine/lib/entity/NPSQuestion;", "survey", "Lcom/kubi/mine/lib/entity/NPSSurvey;", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/kubi/mine/lib/entity/NPSSurvey;)V", "getDeliverId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCollected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeliverNo", "()Ljava/lang/String;", "getExist", "getQuestions", "()Ljava/util/List;", "getSurvey", "()Lcom/kubi/mine/lib/entity/NPSSurvey;", "question1", "question2", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/kubi/mine/lib/entity/NPSSurvey;)Lcom/kubi/mine/lib/entity/NPSQuestionEntity;", "equals", "other", "hashCode", "", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSQuestionEntity {

    @Nullable
    private final Boolean collected;

    @Nullable
    private final Long deliverId;

    @Nullable
    private final String deliverNo;

    @Nullable
    private final Boolean exist;

    @Nullable
    private final List<NPSQuestion> questions;

    @Nullable
    private final NPSSurvey survey;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSQuestionEntity)) {
            return false;
        }
        NPSQuestionEntity nPSQuestionEntity = (NPSQuestionEntity) other;
        return Intrinsics.areEqual(this.deliverId, nPSQuestionEntity.deliverId) && Intrinsics.areEqual(this.collected, nPSQuestionEntity.collected) && Intrinsics.areEqual(this.deliverNo, nPSQuestionEntity.deliverNo) && Intrinsics.areEqual(this.exist, nPSQuestionEntity.exist) && Intrinsics.areEqual(this.questions, nPSQuestionEntity.questions) && Intrinsics.areEqual(this.survey, nPSQuestionEntity.survey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NPSQuestionEntity copy$default(NPSQuestionEntity nPSQuestionEntity, Long l11, Boolean bool, String str, Boolean bool2, List list, NPSSurvey nPSSurvey, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = nPSQuestionEntity.deliverId;
        }
        if ((i11 & 2) != 0) {
            bool = nPSQuestionEntity.collected;
        }
        if ((i11 & 4) != 0) {
            str = nPSQuestionEntity.deliverNo;
        }
        if ((i11 & 8) != 0) {
            bool2 = nPSQuestionEntity.exist;
        }
        if ((i11 & 16) != 0) {
            list = nPSQuestionEntity.questions;
        }
        if ((i11 & 32) != 0) {
            nPSSurvey = nPSQuestionEntity.survey;
        }
        List list2 = list;
        NPSSurvey nPSSurvey2 = nPSSurvey;
        return nPSQuestionEntity.copy(l11, bool, str, bool2, list2, nPSSurvey2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getDeliverId() {
        return this.deliverId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCollected() {
        return this.collected;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeliverNo() {
        return this.deliverNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getExist() {
        return this.exist;
    }

    @Nullable
    public final List<NPSQuestion> component5() {
        return this.questions;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NPSSurvey getSurvey() {
        return this.survey;
    }

    @NotNull
    public final NPSQuestionEntity copy(@Nullable Long deliverId, @Nullable Boolean collected, @Nullable String deliverNo, @Nullable Boolean exist, @Nullable List<NPSQuestion> questions, @Nullable NPSSurvey survey) {
        return new NPSQuestionEntity(deliverId, collected, deliverNo, exist, questions, survey);
    }

    @Nullable
    public final Boolean getCollected() {
        return this.collected;
    }

    @Nullable
    public final Long getDeliverId() {
        return this.deliverId;
    }

    @Nullable
    public final String getDeliverNo() {
        return this.deliverNo;
    }

    @Nullable
    public final Boolean getExist() {
        return this.exist;
    }

    @Nullable
    public final List<NPSQuestion> getQuestions() {
        return this.questions;
    }

    @Nullable
    public final NPSSurvey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        Long l11 = this.deliverId;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Boolean bool = this.collected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.deliverNo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.exist;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<NPSQuestion> list = this.questions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        NPSSurvey nPSSurvey = this.survey;
        return iHashCode5 + (nPSSurvey != null ? nPSSurvey.hashCode() : 0);
    }

    @Nullable
    public final NPSQuestion question1() {
        Integer type;
        List<NPSQuestion> list = this.questions;
        NPSQuestion nPSQuestion = list != null ? (NPSQuestion) CollectionsKt.firstOrNull((List) list) : null;
        if (nPSQuestion == null || (type = nPSQuestion.getType()) == null || type.intValue() != 4) {
            return null;
        }
        return nPSQuestion;
    }

    @Nullable
    public final NPSQuestion question2() {
        Integer type;
        List<NPSQuestion> listEmptyList = this.questions;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.size() < 2) {
            return null;
        }
        List<NPSQuestion> list = this.questions;
        NPSQuestion nPSQuestion = list != null ? list.get(1) : null;
        if (nPSQuestion == null || (type = nPSQuestion.getType()) == null || type.intValue() != 3) {
            return null;
        }
        return nPSQuestion;
    }

    @NotNull
    public String toString() {
        return "NPSQuestionEntity(deliverId=" + this.deliverId + ", collected=" + this.collected + ", deliverNo=" + this.deliverNo + ", exist=" + this.exist + ", questions=" + this.questions + ", survey=" + this.survey + ')';
    }

    public NPSQuestionEntity(@Nullable Long l11, @Nullable Boolean bool, @Nullable String str, @Nullable Boolean bool2, @Nullable List<NPSQuestion> list, @Nullable NPSSurvey nPSSurvey) {
        this.deliverId = l11;
        this.collected = bool;
        this.deliverNo = str;
        this.exist = bool2;
        this.questions = list;
        this.survey = nPSSurvey;
    }
}

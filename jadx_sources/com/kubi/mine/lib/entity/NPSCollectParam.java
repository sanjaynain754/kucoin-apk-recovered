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
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJB\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSCollectParam;", "", "answers", "", "Lcom/kubi/mine/lib/entity/NPSParamAnswer;", "deliverId", "", "deliverNo", "", "surveyId", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getAnswers", "()Ljava/util/List;", "getDeliverId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeliverNo", "()Ljava/lang/String;", "getSurveyId", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/mine/lib/entity/NPSCollectParam;", "equals", "", "other", "hashCode", "", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSCollectParam {

    @NotNull
    private final List<NPSParamAnswer> answers;

    @Nullable
    private final Long deliverId;

    @Nullable
    private final String deliverNo;

    @Nullable
    private final Long surveyId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSCollectParam)) {
            return false;
        }
        NPSCollectParam nPSCollectParam = (NPSCollectParam) other;
        return Intrinsics.areEqual(this.answers, nPSCollectParam.answers) && Intrinsics.areEqual(this.deliverId, nPSCollectParam.deliverId) && Intrinsics.areEqual(this.deliverNo, nPSCollectParam.deliverNo) && Intrinsics.areEqual(this.surveyId, nPSCollectParam.surveyId);
    }

    public NPSCollectParam(@NotNull List<NPSParamAnswer> answers, @Nullable Long l11, @Nullable String str, @Nullable Long l12) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.answers = answers;
        this.deliverId = l11;
        this.deliverNo = str;
        this.surveyId = l12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NPSCollectParam copy$default(NPSCollectParam nPSCollectParam, List list, Long l11, String str, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nPSCollectParam.answers;
        }
        if ((i11 & 2) != 0) {
            l11 = nPSCollectParam.deliverId;
        }
        if ((i11 & 4) != 0) {
            str = nPSCollectParam.deliverNo;
        }
        if ((i11 & 8) != 0) {
            l12 = nPSCollectParam.surveyId;
        }
        return nPSCollectParam.copy(list, l11, str, l12);
    }

    @NotNull
    public final List<NPSParamAnswer> component1() {
        return this.answers;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDeliverId() {
        return this.deliverId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeliverNo() {
        return this.deliverNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSurveyId() {
        return this.surveyId;
    }

    @NotNull
    public final NPSCollectParam copy(@NotNull List<NPSParamAnswer> answers, @Nullable Long deliverId, @Nullable String deliverNo, @Nullable Long surveyId) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new NPSCollectParam(answers, deliverId, deliverNo, surveyId);
    }

    @NotNull
    public final List<NPSParamAnswer> getAnswers() {
        return this.answers;
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
    public final Long getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        int iHashCode = this.answers.hashCode() * 31;
        Long l11 = this.deliverId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.deliverNo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.surveyId;
        return iHashCode3 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NPSCollectParam(answers=" + this.answers + ", deliverId=" + this.deliverId + ", deliverNo=" + this.deliverNo + ", surveyId=" + this.surveyId + ')';
    }
}

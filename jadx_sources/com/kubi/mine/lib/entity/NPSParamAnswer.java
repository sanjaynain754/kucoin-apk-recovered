package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSParamAnswer;", "", "optionContent", "", "options", "", "Lcom/kubi/mine/lib/entity/NPSParamOption;", "questionId", "", "type", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;)V", "getOptionContent", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getQuestionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/kubi/mine/lib/entity/NPSParamAnswer;", "equals", "", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSParamAnswer {

    @Nullable
    private final String optionContent;

    @Nullable
    private final List<NPSParamOption> options;

    @Nullable
    private final Long questionId;

    @Nullable
    private final Integer type;

    public NPSParamAnswer(@Nullable String str, @Nullable List<NPSParamOption> list, @Nullable Long l11, @Nullable Integer num) {
        this.optionContent = str;
        this.options = list;
        this.questionId = l11;
        this.type = num;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSParamAnswer)) {
            return false;
        }
        NPSParamAnswer nPSParamAnswer = (NPSParamAnswer) other;
        return Intrinsics.areEqual(this.optionContent, nPSParamAnswer.optionContent) && Intrinsics.areEqual(this.options, nPSParamAnswer.options) && Intrinsics.areEqual(this.questionId, nPSParamAnswer.questionId) && Intrinsics.areEqual(this.type, nPSParamAnswer.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NPSParamAnswer copy$default(NPSParamAnswer nPSParamAnswer, String str, List list, Long l11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nPSParamAnswer.optionContent;
        }
        if ((i11 & 2) != 0) {
            list = nPSParamAnswer.options;
        }
        if ((i11 & 4) != 0) {
            l11 = nPSParamAnswer.questionId;
        }
        if ((i11 & 8) != 0) {
            num = nPSParamAnswer.type;
        }
        return nPSParamAnswer.copy(str, list, l11, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOptionContent() {
        return this.optionContent;
    }

    @Nullable
    public final List<NPSParamOption> component2() {
        return this.options;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getQuestionId() {
        return this.questionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final NPSParamAnswer copy(@Nullable String optionContent, @Nullable List<NPSParamOption> options, @Nullable Long questionId, @Nullable Integer type) {
        return new NPSParamAnswer(optionContent, options, questionId, type);
    }

    @Nullable
    public final String getOptionContent() {
        return this.optionContent;
    }

    @Nullable
    public final List<NPSParamOption> getOptions() {
        return this.options;
    }

    @Nullable
    public final Long getQuestionId() {
        return this.questionId;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.optionContent;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NPSParamOption> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.questionId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NPSParamAnswer(optionContent=" + this.optionContent + ", options=" + this.options + ", questionId=" + this.questionId + ", type=" + this.type + ')';
    }

    public /* synthetic */ NPSParamAnswer(String str, List list, Long l11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, l11, num);
    }
}

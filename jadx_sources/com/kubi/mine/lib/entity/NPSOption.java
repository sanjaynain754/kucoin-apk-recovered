package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJJ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSOption;", "", "followTextInput", "", "nextQuestion", "", "optionName", "", "questionId", "sort", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getFollowTextInput", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextQuestion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOptionName", "()Ljava/lang/String;", "getQuestionId", "getSort", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/kubi/mine/lib/entity/NPSOption;", "equals", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSOption {

    @Nullable
    private final Integer followTextInput;

    @Nullable
    private final Long nextQuestion;

    @Nullable
    private final String optionName;

    @Nullable
    private final Long questionId;
    private boolean selected;

    @Nullable
    private final Integer sort;

    public NPSOption(@Nullable Integer num, @Nullable Long l11, @Nullable String str, @Nullable Long l12, @Nullable Integer num2) {
        this.followTextInput = num;
        this.nextQuestion = l11;
        this.optionName = str;
        this.questionId = l12;
        this.sort = num2;
    }

    public static /* synthetic */ NPSOption copy$default(NPSOption nPSOption, Integer num, Long l11, String str, Long l12, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = nPSOption.followTextInput;
        }
        if ((i11 & 2) != 0) {
            l11 = nPSOption.nextQuestion;
        }
        if ((i11 & 4) != 0) {
            str = nPSOption.optionName;
        }
        if ((i11 & 8) != 0) {
            l12 = nPSOption.questionId;
        }
        if ((i11 & 16) != 0) {
            num2 = nPSOption.sort;
        }
        Integer num3 = num2;
        String str2 = str;
        return nPSOption.copy(num, l11, str2, l12, num3);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSOption)) {
            return false;
        }
        NPSOption nPSOption = (NPSOption) other;
        return Intrinsics.areEqual(this.followTextInput, nPSOption.followTextInput) && Intrinsics.areEqual(this.nextQuestion, nPSOption.nextQuestion) && Intrinsics.areEqual(this.optionName, nPSOption.optionName) && Intrinsics.areEqual(this.questionId, nPSOption.questionId) && Intrinsics.areEqual(this.sort, nPSOption.sort);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFollowTextInput() {
        return this.followTextInput;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getNextQuestion() {
        return this.nextQuestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOptionName() {
        return this.optionName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getQuestionId() {
        return this.questionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @NotNull
    public final NPSOption copy(@Nullable Integer followTextInput, @Nullable Long nextQuestion, @Nullable String optionName, @Nullable Long questionId, @Nullable Integer sort) {
        return new NPSOption(followTextInput, nextQuestion, optionName, questionId, sort);
    }

    @Nullable
    public final Integer getFollowTextInput() {
        return this.followTextInput;
    }

    @Nullable
    public final Long getNextQuestion() {
        return this.nextQuestion;
    }

    @Nullable
    public final String getOptionName() {
        return this.optionName;
    }

    @Nullable
    public final Long getQuestionId() {
        return this.questionId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    public int hashCode() {
        Integer num = this.followTextInput;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.nextQuestion;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.optionName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.questionId;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num2 = this.sort;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setSelected(boolean z11) {
        this.selected = z11;
    }

    @NotNull
    public String toString() {
        return "NPSOption(followTextInput=" + this.followTextInput + ", nextQuestion=" + this.nextQuestion + ", optionName=" + this.optionName + ", questionId=" + this.questionId + ", sort=" + this.sort + ')';
    }

    public /* synthetic */ NPSOption(Integer num, Long l11, String str, Long l12, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : l12, num2);
    }
}

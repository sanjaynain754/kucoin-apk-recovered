package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010%\u001a\u00020\u0005HÆ\u0003J.\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"¨\u0006-"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "", "text", "", "textIcon", "", "index", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "getText", "()Ljava/lang/String;", "getTextIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIndex", "()I", "message", "", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "marqueeType", "getMarqueeType", "setMarqueeType", "(I)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;I)Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceGemBoxTextItem {
    private long endTime;
    private final int index;
    private int marqueeType;

    @NotNull
    private CharSequence message;
    private long startTime;

    @NotNull
    private final String text;

    @Nullable
    private final Integer textIcon;

    public ChanceGemBoxTextItem() {
        this(null, null, 0, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceGemBoxTextItem)) {
            return false;
        }
        ChanceGemBoxTextItem chanceGemBoxTextItem = (ChanceGemBoxTextItem) other;
        return Intrinsics.areEqual(this.text, chanceGemBoxTextItem.text) && Intrinsics.areEqual(this.textIcon, chanceGemBoxTextItem.textIcon) && this.index == chanceGemBoxTextItem.index;
    }

    public ChanceGemBoxTextItem(@NotNull String text, @Nullable Integer num, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textIcon = num;
        this.index = i11;
        this.message = "";
        this.marqueeType = 1;
    }

    public static /* synthetic */ ChanceGemBoxTextItem copy$default(ChanceGemBoxTextItem chanceGemBoxTextItem, String str, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = chanceGemBoxTextItem.text;
        }
        if ((i12 & 2) != 0) {
            num = chanceGemBoxTextItem.textIcon;
        }
        if ((i12 & 4) != 0) {
            i11 = chanceGemBoxTextItem.index;
        }
        return chanceGemBoxTextItem.copy(str, num, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTextIcon() {
        return this.textIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ChanceGemBoxTextItem copy(@NotNull String text, @Nullable Integer textIcon, int index) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChanceGemBoxTextItem(text, textIcon, index);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMarqueeType() {
        return this.marqueeType;
    }

    @NotNull
    public final CharSequence getMessage() {
        return this.message;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTextIcon() {
        return this.textIcon;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.textIcon;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.index);
    }

    public final void setEndTime(long j11) {
        this.endTime = j11;
    }

    public final void setMarqueeType(int i11) {
        this.marqueeType = i11;
    }

    public final void setMessage(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.message = charSequence;
    }

    public final void setStartTime(long j11) {
        this.startTime = j11;
    }

    @NotNull
    public String toString() {
        return "ChanceGemBoxTextItem(text=" + this.text + ", textIcon=" + this.textIcon + ", index=" + this.index + ')';
    }

    public /* synthetic */ ChanceGemBoxTextItem(String str, Integer num, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? 0 : i11);
    }
}

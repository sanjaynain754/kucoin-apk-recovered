package com.kubi.tradingbotkit.business.strategyList;

import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.o, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: StrategyListFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/TagItem;", "", "tagName", "", "type", "", "tagTextView", "Landroid/widget/TextView;", "num", "<init>", "(Ljava/lang/String;ILandroid/widget/TextView;I)V", "getTagName", "()Ljava/lang/String;", "getType", "()I", "getTagTextView", "()Landroid/widget/TextView;", "setTagTextView", "(Landroid/widget/TextView;)V", "getNum", "setNum", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TagItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String tagName;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int type;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public TextView tagTextView;

    /* JADX INFO: renamed from: d, reason: from toString */
    public int num;

    public TagItem(@NotNull String tagName, int i11, @Nullable TextView textView, int i12) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        this.tagName = tagName;
        this.type = i11;
        this.tagTextView = textView;
        this.num = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagItem)) {
            return false;
        }
        TagItem tagItem = (TagItem) other;
        return Intrinsics.areEqual(this.tagName, tagItem.tagName) && this.type == tagItem.type && Intrinsics.areEqual(this.tagTextView, tagItem.tagTextView) && this.num == tagItem.num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextView getTagTextView() {
        return this.tagTextView;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e */
    public final void m64134e(int i11) {
        this.num = i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m64135f(@Nullable TextView textView) {
        this.tagTextView = textView;
    }

    public int hashCode() {
        int iHashCode = ((this.tagName.hashCode() * 31) + Integer.hashCode(this.type)) * 31;
        TextView textView = this.tagTextView;
        return ((iHashCode + (textView == null ? 0 : textView.hashCode())) * 31) + Integer.hashCode(this.num);
    }

    @NotNull
    public String toString() {
        return "TagItem(tagName=" + this.tagName + ", type=" + this.type + ", tagTextView=" + this.tagTextView + ", num=" + this.num + ')';
    }

    public /* synthetic */ TagItem(String str, int i11, TextView textView, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i13 & 4) != 0 ? null : textView, (i13 & 8) != 0 ? 0 : i12);
    }
}

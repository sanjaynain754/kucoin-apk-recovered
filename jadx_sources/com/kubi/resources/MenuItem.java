package com.kubi.resources;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.p, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: KuPopupView.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J#\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010,\u001a\u00020\rHÆ\u0003Jf\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R4\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00063"}, m90084d2 = {"Lcom/kubi/resources/MenuItem;", "", "id", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "text", "", "clickAction", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "tint", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "", "<init>", "(IILjava/lang/String;Lio/reactivex/functions/BiConsumer;Ljava/lang/Integer;Z)V", "getId", "()I", "setId", "(I)V", "getIcon", "setIcon", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getClickAction", "()Lio/reactivex/functions/BiConsumer;", "setClickAction", "(Lio/reactivex/functions/BiConsumer;)V", "getTint", "()Ljava/lang/Integer;", "setTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDot", "()Z", "setDot", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IILjava/lang/String;Lio/reactivex/functions/BiConsumer;Ljava/lang/Integer;Z)Lcom/kubi/resources/MenuItem;", "equals", "other", "hashCode", "toString", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MenuItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    public int id;

    /* JADX INFO: renamed from: b, reason: from toString */
    public int icon;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public String text;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public BiConsumer<Integer, BaseQuickAdapter<MenuItem, BaseViewHolder>> clickAction;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public Integer tint;

    /* JADX INFO: renamed from: f, reason: from toString */
    public boolean dot;

    public MenuItem(int i11, int i12, @NotNull String text, @Nullable BiConsumer<Integer, BaseQuickAdapter<MenuItem, BaseViewHolder>> biConsumer, @Nullable Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.icon = i12;
        this.text = text;
        this.clickAction = biConsumer;
        this.tint = num;
        this.dot = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) other;
        return this.id == menuItem.id && this.icon == menuItem.icon && Intrinsics.areEqual(this.text, menuItem.text) && Intrinsics.areEqual(this.clickAction, menuItem.clickAction) && Intrinsics.areEqual(this.tint, menuItem.tint) && this.dot == menuItem.dot;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final BiConsumer<Integer, BaseQuickAdapter<MenuItem, BaseViewHolder>> m54357a() {
        return this.clickAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDot() {
        return this.dot;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTint() {
        return this.tint;
    }

    /* JADX INFO: renamed from: g */
    public final void m54363g(boolean z11) {
        this.dot = z11;
    }

    /* JADX INFO: renamed from: h */
    public final void m54364h(int i11) {
        this.icon = i11;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.icon)) * 31) + this.text.hashCode()) * 31;
        BiConsumer<Integer, BaseQuickAdapter<MenuItem, BaseViewHolder>> biConsumer = this.clickAction;
        int iHashCode2 = (iHashCode + (biConsumer == null ? 0 : biConsumer.hashCode())) * 31;
        Integer num = this.tint;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.dot);
    }

    /* JADX INFO: renamed from: i */
    public final void m54365i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m54366j(@Nullable Integer num) {
        this.tint = num;
    }

    @NotNull
    public String toString() {
        return "MenuItem(id=" + this.id + ", icon=" + this.icon + ", text=" + this.text + ", clickAction=" + this.clickAction + ", tint=" + this.tint + ", dot=" + this.dot + ')';
    }

    public /* synthetic */ MenuItem(int i11, int i12, String str, BiConsumer biConsumer, Integer num, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, str, (i13 & 8) != 0 ? null : biConsumer, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? false : z11);
    }
}

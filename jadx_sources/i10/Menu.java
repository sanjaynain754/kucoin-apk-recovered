package i10;

import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.GravityCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.R$color;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i10.a, reason: from toString */
/* JADX INFO: compiled from: TitleBar.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, m90084d2 = {"Lcom/kubi/sdk/widget/Menu;", "", "id", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "tint", "direction", "text", "textColor", "textSize", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "drawablePadding", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;IILandroid/view/View$OnClickListener;I)V", "getId", "()I", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTint", "getDirection", "getText", "getTextColor", "getTextSize", "getListener", "()Landroid/view/View$OnClickListener;", "getDrawablePadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;IILandroid/view/View$OnClickListener;I)Lcom/kubi/sdk/widget/Menu;", "equals", "", "other", "hashCode", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Menu {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int id;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Integer icon;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Integer tint;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int direction;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Integer text;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int textColor;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final int textSize;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final View.OnClickListener listener;

    /* JADX INFO: renamed from: i, reason: from toString */
    public final int drawablePadding;

    public Menu() {
        this(0, null, null, 0, null, 0, 0, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) other;
        return this.id == menu.id && Intrinsics.areEqual(this.icon, menu.icon) && Intrinsics.areEqual(this.tint, menu.tint) && this.direction == menu.direction && Intrinsics.areEqual(this.text, menu.text) && this.textColor == menu.textColor && this.textSize == menu.textSize && Intrinsics.areEqual(this.listener, menu.listener) && this.drawablePadding == menu.drawablePadding;
    }

    public Menu(int i11, @DrawableRes @Nullable Integer num, @ColorRes @Nullable Integer num2, int i12, @StringRes @Nullable Integer num3, @ColorRes int i13, int i14, @Nullable View.OnClickListener onClickListener, int i15) {
        this.id = i11;
        this.icon = num;
        this.tint = num2;
        this.direction = i12;
        this.text = num3;
        this.textColor = i13;
        this.textSize = i14;
        this.listener = onClickListener;
        this.drawablePadding = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDrawablePadding() {
        return this.drawablePadding;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTextSize() {
        return this.textSize;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tint;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.direction)) * 31;
        Integer num3 = this.text;
        int iHashCode4 = (((((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.textSize)) * 31;
        View.OnClickListener onClickListener = this.listener;
        return ((iHashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + Integer.hashCode(this.drawablePadding);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getTint() {
        return this.tint;
    }

    @NotNull
    public String toString() {
        return "Menu(id=" + this.id + ", icon=" + this.icon + ", tint=" + this.tint + ", direction=" + this.direction + ", text=" + this.text + ", textColor=" + this.textColor + ", textSize=" + this.textSize + ", listener=" + this.listener + ", drawablePadding=" + this.drawablePadding + ')';
    }

    public /* synthetic */ Menu(int i11, Integer num, Integer num2, int i12, Integer num3, int i13, int i14, View.OnClickListener onClickListener, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? View.generateViewId() : i11, (i16 & 2) != 0 ? null : num, (i16 & 4) != 0 ? null : num2, (i16 & 8) != 0 ? GravityCompat.START : i12, (i16 & 16) != 0 ? null : num3, (i16 & 32) != 0 ? R$color.c_text : i13, (i16 & 64) != 0 ? 18 : i14, (i16 & 128) != 0 ? null : onClickListener, (i16 & 256) != 0 ? 0 : i15);
    }
}

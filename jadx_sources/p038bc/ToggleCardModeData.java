package p038bc;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bc.b, reason: from toString */
/* JADX INFO: compiled from: ToggleCardModeData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u001b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JX\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardModeData;", ExifInterface.GPS_DIRECTION_TRUE, "", "title", "", "desc", "data", "isSelected", "", "onSelectedCallback", "Lkotlin/Function2;", "", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Object;ZLkotlin/jvm/functions/Function2;)V", "getTitle", "()Ljava/lang/CharSequence;", "getDesc", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "()Z", "setSelected", "(Z)V", "getOnSelectedCallback", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Object;ZLkotlin/jvm/functions/Function2;)Lcom/kubi/component/dialog/ToggleCardModeData;", "equals", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ToggleCardModeData<T> {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final CharSequence title;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final CharSequence desc;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final T data;

    /* JADX INFO: renamed from: d, reason: from toString */
    public boolean isSelected;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final Function2<T, Boolean, Unit> onSelectedCallback;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleCardModeData)) {
            return false;
        }
        ToggleCardModeData toggleCardModeData = (ToggleCardModeData) other;
        return Intrinsics.areEqual(this.title, toggleCardModeData.title) && Intrinsics.areEqual(this.desc, toggleCardModeData.desc) && Intrinsics.areEqual(this.data, toggleCardModeData.data) && this.isSelected == toggleCardModeData.isSelected && Intrinsics.areEqual(this.onSelectedCallback, toggleCardModeData.onSelectedCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleCardModeData(@NotNull CharSequence title, @NotNull CharSequence desc, T t11, boolean z11, @NotNull Function2<? super T, ? super Boolean, Unit> onSelectedCallback) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(onSelectedCallback, "onSelectedCallback");
        this.title = title;
        this.desc = desc;
        this.data = t11;
        this.isSelected = z11;
        this.onSelectedCallback = onSelectedCallback;
    }

    /* JADX INFO: renamed from: a */
    public final T m4428a() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CharSequence getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function2<T, Boolean, Unit> m4430c() {
        return this.onSelectedCallback;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: f */
    public final void m4433f(boolean z11) {
        this.isSelected = z11;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.desc.hashCode()) * 31;
        T t11 = this.data;
        return ((((iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.onSelectedCallback.hashCode();
    }

    @NotNull
    public String toString() {
        return "ToggleCardModeData(title=" + ((Object) this.title) + ", desc=" + ((Object) this.desc) + ", data=" + this.data + ", isSelected=" + this.isSelected + ", onSelectedCallback=" + this.onSelectedCallback + ')';
    }
}

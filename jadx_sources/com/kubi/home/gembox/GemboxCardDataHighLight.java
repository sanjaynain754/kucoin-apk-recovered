package com.kubi.home.gembox;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GemboxCardData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006("}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardDataHighLight;", "Landroid/os/Parcelable;", "title", "", "type", TUIConstants.TUIChat.INPUT_MORE_ICON, "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "tradeDirection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getType", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "getTradeDirection", "param", "getParam", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/home/gembox/GemboxCardDataHighLight;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GemboxCardDataHighLight implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GemboxCardDataHighLight> CREATOR = new C14567a();

    @Nullable
    private final String description;

    @Nullable
    private final Integer icon;

    @Nullable
    private final String param;

    @Nullable
    private final String title;

    @Nullable
    private final String tradeDirection;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCardDataHighLight$a */
    /* JADX INFO: compiled from: GemboxCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14567a implements Parcelable.Creator<GemboxCardDataHighLight> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GemboxCardDataHighLight createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GemboxCardDataHighLight(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GemboxCardDataHighLight[] newArray(int i11) {
            return new GemboxCardDataHighLight[i11];
        }
    }

    public GemboxCardDataHighLight() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GemboxCardDataHighLight)) {
            return false;
        }
        GemboxCardDataHighLight gemboxCardDataHighLight = (GemboxCardDataHighLight) other;
        return Intrinsics.areEqual(this.title, gemboxCardDataHighLight.title) && Intrinsics.areEqual(this.type, gemboxCardDataHighLight.type) && Intrinsics.areEqual(this.icon, gemboxCardDataHighLight.icon) && Intrinsics.areEqual(this.description, gemboxCardDataHighLight.description) && Intrinsics.areEqual(this.tradeDirection, gemboxCardDataHighLight.tradeDirection);
    }

    public GemboxCardDataHighLight(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4) {
        this.title = str;
        this.type = str2;
        this.icon = num;
        this.description = str3;
        this.tradeDirection = str4;
    }

    public static /* synthetic */ GemboxCardDataHighLight copy$default(GemboxCardDataHighLight gemboxCardDataHighLight, String str, String str2, Integer num, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gemboxCardDataHighLight.title;
        }
        if ((i11 & 2) != 0) {
            str2 = gemboxCardDataHighLight.type;
        }
        if ((i11 & 4) != 0) {
            num = gemboxCardDataHighLight.icon;
        }
        if ((i11 & 8) != 0) {
            str3 = gemboxCardDataHighLight.description;
        }
        if ((i11 & 16) != 0) {
            str4 = gemboxCardDataHighLight.tradeDirection;
        }
        String str5 = str4;
        Integer num2 = num;
        return gemboxCardDataHighLight.copy(str, str2, num2, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeDirection() {
        return this.tradeDirection;
    }

    @NotNull
    public final GemboxCardDataHighLight copy(@Nullable String title, @Nullable String type, @Nullable Integer icon, @Nullable String description, @Nullable String tradeDirection) {
        return new GemboxCardDataHighLight(title, type, icon, description, tradeDirection);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTradeDirection() {
        return this.tradeDirection;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.icon;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tradeDirection;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GemboxCardDataHighLight(title=" + this.title + ", type=" + this.type + ", icon=" + this.icon + ", description=" + this.description + ", tradeDirection=" + this.tradeDirection + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.type);
        Integer num = this.icon;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.description);
        dest.writeString(this.tradeDirection);
    }

    public /* synthetic */ GemboxCardDataHighLight(String str, String str2, Integer num, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? "" : str4);
    }
}

package com.kubi.payment.third.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdKyc.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jt\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00062"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "Landroid/os/Parcelable;", "name", "", "type", "request", "", "optionalSelections", "", "hint", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "fieldName", "elseMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getRequest", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOptionalSelections", "()Ljava/util/List;", "getHint", "getDescription", "getFieldName", "getElseMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdKycItem implements Parcelable {

    @NotNull
    public static final String TYPE_DATE_SELECTION = "TYPE_DATE_SELECTION";

    @NotNull
    public static final String TYPE_PICTURE_DATA = "TYPE_PICTURE_DATA";

    @NotNull
    public static final String TYPE_STRING_INPUT = "TYPE_STRING_INPUT";

    @NotNull
    public static final String TYPE_STRING_SELECTION = "TYPE_STRING_SELECTION";

    @Nullable
    private final String description;

    @Nullable
    private final String elseMessage;

    @Nullable
    private final String fieldName;

    @Nullable
    private final String hint;

    @Nullable
    private final String name;

    @Nullable
    private final List<String> optionalSelections;

    @Nullable
    private final Boolean request;

    @Nullable
    private final String type;

    @NotNull
    public static final Parcelable.Creator<ThirdKycItem> CREATOR = new C21389a();

    /* JADX INFO: renamed from: com.kubi.payment.third.data.entities.ThirdKycItem$a */
    /* JADX INFO: compiled from: ThirdKyc.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21389a implements Parcelable.Creator<ThirdKycItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThirdKycItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ThirdKycItem(string, string2, boolValueOf, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThirdKycItem[] newArray(int i11) {
            return new ThirdKycItem[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdKycItem)) {
            return false;
        }
        ThirdKycItem thirdKycItem = (ThirdKycItem) other;
        return Intrinsics.areEqual(this.name, thirdKycItem.name) && Intrinsics.areEqual(this.type, thirdKycItem.type) && Intrinsics.areEqual(this.request, thirdKycItem.request) && Intrinsics.areEqual(this.optionalSelections, thirdKycItem.optionalSelections) && Intrinsics.areEqual(this.hint, thirdKycItem.hint) && Intrinsics.areEqual(this.description, thirdKycItem.description) && Intrinsics.areEqual(this.fieldName, thirdKycItem.fieldName) && Intrinsics.areEqual(this.elseMessage, thirdKycItem.elseMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdKycItem copy$default(ThirdKycItem thirdKycItem, String str, String str2, Boolean bool, List list, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdKycItem.name;
        }
        if ((i11 & 2) != 0) {
            str2 = thirdKycItem.type;
        }
        if ((i11 & 4) != 0) {
            bool = thirdKycItem.request;
        }
        if ((i11 & 8) != 0) {
            list = thirdKycItem.optionalSelections;
        }
        if ((i11 & 16) != 0) {
            str3 = thirdKycItem.hint;
        }
        if ((i11 & 32) != 0) {
            str4 = thirdKycItem.description;
        }
        if ((i11 & 64) != 0) {
            str5 = thirdKycItem.fieldName;
        }
        if ((i11 & 128) != 0) {
            str6 = thirdKycItem.elseMessage;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return thirdKycItem.copy(str, str2, bool, list, str9, str10, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getRequest() {
        return this.request;
    }

    @Nullable
    public final List<String> component4() {
        return this.optionalSelections;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getElseMessage() {
        return this.elseMessage;
    }

    @NotNull
    public final ThirdKycItem copy(@Nullable String name, @Nullable String type, @Nullable Boolean request, @Nullable List<String> optionalSelections, @Nullable String hint, @Nullable String description, @Nullable String fieldName, @Nullable String elseMessage) {
        return new ThirdKycItem(name, type, request, optionalSelections, hint, description, fieldName, elseMessage);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getElseMessage() {
        return this.elseMessage;
    }

    @Nullable
    public final String getFieldName() {
        return this.fieldName;
    }

    @Nullable
    public final String getHint() {
        return this.hint;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> getOptionalSelections() {
        return this.optionalSelections;
    }

    @Nullable
    public final Boolean getRequest() {
        return this.request;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.request;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.optionalSelections;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fieldName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.elseMessage;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThirdKycItem(name=" + this.name + ", type=" + this.type + ", request=" + this.request + ", optionalSelections=" + this.optionalSelections + ", hint=" + this.hint + ", description=" + this.description + ", fieldName=" + this.fieldName + ", elseMessage=" + this.elseMessage + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.type);
        Boolean bool = this.request;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeStringList(this.optionalSelections);
        dest.writeString(this.hint);
        dest.writeString(this.description);
        dest.writeString(this.fieldName);
        dest.writeString(this.elseMessage);
    }

    public ThirdKycItem(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.name = str;
        this.type = str2;
        this.request = bool;
        this.optionalSelections = list;
        this.hint = str3;
        this.description = str4;
        this.fieldName = str5;
        this.elseMessage = str6;
    }
}

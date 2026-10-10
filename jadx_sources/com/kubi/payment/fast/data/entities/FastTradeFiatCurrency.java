package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastTradeFiatCurrency.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeFiatCurrency {

    /* JADX INFO: compiled from: FastTradeFiatCurrency.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;", "", "type", "", "tradeType", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getTradeType", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final List<String> tradeType;

        @Nullable
        private final String type;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.type, request.type) && Intrinsics.areEqual(this.tradeType, request.tradeType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.type;
            }
            if ((i11 & 2) != 0) {
                list = request.tradeType;
            }
            return request.copy(str, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final List<String> component2() {
            return this.tradeType;
        }

        @NotNull
        public final Request copy(@Nullable String type, @Nullable List<String> tradeType) {
            return new Request(type, tradeType);
        }

        @Nullable
        public final List<String> getTradeType() {
            return this.tradeType;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.tradeType;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(type=" + this.type + ", tradeType=" + this.tradeType + ')';
        }

        public Request(@Nullable String str, @Nullable List<String> list) {
            this.type = str;
            this.tradeType = list;
        }
    }

    /* JADX INFO: compiled from: FastTradeFiatCurrency.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Landroid/os/Parcelable;", "iconUrl", "", "title", "subTitle", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getIconUrl", "()Ljava/lang/String;", "getTitle", "getSubTitle", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Response> CREATOR = new C20502a();

        @SerializedName(TUIConstants.TUIChat.INPUT_MORE_ICON)
        @Nullable
        private final String iconUrl;
        private transient boolean isSelected;

        @SerializedName("name")
        @Nullable
        private final String subTitle;

        @SerializedName("code")
        @Nullable
        private final String title;

        /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.FastTradeFiatCurrency$Response$a */
        /* JADX INFO: compiled from: FastTradeFiatCurrency.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C20502a implements Parcelable.Creator<Response> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Response createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Response(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Response[] newArray(int i11) {
                return new Response[i11];
            }
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
            this.iconUrl = str;
            this.title = str2;
            this.subTitle = str3;
            this.isSelected = z11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.iconUrl, response.iconUrl) && Intrinsics.areEqual(this.title, response.title) && Intrinsics.areEqual(this.subTitle, response.subTitle) && this.isSelected == response.isSelected;
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.iconUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = response.title;
            }
            if ((i11 & 4) != 0) {
                str3 = response.subTitle;
            }
            if ((i11 & 8) != 0) {
                z11 = response.isSelected;
            }
            return response.copy(str, str2, str3, z11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final Response copy(@Nullable String iconUrl, @Nullable String title, @Nullable String subTitle, boolean isSelected) {
            return new Response(iconUrl, title, subTitle, isSelected);
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subTitle;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            return "Response(iconUrl=" + this.iconUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", isSelected=" + this.isSelected + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.iconUrl);
            dest.writeString(this.title);
            dest.writeString(this.subTitle);
            dest.writeInt(this.isSelected ? 1 : 0);
        }

        public /* synthetic */ Response(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? false : z11);
        }
    }
}

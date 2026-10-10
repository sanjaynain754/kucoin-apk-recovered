package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "Landroid/os/Parcelable;", "title", "", "content", "buttonAgree", "buttonRefuse", "buttonAgreeAppUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getButtonAgree", "getButtonRefuse", "getButtonAgreeAppUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareTrialWithDrawPopupInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareTrialWithDrawPopupInfoEntity> CREATOR = new C15808a();

    @Nullable
    private final String buttonAgree;

    @Nullable
    private final String buttonAgreeAppUrl;

    @Nullable
    private final String buttonRefuse;

    @Nullable
    private final String content;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15808a implements Parcelable.Creator<FuturesWelfareTrialWithDrawPopupInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialWithDrawPopupInfoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesWelfareTrialWithDrawPopupInfoEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialWithDrawPopupInfoEntity[] newArray(int i11) {
            return new FuturesWelfareTrialWithDrawPopupInfoEntity[i11];
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
        if (!(other instanceof FuturesWelfareTrialWithDrawPopupInfoEntity)) {
            return false;
        }
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntity = (FuturesWelfareTrialWithDrawPopupInfoEntity) other;
        return Intrinsics.areEqual(this.title, futuresWelfareTrialWithDrawPopupInfoEntity.title) && Intrinsics.areEqual(this.content, futuresWelfareTrialWithDrawPopupInfoEntity.content) && Intrinsics.areEqual(this.buttonAgree, futuresWelfareTrialWithDrawPopupInfoEntity.buttonAgree) && Intrinsics.areEqual(this.buttonRefuse, futuresWelfareTrialWithDrawPopupInfoEntity.buttonRefuse) && Intrinsics.areEqual(this.buttonAgreeAppUrl, futuresWelfareTrialWithDrawPopupInfoEntity.buttonAgreeAppUrl);
    }

    public static /* synthetic */ FuturesWelfareTrialWithDrawPopupInfoEntity copy$default(FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntity, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresWelfareTrialWithDrawPopupInfoEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = futuresWelfareTrialWithDrawPopupInfoEntity.content;
        }
        if ((i11 & 4) != 0) {
            str3 = futuresWelfareTrialWithDrawPopupInfoEntity.buttonAgree;
        }
        if ((i11 & 8) != 0) {
            str4 = futuresWelfareTrialWithDrawPopupInfoEntity.buttonRefuse;
        }
        if ((i11 & 16) != 0) {
            str5 = futuresWelfareTrialWithDrawPopupInfoEntity.buttonAgreeAppUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return futuresWelfareTrialWithDrawPopupInfoEntity.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonAgree() {
        return this.buttonAgree;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonRefuse() {
        return this.buttonRefuse;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonAgreeAppUrl() {
        return this.buttonAgreeAppUrl;
    }

    @NotNull
    public final FuturesWelfareTrialWithDrawPopupInfoEntity copy(@Nullable String title, @Nullable String content, @Nullable String buttonAgree, @Nullable String buttonRefuse, @Nullable String buttonAgreeAppUrl) {
        return new FuturesWelfareTrialWithDrawPopupInfoEntity(title, content, buttonAgree, buttonRefuse, buttonAgreeAppUrl);
    }

    @Nullable
    public final String getButtonAgree() {
        return this.buttonAgree;
    }

    @Nullable
    public final String getButtonAgreeAppUrl() {
        return this.buttonAgreeAppUrl;
    }

    @Nullable
    public final String getButtonRefuse() {
        return this.buttonRefuse;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonAgree;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonRefuse;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonAgreeAppUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareTrialWithDrawPopupInfoEntity(title=" + this.title + ", content=" + this.content + ", buttonAgree=" + this.buttonAgree + ", buttonRefuse=" + this.buttonRefuse + ", buttonAgreeAppUrl=" + this.buttonAgreeAppUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.buttonAgree);
        dest.writeString(this.buttonRefuse);
        dest.writeString(this.buttonAgreeAppUrl);
    }

    public FuturesWelfareTrialWithDrawPopupInfoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.content = str2;
        this.buttonAgree = str3;
        this.buttonRefuse = str4;
        this.buttonAgreeAppUrl = str5;
    }
}

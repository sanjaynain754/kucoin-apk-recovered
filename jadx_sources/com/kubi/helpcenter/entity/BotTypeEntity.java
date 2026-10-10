package com.kubi.helpcenter.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BotTypeEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/helpcenter/entity/BotTypeEntity;", "Landroid/os/Parcelable;", "type", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BotTypeEntity implements Parcelable {

    @NotNull
    public static final String ADA_BOT_H5 = "ADA_BOT_H5";

    @NotNull
    public static final String ADA_BOT_SDK = "ADA_BOT_SDK";

    @NotNull
    public static final String KC_BOT = "KC_BOT";

    @NotNull
    public static final String ZENDESK_SDK = "ZENDESK_SDK";

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    @NotNull
    public static final Parcelable.Creator<BotTypeEntity> CREATOR = new C14478a();

    /* JADX INFO: renamed from: com.kubi.helpcenter.entity.BotTypeEntity$a */
    /* JADX INFO: compiled from: BotTypeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14478a implements Parcelable.Creator<BotTypeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BotTypeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BotTypeEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BotTypeEntity[] newArray(int i11) {
            return new BotTypeEntity[i11];
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
        if (!(other instanceof BotTypeEntity)) {
            return false;
        }
        BotTypeEntity botTypeEntity = (BotTypeEntity) other;
        return Intrinsics.areEqual(this.type, botTypeEntity.type) && Intrinsics.areEqual(this.url, botTypeEntity.url);
    }

    public BotTypeEntity(@NotNull String type, @NotNull String url) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        this.type = type;
        this.url = url;
    }

    public static /* synthetic */ BotTypeEntity copy$default(BotTypeEntity botTypeEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = botTypeEntity.type;
        }
        if ((i11 & 2) != 0) {
            str2 = botTypeEntity.url;
        }
        return botTypeEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final BotTypeEntity copy(@NotNull String type, @NotNull String url) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        return new BotTypeEntity(type, url);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "BotTypeEntity(type=" + this.type + ", url=" + this.url + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.url);
    }
}

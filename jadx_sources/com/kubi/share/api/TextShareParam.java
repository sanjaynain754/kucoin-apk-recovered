package com.kubi.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareParam.kt */
/* JADX INFO: loaded from: classes46.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006&"}, m90084d2 = {"Lcom/kubi/share/api/TextShareParam;", "Landroid/os/Parcelable;", "Lcom/kubi/share/api/ShareParam;", "utmSource", "", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUtmSource", "()Ljava/lang/String;", "setUtmSource", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getContent", "setContent", "getLinkUrl", "setLinkUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TextShareParam implements Parcelable, ShareParam {

    @NotNull
    public static final Parcelable.Creator<TextShareParam> CREATOR = new C24540a();

    @Nullable
    private String content;

    @Nullable
    private String linkUrl;

    @Nullable
    private String title;

    @NotNull
    private String utmSource;

    /* JADX INFO: renamed from: com.kubi.share.api.TextShareParam$a */
    /* JADX INFO: compiled from: ShareParam.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24540a implements Parcelable.Creator<TextShareParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextShareParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextShareParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextShareParam[] newArray(int i11) {
            return new TextShareParam[i11];
        }
    }

    public TextShareParam(@NotNull String utmSource, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        this.utmSource = utmSource;
        this.title = str;
        this.content = str2;
        this.linkUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextShareParam)) {
            return false;
        }
        TextShareParam textShareParam = (TextShareParam) other;
        return Intrinsics.areEqual(this.utmSource, textShareParam.utmSource) && Intrinsics.areEqual(this.title, textShareParam.title) && Intrinsics.areEqual(this.content, textShareParam.content) && Intrinsics.areEqual(this.linkUrl, textShareParam.linkUrl);
    }

    public static /* synthetic */ TextShareParam copy$default(TextShareParam textShareParam, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textShareParam.utmSource;
        }
        if ((i11 & 2) != 0) {
            str2 = textShareParam.title;
        }
        if ((i11 & 4) != 0) {
            str3 = textShareParam.content;
        }
        if ((i11 & 8) != 0) {
            str4 = textShareParam.linkUrl;
        }
        return textShareParam.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final TextShareParam copy(@NotNull String utmSource, @Nullable String title, @Nullable String content, @Nullable String linkUrl) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return new TextShareParam(utmSource, title, content, linkUrl);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        int iHashCode = this.utmSource.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setLinkUrl(@Nullable String str) {
        this.linkUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUtmSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.utmSource = str;
    }

    @NotNull
    public String toString() {
        return "TextShareParam(utmSource=" + this.utmSource + ", title=" + this.title + ", content=" + this.content + ", linkUrl=" + this.linkUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.utmSource);
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.linkUrl);
    }

    public /* synthetic */ TextShareParam(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}

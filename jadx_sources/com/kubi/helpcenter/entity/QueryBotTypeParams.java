package com.kubi.helpcenter.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QueryBotTypeParams.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/helpcenter/entity/QueryBotTypeParams;", "Landroid/os/Parcelable;", AppsFlyerProperties.CHANNEL, "", "hasAdaSdk", "", "source", "version", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getHasAdaSdk", "()Z", "getSource", "getVersion", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QueryBotTypeParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QueryBotTypeParams> CREATOR = new C14480a();

    @NotNull
    private final String channel;
    private final boolean hasAdaSdk;

    @NotNull
    private final String source;

    @NotNull
    private final String version;

    /* JADX INFO: renamed from: com.kubi.helpcenter.entity.QueryBotTypeParams$a */
    /* JADX INFO: compiled from: QueryBotTypeParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14480a implements Parcelable.Creator<QueryBotTypeParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QueryBotTypeParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QueryBotTypeParams(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final QueryBotTypeParams[] newArray(int i11) {
            return new QueryBotTypeParams[i11];
        }
    }

    public QueryBotTypeParams() {
        this(null, false, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public QueryBotTypeParams(@NotNull String channel, boolean z11, @NotNull String source, @NotNull String version) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(version, "version");
        this.channel = channel;
        this.hasAdaSdk = z11;
        this.source = source;
        this.version = version;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    public final boolean getHasAdaSdk() {
        return this.hasAdaSdk;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channel);
        dest.writeInt(this.hasAdaSdk ? 1 : 0);
        dest.writeString(this.source);
        dest.writeString(this.version);
    }

    public /* synthetic */ QueryBotTypeParams(String str, boolean z11, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3);
    }
}

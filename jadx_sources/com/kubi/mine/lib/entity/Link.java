package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppUpgradeEntityV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/Link;", "Landroid/os/Parcelable;", "androidLink", "", AppsFlyerProperties.CHANNEL, "Lcom/kubi/mine/lib/entity/Channel;", "<init>", "(Ljava/lang/String;Lcom/kubi/mine/lib/entity/Channel;)V", "getAndroidLink", "()Ljava/lang/String;", "getChannel", "()Lcom/kubi/mine/lib/entity/Channel;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Link implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Link> CREATOR = new C18932a();

    @Nullable
    private final String androidLink;

    @Nullable
    private final Channel channel;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.Link$a */
    /* JADX INFO: compiled from: AppUpgradeEntityV2.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18932a implements Parcelable.Creator<Link> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Link createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Link(parcel.readString(), parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Link[] newArray(int i11) {
            return new Link[i11];
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
        if (!(other instanceof Link)) {
            return false;
        }
        Link link = (Link) other;
        return Intrinsics.areEqual(this.androidLink, link.androidLink) && Intrinsics.areEqual(this.channel, link.channel);
    }

    public static /* synthetic */ Link copy$default(Link link, String str, Channel channel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = link.androidLink;
        }
        if ((i11 & 2) != 0) {
            channel = link.channel;
        }
        return link.copy(str, channel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    @NotNull
    public final Link copy(@Nullable String androidLink, @Nullable Channel channel) {
        return new Link(androidLink, channel);
    }

    @Nullable
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    public final Channel getChannel() {
        return this.channel;
    }

    public int hashCode() {
        String str = this.androidLink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Channel channel = this.channel;
        return iHashCode + (channel != null ? channel.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Link(androidLink=" + this.androidLink + ", channel=" + this.channel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.androidLink);
        Channel channel = this.channel;
        if (channel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            channel.writeToParcel(dest, flags);
        }
    }

    public Link(@Nullable String str, @Nullable Channel channel) {
        this.androidLink = str;
        this.channel = channel;
    }
}

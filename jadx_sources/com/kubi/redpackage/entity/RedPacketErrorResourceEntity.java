package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPacketErrorResourceEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007HÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR#\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006%"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedPacketErrorResourceEntity;", "Landroid/os/Parcelable;", "id", "", "title", "url", "srcTextMap", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getSrcTextMap", "()Ljava/util/Map;", "getMsgContent", "getBtnTxt", "isLegal", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedPacketErrorResourceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedPacketErrorResourceEntity> CREATOR = new Creator();

    @Nullable
    private final String id;

    @Nullable
    private final Map<String, String> srcTextMap;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    /* JADX INFO: compiled from: RedPacketErrorResourceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedPacketErrorResourceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPacketErrorResourceEntity createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RedPacketErrorResourceEntity(string, string2, string3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPacketErrorResourceEntity[] newArray(int i11) {
            return new RedPacketErrorResourceEntity[i11];
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
        if (!(other instanceof RedPacketErrorResourceEntity)) {
            return false;
        }
        RedPacketErrorResourceEntity redPacketErrorResourceEntity = (RedPacketErrorResourceEntity) other;
        return Intrinsics.areEqual(this.id, redPacketErrorResourceEntity.id) && Intrinsics.areEqual(this.title, redPacketErrorResourceEntity.title) && Intrinsics.areEqual(this.url, redPacketErrorResourceEntity.url) && Intrinsics.areEqual(this.srcTextMap, redPacketErrorResourceEntity.srcTextMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedPacketErrorResourceEntity copy$default(RedPacketErrorResourceEntity redPacketErrorResourceEntity, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redPacketErrorResourceEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = redPacketErrorResourceEntity.title;
        }
        if ((i11 & 4) != 0) {
            str3 = redPacketErrorResourceEntity.url;
        }
        if ((i11 & 8) != 0) {
            map = redPacketErrorResourceEntity.srcTextMap;
        }
        return redPacketErrorResourceEntity.copy(str, str2, str3, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.srcTextMap;
    }

    @NotNull
    public final RedPacketErrorResourceEntity copy(@Nullable String id2, @Nullable String title, @Nullable String url, @Nullable Map<String, String> srcTextMap) {
        return new RedPacketErrorResourceEntity(id2, title, url, srcTextMap);
    }

    @Nullable
    public final String getBtnTxt() {
        Map<String, String> map = this.srcTextMap;
        if (map != null) {
            return map.get("btnTxt");
        }
        return null;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMsgContent() {
        Map<String, String> map = this.srcTextMap;
        if (map != null) {
            return map.get("content");
        }
        return null;
    }

    @Nullable
    public final Map<String, String> getSrcTextMap() {
        return this.srcTextMap;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.srcTextMap;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RedPacketErrorResourceEntity(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", srcTextMap=" + this.srcTextMap + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.url);
        Map<String, String> map = this.srcTextMap;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public RedPacketErrorResourceEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.srcTextMap = map;
    }

    public final boolean isLegal() {
        String btnTxt;
        String msgContent = getMsgContent();
        if (msgContent != null && msgContent.length() != 0 && (btnTxt = getBtnTxt()) != null && btnTxt.length() != 0) {
            return true;
        }
        return false;
    }
}

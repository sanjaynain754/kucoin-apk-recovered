package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010#R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010)¨\u0006*"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "Landroid/os/Parcelable;", "", "title", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "", "extensionInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getDescription", "setDescription", "Ljava/util/Map;", "getExtensionInfo", "setExtensionInfo", "(Ljava/util/Map;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class OfflinePushInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfflinePushInfo> CREATOR = new Creator();

    @NotNull
    private String description;

    @NotNull
    private Map<String, ? extends Object> extensionInfo;

    @NotNull
    private String title;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OfflinePushInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OfflinePushInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), parcel.readValue(OfflinePushInfo.class.getClassLoader()));
            }
            return new OfflinePushInfo(string, string2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OfflinePushInfo[] newArray(int i11) {
            return new OfflinePushInfo[i11];
        }
    }

    public OfflinePushInfo() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflinePushInfo)) {
            return false;
        }
        OfflinePushInfo offlinePushInfo = (OfflinePushInfo) other;
        return Intrinsics.areEqual(this.title, offlinePushInfo.title) && Intrinsics.areEqual(this.description, offlinePushInfo.description) && Intrinsics.areEqual(this.extensionInfo, offlinePushInfo.extensionInfo);
    }

    public OfflinePushInfo(@NotNull String title, @NotNull String description, @NotNull Map<String, ? extends Object> extensionInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        this.title = title;
        this.description = description;
        this.extensionInfo = extensionInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflinePushInfo copy$default(OfflinePushInfo offlinePushInfo, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlinePushInfo.title;
        }
        if ((i11 & 2) != 0) {
            str2 = offlinePushInfo.description;
        }
        if ((i11 & 4) != 0) {
            map = offlinePushInfo.extensionInfo;
        }
        return offlinePushInfo.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.extensionInfo;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Map<String, Object> getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.extensionInfo.hashCode() + AbstractC39391a.m88220a(this.description, this.title.hashCode() * 31, 31);
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setExtensionInfo(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extensionInfo = map;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "OfflinePushInfo(title=" + this.title + ", description=" + this.description + ", extensionInfo=" + this.extensionInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Map<String, ? extends Object> map = this.extensionInfo;
        parcel.writeInt(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    @NotNull
    public final OfflinePushInfo copy(@NotNull String title, @NotNull String description, @NotNull Map<String, ? extends Object> extensionInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        return new OfflinePushInfo(title, description, extensionInfo);
    }

    public /* synthetic */ OfflinePushInfo(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}

package com.kubi.share.lib.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareMenuItem.kt */
/* JADX INFO: loaded from: classes46.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u00060"}, m90084d2 = {"Lcom/kubi/share/lib/entity/ShareMenuItem;", "", "id", "", "packName", "", "className", TUIConstants.TUIChat.INPUT_MORE_ICON, "text", "installIndex", "trackName", "utmMedium", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getPackName", "()Ljava/lang/String;", "setPackName", "(Ljava/lang/String;)V", "getClassName", "setClassName", "getIcon", "setIcon", "getText", "setText", "getInstallIndex", "setInstallIndex", "getTrackName", "setTrackName", "getUtmMedium", "setUtmMedium", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShareMenuItem {

    @NotNull
    private String className;
    private int icon;
    private int id;
    private int installIndex;

    @NotNull
    private String packName;

    @NotNull
    private String text;

    @Nullable
    private String trackName;

    @Nullable
    private String utmMedium;

    public ShareMenuItem(int i11, @NotNull String packName, @NotNull String className, int i12, @NotNull String text, int i13, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(packName, "packName");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.packName = packName;
        this.className = className;
        this.icon = i12;
        this.text = text;
        this.installIndex = i13;
        this.trackName = str;
        this.utmMedium = str2;
    }

    public static /* synthetic */ ShareMenuItem copy$default(ShareMenuItem shareMenuItem, int i11, String str, String str2, int i12, String str3, int i13, String str4, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = shareMenuItem.id;
        }
        if ((i14 & 2) != 0) {
            str = shareMenuItem.packName;
        }
        if ((i14 & 4) != 0) {
            str2 = shareMenuItem.className;
        }
        if ((i14 & 8) != 0) {
            i12 = shareMenuItem.icon;
        }
        if ((i14 & 16) != 0) {
            str3 = shareMenuItem.text;
        }
        if ((i14 & 32) != 0) {
            i13 = shareMenuItem.installIndex;
        }
        if ((i14 & 64) != 0) {
            str4 = shareMenuItem.trackName;
        }
        if ((i14 & 128) != 0) {
            str5 = shareMenuItem.utmMedium;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i15 = i13;
        return shareMenuItem.copy(i11, str, str2, i12, str8, i15, str6, str7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareMenuItem)) {
            return false;
        }
        ShareMenuItem shareMenuItem = (ShareMenuItem) other;
        return this.id == shareMenuItem.id && Intrinsics.areEqual(this.packName, shareMenuItem.packName) && Intrinsics.areEqual(this.className, shareMenuItem.className) && this.icon == shareMenuItem.icon && Intrinsics.areEqual(this.text, shareMenuItem.text) && this.installIndex == shareMenuItem.installIndex && Intrinsics.areEqual(this.trackName, shareMenuItem.trackName) && Intrinsics.areEqual(this.utmMedium, shareMenuItem.utmMedium);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackName() {
        return this.packName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getInstallIndex() {
        return this.installIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrackName() {
        return this.trackName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    @NotNull
    public final ShareMenuItem copy(int id2, @NotNull String packName, @NotNull String className, int icon, @NotNull String text, int installIndex, @Nullable String trackName, @Nullable String utmMedium) {
        Intrinsics.checkNotNullParameter(packName, "packName");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ShareMenuItem(id2, packName, className, icon, text, installIndex, trackName, utmMedium);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInstallIndex() {
        return this.installIndex;
    }

    @NotNull
    public final String getPackName() {
        return this.packName;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTrackName() {
        return this.trackName;
    }

    @Nullable
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.id) * 31) + this.packName.hashCode()) * 31) + this.className.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.installIndex)) * 31;
        String str = this.trackName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.utmMedium;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setClassName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.className = str;
    }

    public final void setIcon(int i11) {
        this.icon = i11;
    }

    public final void setId(int i11) {
        this.id = i11;
    }

    public final void setInstallIndex(int i11) {
        this.installIndex = i11;
    }

    public final void setPackName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packName = str;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void setTrackName(@Nullable String str) {
        this.trackName = str;
    }

    public final void setUtmMedium(@Nullable String str) {
        this.utmMedium = str;
    }

    @NotNull
    public String toString() {
        return "ShareMenuItem(id=" + this.id + ", packName=" + this.packName + ", className=" + this.className + ", icon=" + this.icon + ", text=" + this.text + ", installIndex=" + this.installIndex + ", trackName=" + this.trackName + ", utmMedium=" + this.utmMedium + ')';
    }

    public /* synthetic */ ShareMenuItem(int i11, String str, String str2, int i12, String str3, int i13, String str4, String str5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, i12, str3, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5);
    }
}

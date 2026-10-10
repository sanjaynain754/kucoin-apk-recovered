package io.trtc.tuikit.atomicxcore.api.gift;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "", "giftID", "", "name", "desc", "iconURL", "resourceURL", FirebaseAnalytics.Param.LEVEL, "", "coins", "extensionInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;)V", "getCoins", "()J", "getDesc", "()Ljava/lang/String;", "getExtensionInfo", "()Ljava/util/Map;", "getGiftID", "getIconURL", "getLevel", "getName", "getResourceURL", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class Gift {
    private final long coins;

    @NotNull
    private final String desc;

    @NotNull
    private final Map<String, String> extensionInfo;

    @NotNull
    private final String giftID;

    @NotNull
    private final String iconURL;
    private final long level;

    @NotNull
    private final String name;

    @NotNull
    private final String resourceURL;

    public Gift() {
        this(null, null, null, null, null, 0L, 0L, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Gift)) {
            return false;
        }
        Gift gift = (Gift) other;
        return Intrinsics.areEqual(this.giftID, gift.giftID) && Intrinsics.areEqual(this.name, gift.name) && Intrinsics.areEqual(this.desc, gift.desc) && Intrinsics.areEqual(this.iconURL, gift.iconURL) && Intrinsics.areEqual(this.resourceURL, gift.resourceURL) && this.level == gift.level && this.coins == gift.coins && Intrinsics.areEqual(this.extensionInfo, gift.extensionInfo);
    }

    public Gift(@NotNull String giftID, @NotNull String name, @NotNull String desc, @NotNull String iconURL, @NotNull String resourceURL, long j11, long j12, @NotNull Map<String, String> extensionInfo) {
        Intrinsics.checkNotNullParameter(giftID, "giftID");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(iconURL, "iconURL");
        Intrinsics.checkNotNullParameter(resourceURL, "resourceURL");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        this.giftID = giftID;
        this.name = name;
        this.desc = desc;
        this.iconURL = iconURL;
        this.resourceURL = resourceURL;
        this.level = j11;
        this.coins = j12;
        this.extensionInfo = extensionInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Gift copy$default(Gift gift, String str, String str2, String str3, String str4, String str5, long j11, long j12, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gift.giftID;
        }
        if ((i11 & 2) != 0) {
            str2 = gift.name;
        }
        if ((i11 & 4) != 0) {
            str3 = gift.desc;
        }
        if ((i11 & 8) != 0) {
            str4 = gift.iconURL;
        }
        if ((i11 & 16) != 0) {
            str5 = gift.resourceURL;
        }
        if ((i11 & 32) != 0) {
            j11 = gift.level;
        }
        if ((i11 & 64) != 0) {
            j12 = gift.coins;
        }
        if ((i11 & 128) != 0) {
            map = gift.extensionInfo;
        }
        Map map2 = map;
        long j13 = j12;
        long j14 = j11;
        String str6 = str5;
        String str7 = str3;
        return gift.copy(str, str2, str7, str4, str6, j14, j13, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftID() {
        return this.giftID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconURL() {
        return this.iconURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getResourceURL() {
        return this.resourceURL;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCoins() {
        return this.coins;
    }

    @NotNull
    public final Map<String, String> component8() {
        return this.extensionInfo;
    }

    @NotNull
    public final Gift copy(@NotNull String giftID, @NotNull String name, @NotNull String desc, @NotNull String iconURL, @NotNull String resourceURL, long level, long coins, @NotNull Map<String, String> extensionInfo) {
        Intrinsics.checkNotNullParameter(giftID, "giftID");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(iconURL, "iconURL");
        Intrinsics.checkNotNullParameter(resourceURL, "resourceURL");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        return new Gift(giftID, name, desc, iconURL, resourceURL, level, coins, extensionInfo);
    }

    public final long getCoins() {
        return this.coins;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final Map<String, String> getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final String getGiftID() {
        return this.giftID;
    }

    @NotNull
    public final String getIconURL() {
        return this.iconURL;
    }

    public final long getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getResourceURL() {
        return this.resourceURL;
    }

    public int hashCode() {
        return this.extensionInfo.hashCode() + ((Long.hashCode(this.coins) + ((Long.hashCode(this.level) + AbstractC39391a.m88220a(this.resourceURL, AbstractC39391a.m88220a(this.iconURL, AbstractC39391a.m88220a(this.desc, AbstractC39391a.m88220a(this.name, this.giftID.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Gift(giftID=" + this.giftID + ", name=" + this.name + ", desc=" + this.desc + ", iconURL=" + this.iconURL + ", resourceURL=" + this.resourceURL + ", level=" + this.level + ", coins=" + this.coins + ", extensionInfo=" + this.extensionInfo + ')';
    }

    public /* synthetic */ Gift(String str, String str2, String str3, String str4, String str5, long j11, long j12, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? 0L : j11, (i11 & 64) != 0 ? 0L : j12, (i11 & 128) != 0 ? MapsKt.emptyMap() : map);
    }
}

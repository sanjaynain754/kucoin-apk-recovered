package com.kubi.mine.lib.manger;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: V2UpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/mine/lib/manger/UpgradeConfig;", "", "version", "", "upgrade", JPushConstants.Geofence.KEY_INTERVAL, "", "title", "content", SignTermItem.LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "getUpgrade", "getInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getContent", "getLink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/mine/lib/manger/UpgradeConfig;", "equals", "", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpgradeConfig {

    @Nullable
    private final String content;

    @Nullable
    private final Integer interval;

    @Nullable
    private final String link;

    @Nullable
    private final String title;

    @Nullable
    private final String upgrade;

    @Nullable
    private final String version;

    public UpgradeConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeConfig)) {
            return false;
        }
        UpgradeConfig upgradeConfig = (UpgradeConfig) other;
        return Intrinsics.areEqual(this.version, upgradeConfig.version) && Intrinsics.areEqual(this.upgrade, upgradeConfig.upgrade) && Intrinsics.areEqual(this.interval, upgradeConfig.interval) && Intrinsics.areEqual(this.title, upgradeConfig.title) && Intrinsics.areEqual(this.content, upgradeConfig.content) && Intrinsics.areEqual(this.link, upgradeConfig.link);
    }

    public UpgradeConfig(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.version = str;
        this.upgrade = str2;
        this.interval = num;
        this.title = str3;
        this.content = str4;
        this.link = str5;
    }

    public static /* synthetic */ UpgradeConfig copy$default(UpgradeConfig upgradeConfig, String str, String str2, Integer num, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = upgradeConfig.version;
        }
        if ((i11 & 2) != 0) {
            str2 = upgradeConfig.upgrade;
        }
        if ((i11 & 4) != 0) {
            num = upgradeConfig.interval;
        }
        if ((i11 & 8) != 0) {
            str3 = upgradeConfig.title;
        }
        if ((i11 & 16) != 0) {
            str4 = upgradeConfig.content;
        }
        if ((i11 & 32) != 0) {
            str5 = upgradeConfig.link;
        }
        String str6 = str4;
        String str7 = str5;
        return upgradeConfig.copy(str, str2, num, str3, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpgrade() {
        return this.upgrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getInterval() {
        return this.interval;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final UpgradeConfig copy(@Nullable String version, @Nullable String upgrade, @Nullable Integer interval, @Nullable String title, @Nullable String content, @Nullable String link) {
        return new UpgradeConfig(version, upgrade, interval, title, content, link);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getInterval() {
        return this.interval;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUpgrade() {
        return this.upgrade;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.upgrade;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.interval;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.link;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpgradeConfig(version=" + this.version + ", upgrade=" + this.upgrade + ", interval=" + this.interval + ", title=" + this.title + ", content=" + this.content + ", link=" + this.link + ')';
    }

    public /* synthetic */ UpgradeConfig(String str, String str2, Integer num, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }
}

package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PullRefreshConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/entity/PullRefreshConfigEntity;", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "descText", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getDescText", "getJumpUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PullRefreshConfigEntity {

    @NotNull
    private final String descText;

    @NotNull
    private final String icon;

    @NotNull
    private final String jumpUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullRefreshConfigEntity)) {
            return false;
        }
        PullRefreshConfigEntity pullRefreshConfigEntity = (PullRefreshConfigEntity) other;
        return Intrinsics.areEqual(this.icon, pullRefreshConfigEntity.icon) && Intrinsics.areEqual(this.descText, pullRefreshConfigEntity.descText) && Intrinsics.areEqual(this.jumpUrl, pullRefreshConfigEntity.jumpUrl);
    }

    public PullRefreshConfigEntity(@NotNull String icon, @NotNull String descText, @NotNull String jumpUrl) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(descText, "descText");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        this.icon = icon;
        this.descText = descText;
        this.jumpUrl = jumpUrl;
    }

    public static /* synthetic */ PullRefreshConfigEntity copy$default(PullRefreshConfigEntity pullRefreshConfigEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pullRefreshConfigEntity.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = pullRefreshConfigEntity.descText;
        }
        if ((i11 & 4) != 0) {
            str3 = pullRefreshConfigEntity.jumpUrl;
        }
        return pullRefreshConfigEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescText() {
        return this.descText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @NotNull
    public final PullRefreshConfigEntity copy(@NotNull String icon, @NotNull String descText, @NotNull String jumpUrl) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(descText, "descText");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        return new PullRefreshConfigEntity(icon, descText, jumpUrl);
    }

    @NotNull
    public final String getDescText() {
        return this.descText;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.descText.hashCode()) * 31) + this.jumpUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "PullRefreshConfigEntity(icon=" + this.icon + ", descText=" + this.descText + ", jumpUrl=" + this.jumpUrl + ')';
    }
}

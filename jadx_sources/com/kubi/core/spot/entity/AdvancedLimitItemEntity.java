package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitItemEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/spot/entity/AdvancedLimitItemEntity;", "", "title", "", "desc", "type", "isSelect", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getDesc", "getType", "setType", "(Ljava/lang/String;)V", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AdvancedLimitItemEntity {

    @NotNull
    private final String desc;
    private final boolean isSelect;

    @NotNull
    private final String title;

    @NotNull
    private String type;

    public AdvancedLimitItemEntity(@NotNull String title, @NotNull String desc, @NotNull String type, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.isSelect = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLimitItemEntity)) {
            return false;
        }
        AdvancedLimitItemEntity advancedLimitItemEntity = (AdvancedLimitItemEntity) other;
        return Intrinsics.areEqual(this.title, advancedLimitItemEntity.title) && Intrinsics.areEqual(this.desc, advancedLimitItemEntity.desc) && Intrinsics.areEqual(this.type, advancedLimitItemEntity.type) && this.isSelect == advancedLimitItemEntity.isSelect;
    }

    public static /* synthetic */ AdvancedLimitItemEntity copy$default(AdvancedLimitItemEntity advancedLimitItemEntity, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = advancedLimitItemEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = advancedLimitItemEntity.desc;
        }
        if ((i11 & 4) != 0) {
            str3 = advancedLimitItemEntity.type;
        }
        if ((i11 & 8) != 0) {
            z11 = advancedLimitItemEntity.isSelect;
        }
        return advancedLimitItemEntity.copy(str, str2, str3, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final AdvancedLimitItemEntity copy(@NotNull String title, @NotNull String desc, @NotNull String type, boolean isSelect) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AdvancedLimitItemEntity(title, desc, type, isSelect);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.desc.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "AdvancedLimitItemEntity(title=" + this.title + ", desc=" + this.desc + ", type=" + this.type + ", isSelect=" + this.isSelect + ')';
    }

    public /* synthetic */ AdvancedLimitItemEntity(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? false : z11);
    }
}

package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.kubi.home.api.R$string;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/entity/MoreNavigationEntity;", "Lcom/kubi/home/entity/GridNavigationEntity;", "dayIcon", "", "darkIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDayIcon", "()Ljava/lang/String;", "setDayIcon", "(Ljava/lang/String;)V", "getDarkIcon", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MoreNavigationEntity extends GridNavigationEntity {

    @Nullable
    private final String darkIcon;

    @Nullable
    private String dayIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public MoreNavigationEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.kubi.home.entity.GridNavigationEntity
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoreNavigationEntity)) {
            return false;
        }
        MoreNavigationEntity moreNavigationEntity = (MoreNavigationEntity) other;
        return Intrinsics.areEqual(this.dayIcon, moreNavigationEntity.dayIcon) && Intrinsics.areEqual(this.darkIcon, moreNavigationEntity.darkIcon);
    }

    public /* synthetic */ MoreNavigationEntity(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ MoreNavigationEntity copy$default(MoreNavigationEntity moreNavigationEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = moreNavigationEntity.dayIcon;
        }
        if ((i11 & 2) != 0) {
            str2 = moreNavigationEntity.darkIcon;
        }
        return moreNavigationEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDayIcon() {
        return this.dayIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @NotNull
    public final MoreNavigationEntity copy(@Nullable String dayIcon, @Nullable String darkIcon) {
        return new MoreNavigationEntity(dayIcon, darkIcon);
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getDayIcon() {
        return this.dayIcon;
    }

    @Override // com.kubi.home.entity.GridNavigationEntity
    public int hashCode() {
        String str = this.dayIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkIcon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDayIcon(@Nullable String str) {
        this.dayIcon = str;
    }

    @NotNull
    public String toString() {
        return "MoreNavigationEntity(dayIcon=" + this.dayIcon + ", darkIcon=" + this.darkIcon + ')';
    }

    public MoreNavigationEntity(@Nullable String str, @Nullable String str2) {
        super(null, C27017c.f54310a.m66516f(R$string.more, new Object[0]), str, str2, null, null, null, null, null, 497, null);
        this.dayIcon = str;
        this.darkIcon = str2;
    }
}

package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/copytrading/assets/SortRequestEntity;", "", "field", "", "direction", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "getDirection", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SortRequestEntity {

    @NotNull
    private final String direction;

    @NotNull
    private final String field;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortRequestEntity)) {
            return false;
        }
        SortRequestEntity sortRequestEntity = (SortRequestEntity) other;
        return Intrinsics.areEqual(this.field, sortRequestEntity.field) && Intrinsics.areEqual(this.direction, sortRequestEntity.direction);
    }

    public SortRequestEntity(@NotNull String field, @NotNull String direction) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.field = field;
        this.direction = direction;
    }

    public static /* synthetic */ SortRequestEntity copy$default(SortRequestEntity sortRequestEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sortRequestEntity.field;
        }
        if ((i11 & 2) != 0) {
            str2 = sortRequestEntity.direction;
        }
        return sortRequestEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getField() {
        return this.field;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @NotNull
    public final SortRequestEntity copy(@NotNull String field, @NotNull String direction) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new SortRequestEntity(field, direction);
    }

    @NotNull
    public final String getDirection() {
        return this.direction;
    }

    @NotNull
    public final String getField() {
        return this.field;
    }

    public int hashCode() {
        return (this.field.hashCode() * 31) + this.direction.hashCode();
    }

    @NotNull
    public String toString() {
        return "SortRequestEntity(field=" + this.field + ", direction=" + this.direction + ')';
    }
}

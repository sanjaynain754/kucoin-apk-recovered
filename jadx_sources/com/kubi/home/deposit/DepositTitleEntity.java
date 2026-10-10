package com.kubi.home.deposit;

import androidx.annotation.Keep;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositItemEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/deposit/DepositTitleEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositTitleEntity implements MultiItemEntity {

    @NotNull
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DepositTitleEntity) && Intrinsics.areEqual(this.title, ((DepositTitleEntity) other).title);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF17248b() {
        return 0;
    }

    public DepositTitleEntity(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
    }

    public static /* synthetic */ DepositTitleEntity copy$default(DepositTitleEntity depositTitleEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = depositTitleEntity.title;
        }
        return depositTitleEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final DepositTitleEntity copy(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DepositTitleEntity(title);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "DepositTitleEntity(title=" + this.title + ')';
    }
}

package com.kubi.home.deposit;

import androidx.annotation.Keep;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositItemEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/deposit/DepositItemEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "iconResId", "", "title", "", "tips", "isRecommend", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getIconResId", "()I", "getTitle", "()Ljava/lang/String;", "getTips", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getItemType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositItemEntity implements MultiItemEntity {
    private final int iconResId;
    private final boolean isRecommend;

    @NotNull
    private final Function0<Unit> onClick;

    @NotNull
    private final String tips;

    @NotNull
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositItemEntity)) {
            return false;
        }
        DepositItemEntity depositItemEntity = (DepositItemEntity) other;
        return this.iconResId == depositItemEntity.iconResId && Intrinsics.areEqual(this.title, depositItemEntity.title) && Intrinsics.areEqual(this.tips, depositItemEntity.tips) && this.isRecommend == depositItemEntity.isRecommend && Intrinsics.areEqual(this.onClick, depositItemEntity.onClick);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 1;
    }

    public DepositItemEntity(int i11, @NotNull String title, @NotNull String tips, boolean z11, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.iconResId = i11;
        this.title = title;
        this.tips = tips;
        this.isRecommend = z11;
        this.onClick = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositItemEntity copy$default(DepositItemEntity depositItemEntity, int i11, String str, String str2, boolean z11, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = depositItemEntity.iconResId;
        }
        if ((i12 & 2) != 0) {
            str = depositItemEntity.title;
        }
        if ((i12 & 4) != 0) {
            str2 = depositItemEntity.tips;
        }
        if ((i12 & 8) != 0) {
            z11 = depositItemEntity.isRecommend;
        }
        if ((i12 & 16) != 0) {
            function0 = depositItemEntity.onClick;
        }
        Function0 function1 = function0;
        String str3 = str2;
        return depositItemEntity.copy(i11, str, str3, z11, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.onClick;
    }

    @NotNull
    public final DepositItemEntity copy(int iconResId, @NotNull String title, @NotNull String tips, boolean isRecommend, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new DepositItemEntity(iconResId, title, tips, isRecommend, onClick);
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.iconResId) * 31) + this.title.hashCode()) * 31) + this.tips.hashCode()) * 31) + Boolean.hashCode(this.isRecommend)) * 31) + this.onClick.hashCode();
    }

    public final boolean isRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public String toString() {
        return "DepositItemEntity(iconResId=" + this.iconResId + ", title=" + this.title + ", tips=" + this.tips + ", isRecommend=" + this.isRecommend + ", onClick=" + this.onClick + ')';
    }
}

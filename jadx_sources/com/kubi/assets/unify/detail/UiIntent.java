package com.kubi.assets.unify.detail;

import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.unify.detail.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifiedDetailVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UiIntent;", "", "FetchAccountDetail", "LoadRecommendSymbolsData", "Lcom/kubi/assets/unify/detail/UiIntent$FetchAccountDetail;", "Lcom/kubi/assets/unify/detail/UiIntent$LoadRecommendSymbolsData;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface UiIntent {

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.b$a, reason: from toString */
    /* JADX INFO: compiled from: UnifiedDetailVM.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UiIntent$FetchAccountDetail;", "Lcom/kubi/assets/unify/detail/UiIntent;", "code", "", "collateralStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getCollateralStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/assets/unify/detail/UiIntent$FetchAccountDetail;", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchAccountDetail implements UiIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String code;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Integer collateralStatus;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchAccountDetail)) {
                return false;
            }
            FetchAccountDetail fetchAccountDetail = (FetchAccountDetail) other;
            return Intrinsics.areEqual(this.code, fetchAccountDetail.code) && Intrinsics.areEqual(this.collateralStatus, fetchAccountDetail.collateralStatus);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getCollateralStatus() {
            return this.collateralStatus;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.collateralStatus;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FetchAccountDetail(code=" + this.code + ", collateralStatus=" + this.collateralStatus + ')';
        }

        public FetchAccountDetail(@Nullable String str, @Nullable Integer num) {
            this.code = str;
            this.collateralStatus = num;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.b$b, reason: from toString */
    /* JADX INFO: compiled from: UnifiedDetailVM.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UiIntent$LoadRecommendSymbolsData;", "Lcom/kubi/assets/unify/detail/UiIntent;", "code", "", "onError", "Lio/reactivex/functions/Consumer;", "", "<init>", "(Ljava/lang/String;Lio/reactivex/functions/Consumer;)V", "getCode", "()Ljava/lang/String;", "getOnError", "()Lio/reactivex/functions/Consumer;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadRecommendSymbolsData implements UiIntent {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String code;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Consumer<? super Throwable> onError;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadRecommendSymbolsData)) {
                return false;
            }
            LoadRecommendSymbolsData loadRecommendSymbolsData = (LoadRecommendSymbolsData) other;
            return Intrinsics.areEqual(this.code, loadRecommendSymbolsData.code) && Intrinsics.areEqual(this.onError, loadRecommendSymbolsData.onError);
        }

        public LoadRecommendSymbolsData(@Nullable String str, @NotNull Consumer<? super Throwable> onError) {
            Intrinsics.checkNotNullParameter(onError, "onError");
            this.code = str;
            this.onError = onError;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Consumer<? super Throwable> m19854b() {
            return this.onError;
        }

        public int hashCode() {
            String str = this.code;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.onError.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadRecommendSymbolsData(code=" + this.code + ", onError=" + this.onError + ')';
        }
    }
}

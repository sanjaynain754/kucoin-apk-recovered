package com.kubi.assets.margin.cross;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2CrossContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "HideOrShowNumber", "HideSmallOrFilter", "FetchCrossAssetsList", "FetchMarginPnl", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$FetchCrossAssetsList;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$FetchMarginPnl;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$HideSmallOrFilter;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetV2CrossContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetV2CrossContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$FetchCrossAssetsList;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchCrossAssetsList extends AssetV2CrossContract$UiIntent {

        @NotNull
        public static final FetchCrossAssetsList INSTANCE = new FetchCrossAssetsList();

        private FetchCrossAssetsList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: AssetV2CrossContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$FetchMarginPnl;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchMarginPnl extends AssetV2CrossContract$UiIntent {

        @NotNull
        public static final FetchMarginPnl INSTANCE = new FetchMarginPnl();

        private FetchMarginPnl() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: AssetV2CrossContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends AssetV2CrossContract$UiIntent {
        private final boolean isChecked;

        public HideOrShowNumber(boolean z11) {
            super(null);
            this.isChecked = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HideOrShowNumber) && this.isChecked == ((HideOrShowNumber) other).isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "HideOrShowNumber(isChecked=" + this.isChecked + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2CrossContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent$HideSmallOrFilter;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "checked", "", "keyword", "", "isManual", "<init>", "(ZLjava/lang/String;Z)V", "getChecked", "()Z", "getKeyword", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HideSmallOrFilter extends AssetV2CrossContract$UiIntent {
        private final boolean checked;
        private final boolean isManual;

        @NotNull
        private final String keyword;

        public /* synthetic */ HideSmallOrFilter(boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, str, (i11 & 4) != 0 ? false : z12);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HideSmallOrFilter(boolean z11, @NotNull String keyword, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            this.checked = z11;
            this.keyword = keyword;
            this.isManual = z12;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        @NotNull
        public final String getKeyword() {
            return this.keyword;
        }

        /* JADX INFO: renamed from: isManual, reason: from getter */
        public final boolean getIsManual() {
            return this.isManual;
        }
    }

    public /* synthetic */ AssetV2CrossContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetV2CrossContract$UiIntent() {
    }
}

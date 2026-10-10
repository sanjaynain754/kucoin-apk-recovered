package com.kubi.assets.finance.product;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FinanceProductContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetProductList", "HideOrShowNumber", "Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent$GetProductList;", "Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent$HideOrShowNumber;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FinanceProductContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FinanceProductContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent$GetProductList;", "Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetProductList extends FinanceProductContract$UiIntent {

        @NotNull
        public static final GetProductList INSTANCE = new GetProductList();

        private GetProductList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FinanceProductContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/finance/product/FinanceProductContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends FinanceProductContract$UiIntent {
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

    public /* synthetic */ FinanceProductContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FinanceProductContract$UiIntent() {
    }
}

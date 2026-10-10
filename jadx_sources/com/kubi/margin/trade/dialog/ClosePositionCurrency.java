package com.kubi.margin.trade.dialog;

import android.content.Context;
import androidx.annotation.Keep;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.CurrencyEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239ep.C37220a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: ClosePositionCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J&\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR.\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/margin/entity/CurrencyEntity;", "isChecked", "", "selectedCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "<init>", "(Lcom/kubi/margin/entity/CurrencyEntity;ZLkotlin/jvm/functions/Function1;)V", "getEntity", "()Lcom/kubi/margin/entity/CurrencyEntity;", "()Z", "getSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "displayName", "", "context", "Landroid/content/Context;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClosePositionCurrency {

    @NotNull
    private final CurrencyEntity entity;
    private final boolean isChecked;

    @NotNull
    private final Function1<ClosePositionCurrency, Unit> selectedCallback;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosePositionCurrency)) {
            return false;
        }
        ClosePositionCurrency closePositionCurrency = (ClosePositionCurrency) other;
        return Intrinsics.areEqual(this.entity, closePositionCurrency.entity) && this.isChecked == closePositionCurrency.isChecked && Intrinsics.areEqual(this.selectedCallback, closePositionCurrency.selectedCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClosePositionCurrency(@NotNull CurrencyEntity entity, boolean z11, @NotNull Function1<? super ClosePositionCurrency, Unit> selectedCallback) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(selectedCallback, "selectedCallback");
        this.entity = entity;
        this.isChecked = z11;
        this.selectedCallback = selectedCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClosePositionCurrency copy$default(ClosePositionCurrency closePositionCurrency, CurrencyEntity currencyEntity, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            currencyEntity = closePositionCurrency.entity;
        }
        if ((i11 & 2) != 0) {
            z11 = closePositionCurrency.isChecked;
        }
        if ((i11 & 4) != 0) {
            function1 = closePositionCurrency.selectedCallback;
        }
        return closePositionCurrency.copy(currencyEntity, z11, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrencyEntity getEntity() {
        return this.entity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final Function1<ClosePositionCurrency, Unit> component3() {
        return this.selectedCallback;
    }

    @NotNull
    public final ClosePositionCurrency copy(@NotNull CurrencyEntity entity, boolean isChecked, @NotNull Function1<? super ClosePositionCurrency, Unit> selectedCallback) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(selectedCallback, "selectedCallback");
        return new ClosePositionCurrency(entity, isChecked, selectedCallback);
    }

    @NotNull
    public final String displayName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C37220a.m83268b(this.entity)) {
            String string = context.getString(R$string.position_close_of_only_debt);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = context.getString(R$string.position_close_merge_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(this.entity.getName())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final CurrencyEntity getEntity() {
        return this.entity;
    }

    @NotNull
    public final Function1<ClosePositionCurrency, Unit> getSelectedCallback() {
        return this.selectedCallback;
    }

    public int hashCode() {
        return (((this.entity.hashCode() * 31) + Boolean.hashCode(this.isChecked)) * 31) + this.selectedCallback.hashCode();
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public String toString() {
        return "ClosePositionCurrency(entity=" + this.entity + ", isChecked=" + this.isChecked + ", selectedCallback=" + this.selectedCallback + ')';
    }
}

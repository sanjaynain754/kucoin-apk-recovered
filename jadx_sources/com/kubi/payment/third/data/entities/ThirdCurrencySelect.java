package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdCurrencySelect;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "name", "selected", "shortName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Ljava/lang/String;", "getName", "getSelected", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/third/data/entities/ThirdCurrencySelect;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdCurrencySelect {

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String icon;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean selected;

    @Nullable
    private final String shortName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdCurrencySelect)) {
            return false;
        }
        ThirdCurrencySelect thirdCurrencySelect = (ThirdCurrencySelect) other;
        return Intrinsics.areEqual(this.enable, thirdCurrencySelect.enable) && Intrinsics.areEqual(this.icon, thirdCurrencySelect.icon) && Intrinsics.areEqual(this.name, thirdCurrencySelect.name) && Intrinsics.areEqual(this.selected, thirdCurrencySelect.selected) && Intrinsics.areEqual(this.shortName, thirdCurrencySelect.shortName);
    }

    public static /* synthetic */ ThirdCurrencySelect copy$default(ThirdCurrencySelect thirdCurrencySelect, Boolean bool, String str, String str2, Boolean bool2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = thirdCurrencySelect.enable;
        }
        if ((i11 & 2) != 0) {
            str = thirdCurrencySelect.icon;
        }
        if ((i11 & 4) != 0) {
            str2 = thirdCurrencySelect.name;
        }
        if ((i11 & 8) != 0) {
            bool2 = thirdCurrencySelect.selected;
        }
        if ((i11 & 16) != 0) {
            str3 = thirdCurrencySelect.shortName;
        }
        String str4 = str3;
        String str5 = str2;
        return thirdCurrencySelect.copy(bool, str, str5, bool2, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @NotNull
    public final ThirdCurrencySelect copy(@Nullable Boolean enable, @Nullable String icon, @Nullable String name, @Nullable Boolean selected, @Nullable String shortName) {
        return new ThirdCurrencySelect(enable, icon, name, selected, shortName);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.shortName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThirdCurrencySelect(enable=" + this.enable + ", icon=" + this.icon + ", name=" + this.name + ", selected=" + this.selected + ", shortName=" + this.shortName + ')';
    }

    public ThirdCurrencySelect(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable String str3) {
        this.enable = bool;
        this.icon = str;
        this.name = str2;
        this.selected = bool2;
        this.shortName = str3;
    }
}

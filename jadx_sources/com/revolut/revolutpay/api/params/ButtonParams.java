package com.revolut.revolutpay.api.params;

import androidx.media3.exoplayer.upstream.CmcdData;
import ia0.VariantModes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001a\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u001e\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b\"\u0010+¨\u0006."}, m90084d2 = {"Lcom/revolut/revolutpay/api/params/ButtonParams;", "", "Lcom/revolut/revolutpay/api/params/Radius;", "radius", "Lcom/revolut/revolutpay/api/params/Size;", "buttonSize", "Lia0/b;", "variantModes", "Lcom/revolut/revolutpay/api/params/BoxText;", "boxText", "Lcom/revolut/revolutpay/api/params/BoxTextCurrency;", "boxTextCurrency", "Lcom/revolut/revolutpay/api/params/BoxTextValue;", "boxTextValue", "<init>", "(Lcom/revolut/revolutpay/api/params/Radius;Lcom/revolut/revolutpay/api/params/Size;Lia0/b;Lcom/revolut/revolutpay/api/params/BoxText;Lcom/revolut/revolutpay/api/params/BoxTextCurrency;Lcom/revolut/revolutpay/api/params/BoxTextValue;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/revolut/revolutpay/api/params/Radius;", "e", "()Lcom/revolut/revolutpay/api/params/Radius;", "b", "Lcom/revolut/revolutpay/api/params/Size;", "d", "()Lcom/revolut/revolutpay/api/params/Size;", "c", "Lia0/b;", "f", "()Lia0/b;", "Lcom/revolut/revolutpay/api/params/BoxText;", "()Lcom/revolut/revolutpay/api/params/BoxText;", "Lcom/revolut/revolutpay/api/params/BoxTextCurrency;", "()Lcom/revolut/revolutpay/api/params/BoxTextCurrency;", "Lcom/revolut/revolutpay/api/params/BoxTextValue;", "()Lcom/revolut/revolutpay/api/params/BoxTextValue;", "g", "Companion", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class ButtonParams {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Radius radius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Size buttonSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final VariantModes variantModes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final BoxText boxText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final BoxTextCurrency boxTextCurrency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final BoxTextValue boxTextValue;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/revolut/revolutpay/api/params/ButtonParams$Companion;", "", "()V", "default", "Lcom/revolut/revolutpay/api/params/ButtonParams;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final ButtonParams m103800default() {
            return new ButtonParams(Radius.NONE, Size.LARGE, new VariantModes(null, null, 3, null), BoxText.NONE, null, null, 48, null);
        }
    }

    public ButtonParams(@NotNull Radius radius, @NotNull Size buttonSize, @NotNull VariantModes variantModes, @NotNull BoxText boxText, @NotNull BoxTextCurrency boxTextCurrency, @NotNull BoxTextValue boxTextValue) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        Intrinsics.checkNotNullParameter(variantModes, "variantModes");
        Intrinsics.checkNotNullParameter(boxText, "boxText");
        Intrinsics.checkNotNullParameter(boxTextCurrency, "boxTextCurrency");
        Intrinsics.checkNotNullParameter(boxTextValue, "boxTextValue");
        this.radius = radius;
        this.buttonSize = buttonSize;
        this.variantModes = variantModes;
        this.boxText = boxText;
        this.boxTextCurrency = boxTextCurrency;
        this.boxTextValue = boxTextValue;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonParams)) {
            return false;
        }
        ButtonParams buttonParams = (ButtonParams) other;
        return this.radius == buttonParams.radius && this.buttonSize == buttonParams.buttonSize && Intrinsics.areEqual(this.variantModes, buttonParams.variantModes) && this.boxText == buttonParams.boxText && this.boxTextCurrency == buttonParams.boxTextCurrency && this.boxTextValue == buttonParams.boxTextValue;
    }

    public /* synthetic */ ButtonParams(Radius radius, Size size, VariantModes variantModes, BoxText boxText, BoxTextCurrency boxTextCurrency, BoxTextValue boxTextValue, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(radius, size, variantModes, boxText, (i11 & 16) != 0 ? BoxTextCurrency.GBP : boxTextCurrency, (i11 & 32) != 0 ? BoxTextValue.HIGH : boxTextValue);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BoxText getBoxText() {
        return this.boxText;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BoxTextCurrency getBoxTextCurrency() {
        return this.boxTextCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BoxTextValue getBoxTextValue() {
        return this.boxTextValue;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Size getButtonSize() {
        return this.buttonSize;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Radius getRadius() {
        return this.radius;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final VariantModes getVariantModes() {
        return this.variantModes;
    }

    public int hashCode() {
        return (((((((((this.radius.hashCode() * 31) + this.buttonSize.hashCode()) * 31) + this.variantModes.hashCode()) * 31) + this.boxText.hashCode()) * 31) + this.boxTextCurrency.hashCode()) * 31) + this.boxTextValue.hashCode();
    }

    @NotNull
    public String toString() {
        return "ButtonParams(radius=" + this.radius + ", buttonSize=" + this.buttonSize + ", variantModes=" + this.variantModes + ", boxText=" + this.boxText + ", boxTextCurrency=" + this.boxTextCurrency + ", boxTextValue=" + this.boxTextValue + ')';
    }
}

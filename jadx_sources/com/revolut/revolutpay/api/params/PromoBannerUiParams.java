package com.revolut.revolutpay.api.params;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ya0.AbstractC46424c;
import ya0.C46422a;
import ya0.C46423b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, m90084d2 = {"Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;", "", "", "strokeWidth", "bannerCornerRadius", "", "colorAccent", "Lya0/c;", "backgroundTextColorVariant", "foregroundTextColorVariant", "<init>", "(FFILya0/c;Lya0/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "F", "e", "()F", "b", "c", "I", "d", "Lya0/c;", "()Lya0/c;", "f", "Companion", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final /* data */ class PromoBannerUiParams {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final float strokeWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float bannerCornerRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int colorAccent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC46424c backgroundTextColorVariant;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC46424c foregroundTextColorVariant;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/revolut/revolutpay/api/params/PromoBannerUiParams$Companion;", "", "()V", "default", "Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final PromoBannerUiParams m103801default() {
            return new PromoBannerUiParams(0.0f, 12.0f, Color.parseColor("#0666EB"), C46422a.f104092d, C46423b.f104093d);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBannerUiParams)) {
            return false;
        }
        PromoBannerUiParams promoBannerUiParams = (PromoBannerUiParams) other;
        return Float.compare(this.strokeWidth, promoBannerUiParams.strokeWidth) == 0 && Float.compare(this.bannerCornerRadius, promoBannerUiParams.bannerCornerRadius) == 0 && this.colorAccent == promoBannerUiParams.colorAccent && Intrinsics.areEqual(this.backgroundTextColorVariant, promoBannerUiParams.backgroundTextColorVariant) && Intrinsics.areEqual(this.foregroundTextColorVariant, promoBannerUiParams.foregroundTextColorVariant);
    }

    public PromoBannerUiParams(float f11, float f12, @ColorInt int i11, @NotNull AbstractC46424c backgroundTextColorVariant, @NotNull AbstractC46424c foregroundTextColorVariant) {
        Intrinsics.checkNotNullParameter(backgroundTextColorVariant, "backgroundTextColorVariant");
        Intrinsics.checkNotNullParameter(foregroundTextColorVariant, "foregroundTextColorVariant");
        this.strokeWidth = f11;
        this.bannerCornerRadius = f12;
        this.colorAccent = i11;
        this.backgroundTextColorVariant = backgroundTextColorVariant;
        this.foregroundTextColorVariant = foregroundTextColorVariant;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC46424c getBackgroundTextColorVariant() {
        return this.backgroundTextColorVariant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBannerCornerRadius() {
        return this.bannerCornerRadius;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getColorAccent() {
        return this.colorAccent;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC46424c getForegroundTextColorVariant() {
        return this.foregroundTextColorVariant;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.strokeWidth) * 31) + Float.hashCode(this.bannerCornerRadius)) * 31) + Integer.hashCode(this.colorAccent)) * 31) + this.backgroundTextColorVariant.hashCode()) * 31) + this.foregroundTextColorVariant.hashCode();
    }

    @NotNull
    public String toString() {
        return "PromoBannerUiParams(strokeWidth=" + this.strokeWidth + ", bannerCornerRadius=" + this.bannerCornerRadius + ", colorAccent=" + this.colorAccent + ", backgroundTextColorVariant=" + this.backgroundTextColorVariant + ", foregroundTextColorVariant=" + this.foregroundTextColorVariant + ')';
    }
}

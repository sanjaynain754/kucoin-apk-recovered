package com.kubi.payment.fast.data.entities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MerchantInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/MerchantHighlight;", "", "iconType", "", "text", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getIconType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "getMerchantIcon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/MerchantHighlight;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MerchantHighlight {

    @Nullable
    private final Integer iconType;

    @Nullable
    private final String text;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantHighlight)) {
            return false;
        }
        MerchantHighlight merchantHighlight = (MerchantHighlight) other;
        return Intrinsics.areEqual(this.iconType, merchantHighlight.iconType) && Intrinsics.areEqual(this.text, merchantHighlight.text);
    }

    public static /* synthetic */ MerchantHighlight copy$default(MerchantHighlight merchantHighlight, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = merchantHighlight.iconType;
        }
        if ((i11 & 2) != 0) {
            str = merchantHighlight.text;
        }
        return merchantHighlight.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getIconType() {
        return this.iconType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final MerchantHighlight copy(@Nullable Integer iconType, @Nullable String text) {
        return new MerchantHighlight(iconType, text);
    }

    @Nullable
    public final Integer getIconType() {
        return this.iconType;
    }

    @Nullable
    public final Drawable getMerchantIcon(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = this.iconType;
        if (num != null && num.intValue() == 1) {
            return ContextCompat.getDrawable(context, R$drawable.ic2_fastmode_thin_12);
        }
        if (num != null && num.intValue() == 2) {
            return ContextCompat.getDrawable(context, R$drawable.ic2_hook_12);
        }
        if (num != null && num.intValue() == 3) {
            return ContextCompat.getDrawable(context, R$drawable.ic2_activity_center_12);
        }
        if (num != null && num.intValue() == 4) {
            return ContextCompat.getDrawable(context, R$drawable.ic2_limit_12);
        }
        return null;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Integer num = this.iconType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MerchantHighlight(iconType=" + this.iconType + ", text=" + this.text + ')';
    }

    public MerchantHighlight(@Nullable Integer num, @Nullable String str) {
        this.iconType = num;
        this.text = str;
    }
}

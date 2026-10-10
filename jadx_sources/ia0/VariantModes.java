package ia0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.api.params.Variant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ia0.b, reason: from toString */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lia0/b;", "", "Lcom/revolut/revolutpay/api/params/Variant;", "lightMode", "darkMode", "<init>", "(Lcom/revolut/revolutpay/api/params/Variant;Lcom/revolut/revolutpay/api/params/Variant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/revolut/revolutpay/api/params/Variant;", "b", "()Lcom/revolut/revolutpay/api/params/Variant;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class VariantModes {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Variant lightMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Variant darkMode;

    /* JADX WARN: Multi-variable type inference failed */
    public VariantModes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantModes)) {
            return false;
        }
        VariantModes variantModes = (VariantModes) other;
        return this.lightMode == variantModes.lightMode && this.darkMode == variantModes.darkMode;
    }

    public VariantModes(@NotNull Variant lightMode, @NotNull Variant darkMode) {
        Intrinsics.checkNotNullParameter(lightMode, "lightMode");
        Intrinsics.checkNotNullParameter(darkMode, "darkMode");
        this.lightMode = lightMode;
        this.darkMode = darkMode;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Variant getDarkMode() {
        return this.darkMode;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Variant getLightMode() {
        return this.lightMode;
    }

    public int hashCode() {
        return (this.lightMode.hashCode() * 31) + this.darkMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "VariantModes(lightMode=" + this.lightMode + ", darkMode=" + this.darkMode + ')';
    }

    public /* synthetic */ VariantModes(Variant variant, Variant variant2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Variant.DARK : variant, (i11 & 2) != 0 ? Variant.LIGHT : variant2);
    }
}

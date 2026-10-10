package qa0;

import com.revolut.revolutpay.R$style;
import com.revolut.revolutpay.api.params.Variant;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qa0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C43677b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43677b f96508a = new C43677b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Integer[][] f96509b = {new Integer[]{Integer.valueOf(R$style.InternalRevolutPay_Black), Integer.valueOf(R$style.InternalRevolutPay_Black_White), Integer.valueOf(R$style.InternalRevolutPay_Black_WhiteOutlined), Integer.valueOf(R$style.InternalRevolutPay_Black_BlackOutlined)}, new Integer[]{Integer.valueOf(R$style.InternalRevolutPay_White_Black), Integer.valueOf(R$style.InternalRevolutPay_White), Integer.valueOf(R$style.InternalRevolutPay_White_BlackOutlined), Integer.valueOf(R$style.InternalRevolutPay_White_WhiteOutlined)}, new Integer[]{Integer.valueOf(R$style.InternalRevolutPay_BlackOutlined_Black), Integer.valueOf(R$style.InternalRevolutPay_BlackOutlined_White), Integer.valueOf(R$style.InternalRevolutPay_BlackOutlined), Integer.valueOf(R$style.InternalRevolutPay_BlackOutlined_WhiteOutlined)}, new Integer[]{Integer.valueOf(R$style.InternalRevolutPay_WhiteOutlined_Black), Integer.valueOf(R$style.InternalRevolutPay_WhiteOutlined_White), Integer.valueOf(R$style.InternalRevolutPay_WhiteOutlined_BlackOutlined), Integer.valueOf(R$style.InternalRevolutPay_WhiteOutlined)}};

    /* JADX INFO: renamed from: qa0.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96510a;

        static {
            int[] iArr = new int[Variant.values().length];
            try {
                iArr[Variant.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variant.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variant.LIGHT_OUTLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Variant.DARK_OUTLINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96510a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m96135a(Variant variant) {
        int i11 = a.f96510a[variant.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final int m96136b(@NotNull Variant dayThemeStyle, @NotNull Variant nightThemeStyle) {
        Intrinsics.checkNotNullParameter(dayThemeStyle, "dayThemeStyle");
        Intrinsics.checkNotNullParameter(nightThemeStyle, "nightThemeStyle");
        return f96509b[m96135a(dayThemeStyle)][m96135a(nightThemeStyle)].intValue();
    }
}

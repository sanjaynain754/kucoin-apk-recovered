package qa0;

import com.revolut.revolutpay.api.params.BoxText;
import com.revolut.revolutpay.api.params.BoxTextCurrency;
import com.revolut.revolutpay.api.params.BoxTextValue;
import com.revolut.revolutpay.api.params.Radius;
import com.revolut.revolutpay.api.params.Size;
import com.revolut.revolutpay.api.params.Variant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qa0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C43676a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43676a f96507a = new C43676a();

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Radius m96131d(int i11) {
        if (i11 == 1) {
            return Radius.SMALL;
        }
        if (i11 != 2) {
            return i11 != 3 ? Radius.NONE : Radius.LARGE;
        }
        return Radius.MEDIUM;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Size m96132e(int i11) {
        if (i11 == 1) {
            return Size.MEDIUM;
        }
        if (i11 != 2) {
            return i11 != 3 ? Size.LARGE : Size.EXTRA_SMALL;
        }
        return Size.SMALL;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Variant m96134g(int i11) {
        if (i11 == 1) {
            return Variant.DARK;
        }
        if (i11 != 2) {
            return i11 != 3 ? Variant.LIGHT : Variant.DARK_OUTLINED;
        }
        return Variant.LIGHT_OUTLINED;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BoxText m96128a(int i11) {
        return (i11 == 0 || i11 != 1) ? BoxText.NONE : BoxText.GET_CASHBACK_VALUE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final BoxTextCurrency m96129b(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return BoxTextCurrency.EUR;
            }
            if (i11 == 2) {
                return BoxTextCurrency.USD;
            }
        }
        return BoxTextCurrency.GBP;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final BoxTextValue m96130c(int i11) {
        return (i11 == 0 || i11 != 1) ? BoxTextValue.HIGH : BoxTextValue.MEDIUM;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Variant m96133f(int i11) {
        if (i11 == 0) {
            return Variant.LIGHT;
        }
        if (i11 != 2) {
            return i11 != 3 ? Variant.DARK : Variant.DARK_OUTLINED;
        }
        return Variant.LIGHT_OUTLINED;
    }
}

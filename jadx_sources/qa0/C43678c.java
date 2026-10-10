package qa0;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.revolut.revolutpay.api.RevolutPayEnvironment;
import com.tencent.qcloud.tuicore.TUIConstants;
import oa0.C43005a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qa0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C43678c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43678c f96511a = new C43678c();

    /* JADX INFO: renamed from: qa0.c$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96512a;

        static {
            int[] iArr = new int[RevolutPayEnvironment.values().length];
            try {
                iArr[RevolutPayEnvironment.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RevolutPayEnvironment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96512a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m96138b(RevolutPayEnvironment revolutPayEnvironment) {
        int i11 = a.f96512a[revolutPayEnvironment.ordinal()];
        if (i11 == 1) {
            return "merchant.revolut.com";
        }
        if (i11 == 2) {
            return "sandbox-merchant.revolut.com";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Uri m96137a(@NotNull String orderToken, @NotNull String sessionToken, @NotNull String publicKey, boolean z11, @NotNull String language) {
        String strM96138b;
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(language, "language");
        C43005a c43005a = C43005a.f95164a;
        RevolutPayEnvironment revolutPayEnvironmentM94438d = c43005a.m94438d();
        if (revolutPayEnvironmentM94438d != null) {
            strM96138b = m96138b(revolutPayEnvironmentM94438d);
        } else {
            strM96138b = null;
        }
        String strValueOf = String.valueOf(c43005a.m94441g());
        c43005a.m94435a();
        return new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(strM96138b).appendPath("page-revolut-pay.html").appendQueryParameter("locale", language).appendQueryParameter("orderToken", orderToken).appendQueryParameter("sessionToken", sessionToken).appendQueryParameter("publicKey", publicKey).appendQueryParameter("returnUrl", strValueOf).appendQueryParameter("requestShipping", String.valueOf(z11)).appendQueryParameter("customer.name", null).appendQueryParameter("customer.email", null).appendQueryParameter("customer.phone", null).appendQueryParameter("customer.dob.day", null).appendQueryParameter("customer.dob.month", null).appendQueryParameter("customer.dob.year", null).appendQueryParameter(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "mobile-sdk").build();
    }
}

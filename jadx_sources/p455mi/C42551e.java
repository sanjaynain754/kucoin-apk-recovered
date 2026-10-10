package p455mi;

import android.net.Uri;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: mi.e */
/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponRouter;", "", "<init>", "()V", "PATH", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "symbol", "buildUrl", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42551e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42551e f94227a = new C42551e();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m93284a(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String string = Uri.parse(StringsKt.removeSuffix(HostManager.a.m(), (CharSequence) "/") + "/rewardshub/vouchers/fee-deduction").buildUpon().appendQueryParameter("prizeType", "4").appendQueryParameter("symbol", symbol).appendQueryParameter("redirect", CredentialEntry.FALSE_STRING).appendQueryParameter("loading", "2").appendQueryParameter("needLogin", CredentialEntry.TRUE_STRING).appendQueryParameter("appNeedLang", CredentialEntry.TRUE_STRING).appendQueryParameter("lang", MultiLanguageManager.f46811g.getLocale().toString()).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m93285b(@Nullable String str) {
        C37304a c37304a = C37304a.f82764a;
        if (str == null) {
            str = "";
        }
        InterfaceC37766r.a.m85190a(c37304a, m93284a(str), null, null, null, null, null, null, 126, null);
    }
}

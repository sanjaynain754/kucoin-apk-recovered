package vi;

import android.net.Uri;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.host.HostManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vi.b */
/* JADX INFO: compiled from: HelpCenterUrlConstant.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/helpcenter/api/HelpCenterUrlConstant;", "", "<init>", "()V", "BASE_H5_URL", "", "getCustomerServiceDefaultUrl", "source", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45555b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45555b f102657a = new C45555b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f102658b = HostManager.a.m();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100609a(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String string = Uri.parse(f102658b).buildUpon().appendEncodedPath("support/app/help").appendQueryParameter("source", source).appendQueryParameter("appNeedLang", CredentialEntry.TRUE_STRING).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

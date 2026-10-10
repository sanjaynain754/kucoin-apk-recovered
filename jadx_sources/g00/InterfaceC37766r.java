package g00;

import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.r */
/* JADX INFO: compiled from: KCRouterBridgeWebViewCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J_\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lg00/r;", "", "", "url", "title", "", "loading", "", "dark", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "x0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "G", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37766r {

    /* JADX INFO: renamed from: g00.r$a */
    /* JADX INFO: compiled from: KCRouterBridgeWebViewCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85190a(InterfaceC37766r interfaceC37766r, String str, String str2, Long l11, Boolean bool, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpKcWeb");
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                l11 = null;
            }
            if ((i11 & 8) != 0) {
                bool = null;
            }
            if ((i11 & 16) != 0) {
                str3 = null;
            }
            if ((i11 & 32) != 0) {
                iRedirect = null;
            }
            if ((i11 & 64) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37766r.mo83809x0(str, str2, l11, bool, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85191b(InterfaceC37766r interfaceC37766r, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpOsWeb");
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                iRedirect = null;
            }
            if ((i11 & 8) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37766r.mo83594G(str, str2, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: G */
    boolean mo83594G(@NotNull String url, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: x0 */
    boolean mo83809x0(@NotNull String url, @Nullable String title, @Nullable Long loading, @Nullable Boolean dark, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

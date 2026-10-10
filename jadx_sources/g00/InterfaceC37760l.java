package g00;

import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.l */
/* JADX INFO: compiled from: KCRouterBridgeSearchCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jc\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lg00/l;", "", "", "from", "data", "resourceType", "coin", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "", "v0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37760l {

    /* JADX INFO: renamed from: g00.l$a */
    /* JADX INFO: compiled from: KCRouterBridgeSearchCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85175a(InterfaceC37760l interfaceC37760l, String str, String str2, String str3, String str4, String str5, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSearch");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                str4 = null;
            }
            if ((i11 & 16) != 0) {
                str5 = null;
            }
            if ((i11 & 32) != 0) {
                iRedirect = null;
            }
            if ((i11 & 64) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37760l.mo83799v0(str, str2, str3, str4, str5, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: v0 */
    boolean mo83799v0(@Nullable String from, @Nullable String data, @Nullable String resourceType, @Nullable String coin, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

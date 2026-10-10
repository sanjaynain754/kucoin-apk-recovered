package g00;

import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.s */
/* JADX INFO: compiled from: KCRouterBridgeWelfareCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ_\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lg00/s;", "", "", "checkedForNew", "", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "M", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "id", "fromHistory", "isSend", "code", "p0", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "y0", "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37767s {

    /* JADX INFO: renamed from: g00.s$a */
    /* JADX INFO: compiled from: KCRouterBridgeWelfareCenterCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85192a(InterfaceC37767s interfaceC37767s, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpHistoryRedPacket");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                iRedirect = null;
            }
            if ((i11 & 4) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37767s.mo83814y0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85193b(InterfaceC37767s interfaceC37767s, String str, Boolean bool, Boolean bool2, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpReceiveRedPacket");
            }
            if ((i11 & 2) != 0) {
                bool = null;
            }
            if ((i11 & 4) != 0) {
                bool2 = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
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
            return interfaceC37767s.mo83769p0(str, bool, bool2, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85194c(InterfaceC37767s interfaceC37767s, Boolean bool, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSendRedPacket");
            }
            if ((i11 & 1) != 0) {
                bool = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                iRedirect = null;
            }
            if ((i11 & 8) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37767s.mo83624M(bool, str, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: M */
    boolean mo83624M(@Nullable Boolean checkedForNew, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: p0 */
    boolean mo83769p0(@NotNull String id2, @Nullable Boolean fromHistory, @Nullable Boolean isSend, @Nullable String code, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: y0 */
    boolean mo83814y0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

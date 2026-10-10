package g00;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.p */
/* JADX INFO: compiled from: KCRouterBridgeUserCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J{\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0093\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0017\u0010\u0016J?\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001f\u0010 J;\u0010!\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m90084d2 = {"Lg00/p;", "", "", "isPhone", "", "data", "phoneCode", "backHome", "redirectToHome", "utm_campaign", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "n", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "rcode", "from", "m", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "f", "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "K0", "url", "L", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "autoCreatePasskey", "X", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "type", "j0", "(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", ExifInterface.LONGITUDE_WEST, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37764p {

    /* JADX INFO: renamed from: g00.p$a */
    /* JADX INFO: compiled from: KCRouterBridgeUserCenterCall.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85180a(InterfaceC37764p interfaceC37764p, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLoadingAnimationWeb");
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
            return interfaceC37764p.mo83674W(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85181b(InterfaceC37764p interfaceC37764p, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLogin");
            }
            if ((i11 & 1) != 0) {
                bool = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                bool2 = null;
            }
            if ((i11 & 16) != 0) {
                bool3 = null;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            if ((i11 & 128) != 0) {
                iRedirect = null;
            }
            if ((i11 & 256) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37764p.mo83758n(bool, str, str2, bool2, bool3, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85182c(InterfaceC37764p interfaceC37764p, Boolean bool, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPasskeyManager");
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
            return interfaceC37764p.mo83679X(bool, str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m85183d(InterfaceC37764p interfaceC37764p, boolean z11, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpResetPasswordAccountPage");
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                iRedirect = null;
            }
            if ((i11 & 16) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37764p.mo83739j0(z11, str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m85184e(InterfaceC37764p interfaceC37764p, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSetNickname");
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
            return interfaceC37764p.mo83718f(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m85185f(InterfaceC37764p interfaceC37764p, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, String str3, String str4, String str5, String str6, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSignUp");
            }
            if ((i11 & 1) != 0) {
                bool = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                bool2 = null;
            }
            if ((i11 & 16) != 0) {
                bool3 = null;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            if ((i11 & 128) != 0) {
                str5 = null;
            }
            if ((i11 & 256) != 0) {
                str6 = null;
            }
            if ((i11 & 512) != 0) {
                iRedirect = null;
            }
            if ((i11 & 1024) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37764p.mo83753m(bool, str, str2, bool2, bool3, str3, str4, str5, str6, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ boolean m85186g(InterfaceC37764p interfaceC37764p, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpTelegramLogin");
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
            return interfaceC37764p.mo83615K0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ boolean m85187h(InterfaceC37764p interfaceC37764p, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpVideo");
            }
            if ((i11 & 1) != 0) {
                str = null;
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
            return interfaceC37764p.mo83619L(str, str2, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: K0 */
    boolean mo83615K0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: L */
    boolean mo83619L(@Nullable String url, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: W */
    boolean mo83674W(@NotNull String url, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: X */
    boolean mo83679X(@Nullable Boolean autoCreatePasskey, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: f */
    boolean mo83718f(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: j0 */
    boolean mo83739j0(boolean type, @NotNull String data, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: m */
    boolean mo83753m(@Nullable Boolean isPhone, @Nullable String data, @Nullable String phoneCode, @Nullable Boolean backHome, @Nullable Boolean redirectToHome, @Nullable String utm_campaign, @Nullable String rcode, @Nullable String from, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: n */
    boolean mo83758n(@Nullable Boolean isPhone, @Nullable String data, @Nullable String phoneCode, @Nullable Boolean backHome, @Nullable Boolean redirectToHome, @Nullable String utm_campaign, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

package g00;

import com.kubi.router.model.IRedirect;
import com.kubi.sdk.protocol.router.protocol.KCRouterBridgeSafeCenterScanTokenEntity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.k */
/* JADX INFO: compiled from: KCRouterBridgeSafeCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJG\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000f\u0010\nJC\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0017\u0010\u000eJ?\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u001b\u0010\nJ?\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lg00/k;", "", "", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "", "f0", "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "type", "title", "F", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "g0", InterfaceC33826o0.f71244p, "Lcom/kubi/sdk/protocol/router/protocol/KCRouterBridgeSafeCenterScanTokenEntity;", "tokenEntity", "e0", "(Ljava/lang/String;Lcom/kubi/sdk/protocol/router/protocol/KCRouterBridgeSafeCenterScanTokenEntity;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "riskBizType", "riskCheckResult", "y", "backHome", "K", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "h0", "time", "I0", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37759k {

    /* JADX INFO: renamed from: g00.k$a */
    /* JADX INFO: compiled from: KCRouterBridgeSafeCenterCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85167a(InterfaceC37759k interfaceC37759k, String str, KCRouterBridgeSafeCenterScanTokenEntity kCRouterBridgeSafeCenterScanTokenEntity, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpAuthLogin");
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
            return interfaceC37759k.mo83714e0(str, kCRouterBridgeSafeCenterScanTokenEntity, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85168b(InterfaceC37759k interfaceC37759k, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFreezingActivity");
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
            return interfaceC37759k.mo83605I0(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85169c(InterfaceC37759k interfaceC37759k, Boolean bool, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpGestureUnlock");
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
            return interfaceC37759k.mo83614K(bool, str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m85170d(InterfaceC37759k interfaceC37759k, String str, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpRiskCheck");
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
                iRedirect = null;
            }
            if ((i11 & 16) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37759k.mo83813y(str, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m85171e(InterfaceC37759k interfaceC37759k, String str, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSafeCheck");
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                iRedirect = null;
            }
            if ((i11 & 16) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37759k.mo83589F(str, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m85172f(InterfaceC37759k interfaceC37759k, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSafeSettings");
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
            return interfaceC37759k.mo83719f0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ boolean m85173g(InterfaceC37759k interfaceC37759k, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSetLoginPwd");
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
            return interfaceC37759k.mo83724g0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ boolean m85174h(InterfaceC37759k interfaceC37759k, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpThirdAccountSetting");
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
            return interfaceC37759k.mo83729h0(str, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: F */
    boolean mo83589F(@NotNull String type, @Nullable String title, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: I0 */
    boolean mo83605I0(@Nullable String time, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: K */
    boolean mo83614K(@Nullable Boolean backHome, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: e0 */
    boolean mo83714e0(@NotNull String token, @NotNull KCRouterBridgeSafeCenterScanTokenEntity tokenEntity, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: f0 */
    boolean mo83719f0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: g0 */
    boolean mo83724g0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: h0 */
    boolean mo83729h0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: y */
    boolean mo83813y(@Nullable String riskBizType, @Nullable String riskCheckResult, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

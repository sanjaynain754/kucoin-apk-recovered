package g00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.j */
/* JADX INFO: compiled from: KCRouterBridgePaymentCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\bf\u0018\u00002\u00020\u0001Jc\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJS\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010\u001a\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010\u001f\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u001f\u0010\u001eJG\u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b \u0010\u0018JK\u0010\"\u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\"\u0010\u001eJ?\u0010#\u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b#\u0010$JS\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b'\u0010(JS\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b,\u0010-J3\u0010.\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b.\u0010/JC\u00102\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b2\u00103JW\u00106\u001a\u00020\r2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b6\u0010(J?\u00107\u001a\u00020\r2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b7\u0010$¨\u00068"}, m90084d2 = {"Lg00/j;", "", "", "type", "", "fiat", "coin", FirebaseAnalytics.Param.CURRENCY, "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "", "D0", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "isBuy", "id", "isCreateOrder", "p", "(JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "index", AppsFlyerProperties.CHANNEL, "G0", "(JLjava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "title", "C0", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "backHome", "c", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "e", CmcdData.Factory.STREAMING_FORMAT_HLS, "orderId", "H0", "c0", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "from", "channelId", "r0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "tradeType", "paymentMethodCode", "fiatCurrency", "Z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "s0", "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "content", "source", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "side", "cryptoCurrency", "P", "m0", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37758j {

    /* JADX INFO: renamed from: g00.j$a */
    /* JADX INFO: compiled from: KCRouterBridgePaymentCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85152a(InterfaceC37758j interfaceC37758j, String str, String str2, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpCapitualKycResult");
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
                iRedirect = null;
            }
            if ((i11 & 32) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37758j.mo83779r0(str, str2, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85153b(InterfaceC37758j interfaceC37758j, String str, String str2, String str3, String str4, String str5, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpCapitualKycSubmit");
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
            return interfaceC37758j.mo83689Z(str, str2, str3, str4, str5, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85154c(InterfaceC37758j interfaceC37758j, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpEasyEuroWithdrawInput");
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
            return interfaceC37758j.mo83784s0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m85155d(InterfaceC37758j interfaceC37758j, String str, String str2, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFastTrade");
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
                iRedirect = null;
            }
            if ((i11 & 32) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37758j.mo83639P(str, str2, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m85156e(InterfaceC37758j interfaceC37758j, long j11, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFiatOrderRecord");
            }
            if ((i11 & 2) != 0) {
                str = null;
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
            return interfaceC37758j.mo83728h(j11, str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m85157f(InterfaceC37758j interfaceC37758j, String str, Long l11, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFiatRecharge");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                l11 = null;
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
            return interfaceC37758j.mo83703c(str, l11, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ boolean m85158g(InterfaceC37758j interfaceC37758j, String str, Long l11, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFiatRechargeDetail");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                l11 = null;
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
            return interfaceC37758j.mo83600H0(str, l11, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ boolean m85159h(InterfaceC37758j interfaceC37758j, String str, Long l11, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFiatWithdraw");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                l11 = null;
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
            return interfaceC37758j.mo83713e(str, l11, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ boolean m85160i(InterfaceC37758j interfaceC37758j, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFiatWithdrawDetail");
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
            return interfaceC37758j.mo83704c0(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ boolean m85161j(InterfaceC37758j interfaceC37758j, String str, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpKuCoinPayQrCode");
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
            return interfaceC37758j.mo83763o(str, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ boolean m85162k(InterfaceC37758j interfaceC37758j, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpP2P");
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
            return interfaceC37758j.mo83754m0(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ boolean m85163l(InterfaceC37758j interfaceC37758j, Long l11, String str, String str2, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPayHome");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            if ((i11 & 32) != 0) {
                iRedirect = null;
            }
            if ((i11 & 64) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37758j.mo83580D0(l11, str, str2, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ boolean m85164m(InterfaceC37758j interfaceC37758j, long j11, String str, Boolean bool, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPayOrderDetail");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 16) != 0) {
                iRedirect = null;
            }
            if ((i11 & 32) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37758j.mo83768p(j11, str, bool, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ boolean m85165n(InterfaceC37758j interfaceC37758j, long j11, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPayOrderRecord");
            }
            if ((i11 & 2) != 0) {
                str = null;
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
            return interfaceC37758j.mo83595G0(j11, str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ boolean m85166o(InterfaceC37758j interfaceC37758j, Long l11, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPayP2PAds");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
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
            return interfaceC37758j.mo83575C0(l11, str, str2, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: C0 */
    boolean mo83575C0(@Nullable Long type, @Nullable String title, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: D0 */
    boolean mo83580D0(@Nullable Long type, @Nullable String fiat, @Nullable String coin, @Nullable String currency, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: G0 */
    boolean mo83595G0(long index, @Nullable String channel, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: H0 */
    boolean mo83600H0(@Nullable String orderId, @Nullable Long backHome, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: P */
    boolean mo83639P(@Nullable String side, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: Z */
    boolean mo83689Z(@NotNull String tradeType, @NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String fiatCurrency, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: c */
    boolean mo83703c(@Nullable String fiat, @Nullable Long backHome, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: c0 */
    boolean mo83704c0(@Nullable String orderId, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: e */
    boolean mo83713e(@Nullable String fiat, @Nullable Long backHome, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: h */
    boolean mo83728h(long index, @Nullable String fiat, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: m0 */
    boolean mo83754m0(@Nullable String side, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: o */
    boolean mo83763o(@NotNull String content, @NotNull String source, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: p */
    boolean mo83768p(long isBuy, @Nullable String id2, @Nullable Boolean isCreateOrder, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: r0 */
    boolean mo83779r0(@NotNull String from, @Nullable String channelId, @Nullable String currency, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: s0 */
    boolean mo83784s0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

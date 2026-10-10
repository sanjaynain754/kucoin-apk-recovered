package g00;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.f */
/* JADX INFO: compiled from: KCRouterBridgeHomeCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\r\bf\u0018\u00002\u00020\u0001JW\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJc\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001a\u0010\u001bJW\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001f\u0010 JK\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b!\u0010 JK\u0010\"\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\"\u0010 J?\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b#\u0010$J{\u0010*\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b*\u0010+J?\u0010-\u001a\u00020\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b-\u0010$J3\u0010.\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b.\u0010/JK\u00100\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b0\u00101J3\u00102\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b2\u0010/¨\u00063"}, m90084d2 = {"Lg00/f;", "", "", "toLogin", "", "waitedSignTerms", "restart", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "mainTab", "subTab", "uiStateValue", "info", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "", "type", "symbol", "isBuy", "fromMarket", "currencySeq", "k0", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "bottomTab", "A0", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "i", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "r", "O", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "side", "", "leverage", "leadUserId", "europeUnlockLeverage", "B", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "from", ExifInterface.GPS_DIRECTION_TRUE, "J0", "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "z", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "R", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37754f {

    /* JADX INFO: renamed from: g00.f$a */
    /* JADX INFO: compiled from: KCRouterBridgeHomeCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85129a(InterfaceC37754f interfaceC37754f, Long l11, Boolean bool, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpAlphaTrade");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            if ((i11 & 2) != 0) {
                bool = null;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                iRedirect = null;
            }
            if ((i11 & 16) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37754f.mo83818z(l11, bool, str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85130b(InterfaceC37754f interfaceC37754f, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpAssetHome");
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
            return interfaceC37754f.mo83659T(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85131c(InterfaceC37754f interfaceC37754f, String str, String str2, Double d11, String str3, String str4, String str5, String str6, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpFuturesHome");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                d11 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            if ((i11 & 32) != 0) {
                str5 = null;
            }
            if ((i11 & 64) != 0) {
                str6 = null;
            }
            if ((i11 & 128) != 0) {
                iRedirect = null;
            }
            if ((i11 & 256) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37754f.mo83569B(str, str2, d11, str3, str4, str5, str6, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m85132d(InterfaceC37754f interfaceC37754f, Boolean bool, String str, Boolean bool2, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpHome");
            }
            if ((i11 & 1) != 0) {
                bool = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                bool2 = null;
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
            return interfaceC37754f.mo83693a(bool, str, bool2, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m85133e(InterfaceC37754f interfaceC37754f, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpHomeCardConfig");
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
            return interfaceC37754f.mo83610J0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m85134f(InterfaceC37754f interfaceC37754f, String str, Boolean bool, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLeverIsolated");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                bool = null;
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
            return interfaceC37754f.mo83634O(str, bool, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ boolean m85135g(InterfaceC37754f interfaceC37754f, String str, Boolean bool, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLeverTrade");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                bool = null;
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
            return interfaceC37754f.mo83733i(str, bool, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ boolean m85136h(InterfaceC37754f interfaceC37754f, String str, Boolean bool, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLeverWhole");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                bool = null;
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
            return interfaceC37754f.mo83778r(str, bool, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ boolean m85137i(InterfaceC37754f interfaceC37754f, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpModeSelector");
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
            return interfaceC37754f.mo83649R(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ boolean m85138j(InterfaceC37754f interfaceC37754f, String str, String str2, String str3, String str4, String str5, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpQuotesHomeV2");
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
            return interfaceC37754f.mo83708d(str, str2, str3, str4, str5, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ boolean m85139k(InterfaceC37754f interfaceC37754f, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSpotGrid");
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
            return interfaceC37754f.mo83564A(str, str2, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ boolean m85140l(InterfaceC37754f interfaceC37754f, String str, Boolean bool, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSpotTrade");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                bool = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                iRedirect = null;
            }
            if ((i11 & 32) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37754f.mo83565A0(str, bool, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ boolean m85141m(InterfaceC37754f interfaceC37754f, Long l11, String str, Boolean bool, Boolean bool2, Long l12, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpTradeHome");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            if ((i11 & 8) != 0) {
                bool2 = null;
            }
            if ((i11 & 16) != 0) {
                l12 = null;
            }
            if ((i11 & 32) != 0) {
                str2 = null;
            }
            if ((i11 & 64) != 0) {
                iRedirect = null;
            }
            if ((i11 & 128) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37754f.mo83744k0(l11, str, bool, bool2, l12, str2, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: A */
    boolean mo83564A(@Nullable String symbol, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: A0 */
    boolean mo83565A0(@Nullable String symbol, @Nullable Boolean isBuy, @Nullable String bottomTab, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: B */
    boolean mo83569B(@Nullable String symbol, @Nullable String side, @Nullable Double leverage, @Nullable String bottomTab, @Nullable String leadUserId, @Nullable String europeUnlockLeverage, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: J0 */
    boolean mo83610J0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: O */
    boolean mo83634O(@Nullable String symbol, @Nullable Boolean isBuy, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: R */
    boolean mo83649R(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: T */
    boolean mo83659T(@Nullable String from, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: a */
    boolean mo83693a(@Nullable Boolean toLogin, @Nullable String waitedSignTerms, @Nullable Boolean restart, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: d */
    boolean mo83708d(@Nullable String mainTab, @Nullable String subTab, @Nullable String uiStateValue, @Nullable String info, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: i */
    boolean mo83733i(@Nullable String symbol, @Nullable Boolean isBuy, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: k0 */
    boolean mo83744k0(@Nullable Long type, @Nullable String symbol, @Nullable Boolean isBuy, @Nullable Boolean fromMarket, @Nullable Long currencySeq, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: r */
    boolean mo83778r(@Nullable String symbol, @Nullable Boolean isBuy, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: z */
    boolean mo83818z(@Nullable Long currencySeq, @Nullable Boolean isBuy, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

package g00;

import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.h */
/* JADX INFO: compiled from: KCRouterBridgeLeverCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0015\u0010\u0016Jo\u0010\u001a\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001f\u0010 JW\u0010!\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Lg00/h;", "", "", "type", "", "coin", "symbol", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "", "b0", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "isGrid", "fromType", "x", "(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "bizType", "positionType", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "index", "fromSymbol", "side", "t", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "pageId", "blockId", "locationId", "u", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37756h {

    /* JADX INFO: renamed from: g00.h$a */
    /* JADX INFO: compiled from: KCRouterBridgeLeverCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85143a(InterfaceC37756h interfaceC37756h, Long l11, String str, String str2, String str3, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLeverBorrowRecordPaying");
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
                iRedirect = null;
            }
            if ((i11 & 32) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37756h.mo83699b0(l11, str, str2, str3, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85144b(InterfaceC37756h interfaceC37756h, String str, String str2, String str3, String str4, String str5, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLeverBorrowRepay");
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
            return interfaceC37756h.mo83574C(str, str2, str3, str4, str5, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85145c(InterfaceC37756h interfaceC37756h, String str, String str2, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpMarginKlinePage");
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
            return interfaceC37756h.mo83723g(str, str2, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m85146d(InterfaceC37756h interfaceC37756h, String str, Long l11, String str2, String str3, String str4, String str5, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpMarginOrderCenter");
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
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            if ((i11 & 32) != 0) {
                str5 = null;
            }
            if ((i11 & 64) != 0) {
                iRedirect = null;
            }
            if ((i11 & 128) != 0) {
                interfaceC36555b = null;
            }
            return interfaceC37756h.mo83788t(str, l11, str2, str3, str4, str5, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m85147e(InterfaceC37756h interfaceC37756h, Long l11, String str, String str2, String str3, String str4, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpOpenMarginEtfTrade");
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
            return interfaceC37756h.mo83793u(l11, str, str2, str3, str4, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m85148f(InterfaceC37756h interfaceC37756h, boolean z11, String str, String str2, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpTradeSetting");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
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
            return interfaceC37756h.mo83808x(z11, str, str2, iRedirect, (i11 & 16) != 0 ? null : interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: C */
    boolean mo83574C(@Nullable String coin, @Nullable String symbol, @Nullable String bizType, @Nullable String positionType, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: b0 */
    boolean mo83699b0(@Nullable Long type, @Nullable String coin, @Nullable String symbol, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: g */
    boolean mo83723g(@Nullable String positionType, @Nullable String symbol, @Nullable String coin, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: t */
    boolean mo83788t(@Nullable String positionType, @Nullable Long index, @Nullable String symbol, @Nullable String fromSymbol, @Nullable String side, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: u */
    boolean mo83793u(@Nullable Long type, @Nullable String pageId, @Nullable String blockId, @Nullable String locationId, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: x */
    boolean mo83808x(boolean isGrid, @Nullable String fromType, @Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

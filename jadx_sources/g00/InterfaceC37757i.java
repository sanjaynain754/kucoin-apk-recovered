package g00;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.router.model.IRedirect;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g00.i */
/* JADX INFO: compiled from: KCRouterBridgeMineCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ3\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m90084d2 = {"Lg00/i;", "", "", "spm", "Lcom/kubi/router/model/IRedirect;", "redirect", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z", "a0", "N", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37757i {

    /* JADX INFO: renamed from: g00.i$a */
    /* JADX INFO: compiled from: KCRouterBridgeMineCenterCall.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m85149a(InterfaceC37757i interfaceC37757i, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpJoinBeta");
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
            return interfaceC37757i.mo83629N(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m85150b(InterfaceC37757i interfaceC37757i, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSetWidget");
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
            return interfaceC37757i.mo83694a0(str, iRedirect, interfaceC36555b);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m85151c(InterfaceC37757i interfaceC37757i, String str, IRedirect iRedirect, InterfaceC36555b interfaceC36555b, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSettings");
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
            return interfaceC37757i.mo83584E(str, iRedirect, interfaceC36555b);
        }
    }

    /* JADX INFO: renamed from: E */
    boolean mo83584E(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: N */
    boolean mo83629N(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);

    /* JADX INFO: renamed from: a0 */
    boolean mo83694a0(@Nullable String spm, @Nullable IRedirect redirect, @Nullable InterfaceC36555b result);
}

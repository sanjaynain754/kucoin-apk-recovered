package lt;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: lt.j */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"notAvailable", "", "Landroidx/fragment/app/Fragment;", "P2P_RN_REMOTE_CONFIG_KEY", "", "jumpRnP2P", "", "postcard", "Lcom/kubi/router/model/Postcard;", "route", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/kubi/otc/utils/UtilsKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,33:1\n29#2:34\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/kubi/otc/utils/UtilsKt\n*L\n30#1:34\n*E\n"})
public final class C42305j {
    /* JADX INFO: renamed from: b */
    public static final boolean m92853b(@Nullable Fragment fragment) {
        return fragment == null || !fragment.isAdded() || fragment.getView() == null || fragment.isRemoving() || fragment.isDetached();
    }

    /* JADX INFO: renamed from: a */
    public static final void m92852a(@NotNull C4400a postcard, @NotNull String route) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        Intrinsics.checkNotNullParameter(route, "route");
        Bundle bundle = postcard.getBundle();
        bundle.putString(Constants.COMPONENT, "kucoin_p2p_rn");
        bundle.putString(Constants.BIZ, "p2p");
        bundle.putString("entry", "main");
        bundle.putString("route", Uri.encode(route));
        new C4400a(Uri.parse(postcard.getUri().getScheme() + "://krn/router"), postcard.getBundle()).m4048k();
    }
}

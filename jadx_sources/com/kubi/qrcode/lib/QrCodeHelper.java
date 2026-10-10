package com.kubi.qrcode.lib;

import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.user.api.IUserService;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrCodeHelper.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/qrcode/lib/QrCodeHelper;", "", "<init>", "()V", "TAG", "", "handleQrCode", "", "baseActivity", "Landroidx/fragment/app/FragmentActivity;", "scanCode", "callerHandlesUnknownCode", "webLogin", "", "uri", "Landroid/net/Uri;", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QrCodeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QrCodeHelper f40831a = new QrCodeHelper();

    /* JADX INFO: renamed from: d */
    public static final Unit m50080d(Uri uri, FragmentActivity fragmentActivity) {
        String queryParameter = uri.getQueryParameter(InterfaceC33826o0.f71244p);
        if (queryParameter == null || queryParameter.length() == 0) {
            return Unit.INSTANCE;
        }
        LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new QrCodeHelper$webLogin$1$1(queryParameter, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50081b(@NotNull FragmentActivity baseActivity, @NotNull String scanCode, boolean z11) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(scanCode, "scanCode");
        try {
            Uri uri = Uri.parse(scanCode);
            if (uri.getQueryParameterNames().contains(SignTermItem.LINK)) {
                Uri uri2 = Uri.parse(uri.getQueryParameter(SignTermItem.LINK));
                if (Intrinsics.areEqual(uri2.getScheme(), "kucoin") && Intrinsics.areEqual("/authorizeToken", uri2.getPath())) {
                    Intrinsics.checkNotNull(uri2);
                    m50082c(baseActivity, uri2);
                    return true;
                }
                if (!z11) {
                    ToastCompat.m66437C(R$string.redpacket_wrong_code);
                    return true;
                }
            } else if (!z11) {
                ToastCompat.m66437C(R$string.redpacket_wrong_code);
                return true;
            }
        } catch (Exception e11) {
            Log.e("QrCodeHelper", "handleQrCode: exception is " + e11);
            if (!z11) {
                ToastCompat.m66437C(R$string.redpacket_wrong_code);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m50082c(final FragmentActivity fragmentActivity, final Uri uri) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.qrcode.lib.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QrCodeHelper.m50080d(uri, fragmentActivity);
            }
        }, 1, (Object) null);
    }
}

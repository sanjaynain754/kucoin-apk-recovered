package com.kubi.share.lib.flutter;

import android.graphics.Bitmap;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5290q;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.permissions.utils.PermissionCompat;
import com.kubi.share.R$string;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p741wy.InterfaceC45944d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.flutter.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterShareImgTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/share/lib/flutter/FlutterShareImgTransmit;", "Lcom/kubi/sdk/flutter/transmit/ICandyShareImgTransmit;", "<init>", "()V", "utmSource", "", "shareLink", "needQRCode", "", "shareBitmap", "Landroid/graphics/Bitmap;", "darkMode", "requestCodeShareImage", "", "handleMethod", "", "context", "Landroidx/fragment/app/FragmentActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "onRequestPermissionsResult", "requestCode", "grantResults", "", FirebaseAnalytics.Event.SHARE, "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterShareImgTransmit implements InterfaceC45944d {

    /* JADX INFO: renamed from: d */
    @Nullable
    public Bitmap f49365d;

    /* JADX INFO: renamed from: e */
    public boolean f49366e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public String f49362a = "";

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f49363b = "";

    /* JADX INFO: renamed from: c */
    public boolean f49364c = true;

    /* JADX INFO: renamed from: f */
    public final int f49367f = 302;

    /* JADX INFO: renamed from: r */
    public static final Unit m59662r(FlutterShareImgTransmit flutterShareImgTransmit, MethodCall methodCall, FragmentActivity fragmentActivity) {
        flutterShareImgTransmit.f49365d = C5290q.m6355f((byte[]) methodCall.argument("imageData"), 0);
        flutterShareImgTransmit.f49362a = C27041f.m66668h((String) methodCall.argument("utmSource"));
        flutterShareImgTransmit.f49364c = C27025c.m66567e((Boolean) methodCall.argument(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE), true);
        flutterShareImgTransmit.f49363b = C27041f.m66668h((String) methodCall.argument("shareLink"));
        flutterShareImgTransmit.f49366e = C27025c.m66566d((Boolean) methodCall.argument("onlyDarkMode"));
        if (PermissionCompat.f40528a.m49937a(fragmentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            flutterShareImgTransmit.m59665s(fragmentActivity);
        } else {
            ActivityCompat.requestPermissions(fragmentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, flutterShareImgTransmit.f49367f);
        }
        return Unit.INSTANCE;
    }

    @Override // p741wy.InterfaceC45944d
    /* JADX INFO: renamed from: a */
    public void mo59663a(@NotNull final FragmentActivity context, @NotNull final MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.flutter.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlutterShareImgTransmit.m59662r(this.f49359b, call, context);
            }
        });
    }

    @Override // p741wy.InterfaceC45944d
    /* JADX INFO: renamed from: f */
    public void mo59664f(@NotNull FragmentActivity context, int i11, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i11 == this.f49367f) {
            if ((grantResults.length == 0) || grantResults[0] != 0) {
                ToastCompat.m66441G(context.getString(R$string.please_open_write_read_right), new Object[0]);
            } else {
                m59665s(context);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m59665s(FragmentActivity fragmentActivity) {
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam(this.f49362a, null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(this.f49365d);
        imageShareParam.setNeedQrCode(this.f49364c);
        if (this.f49363b.length() > 0) {
            imageShareParam.setQrCodeUrl(this.f49363b);
        }
        imageShareParam.setOnlyDarkMode(this.f49366e);
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
    }
}

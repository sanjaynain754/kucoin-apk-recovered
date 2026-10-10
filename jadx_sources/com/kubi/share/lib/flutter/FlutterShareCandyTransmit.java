package com.kubi.share.lib.flutter;

import android.graphics.Bitmap;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5290q;
import com.kubi.permissions.utils.PermissionCompat;
import com.kubi.share.R$string;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p741wy.InterfaceC45943c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.flutter.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterShareCandyTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/share/lib/flutter/FlutterShareCandyTransmit;", "Lcom/kubi/sdk/flutter/transmit/ICandySaveShareTransmit;", "<init>", "()V", "shareBitmap", "Landroid/graphics/Bitmap;", "REQUEST_CODE_SAVE", "", "REQUEST_CODE_MORE", "REQUEST_CODE_SHARE_IMAGE", "handleMethod", "", "context", "Landroidx/fragment/app/FragmentActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterShareCandyTransmit implements InterfaceC45943c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Bitmap f49355a;

    /* JADX INFO: renamed from: b */
    public final int f49356b = 200;

    /* JADX INFO: renamed from: c */
    public final int f49357c = 201;

    /* JADX INFO: renamed from: d */
    public final int f49358d = 202;

    /* JADX INFO: renamed from: u */
    public static final Unit m59657u(FlutterShareCandyTransmit flutterShareCandyTransmit) {
        flutterShareCandyTransmit.f49355a = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59658v(FlutterShareCandyTransmit flutterShareCandyTransmit) {
        flutterShareCandyTransmit.f49355a = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m59656t(final FlutterShareCandyTransmit flutterShareCandyTransmit, MethodCall methodCall, FragmentActivity fragmentActivity) {
        flutterShareCandyTransmit.f49355a = C5290q.m6355f((byte[]) methodCall.argument("imageData"), 0);
        if (PermissionCompat.f40528a.m49937a(fragmentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            ShareExtKt.m59838K(fragmentActivity, flutterShareCandyTransmit.f49355a, Intrinsics.areEqual(methodCall.method, "candy/save"), new Function0() { // from class: com.kubi.share.lib.flutter.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FlutterShareCandyTransmit.m59657u(this.f49354b);
                }
            });
        } else {
            ActivityCompat.requestPermissions(fragmentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, Intrinsics.areEqual(methodCall.method, "candy/save") ? flutterShareCandyTransmit.f49356b : flutterShareCandyTransmit.f49357c);
        }
        return Unit.INSTANCE;
    }

    @Override // p741wy.InterfaceC45943c
    /* JADX INFO: renamed from: a */
    public void mo59659a(@NotNull final FragmentActivity context, @NotNull final MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.flutter.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlutterShareCandyTransmit.m59656t(this.f49351b, call, context);
            }
        });
    }

    @Override // p741wy.InterfaceC45943c
    /* JADX INFO: renamed from: f */
    public void mo59660f(@NotNull FragmentActivity context, int i11, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        int i12 = this.f49356b;
        if (i11 == i12 || i11 == this.f49357c || i11 == this.f49358d) {
            if ((grantResults.length == 0) || grantResults[0] != 0) {
                ToastCompat.m66441G(context.getString(R$string.please_open_write_read_right), new Object[0]);
                return;
            }
            if (i11 == i12 || i11 == this.f49357c) {
                ShareExtKt.m59838K(context, this.f49355a, i11 == i12, new Function0() { // from class: com.kubi.share.lib.flutter.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlutterShareCandyTransmit.m59658v(this.f49350b);
                    }
                });
            } else if (i11 == this.f49358d) {
                IShareService iShareService = IShareService.f49268a.get();
                ImageShareParam imageShareParam = new ImageShareParam("candy", null, false, null, false, null, null, null, null, null, 1022, null);
                imageShareParam.setBitmap(this.f49355a);
                IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
            }
        }
    }
}

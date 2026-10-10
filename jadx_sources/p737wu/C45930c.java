package p737wu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import b00.InterfaceC4438u;
import com.google.zxing.client.android.Intents;
import com.google.zxing.integration.android.IntentIntegrator;
import com.kubi.otc.entity.OtcAd;
import com.kubi.qrcode.lib.QrCodeHelper;
import com.kubi.qrcode.lib.QrCodeProcessor;
import com.kubi.qrcode.lib.QrCodeScanActivity;
import com.kubi.sdk.IActivityWithResult;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeQrScanScanQrCodeResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wu.c */
/* JADX INFO: compiled from: KCFlutterBridgeQrScanCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016JD\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/qrcode/lib/service/KCFlutterBridgeQrScanCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeQrScanCall;", "<init>", "()V", "openQrScan", "", "ctx", "Landroid/content/Context;", "bizType", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "scanQrCode", "supportedTypes", "", "", "callerHandlesUnknownCode", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeQrScanScanQrCodeResult;", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45930c implements InterfaceC4438u {
    /* JADX INFO: renamed from: e */
    public static final void m101372e(Function2 function2, Intent intent) {
        function2.invoke(intent != null ? intent.getStringExtra(Intents.Scan.RESULT) : null, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m101373f(List list, Context context, boolean z11, Function2 function2, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String str = "";
        if (!list.contains(0L) && !list.contains(4L)) {
            if (intent != null && (stringExtra2 = intent.getStringExtra(Intents.Scan.RESULT)) != null) {
                str = stringExtra2;
            }
            function2.invoke(new KCFlutterBridgeQrScanScanQrCodeResult(false, str), null);
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(Intents.Scan.RESULT)) != null) {
            str = stringExtra;
        }
        boolean zM50081b = QrCodeHelper.f40831a.m50081b((FragmentActivity) context, str, z11);
        if (!zM50081b) {
            zM50081b = QrCodeProcessor.a.e(str);
        }
        function2.invoke(new KCFlutterBridgeQrScanScanQrCodeResult(zM50081b, str), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4438u
    /* JADX INFO: renamed from: a */
    public void mo4219a(@NotNull final Context ctx, @NotNull final List<Long> supportedTypes, final boolean z11, @NotNull final Function2<? super KCFlutterBridgeQrScanScanQrCodeResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof IActivityWithResult) || !(ctx instanceof FragmentActivity)) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not FragmentActivity."), null, false, 12, null));
            return;
        }
        Intent intentCreateScanIntent = new IntentIntegrator((Activity) ctx).setOrientationLocked(false).setCaptureActivity(QrCodeScanActivity.class).createScanIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScanIntent, "createScanIntent(...)");
        ((IActivityWithResult) ctx).startActivityWithResult(intentCreateScanIntent, new Consumer() { // from class: wu.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45930c.m101373f(supportedTypes, ctx, z11, callback, (Intent) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4438u
    /* JADX INFO: renamed from: b */
    public void mo4220b(@NotNull Context ctx, @Nullable String str, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof IActivityWithResult) || !(ctx instanceof FragmentActivity)) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not FragmentActivity."), null, false, 12, null));
            return;
        }
        IActivityWithResult iActivityWithResult = (IActivityWithResult) ctx;
        Intent intentCreateScanIntent = new IntentIntegrator((Activity) ctx).setOrientationLocked(false).setCaptureActivity(QrCodeScanActivity.class).createScanIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScanIntent, "createScanIntent(...)");
        iActivityWithResult.startActivityWithResult(intentCreateScanIntent, new Consumer() { // from class: wu.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45930c.m101372e(callback, (Intent) obj);
            }
        });
    }
}

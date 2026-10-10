package com.kubi.qrcode.lib.service;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.android.Intents;
import com.google.zxing.integration.android.IntentIntegrator;
import com.kubi.qrcode.api.service.IQrCodeService;
import com.kubi.qrcode.lib.QrCodeProcessor;
import com.kubi.qrcode.lib.QrCodeScanActivity;
import com.kubi.qrcode.lib.service.QrCodeService;
import com.kubi.qrcode.lib.track.TrackCategory;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p037b9.C4508b;
import p774xu.C46333a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: QrCodeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002J\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0013J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/qrcode/lib/service/QrCodeService;", "Lcom/kubi/qrcode/api/service/IQrCodeService;", "<init>", "()V", "handleScanCodeResult", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "complete", "Lkotlin/Function1;", "", "handleScanCode", "fragment", "Lcom/kubi/sdk/BaseFragment;", "createIntent", "Landroid/content/Intent;", "Landroid/app/Activity;", "handleIntent", "intent", "handleIntent$QrCodeLib_googleRelease", "encodeAsBitmap", "Landroid/graphics/Bitmap;", "str", "width", "", "height", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQrCodeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrCodeService.kt\ncom/kubi/qrcode/lib/service/QrCodeService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class QrCodeService implements IQrCodeService {
    private final Intent createIntent(Activity activity) {
        Intent intentCreateScanIntent = new IntentIntegrator(activity).setOrientationLocked(false).setCaptureActivity(QrCodeScanActivity.class).createScanIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScanIntent, "createScanIntent(...)");
        return intentCreateScanIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScanCode$lambda$3(QrCodeService qrCodeService, BaseFragment baseFragment, Intent intent) {
        if (intent != null) {
            qrCodeService.handleIntent$QrCodeLib_googleRelease(intent, baseFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScanCodeResult$lambda$1(Function1 function1, Intent intent) throws JSONException {
        if (intent != null) {
            String strM56280w = RouteExKt.m56280w(intent, Intents.Scan.RESULT);
            C44128b.m97266j("QrCodeService", "[handleScanCodeResult]scanCode:" + strM56280w);
            if (function1 != null) {
                function1.invoke(strM56280w);
            }
            C46333a c46333a = C46333a.f103908a;
            TrackCategory trackCategory = TrackCategory.WITHDRAW;
            c46333a.m102147a(trackCategory, trackCategory.getValue());
        }
    }

    @Override // com.kubi.qrcode.api.service.IQrCodeService
    @Nullable
    public Bitmap encodeAsBitmap(@NotNull String str, int width, int height) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            return new C4508b().m4319a(new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, width, height));
        } catch (WriterException e11) {
            C44128b.m97263g("QrCodeService", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            C44128b.m97263g("QrCodeService", e12);
            return null;
        }
    }

    public final void handleIntent$QrCodeLib_googleRelease(@NotNull Intent intent, @NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String strM66668h = C27041f.m66668h(RouteExKt.m56280w(intent, Intents.Scan.RESULT));
        boolean zM56248g = RouteExKt.m56248g(intent, "ALBUM_SOURCE_RESULT", false);
        C44128b.m97266j("QrCodeService", "[handleIntent]scanCode:" + strM66668h);
        if (strM66668h.length() == 0) {
            return;
        }
        QrCodeProcessor.a.n(fragment, strM66668h, zM56248g);
    }

    @Override // com.kubi.qrcode.api.service.IQrCodeService
    public void handleScanCode(@NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        fragment.startActivityWithResult(createIntent(activity), new Consumer() { // from class: wu.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QrCodeService.handleScanCode$lambda$3(this.f103392b, fragment, (Intent) obj);
            }
        });
    }

    @Override // com.kubi.qrcode.api.service.IQrCodeService
    public void handleScanCodeResult(@NotNull BaseActivity activity, @Nullable final Function1<? super String, Unit> complete) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityWithResult(createIntent(activity), new Consumer() { // from class: wu.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                QrCodeService.handleScanCodeResult$lambda$1(complete, (Intent) obj);
            }
        });
    }
}

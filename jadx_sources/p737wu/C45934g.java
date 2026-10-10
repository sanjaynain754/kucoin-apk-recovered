package p737wu;

import android.app.Activity;
import android.content.Intent;
import com.google.zxing.client.android.Intents;
import com.google.zxing.integration.android.IntentIntegrator;
import com.kubi.qrcode.lib.QrCodeScanActivity;
import com.kubi.sdk.IActivityWithResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45952l;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wu.g */
/* JADX INFO: compiled from: QrScanTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/qrcode/lib/service/QrScanTransmit;", "Lcom/kubi/sdk/flutter/transmit/IQrScanTransmit;", "<init>", "()V", "scanQrCode", "", "activity", "Landroid/app/Activity;", "activityResult", "Lcom/kubi/sdk/IActivityWithResult;", "bizType", "", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Function1;", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45934g implements InterfaceC45952l {
    /* JADX INFO: renamed from: r */
    public static final void m101375r(Function1 function1, Intent intent) {
        function1.invoke(intent != null ? intent.getStringExtra(Intents.Scan.RESULT) : null);
    }

    @Override // p741wy.InterfaceC45952l
    /* JADX INFO: renamed from: j */
    public void mo101376j(@NotNull Activity activity, @NotNull IActivityWithResult activityResult, @NotNull String bizType, @NotNull final Function1<? super String, Unit> result) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(result, "result");
        Intent intentCreateScanIntent = new IntentIntegrator(activity).setOrientationLocked(false).setCaptureActivity(QrCodeScanActivity.class).createScanIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScanIntent, "createScanIntent(...)");
        activityResult.startActivityWithResult(intentCreateScanIntent, new Consumer() { // from class: wu.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45934g.m101375r(result, (Intent) obj);
            }
        });
    }
}

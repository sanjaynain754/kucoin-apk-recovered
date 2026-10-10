package p741wy;

import android.app.Activity;
import com.kubi.sdk.IActivityWithResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wy.l */
/* JADX INFO: compiled from: IFlutterTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "use knb")
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/flutter/transmit/IQrScanTransmit;", "Lcom/kubi/sdk/flutter/transmit/ITransmit;", "scanQrCode", "", "activity", "Landroid/app/Activity;", "activityResult", "Lcom/kubi/sdk/IActivityWithResult;", "bizType", "", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Function1;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45952l extends InterfaceC45957q {
    /* JADX INFO: renamed from: j */
    void mo101376j(@NotNull Activity activity, @NotNull IActivityWithResult iActivityWithResult, @NotNull String str, @NotNull Function1<? super String, Unit> function1);
}

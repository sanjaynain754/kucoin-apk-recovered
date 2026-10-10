package p741wy;

import androidx.fragment.app.FragmentActivity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: wy.c */
/* JADX INFO: compiled from: IFlutterTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "use knb")
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/flutter/transmit/ICandySaveShareTransmit;", "Lcom/kubi/sdk/flutter/transmit/ITransmit;", "handleMethod", "", "context", "Landroidx/fragment/app/FragmentActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "onRequestPermissionsResult", "requestCode", "", "grantResults", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45943c extends InterfaceC45957q {
    /* JADX INFO: renamed from: a */
    void mo59659a(@NotNull FragmentActivity fragmentActivity, @NotNull MethodCall methodCall, @NotNull MethodChannel.Result result);

    /* JADX INFO: renamed from: f */
    void mo59660f(@NotNull FragmentActivity fragmentActivity, int i11, @NotNull int[] iArr);
}

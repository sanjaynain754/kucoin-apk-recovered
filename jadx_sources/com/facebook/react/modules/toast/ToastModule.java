package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.toast.ToastModule;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ToastModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "ToastAndroid")
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J2\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/modules/toast/ToastModule;", "Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", TIMPushProvider.f75062n, "", "message", "durationDouble", "", "showWithGravity", "gravityDouble", "showWithGravityAndOffset", "xOffsetDouble", "yOffsetDouble", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ToastModule extends NativeToastAndroidSpec {

    @NotNull
    private static final String DURATION_LONG_KEY = "LONG";

    @NotNull
    private static final String DURATION_SHORT_KEY = "SHORT";

    @NotNull
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";

    @NotNull
    private static final String GRAVITY_CENTER = "CENTER";

    @NotNull
    private static final String GRAVITY_TOP_KEY = "TOP";

    @NotNull
    public static final String NAME = "ToastAndroid";

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return MapsKt.mutableMapOf(TuplesKt.m90091to("SHORT", 0), TuplesKt.m90091to("LONG", 1), TuplesKt.m90091to(GRAVITY_TOP_KEY, 49), TuplesKt.m90091to(GRAVITY_BOTTOM_KEY, 81), TuplesKt.m90091to(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(@Nullable final String message, double durationDouble) {
        final int i11 = (int) durationDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.c
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.show$lambda$0(this.f104026b, message, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(@Nullable final String message, double durationDouble, double gravityDouble) {
        final int i11 = (int) durationDouble;
        final int i12 = (int) gravityDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.b
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravity$lambda$1(this.f104022b, message, i11, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(@Nullable final String message, double durationDouble, double gravityDouble, double xOffsetDouble, double yOffsetDouble) {
        final int i11 = (int) durationDouble;
        final int i12 = (int) gravityDouble;
        final int i13 = (int) xOffsetDouble;
        final int i14 = (int) yOffsetDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.a
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(this.f104016b, message, i11, i12, i13, i14);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule toastModule, String str, int i11) {
        Toast.makeText(toastModule.getReactApplicationContext(), str, i11).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i11, int i12) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i11);
        toastMakeText.setGravity(i12, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i11, int i12, int i13, int i14) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i11);
        toastMakeText.setGravity(i12, i13, i14);
        toastMakeText.show();
    }
}

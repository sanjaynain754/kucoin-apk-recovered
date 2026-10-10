package jumio.core;

import android.os.Build;
import com.jumio.core.util.DeviceUtilKt;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.S0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40591S0 {
    /* JADX INFO: renamed from: a */
    public static final JSONObject m89236a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String strJoinToString$default = ArraysKt.joinToString$default(SUPPORTED_ABIS, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        jSONObject.put("sdk-platform", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject.put("sdk-version", "4.17.0 (1)");
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("software-version", Build.VERSION.RELEASE);
        jSONObject.put("software-build-number", Build.DISPLAY);
        jSONObject.put("kernel-version", System.getProperty("os.version"));
        jSONObject.put("hardware", Build.HARDWARE);
        jSONObject.put("supported-cpu-abi", strJoinToString$default);
        jSONObject.put("device-fingerprint", Build.FINGERPRINT);
        jSONObject.put("build-tag", Build.TAGS);
        jSONObject.put("emulator-properties-present", DeviceUtilKt.getDeviceUtil().isEmulatorPropertiesPresent());
        jSONObject.put("emulator-files-present", DeviceUtilKt.getDeviceUtil().hasEmulatorRelatedFiles());
        return jSONObject;
    }
}

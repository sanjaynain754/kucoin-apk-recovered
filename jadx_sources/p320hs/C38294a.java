package p320hs;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.kubi.sdk.BaseApplication;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p741wy.InterfaceC45951k;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hs.a */
/* JADX INFO: compiled from: FlutterNoticeTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0003J)\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/notice/lib/flutter/FlutterNoticeTransmit;", "Lcom/kubi/sdk/flutter/transmit/INoticeTransmit;", "<init>", "()V", "handleMethod", "", "context", "Landroidx/fragment/app/FragmentActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "jumpToSystemNoticeSetting", "argument", ExifInterface.GPS_DIRECTION_TRUE, "arguments", "", "key", "", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "getPermission", "", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38294a implements InterfaceC45951k {
    @Override // p741wy.InterfaceC45951k
    /* JADX INFO: renamed from: a */
    public void mo86424a(@NotNull FragmentActivity context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (Intrinsics.areEqual(str, "jumpToSystemNoticeSetting")) {
            m86427s();
            result.success(null);
        } else if (Intrinsics.areEqual(str, "getPermission")) {
            result.success(m86426r(call.arguments));
        } else {
            result.success(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final <T> T m86425q(Object obj, String str) {
        T t11;
        if (obj instanceof Map) {
            T t12 = (T) ((Map) obj).get(str);
            if (t12 == null) {
                return null;
            }
            return t12;
        }
        if (!(obj instanceof JSONObject) || (t11 = (T) ((JSONObject) obj).opt(str)) == null) {
            return null;
        }
        return t11;
    }

    @Deprecated(message = "SystemSettingUtils")
    /* JADX INFO: renamed from: r */
    public final Map<String, String> m86426r(Object obj) {
        if (!Intrinsics.areEqual((String) m86425q(obj, "permission_type"), "Notification")) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("resultType", "Notification");
        map.put(DbParams.KEY_CHANNEL_RESULT, NotificationManagerCompat.from(BaseApplication.INSTANCE.get()).areNotificationsEnabled() ? "2" : "1");
        return map;
    }

    @Deprecated(message = "SystemSettingUtils")
    /* JADX INFO: renamed from: s */
    public final void m86427s() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, BaseApplication.INSTANCE.get().getPackageName(), null));
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            BaseApplication.Companion companion = BaseApplication.INSTANCE;
            intent.putExtra("app_package", companion.get().getPackageName());
            Intrinsics.checkNotNull(intent.putExtra("app_uid", companion.get().getApplicationInfo().uid));
        }
        BaseApplication.INSTANCE.get().startActivity(intent);
    }
}

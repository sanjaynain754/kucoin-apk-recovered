package sy;

import android.app.Activity;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blankj.utilcode.util.C5258a;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.utils.C27100x0;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sy.y */
/* JADX INFO: compiled from: SysNativeLocalizedHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/SysNativeLocalizedHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44600y implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44600y f98887a = new C44600y();

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        List<String> list = (List) call.argument("keys");
        if (list == null || list.isEmpty()) {
            return;
        }
        final HashMap map = new HashMap();
        final Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            for (final String str : list) {
                C27100x0.m66924e(new Function0() { // from class: sy.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C44600y.m98703b(map, str, activityM6125h);
                    }
                });
            }
        }
        result.success(map);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m98703b(HashMap map, String str, Activity activity) {
        map.put(str, activity.getString(activity.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, activity.getPackageName())));
        return Unit.INSTANCE;
    }
}

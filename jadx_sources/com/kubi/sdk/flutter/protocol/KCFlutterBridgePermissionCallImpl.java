package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import b00.InterfaceC4436s;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePermissionPermissionResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgePermissionCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgePermissionCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePermissionCall;", "<init>", "()V", "getPermission", "", "ctx", "Landroid/content/Context;", "permissionType", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePermissionPermissionResult;", "Lcom/kubi/sdk/protocol/ProtocolException;", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgePermissionCallImpl implements InterfaceC4436s {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46715a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgePermissionCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgePermissionCallImpl$Companion;", "", "<init>", "()V", "NOTIFICATION_TYPE", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // b00.InterfaceC4436s
    /* JADX INFO: renamed from: a */
    public void mo4214a(@NotNull Context ctx, @NotNull String permissionType, @NotNull Function2<? super KCFlutterBridgePermissionPermissionResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = permissionType.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "notification")) {
            callback.invoke(new KCFlutterBridgePermissionPermissionResult("notification", NotificationManagerCompat.from(BaseApplication.INSTANCE.get()).areNotificationsEnabled() ? "2" : "1"), null);
        } else {
            callback.invoke(null, null);
        }
    }
}

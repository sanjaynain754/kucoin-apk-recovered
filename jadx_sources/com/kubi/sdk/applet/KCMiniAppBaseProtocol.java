package com.kubi.sdk.applet;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCMiniAppBaseProtocol.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\fH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "Lcom/kubi/sdk/applet/KCBaseProtocol;", "supportAddHome", "", "exit", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "appPopAnimated", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KCMiniAppBaseProtocol extends KCBaseProtocol {
    default boolean supportAddHome() {
        return true;
    }

    default void exit(@NotNull Context ctx, @Nullable Object obj, final boolean appPopAnimated, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            IAppletService.f46452a.get().mo15069d(baseActivity, new Function0() { // from class: com.kubi.sdk.applet.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KCMiniAppBaseProtocol.m56509a(baseActivity, appPopAnimated, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    static Unit m56509a(BaseActivity baseActivity, boolean z11, Function2 function2) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCMiniAppBaseProtocol$exit$1$1(baseActivity, z11, function2, null), 3, null);
        return Unit.INSTANCE;
    }
}

package com.kubi.payment.rnbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J0\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J8\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0017J \u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/rnbridge/IPaymentBridge;", "", "paymentJumpScanQrcodeInternal", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "paymentPickContactPhoneInternal", "", "handleContactResult", "activity", "Lcom/kubi/sdk/BaseActivity;", DbParams.KEY_CHANNEL_RESULT, "Landroid/content/Intent;", "queryPhoneNumber", "uri", "Landroid/net/Uri;", "(Lcom/kubi/sdk/BaseActivity;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPaymentBridge {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C21378a f40202a = C21378a.f40203a;

    /* JADX INFO: renamed from: com.kubi.payment.rnbridge.IPaymentBridge$a */
    /* JADX INFO: compiled from: IPaymentBridge.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/rnbridge/IPaymentBridge$Companion;", "", "<init>", "()V", "TAG", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21378a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C21378a f40203a = new C21378a();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    default void m49504a(@NotNull BaseActivity activity, @Nullable Intent intent, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new IPaymentBridge$handleContactResult$1(intent, callback, this, activity, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    default void m49506e(@Nullable Context context, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null) {
            Activity activityM6125h = C5258a.m6125h();
            baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
            if (baseActivity == null) {
                callback.invoke(null, null);
                return;
            }
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new IPaymentBridge$paymentJumpScanQrcodeInternal$1(baseActivity, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    default void m49507g(@Nullable Context context, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null) {
            Activity activityM6125h = C5258a.m6125h();
            baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
            if (baseActivity == null) {
                callback.invoke(null, null);
                return;
            }
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new IPaymentBridge$paymentPickContactPhoneInternal$1(baseActivity, this, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    default Object m49505d(BaseActivity baseActivity, Uri uri, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new IPaymentBridge$queryPhoneNumber$2(baseActivity, uri, null), continuation);
    }
}

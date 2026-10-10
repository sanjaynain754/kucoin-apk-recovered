package com.kubi.payment.p106rn;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5285n0;
import com.google.firebase.messaging.Constants;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.data.BeepHelper;
import com.kubi.otc.R$raw;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.flutter.choosefile.FileDownloadViewFragment;
import com.kubi.payment.flutter.choosefile.FlutterFileDispatchFragment;
import com.kubi.user.api.site.protocol.b;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0007H\u0016JU\u0010\r\u001a\u00020\u00032\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2)\u0010\u0006\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016Je\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152S\b\u0002\u0010\u0016\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J@\u0010\u001d\u001a\u00020\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J=\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00030\u0012H\u0016¢\u0006\u0002\u0010%J*\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010(J.\u0010)\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J.\u0010/\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/rn/IUnifyPaymentBridge;", "", "openThirdPurchaseOrderChannelInternal", "", "jsonOrder", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", DbParams.KEY_CHANNEL_RESULT, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "paymentUploadFileListInternal", "pathList", "", "businessType", "isPdf", "Lkotlin/Function1;", "paymentPickImageAndVideoAndFileInternal", "type", "", "callback2", "Lkotlin/Function3;", "path", "mimeType", "size", "toAdaChatDirectlyInternal", "playCancelOrderAudioInternal", "getP2PProtocalUrlsInternal", "privacyUserTerm", "agreementTerm", "paymentGetVideoThumbnailInternal", "isRemoteUrl", "fileUrl", C33757kf.f70665k, "", "(ZLjava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "getVideoThumbnailByte", "", "(ZLjava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentViewPdfInternal", "startViewPdf", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "paymentViewVideoInternal", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIUnifyPaymentBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUnifyPaymentBridge.kt\ncom/kubi/payment/rn/IUnifyPaymentBridge\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,253:1\n29#2:254\n*S KotlinDebug\n*F\n+ 1 IUnifyPaymentBridge.kt\ncom/kubi/payment/rn/IUnifyPaymentBridge\n*L\n219#1:254\n*E\n"})
public interface IUnifyPaymentBridge {
    /* JADX INFO: renamed from: I */
    static Unit m49422I(Function3 function3, String path, String mimeType, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        function3.invoke(path, mimeType, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    static Unit m49426x(IUnifyPaymentBridge iUnifyPaymentBridge, FragmentActivity fragmentActivity, File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriM6316a = C5285n0.m6316a(file);
        Intrinsics.checkNotNullExpressionValue(uriM6316a, "file2Uri(...)");
        iUnifyPaymentBridge.m49431a(fragmentActivity, uriM6316a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    default void m49427E(@Nullable List<String> list, @NotNull String businessType, boolean z11, @NotNull Function1<? super List<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (list == null || list.isEmpty()) {
            callback.invoke(null);
            return;
        }
        ComponentCallbacks2 componentCallbacks2M6125h = C5258a.m6125h();
        if (componentCallbacks2M6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2M6125h), null, null, new IUnifyPaymentBridge$paymentUploadFileListInternal$1(z11, list, businessType, callback, null), 3, null);
        } else {
            callback.invoke(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    default void m49428G(@Nullable String str, @NotNull Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (str == null || str.length() == 0) {
            callback.invoke(Boolean.FALSE, "订单信息异常");
            return;
        }
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityM6125h), null, null, new IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1(callback, activityM6125h, str, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, "当前页面异常");
        }
    }

    /* JADX INFO: renamed from: H */
    default void m49429H(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b bVar = b.a;
        callback.invoke(bVar.a(), bVar.d());
    }

    /* JADX INFO: renamed from: J */
    default void m49430J(boolean z11, @NotNull String fileUrl, @Nullable Long l11, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        LifecycleCoroutineScope lifecycleScope = fragmentActivity != null ? LifecycleOwnerKt.getLifecycleScope(fragmentActivity) : null;
        if (lifecycleScope == null) {
            callback.invoke(null);
        } else {
            C41696j.m91104d(lifecycleScope, null, null, new IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1(this, z11, fileUrl, l11, callback, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    default void m49431a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.setDataAndType(uri, ConstantsKt.MIME_TYPE_PDF);
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            ToastCompat.m66437C(R$string.system_error);
        }
    }

    /* JADX INFO: renamed from: e */
    default void m49432e() {
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
    }

    /* JADX INFO: renamed from: p */
    default void m49433p(boolean z11, @NotNull String fileUrl, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM66668h = C27041f.m66668h(fileUrl);
        if (strM66668h.length() <= 0) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.TRUE);
            InterfaceC37764p.a.m85187h(C37304a.f82764a, strM66668h, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: r */
    default void m49434r(boolean z11, @NotNull String fileUrl, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        final FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        callback.invoke(Boolean.TRUE);
        if (z11) {
            FileDownloadViewFragment.f39481d0.downloadFile(C27041f.m66668h(fileUrl), new Function1() { // from class: com.kubi.payment.rn.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IUnifyPaymentBridge.m49426x(this.f40176b, fragmentActivity, (File) obj);
                }
            });
        } else {
            m49431a(fragmentActivity, Uri.parse(C27041f.m66668h(fileUrl)));
        }
    }

    /* JADX INFO: renamed from: v */
    default void m49435v(int i11, @NotNull final Function3<? super String, ? super String, ? super String, Unit> callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback2");
        FlutterFileDispatchFragment.f39487e0.chooseFile(String.valueOf(i11), new Function3() { // from class: com.kubi.payment.rn.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return IUnifyPaymentBridge.m49422I(callback2, (String) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    default void m49436w() {
        OtcDepend otcDepend = OtcDepend.f38138a;
        Activity activityM6125h = C5258a.m6125h();
        otcDepend.m45471u(activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null, "p2pOrder");
    }

    /* JADX INFO: renamed from: z */
    default Object m49437z(boolean z11, String str, Long l11, Continuation<? super byte[]> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new IUnifyPaymentBridge$getVideoThumbnailByte$2(z11, str, l11, null), continuation);
    }
}

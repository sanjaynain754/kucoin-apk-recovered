package com.kubi.payment.flutter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5285n0;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.otc.R$raw;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.flutter.choosefile.FileDownloadViewFragment;
import com.kubi.payment.flutter.choosefile.FlutterFileDispatchFragment;
import com.kubi.payment.flutter.choosefile.PreviewImageFragment;
import com.kubi.payment.p2p.order.OrderDetailFragment;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import f00.C37304a;
import g00.InterfaceC37764p;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45945e;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterPaymentHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006#"}, m90084d2 = {"Lcom/kubi/payment/flutter/FlutterPaymentHandler;", "Lcom/kubi/sdk/flutter/transmit/IFlutterMethodHandler;", "<init>", "()V", "handle", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "pickImageAndVideo", "", "pickPdfFile", "pickFile", "type", "", "viewImage", "viewVideo", "viewPdf", "startViewPdf", "uri", "Landroid/net/Uri;", "getVideoThumbnail", "getVideoThumbnailByte", "", "(Lio/flutter/plugin/common/MethodCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playCancelOrderAudio", "closePage", "jumpToP2POrderChatPage", "bindEmail", "uploadFileList", "onSelectCountry", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterPaymentHandler implements InterfaceC45945e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f39476a = new Companion(null);

    /* JADX INFO: compiled from: FlutterPaymentHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/flutter/FlutterPaymentHandler$Companion;", "", "<init>", "()V", "TAG", "", "PaymentPrefix", "pickImageAndVideo", "pickPdfFile", "viewImage", "viewVideo", "viewPdf", "getVideoThumbnail", "playCancelOrderAudio", "closePage", "bindEmail", "uploadFileList", "jumpToP2POrderChatPage", "onSelectCountry", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m48119h(int i11) {
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                C27012a.m66486i().m66491e();
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m48120n(MethodChannel.Result result, String path, String mimeType, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (path.length() == 0) {
            result.error(OtcAd.KYC_NOT_PASS, "chooseFile unknown error", null);
        } else {
            result.success(MapsKt.mapOf(TuplesKt.m90091to("nativeFileList", CollectionsKt.listOf(MapsKt.mapOf(TuplesKt.m90091to("path", path), TuplesKt.m90091to("mimeType", mimeType), TuplesKt.m90091to("size", str))))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m48121v(FlutterPaymentHandler flutterPaymentHandler, Context context, File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriM6316a = C5285n0.m6316a(file);
        Intrinsics.checkNotNullExpressionValue(uriM6316a, "file2Uri(...)");
        flutterPaymentHandler.m48133r(context, uriM6316a);
        return Unit.INSTANCE;
    }

    @Override // p741wy.InterfaceC45945e
    /* JADX INFO: renamed from: a */
    public boolean mo48122a(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "payment#getVideoThumbnail":
                m48125i(context, call, result);
                return true;
            case "payment#pickPdfFile":
                m48131p(result);
                return true;
            case "payment#onSelectCountry":
                m48128l(call);
                return true;
            case "payment#playCancelOrderAudio":
                m48132q(result);
                return true;
            case "payment#close":
                m48124g(call, result);
                return true;
            case "payment#uploadFileList":
                m48134s(context, call, result);
                return true;
            case "payment#viewPdf":
                m48136u(context, call, result);
                return true;
            case "payment#jumpToP2POrderChatPage":
                m48127k(call);
                return true;
            case "payment#viewImage":
                m48135t(context, call, result);
                return true;
            case "payment#viewVideo":
                m48137w(call, result);
                return true;
            case "payment#bindEmail":
                m48123f(context, result);
                return true;
            case "payment#pickImageAndVideo":
                m48130o(call, result);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m48123f(Context context, MethodChannel.Result result) {
        OtcDepend.f38138a.m45454b(context);
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g */
    public final void m48124g(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("times");
        final int iIntValue = num != null ? num.intValue() : 1;
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.flutter.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlutterPaymentHandler.m48119h(iIntValue);
            }
        });
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public final void m48125i(Context context, MethodCall methodCall, MethodChannel.Result result) {
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        LifecycleCoroutineScope lifecycleScope = fragmentActivity != null ? LifecycleOwnerKt.getLifecycleScope(fragmentActivity) : null;
        if (lifecycleScope == null) {
            C44128b.m97261e("FlutterPaymentHandler", "[getVideoThumbnail] scope is null");
        }
        if (lifecycleScope != null) {
            C41696j.m91104d(lifecycleScope, null, null, new FlutterPaymentHandler$getVideoThumbnail$1(this, methodCall, result, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m48127k(MethodCall methodCall) {
        if (C27025c.m66566d((Boolean) methodCall.argument("needCloseFlutterContainer"))) {
            C27012a.m66486i().m66489c(FlutterEntryActivity.class);
        }
        OrderDetailFragment.f39721a0.toChat();
    }

    /* JADX INFO: renamed from: l */
    public final void m48128l(MethodCall methodCall) {
        boolean zM66566d = C27025c.m66566d((Boolean) methodCall.argument("needCloseFlutterContainer"));
        C12572a.m23695d("PAYMENT_EVENT_SELECT_COUNTRY", C27041f.m66668h((String) methodCall.argument("country")), 0L, 4, null);
        if (zM66566d) {
            C27012a.m66486i().m66489c(FlutterEntryActivity.class);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m48129m(String str, final MethodChannel.Result result) {
        FlutterFileDispatchFragment.f39487e0.chooseFile(str, new Function3() { // from class: com.kubi.payment.flutter.d
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FlutterPaymentHandler.m48120n(result, (String) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m48130o(MethodCall methodCall, MethodChannel.Result result) {
        m48129m(String.valueOf(C27039d.m66650j((Integer) methodCall.argument("type"))), result);
    }

    /* JADX INFO: renamed from: p */
    public final void m48131p(MethodChannel.Result result) {
        m48129m("3", result);
    }

    /* JADX INFO: renamed from: q */
    public final void m48132q(MethodChannel.Result result) {
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r */
    public final void m48133r(Context context, Uri uri) {
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

    /* JADX INFO: renamed from: s */
    public final void m48134s(Context context, MethodCall methodCall, MethodChannel.Result result) {
        List list = (List) methodCall.argument("pathList");
        String strM66668h = C27041f.m66668h((String) methodCall.argument("businessType"));
        boolean zM66566d = C27025c.m66566d((Boolean) methodCall.argument("isPdf"));
        if (list == null || list.isEmpty()) {
            result.error(OtcAd.KYC_NOT_PASS, "pathList is null or empty", null);
            return;
        }
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        LifecycleCoroutineScope lifecycleScope = fragmentActivity != null ? LifecycleOwnerKt.getLifecycleScope(fragmentActivity) : null;
        if (lifecycleScope == null) {
            C44128b.m97261e("FlutterPaymentHandler", "[uploadFileList] scope is null");
        }
        if (lifecycleScope != null) {
            lifecycleScope.launchWhenStarted(new FlutterPaymentHandler$uploadFileList$1(zM66566d, list, strM66668h, result, null));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m48135t(Context context, MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.TRUE);
        PreviewImageFragment.f39492V.launch(context, C27041f.m66668h((String) methodCall.argument(C27025c.m66566d((Boolean) methodCall.argument("isRemoteUrl")) ? "url" : "path")));
    }

    /* JADX INFO: renamed from: u */
    public final void m48136u(final Context context, MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.TRUE);
        if (C27025c.m66566d((Boolean) methodCall.argument("isRemoteUrl"))) {
            FileDownloadViewFragment.f39481d0.downloadFile(C27041f.m66668h((String) methodCall.argument("url")), new Function1() { // from class: com.kubi.payment.flutter.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FlutterPaymentHandler.m48121v(this.f39479b, context, (File) obj);
                }
            });
        } else {
            Uri uri = Uri.parse(C27041f.m66668h((String) methodCall.argument("path")));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            m48133r(context, uri);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m48137w(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.TRUE);
        String strM66668h = C27041f.m66668h((String) methodCall.argument(C27025c.m66566d((Boolean) methodCall.argument("isRemoteUrl")) ? "url" : "path"));
        if (strM66668h.length() > 0) {
            InterfaceC37764p.a.m85187h(C37304a.f82764a, strM66668h, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m48126j(MethodCall methodCall, Continuation<? super byte[]> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new FlutterPaymentHandler$getVideoThumbnailByte$2(methodCall, null), continuation);
    }
}

package com.kubi.payment.flutter.choosefile;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5284n;
import com.blankj.utilcode.util.C5302w;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.io.File;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: compiled from: FileDownloadViewFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0016\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/FileDownloadViewFragment;", "Lcom/kubi/resources/dialog/LoadingDialogFragment;", "<init>", "()V", "fileUrl", "", "fileListener", "Lkotlin/Function1;", "Ljava/io/File;", "", "call", "Lokhttp3/Call;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "downloadFile", "onDestroyView", "checkPermission", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileDownloadViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/payment/flutter/choosefile/FileDownloadViewFragment\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,139:1\n44#2,2:140\n*S KotlinDebug\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/payment/flutter/choosefile/FileDownloadViewFragment\n*L\n72#1:140,2\n*E\n"})
public final class FileDownloadViewFragment extends LoadingDialogFragment {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f39481d0 = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f39482a0 = "";

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public Function1<? super File, Unit> f39483b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public Call f39484c0;

    /* JADX INFO: compiled from: FileDownloadViewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/FileDownloadViewFragment$Companion;", "", "<init>", "()V", "downloadFile", "", "url", "", "fileListener", "Lkotlin/Function1;", "Ljava/io/File;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void downloadFile(@NotNull String url, @NotNull Function1<? super File, Unit> fileListener) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(fileListener, "fileListener");
            Activity activityM42511g = MviExKt.m42511g();
            FragmentActivity fragmentActivity = activityM42511g instanceof FragmentActivity ? (FragmentActivity) activityM42511g : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            FileDownloadViewFragment fileDownloadViewFragment = new FileDownloadViewFragment();
            fileDownloadViewFragment.f39482a0 = url;
            fileDownloadViewFragment.f39483b0 = fileListener;
            fileDownloadViewFragment.show(supportFragmentManager, "fileDownload");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.flutter.choosefile.FileDownloadViewFragment$a */
    /* JADX INFO: compiled from: FileDownloadViewFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/payment/flutter/choosefile/FileDownloadViewFragment$downloadFile$1", "Lokhttp3/Callback;", "onResponse", "", "call", "Lokhttp3/Call;", "response", "Lokhttp3/Response;", "onFailure", "e", "Ljava/io/IOException;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20981a implements Callback {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f39486c;

        public C20981a(File file) {
            this.f39486c = file;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            C44128b.m97264h(e11);
            FileDownloadViewFragment.this.dismiss();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                FileDownloadViewFragment.this.dismiss();
                return;
            }
            BufferedSink bufferedSinkBuffer = null;
            try {
                try {
                    C5284n.m6306i(this.f39486c);
                    bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(this.f39486c, false, 1, null));
                    bufferedSinkBuffer.writeAll(responseBodyBody.getSource());
                    bufferedSinkBuffer.close();
                    Function1 function1 = FileDownloadViewFragment.this.f39483b0;
                    if (function1 != null) {
                        function1.invoke(this.f39486c);
                    }
                    bufferedSinkBuffer.close();
                    FileDownloadViewFragment.this.dismiss();
                } catch (Exception e11) {
                    C44128b.m97264h(e11);
                    if (bufferedSinkBuffer != null) {
                        bufferedSinkBuffer.close();
                    }
                    FileDownloadViewFragment.this.dismiss();
                }
            } catch (Throwable th2) {
                if (bufferedSinkBuffer != null) {
                    bufferedSinkBuffer.close();
                }
                FileDownloadViewFragment.this.dismiss();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m48176K3(final FileDownloadViewFragment fileDownloadViewFragment) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.flutter.choosefile.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FileDownloadViewFragment.m48177L3(this.f39500b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m48183E3(final Function0<Unit> function0) {
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.flutter.choosefile.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileDownloadViewFragment.m48172F3(function0, this, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.payment.flutter.choosefile.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FileDownloadViewFragment.m48173G3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.payment.flutter.choosefile.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileDownloadViewFragment.m48174H3(this.f39498b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.payment.flutter.choosefile.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FileDownloadViewFragment.m48175I3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX INFO: renamed from: J3 */
    public final void m48184J3() {
        String str = C5302w.m6509d() + "/payment";
        String strSubstring = null;
        try {
            C5284n.m6305h(str);
        } catch (Throwable th2) {
            C43846g.m96568c(new OtcException(th2, "FileDownloadViewFragment", false, null, 8, null), null, 2, null);
        }
        String path = Uri.parse(this.f39482a0).getPath();
        if (path != null) {
            strSubstring = path.substring(StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        File file = new File(str, C45148b.m99794d(strSubstring));
        if (C5284n.m6312o(file)) {
            Function1<? super File, Unit> function1 = this.f39483b0;
            if (function1 != null) {
                function1.invoke(file);
            }
            dismiss();
            return;
        }
        Call callNewCall = new OkHttpClient().newCall(new Request.Builder().url(this.f39482a0).build());
        this.f39484c0 = callNewCall;
        if (callNewCall != null) {
            FirebasePerfOkHttpClient.enqueue(callNewCall, new C20981a(file));
        }
    }

    @Override // com.kubi.resources.dialog.LoadingDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.f39482a0.length() != 0) {
            m48183E3(new Function0() { // from class: com.kubi.payment.flutter.choosefile.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FileDownloadViewFragment.m48176K3(this.f39494b);
                }
            });
        } else {
            dismiss();
            ToastCompat.m66437C(R$string.system_error);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m48172F3(Function0 function0, FileDownloadViewFragment fileDownloadViewFragment, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            fileDownloadViewFragment.dismiss();
            ToastCompat.m66437C(R$string.please_open_write_read_right);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m48173G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m48174H3(FileDownloadViewFragment fileDownloadViewFragment, Throwable th2) {
        fileDownloadViewFragment.dismiss();
        ToastCompat.m66437C(R$string.please_open_write_read_right);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m48175I3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m48177L3(FileDownloadViewFragment fileDownloadViewFragment) {
        fileDownloadViewFragment.m48184J3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.LoadingDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Call call = this.f39484c0;
        if (call != null) {
            call.cancel();
        }
    }
}

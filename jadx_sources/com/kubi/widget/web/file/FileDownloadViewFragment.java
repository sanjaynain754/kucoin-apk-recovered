package com.kubi.widget.web.file;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mr.C42597a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FileDownloadViewFragment.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J6\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010%\u001a\u00020\f*\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u001b\u0010(\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\nH\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileDownloadViewFragment;", "Lcom/kubi/resources/dialog/LoadingDialogFragment;", "<init>", "()V", "call", "Lokhttp3/Call;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/kubi/widget/web/file/FileDownloadResult;", "", "completed", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "startDownload", "url", "", "requestedName", "headers", "", "preferRequestedName", "downloadDirectory", "Ljava/io/File;", "binarySafeHttpClient", "Lokhttp3/OkHttpClient;", "writeResponseBody", TtmlNode.TAG_BODY, "Lokhttp3/ResponseBody;", FirebaseAnalytics.Param.DESTINATION, "metadata", "Lcom/kubi/widget/web/file/FileMetadata;", "isReusableFile", "file", "startsWith", "", "prefix", "complete", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Object;)V", "onDestroyView", "onCancel", "dialog", "Landroid/content/DialogInterface;", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileDownloadViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/widget/web/file/FileDownloadViewFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1#2:274\n1761#3,3:275\n1740#3,3:278\n*S KotlinDebug\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/widget/web/file/FileDownloadViewFragment\n*L\n181#1:275,3\n185#1:278,3\n*E\n"})
public final class FileDownloadViewFragment extends LoadingDialogFragment {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f55089d0 = new Companion(null);

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final byte[] f55090e0 = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final byte[] f55091f0 = {-1, -40, -1};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final byte[] f55092g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final byte[] f55093h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final List<byte[]> f55094i0;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Call f55095a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public Function1<? super Result<FileDownloadResult>, Unit> f55096b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f55097c0;

    /* JADX INFO: compiled from: FileDownloadViewFragment.kt */
    @Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u00160 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileDownloadViewFragment$Companion;", "", "<init>", "()V", "ARG_URL", "", "ARG_FILE_NAME", "ARG_PREFER_REQUESTED_NAME", "ARG_HEADER_NAMES", "ARG_HEADER_VALUES", "CACHE_DIRECTORY", "TEMP_FILE_SUFFIX", "FILE_SIGNATURE_READ_SIZE", "", "PNG_SIGNATURE", "", "JPEG_SIGNATURE", "PDF_SIGNATURE", "OLE_SIGNATURE", "ZIP_SIGNATURES", "", "downloadFile", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "url", "fileName", "headers", "", "preferRequestedFileName", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/kubi/widget/web/file/FileDownloadResult;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void downloadFile$default(Companion companion, FragmentActivity fragmentActivity, String str, String str2, Map map, boolean z11, Function1 function1, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i11 & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            Map map2 = map;
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            companion.downloadFile(fragmentActivity, str, str3, map2, z11, function1);
        }

        public final void downloadFile(@NotNull FragmentActivity activity, @NotNull String url, @Nullable String fileName, @NotNull Map<String, String> headers, boolean preferRequestedFileName, @NotNull Function1<? super Result<FileDownloadResult>, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (activity.isFinishing() || activity.isDestroyed() || supportFragmentManager.isDestroyed() || supportFragmentManager.isStateSaved()) {
                Result.Companion companion = Result.INSTANCE;
                callback.invoke(Result.m103843boximpl(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", null, 2, null)))));
                return;
            }
            FileDownloadViewFragment fileDownloadViewFragment = new FileDownloadViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", url);
            bundle.putString("fileName", fileName);
            bundle.putBoolean("preferRequestedName", preferRequestedFileName);
            bundle.putStringArrayList("headerNames", new ArrayList<>(headers.keySet()));
            bundle.putStringArrayList("headerValues", new ArrayList<>(headers.values()));
            fileDownloadViewFragment.setArguments(bundle);
            fileDownloadViewFragment.f55096b0 = callback;
            fileDownloadViewFragment.m54194t3(activity, "fileDownload_" + UUID.randomUUID());
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.file.FileDownloadViewFragment$a */
    /* JADX INFO: compiled from: FileDownloadViewFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/widget/web/file/FileDownloadViewFragment$startDownload$1$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFileDownloadViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/widget/web/file/FileDownloadViewFragment$startDownload$1$1\n+ 2 FileDownloadViewFragment.kt\ncom/kubi/widget/web/file/FileDownloadViewFragmentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n271#2:274\n1#3:275\n*S KotlinDebug\n*F\n+ 1 FileDownloadViewFragment.kt\ncom/kubi/widget/web/file/FileDownloadViewFragment$startDownload$1$1\n*L\n112#1:274\n112#1:275\n*E\n"})
    public static final class C27139a implements Callback {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55099c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55100d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f55101e;

        public C27139a(String str, String str2, boolean z11) {
            this.f55099c = str;
            this.f55100d = str2;
            this.f55101e = z11;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            if (call.getCanceled()) {
                return;
            }
            FileDownloadViewFragment fileDownloadViewFragment = FileDownloadViewFragment.this;
            Result.Companion companion = Result.INSTANCE;
            fileDownloadViewFragment.m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", e11))));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Object objM103844constructorimpl;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            FileDownloadViewFragment fileDownloadViewFragment = FileDownloadViewFragment.this;
            String str = this.f55099c;
            String str2 = this.f55100d;
            boolean z11 = this.f55101e;
            try {
                if (!response.isSuccessful()) {
                    String str3 = (response.code() == 401 || response.code() == 403) ? "AUTH_FAILED" : "DOWNLOAD_FAILED";
                    Result.Companion companion = Result.INSTANCE;
                    fileDownloadViewFragment.m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException(str3, null, 2, null))));
                    CloseableKt.closeFinally(response, null);
                    return;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    fileDownloadViewFragment.m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", null, 2, null))));
                    CloseableKt.closeFinally(response, null);
                    return;
                }
                String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
                FileMetadata fileMetadataM67231t = FileTypeResolver.f55133a.m67231t(str, str2, Response.header$default(response, HttpHeaders.CONTENT_DISPOSITION, null, 2, null), strHeader$default, z11);
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    File file = new File(fileDownloadViewFragment.m67190D3(), fileMetadataM67231t.getFileName());
                    fileDownloadViewFragment.m67194H3(responseBodyBody, file, fileMetadataM67231t);
                    objM103844constructorimpl = Result.m103844constructorimpl(new FileDownloadResult(file, fileMetadataM67231t, strHeader$default));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", thM103847exceptionOrNullimpl)));
                }
                fileDownloadViewFragment.m67189B3(objM103844constructorimpl);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(response, null);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(response, th3);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final boolean m67193G3(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(bArr2);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (bArr[iNextInt] != bArr2[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    static {
        byte[] bytes = "%PDF-".getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f55092g0 = bytes;
        f55093h0 = new byte[]{-48, -49, 17, -32, -95, -79, 26, -31};
        f55094i0 = CollectionsKt.listOf((Object[]) new byte[][]{new byte[]{BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 3, 4}, new byte[]{BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 5, 6}, new byte[]{BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 7, 8}});
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m67182C3(FileDownloadViewFragment fileDownloadViewFragment, Object obj) {
        if (fileDownloadViewFragment.f55097c0) {
            return;
        }
        fileDownloadViewFragment.f55097c0 = true;
        Function1<? super Result<FileDownloadResult>, Unit> function1 = fileDownloadViewFragment.f55096b0;
        if (function1 != null) {
            function1.invoke(Result.m103843boximpl(obj));
        }
        fileDownloadViewFragment.f55096b0 = null;
        fileDownloadViewFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: B3 */
    public final void m67189B3(final Object obj) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.kubi.widget.web.file.l
            @Override // java.lang.Runnable
            public final void run() {
                FileDownloadViewFragment.m67182C3(this.f55126b, obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final File m67190D3() {
        File file = new File(requireContext().getCacheDir(), "file_bridge/downloads");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: F3 */
    public final void m67192F3(String str, String str2, Map<String, String> map, boolean z11) {
        String str3;
        String str4;
        boolean z12;
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            str3 = str;
            str4 = str2;
            z12 = z11;
            try {
                FileMetadata fileMetadataM67231t = FileTypeResolver.f55133a.m67231t(str3, str4, null, null, z12);
                File file = new File(m67190D3(), fileMetadataM67231t.getFileName());
                if (!m67191E3(file, fileMetadataM67231t)) {
                    file = null;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(file != null ? new FileDownloadResult(file, fileMetadataM67231t, null) : null);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } catch (Throwable th4) {
            th = th4;
            str3 = str;
            str4 = str2;
            z12 = z11;
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", thM103847exceptionOrNullimpl))));
            return;
        }
        FileDownloadResult fileDownloadResult = (FileDownloadResult) objM103844constructorimpl;
        if (fileDownloadResult != null) {
            m67189B3(Result.m103844constructorimpl(fileDownloadResult));
            return;
        }
        try {
            objM103844constructorimpl2 = Result.m103844constructorimpl(FileDownloadRequestFactory.f55122a.m67199a(str3, map));
        } catch (Throwable th5) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th5));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
        if (thM103847exceptionOrNullimpl2 != null) {
            m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", thM103847exceptionOrNullimpl2))));
            return;
        }
        Call callNewCall = m67188A3().newCall((Request) objM103844constructorimpl2);
        FirebasePerfOkHttpClient.enqueue(callNewCall, new C27139a(str3, str4, z12));
        this.f55095a0 = callNewCall;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m67194H3(ResponseBody responseBody, File file, FileMetadata fileMetadata) {
        File file2 = new File(file.getParentFile(), '.' + file.getName() + '.' + UUID.randomUUID() + ".download");
        try {
            InputStream inputStreamByteStream = responseBody.byteStream();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 8192);
                try {
                    long jCopyTo$default = ByteStreamsKt.copyTo$default(inputStreamByteStream, bufferedOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(bufferedOutputStream, null);
                    CloseableKt.closeFinally(inputStreamByteStream, null);
                    if (jCopyTo$default <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Long lValueOf = Long.valueOf(responseBody.getContentLength());
                    Long l11 = lValueOf.longValue() >= 0 ? lValueOf : null;
                    if (l11 != null && jCopyTo$default != l11.longValue()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!m67191E3(file2, fileMetadata)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (m67191E3(file, fileMetadata)) {
                        file2.delete();
                        file2.delete();
                        return;
                    }
                    if (file.exists() && !file.delete()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!file2.renameTo(file) && !m67191E3(file, fileMetadata)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    file2.delete();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(inputStreamByteStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            file2.delete();
            throw th6;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Call call = this.f55095a0;
        if (call != null) {
            call.cancel();
        }
        Result.Companion companion = Result.INSTANCE;
        m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("USER_CANCELLED", null, 2, null))));
        super.onCancel(dialog);
    }

    @Override // com.kubi.resources.dialog.LoadingDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Call call = this.f55095a0;
        if (call != null) {
            call.cancel();
        }
        this.f55095a0 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: A3 */
    public final OkHttpClient m67188A3() {
        OkHttpClient.Builder builderNewBuilder = C42597a.m93389e().newBuilder();
        builderNewBuilder.interceptors().clear();
        return builderNewBuilder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:0: B:53:0x00d3->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8.equals("xlsx") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r8.equals("pptx") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r8.equals("jpeg") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r8.equals("docx") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r8 = com.kubi.widget.web.file.FileDownloadViewFragment.f55094i0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r8.equals("xls") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r8.equals("ppt") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (r8.equals("jpg") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r8 = p852kotlin.collections.CollectionsKt.listOf(com.kubi.widget.web.file.FileDownloadViewFragment.f55091f0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        if (r8.equals("doc") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        r8 = p852kotlin.collections.CollectionsKt.listOf(com.kubi.widget.web.file.FileDownloadViewFragment.f55093h0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: E3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m67191E3(File file, FileMetadata fileMetadata) {
        List<byte[]> listListOf;
        BufferedInputStream bufferedInputStream;
        byte[] bArrCopyOf;
        Iterator<T> it;
        if (!file.isFile() || file.length() <= 0) {
            return false;
        }
        String extension = fileMetadata.getExtension();
        switch (extension.hashCode()) {
            case 99640:
                break;
            case 105441:
                break;
            case 110834:
                if (extension.equals("pdf")) {
                    listListOf = CollectionsKt.listOf(f55092g0);
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
                    try {
                        byte[] bArr = new byte[8];
                        bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(bufferedInputStream.read(bArr), 0));
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                        CloseableKt.closeFinally(bufferedInputStream, null);
                        if (listListOf == null && listListOf.isEmpty()) {
                            return false;
                        }
                        it = listListOf.iterator();
                        while (it.hasNext()) {
                            if (m67193G3(bArrCopyOf, (byte[]) it.next())) {
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(bufferedInputStream, th2);
                            throw th3;
                        }
                    }
                }
                return true;
            case 111145:
                if (extension.equals("png")) {
                    listListOf = CollectionsKt.listOf(f55090e0);
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
                    byte[] bArr2 = new byte[8];
                    bArrCopyOf = Arrays.copyOf(bArr2, RangesKt.coerceAtLeast(bufferedInputStream.read(bArr2), 0));
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    if (listListOf == null) {
                        break;
                    }
                    it = listListOf.iterator();
                    while (it.hasNext()) {
                        if (m67193G3(bArrCopyOf, (byte[]) it.next())) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            case 111220:
                break;
            case 118783:
                break;
            case 3088960:
                break;
            case 3268712:
                break;
            case 3447940:
                break;
            case 3682393:
                break;
            default:
                return true;
        }
    }

    @Override // com.kubi.resources.dialog.LoadingDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        List listEmptyList2 = null;
        if (arguments != null) {
            string = arguments.getString("url");
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (StringsKt.isBlank(string)) {
            Result.Companion companion = Result.INSTANCE;
            m67189B3(Result.m103844constructorimpl(ResultKt.createFailure(new FileBridgeException("DOWNLOAD_FAILED", null, 2, null))));
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("fileName");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        boolean z11 = false;
        if (arguments3 != null) {
            z11 = arguments3.getBoolean("preferRequestedName", false);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            listEmptyList = arguments4.getStringArrayList("headerNames");
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            listEmptyList2 = arguments5.getStringArrayList("headerValues");
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        m67192F3(string, string2, MapsKt.toMap(CollectionsKt.zip(listEmptyList, listEmptyList2)), z11);
    }
}

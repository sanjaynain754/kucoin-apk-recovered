package com.kubi.widget.web.file;

import android.database.Cursor;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5285n0;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: FileBridgeCoordinator.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\u0010\u0019JX\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010!\u001a\u00020\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0017JP\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010%\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0005J6\u0010'\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0017H\u0002J\"\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002J4\u0010-\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020)2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0017H\u0002J,\u0010/\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00100\u001a\u0002012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileBridgeCoordinator;", "", "<init>", "()V", "TARGET_AUTO", "", "TARGET_ALBUM", "TARGET_FILES", "saveScope", "Lkotlinx/coroutines/CoroutineScope;", "saveMutex", "Lkotlinx/coroutines/sync/Mutex;", "pickFile", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fileTypes", "", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/widget/web/file/PickFilesResult;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "previewFile", "isRemoteUrl", "", "fileUrl", "fileName", "headers", "", "allowShare", "Lcom/kubi/widget/web/file/FileActionResult;", "downloadFile", "url", "target", "normalizeTarget", "previewLocal", "queryContentMetadata", "Lcom/kubi/widget/web/file/FileMetadata;", "uri", "Landroid/net/Uri;", "requestedName", "openExternal", "metadata", "saveImage", "downloaded", "Lcom/kubi/widget/web/file/FileDownloadResult;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileBridgeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileBridgeCoordinator.kt\ncom/kubi/widget/web/file/FileBridgeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class FileBridgeCoordinator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FileBridgeCoordinator f55086a = new FileBridgeCoordinator();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41709m0 f55087b = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()));

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC44082a f55088c = C44087f.m97144b(false, 1, null);

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m67175f(@Nullable String str) {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            lowerCase = string.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        if (lowerCase.length() == 0) {
            lowerCase = "auto";
        }
        if (SetsKt.setOf((Object[]) new String[]{"auto", "album", "files"}).contains(lowerCase)) {
            return lowerCase;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m67174d(@NotNull final FragmentActivity activity, @NotNull String url, @Nullable String str, @NotNull Map<String, String> headers, @NotNull final String target, @NotNull final Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FileDownloadViewFragment.f55089d0.downloadFile(activity, url, str, headers, true, new Function1() { // from class: com.kubi.widget.web.file.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileBridgeCoordinator.m67172e(callback, target, activity, (Result) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m67176g(FragmentActivity fragmentActivity, Uri uri, FileMetadata fileMetadata, Function1<? super FileActionResult, Unit> function1) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            fragmentActivity.startActivity(FileIntentFactory.f55128a.m67204b(uri, fileMetadata.getMimeType()));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            function1.invoke(new FileActionResult(true, null, 2, null));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            function1.invoke(new FileActionResult(false, "NO_VIEWER"));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m67177h(@NotNull FragmentActivity activity, @NotNull List<String> fileTypes, int i11, @Nullable Long l11, @NotNull Function1<? super PickFilesResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fileTypes, "fileTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FileActionFragment.f55077Z.pick(activity, fileTypes, RangesKt.coerceAtLeast(i11, 1), (l11 == null || l11.longValue() <= 0) ? null : l11, callback);
    }

    /* JADX INFO: renamed from: i */
    public final void m67178i(@NotNull final FragmentActivity activity, boolean z11, @NotNull String fileUrl, @Nullable String str, @NotNull Map<String, String> headers, boolean z12, @NotNull final Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!z11) {
            m67179k(activity, fileUrl, str, callback);
            return;
        }
        FileTypeResolver fileTypeResolver = FileTypeResolver.f55133a;
        final FileMetadata fileMetadataM67215u = FileTypeResolver.m67215u(fileTypeResolver, fileUrl, str, null, null, false, 16, null);
        if (fileMetadataM67215u.getExtension().length() <= 0 || fileTypeResolver.m67220g().contains(fileMetadataM67215u.getExtension())) {
            FileDownloadViewFragment.Companion.downloadFile$default(FileDownloadViewFragment.f55089d0, activity, fileUrl, str, headers, false, new Function1() { // from class: com.kubi.widget.web.file.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileBridgeCoordinator.m67173j(callback, fileMetadataM67215u, activity, (Result) obj);
                }
            }, 16, null);
        } else {
            callback.invoke(new FileActionResult(false, "UNSUPPORTED_TYPE"));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m67179k(FragmentActivity fragmentActivity, String str, String str2, Function1<? super FileActionResult, Unit> function1) {
        Object objM103844constructorimpl;
        File file;
        Pair pairM90091to;
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uri = Uri.parse(str);
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                Intrinsics.checkNotNull(uri);
                pairM90091to = TuplesKt.m90091to(uri, m67180l(fragmentActivity, uri, str2));
            } else {
                if (Intrinsics.areEqual(uri.getScheme(), "file")) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    file = new File(path);
                } else {
                    file = new File(str);
                }
                if (!file.isFile()) {
                    throw new IllegalStateException("Check failed.");
                }
                Uri uriM6316a = C5285n0.m6316a(file);
                FileTypeResolver fileTypeResolver = FileTypeResolver.f55133a;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                if (str2 == null) {
                    str2 = file.getName();
                }
                pairM90091to = TuplesKt.m90091to(uriM6316a, FileTypeResolver.m67215u(fileTypeResolver, absolutePath, str2, null, null, false, 16, null));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(TuplesKt.m90091to((Uri) pairM90091to.component1(), (FileMetadata) pairM90091to.component2()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            function1.invoke(new FileActionResult(false, "SAVE_FAILED"));
            return;
        }
        Pair pair = (Pair) objM103844constructorimpl;
        if (!FileTypeResolver.f55133a.m67224k(((FileMetadata) pair.getSecond()).getFileName(), ((FileMetadata) pair.getSecond()).getMimeType())) {
            function1.invoke(new FileActionResult(false, "UNSUPPORTED_TYPE"));
            return;
        }
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "<get-first>(...)");
        m67176g(fragmentActivity, (Uri) first, (FileMetadata) pair.getSecond(), function1);
    }

    /* JADX INFO: renamed from: l */
    public final FileMetadata m67180l(FragmentActivity fragmentActivity, Uri uri, String str) throws Throwable {
        Throwable th2;
        Cursor cursor = null;
        string = null;
        string = null;
        String string = null;
        try {
            Cursor cursorQuery = fragmentActivity.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        Integer numValueOf = Integer.valueOf(cursorQuery.getColumnIndex("_display_name"));
                        if (numValueOf.intValue() < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            string = cursorQuery.getString(numValueOf.intValue());
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            FileTypeResolver fileTypeResolver = FileTypeResolver.f55133a;
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return FileTypeResolver.m67215u(fileTypeResolver, string2, string == null ? str : string, null, fragmentActivity.getContentResolver().getType(uri), false, 16, null);
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m67181m(FragmentActivity fragmentActivity, FileDownloadResult fileDownloadResult, Function1<? super FileActionResult, Unit> function1) {
        C41696j.m91104d(f55087b, null, null, new FileBridgeCoordinator$saveImage$1(fragmentActivity, fileDownloadResult, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m67172e(Function1 function1, String str, FragmentActivity fragmentActivity, Result result) {
        Object value = result.getValue();
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
        if (thM103847exceptionOrNullimpl == null) {
            FileDownloadResult fileDownloadResult = (FileDownloadResult) value;
            if (!FileTypeResolver.f55133a.m67225l(fileDownloadResult.getMetadata(), fileDownloadResult.getResponseContentType())) {
                function1.invoke(new FileActionResult(false, "UNSUPPORTED_TYPE"));
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, "album") && !fileDownloadResult.getMetadata().m67209d()) {
                function1.invoke(new FileActionResult(false, "UNSUPPORTED_TYPE"));
                return Unit.INSTANCE;
            }
            if ((Intrinsics.areEqual(str, "auto") && fileDownloadResult.getMetadata().m67209d()) || Intrinsics.areEqual(str, "album")) {
                f55086a.m67181m(fragmentActivity, fileDownloadResult, function1);
            } else {
                FileActionFragment.f55077Z.save(fragmentActivity, fileDownloadResult.getFile(), fileDownloadResult.getMetadata(), function1);
            }
            return Unit.INSTANCE;
        }
        function1.invoke(new FileActionResult(false, C27148i.m67198b(thM103847exceptionOrNullimpl, "DOWNLOAD_FAILED")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m67173j(Function1 function1, FileMetadata fileMetadata, FragmentActivity fragmentActivity, Result result) {
        Object value = result.getValue();
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
        if (thM103847exceptionOrNullimpl == null) {
            FileDownloadResult fileDownloadResult = (FileDownloadResult) value;
            FileTypeResolver fileTypeResolver = FileTypeResolver.f55133a;
            if (!fileTypeResolver.m67225l(fileDownloadResult.getMetadata(), fileDownloadResult.getResponseContentType())) {
                function1.invoke(new FileActionResult(false, "AUTH_FAILED"));
                return Unit.INSTANCE;
            }
            if (fileTypeResolver.m67220g().contains(fileMetadata.getExtension()) && !fileTypeResolver.m67223j(fileMetadata, fileDownloadResult.getResponseContentType())) {
                function1.invoke(new FileActionResult(false, "AUTH_FAILED"));
                return Unit.INSTANCE;
            }
            FileBridgeCoordinator fileBridgeCoordinator = f55086a;
            Uri uriM6316a = C5285n0.m6316a(fileDownloadResult.getFile());
            Intrinsics.checkNotNullExpressionValue(uriM6316a, "file2Uri(...)");
            fileBridgeCoordinator.m67176g(fragmentActivity, uriM6316a, fileDownloadResult.getMetadata(), function1);
            return Unit.INSTANCE;
        }
        function1.invoke(new FileActionResult(false, C27148i.m67198b(thM103847exceptionOrNullimpl, "DOWNLOAD_FAILED")));
        return Unit.INSTANCE;
    }
}

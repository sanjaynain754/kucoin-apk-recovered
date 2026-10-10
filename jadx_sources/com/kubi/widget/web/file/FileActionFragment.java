package com.kubi.widget.web.file;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: FileActionFragment.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J,\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileActionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "pickCallback", "Lkotlin/Function1;", "Lcom/kubi/widget/web/file/PickFilesResult;", "", "saveCallback", "Lcom/kubi/widget/web/file/FileActionResult;", "launched", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "handlePickResult", DbParams.KEY_CHANNEL_RESULT, "Landroidx/activity/result/ActivityResult;", "copyPickedFiles", "uris", "", "Landroid/net/Uri;", "allowedTypes", "", "", "maxSize", "", "querySource", "Lcom/kubi/widget/web/file/FileActionFragment$SourceFileInfo;", "uri", "handleSaveResult", "collectUris", "intent", "finishPick", "finishSave", "removeSelf", "onDestroy", "SourceFileInfo", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileActionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActionFragment.kt\ncom/kubi/widget/web/file/FileActionFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1869#2,2:317\n1#3:319\n*S KotlinDebug\n*F\n+ 1 FileActionFragment.kt\ncom/kubi/widget/web/file/FileActionFragment\n*L\n106#1:317,2\n*E\n"})
public final class FileActionFragment extends Fragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f55077Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    public final ExecutorService f55078U = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: V */
    @Nullable
    public Function1<? super PickFilesResult, Unit> f55079V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Function1<? super FileActionResult, Unit> f55080W;

    /* JADX INFO: renamed from: X */
    public boolean f55081X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ActivityResultLauncher<Intent> f55082Y;

    /* JADX INFO: compiled from: FileActionFragment.kt */
    @Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileActionFragment$Companion;", "", "<init>", "()V", "ACTION_PICK", "", "ACTION_SAVE", "ARG_ACTION", "ARG_FILE_TYPES", "ARG_MAX_COUNT", "ARG_MAX_SIZE", "ARG_SOURCE_PATH", "ARG_FILE_NAME", "ARG_MIME_TYPE", "NO_SIZE_LIMIT", "", "PICK_CACHE_DIRECTORY", "pick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fileTypes", "", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/widget/web/file/PickFilesResult;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "save", "source", "Ljava/io/File;", "metadata", "Lcom/kubi/widget/web/file/FileMetadata;", "Lcom/kubi/widget/web/file/FileActionResult;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void pick(@NotNull FragmentActivity activity, @NotNull List<String> fileTypes, int maxCount, @Nullable Long maxSize, @NotNull Function1<? super PickFilesResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fileTypes, "fileTypes");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FileActionFragment fileActionFragment = new FileActionFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TUIConstants.TIMPush.NOTIFICATION.ACTION, "pick");
            bundle.putStringArrayList("fileTypes", new ArrayList<>(fileTypes));
            bundle.putInt(BridgeParamKeyKt.MAX_COUNT, maxCount);
            bundle.putLong("maxSize", maxSize != null ? maxSize.longValue() : -1L);
            fileActionFragment.setArguments(bundle);
            fileActionFragment.f55079V = callback;
            activity.getSupportFragmentManager().beginTransaction().add(fileActionFragment, "filePick_" + UUID.randomUUID()).commitAllowingStateLoss();
        }

        public final void save(@NotNull FragmentActivity activity, @NotNull File source, @NotNull FileMetadata metadata, @NotNull Function1<? super FileActionResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FileActionFragment fileActionFragment = new FileActionFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TUIConstants.TIMPush.NOTIFICATION.ACTION, "save");
            bundle.putString("sourcePath", source.getAbsolutePath());
            bundle.putString("fileName", metadata.getFileName());
            bundle.putString("mimeType", metadata.getMimeType());
            fileActionFragment.setArguments(bundle);
            fileActionFragment.f55080W = callback;
            activity.getSupportFragmentManager().beginTransaction().add(fileActionFragment, "fileSave_" + UUID.randomUUID()).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.file.FileActionFragment$a, reason: from toString */
    /* JADX INFO: compiled from: FileActionFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileActionFragment$SourceFileInfo;", "", "name", "", "size", "", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMimeType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/widget/web/file/FileActionFragment$SourceFileInfo;", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SourceFileInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String name;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long size;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String mimeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SourceFileInfo)) {
                return false;
            }
            SourceFileInfo sourceFileInfo = (SourceFileInfo) other;
            return Intrinsics.areEqual(this.name, sourceFileInfo.name) && Intrinsics.areEqual(this.size, sourceFileInfo.size) && Intrinsics.areEqual(this.mimeType, sourceFileInfo.mimeType);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.size;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.mimeType;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SourceFileInfo(name=" + this.name + ", size=" + this.size + ", mimeType=" + this.mimeType + ')';
        }

        public SourceFileInfo(@Nullable String str, @Nullable Long l11, @Nullable String str2) {
            this.name = str;
            this.size = l11;
            this.mimeType = str2;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m67155s3(final FileActionFragment fileActionFragment, String str, Uri uri) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            File file = new File(str);
            if (!file.isFile()) {
                throw new IllegalStateException("Check failed.");
            }
            OutputStream outputStreamOpenOutputStream = fileActionFragment.requireContext().getContentResolver().openOutputStream(uri);
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Cannot open save destination");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
                try {
                    ByteStreamsKt.copyTo$default(bufferedInputStream, outputStreamOpenOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                    objM103844constructorimpl = Result.m103844constructorimpl(new FileActionResult(true, null, 2, null));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th6));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = new FileActionResult(false, "SAVE_FAILED");
        }
        final FileActionResult fileActionResult = (FileActionResult) objM103844constructorimpl;
        FragmentActivity activity = fileActionFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.kubi.widget.web.file.d
                @Override // java.lang.Runnable
                public final void run() {
                    FileActionFragment.m67156t3(this.f55110b, fileActionResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final List<Uri> m67158k3(Intent intent) {
        Uri data;
        ArrayList arrayList = new ArrayList();
        if (intent != null && (data = intent.getData()) != null) {
            arrayList.add(data);
        }
        ClipData clipData = intent != null ? intent.getClipData() : null;
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null && !arrayList.contains(uri)) {
                    arrayList.add(uri);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m67160m3(PickFilesResult pickFilesResult) {
        Function1<? super PickFilesResult, Unit> function1 = this.f55079V;
        if (function1 != null) {
            function1.invoke(pickFilesResult);
        }
        this.f55079V = null;
        m67165w3();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m67161n3(FileActionResult fileActionResult) {
        Function1<? super FileActionResult, Unit> function1 = this.f55080W;
        if (function1 != null) {
            function1.invoke(fileActionResult);
        }
        this.f55080W = null;
        m67165w3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f55078U.shutdownNow();
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:19:0x0040, B:21:0x0047, B:26:0x005d, B:28:0x0067, B:30:0x0071, B:38:0x007f, B:40:0x008d, B:41:0x0093), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[DONT_GENERATE, PHI: r4 r11
      0x009e: PHI (r4v3 com.kubi.widget.web.file.FileActionFragment$a) = (r4v1 com.kubi.widget.web.file.FileActionFragment$a), (r4v9 com.kubi.widget.web.file.FileActionFragment$a) binds: [B:47:0x00af, B:42:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r11v4 android.database.Cursor) = (r11v3 android.database.Cursor), (r11v5 android.database.Cursor) binds: [B:47:0x00af, B:42:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v3 */
    public final SourceFileInfo m67164v3(Uri uri) {
        ContentResolver contentResolver;
        Object objM103844constructorimpl;
        Uri uri2;
        Cursor cursorQuery;
        SourceFileInfo sourceFileInfo;
        Context context = getContext();
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return new SourceFileInfo(null, null, null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(contentResolver.getType(uri));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        try {
            uri2 = uri;
            try {
                cursorQuery = contentResolver.query(uri2, new String[]{"_display_name", "_size"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        boolean z11 = true;
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            int columnIndex2 = cursorQuery.getColumnIndex("_size");
                            Integer numValueOf = Integer.valueOf(columnIndex);
                            if (numValueOf.intValue() < 0) {
                                numValueOf = null;
                            }
                            String string = numValueOf != null ? cursorQuery.getString(numValueOf.intValue()) : null;
                            Integer numValueOf2 = Integer.valueOf(columnIndex2);
                            int iIntValue = numValueOf2.intValue();
                            if (iIntValue < 0 || cursorQuery.isNull(iIntValue)) {
                                z11 = false;
                            }
                            if (!z11) {
                                numValueOf2 = null;
                            }
                            sourceFileInfo = new SourceFileInfo(string, numValueOf2 != null ? Long.valueOf(cursorQuery.getLong(numValueOf2.intValue())) : null, str);
                        } else {
                            sourceFileInfo = new SourceFileInfo(uri2.getLastPathSegment(), null, str);
                        }
                    } catch (Throwable unused) {
                        try {
                            sourceFileInfo = new SourceFileInfo(uri2.getLastPathSegment(), null, str);
                            return sourceFileInfo;
                        } finally {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                } else {
                    sourceFileInfo = new SourceFileInfo(uri2.getLastPathSegment(), null, str);
                }
                if (cursorQuery != null) {
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
                sourceFileInfo = new SourceFileInfo(uri2.getLastPathSegment(), null, str);
                return sourceFileInfo;
            }
        } catch (Throwable unused3) {
            uri2 = uri;
        }
        return sourceFileInfo;
    }

    public FileActionFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.kubi.widget.web.file.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FileActionFragment.m67157u3(this.f55102a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f55082Y = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m67153p3(final FileActionFragment fileActionFragment, List list, Set set, long j11) {
        final PickFilesResult pickFilesResultM67159l3 = fileActionFragment.m67159l3(list, set, j11);
        FragmentActivity activity = fileActionFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.kubi.widget.web.file.e
                @Override // java.lang.Runnable
                public final void run() {
                    FileActionFragment.m67154q3(this.f55112b, pickFilesResultM67159l3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final void m67154q3(FileActionFragment fileActionFragment, PickFilesResult pickFilesResult) {
        fileActionFragment.m67160m3(pickFilesResult);
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m67156t3(FileActionFragment fileActionFragment, FileActionResult fileActionResult) {
        fileActionFragment.m67161n3(fileActionResult);
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m67157u3(FileActionFragment fileActionFragment, ActivityResult activityResult) {
        String string;
        Bundle arguments = fileActionFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString(TUIConstants.TIMPush.NOTIFICATION.ACTION);
        } else {
            string = null;
        }
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 3440673) {
                if (iHashCode == 3522941 && string.equals("save")) {
                    Intrinsics.checkNotNull(activityResult);
                    fileActionFragment.m67163r3(activityResult);
                    return;
                }
                return;
            }
            if (string.equals("pick")) {
                Intrinsics.checkNotNull(activityResult);
                fileActionFragment.m67162o3(activityResult);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX INFO: renamed from: l3 */
    public final PickFilesResult m67159l3(List<? extends Uri> list, Set<String> set, long j11) {
        ContentResolver contentResolver;
        String str;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        Throwable th2;
        Context context = getContext();
        String str2 = "SAVE_FAILED";
        if (context == null) {
            return new PickFilesResult(CollectionsKt.emptyList(), "SAVE_FAILED");
        }
        ContentResolver contentResolver2 = context.getContentResolver();
        File file = new File(context.getCacheDir(), "file_bridge/picked");
        if (!file.exists() && !file.mkdirs()) {
            return new PickFilesResult(CollectionsKt.emptyList(), "SAVE_FAILED");
        }
        ArrayList arrayList = new ArrayList();
        String errorCode = null;
        for (Uri uri : list) {
            SourceFileInfo sourceFileInfoM67164v3 = m67164v3(uri);
            FileTypeResolver fileTypeResolver = FileTypeResolver.f55133a;
            String strM67230s = fileTypeResolver.m67230s(sourceFileInfoM67164v3.getMimeType());
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FileMetadata fileMetadataM67215u = FileTypeResolver.m67215u(fileTypeResolver, string, sourceFileInfoM67164v3.getName(), null, strM67230s, false, 16, null);
            if (!fileTypeResolver.m67224k(fileMetadataM67215u.getFileName(), strM67230s) || !fileTypeResolver.m67221h(fileMetadataM67215u.getExtension(), set)) {
                str = str2;
                contentResolver = contentResolver2;
                if (errorCode == null) {
                    errorCode = "UNSUPPORTED_TYPE";
                }
            } else if (j11 > 0 && sourceFileInfoM67164v3.getSize() != null && sourceFileInfoM67164v3.getSize().longValue() > j11) {
                str = str2;
                contentResolver = contentResolver2;
                errorCode = "FILE_TOO_LARGE";
            } else {
                File file2 = new File(file, UUID.randomUUID() + '_' + fileMetadataM67215u.getFileName());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    InputStream inputStreamOpenInputStream = contentResolver2.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 8192);
                            try {
                                byte[] bArr = new byte[8192];
                                long j12 = 0;
                                while (true) {
                                    int i11 = inputStreamOpenInputStream.read(bArr);
                                    if (i11 >= 0) {
                                        str = str2;
                                        contentResolver = contentResolver2;
                                        j12 += (long) i11;
                                        if (j11 > 0 && j12 > j11) {
                                            throw new FileBridgeException("FILE_TOO_LARGE", null, 2, null);
                                        }
                                        try {
                                            bufferedOutputStream.write(bArr, 0, i11);
                                            str2 = str;
                                            contentResolver2 = contentResolver;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                        }
                                        th2 = th3;
                                        try {
                                            throw th2;
                                        } catch (Throwable th4) {
                                            CloseableKt.closeFinally(bufferedOutputStream, th2);
                                            throw th4;
                                        }
                                    }
                                    str = str2;
                                    contentResolver = contentResolver2;
                                    try {
                                        Unit unit = Unit.INSTANCE;
                                        try {
                                            CloseableKt.closeFinally(bufferedOutputStream, null);
                                            try {
                                                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                                                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                                break;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Result.Companion companion2 = Result.INSTANCE;
                                                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                                if (thM103847exceptionOrNullimpl != null) {
                                                    file2.delete();
                                                    if (thM103847exceptionOrNullimpl instanceof FileBridgeException) {
                                                        errorCode = ((FileBridgeException) thM103847exceptionOrNullimpl).getErrorCode();
                                                    } else if (errorCode == null) {
                                                        errorCode = str;
                                                    }
                                                } else {
                                                    String absolutePath = file2.getAbsolutePath();
                                                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                                    arrayList.add(new LocalPickedFile(absolutePath, fileMetadataM67215u.getFileName(), fileMetadataM67215u.getMimeType(), fileMetadataM67215u.getExtension(), Long.valueOf(file2.length())));
                                                }
                                                str2 = str;
                                                contentResolver2 = contentResolver;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            Throwable th7 = th;
                                            try {
                                                throw th7;
                                            } catch (Throwable th8) {
                                                CloseableKt.closeFinally(inputStreamOpenInputStream, th7);
                                                throw th8;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th2 = th;
                                        throw th2;
                                    }
                                }
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                if (thM103847exceptionOrNullimpl != null) {
                                    file2.delete();
                                    if (thM103847exceptionOrNullimpl instanceof FileBridgeException) {
                                        errorCode = ((FileBridgeException) thM103847exceptionOrNullimpl).getErrorCode();
                                    } else if (errorCode == null) {
                                        errorCode = str;
                                    }
                                } else {
                                    String absolutePath2 = file2.getAbsolutePath();
                                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                                    arrayList.add(new LocalPickedFile(absolutePath2, fileMetadataM67215u.getFileName(), fileMetadataM67215u.getMimeType(), fileMetadataM67215u.getExtension(), Long.valueOf(file2.length())));
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                str = str2;
                                contentResolver = contentResolver2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            str = str2;
                            contentResolver = contentResolver2;
                        }
                    } else {
                        throw new IllegalStateException("Cannot open selected file");
                    }
                } catch (Throwable th12) {
                    th = th12;
                    str = str2;
                    contentResolver = contentResolver2;
                }
            }
            str2 = str;
            contentResolver2 = contentResolver;
        }
        return new PickFilesResult(arrayList, errorCode);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m67162o3(ActivityResult activityResult) {
        List listEmptyList = null;
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Bundle arguments = getArguments();
            int iCoerceAtLeast = 1;
            if (arguments != null) {
                iCoerceAtLeast = RangesKt.coerceAtLeast(arguments.getInt(BridgeParamKeyKt.MAX_COUNT, 1), 1);
            }
            final List listTake = CollectionsKt.take(m67158k3(activityResult.getData()), iCoerceAtLeast);
            if (listTake.isEmpty()) {
                m67160m3(new PickFilesResult(CollectionsKt.emptyList(), null, 2, null));
                return;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                listEmptyList = arguments2.getStringArrayList("fileTypes");
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            final Set set = CollectionsKt.toSet(listEmptyList);
            Bundle arguments3 = getArguments();
            long j11 = -1;
            if (arguments3 != null) {
                j11 = arguments3.getLong("maxSize", -1L);
            }
            final long j12 = j11;
            this.f55078U.execute(new Runnable() { // from class: com.kubi.widget.web.file.b
                @Override // java.lang.Runnable
                public final void run() {
                    FileActionFragment.m67153p3(this.f55103b, listTake, set, j12);
                }
            });
            return;
        }
        m67160m3(new PickFilesResult(CollectionsKt.emptyList(), null, 2, null));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        Object objM103844constructorimpl;
        String string2;
        super.onCreate(savedInstanceState);
        if (!this.f55081X) {
            int i11 = 1;
            this.f55081X = true;
            Bundle arguments = getArguments();
            String string3 = null;
            List listEmptyList = null;
            if (arguments != null) {
                string = arguments.getString(TUIConstants.TIMPush.NOTIFICATION.ACTION);
            } else {
                string = null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                if (Intrinsics.areEqual(string, "pick")) {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        listEmptyList = arguments2.getStringArrayList("fileTypes");
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        i11 = arguments3.getInt(BridgeParamKeyKt.MAX_COUNT, 1);
                    }
                    this.f55082Y.launch(FileIntentFactory.f55128a.m67203a(listEmptyList, i11));
                } else if (Intrinsics.areEqual(string, "save")) {
                    ActivityResultLauncher<Intent> activityResultLauncher = this.f55082Y;
                    FileIntentFactory fileIntentFactory = FileIntentFactory.f55128a;
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null) {
                        string2 = arguments4.getString("fileName");
                    } else {
                        string2 = null;
                    }
                    String str = "";
                    if (string2 == null) {
                        string2 = "";
                    }
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null) {
                        string3 = arguments5.getString("mimeType");
                    }
                    if (string3 != null) {
                        str = string3;
                    }
                    activityResultLauncher.launch(fileIntentFactory.m67205c(string2, str));
                } else {
                    throw new IllegalStateException("Unknown file action");
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                if (Intrinsics.areEqual(string, "save")) {
                    m67161n3(new FileActionResult(false, "NO_VIEWER"));
                } else {
                    m67160m3(new PickFilesResult(CollectionsKt.emptyList(), "NO_VIEWER"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m67163r3(ActivityResult activityResult) {
        final Uri data;
        Intent data2 = activityResult.getData();
        final String string = null;
        if (data2 != null) {
            data = data2.getData();
        } else {
            data = null;
        }
        if (activityResult.getResultCode() == -1 && data != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString("sourcePath");
            }
            if (string == null) {
                string = "";
            }
            this.f55078U.execute(new Runnable() { // from class: com.kubi.widget.web.file.c
                @Override // java.lang.Runnable
                public final void run() {
                    FileActionFragment.m67155s3(this.f55107b, string, data);
                }
            });
            return;
        }
        m67161n3(new FileActionResult(false, "USER_CANCELLED"));
    }

    /* JADX INFO: renamed from: w3 */
    public final void m67165w3() {
        if (isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }
}

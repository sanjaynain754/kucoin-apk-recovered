package com.kubi.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import v70.C45463a;

/* JADX INFO: renamed from: com.kubi.utils.i0 */
/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ;\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/utils/i0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "copyIfNull", "", "d", "(Landroid/content/Context;Landroid/net/Uri;Z)Ljava/lang/String;", "c", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "selection", "", "selectionArgs", "b", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "f", "(Landroid/net/Uri;)Z", "e", "g", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\ncom/kubi/utils/PathUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n731#2,9:192\n731#2,9:203\n37#3,2:201\n37#3,2:212\n1#4:214\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\ncom/kubi/utils/PathUtils\n*L\n50#1:192,9\n76#1:203,9\n50#1:201,2\n76#1:212,2\n*E\n"})
public final class C27054i0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27054i0 f54340a = new C27054i0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final String m66737a(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                File fileCreateTempFile = File.createTempFile("temp", null, context.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = inputStreamOpenInputStream.read(bArr);
                        if (i11 <= 0) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            fileCreateTempFile.deleteOnExit();
                            String absolutePath = fileCreateTempFile.getAbsolutePath();
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            return absolutePath;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        } catch (Exception unused) {
            C45463a.m100409b("Failed to obtain a temporary path through a URI，uri = " + uri, "PathUtils");
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final String m66739c(Context context, Uri uri) {
        List listEmptyList;
        Uri uri2;
        List listEmptyList2;
        try {
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if (m66742f(uri)) {
                    String docId = DocumentsContract.getDocumentId(uri);
                    Intrinsics.checkNotNullExpressionValue(docId, "docId");
                    List<String> listSplit = new Regex(C33844oi.f71346o).split(docId, 0);
                    if (!listSplit.isEmpty()) {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listEmptyList2 = CollectionsKt.emptyList();
                                break;
                            }
                            if (listIterator.previous().length() != 0) {
                                listEmptyList2 = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        listEmptyList2 = CollectionsKt.emptyList();
                        break;
                    }
                    String[] strArr = (String[]) listEmptyList2.toArray(new String[0]);
                    String str = strArr[0];
                    if (StringsKt.equals("primary", str, true)) {
                        return Environment.getExternalStorageDirectory().toString() + '/' + strArr[1];
                    }
                    if (StringsKt.equals("home", str, true)) {
                        return Environment.getExternalStorageDirectory().toString() + "/documents/" + strArr[1];
                    }
                } else {
                    if (m66741e(uri)) {
                        String id2 = DocumentsContract.getDocumentId(uri);
                        Intrinsics.checkNotNullExpressionValue(id2, "id");
                        if (StringsKt.startsWith$default(id2, "raw:", false, 2, (Object) null)) {
                            String strReplaceFirst$default = StringsKt.replaceFirst$default(id2, "raw:", "", false, 4, (Object) null);
                            if (new File(strReplaceFirst$default).exists()) {
                                return strReplaceFirst$default;
                            }
                        }
                        Uri uriWithAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(id2));
                        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(\n        …g()\n                    )");
                        return m66738b(context, uriWithAppendedId, null, null);
                    }
                    if (m66743g(uri)) {
                        String docId2 = DocumentsContract.getDocumentId(uri);
                        Intrinsics.checkNotNullExpressionValue(docId2, "docId");
                        List<String> listSplit2 = new Regex(C33844oi.f71346o).split(docId2, 0);
                        if (!listSplit2.isEmpty()) {
                            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    listEmptyList = CollectionsKt.emptyList();
                                    break;
                                }
                                if (listIterator2.previous().length() != 0) {
                                    listEmptyList = CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                            break;
                        }
                        String[] strArr2 = (String[]) listEmptyList.toArray(new String[0]);
                        String str2 = strArr2[0];
                        int iHashCode = str2.hashCode();
                        if (iHashCode != 93166550) {
                            if (iHashCode != 100313435) {
                                uri2 = (iHashCode == 112202875 && str2.equals("video")) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : null;
                            } else if (str2.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            }
                        } else if (str2.equals("audio")) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        String[] strArr3 = {strArr2[1]};
                        if (uri2 == null) {
                            return null;
                        }
                        return m66738b(context, uri2, "_id=?", strArr3);
                    }
                }
            } else {
                if (StringsKt.equals("content", uri.getScheme(), true)) {
                    return m66738b(context, uri, null, null);
                }
                if (StringsKt.equals("file", uri.getScheme(), true)) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Throwable unused) {
            C45463a.m100409b("Failed to convert the URI to path，uri = " + uri, "PathUtils");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m66738b(@NotNull Context context, @NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, selection, selectionArgs, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                } else {
                    string = null;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            string = null;
        }
        CloseableKt.closeFinally(cursorQuery, null);
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m66740d(@NotNull Context context, @NotNull Uri uri, boolean copyIfNull) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strM66739c = m66739c(context, uri);
        if (strM66739c != null) {
            return strM66739c;
        }
        if (copyIfNull) {
            return m66737a(context, uri);
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m66741e(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m66742f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m66743g(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }
}

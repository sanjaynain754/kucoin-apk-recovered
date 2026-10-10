package com.kubi.widget.web.file;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.file.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FileIntentFactory.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileIntentFactory;", "", "<init>", "()V", "pick", "Landroid/content/Intent;", "fileTypes", "", "", BridgeParamKeyKt.MAX_COUNT, "", "preview", "uri", "Landroid/net/Uri;", "mimeType", "save", "fileName", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FileIntentFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FileIntentFactory f55128a = new FileIntentFactory();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Intent m67203a(@Nullable Collection<String> collection, int i11) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", FileTypeResolver.f55133a.m67227n(collection));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", i11 > 1);
        return intent;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Intent m67205c(@NotNull String fileName, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeType);
        intent.putExtra("android.intent.extra.TITLE", fileName);
        return intent;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Intent m67204b(@NotNull Uri uri, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, mimeType);
        intent.setClipData(ClipData.newRawUri("file", uri));
        intent.addFlags(1);
        return intent;
    }
}

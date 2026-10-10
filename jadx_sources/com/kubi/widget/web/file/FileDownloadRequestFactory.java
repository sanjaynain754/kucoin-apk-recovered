package com.kubi.widget.web.file;

import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.widget.web.file.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FileDownloadRequestFactory.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileDownloadRequestFactory;", "", "<init>", "()V", "create", "Lokhttp3/Request;", "url", "", "headers", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileDownloadRequestFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloadRequestFactory.kt\ncom/kubi/widget/web/file/FileDownloadRequestFactory\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,19:1\n216#2,2:20\n*S KotlinDebug\n*F\n+ 1 FileDownloadRequestFactory.kt\ncom/kubi/widget/web/file/FileDownloadRequestFactory\n*L\n14#1:20,2\n*E\n"})
public final class FileDownloadRequestFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FileDownloadRequestFactory f55122a = new FileDownloadRequestFactory();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Request m67199a(@NotNull String url, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Request.Builder builderUrl = new Request.Builder().url(url);
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builderUrl.header(entry.getKey(), entry.getValue());
        }
        return builderUrl.build();
    }
}

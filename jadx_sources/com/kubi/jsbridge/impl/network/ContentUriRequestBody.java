package com.kubi.jsbridge.impl.network;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UploadFilePartBuilder.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/ContentUriRequestBody;", "Lokhttp3/RequestBody;", "resolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "mediaType", "Lokhttp3/MediaType;", "contentLength", "", "<init>", "(Landroid/content/ContentResolver;Landroid/net/Uri;Lokhttp3/MediaType;Ljava/lang/Long;)V", "Ljava/lang/Long;", "contentType", "writeTo", "", "sink", "Lokio/BufferedSink;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContentUriRequestBody extends RequestBody {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final ContentResolver f27462g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Uri f27463h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MediaType f27464i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Long f27465j;

    public ContentUriRequestBody(@NotNull ContentResolver resolver, @NotNull Uri uri, @NotNull MediaType mediaType, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.f27462g = resolver;
        this.f27463h = uri;
        this.f27464i = mediaType;
        this.f27465j = l11;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        Long l11 = this.f27465j;
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    @NotNull
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getF27464i() {
        return this.f27464i;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InputStream inputStreamOpenInputStream = this.f27462g.openInputStream(this.f27463h);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException("content uri 无法读取: " + this.f27463h);
        }
        Source source = Okio.source(inputStreamOpenInputStream);
        try {
            sink.writeAll(source);
            CloseableKt.closeFinally(source, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(source, th2);
                throw th3;
            }
        }
    }
}

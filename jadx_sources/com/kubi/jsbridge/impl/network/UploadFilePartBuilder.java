package com.kubi.jsbridge.impl.network;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.jumio.core.constants.ConstantsKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.io.File;
import java.net.URI;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: UploadFilePartBuilder.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003)*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J0\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J4\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J.\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001dH\u0002J$\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0#2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fJ&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder;", "", "<init>", "()V", "FILE_PART_NAME", "", "DEFAULT_FILE_NAME", "DEFAULT_MIME", "FILE_SCHEME", "CONTENT_SCHEME", "BASE64_DELIMITER", "HEADER_CONTENT_TYPE", "buildFilePart", "Lokhttp3/MultipartBody$Part;", "file", "", "resolver", "Landroid/content/ContentResolver;", "buildRawBody", "Lokhttp3/RequestBody;", "contentType", "resolveFile", "Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$ResolvedUploadFile;", "contentTypeOverride", "buildFromUri", "uri", "name", "type", "buildFromContentUri", "Landroid/net/Uri;", "queryContentMetadata", "Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$ContentUriMetadata;", "buildFromData", "data", "buildFormParts", "", ReportDataTable.COLUMN_PARAMS, "stripReservedHeaders", "headers", "guessMime", "fileName", "ResolvedUploadFile", "UploadParamException", "ContentUriMetadata", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadFilePartBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFilePartBuilder.kt\ncom/kubi/jsbridge/impl/network/UploadFilePartBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,226:1\n1#2:227\n126#3:228\n153#3,3:229\n488#4,7:232\n*S KotlinDebug\n*F\n+ 1 UploadFilePartBuilder.kt\ncom/kubi/jsbridge/impl/network/UploadFilePartBuilder\n*L\n186#1:228\n186#1:229,3\n195#1:232,7\n*E\n"})
public final class UploadFilePartBuilder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UploadFilePartBuilder f27457a = new UploadFilePartBuilder();

    /* JADX INFO: compiled from: UploadFilePartBuilder.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$UploadParamException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UploadParamException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadParamException(@NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.UploadFilePartBuilder$a, reason: from toString */
    /* JADX INFO: compiled from: UploadFilePartBuilder.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$ContentUriMetadata;", "", "displayName", "", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getDisplayName", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$ContentUriMetadata;", "equals", "", "other", "hashCode", "", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ContentUriMetadata {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String displayName;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long size;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentUriMetadata() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentUriMetadata)) {
                return false;
            }
            ContentUriMetadata contentUriMetadata = (ContentUriMetadata) other;
            return Intrinsics.areEqual(this.displayName, contentUriMetadata.displayName) && Intrinsics.areEqual(this.size, contentUriMetadata.size);
        }

        public ContentUriMetadata(@Nullable String str, @Nullable Long l11) {
            this.displayName = str;
            this.size = l11;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        public int hashCode() {
            String str = this.displayName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.size;
            return iHashCode + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContentUriMetadata(displayName=" + this.displayName + ", size=" + this.size + ')';
        }

        public /* synthetic */ ContentUriMetadata(String str, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.UploadFilePartBuilder$b, reason: from toString */
    /* JADX INFO: compiled from: UploadFilePartBuilder.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFilePartBuilder$ResolvedUploadFile;", "", "fileName", "", TtmlNode.TAG_BODY, "Lokhttp3/RequestBody;", "<init>", "(Ljava/lang/String;Lokhttp3/RequestBody;)V", "getFileName", "()Ljava/lang/String;", "getBody", "()Lokhttp3/RequestBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ResolvedUploadFile {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String fileName;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RequestBody body;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolvedUploadFile)) {
                return false;
            }
            ResolvedUploadFile resolvedUploadFile = (ResolvedUploadFile) other;
            return Intrinsics.areEqual(this.fileName, resolvedUploadFile.fileName) && Intrinsics.areEqual(this.body, resolvedUploadFile.body);
        }

        public ResolvedUploadFile(@NotNull String fileName, @NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(body, "body");
            this.fileName = fileName;
            this.body = body;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return (this.fileName.hashCode() * 31) + this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return "ResolvedUploadFile(fileName=" + this.fileName + ", body=" + this.body + ')';
        }
    }

    /* JADX INFO: renamed from: d */
    public final ResolvedUploadFile m31809d(String str, String str2, String str3) throws UploadParamException {
        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(StringsKt.substringAfterLast$default(str, "base64,", (String) null, 2, (Object) null));
        if (byteStringDecodeBase64 == null) {
            throw new UploadParamException("file.data base64 解码失败");
        }
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType.Companion companion2 = MediaType.INSTANCE;
        if (str3 == null) {
            str3 = ConstantsKt.MIME_TYPE_OCTET_STREAM;
        }
        RequestBody requestBodyCreate = companion.create(byteStringDecodeBase64, companion2.parse(str3));
        if (str2 == null) {
            str2 = "default";
        }
        return new ResolvedUploadFile(str2, requestBodyCreate);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ResolvedUploadFile m31805j(UploadFilePartBuilder uploadFilePartBuilder, Map map, String str, ContentResolver contentResolver, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            contentResolver = null;
        }
        return uploadFilePartBuilder.m31814i(map, str, contentResolver);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MultipartBody.Part m31806a(@NotNull Map<String, ? extends Object> file, @Nullable ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(file, "file");
        ResolvedUploadFile resolvedUploadFileM31805j = m31805j(this, file, null, contentResolver, 2, null);
        return MultipartBody.Part.INSTANCE.createFormData("file", resolvedUploadFileM31805j.getFileName(), resolvedUploadFileM31805j.getBody());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<MultipartBody.Part> m31807b(@Nullable Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            arrayList.add(MultipartBody.Part.INSTANCE.createFormData(entry.getKey(), entry.getValue().toString()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ResolvedUploadFile m31810e(String str, ContentResolver contentResolver, String str2, String str3) throws UploadParamException {
        Object objM103844constructorimpl;
        if (StringsKt.startsWith(str, "content:", true)) {
            if (contentResolver != null) {
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                return m31808c(contentResolver, uri, str2, str3);
            }
            throw new UploadParamException("content uri 缺少 ContentResolver: " + str);
        }
        if (StringsKt.startsWith(str, "file:", true)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new URI(str).getPath());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            String str4 = (String) objM103844constructorimpl;
            if (str4 != null) {
                String str5 = StringsKt.isBlank(str4) ? null : str4;
                if (str5 != null) {
                    str = str5;
                }
            }
            throw new UploadParamException("file uri 无有效路径: " + str);
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new UploadParamException("本地文件不存在或不可读: " + str);
        }
        if (str3 == null) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            str3 = m31812g(name);
            if (str3 == null) {
                str3 = ConstantsKt.MIME_TYPE_OCTET_STREAM;
            }
        }
        RequestBody requestBodyCreate = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(str3));
        if (str2 == null) {
            str2 = file.getName();
        }
        Intrinsics.checkNotNull(str2);
        return new ResolvedUploadFile(str2, requestBodyCreate);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final RequestBody m31811f(@NotNull Map<String, ? extends Object> file, @Nullable String str, @Nullable ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        return m31814i(file, str, contentResolver).getBody();
    }

    /* JADX INFO: renamed from: g */
    public final String m31812g(String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(URLConnection.guessContentTypeFromName(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (String) objM103844constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final ContentUriMetadata m31813h(ContentResolver contentResolver, Uri uri) {
        Object objM103844constructorimpl;
        String string;
        Long lValueOf;
        ContentUriMetadata contentUriMetadata;
        int i11 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name", "_size"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        int columnIndex2 = cursorQuery.getColumnIndex("_size");
                        if (columnIndex < 0 || cursorQuery.isNull(columnIndex) || (string = cursorQuery.getString(columnIndex)) == null || StringsKt.isBlank(string)) {
                            string = null;
                        }
                        if (columnIndex2 < 0 || cursorQuery.isNull(columnIndex2)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorQuery.getLong(columnIndex2));
                            if (lValueOf.longValue() < 0) {
                                lValueOf = null;
                            }
                        }
                        contentUriMetadata = new ContentUriMetadata(string, lValueOf);
                    } else {
                        contentUriMetadata = new ContentUriMetadata(str, objArr5 == true ? 1 : 0, i11, objArr4 == true ? 1 : 0);
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
                contentUriMetadata = new ContentUriMetadata(str, objArr5 == true ? 1 : 0, i11, objArr4 == true ? 1 : 0);
            }
            CloseableKt.closeFinally(cursorQuery, null);
            objM103844constructorimpl = Result.m103844constructorimpl(contentUriMetadata);
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        ContentUriMetadata contentUriMetadata2 = (ContentUriMetadata) objM103844constructorimpl;
        return contentUriMetadata2 == null ? new ContentUriMetadata(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0) : contentUriMetadata2;
    }

    /* JADX INFO: renamed from: i */
    public final ResolvedUploadFile m31814i(Map<String, ? extends Object> map, String str, ContentResolver contentResolver) throws UploadParamException {
        Object obj = map.get("uri");
        String str2 = null;
        String str3 = obj instanceof String ? (String) obj : null;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str3 = null;
        }
        Object obj2 = map.get("data");
        String str4 = obj2 instanceof String ? (String) obj2 : null;
        if (str4 == null || StringsKt.isBlank(str4)) {
            str4 = null;
        }
        Object obj3 = map.get("name");
        String str5 = obj3 instanceof String ? (String) obj3 : null;
        if (str5 == null || StringsKt.isBlank(str5)) {
            str5 = null;
        }
        Object obj4 = map.get("type");
        String str6 = obj4 instanceof String ? (String) obj4 : null;
        if (str6 != null && !StringsKt.isBlank(str6)) {
            str2 = str6;
        }
        if (str3 != null) {
            if (str == null) {
                str = str2;
            }
            return m31810e(str3, contentResolver, str5, str);
        }
        if (str4 == null) {
            throw new UploadParamException("file.uri 和 file.data 均缺失");
        }
        if (str == null) {
            str = str2;
        }
        return m31809d(str4, str5, str);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Map<String, String> m31815k(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (headers.isEmpty()) {
            return headers;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            if (!StringsKt.equals(entry.getKey(), "Content-Type", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final ResolvedUploadFile m31808c(ContentResolver contentResolver, Uri uri, String str, String str2) {
        MediaType mediaType;
        Object objM103844constructorimpl;
        MediaType mediaType2;
        ContentUriMetadata contentUriMetadataM31813h = m31813h(contentResolver, uri);
        Object obj = null;
        if (str == null && (str = contentUriMetadataM31813h.getDisplayName()) == null) {
            str = uri.getLastPathSegment();
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                str = "default";
            }
        }
        if (str2 != null) {
            mediaType = MediaType.INSTANCE.parse(str2);
        } else {
            mediaType = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String type = contentResolver.getType(uri);
            if (type != null) {
                mediaType2 = MediaType.INSTANCE.parse(type);
            } else {
                mediaType2 = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(mediaType2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        MediaType mediaType3 = (MediaType) obj;
        if (mediaType == null) {
            if (mediaType3 == null) {
                mediaType = MediaType.INSTANCE.get(ConstantsKt.MIME_TYPE_OCTET_STREAM);
            } else {
                mediaType = mediaType3;
            }
        }
        return new ResolvedUploadFile(str, new ContentUriRequestBody(contentResolver, uri, mediaType, contentUriMetadataM31813h.getSize()));
    }
}

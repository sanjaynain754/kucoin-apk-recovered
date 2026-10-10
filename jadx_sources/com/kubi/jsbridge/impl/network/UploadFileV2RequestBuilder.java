package com.kubi.jsbridge.impl.network;

import android.content.ContentResolver;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UploadFileV2RequestBuilder.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jz\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000bJ\u0010\u0010\u001a\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001b\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFileV2RequestBuilder;", "", "<init>", "()V", "UPLOAD_TYPE_MULTIPART", "", "UPLOAD_TYPE_RAW", "METHOD_POST", "METHOD_PUT", "HEADER_CONTENT_TYPE", "prepare", "Lcom/kubi/jsbridge/impl/network/UploadFileV2RequestBuilder$PreparedUpload;", "file", "", FirebaseAnalytics.Param.METHOD, "uploadType", ReportDataTable.COLUMN_PARAMS, "headers", "resolver", "Landroid/content/ContentResolver;", "encodeFormValue", "Lkotlin/Function1;", "buildRequest", "Lokhttp3/Request;", "url", "upload", "normalizeMethod", "normalizeUploadType", "PreparedUpload", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadFileV2RequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileV2RequestBuilder.kt\ncom/kubi/jsbridge/impl/network/UploadFileV2RequestBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n463#2:123\n413#2:124\n1252#3,4:125\n1869#3,2:129\n295#3,2:131\n216#4,2:133\n1#5:135\n*S KotlinDebug\n*F\n+ 1 UploadFileV2RequestBuilder.kt\ncom/kubi/jsbridge/impl/network/UploadFileV2RequestBuilder\n*L\n49#1:123\n49#1:124\n49#1:125,4\n52#1:129,2\n72#1:131,2\n91#1:133,2\n*E\n"})
public final class UploadFileV2RequestBuilder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UploadFileV2RequestBuilder f27474a = new UploadFileV2RequestBuilder();

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.i$a, reason: from toString */
    /* JADX INFO: compiled from: UploadFileV2RequestBuilder.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFileV2RequestBuilder$PreparedUpload;", "", FirebaseAnalytics.Param.METHOD, "", "uploadType", TtmlNode.TAG_BODY, "Lokhttp3/RequestBody;", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)V", "getMethod", "()Ljava/lang/String;", "getUploadType", "getBody", "()Lokhttp3/RequestBody;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PreparedUpload {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String method;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String uploadType;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final RequestBody body;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final Map<String, String> headers;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreparedUpload)) {
                return false;
            }
            PreparedUpload preparedUpload = (PreparedUpload) other;
            return Intrinsics.areEqual(this.method, preparedUpload.method) && Intrinsics.areEqual(this.uploadType, preparedUpload.uploadType) && Intrinsics.areEqual(this.body, preparedUpload.body) && Intrinsics.areEqual(this.headers, preparedUpload.headers);
        }

        public PreparedUpload(@NotNull String method, @NotNull String uploadType, @NotNull RequestBody body, @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(uploadType, "uploadType");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.method = method;
            this.uploadType = uploadType;
            this.body = body;
            this.headers = headers;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, String> m31827b() {
            return this.headers;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public int hashCode() {
            return (((((this.method.hashCode() * 31) + this.uploadType.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode();
        }

        @NotNull
        public String toString() {
            return "PreparedUpload(method=" + this.method + ", uploadType=" + this.uploadType + ", body=" + this.body + ", headers=" + this.headers + ')';
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Request m31822a(@NotNull String url, @NotNull PreparedUpload upload) throws UploadFilePartBuilder.UploadParamException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(upload, "upload");
        try {
            Request.Builder builderUrl = new Request.Builder().url(url);
            for (Map.Entry<String, String> entry : upload.m31827b().entrySet()) {
                builderUrl.header(entry.getKey(), entry.getValue());
            }
            return builderUrl.method(upload.getMethod(), upload.getBody()).build();
        } catch (IllegalArgumentException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "请求参数无效";
            }
            throw new UploadFilePartBuilder.UploadParamException(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m31823b(@Nullable String str) throws UploadFilePartBuilder.UploadParamException {
        String upperCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            upperCase = "POST";
        } else {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase == null) {
                    upperCase = "POST";
                }
            } else {
                upperCase = "POST";
            }
        }
        if (Intrinsics.areEqual(upperCase, "POST") || Intrinsics.areEqual(upperCase, "PUT")) {
            return upperCase;
        }
        throw new UploadFilePartBuilder.UploadParamException("method 仅支持 POST 或 PUT");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m31824c(@Nullable String str) throws UploadFilePartBuilder.UploadParamException {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = "multipart";
        } else {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = string.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    lowerCase = "multipart";
                }
            } else {
                lowerCase = "multipart";
            }
        }
        if (Intrinsics.areEqual(lowerCase, "multipart") || Intrinsics.areEqual(lowerCase, "raw")) {
            return lowerCase;
        }
        throw new UploadFilePartBuilder.UploadParamException("config.uploadType 仅支持 multipart 或 raw");
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
    @NotNull
    /* JADX INFO: renamed from: d */
    public final PreparedUpload m31825d(@NotNull Map<String, ? extends Object> file, @Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @NotNull Map<String, String> headers, @Nullable ContentResolver contentResolver, @NotNull Function1<Object, String> encodeFormValue) throws UploadFilePartBuilder.UploadParamException {
        Object next;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(encodeFormValue, "encodeFormValue");
        String strM31823b = m31823b(str);
        String strM31824c = m31824c(str2);
        LinkedHashMap linkedHashMap = null;
        if (!Intrinsics.areEqual(strM31824c, "multipart")) {
            if (!Intrinsics.areEqual(strM31824c, "raw")) {
                throw new IllegalStateException("unreachable");
            }
            Iterator<T> it = headers.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.equals((String) ((Map.Entry) next).getKey(), "Content-Type", true));
            Map.Entry entry = (Map.Entry) next;
            return new PreparedUpload(strM31823b, strM31824c, UploadFilePartBuilder.f27457a.m31811f(file, entry != null ? (String) entry.getValue() : null, contentResolver), headers);
        }
        Map<String, String> mapM31815k = UploadFilePartBuilder.f27457a.m31815k(headers);
        MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
        if (map != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap.put(entry2.getKey(), encodeFormValue.invoke(entry2.getValue()));
            }
        }
        UploadFilePartBuilder uploadFilePartBuilder = UploadFilePartBuilder.f27457a;
        for (MultipartBody.Part part : CollectionsKt.plus((Collection) CollectionsKt.listOf(uploadFilePartBuilder.m31806a(file, contentResolver)), (Iterable) uploadFilePartBuilder.m31807b(linkedHashMap))) {
            Headers headers2 = part.headers();
            if (headers2 == null) {
                type.addPart(part.body());
            } else {
                type.addPart(headers2, part.body());
            }
        }
        return new PreparedUpload(strM31823b, strM31824c, type.build(), mapM31815k);
    }
}

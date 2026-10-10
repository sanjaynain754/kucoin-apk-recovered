package ir;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ir.c */
/* JADX INFO: compiled from: RequestUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lir/c;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "Lokhttp3/Request;", "request", "", "b", "(Lokhttp3/Request;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "sNextGeneratedId", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestUtils.kt\ncom/kubi/network/api/utils/RequestUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class C40168c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40168c f89309a = new C40168c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger sNextGeneratedId = new AtomicInteger(10000);

    /* JADX INFO: renamed from: a */
    public final int m88526a() {
        AtomicInteger atomicInteger;
        int i11;
        int i12;
        do {
            atomicInteger = sNextGeneratedId;
            i11 = atomicInteger.get();
            i12 = i11 + 1;
            if (i12 >= Integer.MAX_VALUE) {
                i12 = 10000;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m88527b(@NotNull Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTPS");
        stringBuffer.append("_");
        stringBuffer.append(request.method());
        stringBuffer.append("_");
        stringBuffer.append(request.url().getUrl());
        stringBuffer.append("_");
        String str = request.headers().get("X-APP-TOKEN");
        if (str == null) {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append("_");
        String str2 = request.headers().get("LANG");
        if (str2 == null) {
            str2 = "";
        }
        stringBuffer.append(str2);
        stringBuffer.append("_");
        String str3 = request.headers().get("isWs");
        if (str3 == null) {
            str3 = "";
        }
        stringBuffer.append(str3);
        stringBuffer.append("_");
        String str4 = request.headers().get(Constants.BIZ);
        stringBuffer.append(str4 != null ? str4 : "");
        stringBuffer.append("_");
        Buffer buffer = new Buffer();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            requestBodyBody.writeTo(buffer);
        }
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
        stringBuffer.append(buffer.readString(charsetForName));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …TF-8\")))\n    }.toString()");
        return string;
    }
}

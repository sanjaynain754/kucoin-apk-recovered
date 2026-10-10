package pr;

import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: pr.c */
/* JADX INFO: compiled from: RequestInfoInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lpr/c;", "", "Lokhttp3/Response;", "response", "<init>", "(Lokhttp3/Response;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lokhttp3/Response;", "Lokhttp3/Response;", "Lokhttp3/MediaType;", "b", "Lokhttp3/MediaType;", "type", "", "c", "[B", "content", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestInfoInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestInfoInterceptor.kt\ncom/kubi/network/retrofit/interceptor/ResponseWrap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class C43530c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Response response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final MediaType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final byte[] content;

    public C43530c(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        ResponseBody responseBodyBody = response.body();
        this.type = responseBodyBody != null ? responseBodyBody.get$contentType() : null;
        ResponseBody responseBodyBody2 = response.body();
        this.content = responseBodyBody2 != null ? responseBodyBody2.bytes() : null;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Response m95794a() {
        Response.Builder builderNewBuilder = this.response.newBuilder();
        byte[] bArr = this.content;
        return builderNewBuilder.body(bArr != null ? ResponseBody.INSTANCE.create(bArr, this.type) : null).build();
    }
}

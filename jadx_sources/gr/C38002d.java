package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import hr.C38293f;
import java.lang.reflect.Type;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: renamed from: gr.d */
/* JADX INFO: compiled from: PeriodCallAdapter.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lgr/d;", "", "R", "Lretrofit2/CallAdapter;", "Lhr/f;", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/reflect/Type;)V", "Lretrofit2/Call;", "call", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lretrofit2/Call;)Lhr/f;", "responseType", "()Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38002d<R> implements CallAdapter<R, C38293f<R>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    public C38002d(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38293f<R> adapt(@NotNull Call<R> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Request request = call.request();
        Intrinsics.checkNotNullExpressionValue(request, "call.request()");
        return new C38293f<>(request);
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public Type getType() {
        return this.type;
    }
}

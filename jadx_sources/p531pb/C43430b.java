package p531pb;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import nr.C42862a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: pb.b */
/* JADX INFO: compiled from: ChatRetrofitClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lpb/b;", "", "<init>", "()V", "Lpb/a;", "c", "()Lpb/a;", "Lretrofit2/Call;", "call", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lretrofit2/Call;)V", "b", "Lretrofit2/Retrofit;", "d", "()Lretrofit2/Retrofit;", "Lretrofit2/Retrofit;", "retrofit", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "requestCallList", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43430b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Retrofit retrofit;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43430b f95881a = new C43430b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<WeakReference<Call<?>>> requestCallList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m95621a(@NotNull Call<?> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        requestCallList.add(new WeakReference<>(call));
    }

    /* JADX INFO: renamed from: b */
    public final void m95622b() {
        Iterator<WeakReference<Call<?>>> it = requestCallList.iterator();
        while (it.hasNext()) {
            Call<?> call = it.next().get();
            if (call != null) {
                call.cancel();
            }
        }
        requestCallList.clear();
    }

    /* JADX INFO: renamed from: d */
    public final Retrofit m95624d() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(C42597a.m93389e()).addConverterFactory(C42862a.m94007a()).build();
        }
        Retrofit retrofit3 = retrofit;
        Intrinsics.checkNotNull(retrofit3);
        return retrofit3;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC43429a m95623c() {
        Object objCreate = m95624d().create(InterfaceC43429a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "getChatRetrofit().create(ChatApi::class.java)");
        return (InterfaceC43429a) objCreate;
    }
}

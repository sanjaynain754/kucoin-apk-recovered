package hr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.adapter.PeriodCallAdapterFactory;
import mr.C42597a;
import nr.C42862a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: hr.c */
/* JADX INFO: compiled from: KCPeriod.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"Lmr/a;", "Lretrofit2/Retrofit;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lmr/a;)Lretrofit2/Retrofit;", "Lretrofit2/Retrofit;", "periodRetrofit", "network-adapter-subscribe_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38290c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Retrofit f86030a;

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Retrofit m86420a(@NotNull C42597a c42597a) {
        Intrinsics.checkNotNullParameter(c42597a, "<this>");
        if (f86030a == null) {
            f86030a = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").callFactory(C42597a.m93389e()).addConverterFactory(C42862a.m94007a()).addCallAdapterFactory(PeriodCallAdapterFactory.INSTANCE.create()).build();
        }
        Retrofit retrofit = f86030a;
        Intrinsics.checkNotNull(retrofit);
        return retrofit;
    }
}

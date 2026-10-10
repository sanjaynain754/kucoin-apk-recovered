package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: fg.f */
/* JADX INFO: compiled from: IHttpCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lfg/f;", "", "Lokhttp3/Response;", "obj", "b", "(Lokhttp3/Response;)Ljava/lang/Object;", "data", "Lokhttp3/Request;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lokhttp3/Request;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC37457f {
    @NotNull
    /* JADX INFO: renamed from: a */
    Request mo84244a(@NotNull Object data);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo84246b(@NotNull Response obj);
}

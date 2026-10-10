package kr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.restful.C19322c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kr.a */
/* JADX INFO: compiled from: ICallAdapterFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0001J\u0017\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lkr/a;", "", "ResponseIn", "ResponseOut", "ResponseStream", "Lcom/kubi/network/restful/c;", "request", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/restful/c;)Ljava/lang/Object;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC41973a<ResponseIn, ResponseOut, ResponseStream> {
    @NotNull
    /* JADX INFO: renamed from: a */
    ResponseStream mo85873a(@NotNull C19322c request);
}

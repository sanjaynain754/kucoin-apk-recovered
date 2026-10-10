package kr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.restful.C19322c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kr.d */
/* JADX INFO: compiled from: IConverterFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkr/d;", "", "ResponseIn", "ResponseOut", "Lcom/kubi/network/restful/c;", "request", "Ljava/lang/reflect/Type;", "type", "Lkr/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/restful/c;Ljava/lang/reflect/Type;)Lkr/c;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC41976d {
    @NotNull
    /* JADX INFO: renamed from: a */
    <ResponseIn, ResponseOut> InterfaceC41975c<ResponseIn, ResponseOut> mo85877a(@NotNull C19322c request, @NotNull Type type);
}

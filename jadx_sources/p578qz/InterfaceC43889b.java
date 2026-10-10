package p578qz;

import com.kubi.sdk.mode.config.data.LiteConfigEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: qz.b */
/* JADX INFO: compiled from: LiteConfigApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/mode/config/data/LiteConfigApi;", "", "fetchSiteConfig", "Lcom/kubi/sdk/mode/config/data/BaseEntity;", "Lcom/kubi/sdk/mode/config/data/LiteConfigEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43889b {
    @GET("v1/lite/enabled")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m96659a(@NotNull Continuation<? super C43888a<LiteConfigEntity>> continuation);
}

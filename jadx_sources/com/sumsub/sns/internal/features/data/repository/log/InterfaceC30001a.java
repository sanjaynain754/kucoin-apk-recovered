package com.sumsub.sns.internal.features.data.repository.log;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.log.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/log/a;", "", "", "type", "", "data", "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC30001a {
    @POST("resources/serviceLogger/{type}")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70064a(@Path("type") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull Continuation<? super C29227I> continuation);
}

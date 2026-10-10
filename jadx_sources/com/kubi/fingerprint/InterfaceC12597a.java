package com.kubi.fingerprint;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.fingerprint.entity.FingerRequest;
import com.kubi.fingerprint.entity.FingerResponse;
import com.kubi.fingerprint.entity.FingerToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.fingerprint.a */
/* JADX INFO: compiled from: FingerApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m90084d2 = {"Lcom/kubi/fingerprint/a;", "", "Lcom/kubi/fingerprint/entity/FingerRequest;", "fingerRequest", "Lcom/kubi/fingerprint/entity/FingerResponse;", "Lcom/kubi/fingerprint/entity/FingerToken;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/fingerprint/entity/FingerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC12597a {
    @POST("v1/device-tracking")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m23772a(@Body @NotNull FingerRequest fingerRequest, @NotNull Continuation<? super FingerResponse<FingerToken>> continuation);
}

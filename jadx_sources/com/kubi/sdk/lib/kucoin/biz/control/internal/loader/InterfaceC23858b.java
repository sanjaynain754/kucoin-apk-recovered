package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.b */
/* JADX INFO: compiled from: BizControlApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;", "", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/flow/e;", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC23858b {
    @GET("v1/compliance/rule")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<BizResponseEntity> m57101a();
}

package com.kubi.widget.web.api;

import androidx.annotation.Keep;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: compiled from: IKWebApi.kt */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0003H§@¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/widget/web/api/IKWebApi;", "", "sessionByToken", "Lcom/kubi/sdk/base/entity/BaseEntity;", "url", "", InterfaceC33826o0.f71244p, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWhiteUrlList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKWebApi {
    @GET("v1/allWebsiteURL")
    @Nullable
    Object getWhiteUrlList(@NotNull Continuation<? super BaseEntity<List<String>>> continuation);

    @FormUrlEncoded
    @POST
    @Nullable
    Object sessionByToken(@Url @NotNull String str, @Field(InterfaceC33826o0.f71244p) @NotNull String str2, @NotNull Continuation<? super BaseEntity<Object>> continuation);
}

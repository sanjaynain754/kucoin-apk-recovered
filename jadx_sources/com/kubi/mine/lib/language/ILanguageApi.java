package com.kubi.mine.lib.language;

import com.kubi.sdk.function.language.entity.LanguageEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.mine.lib.language.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ILanguageApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/lib/language/ILanguageApi;", "", "getLanguageList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "setUserConfig", "language", "", "currentLanguage", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ILanguageApi {
    @GET("v1/homepage/language-list")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<LanguageEntity>> m41690a();

    @FormUrlEncoded
    @POST("v2/auth/user-locale")
    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC41634e<Object> m41691l(@Field("language") @Nullable String str, @Field("currentLanguage") @Nullable String str2);
}

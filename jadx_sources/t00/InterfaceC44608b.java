package t00;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.timpush.data.entity.TimPushBind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: t00.b */
/* JADX INFO: compiled from: WebService.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/source/remote/WebService;", "", "bindPushAnonymous", "Lcom/kubi/sdk/base/entity/BaseEntity;", "timPushBind", "Lcom/kubi/sdk/timpush/data/entity/TimPushBind;", "(Lcom/kubi/sdk/timpush/data/entity/TimPushBind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindPush", "unbindPush", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44608b {
    @POST("v1/message-center/cid/newUnbind")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m98721a(@Body @NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) throws Exception;

    @POST("v1/message-center/device/newSave")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m98722b(@Body @NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) throws Exception;

    @POST("v1/message-center/cid/newSave")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m98723c(@Body @NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) throws Exception;
}

package com.kubi.advert.api;

import com.kubi.advert.api.entity.PageConfigEntity;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.router.core.Router;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IAdvertService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\bg\u0018\u0000 #2\u00020\u0001:\u0001#J*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ4\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J&\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00052\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016H&J&\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00052\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0016H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH&J\b\u0010\u001b\u001a\u00020\u0005H&J\b\u0010\u001c\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0005H&J\b\u0010\u001e\u001a\u00020\u0005H&J\b\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0005H&J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/advert/api/IAdvertService;", "", "fetchPageConfig", "Lcom/kubi/advert/api/entity/PromotionConfig;", "businessLine", "", "code", "needErrorToast", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageConfig", "Lcom/kubi/advert/api/entity/PageConfigEntity;", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fbEventRegistered", "", "registerType", "uid", "fbEvent", "eventName", ReportDataTable.COLUMN_PARAMS, "", "afEvent", "getAppsFlyerUID", "getOnelinkHostList", "", "getAppInstanceId", "getUtmMedium", "getUtmSource", "getUtmCampaign", "getAdClickId", "onMainHostResumed", "hostId", "onMainHostPaused", "Companion", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAdvertService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f15070a = Companion.f15071a;

    /* JADX INFO: compiled from: IAdvertService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/advert/api/IAdvertService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/advert/api/IAdvertService;", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f15071a = new Companion();

        @NotNull
        public final IAdvertService get() {
            return (IAdvertService) Router.f46192a.m56192n(IAdvertService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    String mo14759a();

    @NotNull
    /* JADX INFO: renamed from: b */
    String mo14760b();

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo14761c();

    @NotNull
    /* JADX INFO: renamed from: d */
    String mo14762d();

    /* JADX INFO: renamed from: e */
    void mo14763e(@NotNull String str, @NotNull Map<String, String> map);

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "pageConfig", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo14764f(@NotNull String str, @NotNull String str2, boolean z11, @NotNull Continuation<? super PromotionConfig> continuation);

    /* JADX INFO: renamed from: g */
    void mo14765g(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    @NotNull
    String getAppInstanceId();

    @Nullable
    /* JADX INFO: renamed from: h */
    String mo14766h();

    /* JADX INFO: renamed from: k */
    void mo14767k(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: m */
    void mo14768m(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: n */
    Object mo14769n(@NotNull String str, @NotNull String str2, boolean z11, long j11, @NotNull Continuation<? super PageConfigEntity> continuation);

    /* JADX INFO: renamed from: o */
    void mo14770o(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: p */
    List<String> mo14771p();

    /* JADX INFO: renamed from: i */
    static /* synthetic */ Object m14756i(IAdvertService iAdvertService, String str, String str2, boolean z11, long j11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pageConfig");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            j11 = 10000;
        }
        return iAdvertService.mo14769n(str, str2, z12, j11, continuation);
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ Object m14757j(IAdvertService iAdvertService, String str, String str2, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPageConfig");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return iAdvertService.mo14764f(str, str2, z11, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m14758l(IAdvertService iAdvertService, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: afEvent");
        }
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        iAdvertService.mo14765g(str, map);
    }
}

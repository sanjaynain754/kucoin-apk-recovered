package p502oj;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.home.api.HomeConst;
import com.kubi.home.entity.HomeConfigEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p830zf.InterfaceC46818q;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: oj.d */
/* JADX INFO: compiled from: HomeConfigHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/utils/HomeConfigHelper;", "", "<init>", "()V", "TAG", "", "remoteConfigUseHomeV2", "", "userHomeV2", "getUserHomeV2", "()Z", "userHomeV2$delegate", "Lkotlin/Lazy;", "getHomeRemoteConfig", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeConfigHelper.kt\ncom/kubi/home/utils/HomeConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,43:1\n35#2,4:44\n39#2:50\n44#3,2:48\n1#4:51\n17#5,2:52\n*S KotlinDebug\n*F\n+ 1 HomeConfigHelper.kt\ncom/kubi/home/utils/HomeConfigHelper\n*L\n35#1:44,4\n35#1:50\n35#1:48,2\n25#1:52,2\n*E\n"})
public final class C43099d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43099d f95299a = new C43099d();

    /* JADX INFO: renamed from: b */
    public static boolean f95300b = true;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f95301c = LazyKt.lazy(new Function0() { // from class: oj.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C43099d.m94704d());
        }
    });

    /* JADX INFO: renamed from: oj.d$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<HomeConfigEntity> {
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94704d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46818q.class, SiteInfoManager.f47913a.m58109c());
        boolean zMo4483a = objM56186h != null ? ((InterfaceC46818q) objM56186h).mo4483a() : true;
        boolean z11 = f95300b;
        C44128b.m97261e("HomeConfigHelper", "userHomeV2:flavor=" + zMo4483a + ",remote=" + z11);
        return zMo4483a && z11;
    }

    /* JADX INFO: renamed from: b */
    public final void m94705b() {
        Object objM20457a;
        Boolean useHomeV2;
        Boolean videoPlayerInApp;
        Long bizApiLoopTime;
        Long assetBizApiCacheTime;
        Long bizApiCacheTime;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("homeV2Config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        HomeConfigEntity homeConfigEntity = (HomeConfigEntity) objM20457a;
        if (homeConfigEntity != null && (bizApiCacheTime = homeConfigEntity.getBizApiCacheTime()) != null) {
            HomeConst.f25513a.m28966f(bizApiCacheTime.longValue() * ((long) 1000));
        }
        if (homeConfigEntity != null && (assetBizApiCacheTime = homeConfigEntity.getAssetBizApiCacheTime()) != null) {
            HomeConst.f25513a.m28965e(assetBizApiCacheTime.longValue() * ((long) 1000));
        }
        if (homeConfigEntity != null && (bizApiLoopTime = homeConfigEntity.getBizApiLoopTime()) != null) {
            HomeConst.f25513a.m28967g(bizApiLoopTime.longValue() * ((long) 1000));
        }
        if (homeConfigEntity != null && (videoPlayerInApp = homeConfigEntity.getVideoPlayerInApp()) != null) {
            HomeConst.f25513a.m28968h(videoPlayerInApp.booleanValue());
        }
        if (homeConfigEntity != null && (useHomeV2 = homeConfigEntity.getUseHomeV2()) != null) {
            f95300b = useHomeV2.booleanValue();
        }
        C44128b.m97266j("HomeConfigHelper", "homeV2Config: " + homeConfigEntity);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m94706c() {
        return ((Boolean) f95301c.getValue()).booleanValue();
    }
}

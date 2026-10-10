package com.kubi.kucoin.interceptor;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.interceptor.AppLockRouteInterceptor;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.config.a;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppLockRouteInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/AppLockRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppLockRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppLockRouteInterceptor.kt\ncom/kubi/kucoin/interceptor/AppLockRouteInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n35#2,4:62\n39#2:68\n35#2,4:69\n39#2:75\n44#3,2:66\n44#3,2:73\n774#4:76\n865#4,2:77\n*S KotlinDebug\n*F\n+ 1 AppLockRouteInterceptor.kt\ncom/kubi/kucoin/interceptor/AppLockRouteInterceptor\n*L\n37#1:62,4\n37#1:68\n42#1:69,4\n42#1:75\n37#1:66,2\n42#1:73,2\n43#1:76\n43#1:77,2\n*E\n"})
public final class AppLockRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27936a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<Boolean> f27937b = LazyKt.lazy(new Function0() { // from class: il.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AppLockRouteInterceptor.m32278g());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<Set<String>> f27938c = LazyKt.lazy(new Function0() { // from class: il.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppLockRouteInterceptor.m32277f();
        }
    });

    /* JADX INFO: compiled from: AppLockRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/AppLockRouteInterceptor$Companion;", "", "<init>", "()V", "KEY_BLOCK_ROUTE_WHEN_APP_UNLOCKING_V2", "", "KEY_BLOCK_ROUTE_ALLOW_LIST_V2", "blockRouteWhenAppUnlocking", "", "getBlockRouteWhenAppUnlocking", "()Z", "blockRouteWhenAppUnlocking$delegate", "Lkotlin/Lazy;", "allowList", "", "getAllowList", "()Ljava/util/Set;", "allowList$delegate", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Set<String> m32279a() {
            return (Set) AppLockRouteInterceptor.f27938c.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m32280b() {
            return ((Boolean) AppLockRouteInterceptor.f27937b.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.interceptor.AppLockRouteInterceptor$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15413a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.interceptor.AppLockRouteInterceptor$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15414b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: f */
    public static final Set m32277f() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15413a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("uc_applock_block_route_allow_list_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        List list = (List) objM20457a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m32278g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15414b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("uc_applock_block_route_when_unlocking_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        Companion companion = f27936a;
        if (companion.m32280b() && a.e() && !companion.m32279a().contains(RouteExKt.m56216G(postcard.getUri()))) {
            return true;
        }
        return chain.mo103413a(postcard);
    }
}

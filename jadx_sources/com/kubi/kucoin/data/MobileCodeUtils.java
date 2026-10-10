package com.kubi.kucoin.data;

import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kucoin.data.platform.model.CountryFilterResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45583m0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MobileCodeUtils.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ@\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0015H\u0007J8\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u000b0\u0015H\u0007J?\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000b0\u0015H\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kucoin/data/MobileCodeUtils;", "", "<init>", "()V", "iPlatformService", "Lcom/kubi/kucoin/data/platform/IPlatformService;", "getIPlatformService", "()Lcom/kubi/kucoin/data/platform/IPlatformService;", "iPlatformService$delegate", "Lkotlin/Lazy;", "fetchCountries", "", "sceneCode", "", "initMobileCode", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "prefillMobileCode", "forDisplay", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "initMobileCodeFull", "Lcom/kubi/kucoin/data/platform/model/CountryFilterResult;", "findCountryByMobileCode", "mobileCode", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "Lkotlin/ParameterName;", "name", "countryEntity", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MobileCodeUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MobileCodeUtils f27721a = new MobileCodeUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f27722b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.data.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MobileCodeUtils.m31958j();
        }
    });

    /* JADX INFO: renamed from: h */
    public static final Unit m31957h(Function1 function1) {
        C41696j.m91104d(C45583m0.m100622e(null, null, 3, null), null, null, new MobileCodeUtils$findCountryByMobileCode$1$1(function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m31955f(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m31956g(@NotNull String mobileCode, @Nullable String str, @NotNull final Function1<? super CountryEntity, Unit> callback) {
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (mobileCode.length() == 0) {
            callback.invoke(null);
        } else {
            C41696j.m91104d(C45583m0.m100620c(null, new Function0() { // from class: com.kubi.kucoin.data.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MobileCodeUtils.m31957h(callback);
                }
            }, 1, null), null, null, new MobileCodeUtils$findCountryByMobileCode$2(str, mobileCode, callback, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final IPlatformService m31958j() {
        return (IPlatformService) BUserCenterKit.f27728a.m31968c(IPlatformService.class);
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m31959k(@NotNull InterfaceC41709m0 coroutineScope, @NotNull String sceneCode, @NotNull String prefillMobileCode, @NotNull Function1<? super CountryFilterResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(prefillMobileCode, "prefillMobileCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f27721a.m31961i().mo32035g(coroutineScope, sceneCode, prefillMobileCode, callback);
    }

    /* JADX INFO: renamed from: e */
    public final void m31960e(@NotNull String sceneCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        m31961i().mo32037j(sceneCode, new Function1() { // from class: com.kubi.kucoin.data.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobileCodeUtils.m31955f((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final IPlatformService m31961i() {
        return (IPlatformService) f27722b.getValue();
    }
}

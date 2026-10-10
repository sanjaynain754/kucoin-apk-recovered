package com.kubi.kucoin.data.platform;

import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kucoin.data.platform.model.CountryFilterResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPlatformService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00030\u0007H&J.\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00030\u0007H&J&\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0007H&J<\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\u0014\u001a\u00020\u0005H&J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/IPlatformService;", "", "fetchCountryList", "", "sceneCode", "", "onNext", "Lkotlin/Function1;", "", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "fetchCountryListOnce", "checkIfSupportVoice", "mobileCode", "", "filterCountryByIpAndLanguage", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "prefillMobileCode", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/kucoin/data/platform/model/CountryFilterResult;", "getIpCodeAndMobileCodeStr", "getCachedCountryList", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPlatformService {
    /* JADX INFO: renamed from: e */
    void mo32033e(@Nullable String str, @NotNull Function1<? super Boolean, Unit> function1);

    @NotNull
    /* JADX INFO: renamed from: f */
    List<CountryEntity> mo32034f(@Nullable String str);

    /* JADX INFO: renamed from: g */
    void mo32035g(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable String str, @NotNull String str2, @NotNull Function1<? super CountryFilterResult, Unit> function1);

    /* JADX INFO: renamed from: h */
    void mo32036h(@Nullable String str, @NotNull Function1<? super List<CountryEntity>, Unit> function1);

    /* JADX INFO: renamed from: j */
    void mo32037j(@Nullable String str, @NotNull Function1<? super List<CountryEntity>, Unit> function1);

    @NotNull
    /* JADX INFO: renamed from: m */
    String mo32038m();

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m32055i(IPlatformService iPlatformService, String str, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCountryListOnce");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        iPlatformService.mo32036h(str, function1);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ void m32056k(IPlatformService iPlatformService, String str, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCountryList");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        iPlatformService.mo32037j(str, function1);
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ List m32057l(IPlatformService iPlatformService, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCachedCountryList");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return iPlatformService.mo32034f(str);
    }
}

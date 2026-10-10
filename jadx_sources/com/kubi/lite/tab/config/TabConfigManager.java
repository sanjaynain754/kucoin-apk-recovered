package com.kubi.lite.tab.config;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabConfigResponse;
import com.kubi.lite.tab.util.LanguageChangeUtil;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p238eo.C37219b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TabConfigManager.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u001a\u0010\u0015\u001a\u00020\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017H\u0007J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/lite/tab/config/TabConfigManager;", "", "<init>", "()V", "TAG", "", "api", "Lcom/kubi/lite/tab/config/TabConfigApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/lite/tab/config/TabConfigApi;", "api$delegate", "Lkotlin/Lazy;", "mTabConfigList", "", "Lcom/kubi/lite/tab/bean/TabConfig;", "mLastLanguage", "Lcom/kubi/sdk/function/language/LanguageType;", "initialize", "", "loadFromCache", "fetchLatestConfigsAsync", "onSuccess", "Lkotlin/Function0;", "getTabConfigList", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TabConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TabConfigManager f32084a = new TabConfigManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f32085b = LazyKt.lazy(new Function0() { // from class: com.kubi.lite.tab.config.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TabConfigManager.m37546h();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static List<TabConfig> f32086c = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d */
    @Nullable
    public static LanguageType f32087d = MultiLanguageManager.f46811g;

    /* JADX INFO: renamed from: com.kubi.lite.tab.config.TabConfigManager$a */
    /* JADX INFO: compiled from: TabConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/lite/tab/config/TabConfigManager$initialize$2", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17391a implements MultiLanguageManager.a {
        /* JADX INFO: renamed from: c */
        public static final Unit m37558c() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isLiteMode = ");
            AppMode.Companion companion = AppMode.INSTANCE;
            sb2.append(companion.isLiteMode());
            C44128b.m97266j("LiteV2-TabConfigManager", sb2.toString());
            if (companion.isLiteMode()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.lite.tab.config.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabConfigManager.C17391a.m37559d();
                    }
                }, 100L);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static final void m37559d() {
            LanguageChangeUtil.f32162c.getInstance().m37636c();
        }

        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Language change event received. Current language: ");
            LanguageType languageType = TabConfigManager.f32087d;
            sb2.append(languageType != null ? languageType.getLocale() : null);
            sb2.append(", New language: ");
            sb2.append(language.getLocale());
            C44128b.m97266j("LiteV2-TabConfigManager", sb2.toString());
            if (language == TabConfigManager.f32087d) {
                C44128b.m97266j("LiteV2-TabConfigManager", "Language is the same, fetch skipped.");
                return;
            }
            C44128b.m97266j("LiteV2-TabConfigManager", "Language has actually changed, fetching latest configs.");
            TabConfigManager.f32087d = language;
            TabConfigManager.f32084a.m37552i(new Function0() { // from class: com.kubi.lite.tab.config.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TabConfigManager.C17391a.m37558c();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m37547j(TabConfigManager tabConfigManager, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        tabConfigManager.m37552i(function0);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m37548k(Function0 function0, BaseEntity baseEntity) {
        if (baseEntity == null || !baseEntity.getSuccess() || baseEntity.getData() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Response failed or data is empty. success=");
            sb2.append(baseEntity != null ? Boolean.valueOf(baseEntity.getSuccess()) : null);
            sb2.append(", data=");
            sb2.append(baseEntity != null ? (TabConfigResponse) baseEntity.getData() : null);
            C44128b.m97266j("LiteV2-TabConfigManager", sb2.toString());
        } else {
            List<TabConfig> tabs = ((TabConfigResponse) baseEntity.getData()).getTabs();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Get Lite Tab Config Succeed! Retrieved ");
            sb3.append(tabs != null ? tabs.size() : 0);
            sb3.append(" Tab configurations");
            C44128b.m97266j("LiteV2-TabConfigManager", sb3.toString());
            if (tabs == null || tabs.isEmpty()) {
                C44128b.m97266j("LiteV2-TabConfigManager", "Response tabs list is empty");
            } else {
                f32086c = tabs;
                C37219b c37219b = C37219b.f82538a;
                Object data = baseEntity.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                c37219b.m83266c((TabConfigResponse) data);
                C44128b.m97266j("LiteV2-TabConfigManager", "Tab configurations saved to cache");
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m37550m(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to fetch Tab configurations: ");
        sb2.append(th2 != null ? th2.getMessage() : null);
        C44128b.m97262f("LiteV2-TabConfigManager", sb2.toString(), th2);
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: i */
    public final void m37552i(@Nullable final Function0<Unit> function0) {
        C44128b.m97266j("LiteV2-TabConfigManager", "Start asynchronously fetching latest Tab configurations");
        Observable<BaseEntity<TabConfigResponse>> observableObserveOn = m37553o().m37560a().subscribeOn(Schedulers.m87969io()).observeOn(Schedulers.m87969io());
        final Function1 function1 = new Function1() { // from class: com.kubi.lite.tab.config.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TabConfigManager.m37548k(function0, (BaseEntity) obj);
            }
        };
        Consumer<? super BaseEntity<TabConfigResponse>> consumer = new Consumer() { // from class: com.kubi.lite.tab.config.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TabConfigManager.m37549l(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.lite.tab.config.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TabConfigManager.m37550m((Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.lite.tab.config.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TabConfigManager.m37551n(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final TabConfigApi m37553o() {
        return (TabConfigApi) f32085b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<TabConfig> m37554p() {
        List<TabConfig> tabs;
        C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Start retrieving configurations");
        if (!f32086c.isEmpty()) {
            C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Return memory cache, count=" + f32086c.size());
            return f32086c;
        }
        C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Memory cache empty, try loading from persistent cache");
        try {
            TabConfigResponse tabConfigResponseM83264a = C37219b.f82538a.m83264a();
            if (tabConfigResponseM83264a != null && (tabs = tabConfigResponseM83264a.getTabs()) != null && (!tabs.isEmpty())) {
                List<TabConfig> tabs2 = tabConfigResponseM83264a.getTabs();
                if (tabs2 == null) {
                    tabs2 = CollectionsKt.emptyList();
                }
                f32086c = tabs2;
                C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Successfully loaded from persistent cache, count=" + f32086c.size());
                return f32086c;
            }
            if (tabConfigResponseM83264a == null) {
                C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Persistent cache response is null");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[getTabConfigList] Persistent cache size=");
                List<TabConfig> tabs3 = tabConfigResponseM83264a.getTabs();
                sb2.append(tabs3 != null ? Integer.valueOf(tabs3.size()) : null);
                C44128b.m97266j("LiteV2-TabConfigManager", sb2.toString());
            }
            C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] No data in memory or persistent cache, using default configuration");
            List<TabConfig> listM83265b = C37219b.f82538a.m83265b();
            f32086c = listM83265b;
            if (listM83265b.isEmpty()) {
                C44128b.m97261e("LiteV2-TabConfigManager", "[getTabConfigList] Default configuration is also empty!");
            } else {
                C44128b.m97266j("LiteV2-TabConfigManager", "[getTabConfigList] Using default configuration, count=" + f32086c.size());
            }
            return f32086c;
        } catch (Exception e11) {
            C44128b.m97262f("LiteV2-TabConfigManager", "[getTabConfigList] Exception while loading persistent cache", e11);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final TabConfigApi m37546h() {
        return (TabConfigApi) C42597a.m93386b().create(TabConfigApi.class);
    }

    /* JADX INFO: renamed from: l */
    public static final void m37549l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final void m37551n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public final void m37555q() {
        C41696j.m91104d(C41713n0.m91125a(C41782z0.m91392b()), null, null, new TabConfigManager$initialize$1(null), 3, null);
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new C17391a());
    }
}

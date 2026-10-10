package com.kubi.search;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchinitial.SearchInitialFragment;
import com.kubi.search.searchresult.SearchResultFragment;
import com.kubi.search.searchresult.SearchTrackUploader;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43846g;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import q10.C43581a;
import ro.C44128b;
import ro.C44129c;
import w00.C45678b;

/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001fH\u0014J\b\u0010)\u001a\u00020\u001fH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, m90084d2 = {"Lcom/kubi/search/SearchActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "initialFragment", "Lcom/kubi/search/searchinitial/SearchInitialFragment;", "getInitialFragment", "()Lcom/kubi/search/searchinitial/SearchInitialFragment;", "initialFragment$delegate", "Lkotlin/Lazy;", "resultFragment", "Lcom/kubi/search/searchresult/SearchResultFragment;", "getResultFragment", "()Lcom/kubi/search/searchresult/SearchResultFragment;", "resultFragment$delegate", "hintWords", "", "supportOneKeySearch", "", "binding", "Lcom/kubi/search/databinding/SearchActivityBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchActivityBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "useFlutterSearchCache", "getUseFlutterSearchCache", "()Z", "useFlutterSearchCache$delegate", "useFlutterSearch", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initArgments", "initPreloadData", "initSearchInput", "textChanged", "key", "", "onPause", "onDestroy", "Companion", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchActivity.kt\ncom/kubi/search/SearchActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,190:1\n45#2,19:191\n1#3:210\n35#4,4:211\n39#4:217\n44#5,2:215\n*S KotlinDebug\n*F\n+ 1 SearchActivity.kt\ncom/kubi/search/SearchActivity\n*L\n57#1:191,19\n60#1:211,4\n60#1:217\n60#1:215,2\n*E\n"})
public final class SearchActivity extends BaseActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f48768i = LazyKt.lazy(new Function0() { // from class: com.kubi.search.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchActivity.m59066O0();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f48769j = LazyKt.lazy(new Function0() { // from class: com.kubi.search.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchActivity.m59068Q0();
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public String f48770k = "";

    /* JADX INFO: renamed from: l */
    public boolean f48771l = true;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final InterfaceC24293a f48772m = C45678b.m100788b(this, new Function1<C43581a, Unit>() { // from class: com.kubi.search.SearchActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C43581a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43581a c43581a) {
            invoke(c43581a);
            return Unit.INSTANCE;
        }
    }, new Function1<SearchActivity, C43581a>() { // from class: com.kubi.search.SearchActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43581a invoke(@NotNull SearchActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C43581a.m95912a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f48773n = LazyKt.lazy(new Function0() { // from class: com.kubi.search.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SearchActivity.m59072U0());
        }
    });

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f48767p = {Reflection.property1(new PropertyReference1Impl(SearchActivity.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchActivityBinding;", 0))};

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f48766o = new Companion(null);

    /* JADX INFO: compiled from: SearchActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/search/SearchActivity$Companion;", "", "<init>", "()V", "REMOTE_CONFIG_FLUTTER_SEARCH", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.SearchActivity$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24354a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: A0 */
    public static final boolean m59053A0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: E0 */
    public static final Editable m59056E0(C43581a c43581a, Integer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c43581a.f96178d.getText();
    }

    /* JADX INFO: renamed from: F0 */
    public static final Editable m59057F0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Editable) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m59058G0(SearchActivity searchActivity, C43581a c43581a, Editable editable) {
        if (editable == null) {
            return Unit.INSTANCE;
        }
        if (StringsKt.trim(editable).length() > 0) {
            C44129c.m97272b("platform::search", "搜索校验2.2-输入搜索内容不为空", editable.toString(), null, 8, null);
            searchActivity.m59097R0(editable.toString());
        } else if (searchActivity.f48770k.length() <= 0 || !searchActivity.f48771l) {
            C44129c.m97272b("platform::search", "搜索校验1-输入搜索内容为空", null, null, 12, null);
        } else {
            C44129c.m97272b("platform::search", "搜索校验2.1-输入搜索内容为空，使用hint词", searchActivity.f48770k, null, 8, null);
            c43581a.f96178d.setText(searchActivity.f48770k);
            c43581a.f96178d.setSelection(searchActivity.f48770k.length());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m59060I0(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("textChanges:");
        sb2.append(th2 != null ? th2.getMessage() : null);
        C44128b.m97261e("searchV2", sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K0 */
    public static final boolean m59062K0(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() == 0;
    }

    /* JADX INFO: renamed from: L0 */
    public static final boolean m59063L0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: O0 */
    public static final SearchInitialFragment m59066O0() {
        return new SearchInitialFragment();
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m59067P0(SearchActivity searchActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchActivity.preformBackPressed();
        C27023a.m66555b("B1SearchOrSearchResultPage", "cancelSearch", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final SearchResultFragment m59068Q0() {
        return new SearchResultFragment();
    }

    /* JADX INFO: renamed from: U0 */
    public static final boolean m59072U0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24354a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_enable_search_v3", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: z0 */
    public static final boolean m59096z0(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m59097R0(final CharSequence charSequence) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchActivity.m59069S0(this.f48872b, charSequence);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public final C43581a m59099p0() {
        return (C43581a) this.f48772m.getValue(this, f48767p[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final SearchInitialFragment m59100q0() {
        return (SearchInitialFragment) this.f48768i.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    public final SearchResultFragment m59101r0() {
        return (SearchResultFragment) this.f48769j.getValue();
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m59102s0() {
        return ((Boolean) this.f48773n.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m59103t0() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchActivity.m59093u0(this.f48877b);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m59104v0() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchActivity.m59094w0(this.f48875b);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final void m59105x0() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchActivity.m59095y0(this.f48876b);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m59054B0(SearchActivity searchActivity, CharSequence charSequence) {
        Intrinsics.checkNotNull(charSequence);
        searchActivity.m59097R0(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final void m59055C0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m59059H0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m59061J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m59064M0(SearchActivity searchActivity, CharSequence charSequence) {
        Intrinsics.checkNotNull(charSequence);
        searchActivity.m59097R0(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m59065N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m59069S0(SearchActivity searchActivity, CharSequence charSequence) {
        C43581a c43581aM59099p0 = searchActivity.m59099p0();
        if (c43581aM59099p0 == null) {
            return Unit.INSTANCE;
        }
        C44128b.m97268l("searchV2", "textChanged: " + ((Object) charSequence));
        if (charSequence.length() == 0) {
            if (c43581aM59099p0.f96179e.getDisplayedChild() != 0) {
                c43581aM59099p0.f96179e.setDisplayedChild(0);
                searchActivity.m59100q0().setUserVisibleHint(true);
                searchActivity.m59101r0().setUserVisibleHint(false);
            }
        } else if (c43581aM59099p0.f96179e.getDisplayedChild() != 1) {
            c43581aM59099p0.f96179e.setDisplayedChild(1);
            searchActivity.m59100q0().setUserVisibleHint(false);
            searchActivity.m59101r0().setUserVisibleHint(true);
        }
        C44129c.m97272b("platform::search", "搜索校验2.3-提交搜索请求", charSequence.toString(), null, 8, null);
        searchActivity.m59101r0().onTextChanged(charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m59093u0(SearchActivity searchActivity) {
        boolean z11;
        C43581a c43581aM59099p0;
        ClearEditText clearEditText;
        Intent intent = searchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        SearchExKt.m59517K(RouteExKt.m56282x(intent, "from", "HOME"));
        Intent intent2 = searchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent2, "data");
        String str = "";
        if (strM56280w == null) {
            strM56280w = "";
        }
        searchActivity.f48770k = strM56280w;
        if (strM56280w.length() > 0 && (c43581aM59099p0 = searchActivity.m59099p0()) != null && (clearEditText = c43581aM59099p0.f96178d) != null) {
            clearEditText.setHint(searchActivity.f48770k);
        }
        Intent intent3 = searchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        String strM56280w2 = RouteExKt.m56280w(intent3, "resourceType");
        if (strM56280w2 == null) {
            strM56280w2 = "";
        }
        if (strM56280w2.length() > 0) {
            z11 = true;
            if (StringsKt.equals(strM56280w2, "DEF", true)) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        searchActivity.f48771l = z11;
        Intent intent4 = searchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        String strM56280w3 = RouteExKt.m56280w(intent4, "coin");
        if (strM56280w3 != null) {
            str = strM56280w3;
        }
        LifecycleOwnerKt.getLifecycleScope(searchActivity).launchWhenResumed(new SearchActivity$initArgments$1$1(searchActivity, str, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m59094w0(SearchActivity searchActivity) {
        SearchExKt.m59510D(LifecycleOwnerKt.getLifecycleScope(searchActivity), new SearchActivity$initPreloadData$1$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m59095y0(final SearchActivity searchActivity) {
        final C43581a c43581aM59099p0 = searchActivity.m59099p0();
        if (c43581aM59099p0 == null) {
            return Unit.INSTANCE;
        }
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c43581aM59099p0.f96178d);
        final Function1 function1 = new Function1() { // from class: com.kubi.search.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SearchActivity.m59062K0((CharSequence) obj));
            }
        };
        Observable<CharSequence> observableObserveOn = abstractC46099aM784d.filter(new Predicate() { // from class: com.kubi.search.d
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SearchActivity.m59063L0(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.search.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchActivity.m59064M0(this.f48865b, (CharSequence) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.search.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchActivity.m59065N0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, searchActivity.getDestroyDisposable());
        Observable<CharSequence> observableDebounce = C0206f.m784d(c43581aM59099p0.f96178d).debounce(300L, TimeUnit.MILLISECONDS);
        final Function1 function3 = new Function1() { // from class: com.kubi.search.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SearchActivity.m59096z0((CharSequence) obj));
            }
        };
        Observable<CharSequence> observableObserveOn2 = observableDebounce.filter(new Predicate() { // from class: com.kubi.search.h
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SearchActivity.m59053A0(function3, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function4 = new Function1() { // from class: com.kubi.search.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchActivity.m59054B0(this.f48868b, (CharSequence) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(new Consumer() { // from class: com.kubi.search.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchActivity.m59055C0(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, searchActivity.getDestroyDisposable());
        Observable<Integer> observableM782b = C0206f.m782b(c43581aM59099p0.f96178d);
        final Function1 function5 = new Function1() { // from class: com.kubi.search.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchActivity.m59056E0(c43581aM59099p0, (Integer) obj);
            }
        };
        Observable observableObserveOn3 = observableM782b.map(new Function() { // from class: com.kubi.search.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SearchActivity.m59057F0(function5, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function6 = new Function1() { // from class: com.kubi.search.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchActivity.m59058G0(this.f49134b, c43581aM59099p0, (Editable) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.search.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchActivity.m59059H0(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.search.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchActivity.m59060I0((Throwable) obj);
            }
        };
        Disposable disposableSubscribe3 = observableObserveOn3.subscribe(consumer, new Consumer() { // from class: com.kubi.search.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchActivity.m59061J0(function7, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe3, searchActivity.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m59098T0() {
        return m59102s0();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        ViewSwitcher viewSwitcher;
        BaseTextView baseTextView;
        super.onCreate(savedInstanceState);
        if (m59098T0()) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            String strM56280w = RouteExKt.m56280w(intent, "data");
            if (strM56280w == null) {
                strM56280w = "";
            }
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            C23767n.m56879c(strM56280w, RouteExKt.m56282x(intent2, "from", "HOME"));
            finish();
        }
        setContentView(R$layout.search_activity);
        setPageId("B1SearchOrSearchResultPage");
        m59103t0();
        m59104v0();
        C27032f.m66626q(this, R$id.fragment_container_recent, m59100q0(), null, 4, null);
        C27032f.m66626q(this, R$id.fragment_container_result, m59101r0(), null, 4, null);
        C43581a c43581aM59099p0 = m59099p0();
        if (c43581aM59099p0 != null && (baseTextView = c43581aM59099p0.f96180f) != null) {
            ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.search.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchActivity.m59067P0(this.f48874b, (View) obj);
                }
            });
        }
        m59105x0();
        C43581a c43581aM59099p1 = m59099p0();
        if (c43581aM59099p1 != null && (viewSwitcher = c43581aM59099p1.f96179e) != null) {
            viewSwitcher.setDisplayedChild(0);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        if (m59098T0()) {
            return;
        }
        SearchTrackUploader searchTrackUploader = SearchTrackUploader.f49039a;
        searchTrackUploader.m59483n();
        searchTrackUploader.m59482m().clear();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C43581a c43581aM59099p0;
        super.onPause();
        if (!m59098T0() && (c43581aM59099p0 = m59099p0()) != null) {
            KeyboardUtils.m6034f(c43581aM59099p0.f96178d);
        }
    }
}

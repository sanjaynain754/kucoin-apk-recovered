package com.kubi.resources.widget;

import android.widget.EditText;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p011a9.AbstractC0207g;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.widget.z2 */
/* JADX INFO: compiled from: TradeInputLayoutProxyUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a>\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"combineLatestPriceAndAmount", "Lio/reactivex/Observable;", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "editTextProxy1", "Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "editTextProxy2", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Function2;", "", "tradeNumTextChanges", "editText", "Landroid/widget/EditText;", "tradeInputLayout", "debounce", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C23184z2 {
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Observable<BigDecimal> m55627g(@NotNull TradeInputLayoutProxy editTextProxy1, @NotNull TradeInputLayoutProxy editTextProxy2, @NotNull final Function2<? super CharSequence, ? super CharSequence, ? extends BigDecimal> result) {
        Intrinsics.checkNotNullParameter(editTextProxy1, "editTextProxy1");
        Intrinsics.checkNotNullParameter(editTextProxy2, "editTextProxy2");
        Intrinsics.checkNotNullParameter(result, "result");
        Observable<CharSequence> observableM55631k = m55631k(editTextProxy1, false);
        Observable<CharSequence> observableM55631k2 = m55631k(editTextProxy2, false);
        final Function2 function2 = new Function2() { // from class: com.kubi.resources.widget.x2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C23184z2.m55628h(result, (CharSequence) obj, (CharSequence) obj2);
            }
        };
        Observable<BigDecimal> observableCombineLatest = Observable.combineLatest(observableM55631k, observableM55631k2, new BiFunction() { // from class: com.kubi.resources.widget.y2
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C23184z2.m55629i(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    /* JADX INFO: renamed from: h */
    public static final BigDecimal m55628h(Function2 function2, CharSequence text1, CharSequence text2) {
        Intrinsics.checkNotNullParameter(text1, "text1");
        Intrinsics.checkNotNullParameter(text2, "text2");
        return (BigDecimal) function2.invoke(text1, text2);
    }

    /* JADX INFO: renamed from: i */
    public static final BigDecimal m55629i(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (BigDecimal) function2.invoke(p11, p12);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Observable<CharSequence> m55630j(@NotNull final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        if (!TradeInputProxyLayoutConfig.f44243a.m54946b()) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(editText);
            Intrinsics.checkNotNull(abstractC46099aM784d);
            return abstractC46099aM784d;
        }
        AbstractC46099a<AbstractC0207g> abstractC46099aM781a = C0206f.m781a(editText);
        final Function1 function1 = new Function1() { // from class: com.kubi.resources.widget.t2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C23184z2.m55633m(editText, (AbstractC0207g) obj);
            }
        };
        Observable map = abstractC46099aM781a.map(new Function() { // from class: com.kubi.resources.widget.u2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C23184z2.m55634n(function1, obj);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Observable<CharSequence> m55631k(@NotNull final TradeInputLayoutProxy tradeInputLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeInputLayout, "tradeInputLayout");
        if (!TradeInputProxyLayoutConfig.f44243a.m54946b()) {
            Observable<CharSequence> observableDebounce = z11 ? C0206f.m784d(tradeInputLayout.getEditText()).debounce(200L, TimeUnit.MILLISECONDS) : C0206f.m784d(tradeInputLayout.getEditText());
            Intrinsics.checkNotNull(observableDebounce);
            return observableDebounce;
        }
        Observable<AbstractC0207g> observableThrottleLast = C0206f.m781a(tradeInputLayout.getEditText()).throttleLast(200L, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: com.kubi.resources.widget.v2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C23184z2.m55635o(tradeInputLayout, (AbstractC0207g) obj);
            }
        };
        Observable map = observableThrottleLast.map(new Function() { // from class: com.kubi.resources.widget.w2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C23184z2.m55636p(function1, obj);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Observable m55632l(TradeInputLayoutProxy tradeInputLayoutProxy, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m55631k(tradeInputLayoutProxy, z11);
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m55633m(EditText editText, AbstractC0207g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return editText.getText();
    }

    /* JADX INFO: renamed from: n */
    public static final CharSequence m55634n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (CharSequence) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o */
    public static final CharSequence m55635o(TradeInputLayoutProxy tradeInputLayoutProxy, AbstractC0207g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return tradeInputLayoutProxy.getValue().toString();
    }

    /* JADX INFO: renamed from: p */
    public static final CharSequence m55636p(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (CharSequence) function1.invoke(p11);
    }
}

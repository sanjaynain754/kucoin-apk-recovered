package com.kubi.p110rn.i18n;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.core.turbo.NativeLocaleTurboModuleAbs;
import com.kubi.p110rn.i18n.KCTurboLocaleImpl;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KCTurboLocaleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/i18n/KCTurboLocaleImpl;", "Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "applicationContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getPrefetchedLocales", "", "data", "Lcom/facebook/react/bridge/ReadableMap;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "stringOrEmpty", "key", "stringListOrNull", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeLocaleTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboLocaleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboLocaleImpl.kt\ncom/kubi/rn/i18n/KCTurboLocaleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1617#2,9:80\n1869#2:89\n1870#2:91\n1626#2:92\n1#3:90\n*S KotlinDebug\n*F\n+ 1 KCTurboLocaleImpl.kt\ncom/kubi/rn/i18n/KCTurboLocaleImpl\n*L\n74#1:80,9\n74#1:89\n74#1:91\n74#1:92\n74#1:90\n*E\n"})
public final class KCTurboLocaleImpl extends NativeLocaleTurboModuleAbs {
    private static final ExecutorService ioExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ox.b
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return KCTurboLocaleImpl.ioExecutor$lambda$2(runnable);
        }
    });
    private final Context applicationContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboLocaleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.applicationContext = ctx.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPrefetchedLocales$lambda$0(Function1 function1, KCTurboLocaleImpl kCTurboLocaleImpl, String str, String str2, String str3, String str4, List list) {
        RnI18nManager rnI18nManager = RnI18nManager.f47318a;
        Context applicationContext = kCTurboLocaleImpl.applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        function1.invoke(rnI18nManager.m57564i(applicationContext, str, str2, str3, str4, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread ioExecutor$lambda$2(Runnable runnable) {
        return new Thread(runnable, "krn-i18n-locale-read");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLocaleTurboModuleAbs
    public void getPrefetchedLocales(@NotNull ReadableMap data, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String strStringOrEmpty = stringOrEmpty(data, Constants.BIZ);
        final String strStringOrEmpty2 = stringOrEmpty(data, "entry");
        final String strStringOrEmpty3 = stringOrEmpty(data, "siteType");
        final String strStringOrEmpty4 = stringOrEmpty(data, "lang");
        final List<String> listStringListOrNull = stringListOrNull(data, "projectIds");
        if (strStringOrEmpty3.length() != 0 && strStringOrEmpty4.length() != 0) {
            ioExecutor.execute(new Runnable() { // from class: ox.a
                @Override // java.lang.Runnable
                public final void run() {
                    KCTurboLocaleImpl.getPrefetchedLocales$lambda$0(callback, this, strStringOrEmpty, strStringOrEmpty2, strStringOrEmpty3, strStringOrEmpty4, listStringListOrNull);
                }
            });
            return;
        }
        callback.invoke("{\"status\":\"miss\",\"siteType\":\"" + strStringOrEmpty3 + "\",\"lang\":\"" + strStringOrEmpty4 + "\",\"locales\":{}}");
    }

    private final List<String> stringListOrNull(ReadableMap readableMap, String str) {
        ReadableArray array;
        String string;
        if (!readableMap.hasKey(str) || readableMap.isNull(str) || readableMap.getType(str) != ReadableType.Array || (array = readableMap.getArray(str)) == null) {
            return null;
        }
        IntRange intRangeUntil = RangesKt.until(0, array.size());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (array.getType(iNextInt) == ReadableType.String) {
                string = array.getString(iNextInt);
            } else {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private final String stringOrEmpty(ReadableMap readableMap, String str) {
        String string;
        if (!readableMap.hasKey(str) || readableMap.isNull(str) || readableMap.getType(str) != ReadableType.String || (string = readableMap.getString(str)) == null) {
            return "";
        }
        return string;
    }
}

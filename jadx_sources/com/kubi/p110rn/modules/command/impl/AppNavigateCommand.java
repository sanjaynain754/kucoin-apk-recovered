package com.kubi.p110rn.modules.command.impl;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeUtilsKt;
import com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.util.C24267r0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppNavigateCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/AppNavigateCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeCallbackCommand;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "url", "", "<init>", "(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V", "onExecute", "", "tryOpenFlutterDialog", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppNavigateCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppNavigateCommand.kt\ncom/kubi/rn/modules/command/impl/AppNavigateCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1869#2,2:93\n1869#2,2:95\n1878#2,3:97\n*S KotlinDebug\n*F\n+ 1 AppNavigateCommand.kt\ncom/kubi/rn/modules/command/impl/AppNavigateCommand\n*L\n57#1:93,2\n60#1:95,2\n69#1:97,3\n*E\n"})
public final class AppNavigateCommand extends ReactBridgeCallbackCommand {

    @NotNull
    private static final Set<String> FLUTTER_DIALOG_ROUTES = SetsKt.setOf((Object[]) new String[]{"/market/ai/relatedTweetsDialog", "/market/feed/commentDialog"});

    @NotNull
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppNavigateCommand(@NotNull Promise promise, @NotNull String url) {
        super(promise);
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    private final boolean tryOpenFlutterDialog() {
        Uri uri = Uri.parse(this.url);
        String queryParameter = uri.getQueryParameter("route");
        int i11 = 0;
        if (queryParameter == null) {
            return false;
        }
        Uri uri2 = Uri.parse("kucoin://" + queryParameter);
        String path = uri2.getPath();
        if (path == null || !FLUTTER_DIALOG_ROUTES.contains(path)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri2.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Iterator<T> it = queryParameterNames.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String queryParameter2 = uri2.getQueryParameter(str2);
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            linkedHashMap.put(str2, str);
        }
        Set<String> queryParameterNames2 = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames2, "getQueryParameterNames(...)");
        for (String str3 : queryParameterNames2) {
            if (!Intrinsics.areEqual(str3, "route")) {
                String queryParameter3 = uri.getQueryParameter(str3);
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                linkedHashMap.put(str3, queryParameter3);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        Set setEntrySet = linkedHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Object obj : setEntrySet) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.checkNotNull(entry);
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            String str4 = (String) key;
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            String str5 = (String) value;
            sb2.append(i11 == 0 ? "?" : "&");
            sb2.append(Uri.encode(str4));
            sb2.append("=");
            sb2.append(Uri.encode(str5));
            i11 = i12;
        }
        KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, sb2.toString(), null, 2, null);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("success", true);
        C24267r0.m58520d(writableMapCreateMap);
        getPromise().resolve(writableMapCreateMap);
        return true;
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand
    public void onExecute() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (tryOpenFlutterDialog()) {
                return;
            }
            boolean zM4048k = Router.f46192a.m56184f(this.url).m4048k();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", zM4048k);
            C24267r0.m58520d(writableMapCreateMap);
            getPromise().resolve(writableMapCreateMap);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C24267r0.m58519c(thM103847exceptionOrNullimpl);
            getPromise().reject(BridgeUtilsKt.ERROR_CODE_PARAM, "Failure. e:" + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
        }
    }
}

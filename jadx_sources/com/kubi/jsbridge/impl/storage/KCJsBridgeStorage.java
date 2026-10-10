package com.kubi.jsbridge.impl.storage;

import android.content.Context;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36563b0;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p472nk.C42849f;
import p472nk.C42850g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: KCJsBridgeStorage.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JZ\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JR\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JP\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JR\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JJ\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J6\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006,"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KCJsBridgeStorage;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiStorageModule;", "<init>", "()V", "removeItem", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "key", Constants.BIZ, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "setItem", "value", "", "containsKey", "getAllKeys", "", "getItem", "clear", "logSuccess", FirebaseAnalytics.Param.METHOD, JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "storageValueInfo", "validateKey", "validateBiz", "validateValue", "storageValueSizeInBytes", "", "invalidParamError", "message", "storageError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "storageId", "Lcom/kubi/utils/storage/StorageId;", "category", "Companion", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJsBridgeStorage implements InterfaceC36563b0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27481a = new Companion(null);

    /* JADX INFO: compiled from: KCJsBridgeStorage.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KCJsBridgeStorage$Companion;", "", "<init>", "()V", "TAG", "", "STORAGE_VALUE_ENCODED", "STORAGE_VALUE_TYPE", "STORAGE_VALUE_DATA", "MAX_KEY_LENGTH", "", "MAX_BIZ_LENGTH", "MAX_VALUE_BYTES", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m31830i(KCJsBridgeStorage kCJsBridgeStorage, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str5 = "";
        }
        kCJsBridgeStorage.m31838h(str, str2, str3, str4, str5);
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: a */
    public void mo31831a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31843n = m31843n("getAllKeys", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String[] strArrM102321c = C46392a.m102321c(C42850g.m93982a(str));
            List list = strArrM102321c != null ? ArraysKt.toList(strArrM102321c) : null;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(list);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            List list2 = (List) objM103844constructorimpl;
            m31838h("getAllKeys", source, null, str, "count=" + list2.size());
            callback.invoke(list2, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, m31839j("getAllKeys", thM103847exceptionOrNullimpl));
        }
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: b */
    public void mo31832b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String key, @NotNull Object value, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31844o = m31844o("setItem", key);
        if (strM31844o != null) {
            callback.invoke(null, m31837g(strM31844o));
            return;
        }
        String strM31843n = m31843n("setItem", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        String strM31845p = m31845p(value);
        if (strM31845p != null) {
            callback.invoke(null, m31837g(strM31845p));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102333p(m31840k(C42850g.m93982a(str), key), C27099x.m66919i(value, false, 2, null));
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            ((Boolean) objM103844constructorimpl).getClass();
            m31838h("setItem", source, key, str, m31841l(value));
            callback.invoke(Boolean.TRUE, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, m31839j("setItem", thM103847exceptionOrNullimpl));
        }
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: c */
    public void mo31833c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String key, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31844o = m31844o("containsKey", key);
        if (strM31844o != null) {
            callback.invoke(null, m31837g(strM31844o));
            return;
        }
        String strM31843n = m31843n("containsKey", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(C46392a.m102320b(m31840k(C42850g.m93982a(str), key))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            Boolean bool = (Boolean) objM103844constructorimpl;
            m31838h("containsKey", source, key, str, "exists=" + bool.booleanValue());
            callback.invoke(bool, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, m31839j("containsKey", thM103847exceptionOrNullimpl));
        }
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: d */
    public void mo31834d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String key, @Nullable String str, @NotNull Function2<Object, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31844o = m31844o("getItem", key);
        if (strM31844o != null) {
            callback.invoke(null, m31837g(strM31844o));
            return;
        }
        String strM31843n = m31843n("getItem", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            StorageId<String> storageIdM31840k = m31840k(C42850g.m93982a(str), key);
            objM103844constructorimpl = Result.m103844constructorimpl(!C46392a.m102320b(storageIdM31840k) ? null : C42849f.f94917a.m93981a(C46392a.m102326h(storageIdM31840k, "")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            Map map = (Map) objM103844constructorimpl;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("hit=");
            sb2.append(map != null);
            m31838h("getItem", source, key, str, sb2.toString());
            callback.invoke(map, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, m31839j("getItem", thM103847exceptionOrNullimpl));
        }
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: e */
    public void mo31835e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String key, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31844o = m31844o("removeItem", key);
        if (strM31844o != null) {
            callback.invoke(null, m31837g(strM31844o));
            return;
        }
        String strM31843n = m31843n("removeItem", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102335r(m31840k(C42850g.m93982a(str), key));
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            ((Boolean) objM103844constructorimpl).getClass();
            m31830i(this, "removeItem", source, key, str, null, 16, null);
            callback.invoke(Boolean.TRUE, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, m31839j("removeItem", thM103847exceptionOrNullimpl));
        }
    }

    @Override // d00.InterfaceC36563b0
    /* JADX INFO: renamed from: f */
    public void mo31836f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31843n = m31843n("clear", str);
        if (strM31843n != null) {
            callback.invoke(null, m31837g(strM31843n));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102319a(C42850g.m93982a(str));
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            ((Boolean) objM103844constructorimpl).getClass();
            m31830i(this, "clear", source, null, str, null, 16, null);
            callback.invoke(Boolean.TRUE, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, m31839j("clear", thM103847exceptionOrNullimpl));
        }
    }

    /* JADX INFO: renamed from: g */
    public final ProtocolException m31837g(String str) {
        C44128b.m97266j("KCJsBridgeStorage", str);
        return new ProtocolException("-9001", new IllegalArgumentException(str), str, false, 8, null);
    }

    /* JADX INFO: renamed from: j */
    public final ProtocolException m31839j(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" failed: ");
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        sb2.append(message);
        C44128b.m97266j("KCJsBridgeStorage", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(": ");
        String message2 = th2.getMessage();
        sb3.append(message2 != null ? message2 : "");
        return new ProtocolException("-9002", th2, sb3.toString(), false, 8, null);
    }

    /* JADX INFO: renamed from: k */
    public final StorageId<String> m31840k(String str, String str2) {
        return new StorageId<>(str, str2, StorageType.Shared, false, 8, null);
    }

    /* JADX INFO: renamed from: l */
    public final String m31841l(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        boolean zAreEqual = map != null ? Intrinsics.areEqual(map.get("__kc_storage_value_encoded"), Boolean.TRUE) : false;
        Object obj2 = map != null ? map.get("__kc_storage_value_type") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("valueType=");
        sb2.append(obj.getClass().getSimpleName());
        sb2.append(", encoded=");
        sb2.append(zAreEqual);
        sb2.append(", encodedType=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public final int m31842m(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if ((map != null ? Intrinsics.areEqual(map.get("__kc_storage_value_encoded"), Boolean.TRUE) : false) && map.containsKey("__kc_storage_value_data")) {
            obj = map.get("__kc_storage_value_data");
        }
        byte[] bytes = (obj instanceof String ? (String) obj : C27099x.m66919i(obj, false, 2, null)).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes.length;
    }

    /* JADX INFO: renamed from: n */
    public final String m31843n(String str, String str2) {
        if (str2 == null || str2.length() <= 100) {
            return null;
        }
        return str + ": biz参数不能超过100个字符";
    }

    /* JADX INFO: renamed from: h */
    public final void m31838h(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        if (StringsKt.isBlank(str5)) {
            str6 = "";
        } else {
            str6 = ", " + str5;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" success source=");
        sb2.append(str2);
        sb2.append(", biz=");
        if (str4 == null) {
            str7 = "";
        } else {
            str7 = str4;
        }
        sb2.append(str7);
        sb2.append(", category=");
        sb2.append(C42850g.m93982a(str4));
        sb2.append(", key=");
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(str6);
        C44128b.m97266j("KCJsBridgeStorage", sb2.toString());
    }

    /* JADX INFO: renamed from: o */
    public final String m31844o(String str, String str2) {
        if (StringsKt.isBlank(str2)) {
            return str + ": key参数不能为空";
        }
        if (str2.length() > 100) {
            return str + ": key参数不能超过100个字符";
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final String m31845p(Object obj) {
        if (m31842m(obj) > 10485760) {
            return "setItem: value参数不能超过2KB";
        }
        return null;
    }
}

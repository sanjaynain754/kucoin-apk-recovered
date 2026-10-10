package p373jk;

import android.content.Context;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.mmkv.MMKV;
import d00.InterfaceC36563b0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jk.e */
/* JADX INFO: compiled from: JsApiStorageBridgeHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\"\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J(\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J \u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/jsbridge/api/storage/JsApiStorageBridgeHelper;", "", "<init>", "()V", "SOURCE_FLUTTER", "", "STORAGE_VALUE_ENCODED", "STORAGE_VALUE_TYPE", "STORAGE_VALUE_DATA", "RN_VALUE_KEY", "MAX_KEY_LENGTH", "", "MAX_BIZ_LENGTH", "MAX_VALUE_BYTES", "validateKey", "key", "validateBiz", Constants.BIZ, "encodeStringValue", "", "value", "encodeRnValue", "resolveSharedMmkvRootPath", "context", "Landroid/content/Context;", "containsKey", "", "getItem", "setItem", "removeItem", "decodeBusinessString", "raw", "storageModule", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiStorageModule;", "JsBridgeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsApiStorageBridgeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsApiStorageBridgeHelper.kt\ncom/kubi/jsbridge/api/storage/JsApiStorageBridgeHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
public final class C40432e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40432e f89748a = new C40432e();

    /* JADX INFO: renamed from: f */
    public static final Unit m89062f(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final Unit m89063j(Ref.ObjectRef objectRef, Object obj, ProtocolException protocolException) {
        objectRef.element = obj;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m89064l(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m89065o(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m89066e(@NotNull Context context, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC36563b0 interfaceC36563b0M89073p = m89073p();
        if (interfaceC36563b0M89073p == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        interfaceC36563b0M89073p.mo31833c(context, null, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, key, str, new Function2() { // from class: jk.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40432e.m89062f(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: g */
    public final String m89067g(Object obj) {
        String str = null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        if (Intrinsics.areEqual(map.get("__kc_storage_value_encoded"), Boolean.TRUE) && map.containsKey("__kc_storage_value_data")) {
            Object obj2 = map.get("__kc_storage_value_data");
            if (obj2 == null) {
                return null;
            }
            str = obj2 instanceof String ? (String) obj2 : null;
            return str == null ? obj2.toString() : str;
        }
        if (map.containsKey("value")) {
            Object obj3 = map.get("value");
            if (obj3 == null) {
                return null;
            }
            str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                return obj3.toString();
            }
        }
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Map<String, Object> m89068h(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return MapsKt.mapOf(TuplesKt.m90091to("value", value));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final String m89069i(@NotNull Context context, @NotNull String key, @Nullable String str) {
        InterfaceC36563b0 interfaceC36563b0M89073p;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if (m89075r(key) != null || m89074q(str) != null || (interfaceC36563b0M89073p = m89073p()) == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        interfaceC36563b0M89073p.mo31834d(context, null, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, key, str, new Function2() { // from class: jk.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40432e.m89063j(objectRef, obj, (ProtocolException) obj2);
            }
        });
        return m89067g(objectRef.element);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89070k(@NotNull Context context, @NotNull String key, @Nullable String str) {
        InterfaceC36563b0 interfaceC36563b0M89073p;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if (m89075r(key) != null || m89074q(str) != null || (interfaceC36563b0M89073p = m89073p()) == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        interfaceC36563b0M89073p.mo31835e(context, null, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, key, str, new Function2() { // from class: jk.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40432e.m89064l(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return booleanRef.element;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final String m89071m(@NotNull Context context) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            String rootDir = MMKV.getRootDir();
            String string = rootDir != null ? StringsKt.trim((CharSequence) rootDir).toString() : null;
            String str = "";
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                MMKV.initialize(context.getApplicationContext());
                String rootDir2 = MMKV.getRootDir();
                String string2 = rootDir2 != null ? StringsKt.trim((CharSequence) rootDir2).toString() : null;
                if (string2 != null) {
                    str = string2;
                }
                string = str;
            }
            if (string.length() <= 0) {
                string = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(string);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m89072n(@NotNull Context context, @NotNull String key, @NotNull String value, @Nullable String str) {
        InterfaceC36563b0 interfaceC36563b0M89073p;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (m89075r(key) != null || m89074q(str) != null) {
            return false;
        }
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 2048 || (interfaceC36563b0M89073p = m89073p()) == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        interfaceC36563b0M89073p.mo31832b(context, null, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, key, m89068h(value), str, new Function2() { // from class: jk.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40432e.m89065o(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC36563b0 m89073p() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36563b0) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m89074q(@Nullable String str) {
        if (str == null || str.length() <= 100) {
            return null;
        }
        return "biz参数不能超过100个字符";
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final String m89075r(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.isBlank(key)) {
            return "key参数不能为空";
        }
        if (key.length() > 100) {
            return "key参数不能超过100个字符";
        }
        return null;
    }
}

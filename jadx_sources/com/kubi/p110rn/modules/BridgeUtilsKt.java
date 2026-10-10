package com.kubi.p110rn.modules;

import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.RNConstantKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: BridgeUtils.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u001a \u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0000\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\nH\u0000\u001a\u0018\u0010\f\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001aH\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u0002H\u000e2\u0019\b\u0004\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000e0\u0011¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m90084d2 = {"ERROR_CODE_PARAM", "", "ERROR_CODE_NET", "ERROR_EXCEPTION", "optBoolean", "", "Lcom/facebook/react/bridge/ReadableMap;", "key", "default", "optInt", "", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;", "optString", "opt", ExifInterface.GPS_DIRECTION_TRUE, "defaultValue", "getter", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "base64toBytes", "", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBridgeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeUtils.kt\ncom/kubi/rn/modules/BridgeUtilsKt\n*L\n1#1,65:1\n42#1,9:66\n42#1,9:75\n42#1,9:84\n42#1,9:93\n42#1,9:102\n*S KotlinDebug\n*F\n+ 1 BridgeUtils.kt\ncom/kubi/rn/modules/BridgeUtilsKt\n*L\n21#1:66,9\n25#1:75,9\n29#1:84,9\n33#1:93,9\n37#1:102,9\n*E\n"})
public final class BridgeUtilsKt {

    @NotNull
    public static final String ERROR_CODE_NET = "KCE002";

    @NotNull
    public static final String ERROR_CODE_PARAM = "KCE001";

    @NotNull
    public static final String ERROR_EXCEPTION = "KCE003";

    @Nullable
    public static final Integer optInt(@Nullable ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        try {
            return Integer.valueOf(readableMap.getInt(key));
        } catch (Exception e11) {
            C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            return null;
        }
    }

    @Nullable
    public static final String optString(@Nullable ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        try {
            return readableMap.getString(key);
        } catch (Exception e11) {
            C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            return null;
        }
    }

    @Nullable
    public static final byte[] base64toBytes(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        if (size == 1) {
            str2 = (String) listSplit$default.get(0);
        } else {
            if (size != 2) {
                return null;
            }
            str2 = (String) listSplit$default.get(1);
        }
        return Base64.decode(str2, 0);
    }

    public static final <T> T opt(@Nullable ReadableMap readableMap, @NotNull String key, T t11, @NotNull Function1<? super ReadableMap, ? extends T> getter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(getter, "getter");
        if (readableMap != null && readableMap.hasKey(key)) {
            try {
                return getter.invoke(readableMap);
            } catch (Exception e11) {
                C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            }
        }
        return t11;
    }

    public static final boolean optBoolean(@Nullable ReadableMap readableMap, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return z11;
        }
        try {
            return readableMap.getBoolean(key);
        } catch (Exception e11) {
            C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            return z11;
        }
    }

    public static /* synthetic */ boolean optBoolean$default(ReadableMap readableMap, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return optBoolean(readableMap, str, z11);
    }

    public static final int optInt(@Nullable ReadableMap readableMap, @NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return i11;
        }
        try {
            return readableMap.getInt(key);
        } catch (Exception e11) {
            C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            return i11;
        }
    }

    @NotNull
    public static final String optString(@Nullable ReadableMap readableMap, @NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return str;
        }
        try {
            String string = readableMap.getString(key);
            return string == null ? str : string;
        } catch (Exception e11) {
            C44128b.m97263g(RNConstantKt.LOG_TAG, e11);
            return str;
        }
    }
}

package com.kubi.p110rn.core.biz;

import com.google.firebase.messaging.Constants;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.protocol.ProtocolException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCTurboNetworkModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0007"}, m90084d2 = {"makeRequestFailureResponse", "", "", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/protocol/ProtocolException;", "makeUploadFileFailureResponse", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTurboNetworkModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboNetworkModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboNetworkModuleImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
public final class KCTurboNetworkModuleImplKt {
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    @NotNull
    public static final Map<String, Object> makeRequestFailureResponse(@NotNull ProtocolException error) {
        String message;
        String string;
        Intrinsics.checkNotNullParameter(error, "error");
        Object data = error.getData();
        Map<String, Object> map = data instanceof Map ? (Map) data : null;
        if (map != null) {
            return map;
        }
        Pair pairM90091to = TuplesKt.m90091to("success", Boolean.FALSE);
        String code = error.getCode();
        if (code == null) {
            code = OtcAd.KYC_NOT_PASS;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("code", code);
        Object data2 = error.getData();
        if (data2 == null || (string = data2.toString()) == null) {
            Throwable throwable = error.getThrowable();
            message = throwable != null ? throwable.getMessage() : null;
            if (message == null) {
                string = "";
            } else {
                string = message;
            }
        } else {
            if (StringsKt.isBlank(string)) {
                string = null;
            }
            if (string == null) {
                Throwable throwable2 = error.getThrowable();
                if (throwable2 != null) {
                }
                if (message == null) {
                    string = "";
                } else {
                    string = message;
                }
            }
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("msg", string));
    }

    @NotNull
    public static final Map<String, Object> makeUploadFileFailureResponse(@Nullable ProtocolException protocolException) {
        String code;
        String message;
        Throwable throwable;
        Object data;
        Pair pairM90091to = TuplesKt.m90091to("success", Boolean.FALSE);
        if (protocolException == null || (code = protocolException.getCode()) == null) {
            code = "-9002";
        }
        Pair pairM90091to2 = TuplesKt.m90091to("code", code);
        if (protocolException == null || (data = protocolException.getData()) == null || (message = data.toString()) == null) {
            message = (protocolException == null || (throwable = protocolException.getThrowable()) == null) ? null : throwable.getMessage();
            if (message == null) {
                message = "request invalid";
            }
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("msg", message));
    }
}

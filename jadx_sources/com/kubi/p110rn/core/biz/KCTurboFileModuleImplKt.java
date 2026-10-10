package com.kubi.p110rn.core.biz;

import com.kubi.p110rn.core.turbo.FileActionResult;
import com.kubi.p110rn.core.turbo.PickFileResult;
import com.kubi.p110rn.core.turbo.PickedFile;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFileFileActionResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickFileResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickedFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboFileModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\t\u001a\u00020\u0007*\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"toTurboResult", "Lcom/kubi/rn/core/turbo/PickFileResult;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickFileResult;", "Lcom/kubi/rn/core/turbo/FileActionResult;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileFileActionResult;", "pickFailure", "errorCode", "", "actionFailure", "businessErrorOr", "Lcom/kubi/sdk/protocol/ProtocolException;", "fallback", "FILE_BUSINESS_ERRORS", "", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTurboFileModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboFileModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboFileModuleImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1563#2:163\n1634#2,3:164\n1#3:167\n*S KotlinDebug\n*F\n+ 1 KCTurboFileModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboFileModuleImplKt\n*L\n121#1:163\n121#1:164,3\n*E\n"})
public final class KCTurboFileModuleImplKt {

    @NotNull
    private static final Set<String> FILE_BUSINESS_ERRORS = SetsKt.setOf((Object[]) new String[]{"USER_CANCELLED", "UNSUPPORTED_TYPE", "FILE_TOO_LARGE", "DOWNLOAD_FAILED", "AUTH_FAILED", "PERMISSION_DENIED", "SAVE_FAILED", "NO_VIEWER"});

    @NotNull
    public static final PickFileResult toTurboResult(@NotNull KCJSApiFilePickFileResult kCJSApiFilePickFileResult) {
        Intrinsics.checkNotNullParameter(kCJSApiFilePickFileResult, "<this>");
        List<KCJSApiFilePickedFile> files = kCJSApiFilePickFileResult.getFiles();
        if (files == null) {
            files = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
        for (KCJSApiFilePickedFile kCJSApiFilePickedFile : files) {
            String path = kCJSApiFilePickedFile.getPath();
            String name = kCJSApiFilePickedFile.getName();
            String mimeType = kCJSApiFilePickedFile.getMimeType();
            String fileExtension = kCJSApiFilePickedFile.getFileExtension();
            Long size = kCJSApiFilePickedFile.getSize();
            arrayList.add(new PickedFile(path, name, mimeType, fileExtension, size != null ? Double.valueOf(size.longValue()) : null));
        }
        return new PickFileResult(arrayList, kCJSApiFilePickFileResult.getErrorCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileActionResult actionFailure(String str) {
        return new FileActionResult(Boolean.FALSE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String businessErrorOr(ProtocolException protocolException, String str) {
        String code;
        if (protocolException != null && (code = protocolException.getCode()) != null) {
            if (!FILE_BUSINESS_ERRORS.contains(code)) {
                code = null;
            }
            if (code != null) {
                return code;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PickFileResult pickFailure(String str) {
        return new PickFileResult(CollectionsKt.emptyList(), str);
    }

    @NotNull
    public static final FileActionResult toTurboResult(@NotNull KCJSApiFileFileActionResult kCJSApiFileFileActionResult) {
        Intrinsics.checkNotNullParameter(kCJSApiFileFileActionResult, "<this>");
        return new FileActionResult(Boolean.valueOf(kCJSApiFileFileActionResult.getSuccess()), kCJSApiFileFileActionResult.getErrorCode());
    }
}

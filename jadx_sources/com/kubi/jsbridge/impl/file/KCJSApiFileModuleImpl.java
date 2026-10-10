package com.kubi.jsbridge.impl.file;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFileFileActionResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickFileResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickedFile;
import com.kubi.widget.web.file.FileActionResult;
import com.kubi.widget.web.file.FileBridgeCoordinator;
import com.kubi.widget.web.file.FileTypeResolver;
import com.kubi.widget.web.file.LocalPickedFile;
import com.kubi.widget.web.file.PickFilesResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36570f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCJSApiFileModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011H\u0016¢\u0006\u0002\u0010\u0014J\u007f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011H\u0016¢\u0006\u0002\u0010\u001fJr\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011H\u0016JH\u0010#\u001a\u00020\u0005\"\u0004\b\u0000\u0010$2\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001H$\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050&H\u0002¨\u0006)"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/file/KCJSApiFileModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileModule;", "<init>", "()V", "pickFile", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "fileTypes", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickFileResult;", "Lcom/kubi/sdk/protocol/ProtocolException;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "previewFile", "isRemoteUrl", "", "fileUrl", "fileName", "headers", "", "", "allowShare", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileFileActionResult;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "downloadFile", "url", "target", "withActivity", ExifInterface.GPS_DIRECTION_TRUE, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "Companion", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJSApiFileModuleImpl implements InterfaceC36570f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27425a = new Companion(null);

    /* JADX INFO: compiled from: KCJSApiFileModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\f\u0010\t\u001a\u00020\u000e*\u00020\u000fH\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/file/KCJSApiFileModuleImpl$Companion;", "", "<init>", "()V", "normalizeHeaders", "", "", "headers", "normalizeHeaders$JsBridgeLib_googleRelease", "toProtocolResult", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickFileResult;", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/widget/web/file/PickFilesResult;", "toProtocolResult$JsBridgeLib_googleRelease", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileFileActionResult;", "Lcom/kubi/widget/web/file/FileActionResult;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCJSApiFileModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiFileModuleImpl.kt\ncom/kubi/jsbridge/impl/file/KCJSApiFileModuleImpl$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n136#2,9:173\n216#2:182\n217#2:184\n145#2:185\n1#3:183\n1563#4:186\n1634#4,3:187\n*S KotlinDebug\n*F\n+ 1 KCJSApiFileModuleImpl.kt\ncom/kubi/jsbridge/impl/file/KCJSApiFileModuleImpl$Companion\n*L\n142#1:173,9\n142#1:182\n142#1:184\n142#1:185\n142#1:183\n154#1:186\n154#1:187,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final KCJSApiFileFileActionResult m31717a(FileActionResult fileActionResult) {
            return new KCJSApiFileFileActionResult(fileActionResult.getSuccess(), fileActionResult.getErrorCode());
        }

        @NotNull
        public final Map<String, String> normalizeHeaders$JsBridgeLib_googleRelease(@Nullable Map<String, ? extends Object> headers) {
            if (headers == null) {
                headers = MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends Object> entry : headers.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Pair pairM90091to = null;
                String string = ((value instanceof String) || (value instanceof Number) || (value instanceof Boolean)) ? value.toString() : null;
                if (!StringsKt.isBlank(key) && string != null) {
                    pairM90091to = TuplesKt.m90091to(key, string);
                }
                if (pairM90091to != null) {
                    arrayList.add(pairM90091to);
                }
            }
            return MapsKt.toMap(arrayList);
        }

        @NotNull
        public final KCJSApiFilePickFileResult toProtocolResult$JsBridgeLib_googleRelease(@NotNull PickFilesResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            List<LocalPickedFile> listM67239b = result.m67239b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM67239b, 10));
            for (LocalPickedFile localPickedFile : listM67239b) {
                arrayList.add(new KCJSApiFilePickedFile(localPickedFile.getPath(), localPickedFile.getName(), localPickedFile.getMimeType(), localPickedFile.getExtension(), localPickedFile.getSize()));
            }
            return new KCJSApiFilePickFileResult(arrayList, result.getErrorCode());
        }
    }

    @Override // d00.InterfaceC36570f
    /* JADX INFO: renamed from: b */
    public void mo31714b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, final boolean z11, @NotNull final String fileUrl, @Nullable final String str, @Nullable final Map<String, ? extends Object> map, @Nullable final Boolean bool, @NotNull final Function2<? super KCJSApiFileFileActionResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (StringsKt.isBlank(fileUrl) || (z11 && HttpUrl.INSTANCE.parse(fileUrl) == null)) {
            callback.invoke(null, new ProtocolException("previewFile: invalid fileUrl", null, null, false, 14, null));
        } else {
            m31716p(ctx, callback, new Function1() { // from class: com.kubi.jsbridge.impl.file.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJSApiFileModuleImpl.m31711n(z11, fileUrl, str, map, bool, callback, (FragmentActivity) obj2);
                }
            });
        }
    }

    @Override // d00.InterfaceC36570f
    /* JADX INFO: renamed from: c */
    public void mo31715c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final String url, @Nullable final String str, @Nullable final Map<String, ? extends Object> map, @Nullable String str2, @NotNull final Function2<? super KCJSApiFileFileActionResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (HttpUrl.INSTANCE.parse(url) == null) {
            callback.invoke(null, new ProtocolException("downloadFile: invalid url", null, null, false, 14, null));
            return;
        }
        final String strM67175f = FileBridgeCoordinator.f55086a.m67175f(str2);
        if (strM67175f == null) {
            callback.invoke(null, new ProtocolException("downloadFile: invalid target", null, null, false, 14, null));
        } else {
            m31716p(ctx, callback, new Function1() { // from class: com.kubi.jsbridge.impl.file.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJSApiFileModuleImpl.m31707j(url, str, map, strM67175f, callback, (FragmentActivity) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m31707j(String str, String str2, Map map, String str3, final Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FileBridgeCoordinator.f55086a.m67174d(activity, str, str2, f27425a.normalizeHeaders$JsBridgeLib_googleRelease(map), str3, new Function1() { // from class: com.kubi.jsbridge.impl.file.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCJSApiFileModuleImpl.m31708k(function2, (FileActionResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m31708k(Function2 function2, FileActionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(f27425a.m31717a(it), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m31709l(List list, long j11, Long l11, final Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FileBridgeCoordinator.f55086a.m67177h(activity, list, (int) RangesKt.coerceAtMost(j11, 2147483647L), l11, new Function1() { // from class: com.kubi.jsbridge.impl.file.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCJSApiFileModuleImpl.m31710m(function2, (PickFilesResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m31710m(Function2 function2, PickFilesResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(f27425a.toProtocolResult$JsBridgeLib_googleRelease(it), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m31711n(boolean z11, String str, String str2, Map map, Boolean bool, final Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FileBridgeCoordinator.f55086a.m67178i(activity, z11, str, str2, f27425a.normalizeHeaders$JsBridgeLib_googleRelease(map), bool != null ? bool.booleanValue() : true, new Function1() { // from class: com.kubi.jsbridge.impl.file.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCJSApiFileModuleImpl.m31712o(function2, (FileActionResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m31712o(Function2 function2, FileActionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(f27425a.m31717a(it), null);
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36570f
    /* JADX INFO: renamed from: a */
    public void mo31713a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @Nullable Long l11, @Nullable final Long l12, @NotNull final Function2<? super KCJSApiFilePickFileResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final long jLongValue = l11 != null ? l11.longValue() : 1L;
        if (jLongValue <= 0 || (l12 != null && l12.longValue() < 0)) {
            callback.invoke(null, new ProtocolException("pickFile: invalid limit", null, null, false, 14, null));
            return;
        }
        final List<String> listM67228o = FileTypeResolver.f55133a.m67228o(str);
        if (str == null || str.length() == 0 || !listM67228o.isEmpty()) {
            m31716p(ctx, callback, new Function1() { // from class: com.kubi.jsbridge.impl.file.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJSApiFileModuleImpl.m31709l(listM67228o, jLongValue, l12, callback, (FragmentActivity) obj2);
                }
            });
        } else {
            callback.invoke(new KCJSApiFilePickFileResult(CollectionsKt.emptyList(), "UNSUPPORTED_TYPE"), null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final <T> void m31716p(Context context, Function2<? super T, ? super ProtocolException, Unit> function2, Function1<? super FragmentActivity, Unit> function1) {
        MviExKt.m42518n(new KCJSApiFileModuleImpl$withActivity$1(context, function2, function1, null));
    }
}

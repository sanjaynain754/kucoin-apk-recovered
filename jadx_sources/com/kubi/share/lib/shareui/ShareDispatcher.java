package com.kubi.share.lib.shareui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.datasource.cache.ContentMetadata;
import com.blankj.utilcode.util.C5292r;
import com.kubi.share.R$string;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.ShareParam;
import com.kubi.share.api.TextShareParam;
import com.kubi.share.lib.entity.ShareGalleryEntity;
import com.kubi.share.lib.lifecycle.ShareMainActLifecycleKt;
import com.kubi.share.lib.utils.ShareChannel;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import z10.C46646a;

/* JADX INFO: compiled from: ShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bJ.\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0002J.\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00102\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0002J.\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00122\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0002JD\u0010\u0013\u001a\u00020\u0005*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dJ(\u0010\u001e\u001a\u00020\u0005*\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J&\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dH\u0002J,\u0010 \u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dH\u0082@¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#*\u00020\u001aH\u0002J\f\u0010%\u001a\u00020\u001a*\u00020\u001aH\u0002¨\u0006&"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/ShareDispatcher;", "", "<init>", "()V", "dispatch", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "param", "Lcom/kubi/share/api/ShareParam;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "dispatchGallerry", "Lcom/kubi/share/api/GalleryShareParam;", "dispatchImage", "Lcom/kubi/share/api/ImageShareParam;", "dispatchText", "Lcom/kubi/share/api/TextShareParam;", "doShare", "Lcom/kubi/share/lib/utils/ShareChannel;", "fragment", "Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;", "bitmap", "Landroid/graphics/Bitmap;", "shareContent", "", "shareLink", "closeDailog", "Lkotlin/Function0;", "shareForApp", "shareSaveImage", "saveImage", "(Landroid/graphics/Bitmap;Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toShareGalleryEntities", "", "Lcom/kubi/share/lib/entity/ShareGalleryEntity;", "toGlideImageModel", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,324:1\n45#2,4:325\n45#2,4:329\n1#3:333\n47#4,4:334\n1563#5:338\n1634#5,3:339\n774#5:342\n865#5,2:343\n1573#5:345\n1604#5,4:346\n*S KotlinDebug\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher\n*L\n110#1:325,4\n125#1:329,4\n221#1:334,4\n301#1:338\n301#1:339,3\n302#1:342\n302#1:343,2\n303#1:345\n303#1:346,4\n*E\n"})
public final class ShareDispatcher {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ShareDispatcher f49422a = new ShareDispatcher();

    /* JADX INFO: renamed from: h */
    public final void m59812h(@NotNull ShareChannel shareChannel, @NotNull AbsShareDailogFragment fragment, @Nullable Bitmap bitmap, @Nullable String str, @Nullable String str2, @NotNull Function0<Unit> closeDailog) {
        Intrinsics.checkNotNullParameter(shareChannel, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(closeDailog, "closeDailog");
        C44128b.m97266j("ShareDispatcher", "doShare shareLink=" + str2);
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        if (shareChannel.getIsApp() && (shareChannel.getPkgName().length() == 0 || !ShareExtKt.m59860s(context, shareChannel.getPkgName()))) {
            ToastCompat.m66437C(R$string.share_uninstall_tip);
            return;
        }
        if (shareChannel.getIsApp()) {
            m59814k(shareChannel, bitmap, fragment, str);
            return;
        }
        int i11 = C24579a.$EnumSwitchMapping$0[shareChannel.ordinal()];
        if (i11 == 1) {
            if (bitmap != null) {
                f49422a.m59815l(fragment, bitmap, closeDailog);
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() != 0) {
                str = str2;
            }
            if (str == null || str.length() == 0) {
                return;
            }
            C27057k.m66746b(str);
            ToastCompat.m66437C(R$string.copy_success);
            closeDailog.invoke();
            return;
        }
        if (i11 != 3) {
            closeDailog.invoke();
            return;
        }
        if (bitmap != null) {
            ShareExtKt.m59829B(fragment, bitmap, shareChannel);
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            fragment.startActivity(C5292r.m6393f(str));
            ShareExtKt.m59862u();
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$a */
    /* JADX INFO: compiled from: ShareDispatcher.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24579a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            try {
                iArr[ShareChannel.Save.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareChannel.Copy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareChannel.More.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,49:1\n222#2:50\n223#2,2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher\n*L\n222#1:51,4\n*E\n"})
    public static final class C24580b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24580b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C46646a.m102888b(exception, "ShareExt");
            }
            ToastCompat.m66437C(R$string.failed);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m59807i(ShareDispatcher shareDispatcher, ShareChannel shareChannel, AbsShareDailogFragment absShareDailogFragment, Bitmap bitmap, String str, String str2, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bitmap = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        shareDispatcher.m59812h(shareChannel, absShareDailogFragment, bitmap, str, str2, function0);
    }

    /* JADX INFO: renamed from: d */
    public final void m59808d(@NotNull FragmentActivity activity, @NotNull ShareParam param, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(param, "param");
        if (param instanceof GalleryShareParam) {
            m59809e(activity, (GalleryShareParam) param, function1);
        } else if (param instanceof ImageShareParam) {
            m59810f(activity, (ImageShareParam) param, function1);
        } else if (param instanceof TextShareParam) {
            m59811g(activity, (TextShareParam) param, function1);
        }
        ShareMainActLifecycleKt.m59719a(LifecycleOwnerKt.getLifecycleScope(activity));
    }

    /* JADX INFO: renamed from: f */
    public final void m59810f(FragmentActivity fragmentActivity, ImageShareParam imageShareParam, Function1<? super Boolean, Unit> function1) {
        try {
            ImageShareDialogFragment.Companion companion = ImageShareDialogFragment.f49408y0;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            companion.launch(supportFragmentManager, imageShareParam);
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            if (C42899b.m94075e(th2)) {
                return;
            }
            C46646a.m102888b(th2, "ShareDispatcher");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m59811g(FragmentActivity fragmentActivity, TextShareParam textShareParam, Function1<? super Boolean, Unit> function1) {
        try {
            TextShareDialogFragment.Companion companion = TextShareDialogFragment.f49423v0;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            companion.launch(supportFragmentManager, textShareParam);
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            if (C42899b.m94075e(th2)) {
                return;
            }
            C46646a.m102888b(th2, "ShareDispatcher");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m59814k(ShareChannel shareChannel, Bitmap bitmap, AbsShareDailogFragment absShareDailogFragment, String str) {
        if (bitmap != null) {
            ShareExtKt.m59829B(absShareDailogFragment, bitmap, shareChannel);
        } else if (str != null) {
            ShareExtKt.m59839L(absShareDailogFragment, str, shareChannel);
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m59816m(String str) {
        if (StringsKt.startsWith(str, "data:image/", true) || StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
            return str;
        }
        return "data:image/png;base64," + str;
    }

    /* JADX INFO: renamed from: e */
    public final void m59809e(FragmentActivity fragmentActivity, GalleryShareParam galleryShareParam, Function1<? super Boolean, Unit> function1) {
        LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new ShareDispatcher$dispatchGallerry$1(fragmentActivity, galleryShareParam, function1, null));
    }

    /* JADX INFO: renamed from: j */
    public final Object m59813j(Bitmap bitmap, AbsShareDailogFragment absShareDailogFragment, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b().plus(new C24580b(CoroutineExceptionHandler.INSTANCE)), new ShareDispatcher$saveImage$3(absShareDailogFragment, bitmap, function0, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m59815l(AbsShareDailogFragment absShareDailogFragment, Bitmap bitmap, Function0<Unit> function0) {
        LifecycleOwnerKt.getLifecycleScope(absShareDailogFragment).launchWhenStarted(new ShareDispatcher$shareSaveImage$1(bitmap, absShareDailogFragment, function0, null));
    }

    /* JADX INFO: renamed from: n */
    public final List<ShareGalleryEntity> m59817n(String str) {
        List<String> listSplit$default;
        int i11 = 0;
        if (StringsKt.startsWith(StringsKt.trimStart((CharSequence) str).toString(), "data:image/", true)) {
            listSplit$default = new Regex(",(?=\\s*data:image/)").split(str, 0);
        } else {
            listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator<T> it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Object obj2 : arrayList2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(new ShareGalleryEntity(String.valueOf(i11), ContentMetadata.KEY_CUSTOM_PREFIX + i11, f49422a.m59816m((String) obj2)));
            i11 = i12;
        }
        return arrayList3;
    }
}

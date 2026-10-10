package com.kubi.share.lib.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.ProxyConfig;
import com.blankj.utilcode.util.C5292r;
import com.blankj.utilcode.util.C5302w;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.host.HostManager;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.share.R$id;
import com.kubi.share.R$layout;
import com.kubi.share.R$mipmap;
import com.kubi.share.R$string;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.ShareParam;
import com.kubi.share.api.TextShareParam;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27060l0;
import com.kubi.utils.C27094u0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.widget.web.service.IKWebService;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import xb0.C46126b;
import z10.C46646a;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0080@¢\u0006\u0002\u0010\b\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u001a\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0014\u001a\u00020\u000e*\u00020\u0002H\u0001\u001a\f\u0010\u0015\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a0\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0000\u001a \u0010\u001c\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010 \u001a\u0016\u0010!\u001a\u00020\u000e*\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020#H\u0000\u001a\f\u0010$\u001a\u00020\u0004*\u00020%H\u0000\u001a$\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\f\u0010*\u001a\u00020\u0004*\u00020+H\u0002\u001a\u000e\u0010,\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0002\u001a\f\u0010-\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u001a\u0018\u0010.\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\b\u0010/\u001a\u00020\nH\u0000\u001a\b\u00100\u001a\u00020\nH\u0000¨\u00061"}, m90084d2 = {"isContainPackName", "", "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "withWriteExternalStoragePermissions", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareImage", "", "fragment", "Landroidx/fragment/app/Fragment;", "shareContent", "Landroid/graphics/Bitmap;", "shareMenu", "Lcom/kubi/share/lib/utils/ShareChannel;", "shareImagePath", "shareTextContent", "item", "createPlaceholderImgBitmap", "replaceContentUrl", "shareSaveImage", "context", "bitmap", "isSave", "onFinish", "Lkotlin/Function0;", "saveImageToMediaStore", "(Landroid/graphics/Bitmap;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareImageFromCache", "fileName", "(Landroid/graphics/Bitmap;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createQRCode", "size", "", "shareLink", "Lcom/kubi/share/api/ShareParam;", "getShareUrlFromParam", "utmSource", "qrCodeUrl", "rcode", "getTextShareUrl", "Lcom/kubi/share/api/TextShareParam;", "checkValide", "checkKcValide", "plusRcode", "onAppShareClickedEvent", "onAppShareExitEvent", "ShareLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,391:1\n47#2,4:392\n47#2,4:396\n1#3:400\n29#4:401\n29#4:402\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n*L\n216#1:392,4\n292#1:396,4\n344#1:401\n369#1:402\n*E\n"})
public final class ShareExtKt {

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,49:1\n217#2:50\n218#2,2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n*L\n217#1:51,4\n*E\n"})
    public static final class C24624a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FragmentActivity f49506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24624a(CoroutineExceptionHandler.Companion companion, FragmentActivity fragmentActivity) {
            super(companion);
            this.f49506b = fragmentActivity;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C46646a.m102888b(exception, "ShareExt");
            }
            ToastCompat.m66441G(this.f49506b.getString(R$string.failed), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m59835H(boolean z11, FragmentActivity fragmentActivity, String str) {
        if (z11) {
            try {
                fragmentActivity.startActivity(C5292r.m6392e("", str));
            } catch (Exception unused) {
                ToastCompat.m66441G(fragmentActivity.getString(R$string.failed), new Object[0]);
            }
        } else {
            ToastCompat.m66441G(fragmentActivity.getString(R$string.failed), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m59853l(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "kucoin.plus", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "kucoin.com", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,49:1\n293#2:50\n294#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt\n*L\n293#1:51,4\n*E\n"})
    public static final class C24625b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24625b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C46646a.m102888b(exception, "ShareExt");
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Object m59828A(Bitmap bitmap, FragmentActivity fragmentActivity, Continuation<? super Unit> continuation) {
        if (bitmap == null) {
            ToastCompat.m66441G(fragmentActivity.getString(R$string.failed), new Object[0]);
            return Unit.INSTANCE;
        }
        Object objM91049g = C41686h.m91049g(C42911a.m94120b().plus(new C24624a(CoroutineExceptionHandler.INSTANCE, fragmentActivity)), new ShareExtKt$saveImageToMediaStore$3(fragmentActivity, bitmap, null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: B */
    public static final void m59829B(@NotNull final Fragment fragment, @Nullable final Bitmap bitmap, @NotNull final ShareChannel shareMenu) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(shareMenu, "shareMenu");
        try {
            m59836I(fragment, bitmap, shareMenu);
        } catch (Throwable th2) {
            C44128b.m97263g("ShareExt", th2);
            Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(fragment), "android.permission.WRITE_EXTERNAL_STORAGE");
            final Function1 function1 = new Function1() { // from class: com.kubi.share.lib.utils.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShareExtKt.m59830C(fragment, bitmap, shareMenu, (Boolean) obj);
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.share.lib.utils.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShareExtKt.m59831D(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.share.lib.utils.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShareExtKt.m59832E(fragment, (Throwable) obj);
                }
            };
            observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.share.lib.utils.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShareExtKt.m59833F(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m59832E(Fragment fragment, Throwable th2) {
        ToastCompat.m66441G(fragment.getString(R$string.failed), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public static final Object m59834G(Bitmap bitmap, final String str, final FragmentActivity fragmentActivity, Continuation<? super Unit> continuation) {
        ShareExtKt$shareImageFromCache$1 shareExtKt$shareImageFromCache$1;
        if (continuation instanceof ShareExtKt$shareImageFromCache$1) {
            shareExtKt$shareImageFromCache$1 = (ShareExtKt$shareImageFromCache$1) continuation;
            int i11 = shareExtKt$shareImageFromCache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shareExtKt$shareImageFromCache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shareExtKt$shareImageFromCache$1 = new ShareExtKt$shareImageFromCache$1(continuation);
            }
        } else {
            shareExtKt$shareImageFromCache$1 = new ShareExtKt$shareImageFromCache$1(continuation);
        }
        Object objM91049g = shareExtKt$shareImageFromCache$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = shareExtKt$shareImageFromCache$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(new C24625b(CoroutineExceptionHandler.INSTANCE));
            ShareExtKt$shareImageFromCache$result$2 shareExtKt$shareImageFromCache$result$2 = new ShareExtKt$shareImageFromCache$result$2(bitmap, str, null);
            shareExtKt$shareImageFromCache$1.L$0 = SpillingKt.nullOutSpilledVariable(bitmap);
            shareExtKt$shareImageFromCache$1.L$1 = str;
            shareExtKt$shareImageFromCache$1.L$2 = fragmentActivity;
            shareExtKt$shareImageFromCache$1.label = 1;
            objM91049g = C41686h.m91049g(coroutineContextPlus, shareExtKt$shareImageFromCache$result$2, shareExtKt$shareImageFromCache$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragmentActivity = (FragmentActivity) shareExtKt$shareImageFromCache$1.L$2;
            str = (String) shareExtKt$shareImageFromCache$1.L$1;
            ResultKt.throwOnFailure(objM91049g);
        }
        final boolean zBooleanValue = ((Boolean) objM91049g).booleanValue();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt.m59835H(zBooleanValue, fragmentActivity, str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final void m59836I(@NotNull Fragment fragment, @Nullable Bitmap bitmap, @NotNull ShareChannel shareMenu) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(shareMenu, "shareMenu");
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenStarted(new ShareExtKt$shareImagePath$1(bitmap, C5302w.m6507b() + "/share" + System.currentTimeMillis() + ".jpg", fragment, shareMenu, null));
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final String m59837J(@NotNull ShareParam shareParam) {
        Intrinsics.checkNotNullParameter(shareParam, "<this>");
        if (shareParam instanceof GalleryShareParam) {
            GalleryShareParam galleryShareParam = (GalleryShareParam) shareParam;
            return m59858q(galleryShareParam.getUtmSource(), galleryShareParam.getGalleryLink(), galleryShareParam.getRcode());
        }
        if (!(shareParam instanceof ImageShareParam)) {
            return shareParam instanceof TextShareParam ? m59859r((TextShareParam) shareParam) : "";
        }
        ImageShareParam imageShareParam = (ImageShareParam) shareParam;
        return m59858q(imageShareParam.getUtmSource(), imageShareParam.getQrCodeUrl(), imageShareParam.getRcode());
    }

    /* JADX INFO: renamed from: K */
    public static final void m59838K(@NotNull FragmentActivity context, @Nullable Bitmap bitmap, boolean z11, @NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        LifecycleOwnerKt.getLifecycleScope(context).launchWhenStarted(new ShareExtKt$shareSaveImage$1(z11, bitmap, context, onFinish, null));
    }

    /* JADX INFO: renamed from: L */
    public static final void m59839L(@NotNull final Fragment fragment, @NotNull final String shareContent, @NotNull final ShareChannel item) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        Intrinsics.checkNotNullParameter(item, "item");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt.m59840M(fragment, shareContent, item);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: N */
    public static final Object m59841N(@NotNull FragmentActivity fragmentActivity, @NotNull Continuation<? super Boolean> continuation) {
        ShareExtKt$withWriteExternalStoragePermissions$1 shareExtKt$withWriteExternalStoragePermissions$1;
        if (continuation instanceof ShareExtKt$withWriteExternalStoragePermissions$1) {
            shareExtKt$withWriteExternalStoragePermissions$1 = (ShareExtKt$withWriteExternalStoragePermissions$1) continuation;
            int i11 = shareExtKt$withWriteExternalStoragePermissions$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shareExtKt$withWriteExternalStoragePermissions$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shareExtKt$withWriteExternalStoragePermissions$1 = new ShareExtKt$withWriteExternalStoragePermissions$1(continuation);
            }
        } else {
            shareExtKt$withWriteExternalStoragePermissions$1 = new ShareExtKt$withWriteExternalStoragePermissions$1(continuation);
        }
        Object objM90914f0 = shareExtKt$withWriteExternalStoragePermissions$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = shareExtKt$withWriteExternalStoragePermissions$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(RxConvertKt.m91205b(PermissionCompatKt.m49936e(new C46126b(fragmentActivity), "android.permission.WRITE_EXTERNAL_STORAGE")), new ShareExtKt$withWriteExternalStoragePermissions$2(null));
            shareExtKt$withWriteExternalStoragePermissions$1.L$0 = SpillingKt.nullOutSpilledVariable(fragmentActivity);
            shareExtKt$withWriteExternalStoragePermissions$1.label = 1;
            objM90914f0 = C41636g.m90914f0(interfaceC41634eM90917h, shareExtKt$withWriteExternalStoragePermissions$1);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
        }
        Boolean bool = (Boolean) objM90914f0;
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m59854m(String str) {
        return str != null;
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Bitmap m59855n(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.share_view_image_placeholder, (ViewGroup) null, false);
        BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
        int i11 = R$id.tv_hold_coin_user;
        C27017c c27017c = C27017c.f54310a;
        List listSplit$default = StringsKt.split$default((CharSequence) c27017c.m66516f(R$string.hold_coin_user, ProxyConfig.MATCH_ALL_SCHEMES), new String[]{ProxyConfig.MATCH_ALL_SCHEMES}, false, 0, 6, (Object) null);
        C27096v0 c27096v0Append = new C27096v0().append((CharSequence) listSplit$default.get(0));
        Drawable drawableM66510d = C27017c.m66510d(c27017c, R$mipmap.ic_num_four, null, 2, null);
        drawableM66510d.setBounds(0, 0, C27029c.m66604g(baseViewHolder, 28), C27029c.m66604g(baseViewHolder, 40));
        baseViewHolder.setText(i11, c27096v0Append.m66906f(drawableM66510d).append((CharSequence) listSplit$default.get(1)));
        int i12 = R$id.tv_hold_kucoin_user;
        List listSplit$default2 = StringsKt.split$default((CharSequence) c27017c.m66516f(R$string.hold_kucoin_user, ProxyConfig.MATCH_ALL_SCHEMES), new String[]{ProxyConfig.MATCH_ALL_SCHEMES}, false, 0, 6, (Object) null);
        C27096v0 c27096v0Append2 = new C27096v0().append((CharSequence) listSplit$default2.get(0));
        Drawable drawableM66510d2 = C27017c.m66510d(c27017c, R$mipmap.ic_num_one, null, 2, null);
        drawableM66510d2.setBounds(0, 0, C27029c.m66604g(baseViewHolder, 28), C27029c.m66604g(baseViewHolder, 40));
        baseViewHolder.setText(i12, c27096v0Append2.m66906f(drawableM66510d2).append((CharSequence) listSplit$default2.get(1)));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return ViewExtKt.m66593x(viewInflate, C27029c.m66599b(context, TXVodDownloadDataSource.QUALITY_360P), C27029c.m66599b(context, C33556b3.f69047h), 0, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Bitmap m59856o(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            str = IShareService.f49268a.get().mo38d("");
        }
        Bitmap bitmapM66759b = C27060l0.m66759b(str, i11);
        Intrinsics.checkNotNullExpressionValue(bitmapM66759b, "createQRCode(...)");
        return bitmapM66759b;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Bitmap m59857p(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = C27029c.m66599b(C27059l.f54343a.m66757a(), 180);
        }
        return m59856o(str, i11);
    }

    /* JADX INFO: renamed from: q */
    public static final String m59858q(String str, String str2, String str3) {
        return (str2 == null || str2.length() == 0 || !m59854m(str2)) ? IShareService.f49268a.get().mo37a(str, str3) : m59866y(C27041f.m66668h(str2), str3);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m59860s(@Nullable final Context context, @NotNull final String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (context == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt.m59861t(context, packageName, booleanRef);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: u */
    public static final void m59862u() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt.m59863v();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59863v() {
        IKWebService.f55226a.get().mo67354a("onAppShareClicked");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m59864w() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt.m59865x();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m59865x() {
        IKWebService.f55226a.get().mo67354a("onAppShareExit");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final String m59866y(String str, String str2) {
        if (str == null) {
            return "";
        }
        if (!StringsKt.contains((CharSequence) str, (CharSequence) "rcode", true)) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("rcode", IShareService.f49268a.get().m59641b(str2)).build().toString();
        }
        return str == null ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final String m59867z(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM66899a = C27094u0.f54451a.m66899a(str);
            try {
                if (strM66899a != null) {
                    return StringsKt.replace$default(str, strM66899a, HostManager.a.r(strM66899a), false, 4, (Object) null);
                }
                Result.m103844constructorimpl(Unit.INSTANCE);
                return str;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        Throwable th4 = th;
        Result.Companion companion2 = Result.INSTANCE;
        Result.m103844constructorimpl(ResultKt.createFailure(th4));
        return str;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m59830C(Fragment fragment, Bitmap bitmap, ShareChannel shareChannel, Boolean bool) {
        if (bool.booleanValue()) {
            m59836I(fragment, bitmap, shareChannel);
        } else {
            ToastCompat.m66441G(fragment.getString(R$string.failed), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m59831D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final void m59833F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m59840M(Fragment fragment, String str, ShareChannel shareChannel) {
        Intent intentM6393f = C5292r.m6393f(str);
        intentM6393f.setFlags(32768);
        intentM6393f.setPackage(shareChannel.getPkgName());
        if (shareChannel.getClassName().length() > 0) {
            intentM6393f.setClassName(shareChannel.getPkgName(), shareChannel.getClassName());
        }
        fragment.startActivity(intentM6393f);
        m59862u();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final String m59859r(TextShareParam textShareParam) {
        String linkUrl = textShareParam.getLinkUrl();
        if (linkUrl != null) {
            if (!StringsKt.contains((CharSequence) linkUrl, (CharSequence) "utm_source", true)) {
                linkUrl = Uri.parse(linkUrl).buildUpon().appendQueryParameter("utm_source", textShareParam.getUtmSource()).build().toString();
            }
            if (linkUrl != null) {
                return linkUrl;
            }
            return "";
        }
        return "";
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m59861t(Context context, String str, Ref.BooleanRef booleanRef) {
        if (context.getPackageManager().getPackageInfo(str, 1) != null) {
            booleanRef.element = true;
        }
        return Unit.INSTANCE;
    }
}

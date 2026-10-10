package com.trtc.uikit.livekit.p180kc.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.user.api.IUserService;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import p445m2.AbstractC42392c;
import p460n2.InterfaceC42704b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCLiveShareHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;", "", "<init>", "()V", "shareLive", "", "context", "Landroid/content/Context;", "roomId", "", "createShareBitmap", "Landroid/graphics/Bitmap;", FirebaseAnalytics.Event.SHARE, "Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBitmapFromUrl", "url", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCLiveShareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCLiveShareHelper.kt\ncom/trtc/uikit/livekit/kc/share/KCLiveShareHelper\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,136:1\n426#2,11:137\n*S KotlinDebug\n*F\n+ 1 KCLiveShareHelper.kt\ncom/trtc/uikit/livekit/kc/share/KCLiveShareHelper\n*L\n117#1:137,11\n*E\n"})
public final class KCLiveShareHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCLiveShareHelper f79190a = new KCLiveShareHelper();

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.share.KCLiveShareHelper$a */
    /* JADX INFO: compiled from: KCLiveShareHelper.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/kc/share/KCLiveShareHelper$loadBitmapFromUrl$2$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadCleared", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "errorDrawable", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36422a extends AbstractC42392c<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC41708m<Bitmap> f79191e;

        /* JADX WARN: Multi-variable type inference failed */
        public C36422a(InterfaceC41708m<? super Bitmap> interfaceC41708m) {
            this.f79191e = interfaceC41708m;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f79191e.resumeWith(Result.m103844constructorimpl(resource));
        }

        @Override // p445m2.AbstractC42392c, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            this.f79191e.resumeWith(Result.m103844constructorimpl(null));
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: c */
        public void mo59882c(Drawable drawable) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m81578e(Context context, String str, Continuation<? super Bitmap> continuation) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).mo6621d().mo6601L0(str).m6591B0(new C36422a(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: renamed from: f */
    public final void m81579f(@NotNull final Context context, @NotNull final String roomId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.trtc.uikit.livekit.kc.share.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCLiveShareHelper.m81576g(context, roomId);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m81576g(Context context, String str) {
        C41696j.m91104d(C41713n0.m91126b(), null, null, new KCLiveShareHelper$shareLive$1$1(context, str, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final Object m81577d(Context context, LiveShareLink liveShareLink, Continuation<? super Bitmap> continuation) {
        return C41686h.m91049g(C41782z0.m91393c(), new KCLiveShareHelper$createShareBitmap$2(context, liveShareLink, null), continuation);
    }
}

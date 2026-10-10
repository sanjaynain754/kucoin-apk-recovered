package com.kubi.share.lib.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p445m2.AbstractC42392c;
import p460n2.InterfaceC42704b;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.utils.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ShareImageLoadTarget.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/share/lib/utils/ShareImageLoadTarget;", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/Bitmap;", "targetView", "Landroid/widget/ImageView;", ViewProps.MAX_HEIGHT, "", "contentView", "Landroid/view/View;", "maxWidthProvider", "Lkotlin/Function0;", "maxHeightProvider", "<init>", "(Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Integer;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadCleared", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/Drawable;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ShareImageLoadTarget extends AbstractC42392c<Bitmap> {

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ImageView f49535e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Integer f49536f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final View f49537g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Function0<Integer> f49538h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Function0<Integer> f49539i;

    public /* synthetic */ ShareImageLoadTarget(ImageView imageView, Integer num, View view, Function0 function0, Function0 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : view, (i11 & 8) != 0 ? null : function0, (i11 & 16) != 0 ? null : function1);
    }

    public ShareImageLoadTarget(@Nullable ImageView imageView, @Nullable Integer num, @Nullable View view, @Nullable Function0<Integer> function0, @Nullable Function0<Integer> function1) {
        this.f49535e = imageView;
        this.f49536f = num;
        this.f49537g = view;
        this.f49538h = function0;
        this.f49539i = function1;
    }

    /* JADX INFO: renamed from: j */
    public static final void m59881j(ShareImageLoadTarget shareImageLoadTarget, Bitmap bitmap) {
        Function0<Integer> function0 = shareImageLoadTarget.f49538h;
        int iIntValue = function0 != null ? function0.invoke().intValue() : 0;
        Function0<Integer> function1 = shareImageLoadTarget.f49539i;
        int iIntValue2 = function1 != null ? function1.invoke().intValue() : 0;
        View view = shareImageLoadTarget.f49537g;
        if (view == null || iIntValue <= 0 || iIntValue2 <= 0) {
            C24651u.m59890g(shareImageLoadTarget.f49535e, bitmap, null, shareImageLoadTarget.f49536f, 2, null);
        } else {
            C24651u.m59894k(shareImageLoadTarget.f49535e, bitmap, view, iIntValue, iIntValue2);
        }
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo6639e(@NotNull final Bitmap resource, @Nullable InterfaceC42704b<? super Bitmap> interfaceC42704b) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        ImageView imageView = this.f49535e;
        if (imageView != null) {
            imageView.post(new Runnable() { // from class: com.kubi.share.lib.utils.o
                @Override // java.lang.Runnable
                public final void run() {
                    ShareImageLoadTarget.m59881j(this.f49533b, resource);
                }
            });
        }
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: c */
    public void mo59882c(@Nullable Drawable drawable) {
    }
}

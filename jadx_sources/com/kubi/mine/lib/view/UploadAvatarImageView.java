package com.kubi.mine.lib.view;

import af0.AbstractC0306f;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.widget.upload.RxUpload;
import com.kubi.mine.R$drawable;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$mipmap;
import com.kubi.mine.R$string;
import com.kubi.mine.R$styleable;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import gq.C37998s;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: UploadAvatarImageView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\r\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J$\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\"\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\u0012\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/mine/lib/view/UploadAvatarImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/kubi/mine/databinding/UploadAvatarImageViewBinding;", "getViewBinding", "()Lcom/kubi/mine/databinding/UploadAvatarImageViewBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rotateAnimation", "Landroid/animation/ObjectAnimator;", "mUrl", "", "canEditAvatar", "", "Ljava/lang/Boolean;", "canSelectAvatar", "getUrl", "getCanEditAvatar", "()Ljava/lang/Boolean;", "getCanSelectAvatar", "applyAvatarSizePx", "", "widthPx", "heightPx", "setAvatarImage", "url", "isSkipMemoryCache", "isSkipDiskCache", "setAvatarStatus", "avatarStatus", "Lcom/kubi/mine/lib/view/AvatarStatus;", "upload", "realPath", "startLoading", "stopLoading", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadAvatarImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadAvatarImageView.kt\ncom/kubi/mine/lib/view/UploadAvatarImageView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,347:1\n52#2:348\n80#2,7:349\n91#3,14:356\n*S KotlinDebug\n*F\n+ 1 UploadAvatarImageView.kt\ncom/kubi/mine/lib/view/UploadAvatarImageView\n*L\n44#1:348\n44#1:349,7\n238#1:356,14\n*E\n"})
public final class UploadAvatarImageView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f35449b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ObjectAnimator f35450c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f35451d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Boolean f35452e;

    /* JADX INFO: renamed from: f */
    public boolean f35453f;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f35448h = {Reflection.property1(new PropertyReference1Impl(UploadAvatarImageView.class, "viewBinding", "getViewBinding()Lcom/kubi/mine/databinding/UploadAvatarImageViewBinding;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f35447g = new Companion(null);

    /* JADX INFO: compiled from: UploadAvatarImageView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mine/lib/view/UploadAvatarImageView$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_AVATAR_DP", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.view.UploadAvatarImageView$b */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 UploadAvatarImageView.kt\ncom/kubi/mine/lib/view/UploadAvatarImageView\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n92#3:125\n239#4,2:126\n93#5:128\n*E\n"})
    public static final class C19203b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f35454a;

        public C19203b(ImageView imageView) {
            this.f35454a = imageView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            this.f35454a.animate().rotation(360.0f).start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.view.UploadAvatarImageView$c */
    /* JADX INFO: compiled from: UploadAvatarImageView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017¨\u0006\u000b"}, m90084d2 = {"com/kubi/mine/lib/view/UploadAvatarImageView$upload$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19204c extends AbstractC0306f {
        public C19204c() {
        }

        @Override // af0.AbstractC0306f
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
            C44128b.m97259c("UploadAvatarImageView", "onUIProgressChanged: percent=" + f11);
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: h */
        public void mo1057h(long j11) {
            UploadAvatarImageView.this.m42374p();
            C44128b.m97259c("UploadAvatarImageView", "onUIProgressStart: totalBytes=" + j11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.view.UploadAvatarImageView$d */
    /* JADX INFO: compiled from: UploadAvatarImageView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/mine/lib/view/UploadAvatarImageView$upload$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19205d extends C24223c1 {
        public C19205d() {
            super(null);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            super.accept(throwable);
            UploadAvatarImageView.this.m42375r();
            ToastCompat.m66437C(R$string.upload_fail);
            C44128b.m97262f("UploadAvatarImageView", "upload onFailed:", throwable);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UploadAvatarImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.view.UploadAvatarImageView$a */
    /* JADX INFO: compiled from: UploadAvatarImageView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C19202a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarStatus.values().length];
            try {
                iArr[AvatarStatus.SHOW_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarStatus.EDITABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarStatus.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarStatus.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UploadAvatarImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m42365m(UploadAvatarImageView uploadAvatarImageView, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        uploadAvatarImageView.m42373l(str, z11, z12);
    }

    /* JADX INFO: renamed from: o */
    public static final void m42367o(boolean z11, GlideException glideException) {
        if (z11 || glideException == null) {
            return;
        }
        C44128b.m97262f("UploadAvatarImageView", "loadImagePreview glide load failed", glideException);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m42370u(UploadAvatarImageView uploadAvatarImageView, String str, String str2) {
        uploadAvatarImageView.f35451d = str2;
        uploadAvatarImageView.m42373l(str, true, true);
        C12572a.m23695d("event_update_avatar_image", null, 0L, 6, null);
        uploadAvatarImageView.m42375r();
        C44128b.m97259c("UploadAvatarImageView", "upload onComplete: " + str2);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getCanEditAvatar, reason: from getter */
    public final Boolean getF35452e() {
        return this.f35452e;
    }

    /* JADX INFO: renamed from: getCanSelectAvatar, reason: from getter */
    public final boolean getF35453f() {
        return this.f35453f;
    }

    @Nullable
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getF35451d() {
        return this.f35451d;
    }

    @Nullable
    public final C37998s getViewBinding() {
        return (C37998s) this.f35449b.getValue(this, f35448h[0]);
    }

    /* JADX INFO: renamed from: j */
    public final void m42372j(final int i11, final int i12) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.view.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadAvatarImageView.m42364k(this.f35467b, i11, i12);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m42373l(@Nullable final String str, final boolean z11, final boolean z12) {
        C37998s viewBinding;
        final ImageView imageView;
        if (str == null || (viewBinding = getViewBinding()) == null || (imageView = viewBinding.f85594b) == null) {
            return;
        }
        C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.view.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadAvatarImageView.m42366n(this.f35462b, str, imageView, z11, z12);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m42374p() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.view.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadAvatarImageView.m42368q(this.f35474b);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m42375r() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.view.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadAvatarImageView.m42369s(this.f35473b);
            }
        });
    }

    public final void setAvatarStatus(@NotNull AvatarStatus avatarStatus) {
        FrameLayout frameLayout;
        ImageView imageView;
        FrameLayout frameLayout2;
        ImageView imageView2;
        FrameLayout frameLayout3;
        ImageView imageView3;
        FrameLayout frameLayout4;
        Intrinsics.checkNotNullParameter(avatarStatus, "avatarStatus");
        int i11 = C19202a.$EnumSwitchMapping$0[avatarStatus.ordinal()];
        if (i11 == 1) {
            this.f35452e = Boolean.TRUE;
            C37998s viewBinding = getViewBinding();
            if (viewBinding != null && (imageView = viewBinding.f85597e) != null) {
                imageView.setImageResource(R$drawable.ic2_edit_16);
            }
            C37998s viewBinding2 = getViewBinding();
            if (viewBinding2 == null || (frameLayout = viewBinding2.f85596d) == null) {
                return;
            }
            C27046k.m66685H(frameLayout);
            return;
        }
        if (i11 == 2) {
            this.f35452e = Boolean.TRUE;
            C37998s viewBinding3 = getViewBinding();
            if (viewBinding3 != null && (imageView2 = viewBinding3.f85597e) != null) {
                imageView2.setImageResource(R$mipmap.ic_camera_mine);
            }
            C37998s viewBinding4 = getViewBinding();
            if (viewBinding4 == null || (frameLayout2 = viewBinding4.f85596d) == null) {
                return;
            }
            C27046k.m66685H(frameLayout2);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.f35452e = Boolean.FALSE;
            C37998s viewBinding5 = getViewBinding();
            if (viewBinding5 == null || (frameLayout4 = viewBinding5.f85596d) == null) {
                return;
            }
            C27046k.m66700o(frameLayout4);
            return;
        }
        this.f35452e = Boolean.FALSE;
        C37998s viewBinding6 = getViewBinding();
        if (viewBinding6 != null && (imageView3 = viewBinding6.f85597e) != null) {
            imageView3.setImageResource(R$mipmap.ic_lock_mine);
        }
        C37998s viewBinding7 = getViewBinding();
        if (viewBinding7 == null || (frameLayout3 = viewBinding7.f85596d) == null) {
            return;
        }
        C27046k.m66685H(frameLayout3);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: t */
    public final void m42376t(@Nullable final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Observable observableCompose = Observable.create(RxUpload.j(str, 3, new C19204c())).compose(C24217a1.m58387k());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.view.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAvatarImageView.m42370u(this.f35470b, str, (String) obj);
            }
        };
        observableCompose.subscribe(new Consumer() { // from class: com.kubi.mine.lib.view.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadAvatarImageView.m42371v(function1, obj);
            }
        }, new C19205d());
    }

    public /* synthetic */ UploadAvatarImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m42364k(UploadAvatarImageView uploadAvatarImageView, int i11, int i12) {
        ImageView imageView;
        FrameLayout frameLayout;
        C37998s viewBinding = uploadAvatarImageView.getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f85594b) != null) {
            C37998s viewBinding2 = uploadAvatarImageView.getViewBinding();
            if (viewBinding2 != null && (frameLayout = viewBinding2.f85595c) != null) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i11;
                    layoutParams.height = i12;
                    imageView.setLayoutParams(layoutParams);
                } else {
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
                }
                if (layoutParams2 != null) {
                    layoutParams2.width = i11;
                    layoutParams2.height = i12;
                    frameLayout.setLayoutParams(layoutParams2);
                } else {
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
                }
                imageView.requestLayout();
                frameLayout.requestLayout();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m42366n(UploadAvatarImageView uploadAvatarImageView, String str, ImageView imageView, boolean z11, boolean z12) {
        C24277v.m58538c(uploadAvatarImageView.getContext(), str, imageView, R$mipmap.icon_default_head, z11, z12, new C24277v.b() { // from class: com.kubi.mine.lib.view.h
            @Override // com.kubi.sdk.util.C24277v.b
            /* JADX INFO: renamed from: a */
            public final void mo29703a(boolean z13, GlideException glideException) {
                UploadAvatarImageView.m42367o(z13, glideException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m42368q(UploadAvatarImageView uploadAvatarImageView) {
        ImageView imageView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C37998s viewBinding = uploadAvatarImageView.getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f85598f) != null) {
            C37998s viewBinding2 = uploadAvatarImageView.getViewBinding();
            if (viewBinding2 != null && (frameLayout = viewBinding2.f85596d) != null) {
                C37998s viewBinding3 = uploadAvatarImageView.getViewBinding();
                if (viewBinding3 != null && (frameLayout2 = viewBinding3.f85595c) != null) {
                    C27046k.m66700o(frameLayout);
                    C27046k.m66685H(frameLayout2);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
                    uploadAvatarImageView.f35450c = objectAnimatorOfFloat;
                    if (objectAnimatorOfFloat != null) {
                        objectAnimatorOfFloat.setDuration(500L);
                    }
                    ObjectAnimator objectAnimator = uploadAvatarImageView.f35450c;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator2 = uploadAvatarImageView.f35450c;
                    if (objectAnimator2 != null) {
                        objectAnimator2.addListener(new C19203b(imageView));
                    }
                    ObjectAnimator objectAnimator3 = uploadAvatarImageView.f35450c;
                    if (objectAnimator3 != null) {
                        objectAnimator3.start();
                    }
                    uploadAvatarImageView.f35453f = false;
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m42369s(UploadAvatarImageView uploadAvatarImageView) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C37998s viewBinding = uploadAvatarImageView.getViewBinding();
        if (viewBinding != null && (frameLayout = viewBinding.f85596d) != null) {
            C37998s viewBinding2 = uploadAvatarImageView.getViewBinding();
            if (viewBinding2 != null && (frameLayout2 = viewBinding2.f85595c) != null) {
                C27046k.m66685H(frameLayout);
                C27046k.m66700o(frameLayout2);
                ObjectAnimator objectAnimator = uploadAvatarImageView.f35450c;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                uploadAvatarImageView.f35453f = true;
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m42371v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UploadAvatarImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35449b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37998s>() { // from class: com.kubi.mine.lib.view.UploadAvatarImageView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37998s invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37998s.m85871a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.upload_avatar_image_view, this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UploadAvatarImageView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                int i12 = (int) (80 * getResources().getDisplayMetrics().density);
                m42372j(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadAvatarImageView_avatarWidth, i12), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadAvatarImageView_avatarHeight, i12));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            int i13 = (int) (80 * getResources().getDisplayMetrics().density);
            m42372j(i13, i13);
        }
        this.f35453f = true;
    }
}

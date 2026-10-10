package com.kubi.kyc.ui;

import af0.AbstractC0306f;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kucoin.widget.upload.RxUpload;
import com.kubi.kyc.R$color;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$mipmap;
import com.kubi.kyc.R$string;
import com.kubi.resources.widget.CircleProgressTextView;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36892l;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: UploadImageView2.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ$\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010'\u001a\u00020(J\u001a\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010$\u001a\u00020\u0018H\u0007J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020+J\b\u0010/\u001a\u00020\u0015H\u0014J\b\u00100\u001a\u00020\u0015H\u0014R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/kyc/ui/UploadImageView2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/kyc/databinding/KycViewUploadImage2Binding;", "getBinding", "()Lcom/kubi/kyc/databinding/KycViewUploadImage2Binding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mUrl", "", "getMUrl", "()Ljava/lang/String;", "setMUrl", "(Ljava/lang/String;)V", "upload", "", "path", "kycType", "", "photoType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/kyc/ui/UploadImageView2$OnLoadListener;", "uploadStart", "Lcom/kubi/kucoin/widget/upload/RxUpload;", "getListener", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "load", "uri", "", "setIcon", "res", "setLabel", "text", "getLabelText", "", "showOK", TIMPushProvider.f75062n, "", "setIsActive", "isActive", "hasDetached", "onAttachedToWindow", "onDetachedFromWindow", "OnLoadListener", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadImageView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImageView2.kt\ncom/kubi/kyc/ui/UploadImageView2\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n52#2:176\n80#2,7:177\n1#3:184\n*S KotlinDebug\n*F\n+ 1 UploadImageView2.kt\ncom/kubi/kyc/ui/UploadImageView2\n*L\n31#1:176\n31#1:177,7\n*E\n"})
public final class UploadImageView2 extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f31363e = {Reflection.property1(new PropertyReference1Impl(UploadImageView2.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/KycViewUploadImage2Binding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f31364b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f31365c;

    /* JADX INFO: renamed from: d */
    public boolean f31366d;

    /* JADX INFO: renamed from: com.kubi.kyc.ui.UploadImageView2$a */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/ui/UploadImageView2$OnLoadListener;", "", "onComplete", "", "path", "", "onFailed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC17146a {
        /* JADX INFO: renamed from: a */
        void mo36998a(@Nullable String str);

        /* JADX INFO: renamed from: b */
        void mo36999b(@Nullable String str);
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.UploadImageView2$b */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/kyc/ui/UploadImageView2$getListener$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUploadImageView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImageView2.kt\ncom/kubi/kyc/ui/UploadImageView2$getListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
    public static final class C17147b extends AbstractC0306f {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f31368g;

        public C17147b(String str) {
            this.f31368g = str;
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
            FrameLayout frameLayout;
            CircleProgressTextView circleProgressTextView;
            CircleProgressTextView circleProgressTextView2;
            if (UploadImageView2.this.f31366d) {
                return;
            }
            int i11 = (int) (100 * f11);
            C36892l binding = UploadImageView2.this.getBinding();
            if (binding != null && (circleProgressTextView2 = binding.f81497n) != null) {
                circleProgressTextView2.setProgress(i11);
            }
            if (i11 == 100) {
                C36892l binding2 = UploadImageView2.this.getBinding();
                if (binding2 != null && (circleProgressTextView = binding2.f81497n) != null) {
                    circleProgressTextView.setProgress(99);
                }
            } else {
                C36892l binding3 = UploadImageView2.this.getBinding();
                if (binding3 != null && (frameLayout = binding3.f81494k) != null) {
                    frameLayout.setVisibility(0);
                }
            }
            C44128b.m97267k("UploadImageView2 onUIProgressChanged: " + f11);
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: h */
        public void mo1057h(long j11) {
            CircleProgressTextView circleProgressTextView;
            FrameLayout frameLayout;
            ImageView imageView;
            FrameLayout frameLayout2;
            ImageView imageView2;
            if (UploadImageView2.this.f31366d) {
                return;
            }
            if (UploadImageView2.this.getContext() instanceof Activity) {
                Context context = UploadImageView2.this.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isDestroyed()) {
                    return;
                }
                Context context2 = UploadImageView2.this.getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context2).isFinishing()) {
                    return;
                }
            }
            C36892l binding = UploadImageView2.this.getBinding();
            if (binding != null && (imageView2 = binding.f81489f) != null) {
                C46338a.m102151a(UploadImageView2.this.getContext()).mo6634v(this.f31368g).m6594E0(imageView2);
            }
            C36892l binding2 = UploadImageView2.this.getBinding();
            if (binding2 != null && (frameLayout2 = binding2.f81487d) != null) {
                frameLayout2.setVisibility(8);
            }
            C36892l binding3 = UploadImageView2.this.getBinding();
            if (binding3 != null && (imageView = binding3.f81485b) != null) {
                imageView.setVisibility(8);
            }
            C36892l binding4 = UploadImageView2.this.getBinding();
            if (binding4 != null && (frameLayout = binding4.f81494k) != null) {
                frameLayout.setVisibility(0);
            }
            C36892l binding5 = UploadImageView2.this.getBinding();
            if (binding5 != null && (circleProgressTextView = binding5.f81497n) != null) {
                circleProgressTextView.setProgress(0);
            }
            C44128b.m97267k("UploadImageView2 onUIProgressStart:");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.UploadImageView2$c */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/ui/UploadImageView2$uploadStart$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17148c extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC17146a f31370e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f31371f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17148c(InterfaceC17146a interfaceC17146a, String str) {
            super(null, false);
            this.f31370e = interfaceC17146a;
            this.f31371f = str;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            ImageView imageView;
            FrameLayout frameLayout;
            View view;
            FrameLayout frameLayout2;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            super.accept(throwable);
            if (UploadImageView2.this.f31366d) {
                return;
            }
            UploadImageView2.this.setMUrl(null);
            C36892l binding = UploadImageView2.this.getBinding();
            if (binding != null && (frameLayout2 = binding.f81487d) != null) {
                frameLayout2.setVisibility(0);
            }
            C36892l binding2 = UploadImageView2.this.getBinding();
            if (binding2 != null && (view = binding2.f81495l) != null) {
                view.setVisibility(0);
            }
            C36892l binding3 = UploadImageView2.this.getBinding();
            if (binding3 != null && (frameLayout = binding3.f81494k) != null) {
                frameLayout.setVisibility(8);
            }
            C36892l binding4 = UploadImageView2.this.getBinding();
            if (binding4 != null && (imageView = binding4.f81488e) != null) {
                imageView.setImageResource(R$mipmap.kucoin_icon_kyc_upload);
            }
            C36892l binding5 = UploadImageView2.this.getBinding();
            if (binding5 != null && (textView3 = binding5.f81490g) != null) {
                textView3.setText(R$string.upload_fail);
            }
            C36892l binding6 = UploadImageView2.this.getBinding();
            if (binding6 != null && (textView2 = binding6.f81490g) != null) {
                textView2.setTextSize(12.0f);
            }
            C36892l binding7 = UploadImageView2.this.getBinding();
            if (binding7 != null && (textView = binding7.f81490g) != null) {
                textView.setTextColor(ContextCompat.getColor(UploadImageView2.this.getContext(), R$color.complementary));
            }
            InterfaceC17146a interfaceC17146a = this.f31370e;
            if (interfaceC17146a != null) {
                interfaceC17146a.mo36998a(this.f31371f);
            }
            C44128b.m97267k("UploadImageView2 onFailed:");
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public final void m37103f(boolean z11) {
        m37099h(this, z11, 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31364b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36892l>() { // from class: com.kubi.kyc.ui.UploadImageView2$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36892l invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36892l.m82653a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.kyc_view_upload_image2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C36892l getBinding() {
        return (C36892l) this.f31364b.getValue(this, f31363e[0]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m37099h(UploadImageView2 uploadImageView2, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        uploadImageView2.m37104g(z11, i11);
    }

    /* JADX INFO: renamed from: k */
    public static final void m37100k(UploadImageView2 uploadImageView2, InterfaceC17146a interfaceC17146a, String str, String str2) {
        FrameLayout frameLayout;
        CircleProgressTextView circleProgressTextView;
        ImageView imageView;
        FrameLayout frameLayout2;
        if (uploadImageView2.f31366d) {
            return;
        }
        uploadImageView2.f31365c = str2;
        C36892l binding = uploadImageView2.getBinding();
        if (binding != null && (frameLayout2 = binding.f81487d) != null) {
            frameLayout2.setVisibility(8);
        }
        C36892l binding2 = uploadImageView2.getBinding();
        if (binding2 != null && (imageView = binding2.f81485b) != null) {
            imageView.setVisibility(8);
        }
        C36892l binding3 = uploadImageView2.getBinding();
        if (binding3 != null && (circleProgressTextView = binding3.f81497n) != null) {
            circleProgressTextView.setProgress(100);
        }
        C36892l binding4 = uploadImageView2.getBinding();
        if (binding4 != null && (frameLayout = binding4.f81494k) != null) {
            frameLayout.setVisibility(8);
        }
        if (interfaceC17146a != null) {
            interfaceC17146a.mo36999b(str);
        }
        C44128b.m97267k("UploadImageView2 onComplete:");
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0306f m37101d(String str) {
        return new C17147b(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m37102e(@NotNull Object uri) {
        C36892l binding;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            if (((Activity) context).isDestroyed()) {
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
            if (((Activity) context2).isFinishing()) {
                return;
            }
        }
        if (this.f31366d || (binding = getBinding()) == null || (imageView = binding.f81489f) == null) {
            return;
        }
        C46338a.m102151a(getContext()).mo6633u(uri).m6594E0(imageView);
    }

    @Nullable
    /* JADX INFO: renamed from: getMUrl, reason: from getter */
    public final String getF31365c() {
        return this.f31365c;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: j */
    public final void m37106j(final String str, RxUpload rxUpload, final InterfaceC17146a interfaceC17146a) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f31365c = null;
        Observable.create(rxUpload).compose(C24217a1.m58387k()).subscribe(new Consumer() { // from class: com.kubi.kyc.ui.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadImageView2.m37100k(this.f31583b, interfaceC17146a, str, (String) obj);
            }
        }, new C17148c(interfaceC17146a, str));
    }

    public final void setLabel(@NotNull String text) {
        TextView textView;
        Intrinsics.checkNotNullParameter(text, "text");
        C36892l binding = getBinding();
        if (binding == null || (textView = binding.f81490g) == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setMUrl(@Nullable String str) {
        this.f31365c = str;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public final void m37104g(boolean z11, int i11) {
        C36892l binding;
        ImageView imageView;
        ImageView imageView2;
        int i12;
        C36892l binding2 = getBinding();
        if (binding2 != null && (imageView2 = binding2.f81496m) != null) {
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView2.setVisibility(i12);
        }
        if (i11 != 0 && (binding = getBinding()) != null && (imageView = binding.f81496m) != null) {
            imageView.setImageResource(i11);
        }
    }

    @NotNull
    public final CharSequence getLabelText() {
        TextView textView;
        CharSequence text;
        C36892l binding = getBinding();
        if (binding != null && (textView = binding.f81490g) != null && (text = textView.getText()) != null) {
            return text;
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public final void m37105i(@Nullable String str, int i11, int i12, @Nullable InterfaceC17146a interfaceC17146a) {
        RxUpload rxUploadI = RxUpload.i(str, i11, i12, m37101d(str));
        Intrinsics.checkNotNullExpressionValue(rxUploadI, "start(...)");
        m37106j(str, rxUploadI, interfaceC17146a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31366d = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31366d = true;
    }

    public final void setIcon(int res) {
        ImageView imageView;
        C36892l binding = getBinding();
        if (binding != null && (imageView = binding.f81485b) != null) {
            imageView.setImageResource(res);
        }
    }

    public final void setIsActive(boolean isActive) {
        View view;
        C36892l binding = getBinding();
        if (binding != null && (view = binding.f81491h) != null) {
            view.setActivated(isActive);
        }
    }
}

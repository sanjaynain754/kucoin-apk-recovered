package com.kubi.user.view;

import af0.AbstractC0306f;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import c70.C4894r0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kucoin.widget.upload.RxUpload;
import com.kubi.resources.widget.CircleProgressTextView;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.user.R$color;
import com.kubi.user.R$id;
import com.kubi.user.R$layout;
import com.kubi.user.R$mipmap;
import com.kubi.user.R$string;
import com.kubi.user.view.UploadImageView2;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UploadImageView2.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J$\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020$J\u001a\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010 \u001a\u00020\u0014H\u0007J\u000e\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020'J\b\u0010+\u001a\u00020\u0011H\u0014J\b\u0010,\u001a\u00020\u0011H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010*\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/user/view/UploadImageView2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/user/databinding/BusercenterViewUploadImage2Binding;", "mUrl", "", "getMUrl", "()Ljava/lang/String;", "setMUrl", "(Ljava/lang/String;)V", "upload", "", "path", "kycType", "", "photoType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/user/view/UploadImageView2$OnLoadListener;", "uploadStart", "Lcom/kubi/kucoin/widget/upload/RxUpload;", "getListener", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "load", "uri", "", "setIcon", "res", "setLabel", "text", "getLabelText", "", "showOK", TIMPushProvider.f75062n, "", "setIsActive", "isActive", "hasDetached", "onAttachedToWindow", "onDetachedFromWindow", "OnLoadListener", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadImageView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImageView2.kt\ncom/kubi/user/view/UploadImageView2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class UploadImageView2 extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C4894r0 f53929b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f53930c;

    /* JADX INFO: renamed from: d */
    public boolean f53931d;

    /* JADX INFO: renamed from: com.kubi.user.view.UploadImageView2$a */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/user/view/UploadImageView2$OnLoadListener;", "", "onComplete", "", "path", "", "onFailed", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC26849a {
        /* JADX INFO: renamed from: a */
        void m65985a(@Nullable String str);

        /* JADX INFO: renamed from: b */
        void m65986b(@Nullable String str);
    }

    /* JADX INFO: renamed from: com.kubi.user.view.UploadImageView2$b */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/user/view/UploadImageView2$getListener$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUploadImageView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImageView2.kt\ncom/kubi/user/view/UploadImageView2$getListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
    public static final class C26850b extends AbstractC0306f {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f53933g;

        public C26850b(String str) {
            this.f53933g = str;
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
            FrameLayout frameLayout;
            CircleProgressTextView circleProgressTextView;
            CircleProgressTextView circleProgressTextView2;
            if (UploadImageView2.this.f53931d) {
                return;
            }
            int i11 = (int) (100 * f11);
            C4894r0 c4894r0 = UploadImageView2.this.f53929b;
            if (c4894r0 != null && (circleProgressTextView2 = c4894r0.f5301n) != null) {
                circleProgressTextView2.setProgress(i11);
            }
            if (i11 == 100) {
                C4894r0 c4894r1 = UploadImageView2.this.f53929b;
                if (c4894r1 != null && (circleProgressTextView = c4894r1.f5301n) != null) {
                    circleProgressTextView.setProgress(99);
                }
            } else {
                C4894r0 c4894r2 = UploadImageView2.this.f53929b;
                if (c4894r2 != null && (frameLayout = c4894r2.f5298k) != null) {
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
            if (UploadImageView2.this.f53931d) {
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
            C4894r0 c4894r0 = UploadImageView2.this.f53929b;
            if (c4894r0 != null && (imageView2 = c4894r0.f5293f) != null) {
                C46338a.m102151a(UploadImageView2.this.getContext()).mo6634v(this.f53933g).m6594E0(imageView2);
            }
            C4894r0 c4894r1 = UploadImageView2.this.f53929b;
            if (c4894r1 != null && (frameLayout2 = c4894r1.f5291d) != null) {
                frameLayout2.setVisibility(8);
            }
            C4894r0 c4894r2 = UploadImageView2.this.f53929b;
            if (c4894r2 != null && (imageView = c4894r2.f5289b) != null) {
                imageView.setVisibility(8);
            }
            C4894r0 c4894r3 = UploadImageView2.this.f53929b;
            if (c4894r3 != null && (frameLayout = c4894r3.f5298k) != null) {
                frameLayout.setVisibility(0);
            }
            C4894r0 c4894r4 = UploadImageView2.this.f53929b;
            if (c4894r4 != null && (circleProgressTextView = c4894r4.f5301n) != null) {
                circleProgressTextView.setProgress(0);
            }
            C44128b.m97267k("UploadImageView2 onUIProgressStart:");
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.view.UploadImageView2$c */
    /* JADX INFO: compiled from: UploadImageView2.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/view/UploadImageView2$uploadStart$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26851c extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC26849a f53935e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f53936f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26851c(InterfaceC26849a interfaceC26849a, String str) {
            super(null, false);
            this.f53935e = interfaceC26849a;
            this.f53936f = str;
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
            if (UploadImageView2.this.f53931d) {
                return;
            }
            UploadImageView2.this.setMUrl(null);
            C4894r0 c4894r0 = UploadImageView2.this.f53929b;
            if (c4894r0 != null && (frameLayout2 = c4894r0.f5291d) != null) {
                frameLayout2.setVisibility(0);
            }
            C4894r0 c4894r1 = UploadImageView2.this.f53929b;
            if (c4894r1 != null && (view = c4894r1.f5299l) != null) {
                view.setVisibility(0);
            }
            C4894r0 c4894r2 = UploadImageView2.this.f53929b;
            if (c4894r2 != null && (frameLayout = c4894r2.f5298k) != null) {
                frameLayout.setVisibility(8);
            }
            C4894r0 c4894r3 = UploadImageView2.this.f53929b;
            if (c4894r3 != null && (imageView = c4894r3.f5292e) != null) {
                imageView.setImageResource(R$mipmap.kucoin_icon_kyc_upload);
            }
            C4894r0 c4894r4 = UploadImageView2.this.f53929b;
            if (c4894r4 != null && (textView3 = c4894r4.f5294g) != null) {
                textView3.setText(R$string.upload_fail);
            }
            C4894r0 c4894r5 = UploadImageView2.this.f53929b;
            if (c4894r5 != null && (textView2 = c4894r5.f5294g) != null) {
                textView2.setTextSize(12.0f);
            }
            C4894r0 c4894r6 = UploadImageView2.this.f53929b;
            if (c4894r6 != null && (textView = c4894r6.f5294g) != null) {
                textView.setTextColor(ContextCompat.getColor(UploadImageView2.this.getContext(), R$color.complementary));
            }
            InterfaceC26849a interfaceC26849a = this.f53935e;
            if (interfaceC26849a != null) {
                interfaceC26849a.m65985a(this.f53936f);
            }
            C44128b.m97267k("UploadImageView2 onFailed:");
        }
    }

    public /* synthetic */ UploadImageView2(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.busercenter_view_upload_image2, this);
        this.f53929b = C4894r0.m5067a(findViewById(R$id.layoutRoot));
    }

    /* JADX INFO: renamed from: g */
    public static final void m65981g(UploadImageView2 uploadImageView2, InterfaceC26849a interfaceC26849a, String str, String str2) {
        FrameLayout frameLayout;
        CircleProgressTextView circleProgressTextView;
        ImageView imageView;
        FrameLayout frameLayout2;
        if (uploadImageView2.f53931d) {
            return;
        }
        uploadImageView2.f53930c = str2;
        C4894r0 c4894r0 = uploadImageView2.f53929b;
        if (c4894r0 != null && (frameLayout2 = c4894r0.f5291d) != null) {
            frameLayout2.setVisibility(8);
        }
        C4894r0 c4894r1 = uploadImageView2.f53929b;
        if (c4894r1 != null && (imageView = c4894r1.f5289b) != null) {
            imageView.setVisibility(8);
        }
        C4894r0 c4894r2 = uploadImageView2.f53929b;
        if (c4894r2 != null && (circleProgressTextView = c4894r2.f5301n) != null) {
            circleProgressTextView.setProgress(100);
        }
        C4894r0 c4894r3 = uploadImageView2.f53929b;
        if (c4894r3 != null && (frameLayout = c4894r3.f5298k) != null) {
            frameLayout.setVisibility(8);
        }
        if (interfaceC26849a != null) {
            interfaceC26849a.m65986b(str);
        }
        C44128b.m97267k("UploadImageView2 onComplete:");
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0306f m65982d(String str) {
        return new C26850b(str);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: f */
    public final void m65984f(final String str, RxUpload rxUpload, final InterfaceC26849a interfaceC26849a) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f53930c = null;
        Observable.create(rxUpload).compose(C24217a1.m58387k()).subscribe(new Consumer() { // from class: m70.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadImageView2.m65981g(this.f94071b, interfaceC26849a, str, (String) obj);
            }
        }, new C26851c(interfaceC26849a, str));
    }

    @NotNull
    public final CharSequence getLabelText() {
        TextView textView;
        CharSequence text;
        C4894r0 c4894r0 = this.f53929b;
        return (c4894r0 == null || (textView = c4894r0.f5294g) == null || (text = textView.getText()) == null) ? "" : text;
    }

    @Nullable
    /* JADX INFO: renamed from: getMUrl, reason: from getter */
    public final String getF53930c() {
        return this.f53930c;
    }

    public final void setIcon(int res) {
        ImageView imageView;
        C4894r0 c4894r0 = this.f53929b;
        if (c4894r0 == null || (imageView = c4894r0.f5289b) == null) {
            return;
        }
        imageView.setImageResource(res);
    }

    public final void setIsActive(boolean isActive) {
        View view;
        C4894r0 c4894r0 = this.f53929b;
        if (c4894r0 == null || (view = c4894r0.f5295h) == null) {
            return;
        }
        view.setActivated(isActive);
    }

    public final void setLabel(@NotNull String text) {
        TextView textView;
        Intrinsics.checkNotNullParameter(text, "text");
        C4894r0 c4894r0 = this.f53929b;
        if (c4894r0 == null || (textView = c4894r0.f5294g) == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setMUrl(@Nullable String str) {
        this.f53930c = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m65983e(@Nullable String str, @Nullable InterfaceC26849a interfaceC26849a) {
        RxUpload rxUploadK = RxUpload.k(str, m65982d(str));
        Intrinsics.checkNotNullExpressionValue(rxUploadK, "start(...)");
        m65984f(str, rxUploadK, interfaceC26849a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53931d = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53931d = true;
    }
}

package com.kubi.kyc.ui.kycv2;

import af0.AbstractC0306f;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kucoin.widget.upload.RxUpload;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.extensions.core.C27029c;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.C4781a0;
import p205dn.C36889i;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UploadImageView3.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J$\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/UploadImageView3;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/kyc/databinding/BusercenterViewUploadImagev2NewBinding;", "mUrl", "", "getMUrl", "()Ljava/lang/String;", "setMUrl", "(Ljava/lang/String;)V", "upload", "", "path", "kycType", "", "photoType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/kyc/ui/kycv2/UploadImageView3$OnLoadListener;", "uploadStart", "Lcom/kubi/kucoin/widget/upload/RxUpload;", "getListener", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "load", "uri", "", "OnLoadListener", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UploadImageView3 extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C36889i f31431b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f31432c;

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.UploadImageView3$a */
    /* JADX INFO: compiled from: UploadImageView3.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/UploadImageView3$OnLoadListener;", "", "onComplete", "", "path", "", "onFailed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC17185a {
        /* JADX INFO: renamed from: a */
        void mo37146a(@Nullable String str);

        /* JADX INFO: renamed from: b */
        void mo37147b(@Nullable String str);
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.UploadImageView3$b */
    /* JADX INFO: compiled from: UploadImageView3.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/UploadImageView3$getListener$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17186b extends AbstractC0306f {
        public C17186b() {
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: h */
        public void mo1057h(long j11) {
            if (UploadImageView3.this.getContext() instanceof Activity) {
                Context context = UploadImageView3.this.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isDestroyed()) {
                    return;
                }
                Context context2 = UploadImageView3.this.getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context2).isFinishing();
            }
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.UploadImageView3$c */
    /* JADX INFO: compiled from: UploadImageView3.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/UploadImageView3$uploadStart$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17187c extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC17185a f31435e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f31436f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17187c(InterfaceC17185a interfaceC17185a, String str) {
            super(null, true);
            this.f31435e = interfaceC17185a;
            this.f31436f = str;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            super.accept(throwable);
            UploadImageView3.this.setMUrl(null);
            InterfaceC17185a interfaceC17185a = this.f31435e;
            if (interfaceC17185a != null) {
                interfaceC17185a.mo37146a(this.f31436f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.busercenter_view_upload_imagev2_new, this);
        this.f31431b = C36889i.m82647a(findViewById(R$id.layoutRootU3));
    }

    /* JADX INFO: renamed from: f */
    public static final void m37192f(UploadImageView3 uploadImageView3, InterfaceC17185a interfaceC17185a, String str, String str2) {
        uploadImageView3.f31432c = str2;
        if (interfaceC17185a != null) {
            interfaceC17185a.mo37147b(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0306f m37193b(String str) {
        return new C17186b();
    }

    /* JADX INFO: renamed from: c */
    public final void m37194c(@NotNull Object uri) {
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
        C36889i c36889i = this.f31431b;
        if (c36889i == null || (imageView = c36889i.f81471b) == null) {
            return;
        }
        C46338a.m102151a(getContext()).mo6633u(uri).mo6606a(C42032f.m92235s0(new C4781a0(C27029c.m66601d(this, 8)))).m6594E0(imageView);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: e */
    public final void m37196e(final String str, RxUpload rxUpload, final InterfaceC17185a interfaceC17185a) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f31432c = null;
        Observable.create(rxUpload).compose(C24217a1.m58387k()).subscribe(new Consumer() { // from class: com.kubi.kyc.ui.kycv2.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadImageView3.m37192f(this.f31533b, interfaceC17185a, str, (String) obj);
            }
        }, new C17187c(interfaceC17185a, str));
    }

    @Nullable
    /* JADX INFO: renamed from: getMUrl, reason: from getter */
    public final String getF31432c() {
        return this.f31432c;
    }

    public final void setMUrl(@Nullable String str) {
        this.f31432c = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m37195d(@Nullable String str, int i11, int i12, @Nullable InterfaceC17185a interfaceC17185a) {
        RxUpload rxUploadI = RxUpload.i(str, i11, i12, m37193b(str));
        Intrinsics.checkNotNullExpressionValue(rxUploadI, "start(...)");
        m37196e(str, rxUploadI, interfaceC17185a);
    }
}

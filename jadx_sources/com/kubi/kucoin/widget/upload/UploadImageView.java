package com.kubi.kucoin.widget.upload;

import af0.AbstractC0306f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.kubi.app.widget.R$drawable;
import com.kubi.app.widget.R$layout;
import com.kubi.app.widget.R$mipmap;
import com.kubi.app.widget.R$string;
import com.kubi.app.widget.R$styleable;
import com.kubi.kucoin.widget.upload.UploadImageView;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.ToastCompat;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p493oa.C43004a;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: UploadImageView.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u001e\u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\nJ\u0010\u0010 \u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\nJ\u001c\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0007R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/widget/upload/UploadImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/kubi/app/widget/databinding/AppWidgetViewUploadImageBinding;", "getViewBinding", "()Lcom/kubi/app/widget/databinding/AppWidgetViewUploadImageBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mUrl", "", "getmUrl", "initAttributes", "", "init", "setIconBackgroundParams", "width", "height", "setIconLayoutParams", "setIconImage", "id", "setIconLabel", "text", "setIconBackground", "setPath", "path", "loginToken", "LAppWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImageView.kt\ncom/kubi/kucoin/widget/upload/UploadImageView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,158:1\n52#2:159\n80#2,7:160\n*S KotlinDebug\n*F\n+ 1 UploadImageView.kt\ncom/kubi/kucoin/widget/upload/UploadImageView\n*L\n28#1:159\n28#1:160,7\n*E\n"})
public final class UploadImageView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f28645d = {Reflection.property1(new PropertyReference1Impl(UploadImageView.class, "viewBinding", "getViewBinding()Lcom/kubi/app/widget/databinding/AppWidgetViewUploadImageBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f28646b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f28647c;

    /* JADX INFO: renamed from: com.kubi.kucoin.widget.upload.UploadImageView$a */
    /* JADX INFO: compiled from: UploadImageView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017¨\u0006\u000b"}, m90084d2 = {"com/kubi/kucoin/widget/upload/UploadImageView$setPath$1$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "LAppWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15760a extends AbstractC0306f {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C43004a f28648f;

        public C15760a(C43004a c43004a) {
            this.f28648f = c43004a;
        }

        @Override // af0.AbstractC0306f
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
            TextView textView = this.f28648f.f95162f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (f11 * 100));
            sb2.append('%');
            textView.setText(sb2.toString());
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: h */
        public void mo1057h(long j11) {
            this.f28648f.f95162f.setVisibility(0);
            this.f28648f.f95162f.setText("0%");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.widget.upload.UploadImageView$b */
    /* JADX INFO: compiled from: UploadImageView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/widget/upload/UploadImageView$setPath$1$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "LAppWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15761b extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C43004a f28649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15761b(C43004a c43004a) {
            super(null);
            this.f28649d = c43004a;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            super.accept(throwable);
            ToastCompat.m66437C(R$string.upload_fail);
            this.f28649d.f95162f.setVisibility(8);
            this.f28649d.f95161e.setVisibility(0);
            this.f28649d.f95159c.setImageResource(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28646b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C43004a>() { // from class: com.kubi.kucoin.widget.upload.UploadImageView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43004a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C43004a.m94434a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.app_widget_view_upload_image, this);
        m33234c();
    }

    public final void setIconLabel(@Nullable String text) {
        TextView textView;
        C43004a viewBinding = getViewBinding();
        if (viewBinding == null || (textView = viewBinding.f95163g) == null) {
            return;
        }
        textView.setText(text);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m33232h(C43004a c43004a, UploadImageView uploadImageView, String str) {
        c43004a.f95162f.setVisibility(8);
        uploadImageView.f28647c = str;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m33234c() {
        setBackgroundResource(R$drawable.shape_border_emphasis8_4r);
    }

    /* JADX INFO: renamed from: d */
    public final void m33235d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UploadImageView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setIconLabel(typedArrayObtainStyledAttributes.getString(R$styleable.UploadImageView_iconLabel));
        setIconBackground(typedArrayObtainStyledAttributes.getResourceId(R$styleable.UploadImageView_iconBackground, R$mipmap.upload_ic_card_front));
        m33236e(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadImageView_iconBackgroundWidth, 200), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadImageView_iconBackgroundHeight, 130));
        m33237f(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadImageView_iconWidth, 46), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UploadImageView_iconHeight, 46));
        setIconImage(typedArrayObtainStyledAttributes.getResourceId(R$styleable.UploadImageView_iconImage, R$mipmap.icon_take_photo));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Nullable
    public final C43004a getViewBinding() {
        return (C43004a) this.f28646b.getValue(this, f28645d[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: getmUrl, reason: from getter */
    public final String getF28647c() {
        return this.f28647c;
    }

    public final void setIconLabel(@StringRes int id2) {
        TextView textView;
        C43004a viewBinding = getViewBinding();
        if (viewBinding == null || (textView = viewBinding.f95163g) == null) {
            return;
        }
        textView.setText(getContext().getString(id2));
    }

    /* JADX INFO: renamed from: i */
    public static final void m33233i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m33236e(int i11, int i12) {
        C43004a viewBinding = getViewBinding();
        if (viewBinding != null) {
            ViewGroup.LayoutParams layoutParams = viewBinding.f95160d.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = i11;
            layoutParams2.height = i12;
            viewBinding.f95160d.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33237f(int i11, int i12) {
        C43004a viewBinding = getViewBinding();
        if (viewBinding != null) {
            ViewGroup.LayoutParams layoutParams = viewBinding.f95158b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i11;
            layoutParams2.height = i12;
            viewBinding.f95158b.setLayoutParams(layoutParams2);
        }
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public final void m33238g(@Nullable String str, @Nullable String str2) {
        final C43004a viewBinding;
        if (!TextUtils.isEmpty(str) && (viewBinding = getViewBinding()) != null) {
            viewBinding.f95161e.setVisibility(8);
            viewBinding.f95160d.setVisibility(8);
            C46338a.m102151a(getContext()).mo6634v(str).m6594E0(viewBinding.f95159c);
            Observable observableCompose = Observable.create(RxUpload.l(str, str2, new C15760a(viewBinding))).compose(C24217a1.m58387k());
            final Function1 function1 = new Function1() { // from class: vl.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UploadImageView.m33232h(viewBinding, this, (String) obj);
                }
            };
            observableCompose.subscribe(new Consumer() { // from class: vl.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    UploadImageView.m33233i(function1, obj);
                }
            }, new C15761b(viewBinding));
        }
    }

    public final void setIconBackground(@DrawableRes int id2) {
        ImageView imageView;
        C43004a viewBinding = getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f95160d) != null) {
            imageView.setBackgroundResource(id2);
        }
    }

    public final void setIconImage(@DrawableRes int id2) {
        ImageView imageView;
        C43004a viewBinding = getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f95158b) != null) {
            imageView.setBackgroundResource(id2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28646b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C43004a>() { // from class: com.kubi.kucoin.widget.upload.UploadImageView$special$$inlined$customViewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43004a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C43004a.m94434a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.app_widget_view_upload_image, this);
        m33234c();
        m33235d(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28646b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C43004a>() { // from class: com.kubi.kucoin.widget.upload.UploadImageView$special$$inlined$customViewBinding$3
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43004a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C43004a.m94434a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.app_widget_view_upload_image, this);
        m33234c();
        m33235d(context, attributeSet);
    }
}

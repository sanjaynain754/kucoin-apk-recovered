package com.kubi.assets.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.api.IUserService;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.InterfaceC42031e;
import p445m2.InterfaceC42399j;
import p637ta.C44852r1;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: CountryCodeViewLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/view/CountryCodeViewLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetLayoutAddCountryCodeBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetLayoutAddCountryCodeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getCountryCodeTextView", "Landroid/widget/TextView;", "loadFlagIcon", "", "iconUrl", "", "loadIconBycountryCode", "sceneCode", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountryCodeViewLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryCodeViewLayout.kt\ncom/kubi/assets/view/CountryCodeViewLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,89:1\n41#2:90\n65#2:91\n80#2,7:92\n*S KotlinDebug\n*F\n+ 1 CountryCodeViewLayout.kt\ncom/kubi/assets/view/CountryCodeViewLayout\n*L\n24#1:90\n24#1:91\n24#1:92,7\n*E\n"})
public final class CountryCodeViewLayout extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f19088c = {Reflection.property1(new PropertyReference1Impl(CountryCodeViewLayout.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetLayoutAddCountryCodeBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f19089b;

    /* JADX INFO: renamed from: com.kubi.assets.view.CountryCodeViewLayout$a */
    /* JADX INFO: compiled from: CountryCodeViewLayout.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/assets/view/CountryCodeViewLayout$loadFlagIcon$1$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", InterfaceC33617e1.f69660i, KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/bumptech/glide/load/DataSource;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11239a implements InterfaceC42031e<Drawable> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C44852r1 f19090b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CountryCodeViewLayout f19091c;

        public C11239a(C44852r1 c44852r1, CountryCodeViewLayout countryCodeViewLayout) {
            this.f19090b = c44852r1;
            this.f19091c = countryCodeViewLayout;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(Drawable drawable, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, DataSource dataSource, boolean z11) {
            this.f19090b.f100720b.setImageTintList(null);
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(GlideException glideException, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, boolean z11) {
            this.f19090b.f100720b.setImageTintList(ContextCompat.getColorStateList(this.f19091c.getContext(), R$color.c_icon60));
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryCodeViewLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f19089b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44852r1>() { // from class: com.kubi.assets.view.CountryCodeViewLayout$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44852r1 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44852r1.m99229a(C45682f.m100801b(viewGroup));
            }
        });
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.asset_layout_add_country_code, this);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20012d(CountryCodeViewLayout countryCodeViewLayout, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        countryCodeViewLayout.m20015c(str);
    }

    private final C44852r1 getBinding() {
        return (C44852r1) this.f19089b.getValue(this, f19088c[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m20015c(@Nullable String str) {
        BaseTextView baseTextView;
        IUserService iUserServiceM19189j = AssetsDepend.f18689a.m19189j();
        C44852r1 binding = getBinding();
        iUserServiceM19189j.s0(String.valueOf((binding == null || (baseTextView = binding.f100721c) == null) ? null : baseTextView.getText()), str, new Function1() { // from class: com.kubi.assets.view.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CountryCodeViewLayout.m20013e(this.f19137b, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m20013e(CountryCodeViewLayout countryCodeViewLayout, String str) {
        countryCodeViewLayout.m20014b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m20014b(@Nullable String str) {
        Object objM103844constructorimpl;
        C44852r1 binding = getBinding();
        if (binding != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (str != null && str.length() != 0 && !StringsKt.endsWith(str, "cn.png", true)) {
                    C46340c<Drawable> c46340cMo6634v = C46338a.m102152b(binding.f100720b).mo6634v(str);
                    int i11 = R$drawable.ic2_language_16;
                    objM103844constructorimpl = Result.m103844constructorimpl(c46340cMo6634v.mo92188b0(i11).mo92208m(i11).mo6596G0(new C11239a(binding, this)).m6594E0(binding.f100720b));
                    if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                        binding.f100720b.setImageResource(R$drawable.ic2_language_16);
                        binding.f100720b.setImageTintList(ContextCompat.getColorStateList(getContext(), R$color.c_icon60));
                    }
                    Result.m103843boximpl(objM103844constructorimpl);
                    return;
                }
                ImageView imageView = binding.f100720b;
                if (imageView != null) {
                    imageView.setImageResource(R$drawable.ic2_language_16);
                }
                binding.f100720b.setImageTintList(ContextCompat.getColorStateList(getContext(), R$color.c_icon60));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    @Nullable
    public final TextView getCountryCodeTextView() {
        C44852r1 binding = getBinding();
        if (binding != null) {
            return binding.f100721c;
        }
        return null;
    }
}

package com.kubi.kucoin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.kucoin.CountryCodeViewLayout;
import com.kubi.kucoin.data.MobileCodeUtils;
import com.kubi.kucoin.data.OpenCountryCodeFromWhereEnum;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import ma.C42496b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45583m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: CountryCodeViewLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u0015R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/CountryCodeViewLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "safeLayoutAddCountryCodeBinding", "Lcom/kubi/app/country/databinding/SafeLayoutAddCountryCodeBinding;", "getSafeLayoutAddCountryCodeBinding", "()Lcom/kubi/app/country/databinding/SafeLayoutAddCountryCodeBinding;", "safeLayoutAddCountryCodeBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromWhereType", "Lcom/kubi/kucoin/data/OpenCountryCodeFromWhereEnum;", "getCountryCodeTextView", "Landroid/widget/TextView;", "getCountryImageView", "Landroid/widget/ImageView;", "loadFlagForMobileCode", "", "sceneCode", "", "fromWherePage", "fromWhere", "disable", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountryCodeViewLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryCodeViewLayout.kt\ncom/kubi/kucoin/CountryCodeViewLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,94:1\n41#2:95\n65#2:96\n80#2,7:97\n*S KotlinDebug\n*F\n+ 1 CountryCodeViewLayout.kt\ncom/kubi/kucoin/CountryCodeViewLayout\n*L\n27#1:95\n27#1:96\n27#1:97,7\n*E\n"})
public final class CountryCodeViewLayout extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f27592d = {Reflection.property1(new PropertyReference1Impl(CountryCodeViewLayout.class, "safeLayoutAddCountryCodeBinding", "getSafeLayoutAddCountryCodeBinding()Lcom/kubi/app/country/databinding/SafeLayoutAddCountryCodeBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f27593b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public OpenCountryCodeFromWhereEnum f27594c;

    /* JADX INFO: renamed from: c */
    public final void m31918c() {
        setEnabled(false);
        TextView countryCodeTextView = getCountryCodeTextView();
        if (countryCodeTextView != null) {
            C27017c c27017c = C27017c.f54310a;
            int i11 = com.kubi.app.country.R$color.c_text30;
            countryCodeTextView.setTextColor(c27017c.m66512a(i11));
            C27046k.m66702q(countryCodeTextView, c27017c.m66512a(i11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryCodeViewLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f27593b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42496b>() { // from class: com.kubi.kucoin.CountryCodeViewLayout$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42496b invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42496b.m93181a(C45682f.m100801b(viewGroup));
            }
        });
        this.f27594c = OpenCountryCodeFromWhereEnum.COMMONINTERFACEPAGE;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.kubi.app.country.R$layout.safe_layout_add_country_code, this);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m31916f(final CountryCodeViewLayout countryCodeViewLayout, final CountryEntity countryEntity) {
        C27100x0.m66923d(new Function0() { // from class: vk.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountryCodeViewLayout.m31917g(countryEntity, countryCodeViewLayout);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m31917g(CountryEntity countryEntity, CountryCodeViewLayout countryCodeViewLayout) {
        ImageView imageView;
        String ico;
        ImageView imageView2;
        if (countryEntity == null || Intrinsics.areEqual(countryEntity.getCode(), "CN") || ((ico = countryEntity.getIco()) != null && StringsKt.endsWith(ico, "cn.png", true))) {
            C42496b safeLayoutAddCountryCodeBinding = countryCodeViewLayout.getSafeLayoutAddCountryCodeBinding();
            if (safeLayoutAddCountryCodeBinding != null && (imageView = safeLayoutAddCountryCodeBinding.f94158b) != null) {
                imageView.setImageResource(com.kubi.app.country.R$drawable.ic_language_16);
            }
            return Unit.INSTANCE;
        }
        C42496b safeLayoutAddCountryCodeBinding2 = countryCodeViewLayout.getSafeLayoutAddCountryCodeBinding();
        if (safeLayoutAddCountryCodeBinding2 != null && (imageView2 = safeLayoutAddCountryCodeBinding2.f94158b) != null) {
            C45583m0.m100623f(imageView2, countryEntity.getIco());
        }
        return Unit.INSTANCE;
    }

    private final C42496b getSafeLayoutAddCountryCodeBinding() {
        return (C42496b) this.f27593b.getValue(this, f27592d[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m31919d(@NotNull OpenCountryCodeFromWhereEnum fromWhere) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        Intrinsics.checkNotNullParameter(fromWhere, "fromWhere");
        this.f27594c = fromWhere;
        C42496b safeLayoutAddCountryCodeBinding = getSafeLayoutAddCountryCodeBinding();
        ViewGroup.LayoutParams layoutParams = (safeLayoutAddCountryCodeBinding == null || (textView = safeLayoutAddCountryCodeBinding.f94159c) == null) ? null : textView.getLayoutParams();
        if (this.f27594c != OpenCountryCodeFromWhereEnum.COMMONINTERFACEPAGE) {
            if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                ((LinearLayout.LayoutParams) layoutParams).setMarginStart(C5275i0.m6236a(11.0f));
            }
            C42496b safeLayoutAddCountryCodeBinding2 = getSafeLayoutAddCountryCodeBinding();
            if (safeLayoutAddCountryCodeBinding2 == null || (imageView2 = safeLayoutAddCountryCodeBinding2.f94158b) == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(C5275i0.m6236a(0.0f));
        }
        C42496b safeLayoutAddCountryCodeBinding3 = getSafeLayoutAddCountryCodeBinding();
        if (safeLayoutAddCountryCodeBinding3 == null || (imageView = safeLayoutAddCountryCodeBinding3.f94158b) == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    /* JADX INFO: renamed from: e */
    public final void m31920e(@Nullable String str) {
        ImageView imageView;
        Object tag;
        TextView textView;
        C42496b safeLayoutAddCountryCodeBinding = getSafeLayoutAddCountryCodeBinding();
        if (safeLayoutAddCountryCodeBinding != null && (imageView = safeLayoutAddCountryCodeBinding.f94158b) != null && imageView.getVisibility() == 0) {
            C42496b safeLayoutAddCountryCodeBinding2 = getSafeLayoutAddCountryCodeBinding();
            if (safeLayoutAddCountryCodeBinding2 != null && (textView = safeLayoutAddCountryCodeBinding2.f94159c) != null) {
                tag = textView.getTag();
            } else {
                tag = null;
            }
            String strValueOf = String.valueOf(tag);
            Intrinsics.checkNotNullExpressionValue(strValueOf, "valueOf(...)");
            MobileCodeUtils.m31956g(strValueOf, str, new Function1() { // from class: vk.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CountryCodeViewLayout.m31916f(this.f102672b, (CountryEntity) obj);
                }
            });
        }
    }

    @Nullable
    public final TextView getCountryCodeTextView() {
        C42496b safeLayoutAddCountryCodeBinding = getSafeLayoutAddCountryCodeBinding();
        if (safeLayoutAddCountryCodeBinding != null) {
            return safeLayoutAddCountryCodeBinding.f94159c;
        }
        return null;
    }

    @Nullable
    public final ImageView getCountryImageView() {
        C42496b safeLayoutAddCountryCodeBinding = getSafeLayoutAddCountryCodeBinding();
        if (safeLayoutAddCountryCodeBinding != null) {
            return safeLayoutAddCountryCodeBinding.f94158b;
        }
        return null;
    }
}

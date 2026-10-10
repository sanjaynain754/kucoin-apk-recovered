package com.kubi.spot.business.delegation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$color;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.view.ChooseSymbolView;
import com.kubi.spot.entity.MarginSymbol;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27046k;
import e20.InterfaceC37053d;
import gf.C37890n;
import gf.InterfaceC37888l;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import t20.C44673w0;
import w00.C45682f;

/* JADX INFO: compiled from: ChooseSymbolView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010(\u001a\u00020#H\u0003J$\u0010)\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\u000e\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020#H\u0014J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001fX\u0082.¢\u0006\u0002\n\u0000R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00068"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/view/ChooseSymbolView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeLinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/spot/databinding/SpotViewChooseSymbolBinding;", "getBinding", "()Lcom/kubi/spot/databinding/SpotViewChooseSymbolBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "srcData", "Ljava/util/ArrayList;", "Lcom/kubi/spot/business/delegation/view/ChooseSymbolView$FilterChooseData;", "Lkotlin/collections/ArrayList;", "disPlay", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketApi", "()Lcom/kubi/spot/api/MarketApi;", "marketApi$delegate", "Lkotlin/Lazy;", "saveShowAllItemVisibleState", "Ljava/lang/Integer;", "value", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "onSelectCallback", "Lkotlin/Function1;", "", "getOnSelectCallback", "()Lkotlin/jvm/functions/Function1;", "setOnSelectCallback", "(Lkotlin/jvm/functions/Function1;)V", "initView", "setCustomData", "data", "", "supportSearch", "", "supportSearchAll", "getSrcData", "tradeType", "", "onAttachedToWindow", "doSearch", "toString", "hideTvChooseVisible", "restoreTvChooseVisible", "FilterChooseData", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChooseSymbolView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseSymbolView.kt\ncom/kubi/spot/business/delegation/view/ChooseSymbolView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n41#2:256\n65#2:257\n80#2,7:258\n1869#3,2:265\n1563#3:267\n1634#3,3:268\n774#3:271\n865#3,2:272\n1563#3:274\n1634#3,3:275\n1869#3:278\n774#3:279\n865#3,2:280\n1563#3:282\n1634#3,3:283\n1870#3:286\n*S KotlinDebug\n*F\n+ 1 ChooseSymbolView.kt\ncom/kubi/spot/business/delegation/view/ChooseSymbolView\n*L\n45#1:256\n45#1:257\n45#1:258,7\n73#1:265,2\n125#1:267\n125#1:268,3\n143#1:271\n143#1:272,2\n143#1:274\n143#1:275,3\n157#1:278\n158#1:279\n158#1:280,2\n164#1:282\n164#1:283,3\n157#1:286\n*E\n"})
public final class ChooseSymbolView extends ShapeLinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f50110k = {Reflection.property1(new PropertyReference1Impl(ChooseSymbolView.class, "binding", "getBinding()Lcom/kubi/spot/databinding/SpotViewChooseSymbolBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f50111d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ArrayList<FilterChooseData> f50112e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ArrayList<FilterChooseData> f50113f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f50114g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Integer f50115h;

    /* JADX INFO: renamed from: i */
    public BaseQuickAdapter<FilterChooseData, BaseViewHolder> f50116i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super FilterChooseData, Unit> f50117j;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.view.ChooseSymbolView$a, reason: from toString */
    /* JADX INFO: compiled from: ChooseSymbolView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/view/ChooseSymbolView$FilterChooseData;", "", "name", "", "code", "iconUrl", "fullName", "isChecked", "", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/data/entity/SymbolInfoEntity;)V", "getName", "()Ljava/lang/String;", "getCode", "getIconUrl", "getFullName", "()Z", "setChecked", "(Z)V", "getSymbolInfoEntity", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FilterChooseData {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String code;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String fullName;

        /* JADX INFO: renamed from: e, reason: from toString */
        public boolean isChecked;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final SymbolInfoEntity symbolInfoEntity;

        public FilterChooseData(@NotNull String name, @NotNull String code, @Nullable String str, @Nullable String str2, boolean z11, @Nullable SymbolInfoEntity symbolInfoEntity) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(code, "code");
            this.name = name;
            this.code = code;
            this.iconUrl = str;
            this.fullName = str2;
            this.isChecked = z11;
            this.symbolInfoEntity = symbolInfoEntity;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterChooseData)) {
                return false;
            }
            FilterChooseData filterChooseData = (FilterChooseData) other;
            return Intrinsics.areEqual(this.name, filterChooseData.name) && Intrinsics.areEqual(this.code, filterChooseData.code) && Intrinsics.areEqual(this.iconUrl, filterChooseData.iconUrl) && Intrinsics.areEqual(this.fullName, filterChooseData.fullName) && this.isChecked == filterChooseData.isChecked && Intrinsics.areEqual(this.symbolInfoEntity, filterChooseData.symbolInfoEntity);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final SymbolInfoEntity getSymbolInfoEntity() {
            return this.symbolInfoEntity;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        /* JADX INFO: renamed from: g */
        public final void m61004g(boolean z11) {
            this.isChecked = z11;
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.code.hashCode()) * 31;
            String str = this.iconUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fullName;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isChecked)) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfoEntity;
            return iHashCode3 + (symbolInfoEntity != null ? symbolInfoEntity.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FilterChooseData(name=" + this.name + ", code=" + this.code + ", iconUrl=" + this.iconUrl + ", fullName=" + this.fullName + ", isChecked=" + this.isChecked + ", symbolInfoEntity=" + this.symbolInfoEntity + ')';
        }

        public /* synthetic */ FilterChooseData(String str, String str2, String str3, String str4, boolean z11, SymbolInfoEntity symbolInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : symbolInfoEntity);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.view.ChooseSymbolView$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChooseSymbolView.kt\ncom/kubi/spot/business/delegation/view/ChooseSymbolView\n*L\n1#1,328:1\n205#2,14:329\n*E\n"})
    public static final class C24919b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f50124b;

        public C24919b(String str) {
            this.f50124b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Integer numValueOf;
            int i11;
            FilterChooseData filterChooseData = (FilterChooseData) t11;
            int i12 = 1;
            int iValueOf = 0;
            if (filterChooseData.getSymbolInfoEntity() != null) {
                String baseCurrencyName = filterChooseData.getSymbolInfoEntity().getBaseCurrencyName();
                Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
                String string = StringsKt.trim((CharSequence) this.f50124b).toString();
                Locale locale = Locale.ROOT;
                String upperCase = string.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (StringsKt.contains$default((CharSequence) baseCurrencyName, (CharSequence) upperCase, false, 2, (Object) null)) {
                    i11 = -1;
                } else {
                    String quoteCurrencyName = filterChooseData.getSymbolInfoEntity().getQuoteCurrencyName();
                    Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
                    String upperCase2 = StringsKt.trim((CharSequence) this.f50124b).toString().toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    i11 = StringsKt.contains$default((CharSequence) quoteCurrencyName, (CharSequence) upperCase2, false, 2, (Object) null) ? 1 : 0;
                }
                numValueOf = Integer.valueOf(i11);
            } else {
                numValueOf = 0;
            }
            FilterChooseData filterChooseData2 = (FilterChooseData) t12;
            if (filterChooseData2.getSymbolInfoEntity() != null) {
                String baseCurrencyName2 = filterChooseData2.getSymbolInfoEntity().getBaseCurrencyName();
                Intrinsics.checkNotNullExpressionValue(baseCurrencyName2, "getBaseCurrencyName(...)");
                String string2 = StringsKt.trim((CharSequence) this.f50124b).toString();
                Locale locale2 = Locale.ROOT;
                String upperCase3 = string2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (StringsKt.contains$default((CharSequence) baseCurrencyName2, (CharSequence) upperCase3, false, 2, (Object) null)) {
                    i12 = -1;
                } else {
                    String quoteCurrencyName2 = filterChooseData2.getSymbolInfoEntity().getQuoteCurrencyName();
                    Intrinsics.checkNotNullExpressionValue(quoteCurrencyName2, "getQuoteCurrencyName(...)");
                    String upperCase4 = StringsKt.trim((CharSequence) this.f50124b).toString().toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (!StringsKt.contains$default((CharSequence) quoteCurrencyName2, (CharSequence) upperCase4, false, 2, (Object) null)) {
                        i12 = 0;
                    }
                }
                iValueOf = Integer.valueOf(i12);
            }
            return ComparisonsKt.compareValues(numValueOf, iValueOf);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSymbolView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSymbolView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: B */
    private final void m60970B() {
        BaseTextView baseTextView;
        Integer num = this.f50115h;
        if (num != null) {
            int iIntValue = num.intValue();
            C44673w0 binding = getBinding();
            if (binding != null && (baseTextView = binding.f99424d) != null) {
                baseTextView.setVisibility(iIntValue);
            }
            this.f50115h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44673w0 getBinding() {
        return (C44673w0) this.f50111d.getValue(this, f50110k[0]);
    }

    private final InterfaceC37053d getMarketApi() {
        return (InterfaceC37053d) this.f50114g.getValue();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m60984n(String str, FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = name.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m60985o(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m60986p(ChooseSymbolView chooseSymbolView, String str, List list) {
        chooseSymbolView.f50113f.clear();
        ArrayList<FilterChooseData> arrayList = chooseSymbolView.f50113f;
        Intrinsics.checkNotNull(list);
        arrayList.addAll(CollectionsKt.sortedWith(list, new C24919b(str)));
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = chooseSymbolView.f50116i;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(chooseSymbolView.f50113f);
        chooseSymbolView.m60991v();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m60988s(ChooseSymbolView chooseSymbolView, String str, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List listM66560c = C27024b.m66560c(((MarginSymbol) it.next()).getValue());
            ArrayList<SymbolInfoEntity> arrayList2 = new ArrayList();
            for (Object obj : listM66560c) {
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) obj;
                if (Intrinsics.areEqual(str, "MARGIN_TRADE") ? symbolInfoEntity.isMarginEnabled() : symbolInfoEntity.isIsolatedMarginEnabled()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (SymbolInfoEntity symbolInfoEntity2 : arrayList2) {
                String showSymbol = symbolInfoEntity2.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                String code = symbolInfoEntity2.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                arrayList3.add(new FilterChooseData(showSymbol, code, null, null, false, symbolInfoEntity2, 28, null));
            }
            arrayList.addAll(arrayList3);
        }
        chooseSymbolView.f50112e.addAll(arrayList);
        chooseSymbolView.f50113f.addAll(arrayList);
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = chooseSymbolView.f50116i;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(chooseSymbolView.f50113f);
    }

    /* JADX INFO: renamed from: t */
    public static final void m60989t(ChooseSymbolView chooseSymbolView, List list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TradeItemBean tradeItemBean = (TradeItemBean) it.next();
            String showSymbol = tradeItemBean.getShowSymbol();
            Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
            String symbol = tradeItemBean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            arrayList.add(new FilterChooseData(showSymbol, symbol, null, null, false, tradeItemBean.getSymbolInfoEntity(), 28, null));
        }
        chooseSymbolView.f50112e.addAll(arrayList);
        chooseSymbolView.f50113f.addAll(arrayList);
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = chooseSymbolView.f50116i;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(chooseSymbolView.f50113f);
    }

    /* JADX INFO: renamed from: v */
    private final void m60991v() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (this.f50115h == null) {
            C44673w0 binding = getBinding();
            this.f50115h = (binding == null || (baseTextView2 = binding.f99424d) == null) ? null : Integer.valueOf(baseTextView2.getVisibility());
            C44673w0 binding2 = getBinding();
            if (binding2 == null || (baseTextView = binding2.f99424d) == null) {
                return;
            }
            baseTextView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m60993x(ChooseSymbolView chooseSymbolView) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        CharSequence text;
        BaseTextView baseTextView3;
        CharSequence text2;
        C44673w0 binding = chooseSymbolView.getBinding();
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = null;
        String string = (binding == null || (baseTextView3 = binding.f99424d) == null || (text2 = baseTextView3.getText()) == null) ? null : text2.toString();
        if (string == null) {
            string = "";
        }
        C44673w0 binding2 = chooseSymbolView.getBinding();
        String string2 = (binding2 == null || (baseTextView2 = binding2.f99424d) == null || (text = baseTextView2.getText()) == null) ? null : text.toString();
        FilterChooseData filterChooseData = new FilterChooseData(string, string2 != null ? string2 : "", null, null, false, null, 60, null);
        C44673w0 binding3 = chooseSymbolView.getBinding();
        if (binding3 != null && (baseTextView = binding3.f99424d) != null) {
            Context context = chooseSymbolView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            baseTextView.setTextColor(C27046k.m66699n(context, R$color.brandGreen));
        }
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter2 = chooseSymbolView.f50116i;
        if (baseQuickAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter2 = null;
        }
        List<FilterChooseData> data = baseQuickAdapter2.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FilterChooseData) it.next()).m61004g(false);
        }
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter3 = chooseSymbolView.f50116i;
        if (baseQuickAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
        } else {
            baseQuickAdapter = baseQuickAdapter3;
        }
        baseQuickAdapter.notifyDataSetChanged();
        Function1<? super FilterChooseData, Unit> function1 = chooseSymbolView.f50117j;
        if (function1 != null) {
            function1.invoke(filterChooseData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m60996C(@NotNull List<FilterChooseData> data, boolean z11, boolean z12) {
        BaseTextView baseTextView;
        ClearEditText clearEditText;
        Intrinsics.checkNotNullParameter(data, "data");
        C44673w0 binding = getBinding();
        if (binding != null && (clearEditText = binding.f99422b) != null) {
            clearEditText.setVisibility(z11 ? 0 : 8);
        }
        C44673w0 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f99424d) != null) {
            baseTextView.setVisibility(z12 ? 0 : 8);
        }
        this.f50112e.addAll(data);
        this.f50113f.addAll(data);
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = this.f50116i;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(this.f50113f);
    }

    @Nullable
    public final Function1<FilterChooseData, Unit> getOnSelectCallback() {
        return this.f50117j;
    }

    /* JADX INFO: renamed from: r */
    public final void m60997r(@NotNull final String tradeType) {
        ClearEditText clearEditText;
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        if (Intrinsics.areEqual(tradeType, "TRADE")) {
            InterfaceC37888l.m85587k(C37890n.f85269a, new Consumer() { // from class: n20.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChooseSymbolView.m60989t(this.f94529b, (List) obj);
                }
            }, false, 2, null);
            return;
        }
        if (!Intrinsics.areEqual(tradeType, "margin_coin_choose")) {
            Disposable disposableSubscribe = getMarketApi().m82940h().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: n20.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChooseSymbolView.m60988s(this.f94520b, tradeType, (List) obj);
                }
            }, new C24223c1(null));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
        } else {
            C44673w0 binding = getBinding();
            if (binding != null && (clearEditText = binding.f99422b) != null) {
                clearEditText.setHint(getResources().getString(R$string.search_coin));
            }
            C37890n.f85269a.mo85590a(new Consumer() { // from class: n20.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChooseSymbolView.m60990u(this.f94530b, (List) obj);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setOnSelectCallback(@Nullable Function1<? super FilterChooseData, Unit> function1) {
        this.f50117j = function1;
    }

    public /* synthetic */ ChooseSymbolView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m60969A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    private final void m60983m(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.f50113f.clear();
            this.f50113f.addAll(this.f50112e);
            BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = this.f50116i;
            if (baseQuickAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("value");
                baseQuickAdapter = null;
            }
            baseQuickAdapter.replaceData(this.f50113f);
            m60970B();
            return;
        }
        Observable observableFromIterable = Observable.fromIterable(this.f50112e);
        final Function1 function1 = new Function1() { // from class: n20.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChooseSymbolView.m60984n(str, (ChooseSymbolView.FilterChooseData) obj));
            }
        };
        Observable observable = observableFromIterable.filter(new Predicate() { // from class: n20.g
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ChooseSymbolView.m60985o(function1, obj);
            }
        }).toList().toObservable();
        final Function1 function2 = new Function1() { // from class: n20.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseSymbolView.m60986p(this.f94526b, str, (List) obj);
            }
        };
        Disposable disposableSubscribe = observable.subscribe(new Consumer() { // from class: n20.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChooseSymbolView.m60987q(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m60987q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final void m60990u(ChooseSymbolView chooseSymbolView, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList<CoinInfoEntity> arrayList = new ArrayList();
        for (Object obj : list) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
            if (coinInfoEntity.isMarginEnabled() || coinInfoEntity.isIsolatedEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (CoinInfoEntity coinInfoEntity2 : arrayList) {
            String currency = coinInfoEntity2.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            String code = coinInfoEntity2.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            arrayList2.add(new FilterChooseData(currency, code, coinInfoEntity2.getIconUrl(), coinInfoEntity2.getName(), false, null, 48, null));
        }
        chooseSymbolView.f50112e.addAll(arrayList2);
        chooseSymbolView.f50113f.addAll(arrayList2);
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = chooseSymbolView.f50116i;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(chooseSymbolView.f50113f);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: w */
    private final void m60992w() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        BaseTextView baseTextView;
        C44673w0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f99424d) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: n20.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChooseSymbolView.m60993x(this.f94523b);
                }
            }, 1, null);
        }
        C44673w0 binding2 = getBinding();
        if (binding2 != null && (recyclerView3 = binding2.f99423c) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        ChooseSymbolView$initView$2 chooseSymbolView$initView$2 = new ChooseSymbolView$initView$2(this, R$layout.spot_item_filter_with_icon, this.f50113f);
        this.f50116i = chooseSymbolView$initView$2;
        int i11 = R$layout.view_empty;
        C44673w0 binding3 = getBinding();
        BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter = null;
        if (binding3 != null) {
            recyclerView = binding3.f99423c;
        } else {
            recyclerView = null;
        }
        chooseSymbolView$initView$2.setEmptyView(i11, recyclerView);
        C44673w0 binding4 = getBinding();
        if (binding4 != null && (recyclerView2 = binding4.f99423c) != null) {
            BaseQuickAdapter<FilterChooseData, BaseViewHolder> baseQuickAdapter2 = this.f50116i;
            if (baseQuickAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("value");
            } else {
                baseQuickAdapter = baseQuickAdapter2;
            }
            recyclerView2.setAdapter(baseQuickAdapter);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC37053d m60994y() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m60995z(ChooseSymbolView chooseSymbolView, CharSequence charSequence) {
        chooseSymbolView.m60983m(charSequence.toString());
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ClearEditText clearEditText;
        super.onAttachedToWindow();
        C44673w0 binding = getBinding();
        if (binding != null && (clearEditText = binding.f99422b) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
            final Function1 function1 = new Function1() { // from class: n20.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChooseSymbolView.m60995z(this.f94519b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: n20.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChooseSymbolView.m60969A(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSymbolView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50111d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44673w0>() { // from class: com.kubi.spot.business.delegation.view.ChooseSymbolView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44673w0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44673w0.m98822a(C45682f.m100801b(viewGroup));
            }
        });
        this.f50112e = new ArrayList<>();
        this.f50113f = new ArrayList<>();
        this.f50114g = LazyKt.lazy(new Function0() { // from class: n20.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseSymbolView.m60994y();
            }
        });
        LayoutInflater.from(context).inflate(R$layout.spot_view_choose_symbol, this);
        m60992w();
    }
}

package com.kubi.assets.finance;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.FinanceRecommendEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44912z5;
import p852kotlin.Metadata;
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
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: FinanceRecommendView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceRecommendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/ViewFinanceEmptyBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewFinanceEmptyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "list", "", "Lcom/kubi/assets/entity/FinanceRecommendEntity;", "setCoinIcon", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nFinanceRecommendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceRecommendView.kt\ncom/kubi/assets/finance/FinanceRecommendView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n52#2:148\n80#2,7:149\n1869#3,2:156\n1#4:158\n*S KotlinDebug\n*F\n+ 1 FinanceRecommendView.kt\ncom/kubi/assets/finance/FinanceRecommendView\n*L\n48#1:148\n48#1:149,7\n61#1:156,2\n*E\n"})
public final class FinanceRecommendView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f17396c = {Reflection.property1(new PropertyReference1Impl(FinanceRecommendView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewFinanceEmptyBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f17397b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FinanceRecommendView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FinanceRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C44912z5 getBinding() {
        return (C44912z5) this.f17397b.getValue(this, f17396c[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b */
    public final void m16694b(@NotNull List<FinanceRecommendEntity> list) {
        BigDecimal bigDecimalM11724a;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Intrinsics.checkNotNullParameter(list, "list");
        C44912z5 binding = getBinding();
        if (binding != null && (linearLayout2 = binding.f101275b) != null) {
            linearLayout2.removeAllViews();
        }
        int i11 = 1;
        for (final FinanceRecommendEntity financeRecommendEntity : list) {
            String plainString = null;
            final View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.view_finance_recommend_cell, (ViewGroup) null);
            m16695d(financeRecommendEntity, new BaseViewHolder(viewInflate));
            ((TextView) viewInflate.findViewById(R$id.tvCoin)).setText(financeRecommendEntity.getName());
            if (Intrinsics.areEqual(financeRecommendEntity.getCategory(), EarnAccountItem.TYPE_TWIN_WIN) || Intrinsics.areEqual(financeRecommendEntity.getCategory(), EarnAccountItem.TYPE_FUTURE_PLUS)) {
                StringBuilder sb2 = new StringBuilder();
                BigDecimal leverage = financeRecommendEntity.getLeverage();
                if (leverage != null && (bigDecimalM11724a = C6447a.m11724a(leverage)) != null) {
                    plainString = bigDecimalM11724a.toPlainString();
                }
                sb2.append(C27041f.m66669i(plainString, C33820nf.f71144W));
                sb2.append('x');
                String string = sb2.toString();
                String str = getResources().getString(R$string.margin_lever) + '\n' + string;
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.primary)), StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null) + string.length(), 18);
                ((TextView) viewInflate.findViewById(R$id.tvBonus)).setText(spannableString);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\u202d ");
                BigDecimal bigDecimalAdd = C41014a.m89922G(financeRecommendEntity.getApr(), null, 1, null).add(C41014a.m89922G(financeRecommendEntity.getPol_apr(), null, 1, null));
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                sb3.append(C42828b.m93905f(C41014a.m89946t(bigDecimalAdd, null, 2, false, false, false, false, false, null, 2, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, null), "%", true, false));
                sb3.append((char) 8236);
                String string2 = sb3.toString();
                String string3 = getResources().getString(R$string.kcs_guide1_valueLabel, string2);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                SpannableString spannableString2 = new SpannableString(string3);
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null);
                int i12 = iIndexOf$default != -1 ? iIndexOf$default : 0;
                spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.primary)), i12, string2.length() + i12, 18);
                ((TextView) viewInflate.findViewById(R$id.tvBonus)).setText(spannableString2);
            }
            viewInflate.setTag(Integer.valueOf(i11));
            Intrinsics.checkNotNull(viewInflate);
            C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.assets.finance.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceRecommendView.m16693c(viewInflate, financeRecommendEntity);
                }
            }, 1, null);
            C44912z5 binding2 = getBinding();
            if (binding2 != null && (linearLayout = binding2.f101275b) != null) {
                linearLayout.addView(viewInflate);
            }
            C43852m.m96595g("B9earnAccount", "recommend", String.valueOf(i11), null, 8, null);
            i11++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16695d(FinanceRecommendEntity financeRecommendEntity, BaseViewHolder baseViewHolder) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.iv_icon);
        CoinAvatarView coinAvatarView2 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon1);
        CoinAvatarView coinAvatarView3 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon2);
        coinAvatarView3.setStrokeColor(coinAvatarView3.getResources().getColor(R$color.c_overlay));
        if (financeRecommendEntity.getBigCurrencyIcon() != null && financeRecommendEntity.getSmallCurrencyIcon() != null) {
            Intrinsics.checkNotNull(coinAvatarView);
            ViewExtKt.m66577h(coinAvatarView);
            C24277v.m58542g(coinAvatarView2, financeRecommendEntity.getBigCurrencyIcon());
            Intrinsics.checkNotNullExpressionValue(coinAvatarView2, "apply(...)");
            ViewExtKt.m66594y(coinAvatarView2);
            C24277v.m58542g(coinAvatarView3, financeRecommendEntity.getSmallCurrencyIcon());
            Intrinsics.checkNotNullExpressionValue(coinAvatarView3, "apply(...)");
            ViewExtKt.m66594y(coinAvatarView3);
            return;
        }
        String bigCurrencyIcon = financeRecommendEntity.getBigCurrencyIcon();
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(financeRecommendEntity.getCurrency()));
        C24277v.m58542g(coinAvatarView, C27041f.m66669i(bigCurrencyIcon, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null)));
        Intrinsics.checkNotNullExpressionValue(coinAvatarView, "apply(...)");
        ViewExtKt.m66594y(coinAvatarView);
        Intrinsics.checkNotNull(coinAvatarView2);
        ViewExtKt.m66577h(coinAvatarView2);
        Intrinsics.checkNotNull(coinAvatarView3);
        ViewExtKt.m66577h(coinAvatarView3);
    }

    public /* synthetic */ FinanceRecommendView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m16693c(View view, FinanceRecommendEntity financeRecommendEntity) {
        if (view.getTag() != null) {
            C43852m.m96591c("B9earnAccount", "recommend", view.getTag().toString(), null, 8, null);
        }
        C37304a c37304a = C37304a.f82764a;
        Uri uri = Uri.parse(EarnUrlConfig.f17409a.m16753c());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        C4400a c4400aM4038a = new C4400a(uri, null, 2, null).m4038a(FirebaseAnalytics.Param.CURRENCY, financeRecommendEntity.getCurrency());
        Boolean bool = Boolean.TRUE;
        InterfaceC37766r.a.m85190a(c37304a, c4400aM4038a.m4038a("needLogin", bool).m4038a("dark", bool).m4038a("loading", 2).m4038a("lang", MultiLanguageManager.f46811g.getLocalString()).m4045h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FinanceRecommendView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17397b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44912z5>() { // from class: com.kubi.assets.finance.FinanceRecommendView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44912z5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44912z5.m99348a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_finance_empty, this);
    }
}

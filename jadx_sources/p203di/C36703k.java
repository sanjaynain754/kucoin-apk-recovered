package p203di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.futures.dialog.pop.SelectCurrencyOfHistoryPopup;
import com.kubi.kumex.utils.RotateDrawable;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: di.k */
/* JADX INFO: compiled from: CurrencyClickFilter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001bH\u0002J\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001bH\u0002J\f\u0010\u001f\u001a\u00020\u001d*\u00020\u001bH\u0002J\u0016\u0010 \u001a\u00020!*\u00020!2\b\b\u0001\u0010\"\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/futures/history/filter/CurrencyClickFilter;", "", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "currencyList", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "defaultString", "", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V", "getCurrencyList", "()Ljava/util/List;", "setCurrencyList", "(Ljava/util/List;)V", FirebaseAnalytics.Param.CURRENCY, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "", "initAndRegisterSelectAction", "getCurrency", "performClick", "setCurrencyProgrammatic", "setCurrencyShow", "select", "", "toAngle", "", "toTriangleColor", "toColor", "drawableTint", "Landroid/graphics/drawable/Drawable;", "colorRes", "FilterChooseCoin", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyClickFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyClickFilter.kt\ncom/kubi/futures/history/filter/CurrencyClickFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1563#2:120\n1634#2,3:121\n1869#2,2:124\n*S KotlinDebug\n*F\n+ 1 CurrencyClickFilter.kt\ncom/kubi/futures/history/filter/CurrencyClickFilter\n*L\n56#1:120\n56#1:121,3\n83#1:124,2\n*E\n"})
public final class C36703k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AppCompatTextView f79601a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f79602b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public List<? extends CoinInfoEntity> f79603c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f79604d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f79605e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Function0<Unit> f79606f;

    /* JADX INFO: renamed from: di.k$a, reason: from toString */
    /* JADX INFO: compiled from: CurrencyClickFilter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/history/filter/CurrencyClickFilter$FilterChooseCoin;", "", "name", "", "code", "iconUrl", "fullName", "isChecked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getCode", "getIconUrl", "getFullName", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FilterChooseCoin {

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

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterChooseCoin)) {
                return false;
            }
            FilterChooseCoin filterChooseCoin = (FilterChooseCoin) other;
            return Intrinsics.areEqual(this.name, filterChooseCoin.name) && Intrinsics.areEqual(this.code, filterChooseCoin.code) && Intrinsics.areEqual(this.iconUrl, filterChooseCoin.iconUrl) && Intrinsics.areEqual(this.fullName, filterChooseCoin.fullName) && this.isChecked == filterChooseCoin.isChecked;
        }

        public FilterChooseCoin(@NotNull String name, @NotNull String code, @Nullable String str, @Nullable String str2, boolean z11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(code, "code");
            this.name = name;
            this.code = code;
            this.iconUrl = str;
            this.fullName = str2;
            this.isChecked = z11;
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

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.code.hashCode()) * 31;
            String str = this.iconUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fullName;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked);
        }

        @NotNull
        public String toString() {
            return "FilterChooseCoin(name=" + this.name + ", code=" + this.code + ", iconUrl=" + this.iconUrl + ", fullName=" + this.fullName + ", isChecked=" + this.isChecked + ')';
        }
    }

    public C36703k(@NotNull AppCompatTextView clickView, @NotNull View anchorView, @NotNull List<? extends CoinInfoEntity> currencyList, @NotNull String defaultString) {
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
        Intrinsics.checkNotNullParameter(defaultString, "defaultString");
        this.f79601a = clickView;
        this.f79602b = anchorView;
        this.f79603c = currencyList;
        this.f79604d = defaultString;
    }

    /* JADX INFO: renamed from: j */
    public static final void m82186j(C36703k c36703k) {
        c36703k.m82192l(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m82190h() {
        m82192l(true);
        Context context = this.f79601a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = this.f79605e;
        List<? extends CoinInfoEntity> list = this.f79603c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (CoinInfoEntity coinInfoEntity : list) {
            String code = coinInfoEntity.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            String currency = coinInfoEntity.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            arrayList.add(new FilterChooseCoin(currency, code, coinInfoEntity.getIconUrl(), coinInfoEntity.getName(), Intrinsics.areEqual(coinInfoEntity.getCode(), this.f79605e)));
        }
        new SelectCurrencyOfHistoryPopup(context, arrayList, str, new Function1() { // from class: di.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C36703k.m82185i(this.f79599b, (String) obj);
            }
        }).m96315Y(new PopupWindow.OnDismissListener() { // from class: di.j
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C36703k.m82186j(this.f79600b);
            }
        }).mo54253b0(this.f79602b);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m82185i(C36703k c36703k, String str) {
        c36703k.f79605e = str;
        Function0<Unit> function0 = c36703k.f79606f;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF79605e() {
        return this.f79605e;
    }

    /* JADX INFO: renamed from: f */
    public final void m82189f(@Nullable String str, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79605e = str;
        this.f79606f = action;
        m82192l(false);
        C27046k.m66711z(this.f79601a, 0L, new Function0() { // from class: di.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C36703k.m82184g(this.f79598b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m82191k(@NotNull List<? extends CoinInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f79603c = list;
    }

    /* JADX INFO: renamed from: l */
    public final void m82192l(boolean z11) {
        String currency = this.f79604d;
        for (CoinInfoEntity coinInfoEntity : this.f79603c) {
            if (Intrinsics.areEqual(coinInfoEntity.getCode(), this.f79605e)) {
                currency = coinInfoEntity.getCurrency();
                Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            }
        }
        AppCompatTextView appCompatTextView = this.f79601a;
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        String str = this.f79605e;
        appCompatTextView.setText(c27096v0.m66905e(currency, c27017c.m66512a(m82194n(!(str == null || str.length() == 0)))));
        RotateDrawable rotateDrawable = new RotateDrawable(m82187d(C27017c.m66510d(c27017c, R$mipmap.ic_drop_triangle, null, 2, null), m82195o(z11)), m82193m(z11));
        rotateDrawable.setBounds(0, 0, rotateDrawable.getMinimumWidth(), rotateDrawable.getMinimumHeight());
        this.f79601a.setCompoundDrawablesRelative(null, null, rotateDrawable, null);
    }

    /* JADX INFO: renamed from: m */
    public final int m82193m(boolean z11) {
        return z11 ? 180 : 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m82194n(boolean z11) {
        return z11 ? R$color.primary : R$color.c_text40;
    }

    /* JADX INFO: renamed from: o */
    public final int m82195o(boolean z11) {
        return z11 ? R$color.primary : R$color.c_icon60;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m82184g(C36703k c36703k) {
        c36703k.m82190h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m82187d(Drawable drawable, @ColorRes int i11) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap, C27017c.f54310a.m66512a(i11));
        return drawableWrap;
    }

    public /* synthetic */ C36703k(AppCompatTextView appCompatTextView, View view, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatTextView, view, list, (i11 & 8) != 0 ? C27017c.f54310a.m66516f(R$string.coin, new Object[0]) : str);
    }
}

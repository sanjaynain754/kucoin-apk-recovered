package com.kubi.quotefacade.helper;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChainSortHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010$\u001a\u00020%2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0'J \u0010(\u001a\u00020%2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0'J \u0010)\u001a\u00020%2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0'J \u0010*\u001a\u00020%2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0'J(\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001d2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0'J\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020%2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100J\b\u00101\u001a\u00020\u0007H\u0002J\b\u00102\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR#\u0010\u0017\u001a\n \n*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00063"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/ChainSortHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "isSortByAmount", "", "ivSortAmount", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvSortAmount", "()Landroid/widget/ImageView;", "ivSortAmount$delegate", "Lkotlin/Lazy;", "isSortByPrice", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "isSortByChangeRate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "tvSortChangeRate", "Landroid/widget/TextView;", "getTvSortChangeRate", "()Landroid/widget/TextView;", "tvSortChangeRate$delegate", "sortType", "", "sortName", "sortDynamicName", "getSortDynamicName", "()Ljava/lang/String;", "setSortDynamicName", "(Ljava/lang/String;)V", "applyDefaultVolumeDescSort", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "sortByAmount", "sortByPrice", "sortByChangeRate", "resetDynamic", "dynamicName", "isDynamicNameSortNow", "", "resetDefault", "Lkotlin/Function0;", "getSortUpResId", "getSortDownResId", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainSortHelper.kt\ncom/kubi/quotefacade/helper/ChainSortHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class ChainSortHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ViewGroup f42070a;

    /* JADX INFO: renamed from: b */
    public int f42071b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f42072c;

    /* JADX INFO: renamed from: d */
    public int f42073d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f42074e;

    /* JADX INFO: renamed from: f */
    public int f42075f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f42076g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f42077h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f42078i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f42079j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public String f42080k;

    /* JADX INFO: renamed from: p */
    public final void m52082p(@Nullable Function0<Unit> function0) {
        this.f42071b = 0;
        this.f42073d = 0;
        this.f42075f = 0;
        this.f42078i = "";
        this.f42079j = "";
        ImageView imageViewM52077h = m52077h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52077h.setImageResource(i11);
        m52075f().setImageResource(i11);
        m52076g().setImageResource(i11);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public ChainSortHelper(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f42070a = container;
        this.f42072c = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSortHelper.m52069m(this.f42006b);
            }
        });
        this.f42074e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSortHelper.m52071o(this.f42036b);
            }
        });
        this.f42076g = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSortHelper.m52070n(this.f42041b);
            }
        });
        this.f42077h = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSortHelper.m52073w(this.f42066b);
            }
        });
        this.f42078i = "";
        this.f42079j = "";
        this.f42080k = ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType();
    }

    /* JADX INFO: renamed from: m */
    public static final ImageView m52069m(ChainSortHelper chainSortHelper) {
        return (ImageView) chainSortHelper.f42070a.findViewById(R$id.iv_amount);
    }

    /* JADX INFO: renamed from: n */
    public static final ImageView m52070n(ChainSortHelper chainSortHelper) {
        return (ImageView) chainSortHelper.f42070a.findViewById(R$id.iv_change_rate);
    }

    /* JADX INFO: renamed from: o */
    public static final ImageView m52071o(ChainSortHelper chainSortHelper) {
        return (ImageView) chainSortHelper.f42070a.findViewById(R$id.iv_price);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m52072q(ChainSortHelper chainSortHelper, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        chainSortHelper.m52082p(function0);
    }

    /* JADX INFO: renamed from: w */
    public static final TextView m52073w(ChainSortHelper chainSortHelper) {
        return (TextView) chainSortHelper.f42070a.findViewById(R$id.tv_sort_change_rate);
    }

    /* JADX INFO: renamed from: e */
    public final void m52074e(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f42079j = ChainSortItemEnum.CHAIN_SORT_TYPE_VOLUME.getConstSortType();
        this.f42071b = 1;
        this.f42073d = 0;
        this.f42075f = 0;
        this.f42078i = "desc";
        ImageView imageViewM52077h = m52077h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52077h.setImageResource(i11);
        m52076g().setImageResource(i11);
        m52075f().setImageResource(m52078i());
        callback.invoke(this.f42079j, this.f42078i);
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m52075f() {
        return (ImageView) this.f42072c.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final ImageView m52076g() {
        return (ImageView) this.f42076g.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final ImageView m52077h() {
        return (ImageView) this.f42074e.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m52078i() {
        return R$mipmap.ic_sort_down;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF42080k() {
        return this.f42080k;
    }

    /* JADX INFO: renamed from: k */
    public final int m52080k() {
        return R$mipmap.ic_sort_up;
    }

    /* JADX INFO: renamed from: l */
    public final TextView m52081l() {
        return (TextView) this.f42077h.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m52083r(@NotNull String dynamicName, @NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(dynamicName, "dynamicName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Integer numValueOf = null;
        m52072q(this, null, 1, null);
        this.f42080k = dynamicName;
        ChainSortItemEnum chainSortItemEnum = ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE;
        if (Intrinsics.areEqual(dynamicName, chainSortItemEnum.getConstSortType())) {
            numValueOf = Integer.valueOf(chainSortItemEnum.getResourceId());
        } else {
            ChainSortItemEnum chainSortItemEnum2 = ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT;
            if (Intrinsics.areEqual(dynamicName, chainSortItemEnum2.getConstSortType())) {
                numValueOf = Integer.valueOf(chainSortItemEnum2.getResourceId());
            } else {
                ChainSortItemEnum chainSortItemEnum3 = ChainSortItemEnum.CHAIN_SORT_TYPE_MAKERS;
                if (Intrinsics.areEqual(dynamicName, chainSortItemEnum3.getConstSortType())) {
                    numValueOf = Integer.valueOf(chainSortItemEnum3.getResourceId());
                } else {
                    ChainSortItemEnum chainSortItemEnum4 = ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS;
                    if (Intrinsics.areEqual(dynamicName, chainSortItemEnum4.getConstSortType())) {
                        numValueOf = Integer.valueOf(chainSortItemEnum4.getResourceId());
                    } else {
                        ChainSortItemEnum chainSortItemEnum5 = ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP;
                        if (Intrinsics.areEqual(dynamicName, chainSortItemEnum5.getConstSortType())) {
                            numValueOf = Integer.valueOf(chainSortItemEnum5.getResourceId());
                        } else {
                            ChainSortItemEnum chainSortItemEnum6 = ChainSortItemEnum.CHAIN_SORT_TYPE_FDV;
                            if (Intrinsics.areEqual(dynamicName, chainSortItemEnum6.getConstSortType())) {
                                numValueOf = Integer.valueOf(chainSortItemEnum6.getResourceId());
                            } else {
                                ChainSortItemEnum chainSortItemEnum7 = ChainSortItemEnum.CHAIN_SORT_TYPE_TVL;
                                if (Intrinsics.areEqual(dynamicName, chainSortItemEnum7.getConstSortType())) {
                                    numValueOf = Integer.valueOf(chainSortItemEnum7.getResourceId());
                                } else {
                                    ChainSortItemEnum chainSortItemEnum8 = ChainSortItemEnum.CHAIN_SORT_TYPE_CREATE_TIME;
                                    if (Intrinsics.areEqual(dynamicName, chainSortItemEnum8.getConstSortType())) {
                                        numValueOf = Integer.valueOf(chainSortItemEnum8.getResourceId());
                                    } else {
                                        ChainSortItemEnum chainSortItemEnum9 = ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY;
                                        if (Intrinsics.areEqual(dynamicName, chainSortItemEnum9.getConstSortType())) {
                                            numValueOf = Integer.valueOf(chainSortItemEnum9.getResourceId());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (numValueOf != null) {
            m52081l().setText(this.f42070a.getResources().getString(numValueOf.intValue()));
        }
        callback.invoke(this.f42080k, this.f42078i);
    }

    /* JADX INFO: renamed from: s */
    public final void m52084s(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f42080k = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m52085t(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f42079j = ChainSortItemEnum.CHAIN_SORT_TYPE_VOLUME.getConstSortType();
        this.f42071b++;
        this.f42073d = 0;
        ImageView imageViewM52077h = m52077h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52077h.setImageResource(i11);
        this.f42075f = 0;
        m52076g().setImageResource(i11);
        int i12 = this.f42071b % 3;
        if (i12 == 1) {
            this.f42078i = "desc";
            m52075f().setImageResource(m52078i());
        } else if (i12 != 2) {
            this.f42078i = "";
            m52075f().setImageResource(i11);
        } else {
            this.f42078i = "asc";
            m52075f().setImageResource(m52080k());
        }
        callback.invoke(this.f42079j, this.f42078i);
    }

    /* JADX INFO: renamed from: u */
    public final void m52086u(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f42079j = this.f42080k;
        this.f42075f++;
        this.f42073d = 0;
        ImageView imageViewM52077h = m52077h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52077h.setImageResource(i11);
        this.f42071b = 0;
        m52075f().setImageResource(i11);
        int i12 = this.f42075f % 3;
        if (i12 == 1) {
            this.f42078i = "desc";
            m52076g().setImageResource(m52078i());
        } else if (i12 != 2) {
            this.f42078i = "";
            m52076g().setImageResource(i11);
        } else {
            this.f42078i = "asc";
            m52076g().setImageResource(m52080k());
        }
        callback.invoke(this.f42079j, this.f42078i);
    }

    /* JADX INFO: renamed from: v */
    public final void m52087v(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f42079j = ChainSortItemEnum.CHAIN_SORT_TYPE_PRICE.getConstSortType();
        this.f42073d++;
        this.f42071b = 0;
        ImageView imageViewM52075f = m52075f();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52075f.setImageResource(i11);
        this.f42075f = 0;
        m52076g().setImageResource(i11);
        int i12 = this.f42073d % 3;
        if (i12 == 1) {
            this.f42078i = "desc";
            m52077h().setImageResource(m52078i());
        } else if (i12 != 2) {
            this.f42078i = "";
            m52077h().setImageResource(i11);
        } else {
            this.f42078i = "asc";
            m52077h().setImageResource(m52080k());
        }
        callback.invoke(this.f42079j, this.f42078i);
    }
}

package com.kubi.kumex.market.tradingArea;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketService;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.dialog.QuoteMenuDialog;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.child.DrawerListFragment;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36826q2;
import fm.C37567b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km.C41075d;
import km.InterfaceC41072a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p801yl.C46527h0;
import p830zf.InterfaceC46796f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: SearchDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0011J\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020*H\u0003J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J$\u00100\u001a\b\u0012\u0004\u0012\u00020/012\u0006\u00102\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020401H\u0016J\b\u00105\u001a\u00020\"H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/SearchDrawerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "isExecuteAddCommitTransaction", "", "()Z", "setExecuteAddCommitTransaction", "(Z)V", "popup", "Lcom/kubi/kumex/dialog/QuoteMenuDialog;", "getPopup", "()Lcom/kubi/kumex/dialog/QuoteMenuDialog;", "popup$delegate", "Lkotlin/Lazy;", "filterProcessor", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onTextChanged", "text", "getParentPageId", "initObserver", "initListener", "indexLongClick", "", "setIndexLongClick", "pos", "onItemClick", "data", "Lcom/kubi/kumex/market/ContractObject;", "toDisplayList", "", "searchText", "t2", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "onDestroyView", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/SearchDrawerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n147#2,16:220\n1869#3,2:236\n774#3:238\n865#3,2:239\n1056#3:241\n1056#3:244\n1563#3:245\n1634#3,3:246\n2756#3:249\n17#4,2:242\n1#5:250\n*S KotlinDebug\n*F\n+ 1 SearchDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/SearchDrawerFragment\n*L\n58#1:220,16\n154#1:236,2\n179#1:238\n179#1:239,2\n181#1:241\n198#1:244\n207#1:245\n207#1:246,3\n209#1:249\n191#1:242,2\n209#1:250\n*E\n"})
public class SearchDrawerFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f29487Z = {Reflection.property1(new PropertyReference1Impl(SearchDrawerFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f29488U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29489V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.tradingArea.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchDrawerFragment.m34474O3(this.f29584b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final BehaviorSubject<String> f29490W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f29491X;

    /* JADX INFO: renamed from: Y */
    public int f29492Y;

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.SearchDrawerFragment$a */
    /* JADX INFO: compiled from: SearchDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/market/tradingArea/SearchDrawerFragment$initListener$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16242a extends RecyclerView.OnScrollListener {
        public C16242a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (SearchDrawerFragment.this.m34490y3().m96299I()) {
                SearchDrawerFragment.this.m34490y3().m96331y();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.SearchDrawerFragment$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SearchDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/SearchDrawerFragment\n*L\n1#1,328:1\n182#2,8:329\n*E\n"})
    public static final class C16243b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f29494b;

        public C16243b(String str) {
            this.f29494b = str;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0057  */
        /* JADX WARN: Code duplicated, block: B:16:0x0059  */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:50:0x0109  */
        /* JADX WARN: Code duplicated, block: B:52:0x0120  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int i11;
            String quoteCurrency;
            String strM66677q;
            String string;
            String quoteCurrency2;
            String strM66677q2;
            String string2;
            Locale locale;
            String upperCase;
            String upperCase2;
            String displayBaseCurrency;
            String strM66677q3;
            String string3;
            String displayBaseCurrency2;
            String strM66677q4;
            String string4;
            RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
            int i12 = 0;
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(((QuotesEntity) t11).getSymbol()), false, 2, null);
            if (contractEntityM99529O != null && (displayBaseCurrency2 = contractEntityM99529O.getDisplayBaseCurrency()) != null && (strM66677q4 = C27041f.m66677q(displayBaseCurrency2)) != null && (string4 = StringsKt.trim((CharSequence) strM66677q4).toString()) != null) {
                Locale locale2 = Locale.ROOT;
                String upperCase3 = string4.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (upperCase3 != null) {
                    String upperCase4 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (StringsKt.contains$default((CharSequence) upperCase3, (CharSequence) upperCase4, false, 2, (Object) null)) {
                        i11 = -1;
                    } else if (contractEntityM99529O != null) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                } else if (contractEntityM99529O != null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
            } else if (contractEntityM99529O != null || (quoteCurrency = contractEntityM99529O.getQuoteCurrency()) == null || (strM66677q = C27041f.m66677q(quoteCurrency)) == null || (string = StringsKt.trim((CharSequence) strM66677q).toString()) == null) {
                i11 = 0;
            } else {
                Locale locale3 = Locale.ROOT;
                String upperCase5 = string.toUpperCase(locale3);
                Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                if (upperCase5 != null) {
                    String upperCase6 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase6, "toUpperCase(...)");
                    if (StringsKt.contains$default((CharSequence) upperCase5, (CharSequence) upperCase6, false, 2, (Object) null)) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                } else {
                    i11 = 0;
                }
            }
            Integer numValueOf = Integer.valueOf(i11);
            ContractEntity contractEntityM99529O2 = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(((QuotesEntity) t12).getSymbol()), false, 2, null);
            if (contractEntityM99529O2 != null && (displayBaseCurrency = contractEntityM99529O2.getDisplayBaseCurrency()) != null && (strM66677q3 = C27041f.m66677q(displayBaseCurrency)) != null && (string3 = StringsKt.trim((CharSequence) strM66677q3).toString()) != null) {
                Locale locale4 = Locale.ROOT;
                String upperCase7 = string3.toUpperCase(locale4);
                Intrinsics.checkNotNullExpressionValue(upperCase7, "toUpperCase(...)");
                if (upperCase7 != null) {
                    String upperCase8 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(upperCase8, "toUpperCase(...)");
                    if (StringsKt.contains$default((CharSequence) upperCase7, (CharSequence) upperCase8, false, 2, (Object) null)) {
                        i12 = -1;
                    } else if (contractEntityM99529O2 != null) {
                        locale = Locale.ROOT;
                        upperCase = string2.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (upperCase != null) {
                            upperCase2 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                            if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null)) {
                                i12 = 1;
                            }
                        }
                    }
                } else if (contractEntityM99529O2 != null) {
                    locale = Locale.ROOT;
                    upperCase = string2.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (upperCase != null) {
                        upperCase2 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null)) {
                            i12 = 1;
                        }
                    }
                }
            } else if (contractEntityM99529O2 != null && (quoteCurrency2 = contractEntityM99529O2.getQuoteCurrency()) != null && (strM66677q2 = C27041f.m66677q(quoteCurrency2)) != null && (string2 = StringsKt.trim((CharSequence) strM66677q2).toString()) != null) {
                locale = Locale.ROOT;
                upperCase = string2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    upperCase2 = StringsKt.trim((CharSequence) this.f29494b).toString().toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null)) {
                        i12 = 1;
                    }
                }
            }
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.SearchDrawerFragment$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SearchDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/SearchDrawerFragment\n*L\n1#1,328:1\n199#2,6:329\n*E\n"})
    public static final class C16244c<T> implements Comparator {
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0075  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int i11;
            String quoteCurrency;
            String strM66677q;
            String string;
            String quoteCurrency2;
            String strM66677q2;
            String string2;
            String quoteCurrency3;
            String strM66677q3;
            String string3;
            String quoteCurrency4;
            String strM66677q4;
            String string4;
            RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
            int i12 = 0;
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(((QuotesEntity) t11).getSymbol()), false, 2, null);
            if (contractEntityM99529O != null && (quoteCurrency4 = contractEntityM99529O.getQuoteCurrency()) != null && (strM66677q4 = C27041f.m66677q(quoteCurrency4)) != null && (string4 = StringsKt.trim((CharSequence) strM66677q4).toString()) != null) {
                String upperCase = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase != null && StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "USDT", false, 2, (Object) null)) {
                    i11 = -1;
                } else if (contractEntityM99529O != null) {
                    i11 = 1;
                } else {
                    i11 = 1;
                }
            } else if (contractEntityM99529O != null || (quoteCurrency = contractEntityM99529O.getQuoteCurrency()) == null || (strM66677q = C27041f.m66677q(quoteCurrency)) == null || (string = StringsKt.trim((CharSequence) strM66677q).toString()) == null) {
                i11 = 1;
            } else {
                String upperCase2 = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (upperCase2 == null || !StringsKt.contains$default((CharSequence) upperCase2, (CharSequence) "USDC", false, 2, (Object) null)) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
            }
            Integer numValueOf = Integer.valueOf(i11);
            ContractEntity contractEntityM99529O2 = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(((QuotesEntity) t12).getSymbol()), false, 2, null);
            if (contractEntityM99529O2 != null && (quoteCurrency3 = contractEntityM99529O2.getQuoteCurrency()) != null && (strM66677q3 = C27041f.m66677q(quoteCurrency3)) != null && (string3 = StringsKt.trim((CharSequence) strM66677q3).toString()) != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (upperCase3 != null && StringsKt.contains$default((CharSequence) upperCase3, (CharSequence) "USDT", false, 2, (Object) null)) {
                    i12 = -1;
                } else if (contractEntityM99529O2 != null) {
                    i12 = 1;
                } else {
                    i12 = 1;
                }
            } else if (contractEntityM99529O2 != null || (quoteCurrency2 = contractEntityM99529O2.getQuoteCurrency()) == null || (strM66677q2 = C27041f.m66677q(quoteCurrency2)) == null || (string2 = StringsKt.trim((CharSequence) strM66677q2).toString()) == null) {
                i12 = 1;
            } else {
                String upperCase4 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                if (upperCase4 == null || !StringsKt.contains$default((CharSequence) upperCase4, (CharSequence) "USDC", false, 2, (Object) null)) {
                    i12 = 1;
                }
            }
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m34464C3(SearchDrawerFragment searchDrawerFragment) {
        searchDrawerFragment.m34475Q3(-1);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f29488U = false;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m34462A3(SearchDrawerFragment searchDrawerFragment, ContractObject entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        searchDrawerFragment.mo33767N3(entity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m34463B3(SearchDrawerFragment searchDrawerFragment, View view, int i11, ContractObject entity) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        QuoteMenuDialog.m33587y0(searchDrawerFragment.m34490y3(), entity.getF29417b(), null, 2, null);
        searchDrawerFragment.m34475Q3(i11);
        searchDrawerFragment.m34490y3().m96318c0(view, (view.getMeasuredWidth() / 2) * (C5303w0.m6511a() ? -1 : 1), view.getMeasuredHeight() * (-2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final List m34466E3(SearchDrawerFragment searchDrawerFragment, String t11, List t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        return searchDrawerFragment.mo33768R3(t11, t12);
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m34471J3(final SearchDrawerFragment searchDrawerFragment, Throwable th2) {
        BaseFragment.showFailView$default(searchDrawerFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.tradingArea.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDrawerFragment.m34472K3(this.f29585b, view);
            }
        }, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final QuoteMenuDialog m34474O3(SearchDrawerFragment searchDrawerFragment) {
        Context contextRequireContext = searchDrawerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new QuoteMenuDialog(contextRequireContext, false, false, searchDrawerFragment.m34489x3(), 4, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: Q3 */
    private final void m34475Q3(int i11) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        List<ContractObject> listMo90050a;
        RecyclerView recyclerView2;
        this.f29492Y = i11;
        C36826q2 c36826q2M34494w3 = m34494w3();
        RecyclerView.Adapter adapter2 = (c36826q2M34494w3 == null || (recyclerView2 = c36826q2M34494w3.f80903c) == null) ? null : recyclerView2.getAdapter();
        C41075d c41075d = adapter2 instanceof C41075d ? (C41075d) adapter2 : null;
        if (c41075d != null && (listMo90050a = c41075d.mo90050a()) != null) {
            Iterator<T> it = listMo90050a.iterator();
            while (it.hasNext()) {
                ((ContractObject) it.next()).m34388i(this.f29492Y);
            }
        }
        C36826q2 c36826q2M34494w4 = m34494w3();
        if (c36826q2M34494w4 == null || (recyclerView = c36826q2M34494w4.f80903c) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public final QuoteMenuDialog m34490y3() {
        return (QuoteMenuDialog) this.f29489V.getValue();
    }

    /* JADX INFO: renamed from: M3, reason: from getter */
    public final boolean getF29488U() {
        return this.f29488U;
    }

    /* JADX INFO: renamed from: N3 */
    public void mo33767N3(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
            return;
        }
        C46527h0.f104291a.m102670E0(strM66668h);
        String name = DrawerListFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
        String strM34489x3 = m34489x3();
        if (strM34489x3.length() > 0) {
            C43852m.m96590b(strM34489x3, "ContractList", "6", TuplesKt.m90091to("searchResult", C27041f.m66668h(data.getF29417b().getSymbol())));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m34493P3(boolean z11) {
        this.f29488U = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public List<ContractObject> mo33768R3(@NotNull String searchText, @NotNull List<QuotesEntity> t11) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(t11, "t2");
        ArrayList arrayList = new ArrayList();
        for (Object obj : t11) {
            if (C37567b.m84628r(InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(((QuotesEntity) obj).getSymbol()), false, 2, null), searchText)) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new C16243b(searchText));
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46796f.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46796f) objM56186h).mo94522a() : true) {
            CollectionsKt.sortedWith(listSortedWith, new C16244c());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ContractObject(2, (QuotesEntity) it.next()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((ContractObject) it2.next()).m34388i(this.f29492Y);
        }
        return arrayList2;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_list, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void onTextChanged(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f29490W.onNext(text);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m34491z3();
        m34465D3();
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public final C36826q2 m34494w3() {
        return (C36826q2) this.f29491X.getValue(this, f29487Z[0]);
    }

    public SearchDrawerFragment() {
        BehaviorSubject<String> behaviorSubjectCreateDefault = BehaviorSubject.createDefault("");
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.f29490W = behaviorSubjectCreateDefault;
        this.f29491X = C45681e.m100799e(this, new Function1<SearchDrawerFragment, C36826q2>() { // from class: com.kubi.kumex.market.tradingArea.SearchDrawerFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36826q2 invoke(@NotNull SearchDrawerFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36826q2.m82514a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36826q2, Unit>() { // from class: com.kubi.kumex.market.tradingArea.SearchDrawerFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36826q2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36826q2 c36826q2) {
                invoke(c36826q2);
                return Unit.INSTANCE;
            }
        });
        this.f29492Y = -1;
    }

    /* JADX INFO: renamed from: D3 */
    private final void m34465D3() {
        getDestroyDisposable().clear();
        Observable observableObserveOn = Observable.combineLatest(this.f29490W, IMarketService.m24859o(RepositoryServiceLocator.f19236a.m20286e(), null, null, 3, null), new BiFunction() { // from class: com.kubi.kumex.market.tradingArea.v
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return SearchDrawerFragment.m34466E3(this.f29588b, (String) obj, (List) obj2);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDrawerFragment.m34467F3(this.f29589b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.kumex.market.tradingArea.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchDrawerFragment.m34468G3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDrawerFragment.m34469H3(this.f29591b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.tradingArea.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchDrawerFragment.m34470I3(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDrawerFragment.m34471J3(this.f29496b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.tradingArea.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchDrawerFragment.m34473L3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX INFO: renamed from: F3 */
    public static final Unit m34467F3(SearchDrawerFragment searchDrawerFragment, Disposable disposable) {
        Integer viewStatus = searchDrawerFragment.getViewStatus();
        if (viewStatus == null || viewStatus.intValue() != 2) {
            if (searchDrawerFragment.m34494w3() != null) {
                C36826q2 c36826q2M34494w3 = searchDrawerFragment.m34494w3();
                Intrinsics.checkNotNull(c36826q2M34494w3);
                RecyclerView list = c36826q2M34494w3.f80903c;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                if (C24346y.m59051a(list)) {
                    BaseFragment.showLoadingView$default(searchDrawerFragment, 0, 0, 3, null);
                }
            } else {
                BaseFragment.showLoadingView$default(searchDrawerFragment, 0, 0, 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m34468G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m34469H3(SearchDrawerFragment searchDrawerFragment, List list) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        if (list.isEmpty()) {
            BaseFragment.showEmptyView$default(searchDrawerFragment, R$string.not_found_content, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            searchDrawerFragment.showContentView();
            C36826q2 c36826q2M34494w3 = searchDrawerFragment.m34494w3();
            InterfaceC41072a interfaceC41072a = null;
            if (c36826q2M34494w3 != null && (recyclerView = c36826q2M34494w3.f80903c) != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof InterfaceC41072a) {
                interfaceC41072a = (InterfaceC41072a) adapter;
            }
            if (interfaceC41072a != null) {
                Intrinsics.checkNotNull(list);
                interfaceC41072a.mo90051c(CollectionsKt.toMutableList((Collection) list));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m34470I3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m34472K3(SearchDrawerFragment searchDrawerFragment, View view) {
        searchDrawerFragment.m34465D3();
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m34473L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x3 */
    private final String m34489x3() {
        if (getParentFragment() instanceof ContractDrawerFragment) {
            return C17060n0.m36552b();
        }
        return "";
    }

    /* JADX INFO: renamed from: z3 */
    private final void m34491z3() {
        C36826q2 c36826q2M34494w3 = m34494w3();
        if (c36826q2M34494w3 == null) {
            return;
        }
        RecyclerView list = c36826q2M34494w3.f80903c;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36826q2M34494w3.f80903c.setHasFixedSize(true);
        c36826q2M34494w3.f80903c.setAdapter(new C41075d(new Function1() { // from class: com.kubi.kumex.market.tradingArea.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDrawerFragment.m34462A3(this.f29583b, (ContractObject) obj);
            }
        }, new Function3() { // from class: com.kubi.kumex.market.tradingArea.t
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SearchDrawerFragment.m34463B3(this.f29586b, (View) obj, ((Integer) obj2).intValue(), (ContractObject) obj3);
            }
        }));
        m34490y3().m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.market.tradingArea.u
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                SearchDrawerFragment.m34464C3(this.f29587b);
            }
        });
        c36826q2M34494w3.f80903c.addOnScrollListener(new C16242a());
    }
}

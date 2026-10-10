package com.kubi.unify.record;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.unify.R$color;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.entity.BorrowConfigEntity;
import com.kubi.unify.entity.UnifyConvertRecordsEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import i60.InterfaceC38460c;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l60.C42109d;
import mr.C42597a;
import nf.C42828b;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.C36703k;
import p203di.C36707o;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyConvertRecordFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0015H\u0014J\b\u0010+\u001a\u00020\u0015H\u0014J\u0018\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0002H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0019¨\u00060"}, m90084d2 = {"Lcom/kubi/unify/record/UnifyConvertRecordFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/unify/entity/UnifyConvertRecordsEntity;", "<init>", "()V", "api", "Lcom/kubi/unify/api/UnifyApi;", "getApi", "()Lcom/kubi/unify/api/UnifyApi;", "api$delegate", "Lkotlin/Lazy;", "parent", "Lcom/kubi/unify/record/UnifyRecordMainFragment;", "getParent", "()Lcom/kubi/unify/record/UnifyRecordMainFragment;", "parent$delegate", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getItemLayout", "", "fromCurrencyFilter", "Lcom/kubi/futures/history/filter/CurrencyClickFilter;", "getFromCurrencyFilter", "()Lcom/kubi/futures/history/filter/CurrencyClickFilter;", "fromCurrencyFilter$delegate", "toCurrencyFilter", "getToCurrencyFilter", "toCurrencyFilter$delegate", "needDefaultBackground", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "getEndFooterText", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyConvertRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyConvertRecordFragment.kt\ncom/kubi/unify/record/UnifyConvertRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1563#2:169\n1634#2,3:170\n774#2:173\n865#2,2:174\n774#2:176\n865#2,2:177\n*S KotlinDebug\n*F\n+ 1 UnifyConvertRecordFragment.kt\ncom/kubi/unify/record/UnifyConvertRecordFragment\n*L\n65#1:169\n65#1:170,3\n67#1:173\n67#1:174,2\n87#1:176\n87#1:177,2\n*E\n"})
public final class UnifyConvertRecordFragment extends BasePagingFragment<UnifyConvertRecordsEntity> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f53315Z = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyConvertRecordFragment.m65263Q3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f53316a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyConvertRecordFragment.m65270c4(this.f53337b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final HashMap<String, String> f53317b0 = new HashMap<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f53318c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyConvertRecordFragment.m65264S3(this.f53338b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f53319d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyConvertRecordFragment.m65271d4(this.f53339b);
        }
    });

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull UnifyConvertRecordsEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CoinAvatarView coinAvatarView = (CoinAvatarView) helper.getView(R$id.iconAvatar);
        TextView textView = (TextView) helper.getView(R$id.currencyLabel);
        TextView textView2 = (TextView) helper.getView(R$id.statusLabel);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R$id.content);
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66577h(textView2);
        RecordsHelper recordsHelper = RecordsHelper.f53332a;
        String toCurrency = item.getToCurrency();
        if (toCurrency == null) {
            toCurrency = "";
        }
        Intrinsics.checkNotNull(coinAvatarView);
        Intrinsics.checkNotNull(textView);
        recordsHelper.m65318a(toCurrency, coinAvatarView, textView);
        C37890n c37890n = C37890n.f85269a;
        String fromCurrency = item.getFromCurrency();
        if (fromCurrency == null) {
            fromCurrency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(fromCurrency);
        String currency = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null;
        String fromCurrency2 = item.getFromCurrency();
        if (fromCurrency2 == null) {
            fromCurrency2 = "";
        }
        String strM66669i = C27041f.m66669i(currency, fromCurrency2);
        String toCurrency2 = item.getToCurrency();
        if (toCurrency2 == null) {
            toCurrency2 = "";
        }
        CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(toCurrency2);
        String currency2 = coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getCurrency() : null;
        String toCurrency3 = item.getToCurrency();
        String strM66669i2 = C27041f.m66669i(currency2, toCurrency3 != null ? toCurrency3 : "");
        Integer numValueOf = Integer.valueOf(R$string.time);
        Long createdAt = item.getCreatedAt();
        String strM92647l = C42180b.m92647l(createdAt != null ? C42179a.m92633f(createdAt.longValue(), null, false, true, null, 11, null) : null);
        int i11 = R$color.c_text;
        Triple triple = new Triple(numValueOf, strM92647l, Integer.valueOf(getColorRes(i11)));
        Integer numValueOf2 = Integer.valueOf(R$string.unify_hold_amount);
        BigDecimal fromSize = item.getFromSize();
        Triple triple2 = new Triple(numValueOf2, C42828b.m93906g(C42180b.m92647l(fromSize != null ? C37886j.m85578b(fromSize, item.getFromCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, true, false, 4, null), Integer.valueOf(getColorRes(i11)));
        Integer numValueOf3 = Integer.valueOf(R$string.unify_convert_amount);
        BigDecimal toSize = item.getToSize();
        String strM93906g = C42828b.m93906g(C42828b.m93906g(C42180b.m92647l(toSize != null ? C37886j.m85578b(toSize, item.getToCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), "+", false, false, 2, null), strM66669i2, true, false, 4, null);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Triple triple3 = new Triple(numValueOf3, strM93906g, Integer.valueOf(C22890g.m54291p(context)));
        Integer numValueOf4 = Integer.valueOf(R$string.unify_convert_price);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C42828b.m93906g("1", strM66669i, true, false, 4, null));
        sb2.append(" = ");
        BigDecimal convertPrice = item.getConvertPrice();
        sb2.append(C42828b.m93906g(C42180b.m92647l(convertPrice != null ? C37886j.m85578b(convertPrice, item.getToCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i2, true, false, 4, null));
        ArrayList<Triple<Integer, String, Integer>> arrayListArrayListOf = CollectionsKt.arrayListOf(triple, triple2, triple3, new Triple(numValueOf4, sb2.toString(), Integer.valueOf(getColorRes(i11))));
        Intrinsics.checkNotNull(linearLayout);
        recordsHelper.m65319b(arrayListArrayListOf, linearLayout);
    }

    /* JADX INFO: renamed from: U3 */
    public static final BasePageEntity m65265U3(UnifyPageEntity last) {
        Intrinsics.checkNotNullParameter(last, "last");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(last.getItems());
        basePageEntity.setHasNext(C27039d.m66650j(last.getTotalPage()) > C27039d.m66650j(last.getCurrentPage()));
        Long totalNum = last.getTotalNum();
        basePageEntity.setTotalNum(C27039d.m66650j(totalNum != null ? Integer.valueOf((int) totalNum.longValue()) : null));
        return basePageEntity;
    }

    /* JADX INFO: renamed from: V3 */
    public static final BasePageEntity m65266V3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: T3 */
    public final InterfaceC38460c m65273T3() {
        Object value = this.f53315Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC38460c) value;
    }

    /* JADX INFO: renamed from: W3 */
    public final C36703k m65274W3() {
        return (C36703k) this.f53318c0.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    public final UnifyRecordMainFragment m65275X3() {
        return (UnifyRecordMainFragment) this.f53316a0.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public final C36703k m65276Y3() {
        return (C36703k) this.f53319d0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String f79605e;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setBackgroundResource(R$color.c_overlay);
        C36703k c36703kM65274W3 = m65274W3();
        String strM65313w3 = null;
        if (c36703kM65274W3 != null) {
            C36703k c36703kM65274W4 = m65274W3();
            c36703kM65274W3.m82189f(c36703kM65274W4 != null ? c36703kM65274W4.getF79605e() : null, new Function0() { // from class: com.kubi.unify.record.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyConvertRecordFragment.m65268a4(this.f53334b);
                }
            });
        }
        C36703k c36703kM65276Y3 = m65276Y3();
        if (c36703kM65276Y3 != null) {
            C36703k c36703kM65276Y4 = m65276Y3();
            if (c36703kM65276Y4 == null || (f79605e = c36703kM65276Y4.getF79605e()) == null) {
                UnifyRecordMainFragment unifyRecordMainFragmentM65275X3 = m65275X3();
                if (unifyRecordMainFragmentM65275X3 != null) {
                    strM65313w3 = unifyRecordMainFragmentM65275X3.m65313w3();
                }
            } else {
                strM65313w3 = f79605e;
            }
            c36703kM65276Y3.m82189f(strM65313w3, new Function0() { // from class: com.kubi.unify.record.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyConvertRecordFragment.m65269b4(this.f53335b);
                }
            });
        }
        C37890n.f85269a.mo85590a(new Consumer() { // from class: com.kubi.unify.record.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyConvertRecordFragment.m65267Z3(this.f53336b, (List) obj);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<UnifyConvertRecordsEntity>> mo16440r3(int i11, int i12) {
        C36707o c36707oM65316z3;
        String f79605e;
        String f79605e2;
        this.f53317b0.clear();
        C36703k c36703kM65276Y3 = m65276Y3();
        if (c36703kM65276Y3 != null && (f79605e2 = c36703kM65276Y3.getF79605e()) != null) {
            this.f53317b0.put("toCurrencyCode", f79605e2);
        }
        C36703k c36703kM65274W3 = m65274W3();
        if (c36703kM65274W3 != null && (f79605e = c36703kM65274W3.getF79605e()) != null) {
            this.f53317b0.put("fromCurrencyCode", f79605e);
        }
        UnifyRecordMainFragment unifyRecordMainFragmentM65275X3 = m65275X3();
        if (unifyRecordMainFragmentM65275X3 != null && (c36707oM65316z3 = unifyRecordMainFragmentM65275X3.m65316z3()) != null) {
            this.f53317b0.put("startAt", String.valueOf(c36707oM65316z3.m82209f()));
            this.f53317b0.put("endAt", String.valueOf(c36707oM65316z3.m82208e()));
        }
        this.f53317b0.put("currentPage", String.valueOf(i11));
        this.f53317b0.put("pageSize", String.valueOf(i12));
        Observable observableObserveOn = m65273T3().m86741h(this.f53317b0).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.record.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyConvertRecordFragment.m65265U3((UnifyPageEntity) obj);
            }
        };
        Observable<BasePageEntity<UnifyConvertRecordsEntity>> map = observableObserveOn.map(new Function() { // from class: com.kubi.unify.record.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UnifyConvertRecordFragment.m65266V3(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.auto_footer_nomore_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.unify_item_reords;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final InterfaceC38460c m65263Q3() {
        return (InterfaceC38460c) C42597a.m93386b().create(InterfaceC38460c.class);
    }

    /* JADX INFO: renamed from: S3 */
    public static final C36703k m65264S3(UnifyConvertRecordFragment unifyConvertRecordFragment) {
        C42109d c42109dM65310t3;
        UnifyRecordMainFragment unifyRecordMainFragmentM65275X3 = unifyConvertRecordFragment.m65275X3();
        if (unifyRecordMainFragmentM65275X3 != null && (c42109dM65310t3 = unifyRecordMainFragmentM65275X3.m65310t3()) != null) {
            BaseTextView convertFromCurrencyFilter = c42109dM65310t3.f93474b;
            Intrinsics.checkNotNullExpressionValue(convertFromCurrencyFilter, "convertFromCurrencyFilter");
            View line = c42109dM65310t3.f93479g;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36703k(convertFromCurrencyFilter, line, CollectionsKt.emptyList(), C27017c.f54310a.m66516f(R$string.unify_convert_before_coin, new Object[0]));
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m65267Z3(UnifyConvertRecordFragment unifyConvertRecordFragment, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!TextUtils.isEmpty(((CoinInfoEntity) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        C36703k c36703kM65274W3 = unifyConvertRecordFragment.m65274W3();
        if (c36703kM65274W3 != null) {
            c36703kM65274W3.m82191k(arrayList);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m65268a4(UnifyConvertRecordFragment unifyConvertRecordFragment) {
        unifyConvertRecordFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m65269b4(UnifyConvertRecordFragment unifyConvertRecordFragment) {
        unifyConvertRecordFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final UnifyRecordMainFragment m65270c4(UnifyConvertRecordFragment unifyConvertRecordFragment) {
        Fragment parentFragment = unifyConvertRecordFragment.getParentFragment();
        if (parentFragment instanceof UnifyRecordMainFragment) {
            return (UnifyRecordMainFragment) parentFragment;
        }
        return null;
    }

    /* JADX INFO: renamed from: d4 */
    public static final C36703k m65271d4(UnifyConvertRecordFragment unifyConvertRecordFragment) {
        C42109d c42109dM65310t3;
        UnifyRecordMainFragment unifyRecordMainFragmentM65275X3 = unifyConvertRecordFragment.m65275X3();
        if (unifyRecordMainFragmentM65275X3 != null && (c42109dM65310t3 = unifyRecordMainFragmentM65275X3.m65310t3()) != null) {
            List<BorrowConfigEntity> immutableList = Util.toImmutableList(UnifyGlobalDataManager.f53084a.m64886x().getValue());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            for (BorrowConfigEntity borrowConfigEntity : immutableList) {
                C37890n c37890n = C37890n.f85269a;
                String currency = borrowConfigEntity.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
                if (coinInfoEntityM85613u == null) {
                    coinInfoEntityM85613u = new CoinInfoEntity();
                }
                arrayList.add(coinInfoEntityM85613u);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!TextUtils.isEmpty(((CoinInfoEntity) obj).getCode())) {
                    arrayList2.add(obj);
                }
            }
            BaseTextView currencyFilter = c42109dM65310t3.f93476d;
            Intrinsics.checkNotNullExpressionValue(currencyFilter, "currencyFilter");
            View line = c42109dM65310t3.f93479g;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36703k(currencyFilter, line, arrayList2, C27017c.f54310a.m66516f(R$string.unify_convert_after_coin, new Object[0]));
        }
        return null;
    }
}

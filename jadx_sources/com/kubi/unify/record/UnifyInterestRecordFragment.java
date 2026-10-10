package com.kubi.unify.record;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.data.entity.CoinInfoEntity;
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
import com.kubi.unify.entity.UnifyInterestRecordsEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import i60.InterfaceC38460c;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l60.C42109d;
import mr.C42597a;
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

/* JADX INFO: compiled from: UnifyInterestRecordFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0014J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0002H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m90084d2 = {"Lcom/kubi/unify/record/UnifyInterestRecordFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/unify/entity/UnifyInterestRecordsEntity;", "<init>", "()V", "api", "Lcom/kubi/unify/api/UnifyApi;", "getApi", "()Lcom/kubi/unify/api/UnifyApi;", "api$delegate", "Lkotlin/Lazy;", "parent", "Lcom/kubi/unify/record/UnifyRecordMainFragment;", "getParent", "()Lcom/kubi/unify/record/UnifyRecordMainFragment;", "parent$delegate", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "currencyFilter", "Lcom/kubi/futures/history/filter/CurrencyClickFilter;", "getCurrencyFilter", "()Lcom/kubi/futures/history/filter/CurrencyClickFilter;", "currencyFilter$delegate", "getEndFooterText", "", "getItemLayout", "needDefaultBackground", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyInterestRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyInterestRecordFragment.kt\ncom/kubi/unify/record/UnifyInterestRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1563#2:145\n1634#2,3:146\n774#2:149\n865#2,2:150\n*S KotlinDebug\n*F\n+ 1 UnifyInterestRecordFragment.kt\ncom/kubi/unify/record/UnifyInterestRecordFragment\n*L\n50#1:145\n50#1:146,3\n52#1:149\n52#1:150,2\n*E\n"})
public final class UnifyInterestRecordFragment extends BasePagingFragment<UnifyInterestRecordsEntity> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f53320Z = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyInterestRecordFragment.m65283N3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f53321a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyInterestRecordFragment.m65290W3(this.f53341b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final HashMap<String, String> f53322b0 = new HashMap<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f53323c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyInterestRecordFragment.m65284P3(this.f53342b);
        }
    });

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: Q3 */
    private final InterfaceC38460c m65285Q3() {
        Object value = this.f53320Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC38460c) value;
    }

    /* JADX INFO: renamed from: S3 */
    public static final BasePageEntity m65286S3(UnifyPageEntity last) {
        Intrinsics.checkNotNullParameter(last, "last");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(last.getItems());
        basePageEntity.setHasNext(C27039d.m66650j(last.getTotalPage()) > C27039d.m66650j(last.getCurrentPage()));
        Long totalNum = last.getTotalNum();
        basePageEntity.setTotalNum(C27039d.m66650j(totalNum != null ? Integer.valueOf((int) totalNum.longValue()) : null));
        return basePageEntity;
    }

    /* JADX INFO: renamed from: T3 */
    public static final BasePageEntity m65287T3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: U3 */
    private final UnifyRecordMainFragment m65288U3() {
        return (UnifyRecordMainFragment) this.f53321a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull UnifyInterestRecordsEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CoinAvatarView coinAvatarView = (CoinAvatarView) helper.getView(R$id.iconAvatar);
        TextView textView = (TextView) helper.getView(R$id.currencyLabel);
        TextView textView2 = (TextView) helper.getView(R$id.statusLabel);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R$id.content);
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66577h(textView2);
        RecordsHelper recordsHelper = RecordsHelper.f53332a;
        String currency = item.getCurrency();
        if (currency == null) {
            currency = "";
        }
        Intrinsics.checkNotNull(coinAvatarView);
        Intrinsics.checkNotNull(textView);
        recordsHelper.m65318a(currency, coinAvatarView, textView);
        Integer numValueOf = Integer.valueOf(R$string.unify_interest_time);
        Long createdAt = item.getCreatedAt();
        String strM92647l = C42180b.m92647l(createdAt != null ? C42179a.m92633f(createdAt.longValue(), null, false, true, null, 11, null) : null);
        int i11 = R$color.c_text;
        Triple triple = new Triple(numValueOf, strM92647l, Integer.valueOf(getColorRes(i11)));
        Integer numValueOf2 = Integer.valueOf(R$string.unify_borrow_amount);
        BigDecimal liabilitySize = item.getLiabilitySize();
        Triple triple2 = new Triple(numValueOf2, C42180b.m92647l(liabilitySize != null ? C37886j.m85578b(liabilitySize, item.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), Integer.valueOf(getColorRes(i11)));
        Integer numValueOf3 = Integer.valueOf(R$string.unify_interest_free_amount);
        BigDecimal interestFreeLiability = item.getInterestFreeLiability();
        Triple triple3 = new Triple(numValueOf3, C42180b.m92647l(interestFreeLiability != null ? C37886j.m85578b(interestFreeLiability, item.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), Integer.valueOf(getColorRes(i11)));
        Integer numValueOf4 = Integer.valueOf(R$string.unify_borrow_hour_interest);
        BigDecimal hourlyInterestRate = item.getHourlyInterestRate();
        Triple triple4 = new Triple(numValueOf4, C42180b.m92649n(hourlyInterestRate != null ? C42180b.m92642g(hourlyInterestRate, null, RoundingMode.UP, 8, false, false, false, 25, null) : null), Integer.valueOf(getColorRes(i11)));
        Integer numValueOf5 = Integer.valueOf(R$string.unify_interest_real);
        BigDecimal interestSize = item.getInterestSize();
        ArrayList<Triple<Integer, String, Integer>> arrayListArrayListOf = CollectionsKt.arrayListOf(triple, triple2, triple3, triple4, new Triple(numValueOf5, C42180b.m92647l(interestSize != null ? C37886j.m85578b(interestSize, item.getCurrency(), null, false, true, false, 2, null, 0, InterfaceC33568bf.f69245q, null) : null), Integer.valueOf(getColorRes(i11))));
        Intrinsics.checkNotNull(linearLayout);
        recordsHelper.m65319b(arrayListArrayListOf, linearLayout);
    }

    /* JADX INFO: renamed from: R3 */
    public final C36703k m65292R3() {
        return (C36703k) this.f53323c0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String strM65313w3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setBackgroundResource(R$color.c_overlay);
        C36703k c36703kM65292R3 = m65292R3();
        if (c36703kM65292R3 != null) {
            C36703k c36703kM65292R4 = m65292R3();
            if (c36703kM65292R4 == null || (strM65313w3 = c36703kM65292R4.getF79605e()) == null) {
                UnifyRecordMainFragment unifyRecordMainFragmentM65288U3 = m65288U3();
                strM65313w3 = unifyRecordMainFragmentM65288U3 != null ? unifyRecordMainFragmentM65288U3.m65313w3() : null;
            }
            c36703kM65292R3.m82189f(strM65313w3, new Function0() { // from class: com.kubi.unify.record.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyInterestRecordFragment.m65289V3(this.f53340b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<UnifyInterestRecordsEntity>> mo16440r3(int i11, int i12) {
        C36707o c36707oM65316z3;
        String f79605e;
        this.f53322b0.clear();
        C36703k c36703kM65292R3 = m65292R3();
        if (c36703kM65292R3 != null && (f79605e = c36703kM65292R3.getF79605e()) != null) {
            this.f53322b0.put(AppsFlyerProperties.CURRENCY_CODE, f79605e);
        }
        UnifyRecordMainFragment unifyRecordMainFragmentM65288U3 = m65288U3();
        if (unifyRecordMainFragmentM65288U3 != null && (c36707oM65316z3 = unifyRecordMainFragmentM65288U3.m65316z3()) != null) {
            this.f53322b0.put("startAt", String.valueOf(c36707oM65316z3.m82209f()));
            this.f53322b0.put("endAt", String.valueOf(c36707oM65316z3.m82208e()));
        }
        this.f53322b0.put("currentPage", String.valueOf(i11));
        this.f53322b0.put("pageSize", String.valueOf(i12));
        Observable observableObserveOn = m65285Q3().m86745l(this.f53322b0).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.record.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyInterestRecordFragment.m65286S3((UnifyPageEntity) obj);
            }
        };
        Observable<BasePageEntity<UnifyInterestRecordsEntity>> map = observableObserveOn.map(new Function() { // from class: com.kubi.unify.record.q
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UnifyInterestRecordFragment.m65287T3(function1, obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final InterfaceC38460c m65283N3() {
        return (InterfaceC38460c) C42597a.m93386b().create(InterfaceC38460c.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static final C36703k m65284P3(UnifyInterestRecordFragment unifyInterestRecordFragment) {
        C42109d c42109dM65310t3;
        UnifyRecordMainFragment unifyRecordMainFragmentM65288U3 = unifyInterestRecordFragment.m65288U3();
        if (unifyRecordMainFragmentM65288U3 != null && (c42109dM65310t3 = unifyRecordMainFragmentM65288U3.m65310t3()) != null) {
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
            return new C36703k(currencyFilter, line, arrayList2, null, 8, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m65289V3(UnifyInterestRecordFragment unifyInterestRecordFragment) {
        unifyInterestRecordFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final UnifyRecordMainFragment m65290W3(UnifyInterestRecordFragment unifyInterestRecordFragment) {
        Fragment parentFragment = unifyInterestRecordFragment.getParentFragment();
        if (parentFragment instanceof UnifyRecordMainFragment) {
            return (UnifyRecordMainFragment) parentFragment;
        }
        return null;
    }
}

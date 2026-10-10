package com.kubi.assets.bill;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37886j;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p637ta.C44776h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillBaseItemDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0003J\n\u0010\u001c\u001a\u00020\u001d*\u00020\u001dR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillBaseItemDetailFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetAccountBillItemDetailFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetAccountBillItemDetailFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "data", "", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "getSideStr", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillBaseItemDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillBaseItemDetailFragment.kt\ncom/kubi/assets/bill/AccountBillBaseItemDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,154:1\n147#2,16:155\n*S KotlinDebug\n*F\n+ 1 AccountBillBaseItemDetailFragment.kt\ncom/kubi/assets/bill/AccountBillBaseItemDetailFragment\n*L\n30#1:155,16\n*E\n"})
public class AccountBillBaseItemDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f16621W = {Reflection.property1(new PropertyReference1Impl(AccountBillBaseItemDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetAccountBillItemDetailFragmentBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f16622U = C45681e.m100799e(this, new Function1<AccountBillBaseItemDetailFragment, C44776h>() { // from class: com.kubi.assets.bill.AccountBillBaseItemDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44776h invoke(@NotNull AccountBillBaseItemDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44776h.m99068a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44776h, Unit>() { // from class: com.kubi.assets.bill.AccountBillBaseItemDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44776h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44776h c44776h) {
            invoke(c44776h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public Object f16623V;

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m3 */
    private final void m15509m3() {
        String strM92633f;
        String strM92633f2;
        final C44776h c44776hM15511k3 = m15511k3();
        if (c44776hM15511k3 != null) {
            Object obj = this.f16623V;
            if (obj instanceof AccountDetailEntity) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.assets.entity.AccountDetailEntity");
                AccountDetailEntity accountDetailEntity = (AccountDetailEntity) obj;
                c44776hM15511k3.f100008i.setText(C42179a.m92633f(accountDetailEntity.getTradeDate(), null, false, false, null, 15, null));
                C37890n c37890n = C37890n.f85269a;
                String strM66677q = C27041f.m66677q(accountDetailEntity.getCode());
                CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(strM66677q != null ? strM66677q : "");
                C24277v.m58542g(c44776hM15511k3.f100002c, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
                BaseTextView baseTextView = c44776hM15511k3.f100005f;
                String direction = accountDetailEntity.getDirection();
                Intrinsics.checkNotNullExpressionValue(direction, "getDirection(...)");
                baseTextView.setText(m15512l3(direction));
                c44776hM15511k3.f100009j.setText(accountDetailEntity.getBizTypeNameString());
                if (Intrinsics.areEqual(accountDetailEntity.getDirection(), "IN")) {
                    c44776hM15511k3.f100003d.setText('+' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(accountDetailEntity.getAmount()), null, 1, null), accountDetailEntity.getCode(), 0, 2, null));
                } else {
                    c44776hM15511k3.f100003d.setText('-' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(accountDetailEntity.getAmount()), null, 1, null), accountDetailEntity.getCode(), 0, 2, null));
                }
                c44776hM15511k3.f100004e.setText(C27041f.m66677q(accountDetailEntity.getCurrencyName()));
                c44776hM15511k3.f100006g.setText(C37886j.m85578b(DowngradeExKt.m66535e(accountDetailEntity.getFee(), null, 1, null), accountDetailEntity.getCode(), null, false, false, false, 2, null, 0, 222, null));
                BaseTextView baseTextView2 = c44776hM15511k3.f100007h;
                String remark = accountDetailEntity.getRemark();
                baseTextView2.setText(remark != null ? remark : "--");
                return;
            }
            if (obj instanceof FundsRecordEntity) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.kumex.entity.FundsRecordEntity");
                FundsRecordEntity fundsRecordEntity = (FundsRecordEntity) obj;
                BaseTextView baseTextView3 = c44776hM15511k3.f100008i;
                Long timestamp = fundsRecordEntity.getTimestamp();
                if (timestamp == null || (strM92633f2 = C42179a.m92633f(timestamp.longValue(), null, false, false, null, 15, null)) == null) {
                    strM92633f2 = "--";
                }
                baseTextView3.setText(strM92633f2);
                C37890n c37890n2 = C37890n.f85269a;
                String strM66677q2 = C27041f.m66677q(fundsRecordEntity.getCurrency());
                CoinInfoEntity coinInfoEntityM85613u2 = c37890n2.m85613u(strM66677q2 != null ? strM66677q2 : "");
                C24277v.m58542g(c44776hM15511k3.f100002c, coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null);
                c44776hM15511k3.f100005f.setText(C9657x.m15812c(fundsRecordEntity.getSide()));
                c44776hM15511k3.f100009j.setText(fundsRecordEntity.getTypeName());
                if (Intrinsics.areEqual(fundsRecordEntity.getSide(), "IN")) {
                    c44776hM15511k3.f100003d.setText('+' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(fundsRecordEntity.getAmount()), null, 1, null), fundsRecordEntity.getCurrency(), 0, 2, null));
                } else {
                    c44776hM15511k3.f100003d.setText('-' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(fundsRecordEntity.getAmount()), null, 1, null), fundsRecordEntity.getCurrency(), 0, 2, null));
                }
                c44776hM15511k3.f100004e.setText(C27041f.m66677q(fundsRecordEntity.getCurrency()));
                c44776hM15511k3.f100006g.setText("--");
                BaseTextView baseTextView4 = c44776hM15511k3.f100007h;
                String remark2 = fundsRecordEntity.getRemark();
                baseTextView4.setText(remark2 != null ? remark2 : "--");
                return;
            }
            if (obj instanceof FinanceBillItemEntity) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.assets.entity.FinanceBillItemEntity");
                final FinanceBillItemEntity financeBillItemEntity = (FinanceBillItemEntity) obj;
                BaseTextView baseTextView5 = c44776hM15511k3.f100008i;
                Long createdAt = financeBillItemEntity.getCreatedAt();
                if (createdAt == null || (strM92633f = C42179a.m92633f(createdAt.longValue(), null, false, false, null, 15, null)) == null) {
                    strM92633f = "--";
                }
                baseTextView5.setText(strM92633f);
                C37890n c37890n3 = C37890n.f85269a;
                String strM66677q3 = C27041f.m66677q(financeBillItemEntity.getCurrency());
                CoinInfoEntity coinInfoEntityM85613u3 = c37890n3.m85613u(strM66677q3 != null ? strM66677q3 : "");
                C24277v.m58542g(c44776hM15511k3.f100002c, coinInfoEntityM85613u3 != null ? coinInfoEntityM85613u3.getIconUrl() : null);
                Integer side = financeBillItemEntity.getSide();
                if (side != null) {
                    int iIntValue = side.intValue();
                    c44776hM15511k3.f100005f.setText(iIntValue > 0 ? getString(R$string.in_account) : getString(R$string.out_account));
                    if (iIntValue > 0) {
                        c44776hM15511k3.f100003d.setText('+' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(financeBillItemEntity.getAmount()), null, 1, null), financeBillItemEntity.getCurrency(), 0, 2, null));
                    } else {
                        c44776hM15511k3.f100003d.setText('-' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(financeBillItemEntity.getAmount()), null, 1, null), financeBillItemEntity.getCurrency(), 0, 2, null));
                    }
                } else {
                    new Function0() { // from class: com.kubi.assets.bill.p
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountBillBaseItemDetailFragment.m15510n3(c44776hM15511k3, financeBillItemEntity);
                        }
                    };
                }
                c44776hM15511k3.f100009j.setText(financeBillItemEntity.getBizTypeText());
                c44776hM15511k3.f100004e.setText(C27041f.m66668h(C27041f.m66677q(financeBillItemEntity.getCurrency())));
                c44776hM15511k3.f100006g.setText(C37886j.m85578b(DowngradeExKt.m66535e(financeBillItemEntity.getFee(), null, 1, null), financeBillItemEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null));
                BaseTextView baseTextView6 = c44776hM15511k3.f100007h;
                String remark3 = financeBillItemEntity.getRemark();
                baseTextView6.setText(remark3 != null ? remark3 : "--");
            }
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m15510n3(C44776h c44776h, FinanceBillItemEntity financeBillItemEntity) {
        c44776h.f100005f.setText("--");
        c44776h.f100003d.setText(C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(financeBillItemEntity.getAmount()), null, 1, null), financeBillItemEntity.getCurrency(), 0, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public final C44776h m15511k3() {
        return (C44776h) this.f16622U.getValue(this, f16621W[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public final String m15512l3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "IN")) {
            String string = getString(R$string.in_account);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (!Intrinsics.areEqual(str, "OUT")) {
            return "--";
        }
        String string2 = getString(R$string.out_account);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m15513o3(@Nullable Object obj) {
        this.f16623V = obj;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_item_detail_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15509m3();
        C44128b.m97259c(getTAG(), "onViewCreated: " + this.f16623V);
    }
}

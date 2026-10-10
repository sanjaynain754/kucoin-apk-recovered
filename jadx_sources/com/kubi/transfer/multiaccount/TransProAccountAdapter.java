package com.kubi.transfer.multiaccount;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.C26430u0;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.multiaccount.TransProAccountAdapter;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TransProDialogFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00020\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/transfer/multiaccount/TransProAccountAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/transfer/entity/AccountItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isFrom", "", "coin", "", "datas", "", "isMultiAccountMode", "fromSymbolBean", "toSymbolBean", "selectItemCallBack", "Lkotlin/Function1;", "", "<init>", "(ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getAccountsOrder", "", "kotlin.jvm.PlatformType", "getItemCount", "", "convert", "helper", "item", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransProDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProAccountAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n774#2:460\n865#2,2:461\n*S KotlinDebug\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProAccountAdapter\n*L\n407#1:460\n407#1:461,2\n*E\n"})
public final class TransProAccountAdapter extends BaseItemDraggableAdapter<AccountItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final boolean f52808i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f52809j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<AccountItem> f52810k;

    /* JADX INFO: renamed from: l */
    public boolean f52811l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final String f52812m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final String f52813n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Function1<AccountItem, Unit> f52814o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransProAccountAdapter(boolean z11, @Nullable String str, @NotNull List<AccountItem> datas, boolean z12, @Nullable String str2, @Nullable String str3, @NotNull Function1<? super AccountItem, Unit> selectItemCallBack) {
        super(R$layout.trans_pro_account_item, datas);
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(selectItemCallBack, "selectItemCallBack");
        this.f52808i = z11;
        this.f52809j = str;
        this.f52810k = datas;
        this.f52811l = z12;
        this.f52812m = str2;
        this.f52813n = str3;
        this.f52814o = selectItemCallBack;
    }

    /* JADX INFO: renamed from: i */
    public static final void m64606i(TransProAccountAdapter transProAccountAdapter, AccountItem accountItem, View view) {
        if (transProAccountAdapter.f52811l && transProAccountAdapter.f52808i) {
            return;
        }
        transProAccountAdapter.f52814o.invoke(accountItem);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f52810k.size();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final AccountItem item) {
        String str;
        BigDecimal availableBalance;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = helper.itemView.getContext();
        String string = context.getString(item.getAccountType().getStrRes());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SingleCurrencyBalance singleCurrencyBalance = item.getSingleCurrencyBalance();
        String strM66668h = C27041f.m66668h((singleCurrencyBalance == null || (availableBalance = singleCurrencyBalance.getAvailableBalance()) == null) ? null : C37885i.m85570i(availableBalance, item.getSingleCurrencyBalance().getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null));
        AccountType accountType = item.getAccountType();
        AccountType accountType2 = AccountType.ISOLATED;
        if (accountType == accountType2 && item.getChecked()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            if (this.f52808i && !StringsKt.isBlank(C27041f.m66668h(this.f52812m))) {
                str = '(' + C27041f.m66668h(this.f52812m) + ')';
            } else if (this.f52808i || StringsKt.isBlank(C27041f.m66668h(this.f52813n))) {
                str = "";
            } else {
                str = '(' + C27041f.m66668h(this.f52813n) + ')';
            }
            sb2.append(str);
            string = sb2.toString();
        }
        helper.setText(R$id.accountName, string);
        int i11 = R$id.accountMoney;
        helper.setText(i11, strM66668h + ' ' + C26430u0.m64778a(this.f52809j));
        if (item.getAccountType() == accountType2) {
            helper.setText(i11, context.getString(R$string.transfer_isolatelever_balance_tip));
        }
        View view = helper.getView(R$id.accountIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C26268b.m64513b((ImageView) view, item.getAccountType());
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: d60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransProAccountAdapter.m64606i(this.f79434b, item, view2);
            }
        });
        if (this.f52811l && this.f52808i) {
            View view2 = helper.getView(R$id.dragIcon);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            C26268b.m64515d(view2, true);
            View view3 = helper.getView(R$id.selectedIcon);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            C26268b.m64515d(view3, false);
        } else {
            View view4 = helper.getView(R$id.dragIcon);
            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
            C26268b.m64515d(view4, false);
            if (item.getChecked()) {
                View view5 = helper.getView(R$id.selectedIcon);
                Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
                C26268b.m64515d(view5, true);
            } else {
                View view6 = helper.getView(R$id.selectedIcon);
                Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
                C26268b.m64515d(view6, false);
            }
        }
        View view7 = helper.getView(R$id.rightArrow);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C26268b.m64515d(view7, item.getAccountType() == accountType2);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<AccountItem> m64608j() {
        List<AccountItem> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((AccountItem) obj).getAccountType() != AccountType.ISOLATED) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

package com.kubi.assets.detail;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.C9459a;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k00.C40846j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: RecordDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020'H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/detail/RecordDetailFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/sdk/res/databinding/KucoinViewRecyclerviewBinding;", "getBinding", "()Lcom/kubi/sdk/res/databinding/KucoinViewRecyclerviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "dataList", "", "Landroidx/core/util/Pair;", "", "", "mPattern", "Ljava/util/regex/Pattern;", "iconUrl", "isFutures", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getContent", "Landroid/text/SpannableString;", "content", "initDataList", "parcelable", "Landroid/os/Parcelable;", "getRemarkOrSymbol", "record", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordDetailFragment.kt\ncom/kubi/assets/detail/RecordDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,216:1\n147#2,16:217\n*S KotlinDebug\n*F\n+ 1 RecordDetailFragment.kt\ncom/kubi/assets/detail/RecordDetailFragment\n*L\n51#1:217,16\n*E\n"})
public final class RecordDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f16881Z = {Reflection.property1(new PropertyReference1Impl(RecordDetailFragment.class, "binding", "getBinding()Lcom/kubi/sdk/res/databinding/KucoinViewRecyclerviewBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f16882U = C45681e.m100799e(this, new Function1<RecordDetailFragment, C40846j>() { // from class: com.kubi.assets.detail.RecordDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C40846j invoke(@NotNull RecordDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C40846j.m89391a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C40846j, Unit>() { // from class: com.kubi.assets.detail.RecordDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C40846j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40846j c40846j) {
            invoke(c40846j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final List<Pair<String, CharSequence>> f16883V = new ArrayList();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Pattern f16884W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f16885X;

    /* JADX INFO: renamed from: Y */
    public boolean f16886Y;

    /* JADX INFO: renamed from: l3 */
    public final C40846j m15949l3() {
        return (C40846j) this.f16882U.getValue(this, f16881Z[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m15952o3(Parcelable parcelable) {
        String remark;
        if (!(parcelable instanceof AccountDetailEntity)) {
            if (parcelable instanceof FundsRecordEntity) {
                FundsRecordEntity fundsRecordEntity = (FundsRecordEntity) parcelable;
                this.f16883V.add(new Pair<>(fundsRecordEntity.getFormatAmount(), C27041f.m66677q(C27041f.m66668h(fundsRecordEntity.getCurrency()))));
                this.f16883V.add(new Pair<>(getString(R$string.time), C42179a.m92633f(C27039d.m66652l(fundsRecordEntity.getTimestamp()), null, false, false, null, 15, null)));
                this.f16883V.add(new Pair<>(getString(R$string.type), fundsRecordEntity.getTypeName()));
                CharSequence charSequenceM15951n3 = m15951n3(fundsRecordEntity);
                if (charSequenceM15951n3 != null) {
                    this.f16883V.add(new Pair<>(getString(R$string.note), charSequenceM15951n3));
                }
                C37890n c37890n = C37890n.f85269a;
                String currency = fundsRecordEntity.getCurrency();
                CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency != null ? currency : "");
                this.f16885X = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
                this.f16886Y = true;
                return;
            }
            return;
        }
        List<Pair<String, CharSequence>> list = this.f16883V;
        StringBuilder sb2 = new StringBuilder();
        AccountDetailEntity accountDetailEntity = (AccountDetailEntity) parcelable;
        sb2.append(accountDetailEntity.getDirectionSymbol());
        sb2.append(C37886j.m85578b(new BigDecimal(String.valueOf(accountDetailEntity.getAmount())), accountDetailEntity.getCode(), null, false, false, false, 2, null, 0, 222, null));
        list.add(new Pair<>(sb2.toString(), accountDetailEntity.getCoinName()));
        this.f16883V.add(new Pair<>(getString(R$string.time), C42179a.m92633f(C27039d.m66652l(Long.valueOf(accountDetailEntity.getTradeDate())), null, false, false, null, 15, null)));
        this.f16883V.add(new Pair<>(getString(R$string.direction), accountDetailEntity.getDirectionString(getContext())));
        this.f16883V.add(new Pair<>(getString(R$string.type), accountDetailEntity.getBizTypeNameString()));
        this.f16883V.add(new Pair<>(getString(R$string.fee), C37886j.m85578b(DowngradeExKt.m66535e(accountDetailEntity.getFee(), null, 1, null), accountDetailEntity.getCode(), null, false, false, false, 2, null, 0, 222, null) + ' ' + accountDetailEntity.getCoinName()));
        if (accountDetailEntity.getTax() != null) {
            String tax = accountDetailEntity.getTax();
            Intrinsics.checkNotNullExpressionValue(tax, "getTax(...)");
            if (tax.length() > 0) {
                this.f16883V.add(new Pair<>(getString(R$string.kumex_tax), C37886j.m85578b(DowngradeExKt.m66535e(accountDetailEntity.getTax(), null, 1, null), accountDetailEntity.getCode(), null, false, false, false, 2, null, 0, 222, null) + ' ' + accountDetailEntity.getCoinName()));
            }
        }
        if (!Intrinsics.areEqual(accountDetailEntity.getBizType(), AccountDetailEntity.FLASH_TRADE) && (remark = accountDetailEntity.getRemark()) != null && remark.length() != 0) {
            this.f16883V.add(new Pair<>(getString(R$string.remark), accountDetailEntity.getRemark()));
        }
        C37890n c37890n2 = C37890n.f85269a;
        String code = accountDetailEntity.getCode();
        CoinInfoEntity coinInfoEntityM85613u2 = c37890n2.m85613u(code != null ? code : "");
        this.f16885X = coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_view_recyclerview, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C40846j c40846jM15949l3 = m15949l3();
        if (c40846jM15949l3 != null && (recyclerView2 = c40846jM15949l3.f90771b) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        C40846j c40846jM15949l4 = m15949l3();
        if (c40846jM15949l4 != null && (recyclerView = c40846jM15949l4.f90771b) != null) {
            recyclerView.setPadding(C5275i0.m6236a(12.0f), C5275i0.m6236a(30.0f), C5275i0.m6236a(12.0f), 0);
        }
        if (getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        m15952o3(arguments != null ? arguments.getParcelable("data") : null);
        C40846j c40846jM15949l5 = m15949l3();
        Intrinsics.checkNotNull(c40846jM15949l5);
        c40846jM15949l5.f90771b.setAdapter(new BaseQuickAdapter<Pair<String, CharSequence>, BaseViewHolder>(R$layout.kucoin_asset_item_detail, this.f16883V) { // from class: com.kubi.assets.detail.RecordDetailFragment.onViewCreated.1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, Pair<String, CharSequence> item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                int i11 = R$id.ivIcon;
                BaseViewHolder text = helper.setGone(i11, helper.getAdapterPosition() == 0).setGone(R$id.ll_head, helper.getAdapterPosition() == 0).setGone(R$id.divider, helper.getAdapterPosition() == 0).setText(R$id.tv_amount, item.first).setText(R$id.tv_coin_name, item.second);
                int i12 = R$id.tv_label;
                BaseViewHolder gone = text.setGone(i12, helper.getAdapterPosition() != 0);
                int i13 = R$id.tv_content;
                gone.setGone(i13, helper.getAdapterPosition() != 0).setText(i12, item.first);
                TextView textView = (TextView) helper.getView(i13);
                textView.setText(RecordDetailFragment.this.m15950m3(item.second));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                if (helper.getAdapterPosition() == 0) {
                    C24277v.m58542g((ImageView) helper.getView(i11), RecordDetailFragment.this.f16885X);
                }
            }
        });
    }

    public RecordDetailFragment() {
        Pattern patternCompile = Pattern.compile("https?://(\\w+.)+\\w+");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this.f16884W = patternCompile;
    }

    /* JADX INFO: renamed from: m3 */
    public final SpannableString m15950m3(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableString("");
        }
        Matcher matcher = this.f16884W.matcher(charSequence);
        if (!matcher.find()) {
            return new SpannableString(charSequence);
        }
        String strM66668h = C27041f.m66668h(matcher.group(0));
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) String.valueOf(charSequence), strM66668h, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new URLSpan(strM66668h), iLastIndexOf$default, strM66668h.length() + iLastIndexOf$default, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.primary)), iLastIndexOf$default, strM66668h.length() + iLastIndexOf$default, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: n3 */
    public final CharSequence m15951n3(FundsRecordEntity fundsRecordEntity) {
        String strM66668h = C27041f.m66668h(fundsRecordEntity.getRemark());
        if (strM66668h.length() == 0 || !C9459a.m15238a()) {
            return null;
        }
        return AssetsDepend.m19180c().mo33255D(strM66668h, false);
    }
}

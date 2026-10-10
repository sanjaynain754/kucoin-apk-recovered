package com.kubi.assets.history;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.service.C10921d;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27014a1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.StringEx;
import f00.C37304a;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import p013ab.C0226a;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44855r4;

/* JADX INFO: loaded from: classes6.dex */
public class InOutHistoryFragment extends BasePagingFragment<HistoryRecordEntity> {

    /* JADX INFO: renamed from: Z */
    public C44855r4 f17629Z;

    /* JADX INFO: renamed from: a0 */
    public int f17630a0;

    /* JADX INFO: renamed from: c0 */
    public AssetV2Api f17632c0;

    /* JADX INFO: renamed from: b0 */
    public String f17631b0 = "";

    /* JADX INFO: renamed from: d0 */
    public String f17633d0 = "ALL";

    /* JADX INFO: renamed from: e0 */
    public String f17634e0 = "";

    /* JADX INFO: renamed from: f0 */
    public final HashMap<String, String> f17635f0 = new HashMap<>();

    /* JADX INFO: renamed from: g0 */
    public TimeUtils.C27004b f17636g0 = new TimeUtils.C27004b();

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: O3 */
    public static InOutHistoryFragment m17293O3(int i11, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i11);
        bundle.putString("data", str);
        InOutHistoryFragment inOutHistoryFragment = new InOutHistoryFragment();
        inOutHistoryFragment.setArguments(bundle);
        return inOutHistoryFragment;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f17636g0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(BaseViewHolder baseViewHolder, final HistoryRecordEntity historyRecordEntity) {
        String str;
        final boolean z11 = this.f17630a0 == 2;
        if (z11 || historyRecordEntity.isInner || !("PROCESSING".equals(historyRecordEntity.status) || "REVIEW".equals(historyRecordEntity.status) || "WALLET_PROCESSING".equals(historyRecordEntity.status) || "PRE_SUCCESS".equals(historyRecordEntity.status))) {
            str = "";
        } else {
            str = "(" + historyRecordEntity.getConfirmationStr() + "/" + historyRecordEntity.getConfirmationCountStr() + ")";
        }
        BaseViewHolder text = baseViewHolder.setText(R$id.tv_coin_name, StringEx.m66553a(historyRecordEntity.currencyName));
        int i11 = R$id.tv_status;
        text.setText(i11, historyRecordEntity.getStatusString(getContext(), z11, historyRecordEntity, false) + str).setTextColor(i11, getColorRes(historyRecordEntity.getStatusColor(false, historyRecordEntity))).setText(R$id.tv_amount, historyRecordEntity.amountFormat()).setText(R$id.tv_time, historyRecordEntity.getTimeString());
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.history.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z12 = z11;
                C37304a.f82764a.mo83738j(historyRecordEntity.id, z12 ? "1" : "0", C43852m.m96601m("historyRecord", z12 ? ChannelKycRequest.SCENE_WITHDRAW : ChannelKycRequest.SCENE_DEPOSIT, "1"), null, null);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final void m17295P3(TextView textView) {
        C27014a1.m66504d(textView, R$drawable.ic_triangle_bottom_12, GravityCompat.END);
        C27046k.m66702q(textView, getColorRes(R$color.c_icon60));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_in_out_his;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<HistoryRecordEntity>> mo16440r3(int i11, int i12) {
        this.f17635f0.clear();
        if (!TextUtils.isEmpty(this.f17631b0)) {
            this.f17635f0.put(FirebaseAnalytics.Param.CURRENCY, this.f17631b0);
        }
        this.f17635f0.put("startAt", FilterTimeHelper.f17645a.m17312c(this.f17633d0, this.f17636g0));
        this.f17635f0.put("endAt", "ALL".equals(this.f17633d0) ? "" : this.f17636g0.f54265b);
        if (!TextUtils.isEmpty(this.f17634e0)) {
            this.f17635f0.put("status", this.f17634e0);
        }
        this.f17635f0.put("page", i11 + "");
        this.f17635f0.put("size", i12 + "");
        this.f17635f0.put("mergeKucoinKumex", CredentialEntry.TRUE_STRING);
        int i13 = this.f17630a0;
        if (i13 == 1) {
            this.f17635f0.put("version", "3");
            return this.f17632c0.m17086I(this.f17635f0).compose(C24217a1.m58389m());
        }
        if (i13 != 2) {
            return null;
        }
        return this.f17632c0.m17149n0(this.f17635f0).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_in_out_his;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: y3 */
    public int mo17296y3() {
        return 20;
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m17287H3(InOutHistoryFragment inOutHistoryFragment, C23034a c23034a, List list) {
        inOutHistoryFragment.getClass();
        String f44545b = ((FilterType.InterfaceC23033b) list.get(1)).getF44545b();
        if (!f44545b.equals("ALL") && !TextUtils.isEmpty(f44545b)) {
            if (!inOutHistoryFragment.f17633d0.equals(f44545b)) {
                inOutHistoryFragment.f17629Z.f100747m.setVisibility(8);
            }
        } else {
            inOutHistoryFragment.f17629Z.f100747m.setVisibility(0);
        }
        inOutHistoryFragment.f17634e0 = ((FilterType.InterfaceC23033b) list.get(0)).getF44545b();
        inOutHistoryFragment.f17633d0 = ((FilterType.InterfaceC23033b) list.get(1)).getF44545b();
        if (inOutHistoryFragment.f17634e0.isEmpty() && inOutHistoryFragment.f17633d0.isEmpty()) {
            c23034a.m55165i(R$color.c_text40);
        } else {
            c23034a.m55165i(R$color.primary);
        }
        inOutHistoryFragment.mo15906F3();
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m17291L3(InOutHistoryFragment inOutHistoryFragment, Intent intent) {
        inOutHistoryFragment.getClass();
        if (intent != null) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) intent.getParcelableExtra(CoinInfoEntity.class.getName());
            inOutHistoryFragment.f17631b0 = coinInfoEntity.getCode();
            inOutHistoryFragment.f17629Z.f100744j.setText(C10921d.m19190a(coinInfoEntity.getCurrency()));
            inOutHistoryFragment.mo15906F3();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() == null) {
            return;
        }
        this.f17630a0 = getArguments().getInt("type", 0);
        this.f17631b0 = getArguments().getString("data", "");
        this.f17632c0 = (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f17629Z = null;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        boolean z11;
        super.onViewCreated(view, bundle);
        C44855r4 c44855r4M99234a = C44855r4.m99234a(this.mContentView);
        this.f17629Z = c44855r4M99234a;
        c44855r4M99234a.f100741g.setVisibility(0);
        this.f17629Z.f100741g.setNew(Boolean.TRUE);
        final C23034a c23034a = new C23034a();
        c23034a.m55165i(R$color.c_text40);
        C44855r4 c44855r4 = this.f17629Z;
        c23034a.m55160d(c44855r4.f100746l, c44855r4.f100741g);
        m17295P3(this.f17629Z.f100744j);
        ArrayList arrayList = new ArrayList();
        String string = getString(R$string.status);
        FilterType.Companion companion = FilterType.f44543a;
        Context contextRequireContext = requireContext();
        if (this.f17630a0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(new C23034a.a(string, companion.convert2Filter(HistoryRecordEntity.getStatusTypeMap(contextRequireContext, z11), true), 2));
        arrayList.add(new C23034a.a(getString(R$string.time), companion.convert2Filter(FilterTimeHelper.f17645a.m17311b(requireContext()), true)));
        c23034a.m55164h(arrayList, new Consumer() { // from class: com.kubi.assets.history.q0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutHistoryFragment.m17287H3(this.f17693b, c23034a, (List) obj);
            }
        });
        if (!TextUtils.isEmpty(this.f17631b0)) {
            this.f17629Z.f100744j.setText(C10921d.m19190a(this.f17631b0));
        }
        this.f17629Z.f100744j.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.history.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InOutHistoryFragment inOutHistoryFragment = this.f17697b;
                inOutHistoryFragment.startActivityWithResult(C0226a.m831a(inOutHistoryFragment.requireContext(), Integer.valueOf(inOutHistoryFragment.f17630a0)), new Consumer() { // from class: com.kubi.assets.history.u0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        InOutHistoryFragment.m17291L3(inOutHistoryFragment, (Intent) obj);
                    }
                });
            }
        });
        this.f46496X.getRecyclerView().setBackgroundResource(R$color.c_overlay);
        if (this.f17630a0 == 1) {
            this.f17629Z.f100736b.setVisibility(0);
            this.f17629Z.f100743i.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.history.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AssetsHelper.f18684a.m19151D();
                }
            });
        } else {
            this.f17629Z.f100736b.setVisibility(8);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        this.f17629Z.f100738d.setVisibility(8);
        this.f17629Z.f100747m.setVisibility(0);
        this.f17629Z.f100747m.setText(String.format(getString(R$string.assets_history_oneyear_tip), "1"));
        C43841b.m96556c("B1overview_charge_record_load", "page_load_end", "");
        if (this.f17630a0 == 2 && IAssetsCenterService.f16464a.get().mo15334D() && C24129b.m58030b(SiteVisibleConfigKey.DelistingCoinClaimRecord)) {
            this.f17629Z.f100737c.setVisibility(0);
        } else {
            this.f17629Z.f100737c.setVisibility(8);
        }
        this.f17629Z.f100737c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.history.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InOutHistoryHelper.m17330a();
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showContent();
        this.f17629Z.f100738d.setVisibility(0);
        this.f17629Z.f100747m.setVisibility(8);
        this.f17629Z.f100745k.setText(String.format(getString(R$string.assets_history_oneyear_tip), "1"));
    }
}

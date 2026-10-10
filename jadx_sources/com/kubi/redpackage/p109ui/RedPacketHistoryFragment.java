package com.kubi.redpackage.p109ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$mipmap;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.entity.RedPackageRecord;
import com.kubi.redpackage.entity.RedPackageTotal;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37767s;
import gf.C37885i;
import i10.Menu;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPacketHistoryFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0014J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0014J\b\u0010&\u001a\u00020\u0014H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedPacketHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/redpackage/entity/RedPackageRecord;", "<init>", "()V", "typeList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "Lkotlin/collections/ArrayList;", "isSend", "", "redPackageApi", "Lcom/kubi/redpackage/RedPackageApi;", "getRedPackageApi", "()Lcom/kubi/redpackage/RedPackageApi;", "redPackageApi$delegate", "Lkotlin/Lazy;", "headerView", "Landroid/view/View;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "savedInstanceState", "Landroid/os/Bundle;", "setHeader", "loadData", "getHeaderInfo", "getItemLayout", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "showRedPacketTypeDialog", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RedPacketHistoryFragment extends BasePagingFragment<RedPackageRecord> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f43158d0 = 0;

    /* JADX INFO: renamed from: a0 */
    public boolean f43160a0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public View f43162c0;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final ArrayList<SelectEntity> f43159Z = new ArrayList<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f43161b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketHistoryFragment.m53788Z3();
        }
    });

    /* JADX INFO: renamed from: S3 */
    public static final Unit m53782S3(RedPackageRecord redPackageRecord) {
        Integer status;
        InterfaceC37767s.a.m85193b(C37304a.f82764a, C27041f.m66668h(redPackageRecord.getId()), Boolean.TRUE, Boolean.valueOf(C27039d.m66650j(redPackageRecord.getReceiveNum()) < C27039d.m66650j(redPackageRecord.getSendNum()) && ((status = redPackageRecord.getStatus()) == null || status.intValue() != 3)), C27041f.m66668h(redPackageRecord.getCode()), null, null, null, 112, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m53783T3(RedPackageRecord redPackageRecord) {
        InterfaceC37767s.a.m85193b(C37304a.f82764a, C27041f.m66668h(redPackageRecord.getSendRecordId()), Boolean.TRUE, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m53784V3(RedPacketHistoryFragment redPacketHistoryFragment, RedPackageTotal redPackageTotal) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        View view = redPacketHistoryFragment.f43162c0;
        if (view != null && (textView4 = (TextView) view.findViewById(R$id.tv_total_size)) != null) {
            textView4.setText(!redPacketHistoryFragment.f43160a0 ? C27017c.f54310a.m66516f(R$string.total_recieved_redpacket, redPackageTotal.getWelfareTotalNum()) : C27017c.f54310a.m66516f(R$string.total_send_redpacket, redPackageTotal.getTargetTotalNum()));
        }
        View view2 = redPacketHistoryFragment.f43162c0;
        if (view2 != null && (textView3 = (TextView) view2.findViewById(R$id.tv_total_amount)) != null) {
            textView3.setText(C37885i.m85571j(C27039d.m66647g(redPackageTotal.getTargetTotalAmount()), redPackageTotal.getTargetCurrency(), null, false, false, false, false, null, 126, null));
        }
        View view3 = redPacketHistoryFragment.f43162c0;
        if (view3 != null && (textView2 = (TextView) view3.findViewById(R$id.tv_total_currency)) != null) {
            textView2.setText(redPackageTotal.getTargetCurrency());
        }
        View view4 = redPacketHistoryFragment.f43162c0;
        if (view4 != null && (textView = (TextView) view4.findViewById(R$id.tv_total_price)) != null) {
            textView.setText(C41014a.m89948v(C41014a.m89939m(C27039d.m66647g(redPackageTotal.getTargetTotalAmount()), redPackageTotal.getTargetCurrency()), null, null, 0, false, true, false, 47, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    private final RedPackageApi m53786X3() {
        Object value = this.f43161b0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RedPackageApi) value;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m53789b4(RedPacketHistoryFragment redPacketHistoryFragment, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.redpackage.ui.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketHistoryFragment.m53790c4(dialogFragmentHelper);
            }
        }, 1, null);
        recyclerView.setAdapter(new RedPacketHistoryFragment$showRedPacketTypeDialog$1$2(redPacketHistoryFragment, dialogFragmentHelper, R$layout.kucoin_item_simple_text, redPacketHistoryFragment.f43159Z));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: A3 */
    public void mo49243A3() {
        if (this.f46493U == 1) {
            m53792U3();
        }
        super.mo49243A3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final RedPackageRecord item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = helper.setText(R$id.tv_currency, item.getCurrencyName());
        int i11 = R$id.tv_type;
        Integer welfareType = item.getWelfareType();
        BaseViewHolder gone = text.setGone(i11, welfareType != null && welfareType.intValue() == 0);
        Integer welfareType2 = item.getWelfareType();
        gone.setText(i11, (welfareType2 != null && welfareType2.intValue() == 0) ? R$string.random : R$string.ordinary);
        if (!this.f43160a0) {
            helper.setText(R$id.tv_sender_str, R$string.sender).setText(R$id.tv_number_str, R$string.receive_qty).setText(R$id.tv_number, C37885i.m85571j(C27039d.m66647g(item.getReceiveAmount()), item.getCurrency(), null, false, false, false, false, null, 126, null)).setText(R$id.tv_date, TimeUtils.m66422i(C27039d.m66652l(item.getReceiveAt()))).setText(R$id.tv_sender, item.getSendNickName()).setText(R$id.tv_price, C41014a.m89948v(C41014a.m89939m(C27039d.m66647g(item.getReceiveAmount()), item.getCurrency()), null, null, 0, false, true, false, 47, null));
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.redpackage.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketHistoryFragment.m53783T3(item);
                }
            }, 1, null);
            return;
        }
        BaseViewHolder text2 = helper.setText(R$id.tv_sender_str, R$string.redpacket_number).setText(R$id.tv_number_str, R$string.send_qty).setText(R$id.tv_number, C37885i.m85571j(C27039d.m66647g(item.getSendAmount()), item.getCurrency(), null, false, false, false, false, null, 126, null)).setText(R$id.tv_date, TimeUtils.m66422i(C27039d.m66652l(item.getStartAt())));
        int i12 = R$id.tv_sender;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C27039d.m66650j(item.getReceiveNum()));
        sb2.append('/');
        sb2.append(item.getSendNum());
        text2.setText(i12, sb2.toString()).setText(R$id.tv_price, C41014a.m89948v(C41014a.m89939m(C27039d.m66647g(item.getSendAmount()), item.getCurrency()), null, null, 0, false, true, false, 47, null));
        View itemView2 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        C27046k.m66711z(itemView2, 0L, new Function0() { // from class: com.kubi.redpackage.ui.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketHistoryFragment.m53782S3(item);
            }
        }, 1, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: U3 */
    public final void m53792U3() {
        Observable observableCompose = (this.f43160a0 ? RedPackageApi.m53726d(m53786X3(), null, 1, null) : RedPackageApi.m53728h(m53786X3(), null, 1, null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketHistoryFragment.m53784V3(this.f43232b, (RedPackageTotal) obj);
            }
        };
        addSubscription(observableCompose.subscribe(new Consumer() { // from class: com.kubi.redpackage.ui.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketHistoryFragment.m53785W3(function1, obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m53793a4() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bredpackage_view_recycleview, true).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketHistoryFragment.m53789b4(this.f43250b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "chooseSendType");
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle(getString(R$string.my_redpacket));
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$mipmap.bredpackage_ic_more_white), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.redpackage.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RedPacketHistoryFragment.m53787Y3(this.f43224b, view2);
            }
        }, 0, 377, null));
        ArrayList<SelectEntity> arrayList = this.f43159Z;
        String string = getString(R$string.my_send);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new SelectEntity(null, string, null, null, null, null, null, null, null, false, this.f43160a0, null, 3069, null));
        ArrayList<SelectEntity> arrayList2 = this.f43159Z;
        String string2 = getString(R$string.my_recieved);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList2.add(new SelectEntity(null, string2, null, null, null, null, null, null, null, false, !this.f43160a0, null, 3069, null));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<RedPackageRecord>> mo16440r3(int i11, int i12) {
        if (this.f43160a0) {
            Observable observableCompose = m53786X3().m53741q(i12, i11).compose(C24217a1.m58389m());
            Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
            return observableCompose;
        }
        Observable observableCompose2 = m53786X3().m53732e(i12, i11).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose2, "compose(...)");
        return observableCompose2;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bredpackage_item_redpacket_record;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m53785W3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m53787Y3(RedPacketHistoryFragment redPacketHistoryFragment, View view) {
        redPacketHistoryFragment.m53793a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public static final RedPackageApi m53788Z3() {
        return (RedPackageApi) C42597a.m93386b().create(RedPackageApi.class);
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m53790c4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        View viewInflate = getLayoutInflater().inflate(R$layout.bredpackage_view_record_header, (ViewGroup) null);
        this.f43162c0 = viewInflate;
        this.f46495W.addHeaderView(viewInflate);
    }
}

package com.kubi.kucoin.feature.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p265fl.C37565d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/feature/widget/ChooseSymbolFragment$showEditDialog$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChooseSymbolFragment$showEditDialog$1$1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ChooseSymbolFragment f27789i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f27790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseSymbolFragment$showEditDialog$1$1(ChooseSymbolFragment chooseSymbolFragment, DialogFragmentHelper dialogFragmentHelper, int i11, List<String> list) {
        super(i11, list);
        this.f27789i = chooseSymbolFragment;
        this.f27790j = dialogFragmentHelper;
    }

    /* JADX INFO: renamed from: k */
    public static final void m32107k(String str, ChooseSymbolFragment$showEditDialog$1$1 chooseSymbolFragment$showEditDialog$1$1, ChooseSymbolFragment chooseSymbolFragment, DialogFragmentHelper dialogFragmentHelper, View view) throws Throwable {
        FloatingWindowConfigManager.f34272a.m40726c(str);
        chooseSymbolFragment$showEditDialog$1$1.notifyDataSetChanged();
        chooseSymbolFragment.m32103z3();
        chooseSymbolFragment.m32101E3();
        if (C37565d.f83517a.m84603i().isEmpty()) {
            dialogFragmentHelper.dismiss();
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, String item) {
        final String str;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.llRoot;
        ((ViewGroup) helper.getView(i11)).setPadding(C5275i0.m6236a(10.0f), 0, C5275i0.m6236a(10.0f), 0);
        int i12 = R$id.tv_trade_pair;
        C37565d c37565d = C37565d.f83517a;
        String strM66669i = c37565d.m84602h().get(item);
        if (strM66669i == null) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(item);
            str = item;
            strM66669i = C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, StringsKt.replace$default(str, C33820nf.f71144W, "/", false, 4, (Object) null));
            c37565d.m84602h().put(str, strM66669i);
            Unit unit = Unit.INSTANCE;
        } else {
            str = item;
        }
        BaseViewHolder text = helper.setText(i12, strM66669i);
        int i13 = R$id.iv_check;
        BaseViewHolder onTouchListener = text.setChecked(i13, c37565d.m84599e(str)).setVisible(R$id.ll_center, false).setOnTouchListener(i13, new View.OnTouchListener() { // from class: com.kubi.kucoin.feature.widget.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChooseSymbolFragment$showEditDialog$1$1.m32106j(helper, view, motionEvent);
            }
        });
        final ChooseSymbolFragment chooseSymbolFragment = this.f27789i;
        final DialogFragmentHelper dialogFragmentHelper = this.f27790j;
        onTouchListener.setOnClickListener(i11, new View.OnClickListener() { // from class: com.kubi.kucoin.feature.widget.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                ChooseSymbolFragment$showEditDialog$1$1.m32107k(str, this, chooseSymbolFragment, dialogFragmentHelper, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m32106j(BaseViewHolder baseViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            baseViewHolder.getView(R$id.llRoot).performClick();
        }
        return true;
    }
}

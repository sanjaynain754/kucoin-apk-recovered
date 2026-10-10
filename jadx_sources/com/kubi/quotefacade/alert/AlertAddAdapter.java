package com.kubi.quotefacade.alert;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.quotefacade.R$attr;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.AlertEntity;
import com.kubi.resources.C22890g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AlertAddAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0015R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/alert/AlertAddAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/AlertEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "deleteListener", "Lkotlin/Function2;", "", "", "getDeleteListener", "()Lkotlin/jvm/functions/Function2;", "setDeleteListener", "(Lkotlin/jvm/functions/Function2;)V", "changeStatusListener", "Lkotlin/Function3;", "", "getChangeStatusListener", "()Lkotlin/jvm/functions/Function3;", "setChangeStatusListener", "(Lkotlin/jvm/functions/Function3;)V", "convert", "helper", "item", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlertAddAdapter extends BaseQuickAdapter<AlertEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function2<? super AlertEntity, ? super Integer, Unit> f41064i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function3<? super AlertEntity, ? super Integer, ? super Boolean, Unit> f41065j;

    public AlertAddAdapter() {
        super(R$layout.kucoin_item_add_alert);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m50229j(AlertAddAdapter alertAddAdapter, AlertEntity alertEntity, BaseViewHolder baseViewHolder, SwitchCompat switchCompat) {
        Function3<? super AlertEntity, ? super Integer, ? super Boolean, Unit> function3 = alertAddAdapter.f41065j;
        if (function3 != null) {
            function3.invoke(alertEntity, Integer.valueOf(baseViewHolder.getAdapterPosition()), Boolean.valueOf(switchCompat.isChecked()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m50230k(AlertAddAdapter alertAddAdapter, AlertEntity alertEntity, BaseViewHolder baseViewHolder) {
        Function2<? super AlertEntity, ? super Integer, Unit> function2 = alertAddAdapter.f41064i;
        if (function2 != null) {
            function2.invoke(alertEntity, Integer.valueOf(baseViewHolder.getAdapterPosition() - alertAddAdapter.getHeaderLayoutCount()));
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final AlertEntity item) {
        BigDecimal bigDecimalM66654n;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(C27041f.m66668h(item.getSymbol()));
        String strM92642g = null;
        if (tradeItemBeanM85603D != null) {
            helper.setText(R$id.tv_coin, tradeItemBeanM85603D.getShowSymbol());
        } else {
            String symbol = item.getSymbol();
            List listSplit$default = symbol != null ? StringsKt.split$default((CharSequence) symbol, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null) : null;
            if (listSplit$default != null && listSplit$default.size() == 2) {
                helper.setText(R$id.tv_coin, ((String) listSplit$default.get(0)) + '/' + ((String) listSplit$default.get(1)));
            }
        }
        TextView textView = (TextView) helper.getView(R$id.tv_up_down);
        TextView textView2 = (TextView) helper.getView(R$id.tv_data);
        ImageView imageView = (ImageView) helper.getView(R$id.iv_icon);
        final SwitchCompat switchCompat = (SwitchCompat) helper.getView(R$id.switch_alert);
        switchCompat.setChecked(item.isOpenStatus());
        Integer type = item.getType();
        if (type != null && type.intValue() == 1) {
            Double warnAmount = item.getWarnAmount();
            textView2.setText(warnAmount != null ? C37886j.m85579c(new BigDecimal(String.valueOf(warnAmount.doubleValue())), item.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null);
            Integer warnType = item.getWarnType();
            if (warnType != null && warnType.intValue() == 0) {
                C27017c c27017c = C27017c.f54310a;
                textView.setText(c27017c.m66516f(R$string.up_to, new Object[0]));
                imageView.setImageResource(R$mipmap.bkucoin_ic_alert_up);
                Intrinsics.checkNotNull(imageView);
                C27046k.m66701p(imageView, C22890g.m54277b(c27017c.m66513b(), R$attr.upColor));
            } else if (warnType != null && warnType.intValue() == 1) {
                C27017c c27017c2 = C27017c.f54310a;
                textView.setText(c27017c2.m66516f(R$string.down_to, new Object[0]));
                imageView.setImageResource(R$mipmap.bkucoin_ic_alert_down);
                Intrinsics.checkNotNull(imageView);
                C27046k.m66701p(imageView, C22890g.m54277b(c27017c2.m66513b(), R$attr.downColor));
            }
        } else if (type != null && type.intValue() == 2) {
            BigDecimal bigDecimalM66671k = C27041f.m66671k(item.getThreshold());
            if (bigDecimalM66671k != null && (bigDecimalM66654n = C27039d.m66654n(bigDecimalM66671k)) != null) {
                strM92642g = C42180b.m92642g(bigDecimalM66654n, null, null, 0, false, false, false, 63, null);
            }
            textView2.setText(C42180b.m92647l(C42828b.m93915p(strM92642g)));
            textView.setText(C27017c.f54310a.m66516f(R$string.amplitude_period, item.getCheckPeriod()));
            if (DayNightThemeManager.f28592a.m33189n()) {
                imageView.setImageResource(R$mipmap.bkucoin_ic_alert_amplitude);
            } else {
                imageView.setImageResource(R$mipmap.bkucoin_ic_alert_amplitude);
                imageView.setRotation(180.0f);
            }
        }
        Intrinsics.checkNotNull(switchCompat);
        C27046k.m66711z(switchCompat, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertAddAdapter.m50229j(this.f41088b, item, helper, switchCompat);
            }
        }, 1, null);
        View view = helper.getView(R$id.iv_del_alert);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertAddAdapter.m50230k(this.f41094b, item, helper);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m50232l(@Nullable Function3<? super AlertEntity, ? super Integer, ? super Boolean, Unit> function3) {
        this.f41065j = function3;
    }

    /* JADX INFO: renamed from: m */
    public final void m50233m(@Nullable Function2<? super AlertEntity, ? super Integer, Unit> function2) {
        this.f41064i = function2;
    }
}

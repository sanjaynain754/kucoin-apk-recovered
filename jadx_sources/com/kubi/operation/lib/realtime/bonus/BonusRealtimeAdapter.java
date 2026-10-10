package com.kubi.operation.lib.realtime.bonus;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.operation.lib.realtime.bonus.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BonusRealtimeAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0017H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeAdapter;", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;", "<init>", "()V", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "layoutResId", "", "getLayoutResId", "()I", "layoutDialogResId", "getLayoutDialogResId", "onBindView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "data", "Lcom/kubi/home/realtime/AdapterViewType;", "renderItem", "itemView", "Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBonusRealtimeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusRealtimeAdapter.kt\ncom/kubi/operation/lib/realtime/bonus/BonusRealtimeAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class BonusRealtimeAdapter implements IRealTimeAdapter<BonusRealtimeData> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RealTimeViewType f36773b = RealTimeViewType.WELFARE_BONUS;

    /* JADX INFO: renamed from: c */
    public final int f36774c = R$layout.operation_item_realtime_bonus_home;

    /* JADX INFO: renamed from: d */
    public final int f36775d = R$layout.operation_item_realtime_bonus_dialog;

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getF26178c() {
        return this.f36774c;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getF26179d() {
        return this.f36775d;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public RealTimeViewType getF26177b() {
        return this.f36773b;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo30049e(@NotNull View view, @NotNull BonusRealtimeData data, @NotNull AdapterViewType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        BonusItemEntity entity = data.getEntity();
        if (entity != null) {
            m43509j(view, entity);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m43509j(final View view, final BonusItemEntity bonusItemEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.realtime.bonus.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusRealtimeAdapter.m43506k(view, bonusItemEntity);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m43506k(View view, final BonusItemEntity bonusItemEntity) {
        String string;
        String strM92640e;
        Context context = view.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        String str = "";
        if (StringsKt.equals(BonusType.SIGN_UP.getValue(), bonusItemEntity.getTaskType(), true)) {
            string = context.getString(R$string.home_realtime_bonus_title_signup);
        } else if (StringsKt.equals(BonusType.KYC.getValue(), bonusItemEntity.getTaskType(), true)) {
            string = context.getString(R$string.home_realtime_bonus_title_kyc);
        } else if (!StringsKt.equals(BonusType.DEPOSIT.getValue(), bonusItemEntity.getTaskType(), true)) {
            string = "";
        } else {
            string = context.getString(R$string.home_realtime_bonus_title_deposit);
        }
        Intrinsics.checkNotNull(string);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvTitle);
        if (baseTextView != null) {
            baseTextView.setText(string);
        }
        BigDecimal bigDecimalM66671k = C27041f.m66671k(bonusItemEntity.getDisplayAmount());
        if (bigDecimalM66671k != null) {
            strM92640e = C42180b.m92640e(bigDecimalM66671k, null, bigDecimalM66671k.precision(), false, false, false, 0, null, 125, null);
        } else {
            strM92640e = null;
        }
        String strM92647l = C42180b.m92647l(strM92640e);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvSubTitle);
        if (baseTextView2 != null) {
            int i11 = R$string.home_realtime_bonus_sub_title;
            String amountCurrency = bonusItemEntity.getAmountCurrency();
            if (amountCurrency != null) {
                str = amountCurrency;
            }
            baseTextView2.setText(context.getString(i11, strM92647l, str));
            HighlightTextHelper.f43497a.m54116a(baseTextView2, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.brandGreen)));
        }
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.operation.lib.realtime.bonus.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusRealtimeAdapter.m43507l(bonusItemEntity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m43507l(BonusItemEntity bonusItemEntity) {
        RouteExKt.m56217H(bonusItemEntity.getRewardCenterUri());
        return Unit.INSTANCE;
    }
}

package com.kubi.copytrading.assets.copy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$font;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.CopyTradingTraderEntity;
import com.kubi.copytrading.assets.ThirtyDayProfitDetail;
import com.kubi.copytrading.assets.TraderInfoResponse;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.host.HostManager;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.C22890g;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.kubi.sdk.util.CountDownCallback;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.share.api.IShareService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import e00.InterfaceC37012d;
import f00.C37304a;
import g00.InterfaceC37754f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AssetCopyTradingAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u0010J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017H\u0002J \u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "assetCopyTradingFragment", "Lcom/kubi/sdk/BaseFragment;", "<init>", "(Lcom/kubi/sdk/BaseFragment;)V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "onTrialExpired", "Lkotlin/Function0;", "", "getOnTrialExpired", "()Lkotlin/jvm/functions/Function0;", "setOnTrialExpired", "(Lkotlin/jvm/functions/Function0;)V", "countDownTaskIds", "", "", "onViewRecycled", C33954u6.f72238i, "release", "convert", "helper", "item", "bindTrialView", "ctx", "Landroid/content/Context;", "settleCurrencyPrecision", "sharePosition", "getRcode", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCopyTradingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCopyTradingAdapter.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1869#2,2:324\n*S KotlinDebug\n*F\n+ 1 AssetCopyTradingAdapter.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter\n*L\n74#1:324,2\n*E\n"})
public final class AssetCopyTradingAdapter extends BaseQuickAdapter<CopyTradingTraderEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BaseFragment f19824i;

    /* JADX INFO: renamed from: j */
    public boolean f19825j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function0<Unit> f19826k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Set<Integer> f19827l;

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.copy.AssetCopyTradingAdapter$a */
    /* JADX INFO: compiled from: AssetCopyTradingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$bindTrialView$1", "Lcom/kubi/sdk/util/CountDownCallback;", "countDown", "", "remainingSecond", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11456a implements CountDownCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseTextView f19828b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f19829c;

        public C11456a(BaseTextView baseTextView, Context context) {
            this.f19828b = baseTextView;
            this.f19829c = context;
        }

        @Override // com.kubi.sdk.util.CountDownCallback
        /* JADX INFO: renamed from: l2 */
        public void mo20702l2(long j11) {
            if (j11 % ((long) 60) == 0 && this.f19828b.isAttachedToWindow()) {
                this.f19828b.setText(AssetCopyTradingAdapter.m20688o(this.f19829c, j11));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.copy.AssetCopyTradingAdapter$b */
    /* JADX INFO: compiled from: AssetCopyTradingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$bindTrialView$2", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "finish", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11457b implements CountDownFinishCallback {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Ref.IntRef f19831c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseViewHolder f19832d;

        public C11457b(Ref.IntRef intRef, BaseViewHolder baseViewHolder) {
            this.f19831c = intRef;
            this.f19832d = baseViewHolder;
        }

        @Override // com.kubi.sdk.util.CountDownFinishCallback
        public void finish() {
            AssetCopyTradingAdapter.this.f19827l.remove(Integer.valueOf(this.f19831c.element));
            if (Intrinsics.areEqual(this.f19832d.itemView.getTag(), Integer.valueOf(this.f19831c.element))) {
                this.f19832d.itemView.setTag(null);
            }
            Function0<Unit> function0M20698u = AssetCopyTradingAdapter.this.m20698u();
            if (function0M20698u != null) {
                function0M20698u.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCopyTradingAdapter(@NotNull BaseFragment assetCopyTradingFragment) {
        super(R$layout.item_asset_copy_trading);
        Intrinsics.checkNotNullParameter(assetCopyTradingFragment, "assetCopyTradingFragment");
        this.f19824i = assetCopyTradingFragment;
        this.f19827l = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m20680C(Boolean bool, ProtocolException protocolException) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final String m20688o(Context context, long j11) {
        if (j11 <= 0) {
            return "--";
        }
        if (j11 >= TimeUnit.HOURS.toSeconds(24L)) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String string = context.getString(R$string.copy_trading_day_hours, String.valueOf(timeUnit.toDays(j11)), String.valueOf(timeUnit.toHours(j11) % ((long) 24)));
            Intrinsics.checkNotNull(string);
            return string;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        String string2 = context.getString(R$string.copy_trading_hours_min, String.valueOf(timeUnit2.toHours(j11)), String.valueOf(timeUnit2.toMinutes(j11) % ((long) 60)));
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m20689p() {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myCopy", null, null, null, null, 122, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m20690r(AssetCopyTradingAdapter assetCopyTradingAdapter, String str, View view) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.copytd_share_profit_tips_title).m54156M4(assetCopyTradingAdapter.f19824i.getString(R$string.copytd_share_profit_tips_content, str)).m54162S4(R$string.i_know, null);
        FragmentManager childFragmentManager = assetCopyTradingAdapter.f19824i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "tvRatioLabel");
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m20691s(CopyTradingTraderEntity copyTradingTraderEntity) {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_BODY, "traderDetail", null, 8, null);
        CopyTradingConfig copyTradingConfig = CopyTradingConfig.f19710a;
        String copyConfigId = copyTradingTraderEntity.getCopyConfigId();
        if (copyConfigId == null) {
            copyConfigId = "";
        }
        TraderInfoResponse traderInfoResponse = copyTradingTraderEntity.getTraderInfoResponse();
        String leadConfigId = traderInfoResponse != null ? traderInfoResponse.getLeadConfigId() : null;
        copyTradingConfig.m20590E(copyConfigId, leadConfigId != null ? leadConfigId : "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m20692t(AssetCopyTradingAdapter assetCopyTradingAdapter, Context context, CopyTradingTraderEntity copyTradingTraderEntity, int i11, View view) {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_BODY, "traderShare", null, 8, null);
        Intrinsics.checkNotNull(context);
        assetCopyTradingAdapter.m20695B(context, copyTradingTraderEntity, i11);
    }

    /* JADX INFO: renamed from: v */
    private final String m20693v() {
        return IShareService.f49268a.get().mo39e();
    }

    /* JADX INFO: renamed from: A */
    public final void m20694A(@Nullable Function0<Unit> function0) {
        this.f19826k = function0;
    }

    /* JADX INFO: renamed from: B */
    public final void m20695B(Context context, CopyTradingTraderEntity copyTradingTraderEntity, int i11) {
        String str;
        String plainString;
        ThirtyDayProfitDetail thirtyDayProfitDetail = copyTradingTraderEntity.getThirtyDayProfitDetail();
        String currency = thirtyDayProfitDetail != null ? thirtyDayProfitDetail.getCurrency() : null;
        BigDecimal totalPnl = copyTradingTraderEntity.getTotalPnl();
        Integer numValueOf = totalPnl != null ? Integer.valueOf(totalPnl.compareTo(BigDecimal.ZERO)) : null;
        String nicknameShow = UserInfo.c().getNicknameShow();
        if (copyTradingTraderEntity.getTotalPnl() == null) {
            str = "--";
        } else {
            str = C27039d.m66644d(copyTradingTraderEntity.getTotalPnl()) + C27041f.m66669i(C42180b.m92640e(copyTradingTraderEntity.getTotalPnl(), null, i11, false, false, false, 2, null, 93, null), "--");
        }
        String strM20693v = m20693v();
        InterfaceC37012d interfaceC37012d = (InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class);
        if (nicknameShow == null) {
            nicknameShow = "";
        }
        BigDecimal totalPnlRatio = copyTradingTraderEntity.getTotalPnlRatio();
        String str2 = (totalPnlRatio == null || (plainString = totalPnlRatio.toPlainString()) == null) ? "" : plainString;
        String strM93906g = C42828b.m93906g(str, currency == null ? "" : currency, true, false, 4, null);
        long jM66650j = C27039d.m66650j(numValueOf);
        TraderInfoResponse traderInfoResponse = copyTradingTraderEntity.getTraderInfoResponse();
        String nickName = traderInfoResponse != null ? traderInfoResponse.getNickName() : null;
        KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = new KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(nicknameShow, str2, strM93906g, jM66650j, nickName == null ? "" : nickName, C27041f.m66669i(currency, "--"), null);
        String string = context.getString(R$string.bcopytd_share_copy_pnl_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        interfaceC37012d.mo82839c(context, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, new KCBridgeCopyTradingShareFooterInfo(string, context.getString(R$string.my_referralcode) + strM20693v, HostManager.a.e() + "/ucenter/signup?rcode=" + strM20693v), new Function2() { // from class: com.kubi.copytrading.assets.copy.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetCopyTradingAdapter.m20680C((Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m20696n(BaseViewHolder baseViewHolder, CopyTradingTraderEntity copyTradingTraderEntity, Context context, int i11) {
        View view = baseViewHolder.getView(R$id.llTrial);
        View view2 = baseViewHolder.getView(R$id.tvTodayLabel);
        if (!Intrinsics.areEqual(copyTradingTraderEntity.getFundsType(), "copyTrial")) {
            Object tag = baseViewHolder.itemView.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                this.f19827l.remove(num);
                TimeSyncManager.f48123a.m58369s(num.intValue());
                baseViewHolder.itemView.setTag(null);
            }
            Intrinsics.checkNotNull(view);
            C27046k.m66700o(view);
            View view3 = baseViewHolder.getView(R$id.flRatioLabel);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            C27046k.m66685H(view3);
            View view4 = baseViewHolder.getView(R$id.tvRatioValue);
            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
            C27046k.m66685H(view4);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C27029c.m66599b(context, 16);
            }
            view2.requestLayout();
            return;
        }
        Intrinsics.checkNotNull(view);
        C27046k.m66685H(view);
        View view5 = baseViewHolder.getView(R$id.flRatioLabel);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C27046k.m66700o(view5);
        View view6 = baseViewHolder.getView(R$id.tvRatioValue);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C27046k.m66700o(view6);
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = C27029c.m66599b(context, 16);
        }
        view2.requestLayout();
        String strM66669i = C27041f.m66669i(copyTradingTraderEntity.getCurrency(), "--");
        BigDecimal amount = copyTradingTraderEntity.getAmount();
        String strM66669i2 = C27041f.m66669i(amount != null ? C42180b.m92640e(amount, null, i11, false, false, false, 0, null, 125, null) : null, "--");
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.tvTrialAmount);
        baseTextView.setText(context.getString(R$string.copy_trade_trial_fund_using_label, strM66669i2, strM66669i));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        highlightTextHelper.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.bold, baseTextView.getCurrentTextColor())));
        Long expireTime = copyTradingTraderEntity.getExpireTime();
        long jLongValue = expireTime != null ? expireTime.longValue() : 0L;
        Object tag2 = baseViewHolder.itemView.getTag();
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            this.f19827l.remove(num2);
            TimeSyncManager.f48123a.m58369s(num2.intValue());
            baseViewHolder.itemView.setTag(null);
        }
        BaseTextView baseTextView2 = (BaseTextView) baseViewHolder.getView(R$id.tvTrialExpire);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        TimeSyncManager timeSyncManager = TimeSyncManager.f48123a;
        intRef.element = timeSyncManager.m58359i(jLongValue, new C11456a(baseTextView2, context), new C11457b(intRef, baseViewHolder));
        baseTextView2.setText(m20688o(context, RangesKt.coerceAtLeast((jLongValue - timeSyncManager.m58366p()) / ((long) 1000), 0L)));
        baseViewHolder.itemView.setTag(Integer.valueOf(intRef.element));
        this.f19827l.add(Integer.valueOf(intRef.element));
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingAdapter.m20689p();
            }
        }, 1, null);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final CopyTradingTraderEntity item) {
        Object objM103844constructorimpl;
        StringBuilder sb2;
        C27096v0 c27096v0;
        String strM92640e;
        CharSequence charSequenceM92629b;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (helper.getAdapterPosition() == getData().size()) {
            View view = helper.getView(R$id.dividerView);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66685H(view);
        } else {
            View view2 = helper.getView(R$id.dividerView);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            C27046k.m66700o(view2);
        }
        CharSequence charSequence = "--";
        String strM66669i = C27041f.m66669i(item.getCurrency(), "--");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = IKuMexService.f28731a.get().mo33269S(strM66669i).get("properties");
            Map map = obj instanceof Map ? (Map) obj : null;
            Object obj2 = map != null ? map.get("shortDisplayPrecision") : null;
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            objM103844constructorimpl = Result.m103844constructorimpl(number != null ? Integer.valueOf(number.intValue()) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        final int iM66651k = C27039d.m66651k((Integer) objM103844constructorimpl, 4);
        final Context context = helper.itemView.getContext();
        CopyTradingUserAvatarView copyTradingUserAvatarView = (CopyTradingUserAvatarView) helper.getView(R$id.userAvatar);
        TraderInfoResponse traderInfoResponse = item.getTraderInfoResponse();
        String avatarUrl = traderInfoResponse != null ? traderInfoResponse.getAvatarUrl() : null;
        TraderInfoResponse traderInfoResponse2 = item.getTraderInfoResponse();
        copyTradingUserAvatarView.m20958b(avatarUrl, traderInfoResponse2 != null ? traderInfoResponse2.getNickName() : null);
        int i11 = R$id.userName;
        TraderInfoResponse traderInfoResponse3 = item.getTraderInfoResponse();
        helper.setText(i11, C27041f.m66669i(traderInfoResponse3 != null ? traderInfoResponse3.getNickName() : null, "--"));
        int i12 = R$id.tvPnlLabel;
        helper.setText(i12, context.getString(R$string.copytd_total_item_pnl, strM66669i));
        helper.setText(R$id.tvTodayLabel, context.getString(R$string.copytd_today_pnl, strM66669i));
        helper.setText(R$id.tvInvestmentLabel, context.getString(R$string.copytd_current_investment, strM66669i));
        StringBuilder sb3 = new StringBuilder();
        sb3.append('(');
        BigDecimal totalPnlRatio = item.getTotalPnlRatio();
        sb3.append(C27041f.m66669i(totalPnlRatio != null ? C42180b.m92642g(totalPnlRatio, null, null, 0, true, false, false, 55, null) : null, "--"));
        sb3.append(')');
        String string = sb3.toString();
        C27096v0 c27096v1 = new C27096v0();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C27039d.m66644d(item.getTotalPnl()));
        BigDecimal totalPnl = item.getTotalPnl();
        if (totalPnl != null) {
            sb2 = sb4;
            c27096v0 = c27096v1;
            strM92640e = C42180b.m92640e(totalPnl, null, iM66651k, false, false, false, 2, null, 93, null);
        } else {
            sb2 = sb4;
            c27096v0 = c27096v1;
            strM92640e = null;
        }
        sb2.append(C27041f.m66669i(strM92640e, "--"));
        CharSequence charSequenceM66904d = c27096v0.append(sb2.toString()).m66904d(string, 12);
        int i13 = R$id.tvPnlValue;
        Intrinsics.checkNotNull(context);
        String strM92640e2 = null;
        helper.setTextColor(i13, C22890g.m54282g(context, C27039d.m66656p(item.getTotalPnl()), 0, 2, null));
        helper.setText(i13, charSequenceM66904d);
        int i14 = R$id.tvTodayValue;
        helper.setTextColor(i14, C22890g.m54282g(context, C27039d.m66656p(item.getTodayPnl()), 0, 2, null));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C27039d.m66644d(item.getTodayPnl()));
        BigDecimal todayPnl = item.getTodayPnl();
        if (todayPnl != null) {
            strM92640e2 = C42180b.m92640e(todayPnl, null, iM66651k, false, false, false, 2, null, 93, null);
        }
        sb5.append(C27041f.m66669i(strM92640e2, "--"));
        helper.setText(i14, sb5.toString());
        int i15 = R$id.tvInvestmentValue;
        BigDecimal copyAmount = item.getCopyAmount();
        helper.setText(i15, C27041f.m66669i(copyAmount != null ? C42180b.m92640e(copyAmount, null, iM66651k, false, false, false, 2, null, 93, null) : strM92640e2, "--"));
        BigDecimal profitSharingRatio = item.getProfitSharingRatio();
        final String strM66669i2 = C27041f.m66669i(profitSharingRatio != null ? C42180b.m92642g(profitSharingRatio, null, null, 0, false, false, false, 63, null) : null, "--");
        helper.setText(R$id.tvRatioValue, strM66669i2);
        helper.setOnClickListener(R$id.flRatioLabel, new View.OnClickListener() { // from class: com.kubi.copytrading.assets.copy.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AssetCopyTradingAdapter.m20690r(this.f19843b, strM66669i2, view3);
            }
        });
        int i16 = R$id.tvDateValue;
        Long startDate = item.getStartDate();
        if (startDate != null && (charSequenceM92629b = C42179a.m92629b(startDate.longValue(), null, false, null, false, 15, null)) != null) {
            charSequence = charSequenceM92629b;
        }
        helper.setText(i16, charSequence);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingAdapter.m20691s(item);
            }
        }, 1, null);
        helper.setOnClickListener(i12, new View.OnClickListener() { // from class: com.kubi.copytrading.assets.copy.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AssetCopyTradingAdapter.m20692t(this.f19846b, context, item, iM66651k, view3);
            }
        });
        m20696n(helper, item, context, iM66651k);
        ShowHideTextView.m54778d(helper.itemView, this.f19825j);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Function0<Unit> m20698u() {
        return this.f19826k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        Object tag = holder.itemView.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            int iIntValue = num.intValue();
            holder.itemView.setTag(null);
            this.f19827l.remove(num);
            TimeSyncManager.f48123a.m58369s(iIntValue);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m20700x() {
        Iterator<T> it = this.f19827l.iterator();
        while (it.hasNext()) {
            TimeSyncManager.f48123a.m58369s(((Number) it.next()).intValue());
        }
        this.f19827l.clear();
        this.f19826k = null;
    }

    /* JADX INFO: renamed from: y */
    public final void m20701y(boolean z11) {
        this.f19825j = z11;
    }
}

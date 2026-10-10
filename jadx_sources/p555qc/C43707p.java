package p555qc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$mipmap;
import com.kubi.copytrading.R$string;
import com.kubi.resources.C22890g;
import com.kubi.resources.CopyTradingTrendView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingOptionShareInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.entity.ShareReferralEntity;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27060l0;
import com.kubi.utils.C27094u0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import w10.C45696a;

/* JADX INFO: renamed from: qc.p */
/* JADX INFO: compiled from: RnShareBizBridgeImp.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JF\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JF\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JF\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JF\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JF\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fJ2\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)2\u0006\u0010\f\u001a\u00020\rJ\f\u0010*\u001a\u00020+*\u00020,H\u0002J\"\u0010-\u001a\u00020\t*\u00020\u00072\u0006\u0010.\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u001c\u00102\u001a\u00020\t*\u0002032\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0002J\u0018\u00106\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u00020\u0014H\u0002J\u001f\u00108\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010<J\f\u0010=\u001a\u00020\u0014*\u00020\u0014H\u0002J\f\u0010>\u001a\u00020\u0014*\u00020\u0014H\u0002J\u001e\u0010?\u001a\u00020\u0005*\u0002012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010@\u001a\u00020\u0014H\u0002J\u001c\u0010A\u001a\u00020\u0005*\u0002012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006B"}, m90084d2 = {"Lcom/kubi/copytrading/rn/RnShareBizBridgeImp;", "", "<init>", "()V", "shareCopyTradingFollowOnePnlImpl", "", "ctx", "Landroid/content/Context;", "avatarBitmap", "Landroid/graphics/Bitmap;", "copyTraderFollowOneTraderPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;", "footerInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "createBitmapOfCopyTradingFollowOnePnl", "utmSource", "", "shareCopyTradingTotalPnlImpl", "copyTraderTotalPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;", "createBitmapOfCopyTradingTotalPnl", "shareCopyTradingPositionImpl", "copyTradingData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "createBitmapOfCopyTradingPosition", "shareLeadTraderUserInfoImpl", "leadTradingUserInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "createBitmapOfLeaderInfo", "shareLeadTraderTotalPnlImpl", "leadTraderTotalPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;", "createBitmapOfLeaderTotalPnl", "shareLeaderPositionImpl", "createBitmapOfLeaderPosition", "createBitmapByOption", "optionShareInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingOptionShareInfo;", "getBackImage", "", "Ljava/math/BigDecimal;", "generateImageByBiz", "layoutId", "initListener", "Lio/reactivex/functions/Consumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "viewToBitmapUnDisplay", "Landroid/view/View;", "width", "height", "appendUtmSourceAndReferralCode", "getRcode", "getUpDownColorBySide", "flagSide", "", "context", "(Ljava/lang/Long;Landroid/content/Context;)I", "headText", "shortHeadText", "setUserAvatar", TUIConstantDefine.USER_NAME, "setFooter", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnShareBizBridgeImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnShareBizBridgeImp.kt\ncom/kubi/copytrading/rn/RnShareBizBridgeImp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n1#2:647\n29#3:648\n1869#4,2:649\n1563#4:651\n1634#4,3:652\n1563#4:655\n1634#4,3:656\n1563#4:659\n1634#4,3:660\n*S KotlinDebug\n*F\n+ 1 RnShareBizBridgeImp.kt\ncom/kubi/copytrading/rn/RnShareBizBridgeImp\n*L\n555#1:648\n166#1:649,2\n178#1:651\n178#1:652,3\n317#1:655\n317#1:656,3\n377#1:659\n377#1:660,3\n*E\n"})
public final class C43707p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43707p f96618a = new C43707p();

    /* JADX INFO: renamed from: I */
    public final void m96247I(BaseViewHolder baseViewHolder, Bitmap bitmap, String str) {
        if (bitmap != null) {
            int i11 = R$id.avatar;
            baseViewHolder.setGone(i11, true);
            baseViewHolder.setGone(R$id.tvAvatar, false);
            baseViewHolder.setImageBitmap(i11, bitmap);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            int i12 = R$id.avatar;
            baseViewHolder.setGone(i12, true);
            baseViewHolder.setGone(R$id.tvAvatar, false);
            baseViewHolder.setImageResource(i12, R$mipmap.kucoin_icon_default_avatar);
            return;
        }
        baseViewHolder.setGone(R$id.avatar, false);
        int i13 = R$id.tvAvatar;
        baseViewHolder.setGone(i13, true);
        baseViewHolder.setText(i13, m96245G(str));
    }

    /* JADX INFO: renamed from: B */
    public static final void m96214B(Bitmap bitmap, KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        C43707p c43707p = f96618a;
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingLeadTraderTotalPnlEntity.getUserName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingLeadTraderTotalPnlEntity.getUserName());
        int iM96244F = c43707p.m96244F(Long.valueOf(kCBridgeCopyTradingLeadTraderTotalPnlEntity.getTradePnlSide()), context);
        baseViewHolder.setText(R$id.pnlRateLabelTv, context.getString(R$string.copytd_total_pnl_value_share, C27041f.m66669i(kCBridgeCopyTradingLeadTraderTotalPnlEntity.getTradeSettleCurrency(), "USDT")));
        int i11 = R$id.pnlRateValueTv;
        baseViewHolder.setTextColor(i11, iM96244F);
        baseViewHolder.setText(i11, kCBridgeCopyTradingLeadTraderTotalPnlEntity.getLeadTotalPnlValue());
        CopyTradingTrendView copyTradingTrendView = (CopyTradingTrendView) baseViewHolder.getView(R$id.lineChart);
        List<String> leadTotalPnlData = kCBridgeCopyTradingLeadTraderTotalPnlEntity.getLeadTotalPnlData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(leadTotalPnlData, 10));
        Iterator<T> it = leadTotalPnlData.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(C27039d.m66649i(StringsKt.toFloatOrNull((String) it.next()), 0.0f, 1, null)));
        }
        copyTradingTrendView.m54114c(arrayList, C22890g.m54281f(context, kCBridgeCopyTradingLeadTraderTotalPnlEntity.getTradePnlSide() >= 0), true);
        f96618a.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: p */
    public static final void m96234p(KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, BaseViewHolder baseViewHolder) {
        Object objM103844constructorimpl;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(kCBridgeCopyTradingOptionShareInfo.getTradePnlValue(), null, 1, null);
        int i11 = R$id.image;
        C43707p c43707p = f96618a;
        baseViewHolder.setImageResource(i11, c43707p.m96242D(bigDecimalM66535e));
        baseViewHolder.setText(R$id.symbol, kCBridgeCopyTradingOptionShareInfo.getTradeDisplaySymbol());
        String strM66644d = C27039d.m66644d(bigDecimalM66535e);
        int i12 = R$id.percent;
        baseViewHolder.setText(i12, strM66644d + C42180b.m92642g(bigDecimalM66535e, null, null, 0, false, false, false, 63, null));
        baseViewHolder.setTextColor(i12, C22890g.m54280e(context, bigDecimalM66535e, R$color.c_white));
        String tradeAveragePrice = kCBridgeCopyTradingOptionShareInfo.getTradeAveragePrice();
        String tradeExitPrice = kCBridgeCopyTradingOptionShareInfo.getTradeExitPrice();
        baseViewHolder.setText(R$id.avgPriceValue, C42828b.m93906g(tradeAveragePrice, kCBridgeCopyTradingOptionShareInfo.getTradeSettleCurrency(), true, false, 4, null));
        baseViewHolder.setText(R$id.exitPriceValue, C42828b.m93906g(tradeExitPrice, kCBridgeCopyTradingOptionShareInfo.getTradeSettleCurrency(), true, false, 4, null));
        baseViewHolder.setText(R$id.footTitle, kCBridgeCopyTradingShareFooterInfo.getFooterTitle());
        baseViewHolder.setText(R$id.footDesc, kCBridgeCopyTradingShareFooterInfo.getFooterDesc());
        int i13 = R$id.ivCode;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C27060l0.m66759b(c43707p.m96256n(kCBridgeCopyTradingShareFooterInfo.getQrCodeUrl(), "op_p_share"), C5275i0.m6236a(100.0f)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        baseViewHolder.setImageBitmap(i13, (Bitmap) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl));
    }

    /* JADX INFO: renamed from: r */
    public static final void m96235r(Bitmap bitmap, KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        C43707p c43707p = f96618a;
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getCopyTraderName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getCopyTraderName());
        baseViewHolder.setText(R$id.pnlLabel, context.getString(R$string.copytd_total_pnl_value_share, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getTradeSettleCurrency()));
        int iM96244F = c43707p.m96244F(Long.valueOf(kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getTradePnlSide()), context);
        int i11 = R$id.pnlRateTv;
        baseViewHolder.setTextColor(i11, iM96244F);
        int i12 = R$id.pnlTv;
        baseViewHolder.setTextColor(i12, iM96244F);
        String pnlPercent = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getPnlPercent();
        if (pnlPercent == null || pnlPercent.length() == 0) {
            baseViewHolder.setImageResource(R$id.image, R$mipmap.ic_share_back_one);
            baseViewHolder.setText(i11, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getPnlValue());
            baseViewHolder.setGone(i12, false);
        } else {
            BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getPnlPercent(), null, 1, null);
            baseViewHolder.setImageResource(R$id.image, c43707p.m96242D(bigDecimalM66535e));
            baseViewHolder.setText(i11, C42180b.m92642g(bigDecimalM66535e, null, null, 0, true, false, false, 55, null));
            baseViewHolder.setText(i12, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getPnlValue());
        }
        baseViewHolder.setText(R$id.leaderAvatarShapeTv, c43707p.m96254V(kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getLeadTraderName()));
        baseViewHolder.setText(R$id.leaderNameTv, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.getLeadTraderName());
        c43707p.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: t */
    public static final void m96236t(KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, Bitmap bitmap, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        StringBuilder sb2;
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(kCBridgeCopyTradingCopyTradingEntity.getTradePnlValue(), null, 1, null);
        int i11 = R$id.image;
        C43707p c43707p = f96618a;
        baseViewHolder.setImageResource(i11, c43707p.m96242D(bigDecimalM66535e));
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingCopyTradingEntity.getUserName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingCopyTradingEntity.getUserName());
        baseViewHolder.setText(R$id.symbol, kCBridgeCopyTradingCopyTradingEntity.getTradeDisplaySymbol());
        int i12 = R$id.side;
        baseViewHolder.setTextColor(i12, C22890g.m54281f(context, kCBridgeCopyTradingCopyTradingEntity.getTradeIsLong()));
        String string = kCBridgeCopyTradingCopyTradingEntity.getTradeIsLong() ? context.getString(R$string.multi) : context.getString(R$string.empty);
        Intrinsics.checkNotNull(string);
        baseViewHolder.setText(i12, string + " | " + kCBridgeCopyTradingCopyTradingEntity.getTradeLeverage() + 'x');
        int iM96244F = c43707p.m96244F(kCBridgeCopyTradingCopyTradingEntity.getTradePnlSide(), context);
        int i13 = R$id.pnlRateValueTv;
        baseViewHolder.setTextColor(i13, iM96244F);
        int i14 = R$id.pnlValueTv;
        baseViewHolder.setTextColor(i14, iM96244F);
        baseViewHolder.setText(i13, C42180b.m92642g(bigDecimalM66535e, null, null, 0, true, false, false, 55, null));
        String tradePnlAmountValue = kCBridgeCopyTradingCopyTradingEntity.getTradePnlAmountValue();
        if (tradePnlAmountValue == null) {
            tradePnlAmountValue = C42828b.m93906g("--", kCBridgeCopyTradingCopyTradingEntity.getTradeSettleCurrency(), true, false, 4, null);
        }
        baseViewHolder.setText(i14, tradePnlAmountValue);
        String tradeAveragePrice = kCBridgeCopyTradingCopyTradingEntity.getTradeAveragePrice();
        String tradeExitPrice = kCBridgeCopyTradingCopyTradingEntity.getTradeExitPrice();
        if (C5303w0.m6511a()) {
            sb2 = new StringBuilder();
            sb2.append(tradeExitPrice);
            sb2.append('/');
            sb2.append(tradeAveragePrice);
        } else {
            sb2 = new StringBuilder();
            sb2.append(tradeAveragePrice);
            sb2.append('/');
            sb2.append(tradeExitPrice);
        }
        String string2 = sb2.toString();
        String str2 = context.getString(R$string.open_position_price) + '/' + context.getString(R$string.copyd_settle_price);
        baseViewHolder.setText(R$id.priceValue, C42828b.m93906g(string2, kCBridgeCopyTradingCopyTradingEntity.getTradeSettleCurrency(), true, false, 4, null));
        baseViewHolder.setText(R$id.priceLabel, str2);
        int i15 = R$id.leaderAvatarShapeTv;
        String userDesc = kCBridgeCopyTradingCopyTradingEntity.getUserDesc();
        baseViewHolder.setText(i15, userDesc != null ? c43707p.m96254V(userDesc) : null);
        baseViewHolder.setText(R$id.leaderNameTv, kCBridgeCopyTradingCopyTradingEntity.getUserDesc());
        c43707p.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: v */
    public static final void m96237v(Bitmap bitmap, KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        C43707p c43707p = f96618a;
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingCopyTraderTotalPnlEntity.getUserName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingCopyTraderTotalPnlEntity.getUserName());
        baseViewHolder.setText(R$id.pnlLabel, context.getString(R$string.copytd_total_pnl_value_share, kCBridgeCopyTradingCopyTraderTotalPnlEntity.getTradeSettleCurrency()));
        int iM96244F = c43707p.m96244F(Long.valueOf(kCBridgeCopyTradingCopyTraderTotalPnlEntity.getTradePnlSide()), context);
        int i11 = R$id.pnlTv;
        baseViewHolder.setTextColor(i11, iM96244F);
        baseViewHolder.setText(i11, kCBridgeCopyTradingCopyTraderTotalPnlEntity.getTotalPnlValue());
        if (kCBridgeCopyTradingCopyTraderTotalPnlEntity.getLeadTradersNameData().isEmpty()) {
            baseViewHolder.setGone(R$id.leaderLableTv, false);
            baseViewHolder.setGone(R$id.leadersLl, false);
        } else {
            baseViewHolder.setText(R$id.leaderLableTv, context.getString(R$string.copyted_top_lead_trader, String.valueOf(kCBridgeCopyTradingCopyTraderTotalPnlEntity.getLeadTradersNameData().size())));
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) baseViewHolder.getView(R$id.leadersLl);
            for (String str2 : CollectionsKt.take(kCBridgeCopyTradingCopyTraderTotalPnlEntity.getLeadTradersNameData(), 3)) {
                View viewInflate = LayoutInflater.from(context).inflate(R$layout.item_copy_trade_leader_info, (ViewGroup) null, false);
                ShapeTextView shapeTextView = (ShapeTextView) viewInflate.findViewById(R$id.leaderAvatarShapeTv);
                BaseTextView baseTextView = (BaseTextView) viewInflate.findViewById(R$id.leaderNameTv);
                shapeTextView.setText(f96618a.m96254V(str2));
                baseTextView.setText(str2);
                linearLayoutCompat.addView(viewInflate);
            }
        }
        CopyTradingTrendView copyTradingTrendView = (CopyTradingTrendView) baseViewHolder.getView(R$id.lineChart);
        List<String> totalPnlData = kCBridgeCopyTradingCopyTraderTotalPnlEntity.getTotalPnlData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(totalPnlData, 10));
        Iterator<T> it = totalPnlData.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(C27039d.m66649i(StringsKt.toFloatOrNull((String) it.next()), 0.0f, 1, null)));
        }
        copyTradingTrendView.m54114c(arrayList, C22890g.m54281f(context, kCBridgeCopyTradingCopyTraderTotalPnlEntity.getTradePnlSide() >= 0), true);
        f96618a.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: x */
    public static final void m96238x(Bitmap bitmap, KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        C43707p c43707p = f96618a;
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingLeadTradingEntity.getUserName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingLeadTradingEntity.getUserName());
        int iM96244F = c43707p.m96244F(kCBridgeCopyTradingLeadTradingEntity.getTradePnlSide(), context);
        int i11 = R$id.pnlRateValueTv;
        baseViewHolder.setTextColor(i11, iM96244F);
        baseViewHolder.setText(i11, C42180b.m92642g(DowngradeExKt.m66535e(kCBridgeCopyTradingLeadTradingEntity.getLead30DayPnl(), null, 1, null), null, null, 0, true, false, false, 55, null));
        baseViewHolder.setText(R$id.pnlLabelTv, context.getString(R$string.copytd_30day_pnl_value_share, C27041f.m66669i(kCBridgeCopyTradingLeadTradingEntity.getTradeSettleCurrency(), "USDT")));
        int i12 = R$id.pnlValueTv;
        baseViewHolder.setTextColor(i12, iM96244F);
        baseViewHolder.setText(i12, kCBridgeCopyTradingLeadTradingEntity.getLead30DayValue());
        CopyTradingTrendView copyTradingTrendView = (CopyTradingTrendView) baseViewHolder.getView(R$id.lineChart);
        List<String> lead30DayData = kCBridgeCopyTradingLeadTradingEntity.getLead30DayData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lead30DayData, 10));
        Iterator<T> it = lead30DayData.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(C27039d.m66649i(StringsKt.toFloatOrNull((String) it.next()), 0.0f, 1, null)));
        }
        Long tradePnlSide = kCBridgeCopyTradingLeadTradingEntity.getTradePnlSide();
        copyTradingTrendView.m54114c(arrayList, C22890g.m54281f(context, (tradePnlSide != null ? tradePnlSide.longValue() : 0L) >= 0), true);
        f96618a.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: z */
    public static final void m96239z(KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, Bitmap bitmap, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, BaseViewHolder baseViewHolder) {
        StringBuilder sb2;
        baseViewHolder.setText(R$id.time, C42179a.m92633f(System.currentTimeMillis(), null, false, false, null, 15, null));
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(kCBridgeCopyTradingCopyTradingEntity.getTradePnlValue(), null, 1, null);
        int i11 = R$id.image;
        C43707p c43707p = f96618a;
        baseViewHolder.setImageResource(i11, c43707p.m96242D(bigDecimalM66535e));
        Intrinsics.checkNotNull(baseViewHolder);
        c43707p.m96247I(baseViewHolder, bitmap, kCBridgeCopyTradingCopyTradingEntity.getUserName());
        baseViewHolder.setText(R$id.userName, kCBridgeCopyTradingCopyTradingEntity.getUserName());
        baseViewHolder.setText(R$id.symbol, kCBridgeCopyTradingCopyTradingEntity.getTradeDisplaySymbol());
        int i12 = R$id.side;
        baseViewHolder.setTextColor(i12, C22890g.m54281f(context, kCBridgeCopyTradingCopyTradingEntity.getTradeIsLong()));
        String string = kCBridgeCopyTradingCopyTradingEntity.getTradeIsLong() ? context.getString(R$string.multi) : context.getString(R$string.empty);
        Intrinsics.checkNotNull(string);
        baseViewHolder.setText(i12, string + " | " + kCBridgeCopyTradingCopyTradingEntity.getTradeLeverage() + 'x');
        int iM96244F = c43707p.m96244F(kCBridgeCopyTradingCopyTradingEntity.getTradePnlSide(), context);
        int i13 = R$id.pnlRateValueTv;
        baseViewHolder.setTextColor(i13, iM96244F);
        int i14 = R$id.pnlValueTv;
        baseViewHolder.setTextColor(i14, iM96244F);
        baseViewHolder.setText(i13, C42180b.m92642g(DowngradeExKt.m66535e(kCBridgeCopyTradingCopyTradingEntity.getTradePnlValue(), null, 1, null), null, null, 0, true, false, false, 55, null));
        String tradePnlAmountValue = kCBridgeCopyTradingCopyTradingEntity.getTradePnlAmountValue();
        if (tradePnlAmountValue == null) {
            tradePnlAmountValue = C42828b.m93906g("--", kCBridgeCopyTradingCopyTradingEntity.getTradeSettleCurrency(), true, false, 4, null);
        }
        baseViewHolder.setText(i14, tradePnlAmountValue);
        String tradeAveragePrice = kCBridgeCopyTradingCopyTradingEntity.getTradeAveragePrice();
        String tradeExitPrice = kCBridgeCopyTradingCopyTradingEntity.getTradeExitPrice();
        if (C5303w0.m6511a()) {
            sb2 = new StringBuilder();
            sb2.append(tradeExitPrice);
            sb2.append('/');
            sb2.append(tradeAveragePrice);
        } else {
            sb2 = new StringBuilder();
            sb2.append(tradeAveragePrice);
            sb2.append('/');
            sb2.append(tradeExitPrice);
        }
        String string2 = sb2.toString();
        baseViewHolder.setText(R$id.priceLabel, context.getString(R$string.open_position_price) + '/' + context.getString(R$string.copyd_settle_price));
        baseViewHolder.setText(R$id.priceValue, C42828b.m93906g(string2, kCBridgeCopyTradingCopyTradingEntity.getTradeSettleCurrency(), true, false, 4, null));
        c43707p.m96246H(baseViewHolder, kCBridgeCopyTradingShareFooterInfo, str);
    }

    /* JADX INFO: renamed from: A */
    public final Bitmap m96240A(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_leader_total_pnl, new Consumer() { // from class: qc.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96214B(bitmap, kCBridgeCopyTradingLeadTraderTotalPnlEntity, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final int m96242D(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(new BigDecimal("0.3")) >= 0) {
            return R$mipmap.ic_share_back_two;
        }
        return (bigDecimal.compareTo(BigDecimal.ZERO) < 0 || bigDecimal.compareTo(new BigDecimal("0.3")) >= 0) ? R$mipmap.ic_share_back_three : R$mipmap.ic_share_back_one;
    }

    @ColorInt
    /* JADX INFO: renamed from: F */
    public final int m96244F(Long l11, Context context) {
        return C22890g.m54280e(context, new BigDecimal(l11 != null ? l11.longValue() : 0L), R$color.c_white);
    }

    /* JADX INFO: renamed from: G */
    public final String m96245G(String str) {
        Object objM103844constructorimpl;
        String upperCase;
        if (str == null || str.length() == 0) {
            return "KU";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (str.length() >= 2) {
                C27094u0 c27094u0 = C27094u0.f54451a;
                if (c27094u0.m66900b(strSubstring)) {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    String strSubstring2 = str.substring(1, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    if (c27094u0.m66900b(strSubstring2)) {
                        upperCase = strSubstring.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    } else {
                        String strSubstring3 = str.substring(0, 2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        upperCase = strSubstring3.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    }
                }
            } else {
                upperCase = strSubstring.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            objM103844constructorimpl = Result.m103844constructorimpl(upperCase);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return C27041f.m66669i((String) objM103844constructorimpl, "KU");
    }

    /* JADX INFO: renamed from: H */
    public final void m96246H(BaseViewHolder baseViewHolder, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str) {
        Object objM103844constructorimpl;
        baseViewHolder.setText(R$id.footTitle, kCBridgeCopyTradingShareFooterInfo.getFooterTitle());
        baseViewHolder.setText(R$id.footDesc, kCBridgeCopyTradingShareFooterInfo.getFooterDesc());
        int i11 = R$id.ivCode;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C27060l0.m66759b(f96618a.m96256n(kCBridgeCopyTradingShareFooterInfo.getQrCodeUrl(), str), C5275i0.m6236a(100.0f)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        baseViewHolder.setImageBitmap(i11, (Bitmap) objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: J */
    public final void m96248J(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity copyTraderFollowOneTraderPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTraderFollowOneTraderPnlData, "copyTraderFollowOneTraderPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_copy_follow_one_pnl_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96258q(ctx, bitmap, copyTraderFollowOneTraderPnlData, footerInfo, "cptd_copy_follow_one_pnl_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96215K(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m96249L(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingCopyTradingEntity copyTradingData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_copy_position_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96259s(ctx, bitmap, copyTradingData, footerInfo, "cptd_copy_position_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96216M(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m96250N(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingCopyTraderTotalPnlEntity copyTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTraderTotalPnlData, "copyTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_copy_total_pnl_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96260u(ctx, bitmap, copyTraderTotalPnlData, footerInfo, "cptd_copy_total_pnl_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96217O(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m96251P(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingLeadTraderTotalPnlEntity leadTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(leadTraderTotalPnlData, "leadTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_lead_total_pnl_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96240A(ctx, bitmap, leadTraderTotalPnlData, footerInfo, "cptd_lead_total_pnl_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96218Q(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m96252R(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingLeadTradingEntity leadTradingUserInfo, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(leadTradingUserInfo, "leadTradingUserInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_lead_user_info_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96261w(ctx, bitmap, leadTradingUserInfo, footerInfo, "cptd_lead_user_info_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96219S(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m96253T(@NotNull Context ctx, @Nullable Bitmap bitmap, @NotNull KCBridgeCopyTradingCopyTradingEntity copyTradingData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("cptd_lead_position_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setNeedQrCode(false);
        imageShareParam.setBitmap(f96618a.m96262y(ctx, bitmap, copyTradingData, footerInfo, "cptd_lead_position_share"));
        iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43707p.m96220U(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final String m96254V(String str) {
        Object objM103844constructorimpl;
        if (str == null || str.length() == 0) {
            return "K";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            objM103844constructorimpl = Result.m103844constructorimpl(strSubstring);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return C27041f.m66669i((String) objM103844constructorimpl, "K");
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Bitmap m96257o(@NotNull final Context ctx, @NotNull final KCBridgeCopyTradingOptionShareInfo optionShareInfo, @NotNull final KCBridgeCopyTradingShareFooterInfo footerInfo) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(optionShareInfo, "optionShareInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        return m96241C(ctx, R$layout.rn_share_option_image, new Consumer() { // from class: qc.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96234p(optionShareInfo, ctx, footerInfo, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final Bitmap m96258q(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_copy_trading_follow_pnl, new Consumer() { // from class: qc.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96235r(bitmap, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m96259s(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_position_copy, new Consumer() { // from class: qc.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96236t(kCBridgeCopyTradingCopyTradingEntity, bitmap, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final Bitmap m96260u(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_copy_trading_total_pnl, new Consumer() { // from class: qc.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96237v(bitmap, kCBridgeCopyTradingCopyTraderTotalPnlEntity, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final Bitmap m96261w(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_leader_info, new Consumer() { // from class: qc.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96238x(bitmap, kCBridgeCopyTradingLeadTradingEntity, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final Bitmap m96262y(final Context context, final Bitmap bitmap, final KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, final KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, final String str) {
        return m96241C(context, R$layout.bcopytrading_rn_share_position_leader, new Consumer() { // from class: qc.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43707p.m96239z(kCBridgeCopyTradingCopyTradingEntity, bitmap, context, kCBridgeCopyTradingShareFooterInfo, str, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m96215K(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m96216M(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m96217O(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m96218Q(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m96219S(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m96220U(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final Bitmap m96241C(Context context, int i11, Consumer<BaseViewHolder> consumer) throws Exception {
        int iM6180b = C5267e0.m6180b();
        View viewInflate = LayoutInflater.from(context).inflate(i11, (ViewGroup) null, false);
        consumer.accept(new BaseViewHolder(viewInflate));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return m96255W(viewInflate, iM6180b, (int) ((iM6180b / 2) * 3.0f));
    }

    /* JADX INFO: renamed from: E */
    public final String m96243E() {
        String referralCode;
        ShareReferralEntity shareReferralEntityM100871a = C45696a.m100871a();
        if (shareReferralEntityM100871a != null && (referralCode = shareReferralEntityM100871a.getReferralCode()) != null) {
            return referralCode;
        }
        return IUserService.a.get().d0().getReferralCode();
    }

    /* JADX INFO: renamed from: W */
    public final Bitmap m96255W(View view, int i11, int i12) {
        view.setLayoutDirection(C5303w0.m6511a() ? 1 : 0);
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: n */
    public final String m96256n(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null) {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            if (!StringsKt.contains((CharSequence) str, (CharSequence) "utm_source", true)) {
                builderBuildUpon.appendQueryParameter("utm_source", str2);
            }
            if (!StringsKt.contains((CharSequence) str, (CharSequence) "rcode", true)) {
                builderBuildUpon.appendQueryParameter("rcode", f96618a.m96243E());
            }
            String string = builderBuildUpon.build().toString();
            if (string != null) {
                return string;
            }
            return "";
        }
        return "";
    }
}

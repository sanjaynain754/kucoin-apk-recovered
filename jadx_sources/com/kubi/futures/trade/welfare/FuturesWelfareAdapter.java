package com.kubi.futures.trade.welfare;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.FuturesWelfareAsset;
import bm.FuturesWelfareFooter;
import bm.FuturesWelfareSubTitle;
import bm.InterfaceC4633f;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.welfare.airdrop.AirdropRuleDialog;
import com.kubi.futures.view.FuturesWelfarePrimaryButton;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponAttributes;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.otc.entity.OtcAd;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.f0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004efghB»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012O\b\u0002\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012O\b\u0002\u0010\u0012\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0014\u0010\"\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0$J\u0014\u0010%\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0$J\u0010\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010'\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0002J\u0018\u00106\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00108\u001a\u000205H\u0002J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010:\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00104\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0006H\u0002J9\u0010>\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\b\b\u0002\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010CJ(\u0010D\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00104\u001a\u00020<2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J\u0010\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020@H\u0002J\u0018\u0010I\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u000207H\u0002J \u0010L\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0018\u0010M\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J \u0010N\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010O\u001a\u0002012\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0018\u0010P\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010Q\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J(\u0010R\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J(\u0010S\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J(\u0010T\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J)\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0W0V2\b\b\u0001\u0010Z\u001a\u00020\rH\u0002¢\u0006\u0002\u0010[J(\u0010\\\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\r2\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010]\u001a\u00020\u0006H\u0002J\u0018\u0010^\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020_2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010`\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010b\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010c\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020d2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000RU\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000RU\u0010\u0012\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "manager", "Landroidx/fragment/app/FragmentManager;", "select", "", "actionClick", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", ViewProps.POSITION, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "futuresWelfareType", "", "withdrawClick", "<init>", "(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "realWidth", "", "realHeight", "datas", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "getItemCount", "getItemViewType", "appendNotifyChanged", "list", "", "notifyChanged", "getItem", "createWelfareViewHolder", "createAssetsViewHolder", "createSubTitleViewHolder", "createFooterViewHolder", "showTrialRuleDialog", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "showTradeProTrialRulePage", "showWithdrawRuleDialog", "message", "", "showAirdropRuleDialog", "showCouponRuleDialog", FirebaseAnalytics.Param.COUPON, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "bindCouponViewHolder", "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$WelfareViewHolder;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "setCouponLeftLeverageImage", "isExpired", "setCouponLeftData", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "isExpire", "setExpireTime", "expireTime", "", "isTrial", "useContentSpacer", "(Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$WelfareViewHolder;Ljava/lang/Long;ZZZ)V", "setCouponDesc", "precision", FirebaseAnalytics.Param.CURRENCY, "getTime", "time", "bindTrialViewHolder", "bindTradeProTrialViewHolder", "resetTradeProExclusiveViews", "bindTradeProTrialDetail", "bindAirdropViewHolder", "setTrialLeftLeverageImage", "type", "setTrialAction", "setAirdropDesc", "setTrialDesc", "setMiniTraAmount", "setMiniProRequirement", "getTagStyle", "", "Lkotlin/Pair;", "Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;", "Landroid/text/style/CharacterStyle;", "colorRes", "(I)[Lkotlin/Pair;", "bindTrialLeftData", "isAirdropTag", "bindSubTitleViewHolder", "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$SubTitleViewHolder;", "bindFooterViewHolder", "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$FooterViewHolder;", "bindWelfareViewHolder", "bindAssetsViewHolder", "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$AssetsViewHolder;", "WelfareViewHolder", "SubTitleViewHolder", "FooterViewHolder", "AssetsViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesWelfareAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesWelfareAdapter.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareAdapter\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1200:1\n20#2:1201\n20#2:1206\n20#2:1207\n20#2:1208\n20#2:1241\n326#3,4:1202\n326#3,4:1213\n310#3:1217\n326#3,4:1218\n311#3:1222\n310#3:1223\n326#3,4:1224\n311#3:1228\n310#3:1229\n326#3,4:1230\n311#3:1234\n310#3:1235\n326#3,4:1236\n311#3:1240\n37#4:1209\n36#4,3:1210\n*S KotlinDebug\n*F\n+ 1 FuturesWelfareAdapter.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareAdapter\n*L\n363#1:1201\n561#1:1206\n626#1:1207\n706#1:1208\n1081#1:1241\n456#1:1202,4\n1024#1:1213,4\n1049#1:1217\n1049#1:1218,4\n1049#1:1222\n1054#1:1223\n1054#1:1224,4\n1054#1:1228\n1057#1:1229\n1057#1:1230,4\n1057#1:1234\n1062#1:1235\n1062#1:1236,4\n1062#1:1240\n971#1:1209\n971#1:1210,3\n*E\n"})
public final class FuturesWelfareAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final FragmentManager f24788i;

    /* JADX INFO: renamed from: j */
    public final boolean f24789j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Function3<View, Integer, InterfaceC4633f, Unit> f24790k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final Function3<View, Integer, InterfaceC4633f, Unit> f24791l;

    /* JADX INFO: renamed from: m */
    public final float f24792m;

    /* JADX INFO: renamed from: n */
    public final int f24793n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final List<InterfaceC4633f> f24794o;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.f0$a */
    /* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0019\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$AssetsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "withdrawLabel", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "getWithdrawLabel", "()Landroidx/appcompat/widget/AppCompatTextView;", "withdrawAmount", "getWithdrawAmount", "withdrawLegal", "getWithdrawLegal", ChannelKycRequest.SCENE_WITHDRAW, "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "getWithdraw", "()Lcom/kubi/resources/widget/button/KcPrimaryButton;", "balanceLabel", "getBalanceLabel", "balanceValue", "getBalanceValue", "pnlLabel", "getPnlLabel", "pnlValue", "getPnlValue", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final AppCompatTextView f24795g;

        /* JADX INFO: renamed from: h */
        public final AppCompatTextView f24796h;

        /* JADX INFO: renamed from: i */
        public final AppCompatTextView f24797i;

        /* JADX INFO: renamed from: j */
        public final KcPrimaryButton f24798j;

        /* JADX INFO: renamed from: k */
        public final AppCompatTextView f24799k;

        /* JADX INFO: renamed from: l */
        public final AppCompatTextView f24800l;

        /* JADX INFO: renamed from: m */
        public final AppCompatTextView f24801m;

        /* JADX INFO: renamed from: n */
        public final AppCompatTextView f24802n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24795g = (AppCompatTextView) this.itemView.findViewById(R$id.withdrawLabel);
            this.f24796h = (AppCompatTextView) this.itemView.findViewById(R$id.withdrawAmount);
            this.f24797i = (AppCompatTextView) this.itemView.findViewById(R$id.withdrawLegal);
            this.f24798j = (KcPrimaryButton) this.itemView.findViewById(R$id.withdraw);
            this.f24799k = (AppCompatTextView) this.itemView.findViewById(R$id.balanceLabel);
            this.f24800l = (AppCompatTextView) this.itemView.findViewById(R$id.balanceValue);
            this.f24801m = (AppCompatTextView) this.itemView.findViewById(R$id.pnlLabel);
            this.f24802n = (AppCompatTextView) this.itemView.findViewById(R$id.pnlValue);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AppCompatTextView getF24799k() {
            return this.f24799k;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AppCompatTextView getF24800l() {
            return this.f24800l;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AppCompatTextView getF24801m() {
            return this.f24801m;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AppCompatTextView getF24802n() {
            return this.f24802n;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final KcPrimaryButton getF24798j() {
            return this.f24798j;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AppCompatTextView getF24796h() {
            return this.f24796h;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AppCompatTextView getF24795g() {
            return this.f24795g;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AppCompatTextView getF24797i() {
            return this.f24797i;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.f0$b */
    /* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.f0$c */
    /* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$SubTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.f0$d */
    /* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u001c\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u001e\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010 \u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u0019\u0010\"\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R\u0019\u0010$\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R\u0019\u0010&\u001a\n \b*\u0004\u0018\u00010'0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010*\u001a\n \b*\u0004\u0018\u00010+0+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0019\u0010.\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0010R\u0019\u00100\u001a\n \b*\u0004\u0018\u00010101¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u00104\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0010R\u0019\u00106\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0010¨\u00068"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$WelfareViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "leftImage", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getLeftImage", "()Landroid/widget/ImageView;", "leftLeverage", "getLeftLeverage", "amount", "Landroidx/appcompat/widget/AppCompatTextView;", "getAmount", "()Landroidx/appcompat/widget/AppCompatTextView;", "amountUnit", "getAmountUnit", "rightTitle", "getRightTitle", "desc", "getDesc", "tradeProLeverageRow", "getTradeProLeverageRow", "()Landroid/view/View;", "tradeProLeverageLabel", "getTradeProLeverageLabel", "tradeProLeverageValue", "getTradeProLeverageValue", "miniTraAmount", "getMiniTraAmount", "miniProRequirement", "getMiniProRequirement", "holdingPeriodDesc", "getHoldingPeriodDesc", "expireTime", "getExpireTime", "checkBox", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBox", "()Landroidx/appcompat/widget/AppCompatCheckBox;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;", "getAction", "()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;", "condition", "getCondition", "progress", "Landroid/widget/ProgressBar;", "getProgress", "()Landroid/widget/ProgressBar;", "expireTag", "getExpireTag", "api", "getApi", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final ImageView f24803g;

        /* JADX INFO: renamed from: h */
        public final ImageView f24804h;

        /* JADX INFO: renamed from: i */
        public final AppCompatTextView f24805i;

        /* JADX INFO: renamed from: j */
        public final AppCompatTextView f24806j;

        /* JADX INFO: renamed from: k */
        public final AppCompatTextView f24807k;

        /* JADX INFO: renamed from: l */
        public final AppCompatTextView f24808l;

        /* JADX INFO: renamed from: m */
        public final View f24809m;

        /* JADX INFO: renamed from: n */
        public final AppCompatTextView f24810n;

        /* JADX INFO: renamed from: o */
        public final AppCompatTextView f24811o;

        /* JADX INFO: renamed from: p */
        public final AppCompatTextView f24812p;

        /* JADX INFO: renamed from: q */
        public final AppCompatTextView f24813q;

        /* JADX INFO: renamed from: r */
        public final AppCompatTextView f24814r;

        /* JADX INFO: renamed from: s */
        public final AppCompatTextView f24815s;

        /* JADX INFO: renamed from: t */
        public final AppCompatCheckBox f24816t;

        /* JADX INFO: renamed from: u */
        public final FuturesWelfarePrimaryButton f24817u;

        /* JADX INFO: renamed from: v */
        public final AppCompatTextView f24818v;

        /* JADX INFO: renamed from: w */
        public final ProgressBar f24819w;

        /* JADX INFO: renamed from: x */
        public final AppCompatTextView f24820x;

        /* JADX INFO: renamed from: y */
        public final AppCompatTextView f24821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24803g = (ImageView) this.itemView.findViewById(R$id.leftImage);
            this.f24804h = (ImageView) this.itemView.findViewById(R$id.leftLeverage);
            this.f24805i = (AppCompatTextView) this.itemView.findViewById(R$id.amount);
            this.f24806j = (AppCompatTextView) this.itemView.findViewById(R$id.amountUnit);
            this.f24807k = (AppCompatTextView) this.itemView.findViewById(R$id.rightTitle);
            this.f24808l = (AppCompatTextView) this.itemView.findViewById(R$id.desc);
            this.f24809m = this.itemView.findViewById(R$id.trade_pro_leverage_row);
            this.f24810n = (AppCompatTextView) this.itemView.findViewById(R$id.trade_pro_leverage_label);
            this.f24811o = (AppCompatTextView) this.itemView.findViewById(R$id.trade_pro_leverage_value);
            this.f24812p = (AppCompatTextView) this.itemView.findViewById(R$id.mini_tra_amount);
            this.f24813q = (AppCompatTextView) this.itemView.findViewById(R$id.mini_pro_requirement);
            this.f24814r = (AppCompatTextView) this.itemView.findViewById(R$id.holding_period_desc);
            this.f24815s = (AppCompatTextView) this.itemView.findViewById(R$id.expireTime);
            this.f24816t = (AppCompatCheckBox) this.itemView.findViewById(R$id.checkbox);
            this.f24817u = (FuturesWelfarePrimaryButton) this.itemView.findViewById(R$id.action);
            this.f24818v = (AppCompatTextView) this.itemView.findViewById(R$id.condition);
            this.f24819w = (ProgressBar) this.itemView.findViewById(R$id.progressBar);
            this.f24820x = (AppCompatTextView) this.itemView.findViewById(R$id.expireTag);
            this.f24821y = (AppCompatTextView) this.itemView.findViewById(R$id.api);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FuturesWelfarePrimaryButton getF24817u() {
            return this.f24817u;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AppCompatTextView getF24805i() {
            return this.f24805i;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AppCompatTextView getF24806j() {
            return this.f24806j;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AppCompatTextView getF24821y() {
            return this.f24821y;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AppCompatCheckBox getF24816t() {
            return this.f24816t;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AppCompatTextView getF24818v() {
            return this.f24818v;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AppCompatTextView getF24808l() {
            return this.f24808l;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AppCompatTextView getF24820x() {
            return this.f24820x;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final AppCompatTextView getF24815s() {
            return this.f24815s;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final AppCompatTextView getF24814r() {
            return this.f24814r;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ImageView getF24803g() {
            return this.f24803g;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final ImageView getF24804h() {
            return this.f24804h;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final AppCompatTextView getF24813q() {
            return this.f24813q;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final AppCompatTextView getF24812p() {
            return this.f24812p;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final ProgressBar getF24819w() {
            return this.f24819w;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final AppCompatTextView getF24807k() {
            return this.f24807k;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final AppCompatTextView getF24810n() {
            return this.f24810n;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final View getF24809m() {
            return this.f24809m;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final AppCompatTextView getF24811o() {
            return this.f24811o;
        }
    }

    public /* synthetic */ FuturesWelfareAdapter(FragmentManager fragmentManager, boolean z11, Function3 function3, Function3 function4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : function3, (i11 & 8) != 0 ? null : function4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesWelfareAdapter(@NotNull FragmentManager manager, boolean z11, @Nullable Function3<? super View, ? super Integer, ? super InterfaceC4633f, Unit> function3, @Nullable Function3<? super View, ? super Integer, ? super InterfaceC4633f, Unit> function4) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f24788i = manager;
        this.f24789j = z11;
        this.f24790k = function3;
        this.f24791l = function4;
        float fM6180b = C5267e0.m6180b() - C27025c.m66565c(C27017c.f54310a.m66513b(), 32);
        this.f24792m = fM6180b;
        this.f24793n = (int) ((fM6180b * 264) / 538.0f);
        this.f24794o = new ArrayList();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m28620Q(FuturesWelfareAdapter futuresWelfareAdapter, d dVar, Long l11, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        futuresWelfareAdapter.m28640P(dVar, l11, z11, z12, z13);
    }

    /* JADX INFO: renamed from: B */
    public final RecyclerView.ViewHolder m28629B(ViewGroup viewGroup) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        appCompatTextView.setTypeface(ResourcesCompat.getFont(viewGroup.getContext(), R$font.regular));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66565c = (int) C27025c.m66565c(context, 16);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM66565c2 = (int) C27025c.m66565c(context2, 8);
        marginLayoutParams.setMarginStart(iM66565c);
        marginLayoutParams.setMarginEnd(iM66565c);
        marginLayoutParams.topMargin = iM66565c2;
        marginLayoutParams.bottomMargin = iM66565c2;
        appCompatTextView.setLayoutParams(marginLayoutParams);
        return new b(appCompatTextView);
    }

    /* JADX INFO: renamed from: C */
    public final RecyclerView.ViewHolder m28630C(ViewGroup viewGroup) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
        appCompatTextView.setTypeface(ResourcesCompat.getFont(viewGroup.getContext(), R$font.medium));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66565c = (int) C27025c.m66565c(context, 16);
        marginLayoutParams.setMarginStart(iM66565c);
        marginLayoutParams.setMarginEnd(iM66565c);
        appCompatTextView.setLayoutParams(marginLayoutParams);
        return new c(appCompatTextView);
    }

    /* JADX INFO: renamed from: H */
    public final Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] m28632H(@ColorRes int i11) {
        Typeface font;
        ArrayList arrayList = new ArrayList();
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        arrayList.add(new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11))));
        if (Build.VERSION.SDK_INT > 28 && (font = ResourcesCompat.getFont(c27017c.m66513b(), R$font.medium)) != null) {
            arrayList.add(new Pair(textTagEnum, C14439y.m28811a(font)));
        }
        return (Pair[]) arrayList.toArray(new Pair[0]);
    }

    /* JADX INFO: renamed from: I */
    public final String m28633I(long j11) {
        return C42179a.m92633f(j11, null, false, true, null, 11, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m28634J(@NotNull List<? extends InterfaceC4633f> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f24794o.clear();
        this.f24794o.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public final void m28637M(d dVar, FuturesWelfareCouponAttributes futuresWelfareCouponAttributes, int i11, String str) {
        dVar.getF24808l().setAlpha(1.0f);
        BigDecimal bigDecimalM66656p = C27039d.m66656p(futuresWelfareCouponAttributes.getDeductedAmount());
        if (Intrinsics.areEqual(futuresWelfareCouponAttributes.getStatus(), "EXPIRED") || bigDecimalM66656p.compareTo(BigDecimal.ZERO) <= 0) {
            AppCompatTextView f24808l = dVar.getF24808l();
            C27017c c27017c = C27017c.f54310a;
            f24808l.setTextColor(c27017c.m66512a(R$color.c_text40));
            ProgressBar f24819w = dVar.getF24819w();
            Intrinsics.checkNotNullExpressionValue(f24819w, "<get-progress>(...)");
            ViewExtKt.m66577h(f24819w);
            AppCompatTextView f24808l2 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l2, "<get-desc>(...)");
            C27046k.m66685H(f24808l2);
            AppCompatTextView f24808l3 = dVar.getF24808l();
            int i12 = R$string.kumex_welfare_select_fee;
            StringBuilder sb2 = new StringBuilder();
            BigDecimal faceValue = futuresWelfareCouponAttributes.getFaceValue();
            sb2.append(C27041f.m66669i(faceValue != null ? C42180b.m92640e(faceValue, null, i11, true, false, false, 0, null, 121, null) : null, "0"));
            sb2.append(' ');
            sb2.append(str);
            f24808l3.setText(c27017c.m66516f(i12, sb2.toString()));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AppCompatTextView f24808l4 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l4, "<get-desc>(...)");
            Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H = m28632H(R$color.c_text60);
            highlightTextHelper.m54120f(f24808l4, (Pair[]) Arrays.copyOf(pairArrM28632H, pairArrM28632H.length));
        } else {
            ProgressBar f24819w2 = dVar.getF24819w();
            Intrinsics.checkNotNullExpressionValue(f24819w2, "<get-progress>(...)");
            C27046k.m66685H(f24819w2);
            AppCompatTextView f24808l5 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l5, "<get-desc>(...)");
            C27046k.m66685H(f24808l5);
            AppCompatTextView f24808l6 = dVar.getF24808l();
            C27017c c27017c2 = C27017c.f54310a;
            f24808l6.setTextColor(c27017c2.m66512a(R$color.c_text60));
            dVar.getF24808l().setText(c27017c2.m66516f(R$string.kumex_welfare_coupon_item_amount, C42180b.m92640e(bigDecimalM66656p, null, i11, true, false, false, 0, null, 121, null), C42180b.m92640e(C27039d.m66656p(futuresWelfareCouponAttributes.getFaceValue()), null, i11, true, false, false, 0, null, 121, null), str));
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            AppCompatTextView f24808l7 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l7, "<get-desc>(...)");
            Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H2 = m28632H(R$color.c_text);
            highlightTextHelper2.m54120f(f24808l7, (Pair[]) Arrays.copyOf(pairArrM28632H2, pairArrM28632H2.length));
            dVar.getF24819w().setProgress(bigDecimalM66656p.divide(C41014a.m89921F(futuresWelfareCouponAttributes.getFaceValue(), "1"), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100)).intValue());
        }
        if (Intrinsics.areEqual(futuresWelfareCouponAttributes.getStatus(), "EXPIRED")) {
            dVar.getF24808l().setAlpha(0.4f);
        } else {
            dVar.getF24808l().setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m28644U(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, int i11, String str) {
        int iHashCode;
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            return;
        }
        AppCompatTextView f24808l = dVar.getF24808l();
        Intrinsics.checkNotNullExpressionValue(f24808l, "<get-desc>(...)");
        C27046k.m66685H(f24808l);
        String status = futuresWelfareTrialItemEntity.getStatus();
        if (status != null && ((iHashCode = status.hashCode()) == -1668778818 ? status.equals("RECYCLE_FINISHED") : iHashCode == -1267657911 ? status.equals("SEND_FINISHED") : iHashCode == 996474430 && status.equals("ACTIVATE_FINISHED"))) {
            dVar.getF24808l().setText(C27017c.f54310a.m66516f(R$string.kumex_welfare_select_max, C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getMaxValue()), null, i11, true, false, false, 0, null, 121, null), str));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AppCompatTextView f24808l2 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l2, "<get-desc>(...)");
            Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H = m28632H(R$color.c_text60);
            highlightTextHelper.m54120f(f24808l2, (Pair[]) Arrays.copyOf(pairArrM28632H, pairArrM28632H.length));
        } else if (C27039d.m66656p(futuresWelfareTrialItemEntity.getWithdrawnValue()).compareTo(BigDecimal.ZERO) > 0) {
            dVar.getF24808l().setText(C27017c.f54310a.m66516f(R$string.kumex_welfare_trial_withdrawed, C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getWithdrawnValue()), null, i11, true, false, false, 0, null, 121, null) + ' ' + str));
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            AppCompatTextView f24808l3 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l3, "<get-desc>(...)");
            Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H2 = m28632H(R$color.c_text60);
            highlightTextHelper2.m54120f(f24808l3, (Pair[]) Arrays.copyOf(pairArrM28632H2, pairArrM28632H2.length));
        } else {
            dVar.getF24808l().setText(C27017c.f54310a.m66516f(R$string.kumex_welfare_trial_no_withdraw, new Object[0]));
        }
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED")) {
            dVar.getF24808l().setAlpha(0.4f);
        } else {
            dVar.getF24808l().setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m28645V(d dVar, String str, boolean z11) {
        if (!Intrinsics.areEqual(str, OtcAd.STATUS_NORMAL)) {
            ImageView f24804h = dVar.getF24804h();
            Intrinsics.checkNotNullExpressionValue(f24804h, "<get-leftLeverage>(...)");
            ViewExtKt.m66577h(f24804h);
            return;
        }
        ImageView f24804h2 = dVar.getF24804h();
        Intrinsics.checkNotNullExpressionValue(f24804h2, "<get-leftLeverage>(...)");
        C27046k.m66685H(f24804h2);
        if (z11) {
            ImageView f24804h3 = dVar.getF24804h();
            Intrinsics.checkNotNullExpressionValue(f24804h3, "<get-leftLeverage>(...)");
            C27046k.m66701p(f24804h3, Color.parseColor("#0d93989f"));
        } else {
            ImageView f24804h4 = dVar.getF24804h();
            Intrinsics.checkNotNullExpressionValue(f24804h4, "<get-leftLeverage>(...)");
            C27046k.m66701p(f24804h4, Color.parseColor("#0d00B47D"));
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m28646W(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        AirdropRuleDialog airdropRuleDialog = new AirdropRuleDialog();
        airdropRuleDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity.getCode())));
        airdropRuleDialog.show(this.f24788i, "FuturesTrialRulesDialog");
    }

    /* JADX INFO: renamed from: X */
    public final void m28647X(FuturesWelfareCouponItemEntity futuresWelfareCouponItemEntity) {
        C43852m.m96591c("B11FuturesBonus", "discountCardDetails", null, null, 12, null);
        FuturesCouponRulesDialog futuresCouponRulesDialog = new FuturesCouponRulesDialog();
        futuresCouponRulesDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareCouponItemEntity.getAttributes())));
        futuresCouponRulesDialog.show(this.f24788i, "FuturesCouponRulesDialog");
    }

    /* JADX INFO: renamed from: Y */
    public final void m28648Y(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        C43852m.m96591c("B11FuturesBonus", "bonusCardDetails", null, null, 12, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101333B0(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m28649Z(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        C43852m.m96591c("B11FuturesBonus", "bonusCardDetails", null, null, 12, null);
        FuturesTrialRulesDialog futuresTrialRulesDialog = new FuturesTrialRulesDialog();
        futuresTrialRulesDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity.getCode())));
        futuresTrialRulesDialog.show(this.f24788i, "FuturesTrialRulesDialog");
    }

    /* JADX INFO: renamed from: a0 */
    public final void m28650a0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C43852m.m96591c("B11FuturesBonus", "withdrawCriteria", null, null, 12, null);
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(str).m54167X4(R$string.notice_prompt).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.e0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FuturesWelfareAdapter.m28621b0(dialogInterface, i11);
            }
        }).show(this.f24788i, "showWithdrawRuleDialog");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24794o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        InterfaceC4633f interfaceC4633f = this.f24794o.get(position);
        if (interfaceC4633f instanceof FuturesWelfareSubTitle) {
            return 0;
        }
        if (interfaceC4633f instanceof FuturesWelfareFooter) {
            return 1;
        }
        if ((interfaceC4633f instanceof FuturesWelfareTrialItemEntity) || (interfaceC4633f instanceof FuturesWelfareCouponItemEntity)) {
            return 2;
        }
        boolean z11 = interfaceC4633f instanceof FuturesWelfareAsset;
        return 3;
    }

    /* JADX INFO: renamed from: m */
    public final void m28651m(@NotNull List<? extends InterfaceC4633f> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f24794o.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public final void m28653o(a aVar, int i11) {
        String str;
        PropertyEntity properties;
        InterfaceC4633f interfaceC4633f = this.f24794o.get(i11);
        if (interfaceC4633f instanceof FuturesWelfareAsset) {
            FuturesWelfareTrialItemEntity entity = ((FuturesWelfareAsset) interfaceC4633f).getEntity();
            String strM66668h = C27041f.m66668h(C27041f.m66677q(entity.getCurrency()));
            CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(entity.getCurrency()), false, 2, null);
            int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
            AppCompatTextView f24800l = aVar.getF24800l();
            BigDecimal bigDecimalM66656p = C27039d.m66656p(entity.getTrialFundBalance());
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalM66656p.compareTo(bigDecimal) == 0) {
                f24800l.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
            } else {
                f24800l.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            }
            f24800l.setText(C42828b.m93915p(C42828b.m93906g(C42828b.m93902c(C42180b.m92640e(C27039d.m66656p(entity.getTrialFundBalance()), null, iM66651k, true, true, true, 0, null, 97, null)), strM66668h, true, false, 4, null)));
            AppCompatTextView f24796h = aVar.getF24796h();
            if (C27039d.m66656p(entity.getAvailableCashAmount()).compareTo(bigDecimal) == 0) {
                f24796h.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
            } else {
                f24796h.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            }
            f24796h.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(entity.getAvailableCashAmount()), null, iM66651k, true, true, true, 0, null, 97, null), strM66668h, true, false, 4, null));
            aVar.getF24797i().setText(C27041f.m66669i(C41014a.m89933g(C27039d.m66656p(entity.getAvailableCashAmount()), null, null, 0, false, true, true, 7, null), "--"));
            aVar.getF24802n().setText(C42828b.m93915p(C42828b.m93906g(C42828b.m93902c(C42180b.m92640e(C27039d.m66656p(entity.getRealisedPNL()), null, iM66651k, true, true, true, 0, null, 97, null)), strM66668h, true, false, 4, null)));
            AppCompatTextView f24802n = aVar.getF24802n();
            Context context = aVar.getF24802n().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f24802n.setTextColor(C22890g.m54280e(context, C27039d.m66656p(entity.getRealisedPNL()), R$color.c_text40));
            BigDecimal bigDecimalM66656p2 = C27039d.m66656p(entity.getRealisedPNL());
            String withDrawHelpText = entity.getWithDrawHelpText();
            if ((withDrawHelpText == null || withDrawHelpText.length() == 0) && bigDecimalM66656p2.compareTo(bigDecimal) > 0) {
                aVar.getF24798j().setEnabled(true);
                aVar.getF24795g().setEnabled(false);
                aVar.getF24795g().setCompoundDrawablesRelative(null, null, null, null);
            } else {
                aVar.getF24798j().setEnabled(false);
                aVar.getF24795g().setEnabled(true);
                aVar.getF24795g().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C27017c.f54310a.m66514c(R$drawable.ic_question_16, Integer.valueOf(R$color.c_icon60)), (Drawable) null);
            }
            AppCompatTextView f24799k = aVar.getF24799k();
            if (C27092t0.m66897b(entity.getPrizeType())) {
                str = C27017c.f54310a.m66516f(R$string.kumex_welfare_trial_amount, new Object[0]) + " (" + strM66668h + ')';
            } else {
                str = C27017c.f54310a.m66516f(R$string.airdrop_balance, new Object[0]) + " (" + strM66668h + ')';
            }
            f24799k.setText(str);
            AppCompatTextView f24795g = aVar.getF24795g();
            StringBuilder sb2 = new StringBuilder();
            C27017c c27017c = C27017c.f54310a;
            sb2.append(c27017c.m66516f(R$string.kumex_welfare_bonus_withdraw_amount, new Object[0]));
            sb2.append(" (");
            sb2.append(strM66668h);
            sb2.append(')');
            f24795g.setText(sb2.toString());
            aVar.getF24801m().setText(c27017c.m66516f(R$string.kumex_welfare_bonus_pnl, new Object[0]) + " (" + strM66668h + ')');
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof c) {
            m28656r((c) holder, position);
            return;
        }
        if (holder instanceof b) {
            m28655q((b) holder, position);
        } else if (holder instanceof a) {
            m28653o((a) holder, position);
        } else {
            m28661w((d) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            return m28629B(parent);
        }
        if (viewType != 2) {
            return viewType != 3 ? m28630C(parent) : m28662x(parent);
        }
        return m28631D(parent);
    }

    /* JADX INFO: renamed from: q */
    public final void m28655q(b bVar, int i11) {
        InterfaceC4633f interfaceC4633f = this.f24794o.get(i11);
        if (interfaceC4633f instanceof FuturesWelfareFooter) {
            View view = bVar.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            ((AppCompatTextView) view).setText(((FuturesWelfareFooter) interfaceC4633f).getText());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m28656r(c cVar, int i11) {
        int iM66565c;
        View itemView = cVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i11 == 0) {
            iM66565c = 0;
        } else {
            Context context = cVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM66565c = (int) C27025c.m66565c(context, 20);
        }
        marginLayoutParams.topMargin = iM66565c;
        itemView.setLayoutParams(marginLayoutParams);
        InterfaceC4633f interfaceC4633f = this.f24794o.get(i11);
        if (interfaceC4633f instanceof FuturesWelfareSubTitle) {
            View view = cVar.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            ((AppCompatTextView) view).setText(((FuturesWelfareSubTitle) interfaceC4633f).getText());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m28661w(d dVar, int i11) {
        InterfaceC4633f interfaceC4633f = this.f24794o.get(i11);
        if (interfaceC4633f instanceof FuturesWelfareCouponItemEntity) {
            View itemView = dVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = this.f24793n;
            itemView.setLayoutParams(layoutParams);
            m28654p(dVar, (FuturesWelfareCouponItemEntity) interfaceC4633f);
            return;
        }
        if (interfaceC4633f instanceof FuturesWelfareTrialItemEntity) {
            AppCompatTextView f24821y = dVar.getF24821y();
            Intrinsics.checkNotNullExpressionValue(f24821y, "<get-api>(...)");
            ViewExtKt.m66577h(f24821y);
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) interfaceC4633f;
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
                View itemView2 = dVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                ViewGroup.LayoutParams layoutParams2 = itemView2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = this.f24793n;
                itemView2.setLayoutParams(layoutParams2);
                m28652n(dVar, futuresWelfareTrialItemEntity);
                return;
            }
            if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
                View itemView3 = dVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                ViewGroup.LayoutParams layoutParams3 = itemView3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i12 = this.f24793n;
                Context context = dVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layoutParams3.height = i12 + ((int) C27025c.m66565c(context, 30));
                itemView3.setLayoutParams(layoutParams3);
                m28658t(dVar, futuresWelfareTrialItemEntity);
                return;
            }
            View itemView4 = dVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
            ViewGroup.LayoutParams layoutParams4 = itemView4.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i13 = this.f24793n;
            Context context2 = dVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams4.height = i13 + ((int) C27025c.m66565c(context2, 30));
            itemView4.setLayoutParams(layoutParams4);
            m28660v(dVar, futuresWelfareTrialItemEntity);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m28616A(a aVar, FuturesWelfareAdapter futuresWelfareAdapter) {
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0) {
            return Unit.INSTANCE;
        }
        InterfaceC4633f interfaceC4633f = futuresWelfareAdapter.f24794o.get(bindingAdapterPosition);
        if (!(interfaceC4633f instanceof FuturesWelfareAsset)) {
            return Unit.INSTANCE;
        }
        futuresWelfareAdapter.m28650a0(((FuturesWelfareAsset) interfaceC4633f).getEntity().getWithDrawHelpText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m28617E(d dVar, FuturesWelfareAdapter futuresWelfareAdapter) {
        int bindingAdapterPosition = dVar.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0) {
            return Unit.INSTANCE;
        }
        InterfaceC4633f interfaceC4633f = futuresWelfareAdapter.f24794o.get(bindingAdapterPosition);
        if (interfaceC4633f instanceof FuturesWelfareCouponItemEntity) {
            futuresWelfareAdapter.m28647X((FuturesWelfareCouponItemEntity) interfaceC4633f);
        } else if (interfaceC4633f instanceof FuturesWelfareTrialItemEntity) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) interfaceC4633f;
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
                futuresWelfareAdapter.m28646W(futuresWelfareTrialItemEntity);
            } else if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
                futuresWelfareAdapter.m28648Y(futuresWelfareTrialItemEntity);
            } else {
                futuresWelfareAdapter.m28649Z(futuresWelfareTrialItemEntity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m28618F(d dVar, FuturesWelfareAdapter futuresWelfareAdapter) {
        int bindingAdapterPosition = dVar.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0) {
            return Unit.INSTANCE;
        }
        InterfaceC4633f interfaceC4633f = futuresWelfareAdapter.f24794o.get(bindingAdapterPosition);
        Function3<View, Integer, InterfaceC4633f, Unit> function3 = futuresWelfareAdapter.f24790k;
        if (function3 != null) {
            FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
            Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
            function3.invoke(f24817u, Integer.valueOf(bindingAdapterPosition), interfaceC4633f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m28619G(d dVar, FuturesWelfareAdapter futuresWelfareAdapter, CompoundButton compoundButton, boolean z11) {
        int bindingAdapterPosition = dVar.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0) {
            InterfaceC4633f interfaceC4633f = futuresWelfareAdapter.f24794o.get(bindingAdapterPosition);
            Function3<View, Integer, InterfaceC4633f, Unit> function3 = futuresWelfareAdapter.f24790k;
            if (function3 != null) {
                AppCompatCheckBox f24816t = dVar.getF24816t();
                Intrinsics.checkNotNullExpressionValue(f24816t, "<get-checkBox>(...)");
                function3.invoke(f24816t, Integer.valueOf(bindingAdapterPosition), interfaceC4633f);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m28621b0(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m28628y(a aVar, FuturesWelfareAdapter futuresWelfareAdapter) {
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0) {
            return Unit.INSTANCE;
        }
        InterfaceC4633f interfaceC4633f = futuresWelfareAdapter.f24794o.get(bindingAdapterPosition);
        if (!(interfaceC4633f instanceof FuturesWelfareAsset)) {
            return Unit.INSTANCE;
        }
        Function3<View, Integer, InterfaceC4633f, Unit> function3 = futuresWelfareAdapter.f24791l;
        if (function3 != null) {
            KcPrimaryButton f24798j = aVar.getF24798j();
            Intrinsics.checkNotNullExpressionValue(f24798j, "<get-withdraw>(...)");
            function3.invoke(f24798j, Integer.valueOf(bindingAdapterPosition), interfaceC4633f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final RecyclerView.ViewHolder m28631D(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.bkumex_futures_welfare_trial_item, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        final d dVar = new d(viewInflate);
        AppCompatTextView f24818v = dVar.getF24818v();
        Intrinsics.checkNotNullExpressionValue(f24818v, "<get-condition>(...)");
        C27046k.m66711z(f24818v, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesWelfareAdapter.m28617E(dVar, this);
            }
        }, 1, null);
        FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
        Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
        C27046k.m66711z(f24817u, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesWelfareAdapter.m28618F(dVar, this);
            }
        }, 1, null);
        dVar.getF24816t().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.futures.trade.welfare.d0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                FuturesWelfareAdapter.m28619G(dVar, this, compoundButton, z11);
            }
        });
        return dVar;
    }

    /* JADX INFO: renamed from: K */
    public final void m28635K(d dVar) {
        AppCompatTextView f24808l = dVar.getF24808l();
        Intrinsics.checkNotNullExpressionValue(f24808l, "<get-desc>(...)");
        ViewExtKt.m66577h(f24808l);
        AppCompatTextView f24814r = dVar.getF24814r();
        Intrinsics.checkNotNullExpressionValue(f24814r, "<get-holdingPeriodDesc>(...)");
        ViewExtKt.m66577h(f24814r);
        ProgressBar f24819w = dVar.getF24819w();
        Intrinsics.checkNotNullExpressionValue(f24819w, "<get-progress>(...)");
        ViewExtKt.m66577h(f24819w);
        AppCompatTextView f24820x = dVar.getF24820x();
        Intrinsics.checkNotNullExpressionValue(f24820x, "<get-expireTag>(...)");
        ViewExtKt.m66577h(f24820x);
        AppCompatTextView f24821y = dVar.getF24821y();
        Intrinsics.checkNotNullExpressionValue(f24821y, "<get-api>(...)");
        ViewExtKt.m66577h(f24821y);
        AppCompatTextView f24812p = dVar.getF24812p();
        Intrinsics.checkNotNullExpressionValue(f24812p, "<get-miniTraAmount>(...)");
        ViewExtKt.m66577h(f24812p);
        AppCompatTextView f24813q = dVar.getF24813q();
        Intrinsics.checkNotNullExpressionValue(f24813q, "<get-miniProRequirement>(...)");
        ViewExtKt.m66577h(f24813q);
    }

    /* JADX INFO: renamed from: L */
    public final void m28636L(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        String str;
        Object obj;
        C27096v0 c27096v0M24440e;
        String str2;
        List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
        if (contractList == null || (str2 = (String) CollectionsKt.firstOrNull((List) contractList)) == null) {
            str = str2;
            List<String> supportedContracts = futuresWelfareTrialItemEntity.getSupportedContracts();
            if (supportedContracts != null) {
                str = (String) CollectionsKt.firstOrNull((List) supportedContracts);
            } else {
                str = null;
            }
        }
        str = str2;
        if (str != null) {
            AppCompatTextView f24808l = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l, "<get-desc>(...)");
            ViewExtKt.m66594y(f24808l);
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
            if (contractEntityM99529O != null && (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) != null) {
                obj = str;
                obj = str;
                obj = c27096v0M24440e;
            }
            obj = str;
            obj = str;
            obj = str;
            dVar.getF24808l().setText(C27017c.f54310a.m66516f(R$string.kc_symbol_enable_title, new Object[0]) + ' ' + obj);
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AppCompatTextView f24808l2 = dVar.getF24808l();
            Intrinsics.checkNotNullExpressionValue(f24808l2, "<get-desc>(...)");
            Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H = m28632H(R$color.c_text60);
            highlightTextHelper.m54120f(f24808l2, (Pair[]) Arrays.copyOf(pairArrM28632H, pairArrM28632H.length));
            return;
        }
        AppCompatTextView f24808l3 = dVar.getF24808l();
        Intrinsics.checkNotNullExpressionValue(f24808l3, "<get-desc>(...)");
        ViewExtKt.m66577h(f24808l3);
    }

    /* JADX INFO: renamed from: N */
    public final void m28638N(d dVar, FuturesWelfareCouponAttributes futuresWelfareCouponAttributes, boolean z11) {
        AppCompatTextView f24805i = dVar.getF24805i();
        BigDecimal bigDecimalDivide = C27039d.m66656p(futuresWelfareCouponAttributes.getDeductionRatio()).divide(new BigDecimal(100), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        f24805i.setText(C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 31, null));
        AppCompatTextView f24806j = dVar.getF24806j();
        C27017c c27017c = C27017c.f54310a;
        f24806j.setText(c27017c.m66516f(R$string.kumex_fee_discount, new Object[0]));
        if (z11) {
            int iM66512a = c27017c.m66512a(R$color.c_text40);
            dVar.getF24805i().setTextColor(iM66512a);
            dVar.getF24806j().setTextColor(iM66512a);
            dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_trial_expire);
            dVar.getF24805i().setAlpha(0.4f);
            dVar.getF24806j().setAlpha(0.4f);
            return;
        }
        int color = Color.parseColor("#7780DF");
        dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_coupon);
        dVar.getF24805i().setTextColor(color);
        dVar.getF24806j().setTextColor(color);
        dVar.getF24805i().setAlpha(1.0f);
        dVar.getF24806j().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: O */
    public final void m28639O(d dVar, boolean z11) {
        ImageView f24804h = dVar.getF24804h();
        Intrinsics.checkNotNullExpressionValue(f24804h, "<get-leftLeverage>(...)");
        C27046k.m66685H(f24804h);
        if (!z11) {
            ImageView f24804h2 = dVar.getF24804h();
            Intrinsics.checkNotNullExpressionValue(f24804h2, "<get-leftLeverage>(...)");
            C27046k.m66701p(f24804h2, Color.parseColor("#0d6971c8"));
        } else {
            ImageView f24804h3 = dVar.getF24804h();
            Intrinsics.checkNotNullExpressionValue(f24804h3, "<get-leftLeverage>(...)");
            C27046k.m66701p(f24804h3, Color.parseColor("#0d93989f"));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m28640P(d dVar, Long l11, boolean z11, boolean z12, boolean z13) {
        int iM66565c;
        AppCompatTextView f24815s = dVar.getF24815s();
        Intrinsics.checkNotNullExpressionValue(f24815s, "<get-expireTime>(...)");
        ViewGroup.LayoutParams layoutParams = f24815s.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = R$id.top_content_barrier;
            if (z13) {
                Context context = dVar.getF24815s().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM66565c = (int) C27025c.m66565c(context, 40);
            } else {
                iM66565c = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iM66565c;
            f24815s.setLayoutParams(layoutParams2);
            long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v();
            long jM66652l = C27039d.m66652l(l11);
            long j11 = jM66652l - jMo25031v;
            if (z11 && !z12) {
                dVar.getF24815s().setText(C27017c.f54310a.m66516f(R$string.bkumex_expired, new Object[0]));
                AppCompatTextView f24820x = dVar.getF24820x();
                Intrinsics.checkNotNullExpressionValue(f24820x, "<get-expireTag>(...)");
                ViewExtKt.m66577h(f24820x);
            } else if (j11 <= FundingRateEntity.DEFAULT_FUNDING_PERIOD_MILLIS && j11 > 0 && !z11) {
                BigDecimal scale = new BigDecimal(String.valueOf((j11 * 1.0f) / 3600000)).setScale(0, RoundingMode.UP);
                AppCompatTextView f24815s2 = dVar.getF24815s();
                C27017c c27017c = C27017c.f54310a;
                f24815s2.setTextColor(c27017c.m66512a(R$color.complementary));
                AppCompatTextView f24820x2 = dVar.getF24820x();
                Intrinsics.checkNotNullExpressionValue(f24820x2, "<get-expireTag>(...)");
                C27046k.m66685H(f24820x2);
                dVar.getF24815s().setText(c27017c.m66516f(R$string.kumex_welfare_coupon_item_expire_time, scale));
            } else {
                AppCompatTextView f24815s3 = dVar.getF24815s();
                C27017c c27017c2 = C27017c.f54310a;
                f24815s3.setText(c27017c2.m66516f(R$string.kumex_expires_time, m28633I(jM66652l)));
                dVar.getF24815s().setTextColor(c27017c2.m66512a(R$color.c_text40));
                AppCompatTextView f24820x3 = dVar.getF24820x();
                Intrinsics.checkNotNullExpressionValue(f24820x3, "<get-expireTag>(...)");
                ViewExtKt.m66577h(f24820x3);
            }
            if (z11) {
                dVar.getF24815s().setAlpha(0.4f);
                return;
            } else {
                dVar.getF24815s().setAlpha(1.0f);
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: renamed from: R */
    public final void m28641R(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, int i11, String str) {
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            return;
        }
        dVar.getF24813q().setText(C27017c.f54310a.m66516f(R$string.kumex_minimum_profit_requirement, C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getMinCloseRealisedPnl()), null, i11, true, false, false, 0, null, 121, null), str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        AppCompatTextView f24813q = dVar.getF24813q();
        Intrinsics.checkNotNullExpressionValue(f24813q, "<get-miniProRequirement>(...)");
        Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H = m28632H(R$color.c_text60);
        highlightTextHelper.m54120f(f24813q, (Pair[]) Arrays.copyOf(pairArrM28632H, pairArrM28632H.length));
        AppCompatTextView f24813q2 = dVar.getF24813q();
        Intrinsics.checkNotNullExpressionValue(f24813q2, "<get-miniProRequirement>(...)");
        C27046k.m66685H(f24813q2);
    }

    /* JADX INFO: renamed from: S */
    public final void m28642S(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, int i11, String str) {
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            return;
        }
        dVar.getF24812p().setText(C27017c.f54310a.m66516f(R$string.kumex_minimum_transaction_amount, C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getMinTotalAmount()), null, i11, true, false, false, 0, null, 121, null), str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        AppCompatTextView f24812p = dVar.getF24812p();
        Intrinsics.checkNotNullExpressionValue(f24812p, "<get-miniTraAmount>(...)");
        Pair<HighlightTextHelper.TextTagEnum, CharacterStyle>[] pairArrM28632H = m28632H(R$color.c_text60);
        highlightTextHelper.m54120f(f24812p, (Pair[]) Arrays.copyOf(pairArrM28632H, pairArrM28632H.length));
        AppCompatTextView f24812p2 = dVar.getF24812p();
        Intrinsics.checkNotNullExpressionValue(f24812p2, "<get-miniTraAmount>(...)");
        C27046k.m66685H(f24812p2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    /* JADX INFO: renamed from: T */
    public final void m28643T(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        String status = futuresWelfareTrialItemEntity.getStatus();
        if (status != null) {
            int iHashCode = status.hashCode();
            if (iHashCode != -1267657911) {
                if (iHashCode != -1211024310) {
                    if (iHashCode == 996474430 && status.equals("ACTIVATE_FINISHED")) {
                        FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
                        C27017c c27017c = C27017c.f54310a;
                        f24817u.setText(c27017c.m66516f(R$string.go_view, new Object[0]));
                        dVar.getF24817u().setBackgroundColorRes(R$color.c_button_normal);
                        dVar.getF24817u().setTextColor(c27017c.m66512a(R$color.c_textEmphasis));
                    } else {
                        FuturesWelfarePrimaryButton f24817u2 = dVar.getF24817u();
                        C27017c c27017c2 = C27017c.f54310a;
                        f24817u2.setText(c27017c2.m66516f(R$string.bkumex_expired, new Object[0]));
                        dVar.getF24817u().setBackgroundColorRes(R$color.c_cover4);
                        dVar.getF24817u().setTextColor(c27017c2.m66512a(R$color.c_text40));
                        dVar.getF24817u().setAlpha(0.4f);
                    }
                } else if (status.equals("USE_FINISHED")) {
                    FuturesWelfarePrimaryButton f24817u3 = dVar.getF24817u();
                    C27017c c27017c3 = C27017c.f54310a;
                    f24817u3.setText(c27017c3.m66516f(R$string.margin_coupons_state_used, new Object[0]));
                    dVar.getF24817u().setBackgroundColorRes(R$color.c_button_normal);
                    dVar.getF24817u().setTextColor(c27017c3.m66512a(R$color.c_textEmphasis));
                } else {
                    FuturesWelfarePrimaryButton f24817u4 = dVar.getF24817u();
                    C27017c c27017c4 = C27017c.f54310a;
                    f24817u4.setText(c27017c4.m66516f(R$string.bkumex_expired, new Object[0]));
                    dVar.getF24817u().setBackgroundColorRes(R$color.c_cover4);
                    dVar.getF24817u().setTextColor(c27017c4.m66512a(R$color.c_text40));
                    dVar.getF24817u().setAlpha(0.4f);
                }
            } else if (status.equals("SEND_FINISHED")) {
                FuturesWelfarePrimaryButton f24817u5 = dVar.getF24817u();
                C27017c c27017c5 = C27017c.f54310a;
                f24817u5.setText(c27017c5.m66516f(R$string.kumex_welfare_activate, new Object[0]));
                dVar.getF24817u().setBackgroundColorRes(R$color.c_button_normal);
                dVar.getF24817u().setTextColor(c27017c5.m66512a(R$color.c_textEmphasis));
            } else {
                FuturesWelfarePrimaryButton f24817u6 = dVar.getF24817u();
                C27017c c27017c6 = C27017c.f54310a;
                f24817u6.setText(c27017c6.m66516f(R$string.bkumex_expired, new Object[0]));
                dVar.getF24817u().setBackgroundColorRes(R$color.c_cover4);
                dVar.getF24817u().setTextColor(c27017c6.m66512a(R$color.c_text40));
                dVar.getF24817u().setAlpha(0.4f);
            }
        } else {
            FuturesWelfarePrimaryButton f24817u7 = dVar.getF24817u();
            C27017c c27017c7 = C27017c.f54310a;
            f24817u7.setText(c27017c7.m66516f(R$string.bkumex_expired, new Object[0]));
            dVar.getF24817u().setBackgroundColorRes(R$color.c_cover4);
            dVar.getF24817u().setTextColor(c27017c7.m66512a(R$color.c_text40));
            dVar.getF24817u().setAlpha(0.4f);
        }
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED")) {
            dVar.getF24817u().setAlpha(0.4f);
        } else {
            dVar.getF24817u().setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m28652n(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        PropertyEntity properties;
        View f24809m = dVar.getF24809m();
        Intrinsics.checkNotNullExpressionValue(f24809m, "<get-tradeProLeverageRow>(...)");
        ViewExtKt.m66577h(f24809m);
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        boolean zAreEqual = Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED");
        if (zAreEqual) {
            dVar.getF24807k().setAlpha(0.4f);
            dVar.getF24818v().setAlpha(0.4f);
            dVar.getF24807k().setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
        } else {
            dVar.getF24807k().setAlpha(1.0f);
            dVar.getF24818v().setAlpha(1.0f);
            dVar.getF24807k().setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        }
        ProgressBar f24819w = dVar.getF24819w();
        Intrinsics.checkNotNullExpressionValue(f24819w, "<get-progress>(...)");
        ViewExtKt.m66577h(f24819w);
        AppCompatTextView f24820x = dVar.getF24820x();
        Intrinsics.checkNotNullExpressionValue(f24820x, "<get-expireTag>(...)");
        ViewExtKt.m66577h(f24820x);
        AppCompatCheckBox f24816t = dVar.getF24816t();
        Intrinsics.checkNotNullExpressionValue(f24816t, "<get-checkBox>(...)");
        ViewExtKt.m66577h(f24816t);
        FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
        Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
        ViewExtKt.m66594y(f24817u);
        AppCompatTextView f24812p = dVar.getF24812p();
        Intrinsics.checkNotNullExpressionValue(f24812p, "<get-miniTraAmount>(...)");
        ViewExtKt.m66577h(f24812p);
        AppCompatTextView f24813q = dVar.getF24813q();
        Intrinsics.checkNotNullExpressionValue(f24813q, "<get-miniProRequirement>(...)");
        ViewExtKt.m66577h(f24813q);
        dVar.getF24807k().setMaxLines(1);
        AppCompatTextView f24807k = dVar.getF24807k();
        C27017c c27017c = C27017c.f54310a;
        f24807k.setText(C14343g0.m28690a(c27017c.m66516f(R$string.kumex_airdrop_card_title, new Object[0]), futuresWelfareTrialItemEntity.getCouponAlias()));
        m28659u(iM66651k, dVar, futuresWelfareTrialItemEntity, true);
        m28620Q(this, dVar, futuresWelfareTrialItemEntity.getExpiredPeriod(), zAreEqual, true, false, 16, null);
        m28636L(dVar, futuresWelfareTrialItemEntity);
        m28643T(dVar, futuresWelfareTrialItemEntity);
        m28645V(dVar, C27041f.m66669i(futuresWelfareTrialItemEntity.getType(), OtcAd.STATUS_NORMAL), zAreEqual);
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "SEND_FINISHED")) {
            AppCompatTextView f24814r = dVar.getF24814r();
            Intrinsics.checkNotNullExpressionValue(f24814r, "<get-holdingPeriodDesc>(...)");
            ViewExtKt.m66594y(f24814r);
            dVar.getF24814r().setText(c27017c.m66516f(R$string.kumex_airdrop_card_hold_time, Integer.valueOf(C27039d.m66650j(futuresWelfareTrialItemEntity.getUseDurition()))));
            if (C27025c.m66566d(futuresWelfareTrialItemEntity.isLoading())) {
                dVar.getF24817u().m55043o();
            } else {
                dVar.getF24817u().mo28851l();
            }
        } else {
            AppCompatTextView f24814r2 = dVar.getF24814r();
            Intrinsics.checkNotNullExpressionValue(f24814r2, "<get-holdingPeriodDesc>(...)");
            ViewExtKt.m66577h(f24814r2);
        }
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED")) {
            dVar.getF24817u().setEnabled(true);
            dVar.getF24817u().setAlpha(1.0f);
            dVar.getF24817u().setText(c27017c.m66516f(R$string.go_view, new Object[0]));
            dVar.getF24817u().setTextColor(c27017c.m66512a(R$color.c_textEmphasis));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m28654p(d dVar, FuturesWelfareCouponItemEntity futuresWelfareCouponItemEntity) {
        PropertyEntity properties;
        View f24809m = dVar.getF24809m();
        Intrinsics.checkNotNullExpressionValue(f24809m, "<get-tradeProLeverageRow>(...)");
        ViewExtKt.m66577h(f24809m);
        AppCompatTextView f24814r = dVar.getF24814r();
        Intrinsics.checkNotNullExpressionValue(f24814r, "<get-holdingPeriodDesc>(...)");
        ViewExtKt.m66577h(f24814r);
        FuturesWelfareCouponAttributes attributes = futuresWelfareCouponItemEntity.getAttributes();
        boolean z11 = false;
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(attributes.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        if (this.f24789j) {
            AppCompatCheckBox f24816t = dVar.getF24816t();
            Intrinsics.checkNotNullExpressionValue(f24816t, "<get-checkBox>(...)");
            C27046k.m66685H(f24816t);
            dVar.getF24816t().setBackgroundResource(R$drawable.ui_ic_checkbox_24);
            dVar.getF24816t().setAlpha(0.4f);
            dVar.getF24816t().setEnabled(false);
        } else {
            AppCompatCheckBox f24816t2 = dVar.getF24816t();
            Intrinsics.checkNotNullExpressionValue(f24816t2, "<get-checkBox>(...)");
            ViewExtKt.m66577h(f24816t2);
        }
        dVar.getF24817u().mo28851l();
        FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
        Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
        ViewExtKt.m66577h(f24817u);
        boolean zAreEqual = Intrinsics.areEqual(C27041f.m66668h(attributes.getStatus()), "EXPIRED");
        dVar.getF24807k().setMaxLines(2);
        dVar.getF24807k().setText(C14343g0.m28690a(C27017c.f54310a.m66516f(R$string.kumex_welfare_coupon_rule_title, new Object[0]), attributes.getCouponAlias()));
        if (zAreEqual) {
            dVar.getF24818v().setAlpha(0.4f);
            dVar.getF24807k().setAlpha(0.4f);
        } else {
            dVar.getF24818v().setAlpha(1.0f);
            dVar.getF24807k().setAlpha(1.0f);
        }
        m28620Q(this, dVar, attributes.getValidPeriod(), zAreEqual, false, false, 16, null);
        m28637M(dVar, attributes, iM66651k, C27041f.m66668h(C27041f.m66677q(attributes.getCurrency())));
        m28638N(dVar, attributes, zAreEqual);
        m28639O(dVar, zAreEqual);
        AppCompatTextView f24821y = dVar.getF24821y();
        Intrinsics.checkNotNullExpressionValue(f24821y, "<get-api>(...)");
        if (C27039d.m66650j(attributes.getTradeMode()) == 1) {
            z11 = true;
        }
        C27046k.m66684G(f24821y, z11);
        AppCompatTextView f24812p = dVar.getF24812p();
        Intrinsics.checkNotNullExpressionValue(f24812p, "<get-miniTraAmount>(...)");
        ViewExtKt.m66577h(f24812p);
        AppCompatTextView f24813q = dVar.getF24813q();
        Intrinsics.checkNotNullExpressionValue(f24813q, "<get-miniProRequirement>(...)");
        ViewExtKt.m66577h(f24813q);
    }

    /* JADX INFO: renamed from: s */
    public final void m28657s(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, boolean z11) {
        float f11;
        BigDecimal maxLeverage = futuresWelfareTrialItemEntity.getMaxLeverage();
        if (maxLeverage != null && maxLeverage.compareTo(BigDecimal.ZERO) > 0) {
            View f24809m = dVar.getF24809m();
            Intrinsics.checkNotNullExpressionValue(f24809m, "<get-tradeProLeverageRow>(...)");
            C27046k.m66685H(f24809m);
            dVar.getF24810n().setText(C27017c.f54310a.m66516f(R$string.kumex_trade_pro_max_leverage, new Object[0]));
            dVar.getF24811o().setText(C42828b.m93915p(C17054k0.m36530d(maxLeverage, false, 1, null)));
            View f24809m2 = dVar.getF24809m();
            if (z11) {
                f11 = 0.4f;
            } else {
                f11 = 1.0f;
            }
            f24809m2.setAlpha(f11);
            return;
        }
        View f24809m3 = dVar.getF24809m();
        Intrinsics.checkNotNullExpressionValue(f24809m3, "<get-tradeProLeverageRow>(...)");
        ViewExtKt.m66577h(f24809m3);
    }

    /* JADX INFO: renamed from: t */
    public final void m28658t(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        float f11;
        int i11;
        PropertyEntity properties;
        m28635K(dVar);
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        boolean zAreEqual = Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED");
        AppCompatTextView f24807k = dVar.getF24807k();
        float f12 = 1.0f;
        if (zAreEqual) {
            f11 = 0.4f;
        } else {
            f11 = 1.0f;
        }
        f24807k.setAlpha(f11);
        AppCompatTextView f24818v = dVar.getF24818v();
        if (zAreEqual) {
            f12 = 0.4f;
        }
        f24818v.setAlpha(f12);
        AppCompatTextView f24807k2 = dVar.getF24807k();
        C27017c c27017c = C27017c.f54310a;
        if (zAreEqual) {
            i11 = R$color.c_text60;
        } else {
            i11 = R$color.c_text;
        }
        f24807k2.setTextColor(c27017c.m66512a(i11));
        String strM66668h = C27041f.m66668h(futuresWelfareTrialItemEntity.getDisplayTitle());
        if (StringsKt.isBlank(strM66668h)) {
            strM66668h = c27017c.m66516f(com.kubi.kumex.api.R$string.kumex_trade_pro_trial_title, new Object[0]);
        }
        dVar.getF24807k().setMaxLines(1);
        dVar.getF24807k().setText(C14343g0.m28690a(strM66668h, futuresWelfareTrialItemEntity.getCouponAlias()));
        m28659u(iM66651k, dVar, futuresWelfareTrialItemEntity, false);
        m28657s(dVar, futuresWelfareTrialItemEntity, zAreEqual);
        m28640P(dVar, futuresWelfareTrialItemEntity.getExpiredPeriod(), zAreEqual, true, true);
        m28645V(dVar, C27041f.m66669i(futuresWelfareTrialItemEntity.getType(), OtcAd.STATUS_NORMAL), zAreEqual);
        AppCompatTextView f24818v2 = dVar.getF24818v();
        Intrinsics.checkNotNullExpressionValue(f24818v2, "<get-condition>(...)");
        C27046k.m66685H(f24818v2);
        if (this.f24789j && Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED")) {
            dVar.getF24816t().setEnabled(true);
            dVar.getF24816t().setBackgroundResource(R$drawable.ui_selector_checkbox);
            dVar.getF24816t().setChecked(futuresWelfareTrialItemEntity.getChecked());
            AppCompatCheckBox f24816t = dVar.getF24816t();
            Intrinsics.checkNotNullExpressionValue(f24816t, "<get-checkBox>(...)");
            C27046k.m66685H(f24816t);
            FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
            Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
            ViewExtKt.m66577h(f24817u);
            dVar.getF24817u().mo28851l();
            return;
        }
        dVar.getF24816t().setEnabled(false);
        AppCompatCheckBox f24816t2 = dVar.getF24816t();
        Intrinsics.checkNotNullExpressionValue(f24816t2, "<get-checkBox>(...)");
        ViewExtKt.m66577h(f24816t2);
        FuturesWelfarePrimaryButton f24817u2 = dVar.getF24817u();
        Intrinsics.checkNotNullExpressionValue(f24817u2, "<get-action>(...)");
        C27046k.m66685H(f24817u2);
        m28643T(dVar, futuresWelfareTrialItemEntity);
        if (C27025c.m66566d(futuresWelfareTrialItemEntity.isLoading())) {
            dVar.getF24817u().m55043o();
        } else {
            dVar.getF24817u().mo28851l();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m28659u(int i11, d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, boolean z11) {
        BigDecimal bigDecimalM66656p;
        AppCompatTextView f24805i = dVar.getF24805i();
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED") && !z11 && !futuresWelfareTrialItemEntity.isLeadTrialFund() && !futuresWelfareTrialItemEntity.isTradeProTrial()) {
            bigDecimalM66656p = C27039d.m66656p(futuresWelfareTrialItemEntity.getTrialFundBalance());
        } else {
            bigDecimalM66656p = C27039d.m66656p(futuresWelfareTrialItemEntity.getFaceValue());
        }
        f24805i.setText(C42180b.m92640e(bigDecimalM66656p, null, i11, true, false, true, 0, null, 105, null));
        dVar.getF24806j().setText(C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntity.getCurrency())));
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED")) {
            AppCompatTextView f24805i2 = dVar.getF24805i();
            C27017c c27017c = C27017c.f54310a;
            int i12 = R$color.c_text60;
            f24805i2.setTextColor(c27017c.m66512a(i12));
            dVar.getF24806j().setTextColor(c27017c.m66512a(i12));
            if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getType(), "VIP")) {
                dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_vip_expire);
            } else {
                dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_trial_expire);
            }
            dVar.getF24805i().setAlpha(0.4f);
            dVar.getF24806j().setAlpha(0.4f);
            return;
        }
        dVar.getF24805i().setAlpha(1.0f);
        dVar.getF24806j().setAlpha(1.0f);
        if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getType(), "VIP")) {
            dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_vip);
            dVar.getF24805i().setTextColor(Color.parseColor("#DB984B"));
            dVar.getF24806j().setTextColor(Color.parseColor("#DB984B"));
        } else {
            dVar.getF24803g().setImageResource(R$drawable.bkumex_futures_trial);
            AppCompatTextView f24805i3 = dVar.getF24805i();
            C27017c c27017c2 = C27017c.f54310a;
            int i13 = R$color.primary;
            f24805i3.setTextColor(c27017c2.m66512a(i13));
            dVar.getF24806j().setTextColor(c27017c2.m66512a(i13));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m28660v(d dVar, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        String strM66516f;
        PropertyEntity properties;
        View f24809m = dVar.getF24809m();
        Intrinsics.checkNotNullExpressionValue(f24809m, "<get-tradeProLeverageRow>(...)");
        ViewExtKt.m66577h(f24809m);
        AppCompatTextView f24814r = dVar.getF24814r();
        Intrinsics.checkNotNullExpressionValue(f24814r, "<get-holdingPeriodDesc>(...)");
        ViewExtKt.m66577h(f24814r);
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        String strM66668h = C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntity.getCurrency()));
        boolean zAreEqual = Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "RECYCLE_FINISHED");
        if (zAreEqual) {
            dVar.getF24807k().setAlpha(0.4f);
            dVar.getF24818v().setAlpha(0.4f);
            dVar.getF24807k().setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
        } else {
            dVar.getF24807k().setAlpha(1.0f);
            dVar.getF24818v().setAlpha(1.0f);
            dVar.getF24807k().setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        }
        if (!KuMexDepend.f30378a.m35900b().mo20635p() && !futuresWelfareTrialItemEntity.isLeadTrialFund()) {
            strM66516f = C27017c.f54310a.m66516f(R$string.kc_futures_trail_fund, new Object[0]);
        } else {
            strM66516f = C27017c.f54310a.m66516f(R$string.kuemx_lead_trial_title, new Object[0]);
        }
        dVar.getF24807k().setMaxLines(1);
        dVar.getF24807k().setText(C14343g0.m28690a(strM66516f, futuresWelfareTrialItemEntity.getCouponAlias()));
        m28659u(iM66651k, dVar, futuresWelfareTrialItemEntity, false);
        m28620Q(this, dVar, futuresWelfareTrialItemEntity.getExpiredPeriod(), zAreEqual, true, false, 16, null);
        m28643T(dVar, futuresWelfareTrialItemEntity);
        m28644U(dVar, futuresWelfareTrialItemEntity, iM66651k, strM66668h);
        m28642S(dVar, futuresWelfareTrialItemEntity, iM66651k, strM66668h);
        m28641R(dVar, futuresWelfareTrialItemEntity, iM66651k, strM66668h);
        m28645V(dVar, C27041f.m66669i(futuresWelfareTrialItemEntity.getType(), OtcAd.STATUS_NORMAL), zAreEqual);
        ProgressBar f24819w = dVar.getF24819w();
        Intrinsics.checkNotNullExpressionValue(f24819w, "<get-progress>(...)");
        ViewExtKt.m66577h(f24819w);
        AppCompatTextView f24820x = dVar.getF24820x();
        Intrinsics.checkNotNullExpressionValue(f24820x, "<get-expireTag>(...)");
        ViewExtKt.m66577h(f24820x);
        if (this.f24789j && Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED")) {
            dVar.getF24816t().setEnabled(true);
            dVar.getF24816t().setBackgroundResource(R$drawable.ui_selector_checkbox);
            dVar.getF24816t().setChecked(futuresWelfareTrialItemEntity.getChecked());
            AppCompatCheckBox f24816t = dVar.getF24816t();
            Intrinsics.checkNotNullExpressionValue(f24816t, "<get-checkBox>(...)");
            C27046k.m66685H(f24816t);
            FuturesWelfarePrimaryButton f24817u = dVar.getF24817u();
            Intrinsics.checkNotNullExpressionValue(f24817u, "<get-action>(...)");
            ViewExtKt.m66577h(f24817u);
            dVar.getF24817u().mo28851l();
            return;
        }
        dVar.getF24816t().setEnabled(false);
        AppCompatCheckBox f24816t2 = dVar.getF24816t();
        Intrinsics.checkNotNullExpressionValue(f24816t2, "<get-checkBox>(...)");
        ViewExtKt.m66577h(f24816t2);
        FuturesWelfarePrimaryButton f24817u2 = dVar.getF24817u();
        Intrinsics.checkNotNullExpressionValue(f24817u2, "<get-action>(...)");
        C27046k.m66685H(f24817u2);
        if (C27025c.m66566d(futuresWelfareTrialItemEntity.isLoading())) {
            dVar.getF24817u().m55043o();
        } else {
            dVar.getF24817u().mo28851l();
        }
    }

    /* JADX INFO: renamed from: x */
    public final RecyclerView.ViewHolder m28662x(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.bkumex_futures_welfare_assets_item, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        final a aVar = new a(viewInflate);
        KcPrimaryButton f24798j = aVar.getF24798j();
        Intrinsics.checkNotNullExpressionValue(f24798j, "<get-withdraw>(...)");
        C27046k.m66711z(f24798j, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesWelfareAdapter.m28628y(aVar, this);
            }
        }, 1, null);
        AppCompatTextView f24795g = aVar.getF24795g();
        Intrinsics.checkNotNullExpressionValue(f24795g, "<get-withdrawLabel>(...)");
        C27046k.m66711z(f24795g, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesWelfareAdapter.m28616A(aVar, this);
            }
        }, 1, null);
        return aVar;
    }
}

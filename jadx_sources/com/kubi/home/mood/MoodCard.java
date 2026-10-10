package com.kubi.home.mood;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import com.blankj.utilcode.util.C5303w0;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$font;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.MoodInfoEntity;
import com.kubi.home.entity.RawEntity;
import com.kubi.home.entity.TopCoinEntity;
import com.kubi.home.entity.TopCoinInfoEntity;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.resources.C22890g;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinUpdownCompareIndicator;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36719d;
import f00.C37304a;
import fj.C37517f;
import g00.InterfaceC37749a;
import g00.InterfaceC37754f;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p058cj.C4988a;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MoodCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0007J\u000e\u0010\u001c\u001a\u00020\u001d*\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001e\u001a\u00020\u0014*\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001f\u001a\u00020\u0014*\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010 \u001a\u00020\u0014*\u0004\u0018\u00010\u0019H\u0003J\u000e\u0010!\u001a\u00020\"*\u0004\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\u00020\"*\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\f\u0010&\u001a\u00020\u0014*\u00020'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0016J\u000e\u0010)\u001a\u00020\"*\u0004\u0018\u00010\"H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/home/mood/MoodCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/home/mood/MoodCardContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/mood/MoodCardVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeCardMoodBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/home/databinding/HomeCardMoodBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "currentEntity", "Lcom/kubi/home/entity/MoodInfoEntity;", "refreshViewData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "isPlanB", "", "renderTitle", "renderCompareIndicator", "renderUpDown", "optName", "", "optRate", "Ljava/math/BigDecimal;", "hideDepositGuide", "setTrianglePosition", "Lcom/cpiz/android/bubbleview/BubbleTextView;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "reversPercent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMoodCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoodCard.kt\ncom/kubi/home/mood/MoodCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,305:1\n147#2,16:306\n136#3:322\n126#3,2:327\n93#4,4:323\n*S KotlinDebug\n*F\n+ 1 MoodCard.kt\ncom/kubi/home/mood/MoodCard\n*L\n71#1:306,16\n77#1:322\n269#1:327,2\n109#1:323,4\n*E\n"})
public final class MoodCard extends SimpleStateCard<MoodCardContract$UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f25850Z = {Reflection.property1(new PropertyReference1Impl(MoodCard.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeCardMoodBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f25851X = C45681e.m100799e(this, new Function1<MoodCard, C37517f>() { // from class: com.kubi.home.mood.MoodCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37517f invoke(@NotNull MoodCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37517f.m84494a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37517f, Unit>() { // from class: com.kubi.home.mood.MoodCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37517f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37517f c37517f) {
            invoke(c37517f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @Nullable
    public MoodInfoEntity f25852Y;

    /* JADX INFO: renamed from: E3 */
    public static final Unit m29558E3(MoodCard moodCard, MoodInfoEntity moodInfoEntity) {
        if (moodCard.f25852Y != null) {
            if ((moodInfoEntity != null ? moodInfoEntity.getRaw() : null) == null || Intrinsics.areEqual(moodCard.f25852Y, moodInfoEntity)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("currentEntity==entity: ");
                sb2.append(moodInfoEntity != null ? C27029c.m66606i(moodInfoEntity) : null);
                C4988a.m5287b(sb2.toString(), null, 1, null);
                return Unit.INSTANCE;
            }
        }
        if (moodCard.f25852Y == null) {
            C43841b.m96557d("event_load_home_mood", "page_load_end", null, 4, null);
        }
        moodCard.m29587H3(moodInfoEntity);
        moodCard.m29586F3(moodInfoEntity);
        moodCard.m29588J3(moodInfoEntity);
        moodCard.f25852Y = moodInfoEntity;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m29560I3(MoodCard moodCard, MoodInfoEntity moodInfoEntity) {
        TextView textView;
        RawEntity raw;
        FixAutoSizeTextView fixAutoSizeTextView;
        Object advancedNum;
        RawEntity raw2;
        Integer declinedNum;
        RawEntity raw3;
        C37517f c37517fM29591u3 = moodCard.m29591u3();
        if (c37517fM29591u3 == null || (textView = c37517fM29591u3.f83252f) == null) {
            return Unit.INSTANCE;
        }
        Context context = textView.getContext();
        if (moodCard.m29582A3(moodInfoEntity)) {
            int i11 = R$string.home_emotion_count;
            Object obj = "--";
            if (moodInfoEntity == null || (raw3 = moodInfoEntity.getRaw()) == null || (advancedNum = raw3.getAdvancedNum()) == null) {
                advancedNum = "--";
            }
            String strValueOf = String.valueOf(advancedNum);
            if (moodInfoEntity != null && (raw2 = moodInfoEntity.getRaw()) != null && (declinedNum = raw2.getDeclinedNum()) != null) {
                obj = declinedNum;
            }
            textView.setText(moodCard.getStringRes(i11, strValueOf, String.valueOf(obj)));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            int i12 = R$font.medium;
            Intrinsics.checkNotNull(context);
            highlightTextHelper.m54120f(textView, new Pair(textTagEnum, C22912t.m54408f(i12, C22890g.m54291p(context))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, C22912t.m54408f(i12, C22890g.m54289n(context))));
        } else {
            BigDecimal bigDecimalM66671k = C27041f.m66671k((moodInfoEntity == null || (raw = moodInfoEntity.getRaw()) == null) ? null : raw.getAverageRate());
            C27096v0 c27096v0 = new C27096v0();
            c27096v0.append(moodCard.getStringRes(R$string.home_emotion_rate, moodCard.m29589N3(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null) : null)));
            Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, C5303w0.m6511a() ? R$drawable.ic2_arrow_left_12 : R$drawable.ic2_arrow_right_12, null, 2, null);
            DrawableCompat.setTint(drawableM66510d, moodCard.getColorRes(R$color.c_icon60));
            drawableM66510d.setBounds(0, C27040e.m66658b(1), drawableM66510d.getMinimumWidth(), drawableM66510d.getMinimumHeight());
            c27096v0.m66906f(drawableM66510d);
            textView.setText(c27096v0);
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
            int i13 = R$font.semi;
            Intrinsics.checkNotNull(context);
            highlightTextHelper2.m54116a(textView, textTagEnum2, C22912t.m54408f(i13, C22890g.m54279d(context, C41014a.m89924I(bigDecimalM66671k, 0.0d, 1, null).doubleValue(), 0, 2, null)));
        }
        C37517f c37517fM29591u4 = moodCard.m29591u3();
        if (c37517fM29591u4 != null && (fixAutoSizeTextView = c37517fM29591u4.f83250d) != null) {
            textView.setPaddingRelative(0, 0, fixAutoSizeTextView.getWidth(), 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m29561K3(MoodCard moodCard, final MoodInfoEntity moodInfoEntity) {
        String string;
        RawEntity raw;
        TopCoinEntity declinedTop1;
        RawEntity raw2;
        TopCoinEntity declinedTop2;
        TopCoinInfoEntity klineMetadata;
        String string2;
        RawEntity raw3;
        TopCoinEntity advancedTop1;
        RawEntity raw4;
        TopCoinEntity advancedTop2;
        TopCoinInfoEntity klineMetadata2;
        C37517f c37517fM29591u3 = moodCard.m29591u3();
        if (c37517fM29591u3 == null) {
            return Unit.INSTANCE;
        }
        Context context = c37517fM29591u3.getRoot().getContext();
        String crypto = (moodInfoEntity == null || (raw4 = moodInfoEntity.getRaw()) == null || (advancedTop2 = raw4.getAdvancedTop1()) == null || (klineMetadata2 = advancedTop2.getKlineMetadata()) == null) ? null : klineMetadata2.getCrypto();
        if (crypto == null || crypto.length() == 0) {
            BaseTextView tvTopUp = c37517fM29591u3.f83254h;
            Intrinsics.checkNotNullExpressionValue(tvTopUp, "tvTopUp");
            C27046k.m66700o(tvTopUp);
        } else {
            BaseTextView tvTopUp2 = c37517fM29591u3.f83254h;
            Intrinsics.checkNotNullExpressionValue(tvTopUp2, "tvTopUp");
            C27046k.m66685H(tvTopUp2);
            BigDecimal bigDecimalM66671k = C27041f.m66671k((moodInfoEntity == null || (raw3 = moodInfoEntity.getRaw()) == null || (advancedTop1 = raw3.getAdvancedTop1()) == null) ? null : advancedTop1.getRate());
            if (C5303w0.m6511a()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<span>");
                sb2.append(bigDecimalM66671k != null ? moodCard.m29584C3(bigDecimalM66671k) : null);
                sb2.append("</span> ");
                sb2.append(moodCard.m29583B3(crypto));
                string2 = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(moodCard.m29583B3(crypto));
                sb3.append(" <span>");
                sb3.append(bigDecimalM66671k != null ? moodCard.m29584C3(bigDecimalM66671k) : null);
                sb3.append("</span>");
                string2 = sb3.toString();
            }
            c37517fM29591u3.f83254h.setText(string2);
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView tvTopUp3 = c37517fM29591u3.f83254h;
            Intrinsics.checkNotNullExpressionValue(tvTopUp3, "tvTopUp");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            int i11 = R$font.medium;
            Intrinsics.checkNotNull(context);
            highlightTextHelper.m54116a(tvTopUp3, textTagEnum, C22912t.m54408f(i11, C22890g.m54279d(context, bigDecimalM66671k != null ? bigDecimalM66671k.doubleValue() : 0.0d, 0, 2, null)));
            BaseTextView tvTopUp4 = c37517fM29591u3.f83254h;
            Intrinsics.checkNotNullExpressionValue(tvTopUp4, "tvTopUp");
            C27046k.m66711z(tvTopUp4, 0L, new Function0() { // from class: com.kubi.home.mood.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29562L3(moodInfoEntity);
                }
            }, 1, null);
        }
        String crypto2 = (moodInfoEntity == null || (raw2 = moodInfoEntity.getRaw()) == null || (declinedTop2 = raw2.getDeclinedTop1()) == null || (klineMetadata = declinedTop2.getKlineMetadata()) == null) ? null : klineMetadata.getCrypto();
        if (crypto2 == null || crypto2.length() == 0) {
            BaseTextView tvTopDown = c37517fM29591u3.f83253g;
            Intrinsics.checkNotNullExpressionValue(tvTopDown, "tvTopDown");
            C27046k.m66700o(tvTopDown);
        } else {
            BaseTextView tvTopDown2 = c37517fM29591u3.f83253g;
            Intrinsics.checkNotNullExpressionValue(tvTopDown2, "tvTopDown");
            C27046k.m66685H(tvTopDown2);
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k((moodInfoEntity == null || (raw = moodInfoEntity.getRaw()) == null || (declinedTop1 = raw.getDeclinedTop1()) == null) ? null : declinedTop1.getRate());
            if (C5303w0.m6511a()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("<span>");
                sb4.append(bigDecimalM66671k2 != null ? moodCard.m29584C3(bigDecimalM66671k2) : null);
                sb4.append("</span> ");
                sb4.append(moodCard.m29583B3(crypto2));
                string = sb4.toString();
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(moodCard.m29583B3(crypto2));
                sb5.append(" <span>");
                sb5.append(bigDecimalM66671k2 != null ? moodCard.m29584C3(bigDecimalM66671k2) : null);
                sb5.append("</span>");
                string = sb5.toString();
            }
            c37517fM29591u3.f83253g.setText(string);
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            BaseTextView tvTopDown3 = c37517fM29591u3.f83253g;
            Intrinsics.checkNotNullExpressionValue(tvTopDown3, "tvTopDown");
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
            int i12 = R$font.medium;
            Intrinsics.checkNotNull(context);
            highlightTextHelper2.m54116a(tvTopDown3, textTagEnum2, C22912t.m54408f(i12, C22890g.m54279d(context, bigDecimalM66671k2 != null ? bigDecimalM66671k2.doubleValue() : 0.0d, 0, 2, null)));
            BaseTextView tvTopDown4 = c37517fM29591u3.f83253g;
            Intrinsics.checkNotNullExpressionValue(tvTopDown4, "tvTopDown");
            C27046k.m66711z(tvTopDown4, 0L, new Function0() { // from class: com.kubi.home.mood.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29563M3(moodInfoEntity);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m29562L3(MoodInfoEntity moodInfoEntity) throws JSONException {
        RawEntity raw;
        TopCoinEntity advancedTop1;
        TopCoinInfoEntity klineMetadata;
        String symbol;
        if (moodInfoEntity != null && (raw = moodInfoEntity.getRaw()) != null && (advancedTop1 = raw.getAdvancedTop1()) != null && (klineMetadata = advancedTop1.getKlineMetadata()) != null && (symbol = klineMetadata.getSymbol()) != null) {
            ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "GainemToken");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "MarketSentiment", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m29563M3(MoodInfoEntity moodInfoEntity) throws JSONException {
        RawEntity raw;
        TopCoinEntity declinedTop1;
        TopCoinInfoEntity klineMetadata;
        String symbol;
        if (moodInfoEntity != null && (raw = moodInfoEntity.getRaw()) != null && (declinedTop1 = raw.getDeclinedTop1()) != null && (klineMetadata = declinedTop1.getKlineMetadata()) != null && (symbol = klineMetadata.getSymbol()) != null) {
            ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "LosersToken");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "MarketSentiment", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m29564P3(FixAutoSizeTextView fixAutoSizeTextView, final BubbleTextView bubbleTextView) {
        final float fM66657a = C27040e.m66657a(60.0f);
        try {
            float width = fixAutoSizeTextView.getWidth() / 2;
            bubbleTextView.setArrowPosDelta(width > 0.0f ? width + C27040e.m66658b(12) : fM66657a);
        } catch (Throwable th2) {
            C44128b.m97264h(th2);
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29565Q3(bubbleTextView, fM66657a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m29580y3(MoodCard moodCard) throws JSONException {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "HOMEPAGE", C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "addFundButton", null, 4, null), null, null, 24, null);
        moodCard.m29592v3();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "addFundButton", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m29581z3() throws JSONException {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.CHANCE.getType(), "emotion", null, null, null, null, null, 124, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "Quotes");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "MarketSentiment", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final boolean m29582A3(MoodInfoEntity moodInfoEntity) {
        String moduleCode = moodInfoEntity != null ? moodInfoEntity.getModuleCode() : null;
        if (moduleCode == null) {
            moduleCode = "";
        }
        return StringsKt.equals("B", moduleCode, true);
    }

    /* JADX INFO: renamed from: B3 */
    public final String m29583B3(String str) {
        if (str == null) {
            return "- -";
        }
        if (str.length() <= 5) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("..");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: C3 */
    public final String m29584C3(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "--";
        }
        String strM93911l = C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null));
        return strM93911l == null ? "" : strM93911l;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: D3 */
    public final void m29585D3(@Nullable final MoodInfoEntity moodInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCard.m29558E3(this.f25861b, moodInfoEntity);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public final void m29586F3(final MoodInfoEntity moodInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCard.m29559G3(this.f25865b, moodInfoEntity);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m29587H3(final MoodInfoEntity moodInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCard.m29560I3(this.f25869b, moodInfoEntity);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: J3 */
    public final void m29588J3(final MoodInfoEntity moodInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCard.m29561K3(this.f25867b, moodInfoEntity);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final String m29589N3(String str) {
        if (str == null) {
            return "--";
        }
        if (!C5303w0.m6511a()) {
            return str;
        }
        return StringsKt.replace$default(str, "%", "", false, 4, (Object) null) + '%';
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C14690m) {
            m29585D3(((C14690m) singleEvent).getF25873a());
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.home_card_mood;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<MoodCardVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MoodCardVM.class);
    }

    @Nullable
    /* JADX INFO: renamed from: u3 */
    public final C37517f m29591u3() {
        return (C37517f) this.f25851X.getValue(this, f25850Z[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m29592v3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCard.m29578w3(this.f25860b);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m29559G3(MoodCard moodCard, MoodInfoEntity moodInfoEntity) {
        Integer advancedNum;
        Integer unchangedNum;
        CoinUpdownCompareIndicator coinUpdownCompareIndicator;
        CoinUpdownCompareIndicator coinUpdownCompareIndicator2;
        CoinUpdownCompareIndicator coinUpdownCompareIndicator3;
        RawEntity raw;
        RawEntity raw2;
        RawEntity raw3;
        CoinUpdownCompareIndicator coinUpdownCompareIndicator4;
        if (!moodCard.m29582A3(moodInfoEntity)) {
            C37517f c37517fM29591u3 = moodCard.m29591u3();
            if (c37517fM29591u3 != null && (coinUpdownCompareIndicator4 = c37517fM29591u3.f83248b) != null) {
                C27046k.m66700o(coinUpdownCompareIndicator4);
            }
            return Unit.INSTANCE;
        }
        Integer declinedNum = null;
        if (moodInfoEntity != null && (raw3 = moodInfoEntity.getRaw()) != null) {
            advancedNum = raw3.getAdvancedNum();
        } else {
            advancedNum = null;
        }
        int iAbs = Math.abs(C27039d.m66650j(advancedNum));
        if (moodInfoEntity != null && (raw2 = moodInfoEntity.getRaw()) != null) {
            unchangedNum = raw2.getUnchangedNum();
        } else {
            unchangedNum = null;
        }
        int iAbs2 = Math.abs(C27039d.m66650j(unchangedNum));
        if (moodInfoEntity != null && (raw = moodInfoEntity.getRaw()) != null) {
            declinedNum = raw.getDeclinedNum();
        }
        int iAbs3 = Math.abs(C27039d.m66650j(declinedNum));
        if (iAbs + iAbs2 + iAbs3 <= 0) {
            C37517f c37517fM29591u4 = moodCard.m29591u3();
            if (c37517fM29591u4 != null && (coinUpdownCompareIndicator3 = c37517fM29591u4.f83248b) != null) {
                C27046k.m66700o(coinUpdownCompareIndicator3);
            }
        } else {
            C37517f c37517fM29591u5 = moodCard.m29591u3();
            if (c37517fM29591u5 != null && (coinUpdownCompareIndicator2 = c37517fM29591u5.f83248b) != null) {
                C27046k.m66685H(coinUpdownCompareIndicator2);
            }
            C37517f c37517fM29591u6 = moodCard.m29591u3();
            if (c37517fM29591u6 != null && (coinUpdownCompareIndicator = c37517fM29591u6.f83248b) != null) {
                coinUpdownCompareIndicator.m54486f(iAbs, iAbs2, iAbs3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m29565Q3(BubbleTextView bubbleTextView, float f11) {
        bubbleTextView.setArrowPosDelta(f11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m29578w3(MoodCard moodCard) {
        C37517f c37517fM29591u3 = moodCard.m29591u3();
        if (c37517fM29591u3 == null) {
            return Unit.INSTANCE;
        }
        BubbleTextView tvGuidePop = c37517fM29591u3.f83251e;
        Intrinsics.checkNotNullExpressionValue(tvGuidePop, "tvGuidePop");
        if (!ViewExtKt.m66581l(tvGuidePop)) {
            return Unit.INSTANCE;
        }
        BubbleTextView tvGuidePop2 = c37517fM29591u3.f83251e;
        Intrinsics.checkNotNullExpressionValue(tvGuidePop2, "tvGuidePop");
        C27046k.m66700o(tvGuidePop2);
        ConstraintLayout layoutContent = c37517fM29591u3.f83249c;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        ViewExtKt.m66585p(layoutContent, 0, 0, 0, 0, 13, null);
        C46392a.m102328k(C36719d.f79632a.m82267l(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m29579x3(MoodCard moodCard) {
        moodCard.m29592v3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m29590O3(final BubbleTextView bubbleTextView) {
        BubbleStyle.ArrowPosPolicy arrowPosPolicy;
        final FixAutoSizeTextView fixAutoSizeTextView;
        if (C5303w0.m6511a()) {
            arrowPosPolicy = BubbleStyle.ArrowPosPolicy.SelfBegin;
        } else {
            arrowPosPolicy = BubbleStyle.ArrowPosPolicy.SelfEnd;
        }
        bubbleTextView.setArrowPosPolicy(arrowPosPolicy);
        C37517f c37517fM29591u3 = m29591u3();
        if (c37517fM29591u3 != null && (fixAutoSizeTextView = c37517fM29591u3.f83250d) != null) {
            bubbleTextView.post(new Runnable() { // from class: com.kubi.home.mood.h
                @Override // java.lang.Runnable
                public final void run() {
                    MoodCard.m29564P3(fixAutoSizeTextView, bubbleTextView);
                }
            });
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        ConstraintLayout constraintLayout;
        FixAutoSizeTextView fixAutoSizeTextView;
        BubbleTextView bubbleTextView;
        super.initView();
        C37517f c37517fM29591u3 = m29591u3();
        if (c37517fM29591u3 != null && (bubbleTextView = c37517fM29591u3.f83251e) != null) {
            if (C46392a.m102322d(C36719d.f79632a.m82267l(), false)) {
                m29592v3();
            } else {
                C27046k.m66685H(bubbleTextView);
                m29590O3(bubbleTextView);
            }
            C27046k.m66711z(bubbleTextView, 0L, new Function0() { // from class: com.kubi.home.mood.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29579x3(this.f25856b);
                }
            }, 1, null);
        }
        C37517f c37517fM29591u4 = m29591u3();
        if (c37517fM29591u4 != null && (fixAutoSizeTextView = c37517fM29591u4.f83250d) != null) {
            C27046k.m66711z(fixAutoSizeTextView, 0L, new Function0() { // from class: com.kubi.home.mood.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29580y3(this.f25859b);
                }
            }, 1, null);
        }
        C37517f c37517fM29591u5 = m29591u3();
        if (c37517fM29591u5 != null && (constraintLayout = c37517fM29591u5.f83249c) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.home.mood.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MoodCard.m29581z3();
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        m29592v3();
    }
}

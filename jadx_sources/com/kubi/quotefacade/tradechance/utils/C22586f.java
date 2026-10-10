package com.kubi.quotefacade.tradechance.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5281l0;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.host.HostManager;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.ChanceHotRankItemTag;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.utils.f */
/* JADX INFO: compiled from: TradeChanceUtilEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a:\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0000\u001a>\u0010\u000b\u001a\u00020\u0003*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013H\u0001\u001a \u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0003*\u0004\u0018\u00010\u001cH\u0000\u001a\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"TRADE_CHANCE_PAGEID", "", "logger", "", "message", "jumpMarketChangeH5", "tab", "activeItem", "activeItemType", "id", "itemType", "buildTag", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", C33616e0.f69644s, "", "Lcom/kubi/quotefacade/entity/ChanceHotRankItemTag;", "onClickTag", "Lkotlin/Function2;", "", "lastTime", "", "debounceAction", JPushConstants.Geofence.KEY_INTERVAL, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "fixedShowList", "Landroidx/recyclerview/widget/RecyclerView;", "chanceFormatTime", "timeStamp", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeChanceUtilEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceUtilEx.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceUtilExKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1878#2,3:157\n*S KotlinDebug\n*F\n+ 1 TradeChanceUtilEx.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceUtilExKt\n*L\n87#1:157,3\n*E\n"})
public final class C22586f {

    /* JADX INFO: renamed from: a */
    public static long f42706a;

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b */
    public static final void m53257b(@NotNull FlexboxLayout flexboxLayout, @NotNull Context context, @Nullable List<ChanceHotRankItemTag> list, @NotNull final Function2<? super ChanceHotRankItemTag, ? super Integer, Unit> onClickTag) {
        Intrinsics.checkNotNullParameter(flexboxLayout, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickTag, "onClickTag");
        flexboxLayout.removeAllViews();
        if (list != null) {
            final int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final ChanceHotRankItemTag chanceHotRankItemTag = (ChanceHotRankItemTag) obj;
                BaseTextView baseTextView = new BaseTextView(context);
                baseTextView.setText(C27041f.m66668h(chanceHotRankItemTag.getTitle()) + ' ' + C27041f.m66668h(chanceHotRankItemTag.getSubtitle()));
                baseTextView.setTextColor(C27046k.m66699n(context, R$color.c_text40));
                baseTextView.setBackgroundResource(R$drawable.shape_emphasis4_4r);
                baseTextView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
                baseTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                baseTextView.setTextSize(10.0f);
                baseTextView.setMaxLines(1);
                baseTextView.setMaxEms(10);
                baseTextView.setPaddingRelative(C27040e.m66658b(6), C27040e.m66658b(2), C27040e.m66658b(6), C27040e.m66658b(2));
                ViewExtKt.m66585p(baseTextView, 0, 0, C27040e.m66658b(8), 0, 11, null);
                baseTextView.setEllipsize(TextUtils.TruncateAt.END);
                Integer type = chanceHotRankItemTag.getType();
                if (type != null && type.intValue() == 2) {
                    baseTextView.setCompoundDrawablePadding(C27029c.m66601d(baseTextView, 2));
                    baseTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(context, R$mipmap.quote_ic_discover_rank), (Drawable) null, (Drawable) null, (Drawable) null);
                }
                C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: com.kubi.quotefacade.tradechance.utils.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C22586f.m53258c(onClickTag, chanceHotRankItemTag, i11);
                    }
                });
                flexboxLayout.addView(baseTextView);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m53258c(Function2 function2, ChanceHotRankItemTag chanceHotRankItemTag, int i11) {
        function2.invoke(chanceHotRankItemTag, Integer.valueOf(i11 + 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m53260e(long j11, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (SystemClock.elapsedRealtime() - f42706a >= j11) {
            action.invoke();
        }
        f42706a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m53261f(long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        m53260e(j11, function0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m53262g(@Nullable RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        if (recyclerView != null) {
            C22912t.m54409g(recyclerView, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m53263h(@NotNull String tab, @NotNull String activeItem, @NotNull String activeItemType, @NotNull String id2, @NotNull String itemType) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(activeItem, "activeItem");
        Intrinsics.checkNotNullParameter(activeItemType, "activeItemType");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        String str = HostManager.a.m() + "/platform/market-movement?loading=2&appNeedLang=true";
        if (tab.length() > 0) {
            str = str + "&tab=" + tab;
        }
        if (id2.length() > 0) {
            str = str + "&id=" + id2;
        }
        if (activeItem.length() > 0) {
            str = str + "&activeItem=" + activeItem;
        }
        if (activeItemType.length() > 0) {
            str = str + "&activeItemType=" + activeItemType;
        }
        if (itemType.length() > 0) {
            str = str + "&itemType=" + itemType;
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m53264i(String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        if ((i11 & 8) != 0) {
            str4 = "";
        }
        if ((i11 & 16) != 0) {
            str5 = "ALL";
        }
        m53263h(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: j */
    public static final void m53265j(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C44128b.m97268l("TradeChance", message);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m53259d(long j11) {
        if (C5281l0.m6267b(j11)) {
            return C42179a.m92635h(j11, null, true, null, 5, null);
        }
        return C42179a.m92633f(j11, null, true, true, null, 9, null);
    }
}

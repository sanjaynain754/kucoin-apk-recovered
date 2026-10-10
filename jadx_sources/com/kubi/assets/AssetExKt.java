package com.kubi.assets;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.sort.C10997l;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.host.HostManager;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.sdk.mode.AppMode;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AssetEx.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\bø\u0001\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001aD\u0010\u000b\u001a\u00020\u00012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u000e\b\u0004\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\bø\u0001\u0000\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0017\u001aD\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010 \"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\"*\b\u0012\u0004\u0012\u0002H 0#2\u0016\b\u0004\u0010$\u001a\u0010\u0012\u0004\u0012\u0002H \u0012\u0006\u0012\u0004\u0018\u0001H!0\u0004H\u0086\bø\u0001\u0000\u001a#\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0&2\u0006\u0010\u0018\u001a\u0002H ¢\u0006\u0002\u0010'\u001a\u0018\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u0002H\u0086@¢\u0006\u0002\u0010+\u001a\u0018\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u0002H\u0086@¢\u0006\u0002\u0010+\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00172\u0006\u0010.\u001a\u00020\u0016\u001a\u0014\u0010/\u001a\u00020\u0001*\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u0002\u001a*\u00101\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u00020\u0016\u001a\u001c\u00106\u001a\u0004\u0018\u0001H \"\u0006\b\u0000\u0010 \u0018\u0001*\u000207H\u0086\b¢\u0006\u0002\u00108\u001a#\u00109\u001a\u00020\u00162\u0016\u0010:\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010<0;\"\u0004\u0018\u00010<¢\u0006\u0002\u0010=\u001a\u0010\u0010>\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0002\u001a\u0011\u0010@\u001a\u00020\u0002*\u0004\u0018\u00010A¢\u0006\u0002\u0010B\u001a\u0016\u0010C\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\b\u0010D\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010E\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\b\u0010D\u001a\u0004\u0018\u00010\u0002\u001a\n\u0010F\u001a\u00020\u0002*\u00020\u0002\u001a#\u0010G\u001a\u00020\u00162\u0016\u0010H\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020;\"\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010I\u001a\u0018\u0010J\u001a\u00020\u00012\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020\n\u001a\u0014\u0010N\u001a\u00020\u00022\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020P\u001a\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020P2\u0006\u0010R\u001a\u00020\u0002\u001a\u0006\u0010S\u001a\u00020\u0016\"(\u0010\u0019\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006T²\u0006\u0012\u0010U\u001a\n W*\u0004\u0018\u00010V0VX\u008a\u0084\u0002²\u0006\u0012\u0010U\u001a\n W*\u0004\u0018\u00010V0VX\u008a\u0084\u0002"}, m90084d2 = {"isNotEmpty", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "showText", "Landroid/widget/TextView;", "content", "highLight", "color", "", "checkAssetSafeControl", "address", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/WithdrawAddrValid;", "Lkotlin/collections/ArrayList;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "code", "block", "Lkotlin/Function0;", "isLayoutRtl", "", "Landroid/view/View;", "value", "real_currency", "Lcom/kubi/data/entity/CoinInfoEntity;", "getReal_currency", "(Lcom/kubi/data/entity/CoinInfoEntity;)Ljava/lang/String;", "setReal_currency", "(Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/String;)V", "sortListBy", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "Ljava/util/concurrent/CopyOnWriteArrayList;", "selector", "resumeIfActive", "Lkotlinx/coroutines/CancellableContinuation;", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "getSpotAvailableBalance", "Ljava/math/BigDecimal;", "balanceCurrency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalBalance", "visibleOrGone", "isShow", "setTextOrHide", "text", "formatRateAsPercent", "mode", "Ljava/math/RoundingMode;", "showAddSub", "isShowMin", "findParentOfType", "Lcom/kubi/sdk/BaseFragment;", "(Lcom/kubi/sdk/BaseFragment;)Ljava/lang/Object;", "allNull", FirebaseAnalytics.Param.ITEMS, "", "", "([Ljava/lang/Object;)Z", "getFullUrl", "jumpUrl", "formatTimeDetail", "", "(Ljava/lang/Long;)Ljava/lang/String;", "toFormattedAmount", FirebaseAnalytics.Param.CURRENCY, "formatAmountWithPrecision", "extractDigitsDotsAndCommas", "anyNullOrEmpty", "strings", "([Ljava/lang/String;)Z", "smoothScrollToPositionTop", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "mutableListToString", "list", "", "stringToMutableList", TypedValues.Custom.S_STRING, "isLiteMode", "AssetsCenterLib_googleRelease", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetEx.kt\ncom/kubi/assets/AssetExKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,388:1\n1011#2,2:389\n1#3:391\n12434#4,2:392\n12637#4,2:394\n*S KotlinDebug\n*F\n+ 1 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n133#1:389,2\n268#1:392,2\n344#1:394,2\n*E\n"})
public final class AssetExKt {
    /* JADX INFO: renamed from: v */
    public static final void m15134v(@Nullable RecyclerView recyclerView, final int i11) {
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            recyclerView.smoothScrollToPosition(i11);
            recyclerView.postDelayed(new Runnable() { // from class: com.kubi.assets.l
                @Override // java.lang.Runnable
                public final void run() {
                    AssetExKt.m15135w(linearLayoutManager, i11);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m15135w(LinearLayoutManager linearLayoutManager, int i11) {
        linearLayoutManager.scrollToPositionWithOffset(i11, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15115c(@NotNull Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        for (Object obj : items) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15116d(@NotNull String... strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        for (String str : strings) {
            if (str == null || str.length() == 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m15117e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            } else if (cCharAt == '.' || cCharAt == ',') {
                boolean z11 = i11 > 0 && Character.isDigit(str.charAt(i11 + (-1)));
                boolean z12 = i11 < length + (-1) && Character.isDigit(str.charAt(i11 + 1));
                if (z11 && z12) {
                    sb2.append(cCharAt);
                }
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m15118f(@Nullable String str, @Nullable String str2) {
        if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"USDC", "USDT", "DAI"}), str2)) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
            return C27041f.m66669i(bigDecimalM66536f != null ? C37885i.m85562a(bigDecimalM66536f, null, 2) : null, "--");
        }
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(str);
        return C27041f.m66669i(bigDecimalM66536f2 != null ? C37885i.m85563b(bigDecimalM66536f2, str2, 0, 2, null) : null, "--");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m15119g(@Nullable String str, @NotNull RoundingMode mode, boolean z11, boolean z12) {
        BigDecimal bigDecimalM66535e;
        Intrinsics.checkNotNullParameter(mode, "mode");
        String strM92642g = null;
        if (str != null && (bigDecimalM66535e = DowngradeExKt.m66535e(str, null, 1, null)) != null) {
            strM92642g = C42180b.m92642g(bigDecimalM66535e, null, mode, 0, z11, z12, false, 37, null);
        }
        return C27041f.m66669i(strM92642g, "--");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m15120h(String str, RoundingMode roundingMode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return m15119g(str, roundingMode, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m15121i(@Nullable Long l11) {
        return l11 == null ? "--" : C42179a.m92633f(l11.longValue(), null, false, true, null, 11, null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m15122j(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
            return str;
        }
        if (StringsKt.startsWith$default(str, "/", false, 2, (Object) null)) {
            return HostManager.a.m() + str;
        }
        return HostManager.a.m() + '/' + str;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m15123k(@NotNull CoinInfoEntity coinInfoEntity) {
        Intrinsics.checkNotNullParameter(coinInfoEntity, "<this>");
        String strM66677q = C27041f.m66677q(coinInfoEntity.getCurrency());
        return strM66677q == null ? "" : strM66677q;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r12 = r12;
        r12 = r12;
        r1 = r11;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [T, com.kubi.assets.entity.AssetV2OverviewEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, com.kubi.assets.entity.AssetV2OverviewEntity, java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m15124l(@NotNull String str, @NotNull Continuation<? super BigDecimal> continuation) {
        AssetExKt$getTotalBalance$1 assetExKt$getTotalBalance$1;
        Lazy lazy;
        String str2;
        Ref.ObjectRef objectRef;
        Object obj;
        String str3;
        Object obj2;
        ?? r12;
        boolean zM66566d;
        Object objM42830k;
        AssetV2OverviewEntity assetV2OverviewEntity;
        T t11;
        Ref.ObjectRef objectRef2;
        ?? r13;
        boolean zM66566d2;
        Object objM42830k2;
        if (continuation instanceof AssetExKt$getTotalBalance$1) {
            assetExKt$getTotalBalance$1 = (AssetExKt$getTotalBalance$1) continuation;
            int i11 = assetExKt$getTotalBalance$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetExKt$getTotalBalance$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetExKt$getTotalBalance$1 = new AssetExKt$getTotalBalance$1(continuation);
            }
        } else {
            assetExKt$getTotalBalance$1 = new AssetExKt$getTotalBalance$1(continuation);
        }
        Object obj3 = assetExKt$getTotalBalance$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetExKt$getTotalBalance$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj3);
            lazy = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetExKt.m15125m();
                }
            });
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            if (C10997l.m19368a()) {
                InterfaceC41634e<AssetV2OverviewEntity> interfaceC41634eM17102S0 = m15126n(lazy).m17102S0(str);
                assetExKt$getTotalBalance$1.L$0 = str;
                assetExKt$getTotalBalance$1.L$1 = lazy;
                assetExKt$getTotalBalance$1.L$2 = objectRef3;
                assetExKt$getTotalBalance$1.label = 1;
                Object objM42830k3 = RetrofitFlowExKt.m42830k(interfaceC41634eM17102S0, assetExKt$getTotalBalance$1);
                if (objM42830k3 != coroutine_suspended) {
                    str3 = str;
                    objectRef = objectRef3;
                    obj2 = objM42830k3;
                    r12 = (AssetV2OverviewEntity) obj2;
                    if (r12 != 0) {
                        objectRef.element = r12;
                        zM66566d = C27025c.m66566d(r12.getSubOverLimit());
                        if (zM66566d) {
                            InterfaceC41634e interfaceC41634eM17068r1 = AssetV2Api.m17068r1(m15126n(lazy), str3, false, 2, null);
                            assetExKt$getTotalBalance$1.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                            assetExKt$getTotalBalance$1.L$1 = SpillingKt.nullOutSpilledVariable(lazy);
                            assetExKt$getTotalBalance$1.L$2 = objectRef;
                            assetExKt$getTotalBalance$1.L$3 = SpillingKt.nullOutSpilledVariable(r12);
                            assetExKt$getTotalBalance$1.L$4 = objectRef;
                            assetExKt$getTotalBalance$1.I$0 = 0;
                            assetExKt$getTotalBalance$1.Z$0 = zM66566d;
                            assetExKt$getTotalBalance$1.label = 2;
                            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17068r1, assetExKt$getTotalBalance$1);
                        }
                    }
                    assetV2OverviewEntity = (AssetV2OverviewEntity) objectRef.element;
                    if (assetV2OverviewEntity != null) {
                        return assetV2OverviewEntity.getTotalAssetValue();
                    }
                    return null;
                }
            } else {
                InterfaceC41634e<AssetV2OverviewEntity> interfaceC41634eM17170v0 = m15126n(lazy).m17170v0(str);
                assetExKt$getTotalBalance$1.L$0 = str;
                assetExKt$getTotalBalance$1.L$1 = lazy;
                assetExKt$getTotalBalance$1.L$2 = objectRef3;
                assetExKt$getTotalBalance$1.label = 3;
                Object objM42830k4 = RetrofitFlowExKt.m42830k(interfaceC41634eM17170v0, assetExKt$getTotalBalance$1);
                if (objM42830k4 != coroutine_suspended) {
                    str2 = str;
                    objectRef = objectRef3;
                    obj = objM42830k4;
                    r13 = (AssetV2OverviewEntity) obj;
                    if (r13 != 0) {
                        objectRef.element = r13;
                        zM66566d2 = C27025c.m66566d(r13.getSubOverLimit());
                        if (zM66566d2) {
                            InterfaceC41634e interfaceC41634eM17068r2 = AssetV2Api.m17068r1(m15126n(lazy), str2, false, 2, null);
                            assetExKt$getTotalBalance$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                            assetExKt$getTotalBalance$1.L$1 = SpillingKt.nullOutSpilledVariable(lazy);
                            assetExKt$getTotalBalance$1.L$2 = objectRef;
                            assetExKt$getTotalBalance$1.L$3 = SpillingKt.nullOutSpilledVariable(r13);
                            assetExKt$getTotalBalance$1.L$4 = objectRef;
                            assetExKt$getTotalBalance$1.I$0 = 0;
                            assetExKt$getTotalBalance$1.Z$0 = zM66566d2;
                            assetExKt$getTotalBalance$1.label = 4;
                            objM42830k2 = RetrofitFlowExKt.m42830k(interfaceC41634eM17068r2, assetExKt$getTotalBalance$1);
                        }
                    }
                    assetV2OverviewEntity = (AssetV2OverviewEntity) objectRef.element;
                    if (assetV2OverviewEntity != null) {
                        return assetV2OverviewEntity.getTotalAssetValue();
                    }
                    return null;
                }
            }
            Object obj4 = objM42830k;
            obj4 = objM42830k2;
            return coroutine_suspended;
        }
        if (i12 == 1) {
            objectRef = (Ref.ObjectRef) assetExKt$getTotalBalance$1.L$2;
            lazy = (Lazy) assetExKt$getTotalBalance$1.L$1;
            str3 = (String) assetExKt$getTotalBalance$1.L$0;
            ResultKt.throwOnFailure(obj3);
            obj2 = obj3;
            r12 = (AssetV2OverviewEntity) obj2;
            if (r12 != 0) {
                objectRef.element = r12;
                zM66566d = C27025c.m66566d(r12.getSubOverLimit());
                if (zM66566d) {
                    InterfaceC41634e interfaceC41634eM17068r3 = AssetV2Api.m17068r1(m15126n(lazy), str3, false, 2, null);
                    assetExKt$getTotalBalance$1.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                    assetExKt$getTotalBalance$1.L$1 = SpillingKt.nullOutSpilledVariable(lazy);
                    assetExKt$getTotalBalance$1.L$2 = objectRef;
                    assetExKt$getTotalBalance$1.L$3 = SpillingKt.nullOutSpilledVariable(r12);
                    assetExKt$getTotalBalance$1.L$4 = objectRef;
                    assetExKt$getTotalBalance$1.I$0 = 0;
                    assetExKt$getTotalBalance$1.Z$0 = zM66566d;
                    assetExKt$getTotalBalance$1.label = 2;
                    objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17068r3, assetExKt$getTotalBalance$1);
                }
            }
            assetV2OverviewEntity = (AssetV2OverviewEntity) objectRef.element;
            if (assetV2OverviewEntity != null) {
                return assetV2OverviewEntity.getTotalAssetValue();
            }
            return null;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                objectRef = (Ref.ObjectRef) assetExKt$getTotalBalance$1.L$2;
                lazy = (Lazy) assetExKt$getTotalBalance$1.L$1;
                str2 = (String) assetExKt$getTotalBalance$1.L$0;
                ResultKt.throwOnFailure(obj3);
                obj = obj3;
                r13 = (AssetV2OverviewEntity) obj;
                if (r13 != 0) {
                    objectRef.element = r13;
                    zM66566d2 = C27025c.m66566d(r13.getSubOverLimit());
                    if (zM66566d2) {
                        InterfaceC41634e interfaceC41634eM17068r4 = AssetV2Api.m17068r1(m15126n(lazy), str2, false, 2, null);
                        assetExKt$getTotalBalance$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                        assetExKt$getTotalBalance$1.L$1 = SpillingKt.nullOutSpilledVariable(lazy);
                        assetExKt$getTotalBalance$1.L$2 = objectRef;
                        assetExKt$getTotalBalance$1.L$3 = SpillingKt.nullOutSpilledVariable(r13);
                        assetExKt$getTotalBalance$1.L$4 = objectRef;
                        assetExKt$getTotalBalance$1.I$0 = 0;
                        assetExKt$getTotalBalance$1.Z$0 = zM66566d2;
                        assetExKt$getTotalBalance$1.label = 4;
                        objM42830k2 = RetrofitFlowExKt.m42830k(interfaceC41634eM17068r4, assetExKt$getTotalBalance$1);
                    }
                }
                assetV2OverviewEntity = (AssetV2OverviewEntity) objectRef.element;
                if (assetV2OverviewEntity != null) {
                    return assetV2OverviewEntity.getTotalAssetValue();
                }
                return null;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        objectRef = (Ref.ObjectRef) assetExKt$getTotalBalance$1.L$4;
        objectRef2 = (Ref.ObjectRef) assetExKt$getTotalBalance$1.L$2;
        ResultKt.throwOnFailure(obj3);
        t11 = obj3;
        objectRef.element = t11;
        objectRef = objectRef2;
        assetV2OverviewEntity = (AssetV2OverviewEntity) objectRef.element;
        if (assetV2OverviewEntity != null) {
            return assetV2OverviewEntity.getTotalAssetValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final void m15127o(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(textView.getResources().getColor(i11))));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m15128p(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C5303w0.m6511a() || 1 == view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m15129q() {
        return AppMode.INSTANCE.isLiteMode();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m15130r(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: s */
    public static final <T> void m15131s(@NotNull InterfaceC41708m<? super T> interfaceC41708m, T t11) {
        Intrinsics.checkNotNullParameter(interfaceC41708m, "<this>");
        if (interfaceC41708m.isActive()) {
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(t11));
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m15132t(@NotNull TextView textView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m15133u(@NotNull TextView textView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final List<String> m15136x(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return StringsKt.trim((CharSequence) string).toString().length() == 0 ? new ArrayList() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null));
    }

    /* JADX INFO: renamed from: z */
    public static final void m15138z(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final AssetV2Api m15125m() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: n */
    public static final AssetV2Api m15126n(Lazy<? extends AssetV2Api> lazy) {
        return lazy.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m15137y(@Nullable String str, @Nullable String str2) {
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        String strM85563b = null;
        if (bigDecimalM66536f != null) {
            strM85563b = C37885i.m85563b(bigDecimalM66536f, str2, 0, 2, null);
        }
        return C27041f.m66669i(strM85563b, "--");
    }
}

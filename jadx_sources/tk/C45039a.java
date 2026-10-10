package tk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kmm.trade.KMMRoundingMode;
import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p599rk.C44109a;
import p599rk.C44110b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import uk.C45257b;

/* JADX INFO: renamed from: tk.a */
/* JADX INFO: compiled from: HedgeCrossCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001cJ5\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u000bJO\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(JG\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J/\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u0011J\u001f\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J¡\u0001\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u0010*\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b=\u0010>Jg\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FJ\u0087\u0001\u0010M\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004¢\u0006\u0004\bM\u0010N¨\u0006O"}, m90084d2 = {"Ltk/a;", "", "<init>", "()V", "Lrk/b;", "multiplier", "bidOrderQty", "bidPositionQty", "askOrderQty", "askPositionQty", "i", "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "maintainMarginRateLimit", "factor", "maxLeverage", "posOrderQty", "f", "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "leverage", "maintainMarginRate", "b", "(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "", "isInverse", "qty", FirebaseAnalytics.Param.PRICE, "initMarginRate", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "maintainRate", "e", "bidOrderMaintainMargin", "askOrderMaintainMargin", "bidPositionMaintainMargin", "askPositionMaintainMargin", "maintainMarginRateDiscount", CmcdData.Factory.STREAMING_FORMAT_HLS, "markPrice", "takerFeeRate", "j", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "taxRate", "k", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "totalMargin", "posOrderMM", "closeFee", "openFee", CmcdData.Factory.STREAM_TYPE_LIVE, "unrealizedPnl", "initMargin", "m", "(Lrk/b;Lrk/b;)Lrk/b;", "", "lotPrecision", "buffer", "availableBalance", "otherSymbolsOccupiedMargin", "estimatedPrice", "occupiedMarginDiscount", "calcCrossRiskLimit", "g", "(ZLrk/b;ILrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "amr", "buyQty", "sellQty", "indexPricePrecision", "minPrice", "maxPrice", "d", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;", "maxQty", "otherSymbolSumMarkValue", "delegationPrice", "delegationQty", "buyPositionQty", "sellPositionQty", "c", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHedgeCrossCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeCrossCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeCrossCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,657:1\n38#2,2:658\n55#2,2:660\n41#2:662\n38#2,2:663\n55#2,2:665\n41#2,9:667\n38#2,2:676\n55#2,2:678\n41#2:680\n52#2:681\n52#2:682\n30#2,4:683\n30#2,4:687\n46#2:691\n52#2:692\n30#2,4:693\n49#2:697\n38#2,2:698\n55#2,2:700\n41#2:702\n38#2,2:703\n55#2,2:705\n41#2:707\n38#2,2:708\n55#2,2:710\n41#2:712\n46#2:713\n38#2,2:714\n55#2,2:716\n41#2:718\n55#2,2:719\n41#2:721\n38#2,2:722\n55#2,2:724\n41#2:726\n38#2,2:727\n55#2,2:729\n41#2:731\n55#2,2:732\n41#2:734\n38#2,2:735\n55#2,2:737\n41#2:739\n30#2,4:740\n52#2:744\n30#2,4:745\n52#2:749\n52#2:750\n38#2,2:751\n55#2,2:753\n41#2:755\n38#2,2:756\n55#2,2:758\n41#2:760\n38#2,2:761\n55#2,2:763\n41#2:765\n38#2,2:766\n55#2,2:768\n41#2:770\n38#2,2:771\n55#2,2:773\n41#2:775\n38#2,2:776\n55#2,2:778\n41#2,6:780\n49#2:786\n49#2:787\n52#2:788\n30#2,4:789\n52#2:793\n30#2,4:794\n52#2:798\n30#2,4:799\n38#2,2:803\n55#2,2:805\n41#2:807\n38#2,2:808\n55#2,2:810\n41#2,6:812\n38#2,2:818\n55#2,2:820\n41#2:822\n46#2:823\n49#2:824\n52#2:825\n38#2,2:826\n55#2,2:828\n41#2:830\n30#2,4:831\n49#2:835\n38#2,2:836\n55#2,2:838\n41#2:840\n55#2,2:841\n41#2:843\n55#2,2:844\n55#2,2:846\n38#2,2:848\n55#2,2:850\n41#2:852\n38#2,2:853\n55#2,2:855\n41#2,9:857\n38#2,2:866\n55#2,2:868\n41#2,9:870\n38#2,2:879\n55#2,2:881\n41#2:883\n38#2,2:884\n55#2,2:886\n41#2,9:888\n38#2,2:897\n55#2,2:899\n41#2:901\n38#2,2:902\n55#2,2:904\n41#2,6:906\n52#2:912\n30#2,4:913\n52#2:917\n30#2,4:918\n38#2,2:922\n55#2,2:924\n41#2:926\n38#2,2:927\n55#2,2:929\n41#2:931\n38#2,2:932\n55#2,2:934\n41#2:936\n38#2,2:937\n55#2,2:939\n41#2,9:941\n38#2,2:950\n55#2,2:952\n41#2,6:954\n38#2,2:960\n55#2,2:962\n41#2:964\n38#2,2:965\n55#2,2:967\n41#2,9:969\n52#2:978\n30#2,4:979\n30#2,4:983\n55#2,2:987\n38#2,2:989\n55#2,2:991\n41#2:993\n52#2:994\n30#2,4:995\n38#2,2:999\n55#2,2:1001\n41#2:1003\n30#2,4:1004\n38#2,2:1008\n55#2,2:1010\n41#2:1012\n52#2:1013\n30#2,4:1014\n30#2,4:1018\n*S KotlinDebug\n*F\n+ 1 HedgeCrossCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeCrossCalculator\n*L\n42#1:658,2\n42#1:660,2\n42#1:662\n43#1:663,2\n43#1:665,2\n43#1:667,9\n44#1:676,2\n44#1:678,2\n44#1:680\n67#1:681\n68#1:682\n73#1:683,4\n74#1:687,4\n76#1:691\n96#1:692\n97#1:693,4\n98#1:697\n125#1:698,2\n125#1:700,2\n125#1:702\n126#1:703,2\n126#1:705,2\n126#1:707\n153#1:708,2\n153#1:710,2\n153#1:712\n182#1:713\n216#1:714,2\n216#1:716,2\n216#1:718\n216#1:719,2\n216#1:721\n219#1:722,2\n219#1:724,2\n219#1:726\n250#1:727,2\n250#1:729,2\n250#1:731\n250#1:732,2\n250#1:734\n253#1:735,2\n253#1:737,2\n253#1:739\n275#1:740,4\n292#1:744\n295#1:745,4\n349#1:749\n350#1:750\n353#1:751,2\n353#1:753,2\n353#1:755\n353#1:756,2\n353#1:758,2\n353#1:760\n354#1:761,2\n354#1:763,2\n354#1:765\n354#1:766,2\n354#1:768,2\n354#1:770\n356#1:771,2\n356#1:773,2\n356#1:775\n356#1:776,2\n356#1:778,2\n356#1:780,6\n359#1:786\n362#1:787\n370#1:788\n370#1:789,4\n376#1:793\n377#1:794,4\n380#1:798\n381#1:799,4\n389#1:803,2\n389#1:805,2\n389#1:807\n390#1:808,2\n390#1:810,2\n390#1:812,6\n393#1:818,2\n393#1:820,2\n393#1:822\n394#1:823\n395#1:824\n396#1:825\n399#1:826,2\n399#1:828,2\n399#1:830\n399#1:831,4\n411#1:835\n456#1:836,2\n456#1:838,2\n456#1:840\n456#1:841,2\n456#1:843\n460#1:844,2\n464#1:846,2\n466#1:848,2\n466#1:850,2\n466#1:852\n466#1:853,2\n466#1:855,2\n466#1:857,9\n469#1:866,2\n469#1:868,2\n469#1:870,9\n473#1:879,2\n473#1:881,2\n473#1:883\n473#1:884,2\n473#1:886,2\n473#1:888,9\n474#1:897,2\n474#1:899,2\n474#1:901\n474#1:902,2\n474#1:904,2\n474#1:906,6\n481#1:912\n484#1:913,4\n489#1:917\n492#1:918,4\n576#1:922,2\n576#1:924,2\n576#1:926\n588#1:927,2\n588#1:929,2\n588#1:931\n588#1:932,2\n588#1:934,2\n588#1:936\n591#1:937,2\n591#1:939,2\n591#1:941,9\n592#1:950,2\n592#1:952,2\n592#1:954,6\n595#1:960,2\n595#1:962,2\n595#1:964\n595#1:965,2\n595#1:967,2\n595#1:969,9\n601#1:978\n602#1:979,4\n603#1:983,4\n613#1:987,2\n614#1:989,2\n614#1:991,2\n614#1:993\n615#1:994\n619#1:995,4\n621#1:999,2\n621#1:1001,2\n621#1:1003\n622#1:1004,4\n625#1:1008,2\n625#1:1010,2\n625#1:1012\n628#1:1013\n636#1:1014,4\n638#1:1018,4\n*E\n"})
public final class C45039a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45039a f101443a = new C45039a();

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C44110b m99600c(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b maintainRate, @NotNull C44110b takerFeeRate, @NotNull C44110b totalMargin, @NotNull C44110b maxQty, @NotNull C44110b otherSymbolSumMarkValue, @NotNull C44110b markPrice, @NotNull C44110b delegationPrice, @NotNull C44110b delegationQty, @NotNull C44110b buyPositionQty, @NotNull C44110b sellPositionQty, int indexPricePrecision, @NotNull C44110b minPrice, @NotNull C44110b maxPrice) throws Throwable {
        Object obj;
        C44110b c44110bM97181a;
        C44110b c44110bM97181a2;
        C44110b c44110bM97185e;
        C44110b c44110bM97187g;
        C44110b c44110b;
        C44110b c44110b2;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(maintainRate, "maintainRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(maxQty, "maxQty");
        Intrinsics.checkNotNullParameter(otherSymbolSumMarkValue, "otherSymbolSumMarkValue");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(delegationPrice, "delegationPrice");
        Intrinsics.checkNotNullParameter(delegationQty, "delegationQty");
        Intrinsics.checkNotNullParameter(buyPositionQty, "buyPositionQty");
        Intrinsics.checkNotNullParameter(sellPositionQty, "sellPositionQty");
        Intrinsics.checkNotNullParameter(minPrice, "minPrice");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44109a c44109a = C44109a.f97401a;
            obj = null;
            try {
                if ((delegationQty.m97182b(c44109a.m97180b()) >= 0 ? delegationQty : delegationQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(maxQty) > 0) {
                    return null;
                }
                C44110b c44110b3 = new C44110b("0");
                if (delegationQty.m97182b(c44110b3) >= 0) {
                    c44110bM97181a2 = buyPositionQty.m97181a(delegationQty);
                    c44110bM97181a = sellPositionQty;
                } else {
                    c44110bM97181a = sellPositionQty.m97181a(delegationQty);
                    c44110bM97181a2 = buyPositionQty;
                }
                boolean z11 = (c44110bM97181a2.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a2 : c44110bM97181a2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(c44110bM97181a.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a : c44110bM97181a.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) >= 0;
                C44110b c44110bM97185e2 = c44110bM97181a.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a : c44110bM97181a.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97181a2.m97182b(c44110bM97185e2) > 0) {
                    c44110bM97185e2 = c44110bM97181a2;
                }
                boolean z12 = z11;
                C44110b c44110bM97185e3 = c44110bM97185e2.m97185e(maintainRate.m97181a(takerFeeRate));
                C44110b c44110bM97185e4 = c44110bM97181a.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a : c44110bM97181a.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97181a2.m97182b(c44110bM97185e4) < 0) {
                    c44110bM97185e4 = c44110bM97181a2;
                }
                C44110b c44110bM97185e5 = c44110bM97185e3.m97181a(c44110bM97185e4.m97185e(takerFeeRate)).m97187g(c44110bM97181a2).m97187g(c44110bM97181a).m97185e(multiplier);
                C44110b c44110bM97185e6 = c44110bM97181a2.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a2 : c44110bM97181a2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                C44110b c44110bM97185e7 = c44110bM97181a.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97181a : c44110bM97181a.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97185e6.m97182b(c44110bM97185e7) <= 0) {
                    c44110bM97185e6 = c44110bM97185e7;
                }
                if (isInverse) {
                    if (delegationPrice.m97182b(new C44110b("0")) != 0 && markPrice.m97182b(new C44110b("0")) != 0) {
                        C44110b c44110bM97181a3 = buyPositionQty.m97181a(sellPositionQty);
                        KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                        c44110bM97185e = c44110bM97181a3.m97183c(delegationPrice, 20, kMMRoundingMode).m97187g(buyPositionQty.m97181a(sellPositionQty).m97183c(markPrice, 20, kMMRoundingMode)).m97185e(multiplier);
                    }
                    return null;
                }
                c44110bM97185e = sellPositionQty.m97181a(buyPositionQty).m97185e(delegationPrice.m97187g(markPrice)).m97185e(multiplier);
                C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, delegationPrice, c44110bM97185e6);
                if (c44110bM100039g == null) {
                    c44110bM100039g = new C44110b("0");
                }
                C44110b c44110bM97181a4 = otherSymbolSumMarkValue.m97181a(c44110bM100039g.m97182b(c44109a.m97180b()) >= 0 ? c44110bM100039g : c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS)));
                if (c44110bM97181a4.m97182b(new C44110b("0")) == 0) {
                    return null;
                }
                C44110b c44110bM97181a5 = totalMargin.m97181a(c44110bM97185e);
                KMMRoundingMode kMMRoundingMode2 = KMMRoundingMode.HALF_UP;
                C44110b c44110bM97183c = c44110bM97181a5.m97183c(c44110bM97181a4, 20, kMMRoundingMode2);
                if (isInverse) {
                    if (c44110bM100039g.m97182b(c44109a.m97180b()) < 0) {
                        c44110bM100039g = c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    }
                    c44110bM97187g = c44110bM97183c.m97185e(c44110bM100039g).m97187g(c44110bM97181a2.m97181a(c44110bM97181a).m97183c(delegationPrice, 20, kMMRoundingMode2).m97185e(multiplier));
                } else {
                    if (c44110bM100039g.m97182b(c44109a.m97180b()) < 0) {
                        c44110bM100039g = c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    }
                    c44110bM97187g = c44110bM97183c.m97185e(c44110bM100039g).m97187g(c44110bM97181a2.m97181a(c44110bM97181a).m97185e(delegationPrice).m97185e(multiplier));
                }
                if (c44110bM97187g.m97182b(new C44110b("0")) == 0) {
                    return isInverse ? maxPrice : minPrice;
                }
                C44110b c44110bM97183c2 = isInverse ? c44110bM97185e5.m97183c(c44110bM97187g, 20, kMMRoundingMode2) : c44110bM97187g.m97183c(c44110bM97185e5, 20, kMMRoundingMode2);
                if (c44110bM97183c2.m97182b(c44110b3) >= 0) {
                    c44110b = maxPrice;
                    if (c44110bM97183c2.m97182b(c44110b) > 0) {
                        c44110bM97183c2 = c44110b;
                    } else {
                        c44110b2 = minPrice;
                        if (c44110bM97183c2.m97182b(c44110b2) < 0) {
                            c44110bM97183c2 = c44110b2;
                        }
                    }
                } else if (isInverse) {
                    c44110b = maxPrice;
                    c44110bM97183c2 = c44110b;
                } else {
                    c44110b2 = minPrice;
                    c44110bM97183c2 = c44110b2;
                }
                return c44110bM97183c2.m97186f(indexPricePrecision, z12 ? KMMRoundingMode.UP : KMMRoundingMode.DOWN);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? obj : objM103844constructorimpl);
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01df  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final C44110b m99601d(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b maintainRate, @NotNull C44110b takerFeeRate, @NotNull C44110b amr, @NotNull C44110b markPrice, @NotNull C44110b buyQty, @NotNull C44110b sellQty, int indexPricePrecision, @NotNull C44110b minPrice, @NotNull C44110b maxPrice) throws Throwable {
        C44110b c44110bM97187g;
        C44110b c44110bM97183c;
        C44110b minPrice2 = minPrice;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(maintainRate, "maintainRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(amr, "amr");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(buyQty, "buyQty");
        Intrinsics.checkNotNullParameter(sellQty, "sellQty");
        Intrinsics.checkNotNullParameter(minPrice2, "minPrice");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44109a c44109a = C44109a.f97401a;
            boolean z11 = (buyQty.m97182b(c44109a.m97180b()) >= 0 ? buyQty : buyQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(sellQty.m97182b(c44109a.m97180b()) >= 0 ? sellQty : sellQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) >= 0;
            C45257b c45257b = C45257b.f101798a;
            C44110b c44110bM100039g = c45257b.m100039g(isInverse, multiplier, markPrice, buyQty);
            if (c44110bM100039g == null) {
                c44110bM100039g = new C44110b("0");
            }
            C44110b c44110bM100039g2 = c45257b.m100039g(isInverse, multiplier, markPrice, sellQty);
            if (c44110bM100039g2 == null) {
                c44110bM100039g2 = new C44110b("0");
            }
            C44110b c44110bM97185e = c44110bM100039g.m97182b(c44109a.m97180b()) >= 0 ? c44110bM100039g : c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            C44110b c44110bM97185e2 = c44110bM100039g2.m97182b(c44109a.m97180b()) >= 0 ? c44110bM100039g2 : c44110bM100039g2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            if (c44110bM97185e.m97182b(c44110bM97185e2) <= 0) {
                c44110bM97185e = c44110bM97185e2;
            }
            if (isInverse) {
                C44110b c44110bM97185e3 = buyQty.m97182b(c44109a.m97180b()) >= 0 ? buyQty : buyQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                C44110b c44110bM97185e4 = sellQty.m97182b(c44109a.m97180b()) >= 0 ? sellQty : sellQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97185e3.m97182b(c44110bM97185e4) <= 0) {
                    c44110bM97185e3 = c44110bM97185e4;
                }
                C44110b c44110bM97185e5 = c44110bM97185e3.m97185e(maintainRate.m97181a(takerFeeRate));
                C44110b c44110bM97185e6 = sellQty.m97182b(c44109a.m97180b()) >= 0 ? sellQty : sellQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                C44110b c44110bM97185e7 = buyQty.m97182b(c44109a.m97180b()) >= 0 ? buyQty : buyQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97185e6.m97182b(c44110bM97185e7) >= 0) {
                    c44110bM97185e6 = c44110bM97185e7;
                }
                c44110bM97187g = c44110bM97185e5.m97181a(c44110bM97185e6.m97185e(takerFeeRate)).m97187g(buyQty.m97185e(multiplier)).m97187g(sellQty.m97185e(multiplier));
            } else {
                C44110b c44110bM97181a = buyQty.m97181a(sellQty);
                C44110b c44110bM97185e8 = sellQty.m97182b(c44109a.m97180b()) >= 0 ? sellQty : sellQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (buyQty.m97182b(c44110bM97185e8) > 0) {
                    c44110bM97185e8 = buyQty;
                }
                c44110bM97187g = c44110bM97181a.m97187g(c44110bM97185e8.m97185e(maintainRate)).m97187g(buyQty.m97187g(sellQty).m97185e(takerFeeRate)).m97185e(multiplier);
            }
            if (isInverse) {
                C44110b c44110bM97187g2 = amr.m97185e(c44110bM97185e).m97187g(c44110bM100039g).m97187g(c44110bM100039g2);
                if (c44110bM97187g2.m97182b(new C44110b("0")) == 0) {
                    return maxPrice;
                }
                c44110bM97183c = c44110bM97187g.m97183c(c44110bM97187g2, 20, KMMRoundingMode.HALF_UP);
            } else {
                C44110b c44110bM97187g3 = c44110bM100039g.m97181a(c44110bM100039g2).m97187g(amr.m97185e(c44110bM97185e));
                if (c44110bM97187g3.m97182b(new C44110b("0")) == 0) {
                    return minPrice2;
                }
                c44110bM97183c = c44110bM97187g3.m97183c(c44110bM97187g, 20, KMMRoundingMode.HALF_UP);
            }
            if (c44110bM97183c.m97182b(new C44110b("0")) < 0) {
                if (isInverse) {
                    minPrice2 = maxPrice;
                }
            } else if (c44110bM97183c.m97182b(maxPrice) > 0) {
                minPrice2 = maxPrice;
            } else if (c44110bM97183c.m97182b(minPrice2) >= 0) {
                minPrice2 = c44110bM97183c;
            }
            return minPrice2.m97186f(indexPricePrecision, z11 ? KMMRoundingMode.UP : KMMRoundingMode.DOWN);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            return (C44110b) objM103844constructorimpl;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final C44110b m99604g(boolean isInverse, @NotNull C44110b multiplier, int lotPrecision, @NotNull C44110b k11, @NotNull C44110b buffer, @NotNull C44110b availableBalance, @NotNull C44110b totalMargin, @NotNull C44110b otherSymbolsOccupiedMargin, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b takerFeeRate, @NotNull C44110b taxRate, @NotNull C44110b occupiedMarginDiscount, @NotNull C44110b bidOrderQty, @NotNull C44110b bidPositionQty, @NotNull C44110b askOrderQty, @NotNull C44110b askPositionQty, @Nullable C44110b calcCrossRiskLimit) throws Throwable {
        Object obj;
        C44110b c44110bM97185e;
        C44110b c44110bM97181a;
        C44110b multiplier2 = multiplier;
        C44110b askPositionQty2 = askPositionQty;
        Intrinsics.checkNotNullParameter(multiplier2, "multiplier");
        Intrinsics.checkNotNullParameter(k11, "k");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(otherSymbolsOccupiedMargin, "otherSymbolsOccupiedMargin");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(occupiedMarginDiscount, "occupiedMarginDiscount");
        Intrinsics.checkNotNullParameter(bidOrderQty, "bidOrderQty");
        Intrinsics.checkNotNullParameter(bidPositionQty, "bidPositionQty");
        Intrinsics.checkNotNullParameter(askOrderQty, "askOrderQty");
        Intrinsics.checkNotNullParameter(askPositionQty2, "askPositionQty");
        try {
            Result.Companion companion = Result.INSTANCE;
            obj = null;
            try {
                if (estimatedPrice.m97182b(new C44110b("0")) != 0 && leverage.m97182b(new C44110b("0")) != 0 && k11.m97182b(new C44110b("0")) != 0) {
                    if (availableBalance.m97182b(new C44110b("0")) == 0) {
                        C44110b c44110b = new C44110b("0");
                        C44109a c44109a = C44109a.f97401a;
                        C44110b c44110bM97187g = c44110b.m97187g((bidOrderQty.m97182b(c44109a.m97180b()) >= 0 ? bidOrderQty : bidOrderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97181a(askOrderQty.m97182b(c44109a.m97180b()) >= 0 ? askOrderQty : askOrderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS)))).m97187g((bidPositionQty.m97182b(c44109a.m97180b()) >= 0 ? bidPositionQty : bidPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97181a(askPositionQty2.m97182b(c44109a.m97180b()) >= 0 ? askPositionQty2 : askPositionQty2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))));
                        C44110b c44110bM97185e2 = bidPositionQty.m97182b(c44109a.m97180b()) >= 0 ? bidPositionQty : bidPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                        if (askPositionQty2.m97182b(c44109a.m97180b()) < 0) {
                            askPositionQty2 = askPositionQty2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                        }
                        if (c44110bM97185e2.m97182b(askPositionQty2) >= 0) {
                            c44110bM97185e2 = askPositionQty2;
                        }
                        C44110b c44110bM97187g2 = c44110bM97187g.m97187g(c44110bM97185e2.m97185e(occupiedMarginDiscount));
                        C44110b c44110b2 = new C44110b("0");
                        return c44110b2.m97182b(c44110bM97187g2) > 0 ? c44110b2 : c44110bM97187g2;
                    }
                    C44110b c44110bM97187g3 = totalMargin.m97187g(otherSymbolsOccupiedMargin);
                    C44110b c44110b3 = new C44110b("0");
                    if (c44110bM97187g3.m97182b(c44110b3) <= 0) {
                        c44110bM97187g3 = c44110b3;
                    }
                    C44110b c44110bM97185e3 = c44110bM97187g3.m97185e(leverage);
                    C44110b c44110bM97181a2 = new C44110b("1").m97181a(takerFeeRate.m97185e(leverage).m97185e(new C44110b("1").m97181a(taxRate)));
                    if (!isInverse) {
                        c44110bM97185e = estimatedPrice.m97185e(c44110bM97181a2);
                    } else {
                        if (c44110bM97181a2.m97182b(new C44110b("0")) == 0) {
                            return null;
                        }
                        c44110bM97185e = estimatedPrice.m97183c(c44110bM97181a2, 20, KMMRoundingMode.HALF_UP);
                    }
                    if (!isInverse) {
                        C44110b c44110bM97185e4 = c44110bM97185e.m97185e(k11);
                        if (c44110bM97185e4.m97182b(new C44110b("0")) == 0) {
                            return null;
                        }
                        c44110bM97181a = c44110bM97185e3.m97183c(c44110bM97185e4, 20, KMMRoundingMode.HALF_UP).m97181a(new C44110b("1"));
                    } else {
                        if (k11.m97182b(new C44110b("0")) == 0) {
                            return null;
                        }
                        c44110bM97181a = c44110bM97185e3.m97185e(c44110bM97185e).m97183c(k11, 20, KMMRoundingMode.HALF_UP).m97181a(new C44110b("1"));
                    }
                    if (c44110bM97181a.m97182b(new C44110b("0")) <= 0) {
                        return null;
                    }
                    C44110b c44110bM97185e5 = k11.m97185e(new C44110b(String.valueOf(Math.log(c44110bM97181a.m97188h()))));
                    C44110b c44110bM97185e6 = bidOrderQty.m97181a(askOrderQty).m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    C44109a c44109a2 = C44109a.f97401a;
                    C44110b c44110bM97181a3 = bidPositionQty.m97181a(askPositionQty2.m97182b(c44109a2.m97180b()) >= 0 ? askPositionQty2 : askPositionQty2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS)));
                    if (askPositionQty2.m97182b(c44109a2.m97180b()) < 0) {
                        askPositionQty2 = askPositionQty2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    }
                    if (bidPositionQty.m97182b(askPositionQty2) < 0) {
                        askPositionQty2 = bidPositionQty;
                    }
                    C44110b c44110bM97185e7 = c44110bM97185e6.m97187g(c44110bM97181a3.m97187g(askPositionQty2.m97185e(occupiedMarginDiscount))).m97185e(multiplier2.m97182b(c44109a2.m97180b()) >= 0 ? multiplier2 : multiplier2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS)));
                    if (calcCrossRiskLimit != null) {
                        C44110b c44110b4 = calcCrossRiskLimit;
                        if (c44110b4.m97182b(c44110bM97185e5) >= 0) {
                            c44110b4 = c44110bM97185e5;
                        }
                        if (c44110b4 != null) {
                            c44110bM97185e5 = c44110b4;
                        }
                    }
                    C44110b c44110bM97181a4 = c44110bM97185e5.m97181a(c44110bM97185e7);
                    C44110b c44110b5 = new C44110b("0");
                    if (c44110bM97181a4.m97182b(c44110b5) <= 0) {
                        c44110bM97181a4 = c44110b5;
                    }
                    if (multiplier2.m97182b(new C44110b("0")) == 0) {
                        return null;
                    }
                    if (multiplier2.m97182b(c44109a2.m97180b()) < 0) {
                        multiplier2 = multiplier2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    }
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.DOWN;
                    C44110b c44110bM97183c = c44110bM97181a4.m97183c(multiplier2, 20, kMMRoundingMode);
                    C44110b c44110bM97186f = c44110bM97183c.m97185e(buffer).m97186f(lotPrecision, kMMRoundingMode);
                    C44110b c44110bM97186f2 = c44110bM97183c.m97186f(lotPrecision, kMMRoundingMode);
                    if (c44110bM97186f2.m97182b(new C44110b("1")) != 0 && buffer.m97182b(new C44110b("1")) != 0) {
                        if (c44110bM97186f.m97182b(c44110bM97186f2) != 0) {
                            return c44110bM97186f;
                        }
                        C44110b c44110bM97187g4 = c44110bM97186f.m97187g(new C44110b("1"));
                        C44110b c44110b6 = new C44110b("0");
                        return c44110bM97187g4.m97182b(c44110b6) > 0 ? c44110bM97187g4 : c44110b6;
                    }
                    return c44110bM97186f2;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? obj : objM103844constructorimpl);
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final C44110b m99607j(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b bidOrderQty, @NotNull C44110b bidPositionQty, @NotNull C44110b askOrderQty, @NotNull C44110b askPositionQty, @NotNull C44110b markPrice, @NotNull C44110b takerFeeRate) throws Throwable {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(bidOrderQty, "bidOrderQty");
        Intrinsics.checkNotNullParameter(bidPositionQty, "bidPositionQty");
        Intrinsics.checkNotNullParameter(askOrderQty, "askOrderQty");
        Intrinsics.checkNotNullParameter(askPositionQty, "askPositionQty");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44109a c44109a = C44109a.f97401a;
            if (bidPositionQty.m97182b(c44109a.m97180b()) < 0) {
                bidPositionQty = bidPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM97181a = bidOrderQty.m97181a(bidPositionQty);
            if (askPositionQty.m97182b(c44109a.m97180b()) < 0) {
                askPositionQty = askPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, markPrice, c44110bM97181a.m97181a(askOrderQty.m97181a(askPositionQty)));
            if (c44110bM100039g == null) {
                return null;
            }
            if (c44110bM100039g.m97182b(c44109a.m97180b()) < 0) {
                c44110bM100039g = c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            return c44110bM100039g.m97185e(takerFeeRate);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C44110b m99598a(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b qty, @NotNull C44110b price, @NotNull C44110b initMarginRate) throws Throwable {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(initMarginRate, "initMarginRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, price, qty);
            if (c44110bM100039g != null) {
                C44109a c44109a = C44109a.f97401a;
                if (c44110bM100039g.m97182b(c44109a.m97180b()) < 0) {
                    c44110bM100039g = c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                if (c44110bM100039g != null) {
                    C44110b c44110bM97185e = c44110bM100039g.m97185e(initMarginRate);
                    return c44110bM97185e.m97182b(c44109a.m97180b()) >= 0 ? c44110bM97185e : c44110bM97185e.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C44110b m99599b(@NotNull C44110b leverage, @NotNull C44110b maintainMarginRate, @NotNull C44110b factor) throws Throwable {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(maintainMarginRate, "maintainMarginRate");
        Intrinsics.checkNotNullParameter(factor, "factor");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (leverage.m97182b(new C44110b("0")) == 0) {
                return new C44110b("0");
            }
            C44110b c44110bM97183c = new C44110b("1").m97183c(leverage, 20, KMMRoundingMode.HALF_UP);
            C44110b c44110bM97185e = maintainMarginRate.m97185e(factor);
            return c44110bM97183c.m97182b(c44110bM97185e) > 0 ? c44110bM97183c : c44110bM97185e;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            Object obj = (Void) objM103844constructorimpl;
            return obj != null ? (C44110b) obj : new C44110b("0");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C44110b m99602e(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b qty, @NotNull C44110b price, @NotNull C44110b maintainRate) throws Throwable {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(maintainRate, "maintainRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, price, qty);
            if (c44110bM100039g == null) {
                return null;
            }
            C44110b c44110bM97185e = c44110bM100039g.m97185e(maintainRate);
            return c44110bM97185e.m97182b(C44109a.f97401a.m97180b()) >= 0 ? c44110bM97185e : c44110bM97185e.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final C44110b m99603f(@NotNull C44110b maintainMarginRateLimit, @NotNull C44110b factor, @NotNull C44110b maxLeverage, @NotNull C44110b posOrderQty) throws Throwable {
        Intrinsics.checkNotNullParameter(maintainMarginRateLimit, "maintainMarginRateLimit");
        Intrinsics.checkNotNullParameter(factor, "factor");
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(posOrderQty, "posOrderQty");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (maxLeverage.m97182b(new C44110b("0")) == 0 || factor.m97182b(new C44110b("0")) == 0) {
                return null;
            }
            C44110b c44110b = new C44110b("1");
            KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
            C44110b c44110bM97185e = c44110b.m97181a(posOrderQty.m97183c(factor, 20, kMMRoundingMode)).m97185e(new C44110b("1").m97183c(new C44110b("2").m97185e(maxLeverage), 20, kMMRoundingMode));
            return c44110bM97185e.m97182b(maintainMarginRateLimit) < 0 ? c44110bM97185e : maintainMarginRateLimit;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C44110b m99605h(@NotNull C44110b bidOrderMaintainMargin, @NotNull C44110b askOrderMaintainMargin, @NotNull C44110b bidPositionMaintainMargin, @NotNull C44110b askPositionMaintainMargin, @NotNull C44110b maintainMarginRateDiscount) throws Throwable {
        Intrinsics.checkNotNullParameter(bidOrderMaintainMargin, "bidOrderMaintainMargin");
        Intrinsics.checkNotNullParameter(askOrderMaintainMargin, "askOrderMaintainMargin");
        Intrinsics.checkNotNullParameter(bidPositionMaintainMargin, "bidPositionMaintainMargin");
        Intrinsics.checkNotNullParameter(askPositionMaintainMargin, "askPositionMaintainMargin");
        Intrinsics.checkNotNullParameter(maintainMarginRateDiscount, "maintainMarginRateDiscount");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM97181a = bidOrderMaintainMargin.m97181a(bidPositionMaintainMargin).m97181a(askOrderMaintainMargin.m97181a(askPositionMaintainMargin));
            if (bidPositionMaintainMargin.m97182b(askPositionMaintainMargin) >= 0) {
                bidPositionMaintainMargin = askPositionMaintainMargin;
            }
            return c44110bM97181a.m97187g(bidPositionMaintainMargin.m97185e(maintainMarginRateDiscount));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            Object obj = (Void) objM103844constructorimpl;
            return obj != null ? (C44110b) obj : new C44110b("0");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final C44110b m99606i(@NotNull C44110b multiplier, @NotNull C44110b bidOrderQty, @NotNull C44110b bidPositionQty, @NotNull C44110b askOrderQty, @NotNull C44110b askPositionQty) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(bidOrderQty, "bidOrderQty");
        Intrinsics.checkNotNullParameter(bidPositionQty, "bidPositionQty");
        Intrinsics.checkNotNullParameter(askOrderQty, "askOrderQty");
        Intrinsics.checkNotNullParameter(askPositionQty, "askPositionQty");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44109a c44109a = C44109a.f97401a;
            if (bidPositionQty.m97182b(c44109a.m97180b()) < 0) {
                bidPositionQty = bidPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM97181a = bidOrderQty.m97181a(bidPositionQty);
            if (askPositionQty.m97182b(c44109a.m97180b()) < 0) {
                askPositionQty = askPositionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM97181a2 = askOrderQty.m97181a(askPositionQty);
            if (c44110bM97181a.m97182b(c44110bM97181a2) <= 0) {
                c44110bM97181a = c44110bM97181a2;
            }
            if (multiplier.m97182b(c44109a.m97180b()) < 0) {
                multiplier = multiplier.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97181a.m97185e(multiplier));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        C44110b c44110b = (C44110b) objM103844constructorimpl;
        return c44110b == null ? new C44110b("0") : c44110b;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final C44110b m99608k(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b bidOrderQty, @NotNull C44110b askOrderQty, @NotNull C44110b markPrice, @NotNull C44110b takerFeeRate, @NotNull C44110b taxRate) throws Throwable {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(bidOrderQty, "bidOrderQty");
        Intrinsics.checkNotNullParameter(askOrderQty, "askOrderQty");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44109a c44109a = C44109a.f97401a;
            if (bidOrderQty.m97182b(c44109a.m97180b()) < 0) {
                bidOrderQty = bidOrderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            if (askOrderQty.m97182b(c44109a.m97180b()) < 0) {
                askOrderQty = askOrderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, markPrice, bidOrderQty.m97181a(askOrderQty));
            if (c44110bM100039g == null) {
                return null;
            }
            if (c44110bM100039g.m97182b(c44109a.m97180b()) < 0) {
                c44110bM100039g = c44110bM100039g.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            return c44110bM100039g.m97185e(takerFeeRate.m97185e(new C44110b("1").m97181a(taxRate)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final C44110b m99609l(@NotNull C44110b totalMargin, @NotNull C44110b posOrderMM, @NotNull C44110b closeFee, @NotNull C44110b openFee) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(posOrderMM, "posOrderMM");
        Intrinsics.checkNotNullParameter(closeFee, "closeFee");
        Intrinsics.checkNotNullParameter(openFee, "openFee");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(posOrderMM.m97181a(closeFee).m97183c(totalMargin.m97187g(openFee), 20, KMMRoundingMode.HALF_UP));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (C44110b) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final C44110b m99610m(@NotNull C44110b unrealizedPnl, @NotNull C44110b initMargin) throws Throwable {
        Intrinsics.checkNotNullParameter(unrealizedPnl, "unrealizedPnl");
        Intrinsics.checkNotNullParameter(initMargin, "initMargin");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (initMargin.m97182b(new C44110b("0")) == 0) {
                return null;
            }
            return unrealizedPnl.m97183c(initMargin, 20, KMMRoundingMode.HALF_UP);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }
}

package com.kubi.home.gembox;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.home.R$color;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.exception.HomeException;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import dj.C36716a;
import gf.C37886j;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p058cj.C4988a;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.ClosedFloatingPointRange;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: GemboxCardVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J:\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001aH\u0086@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0011H\u0002J\f\u0010$\u001a\u00020\u000b*\u00020\"H\u0002J\u0016\u0010%\u001a\u00020\u000b*\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0014\u0010%\u001a\u0004\u0018\u00010&*\b\u0012\u0004\u0012\u00020\"0\u0011H\u0002J\u0017\u0010'\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020\"H\u0002¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0007H\u0002J(\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u0016H\u0014J\b\u00101\u001a\u00020\u0016H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u00106\u001a\u00020\u0016H\u0002J\b\u00107\u001a\u00020\u0016H\u0002J\f\u00108\u001a\u00020\u0016*\u000204H\u0002J\u0014\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u00103\u001a\u000204H\u0002J\f\u0010:\u001a\u00020\u000b*\u00020\"H\u0002J\f\u0010;\u001a\u00020\u000b*\u00020\"H\u0002J\u0014\u0010<\u001a\u00020=*\u00020=2\u0006\u0010>\u001a\u00020&H\u0002J\u0010\u0010?\u001a\u00020\u00162\u0006\u00103\u001a\u00020@H\u0002J\u0016\u0010A\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020BH\u0094@¢\u0006\u0002\u0010CR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/gembox/GemboxContract$UIState;", "<init>", "()V", "range1", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "range2", "range3", "needCatchException", "", "getNeedCatchException", "()Z", "disposable", "Lio/reactivex/disposables/Disposable;", "handleGetHeatList", "", "Lcom/kubi/home/gembox/HeatEntity;", "intent", "Lcom/kubi/home/gembox/GemboxContract$UiIntent$GetHeatListIntent;", "repeatOn", "", "count", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getColorType", "Lcom/kubi/home/gembox/HeatColorRes;", "index", "replaceHighLightIcon", "Lcom/kubi/home/gembox/GemboxCardDataHighLight;", "gemboxCardDataHighLightList", "needTradeByParam", "maxTradeType", "", "getHighLightIcon", "gemboxCardDataHighLight", "(Lcom/kubi/home/gembox/GemboxCardDataHighLight;)Ljava/lang/Integer;", "checkNeedHalf", "heatValue", "getRes", "needHalf", "indexPos", "resEntity", "onCleared", "handleListenGembox", "getExposeTypeList", "data", "Lcom/kubi/home/gembox/GemboxCardData$Data;", "expose", "trackClick", "handleJumpToRn", "sendData", "handleData", "needType", "isTrade", "modifyColor", "", "type", "handleBindGemboxData", "Lcom/kubi/home/gembox/GemboxCardData;", "dispatchIntent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/home/gembox/GemboxContract$UIState;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGemboxCardVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemboxCardVM.kt\ncom/kubi/home/gembox/GemboxCardVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 7 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,501:1\n1878#2,3:502\n774#2:505\n865#2,2:506\n1999#2,14:508\n1573#2:554\n1604#2,4:555\n31#3,11:522\n54#3:533\n50#4,17:534\n1#5:551\n47#6,2:552\n158#7,6:559\n170#7,6:565\n*S KotlinDebug\n*F\n+ 1 GemboxCardVM.kt\ncom/kubi/home/gembox/GemboxCardVM\n*L\n119#1:502,3\n220#1:505\n220#1:506,2\n222#1:508,14\n403#1:554\n403#1:555,4\n310#1:522,11\n310#1:533\n382#1:534,17\n384#1:552,2\n436#1:559,6\n437#1:565,6\n*E\n"})
public final class GemboxCardVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f25646b0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final String[] f25647c0 = {"SUDDEN_RISE", "SUDDEN_FALL", "NEW_CURRENCY_OPEN", "BREAKING_NEWS", "MARKET_CHANGE", "BIG_MONEY", "PRO_TRADER", "ALL_TRADER"};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final String[] f25648d0 = {"BIG_MONEY", "PRO_TRADER", "ALL_TRADER"};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ClosedFloatingPointRange<Float> f25649X = RangesKt.rangeTo(1.0f, 4.5f);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ClosedFloatingPointRange<Float> f25650Y = RangesKt.rangeTo(5.0f, 8.5f);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final ClosedFloatingPointRange<Float> f25651Z = RangesKt.rangeTo(9.0f, 10.0f);

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Disposable f25652a0;

    /* JADX INFO: compiled from: GemboxCardVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardVM$Companion;", "", "<init>", "()V", "TRADE_DIRECTION_BUY", "", "TRADE_DIRECTION_SELL", "TRADE_DEFAULT", "GEMBOX_TYPE_LIST", "", "getGEMBOX_TYPE_LIST", "()[Ljava/lang/String;", "[Ljava/lang/String;", "TRADE_TYPE_ARRAY", "getTRADE_TYPE_ARRAY", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String[] getGEMBOX_TYPE_LIST() {
            return GemboxCardVM.f25647c0;
        }

        @NotNull
        public final String[] getTRADE_TYPE_ARRAY() {
            return GemboxCardVM.f25648d0;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCardVM$a */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 GemboxCardVM.kt\ncom/kubi/home/gembox/GemboxCardVM\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:239\n36#3:231\n137#4,5:232\n311#5,2:237\n46#6,2:249\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n*L\n42#1:224,7\n42#1:239,10\n43#1:231\n43#1:232,5\n50#1:249,2\n*E\n"})
    public static final class C14568a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f25653b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GemboxCardVM f25654c;

        /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCardVM$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocket$1$invoke$lambda$2$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<GemboxCardPushData> {
        }

        public C14568a(String str, GemboxCardVM gemboxCardVM) {
            this.f25653b = str;
            this.f25654c = gemboxCardVM;
        }

        /* JADX INFO: renamed from: a */
        public final void m29216a(String it) throws Throwable {
            Object objM103844constructorimpl;
            Object objM66914d;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f25653b;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(it, new a().getType());
                } catch (Throwable th2) {
                    C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                    objM66914d = null;
                }
                if (objM66914d != null) {
                    GemboxCardData.Data data = (GemboxCardData.Data) CollectionsKt.firstOrNull((List) ((GemboxCardPushData) objM66914d).getCurrencyList());
                    if (data != null) {
                        this.f25654c.m29206S(data);
                    }
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析成功！");
                } else {
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析失败！");
                    objM66914d = Unit.INSTANCE;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【MVI bindSocket发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws Throwable {
            m29216a(str);
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.mvi.state.AbstractC19290l, com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final HeatColorRes m29210t(int i11) {
        float f11 = i11 + 1.0f;
        if (this.f25649X.contains(Float.valueOf(f11))) {
            return new HeatColorRes(R$mipmap.ic_gembox_heat_primary_half, R$mipmap.ic_gembox_heat_primary);
        }
        if (this.f25650Y.contains(Float.valueOf(f11))) {
            return new HeatColorRes(R$mipmap.ic_gembox_heat_yellow_half, R$mipmap.ic_gembox_heat_yellow);
        }
        return this.f25651Z.contains(Float.valueOf(f11)) ? new HeatColorRes(R$mipmap.ic_gembox_heat_red_half, R$mipmap.ic_gembox_heat_red) : new HeatColorRes(R$mipmap.ic_gembox_heat_primary_half, R$mipmap.ic_gembox_heat_primary);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m29174C(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, list, null, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final boolean m29175M(GemboxCardVM gemboxCardVM, Ref.ObjectRef objectRef, GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (gemboxCardVM.m29199F(it)) {
            return gemboxCardVM.m29203J(it) && gemboxCardVM.m29201H(it, (String) objectRef.element);
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m29176N(GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String type = it.getType();
        return type == null || type.length() == 0;
    }

    /* JADX INFO: renamed from: O */
    public static final GemboxCardDataHighLight m29177O(GemboxCardVM gemboxCardVM, GemboxCardDataHighLight gemboxCardDataHighLight) {
        Intrinsics.checkNotNullParameter(gemboxCardDataHighLight, "gemboxCardDataHighLight");
        return GemboxCardDataHighLight.copy$default(gemboxCardDataHighLight, null, null, gemboxCardVM.m29212w(gemboxCardDataHighLight), null, null, 27, null);
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m29178P(GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getIcon() != null;
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m29179Q(GemboxCardVM gemboxCardVM, GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return gemboxCardVM.m29204K(it);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m29180R(GemboxCardVM gemboxCardVM, GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (gemboxCardVM.m29199F(it)) {
            return false;
        }
        String title = it.getTitle();
        return title == null || title.length() == 0;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m29193s(GemboxCardData.Data data, GemboxCardVM gemboxCardVM) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", data.getName());
        jSONObject.put("likes", data.getHeatValue());
        jSONObject.put("intervals", data.getChangeRate());
        jSONObject.put("allItemContent", gemboxCardVM.m29211u(data));
        Unit unit = Unit.INSTANCE;
        C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "gembox", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final CharSequence m29194v(GemboxCardVM gemboxCardVM, GemboxCardDataHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!gemboxCardVM.m29199F(it)) {
            return C27041f.m66668h(it.getType());
        }
        return C27041f.m66668h(it.getType()) + '_' + C27041f.m66668h(it.getTradeDirection());
    }

    /* JADX INFO: renamed from: A */
    public final UIState m29195A(UIState uIState, GemboxCardData.Data data) {
        String strM92642g;
        List listEmptyList;
        BigDecimal price = data.getPrice();
        String strM66668h = C27041f.m66668h(price != null ? C37886j.m85579c(price, data.getSymbolCode(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.HALF_UP, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null);
        BigDecimal changeRate = data.getChangeRate();
        if (changeRate == null || (strM92642g = C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null)) == null) {
            strM92642g = "--";
        }
        String str = strM92642g;
        List<GemboxCardDataHighLight> highLights = data.getHighLights();
        if (highLights == null) {
            highLights = CollectionsKt.emptyList();
        }
        GemboxCardData.Data dataCopy$default = GemboxCardData.Data.copy$default(data, null, str, null, null, null, null, strM66668h, null, null, m29205L(highLights), 445, null);
        m29209r(dataCopy$default);
        List<GemboxCardDataHighLight> highLights2 = dataCopy$default.getHighLights();
        if (highLights2 != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(highLights2, 10));
            int i11 = 0;
            for (Object obj : highLights2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GemboxCardDataHighLight gemboxCardDataHighLight = (GemboxCardDataHighLight) obj;
                TextItem textItem = new TextItem(C27041f.m66668h(m29199F(gemboxCardDataHighLight) ? gemboxCardDataHighLight.getDescription() : gemboxCardDataHighLight.getTitle()), gemboxCardDataHighLight.getIcon(), i11);
                String text = textItem.getText();
                String tradeDirection = gemboxCardDataHighLight.getTradeDirection();
                if (tradeDirection == null) {
                    tradeDirection = "";
                }
                textItem.setMessage(m29202I(text, tradeDirection));
                listEmptyList.add(textItem);
                i11 = i12;
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.size() == 1) {
            ((TextItem) listEmptyList.get(0)).setMarqueeType(2);
        }
        Unit unit = Unit.INSTANCE;
        return UIState.copy$default(uIState, dataCopy$default, null, listEmptyList, 2, null);
    }

    /* JADX INFO: renamed from: B */
    public final List<HeatEntity> m29196B(GemboxContract$UiIntent.GetHeatListIntent getHeatListIntent) {
        C4988a.m5287b("handleGetHeatList", null, 1, null);
        final ArrayList arrayList = new ArrayList();
        int maxCount = getHeatListIntent.getMaxCount();
        int i11 = 0;
        for (int i12 = 0; i12 < maxCount; i12++) {
            arrayList.add(new HeatEntity(0, 1, null));
        }
        for (Object obj : arrayList) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((HeatEntity) obj).setImgRes(m29214y(m29208q(getHeatListIntent.getHeatValue()), i13, getHeatListIntent.getHeatValue(), m29210t(i11)));
            i11 = i13;
        }
        updateState(new Function1() { // from class: com.kubi.home.gembox.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GemboxCardVM.m29174C(arrayList, (UIState) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final void m29198E() {
        String strM66551u = DowngradeExKt.m66551u("/app-home/gem-box:%s", new Object[]{MultiLanguageManager.f46811g.getLocalString()}, null, 2, null);
        SocketTask.Companion.obtain$default(SocketTask.f48571i, strM66551u, this, null, 4, null).m58923y(null).m58911j(new C14568a(strM66551u, this));
    }

    /* JADX INFO: renamed from: F */
    public final boolean m29199F(GemboxCardDataHighLight gemboxCardDataHighLight) {
        return ArraysKt.contains(f25648d0, gemboxCardDataHighLight.getType());
    }

    /* JADX INFO: renamed from: G */
    public final String m29200G(List<GemboxCardDataHighLight> list) {
        Object next;
        String strRemoveSuffix;
        String strRemoveSuffix2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m29203J((GemboxCardDataHighLight) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String param = ((GemboxCardDataHighLight) next).getParam();
                double dM66646f = C27039d.m66646f((param == null || (strRemoveSuffix2 = StringsKt.removeSuffix(param, (CharSequence) "%")) == null) ? null : Double.valueOf(Double.parseDouble(strRemoveSuffix2)));
                do {
                    Object next2 = it.next();
                    String param2 = ((GemboxCardDataHighLight) next2).getParam();
                    double dM66646f2 = C27039d.m66646f((param2 == null || (strRemoveSuffix = StringsKt.removeSuffix(param2, (CharSequence) "%")) == null) ? null : Double.valueOf(Double.parseDouble(strRemoveSuffix)));
                    if (Double.compare(dM66646f, dM66646f2) < 0) {
                        next = next2;
                        dM66646f = dM66646f2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        GemboxCardDataHighLight gemboxCardDataHighLight = (GemboxCardDataHighLight) next;
        if (gemboxCardDataHighLight != null) {
            return gemboxCardDataHighLight.getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final CharSequence m29202I(CharSequence charSequence, String str) {
        int i11;
        int i12;
        if (StringsKt.contains$default(charSequence, '[', false, 2, (Object) null) && StringsKt.contains$default(charSequence, ']', false, 2, (Object) null)) {
            int length = charSequence.length();
            int i13 = 0;
            while (true) {
                i11 = -1;
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (charSequence.charAt(i13) == '[') {
                    break;
                }
                i13++;
            }
            int i14 = i13 - 1;
            int length2 = charSequence.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (charSequence.charAt(length2) == ']') {
                        i11 = length2;
                        break;
                    }
                    if (i15 < 0) {
                        break;
                    }
                    length2 = i15;
                }
            }
            int i16 = i11 - 1;
            if (Intrinsics.areEqual(str, "BUY")) {
                i12 = R$color.primary;
            } else if (Intrinsics.areEqual(str, "SELL")) {
                i12 = R$color.secondary;
            }
            String strReplace = new Regex("\\[").replace(new Regex("]").replace(charSequence, ""), "");
            C4988a.m5287b("firstIndex:" + i14 + " lastIndex:" + i16 + " replaceString.length" + strReplace.length() + " replaceString:" + strReplace, null, 1, null);
            IntRange intRange = new IntRange(0, strReplace.length());
            int first = intRange.getFirst();
            if (i14 <= intRange.getLast() && first <= i14) {
                int first2 = intRange.getFirst();
                if (i16 <= intRange.getLast() && first2 <= i16) {
                    SpannableString spannableString = new SpannableString(new Regex("\\[").replace(new Regex("]").replace(charSequence, ""), ""));
                    spannableString.setSpan(new ForegroundColorSpan(BaseApplication.INSTANCE.get().getResources().getColor(i12)), i14, i16, 18);
                    return spannableString;
                }
            }
            return strReplace;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m29204K(GemboxCardDataHighLight gemboxCardDataHighLight) {
        return ArraysKt.contains(f25647c0, gemboxCardDataHighLight.getType());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: L */
    public final List<GemboxCardDataHighLight> m29205L(List<GemboxCardDataHighLight> list) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List<GemboxCardDataHighLight> list2 = CollectionsKt.toList(list);
        objectRef.element = m29200G(list2);
        return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(SequencesKt.filterNot(SequencesKt.filter(SequencesKt.filterNot(SequencesKt.filter(CollectionsKt.asSequence(list2), new Function1() { // from class: com.kubi.home.gembox.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GemboxCardVM.m29179Q(this.f25673b, (GemboxCardDataHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.home.gembox.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GemboxCardVM.m29180R(this.f25674b, (GemboxCardDataHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.home.gembox.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GemboxCardVM.m29175M(this.f25675b, objectRef, (GemboxCardDataHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.home.gembox.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GemboxCardVM.m29176N((GemboxCardDataHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.home.gembox.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GemboxCardVM.m29177O(this.f25677b, (GemboxCardDataHighLight) obj);
            }
        }), new Function1() { // from class: com.kubi.home.gembox.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GemboxCardVM.m29178P((GemboxCardDataHighLight) obj));
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m29206S(GemboxCardData.Data data) throws Throwable {
        Object objM103844constructorimpl;
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            update(m29195A((UIState) getState(), data));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【GemboxCardVM 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl2, "GemboxCarVM", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final void m29207T() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", ((UIState) getState()).getData().getName());
        jSONObject.put("likes", ((UIState) getState()).getData().getHeatValue());
        jSONObject.put("intervals", ((UIState) getState()).getData().getChangeRate());
        jSONObject.put("allItemContent", m29211u(((UIState) getState()).getData()));
        Unit unit = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "gembox", "1", jSONObject);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (interfaceC19282d instanceof GemboxContract$UiIntent.JumpToRn) {
            m29197D();
        } else if (interfaceC19282d instanceof GemboxContract$UiIntent.TrackClickIntent) {
            m29207T();
        } else if (interfaceC19282d instanceof GemboxContract$UiIntent.GetHeatListIntent) {
            m29196B((GemboxContract$UiIntent.GetHeatListIntent) interfaceC19282d);
        } else if (interfaceC19282d instanceof GemboxContract$UiIntent.BindGemboxData) {
            m29215z(((GemboxContract$UiIntent.BindGemboxData) interfaceC19282d).getData());
            m29198E();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m29208q(float f11) {
        return (f11 / 0.5f) % ((float) 2) == 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final void m29209r(final GemboxCardData.Data data) {
        if (data != null) {
            C36716a.m82238a((Intrinsics.areEqual(data.getName(), "--") || Intrinsics.areEqual(data.getName(), ((UIState) getState()).getData().getName())) ? false : true, new Function0() { // from class: com.kubi.home.gembox.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GemboxCardVM.m29193s(data, this);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: y */
    public final int m29214y(boolean z11, float f11, float f12, HeatColorRes heatColorRes) {
        float f13 = f12 + 0.5f;
        if (f13 == f11) {
            return z11 ? heatColorRes.getF25683a() : heatColorRes.getF25684b();
        }
        return f11 > f13 ? R$mipmap.ic_gembox_heat_grey : heatColorRes.getF25684b();
    }

    /* JADX INFO: renamed from: D */
    public final void m29197D() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new GemboxCardVM$handleJumpToRn$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m29201H(GemboxCardDataHighLight gemboxCardDataHighLight, String str) {
        return Intrinsics.areEqual(gemboxCardDataHighLight.getType(), str);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m29203J(GemboxCardDataHighLight gemboxCardDataHighLight) {
        if (!m29199F(gemboxCardDataHighLight) || gemboxCardDataHighLight.getParam() == null || !StringsKt.endsWith$default(gemboxCardDataHighLight.getParam(), "%", false, 2, (Object) null) || Double.parseDouble(StringsKt.removeSuffix(gemboxCardDataHighLight.getParam(), (CharSequence) "%")) <= 60.0d) {
            return false;
        }
        return true;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.f25652a0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: u */
    public final String m29211u(GemboxCardData.Data data) {
        String strJoinToString$default;
        List<GemboxCardDataHighLight> highLights = data.getHighLights();
        if (highLights != null) {
            strJoinToString$default = CollectionsKt.joinToString$default(highLights, ",", null, null, 0, null, new Function1() { // from class: com.kubi.home.gembox.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GemboxCardVM.m29194v(this.f25680b, (GemboxCardDataHighLight) obj);
                }
            }, 30, null);
        } else {
            strJoinToString$default = null;
        }
        return C27041f.m66668h(strJoinToString$default);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w */
    public final Integer m29212w(GemboxCardDataHighLight gemboxCardDataHighLight) {
        String type = gemboxCardDataHighLight.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1198671559:
                    if (type.equals("NEW_CURRENCY_OPEN")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_new_coin);
                    }
                    return null;
                case -924304625:
                    if (type.equals("BREAKING_NEWS")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_message);
                    }
                    return null;
                case 389622796:
                    if (type.equals("ALL_TRADER")) {
                        return Integer.valueOf(R$mipmap.ic_all_trader);
                    }
                    return null;
                case 410517779:
                    if (type.equals("MARKET_CHANGE")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_event);
                    }
                    return null;
                case 415559040:
                    if (type.equals("PRO_TRADER")) {
                        return Integer.valueOf(R$mipmap.ic_pro_trader);
                    }
                    return null;
                case 688483503:
                    if (type.equals("SUDDEN_FALL")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_down);
                    }
                    return null;
                case 688848893:
                    if (type.equals("SUDDEN_RISE")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_up);
                    }
                    return null;
                case 724788353:
                    if (type.equals("BIG_MONEY")) {
                        return Integer.valueOf(R$mipmap.ic_big_money);
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final void m29215z(GemboxCardData gemboxCardData) throws Throwable {
        GemboxCardData.Data data = (GemboxCardData.Data) CollectionsKt.firstOrNull((List) gemboxCardData.getData());
        if (data != null) {
            m29206S(data);
        }
    }
}

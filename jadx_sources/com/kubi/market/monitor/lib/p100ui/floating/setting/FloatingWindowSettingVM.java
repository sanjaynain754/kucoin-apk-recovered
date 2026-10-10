package com.kubi.market.monitor.lib.p100ui.floating.setting;

import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import aq.C4373b;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import com.kubi.mvi.state.AbstractC19289k;
import com.kubi.mvi.state.InterfaceC19282d;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p265fl.C37565d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FloatingWindowSettingVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u000b2\u0006\u0010'\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u000bH\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u00104\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowSettingVM;", "Lcom/kubi/mvi/state/RepositoryVM;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ISettingRepository;", "<init>", "()V", "logTag", "", "getLogTag", "()Ljava/lang/String;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleChangePagingTime", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ChangePagingTime;", "handleAutoScrollTime", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ChangeDisplayModeScrollTime;", "handleChangePageCount", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ChangePageCount;", "handleShowSelectDialogIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ShowSelectDialogIntent;", "showSelectDialog", "selectData", "Lcom/kubi/market/monitor/lib/ui/floating/setting/SelectData;", "showDataUpdateIntervalTimeSelectDialog", "showPagingModelSelectDialog", "showSelectTextSizeModeDialog", "showDisplayModeSelectDialog", "showThemeSelectDialog", "handleSelectDialogItemIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/SelectItemIntent;", "updateTheme", "updateTextSizeMode", "updatePagingMode", "updateDisplayMode", "updateDataUpdateIntervalTime", "handleFloatingWindowFiatPriceSwitchIntent", "it", "Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowFiatPriceSwitchIntent;", "handleFloatingWindowActionBarSwitchIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowActionBarSwitchIntent;", "handleFloatingWindowChangePercentSwitchIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowChangePercentSwitchIntent;", "handleFloatingWindowCurrencyNameSwitchIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowCurrencyNameSwitchIntent;", "handleChangeBgAlphaIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ChangeBgAlphaIntent;", "handleFloatingWindowSwitch", "Lcom/kubi/market/monitor/lib/ui/floating/setting/SwitchFloatingWindowIntent;", "handleOnShowIntent", "repository", "getRepository", "()Lcom/kubi/market/monitor/lib/ui/floating/setting/ISettingRepository;", "initState", "getInitState", "()Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowSettingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowSettingVM.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowSettingVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,440:1\n106#2,2:441\n106#2,2:443\n473#3,4:445\n473#3,4:449\n473#3,4:453\n473#3,4:457\n473#3,4:461\n473#3,4:465\n473#3,4:469\n473#3,4:473\n473#3,4:477\n473#3,4:481\n473#3,4:485\n*S KotlinDebug\n*F\n+ 1 FloatingWindowSettingVM.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowSettingVM\n*L\n25#1:441,2\n33#1:443,2\n44#1:445,4\n48#1:449,4\n52#1:453,4\n56#1:457,4\n60#1:461,4\n64#1:465,4\n68#1:469,4\n72#1:473,4\n76#1:477,4\n79#1:481,4\n82#1:485,4\n*E\n"})
public final class FloatingWindowSettingVM extends AbstractC19289k<UIState, ISettingRepository> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f34293X = "FloatingWindowSettingVM";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ISettingRepository f34294Y;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowSettingVM$a */
    /* JADX INFO: compiled from: FloatingWindowSettingVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18636a implements Function1<UIState, UIState> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34295b;

        public C18636a(int i11) {
            this.f34295b = i11;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UIState invoke(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, false, null, 0, 0, null, C18686g.m40913b(this.f34295b), C18686g.m40917f(), null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048479, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowSettingVM$b */
    /* JADX INFO: compiled from: FloatingWindowSettingVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18637b implements Function1<UIState, UIState> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34296b;

        public C18637b(boolean z11) {
            this.f34296b = z11;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UIState invoke(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, this.f34296b, false, false, false, null, null, 1032191, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowSettingVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: FloatingWindowSettingVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowSettingVM", m90122f = "FloatingWindowSettingVM.kt", m90123i = {0}, m90124l = {41}, m90125m = "dispatchIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C186381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C186381(Continuation<? super C186381> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingWindowSettingVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final UIState m40802J0(SelectItemIntent selectItemIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, selectItemIntent.getSelectItem().getLabel().toString(), null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048559, null);
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m40804K0(int i11, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("allItemAmount", String.valueOf(i11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M0 */
    public static final UIState m40807M0(int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, C18686g.m40913b(i11), C18686g.m40917f(), null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048479, null);
    }

    /* JADX INFO: renamed from: O0 */
    public static final UIState m40810O0(int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, C18686g.m40914c(), C18686g.m40915d(i11), null, 0, false, false, false, false, null, null, 1045503, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final UIState m40813Q0(int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, C18686g.m40918g(i11), 524287, null);
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m40814R0(int i11, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("clickPosition", String.valueOf(i11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T0 */
    public static final UIState m40815T0(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, C18686g.m40919h(FloatingWindowConfigManager.f34272a.m40730g().getTheme()), 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048573, null);
    }

    /* JADX INFO: renamed from: U */
    public static final UIState m40816U(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, C18686g.m40912a(), false, null, null, 0, false, false, false, false, null, null, 1048063, null);
    }

    /* JADX INFO: renamed from: W */
    public static final UIState m40817W(ChangeBgAlphaIntent changeBgAlphaIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, changeBgAlphaIntent.getBgAlpha(), changeBgAlphaIntent.getBgAlpha(), null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048563, null);
    }

    /* JADX INFO: renamed from: X */
    public static final UIState m40818X(ChangeBgAlphaIntent changeBgAlphaIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, changeBgAlphaIntent.getBgAlpha(), 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048571, null);
    }

    /* JADX INFO: renamed from: Z */
    public static final UIState m40819Z(ChangePageCount changePageCount, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, String.valueOf(changePageCount.getPageCount()), changePageCount.getPageCount(), false, false, false, false, null, null, 1036287, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m40820a0(ChangePageCount changePageCount, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("allItemAmount", String.valueOf(changePageCount.getPageCount()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final UIState m40821b0(ChangePageCount changePageCount, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, String.valueOf(changePageCount.getPageCount()), 0, false, false, false, false, null, null, 1044479, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static final UIState m40822d0(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, C18686g.m40916e(), null, false, null, null, 0, false, false, false, false, null, null, 1048319, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final UIState m40823f0(FloatingWindowActionBarSwitchIntent floatingWindowActionBarSwitchIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, floatingWindowActionBarSwitchIntent.getSwitch(), false, false, false, null, null, 1032191, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m40824g0(FloatingWindowActionBarSwitchIntent floatingWindowActionBarSwitchIntent, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("clickPosition", floatingWindowActionBarSwitchIntent.getSwitch() ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final UIState m40825i0(FloatingWindowChangePercentSwitchIntent floatingWindowChangePercentSwitchIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, floatingWindowChangePercentSwitchIntent.getSwitch(), false, null, null, 983039, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m40826j0(FloatingWindowChangePercentSwitchIntent floatingWindowChangePercentSwitchIntent, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("clickPosition", floatingWindowChangePercentSwitchIntent.getSwitch() ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static final UIState m40827m0(FloatingWindowCurrencyNameSwitchIntent floatingWindowCurrencyNameSwitchIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, floatingWindowCurrencyNameSwitchIntent.getSwitch(), false, false, null, null, 1015807, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m40828n0(FloatingWindowCurrencyNameSwitchIntent floatingWindowCurrencyNameSwitchIntent, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("clickPosition", floatingWindowCurrencyNameSwitchIntent.getSwitch() ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final UIState m40829p0(FloatingWindowFiatPriceSwitchIntent floatingWindowFiatPriceSwitchIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, floatingWindowFiatPriceSwitchIntent.getSwitch(), null, null, 917503, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m40830q0(FloatingWindowFiatPriceSwitchIntent floatingWindowFiatPriceSwitchIntent, JSONObject trackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(trackClick, "$this$trackClick");
        trackClick.put("clickPosition", floatingWindowFiatPriceSwitchIntent.getSwitch() ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final UIState m40838y0(SwitchFloatingWindowIntent switchFloatingWindowIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, switchFloatingWindowIntent.getSwitch() && !C37565d.f83517a.m84598d(), null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048574, null);
    }

    /* JADX INFO: renamed from: z0 */
    public static final UIState m40840z0(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, FloatingWindowConfigManager.f34272a.m40729f(), null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048574, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m40846F0(SelectData selectData) {
        send(new ShowDialog(selectData.getType(), selectData.getDataList()));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        UIState uIState = new UIState(false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048575, null);
        C44128b.m97259c("logTag", String.valueOf(uIState.getFloatingWindowSwitch()));
        return uIState;
    }

    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public ISettingRepository getF34294Y() {
        return this.f34294Y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.SingleThreadVM, com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C186381 c186381;
        if (continuation instanceof C186381) {
            c186381 = (C186381) continuation;
            int i11 = c186381.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c186381.label = i11 - Integer.MIN_VALUE;
            } else {
                c186381 = new C186381(continuation);
            }
        } else {
            c186381 = new C186381(continuation);
        }
        Object obj = c186381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c186381.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c186381.L$0 = interfaceC19282d;
            c186381.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c186381) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC19282d = (InterfaceC19282d) c186381.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC19282d instanceof SwitchFloatingWindowIntent) {
            m40865x0((SwitchFloatingWindowIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof ChangeBgAlphaIntent) {
            m40857V((ChangeBgAlphaIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof FloatingWindowActionBarSwitchIntent) {
            m40860e0((FloatingWindowActionBarSwitchIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof FloatingWindowChangePercentSwitchIntent) {
            m40861h0((FloatingWindowChangePercentSwitchIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof FloatingWindowCurrencyNameSwitchIntent) {
            m40862l0((FloatingWindowCurrencyNameSwitchIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof FloatingWindowFiatPriceSwitchIntent) {
            m40863o0((FloatingWindowFiatPriceSwitchIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof SelectItemIntent) {
            m40841A0((SelectItemIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof ShowSelectDialogIntent) {
            m40842B0((ShowSelectDialogIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof ChangePageCount) {
            m40858Y((ChangePageCount) interfaceC19282d);
        }
        if (interfaceC19282d instanceof ChangePagingTime) {
            m40859c0((ChangePagingTime) interfaceC19282d);
        }
        if (interfaceC19282d instanceof ChangeDisplayModeScrollTime) {
            m40856T((ChangeDisplayModeScrollTime) interfaceC19282d);
        }
        return Unit.INSTANCE;
    }

    public FloatingWindowSettingVM() {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "update_display_mode".length();
        }
        C12572a.m23693b(viewModelScope, new FloatingWindowSettingVM$special$$inlined$bindFlowEvent$1("update_display_mode", null, this));
        InterfaceC41709m0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
        if (c12573b.m23696a()) {
            "update_actionbar".length();
        }
        C12572a.m23693b(viewModelScope2, new FloatingWindowSettingVM$special$$inlined$bindFlowEvent$2("update_actionbar", null, this));
        this.f34294Y = new SettingRepositoryImpl();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m40841A0(SelectItemIntent selectItemIntent) {
        int type = selectItemIntent.getType();
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        if (type != 5) {
                            return;
                        }
                        m40855S0(selectItemIntent);
                        return;
                    }
                    m40852P0(selectItemIntent);
                    return;
                }
                m40851N0(selectItemIntent);
                return;
            }
            m40850L0(selectItemIntent);
            return;
        }
        m40849I0(selectItemIntent);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m40842B0(ShowSelectDialogIntent showSelectDialogIntent) {
        int type = showSelectDialogIntent.getType();
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        if (type != 5) {
                            return;
                        }
                        m40848H0();
                        return;
                    }
                    m40847G0();
                    return;
                }
                m40845E0();
                return;
            }
            m40844D0();
            return;
        }
        m40843C0();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m40843C0() {
        m40846F0(getF34294Y().mo40964q());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m40844D0() {
        m40846F0(getF34294Y().mo40962o());
    }

    /* JADX INFO: renamed from: E0 */
    public final void m40845E0() {
        m40846F0(getF34294Y().mo40952e());
    }

    /* JADX INFO: renamed from: G0 */
    public final void m40847G0() {
        m40846F0(getF34294Y().mo40958k());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m40848H0() {
        m40846F0(getF34294Y().mo40954g());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m40849I0(final SelectItemIntent selectItemIntent) {
        final int i11 = Integer.parseInt(selectItemIntent.getSelectItem().getId());
        getF34294Y().mo40965r(i11);
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40802J0(selectItemIntent, (UIState) obj);
            }
        });
        C4373b.m3907i("B4moreShowSetting", "setting", "1", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40804K0(i11, (JSONObject) obj);
            }
        });
        FloatingActionManager.f34540a.m41331F1(i11);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m40850L0(SelectItemIntent selectItemIntent) {
        final int i11 = Integer.parseInt(selectItemIntent.getSelectItem().getId());
        getF34294Y().mo40951d(i11);
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40807M0(i11, (UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41372k2(i11);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m40851N0(SelectItemIntent selectItemIntent) {
        final int i11 = Integer.parseInt(selectItemIntent.getSelectItem().getId());
        getF34294Y().mo40959l(i11);
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40810O0(i11, (UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41389t1(i11);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m40852P0(SelectItemIntent selectItemIntent) {
        final int i11 = Integer.parseInt(selectItemIntent.getSelectItem().getId());
        getF34294Y().mo40955h(i11);
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40813Q0(i11, (UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41363e1(i11);
        C4373b.m3907i("B4moreShowSetting", "setting", "3", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40814R0(i11, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final void m40855S0(SelectItemIntent selectItemIntent) {
        getF34294Y().mo40953f(Integer.parseInt(selectItemIntent.getSelectItem().getId()));
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40815T0((UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41368h2(FloatingWindowConfigManager.f34272a.m40730g().getTheme());
    }

    /* JADX INFO: renamed from: T */
    public final void m40856T(ChangeDisplayModeScrollTime changeDisplayModeScrollTime) {
        getF34294Y().mo40956i(changeDisplayModeScrollTime.getTime());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40816U((UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41326B1(changeDisplayModeScrollTime.getTime());
    }

    /* JADX INFO: renamed from: V */
    public final void m40857V(final ChangeBgAlphaIntent changeBgAlphaIntent) {
        getF34294Y().mo40948a(changeBgAlphaIntent.getBgAlpha());
        if (changeBgAlphaIntent.getType() == 2) {
            updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowSettingVM.m40817W(changeBgAlphaIntent, (UIState) obj);
                }
            });
        } else {
            updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowSettingVM.m40818X(changeBgAlphaIntent, (UIState) obj);
                }
            });
        }
        FloatingActionManager.f34540a.m41359b2(changeBgAlphaIntent.getBgAlpha());
    }

    /* JADX INFO: renamed from: Y */
    public final void m40858Y(final ChangePageCount changePageCount) {
        getF34294Y().mo40966s(changePageCount.getPageCount());
        if (2 == changePageCount.getType()) {
            updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowSettingVM.m40819Z(changePageCount, (UIState) obj);
                }
            });
            C4373b.m3907i("B4moreShowSetting", "setting", "2", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowSettingVM.m40820a0(changePageCount, (JSONObject) obj);
                }
            });
            FloatingActionManager.f34540a.m41357Z0(changePageCount.getPageCount());
            return;
        }
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40821b0(changePageCount, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m40859c0(ChangePagingTime changePagingTime) {
        getF34294Y().mo40961n(changePagingTime.getPagingTime());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40822d0((UIState) obj);
            }
        });
        FloatingActionManager.f34540a.m41393x1(changePagingTime.getPagingTime());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m40860e0(final FloatingWindowActionBarSwitchIntent floatingWindowActionBarSwitchIntent) {
        getF34294Y().mo40949b(floatingWindowActionBarSwitchIntent.getSwitch());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40823f0(floatingWindowActionBarSwitchIntent, (UIState) obj);
            }
        });
        C4373b.m3907i("B4susShowSetting", "setting", "1", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40824g0(floatingWindowActionBarSwitchIntent, (JSONObject) obj);
            }
        });
        FloatingActionManager.f34540a.m41354X1(floatingWindowActionBarSwitchIntent.getSwitch());
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40861h0(final FloatingWindowChangePercentSwitchIntent floatingWindowChangePercentSwitchIntent) {
        getF34294Y().mo40957j(floatingWindowChangePercentSwitchIntent.getSwitch());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40825i0(floatingWindowChangePercentSwitchIntent, (UIState) obj);
            }
        });
        C4373b.m3907i("B4susShowSetting", "setting", "3", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40826j0(floatingWindowChangePercentSwitchIntent, (JSONObject) obj);
            }
        });
        FloatingActionManager.f34540a.m41347S1(floatingWindowChangePercentSwitchIntent.getSwitch());
    }

    /* JADX INFO: renamed from: l0 */
    public final void m40862l0(final FloatingWindowCurrencyNameSwitchIntent floatingWindowCurrencyNameSwitchIntent) {
        getF34294Y().mo40963p(floatingWindowCurrencyNameSwitchIntent.getSwitch());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40827m0(floatingWindowCurrencyNameSwitchIntent, (UIState) obj);
            }
        });
        C4373b.m3907i("B4susShowSetting", "setting", "2", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40828n0(floatingWindowCurrencyNameSwitchIntent, (JSONObject) obj);
            }
        });
        FloatingActionManager.f34540a.m41338K1(floatingWindowCurrencyNameSwitchIntent.getSwitch());
    }

    /* JADX INFO: renamed from: o0 */
    public final void m40863o0(final FloatingWindowFiatPriceSwitchIntent floatingWindowFiatPriceSwitchIntent) {
        getF34294Y().mo40960m(floatingWindowFiatPriceSwitchIntent.getSwitch());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40829p0(floatingWindowFiatPriceSwitchIntent, (UIState) obj);
            }
        });
        C4373b.m3907i("B4susShowSetting", "setting", "4", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40830q0(floatingWindowFiatPriceSwitchIntent, (JSONObject) obj);
            }
        });
        FloatingActionManager.f34540a.m41343O1(floatingWindowFiatPriceSwitchIntent.getSwitch());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.SingleThreadVM
    /* JADX INFO: renamed from: p */
    public void mo40864p() {
        super.mo40864p();
        boolean floatingWindowSwitch = ((UIState) getState()).getFloatingWindowSwitch();
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40840z0((UIState) obj);
            }
        });
        if (!floatingWindowSwitch && ((UIState) getState()).getFloatingWindowSwitch()) {
            C4373b.m3908j("B3suspentionSetting", "switchSuccess", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m40865x0(final SwitchFloatingWindowIntent switchFloatingWindowIntent) {
        String str;
        getF34294Y().mo40950c(switchFloatingWindowIntent.getSwitch());
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowSettingVM.m40838y0(switchFloatingWindowIntent, (UIState) obj);
            }
        });
        if (switchFloatingWindowIntent.getSwitch()) {
            str = "1";
        } else {
            str = "2";
        }
        C4373b.m3908j("B3suspentionSetting", "switch", str, null, 8, null);
    }
}

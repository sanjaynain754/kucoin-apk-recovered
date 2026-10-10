package com.kubi.p110rn.kline;

import android.util.SparseArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KlineFlutterStageViewManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterStageViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/kubi/rn/kline/KlineFlutterStageHostView;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setSymbol", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "symbol", "setKlineType", "klineType", "setLeverTradeType", "leverTradeType", "onDropViewInstance", "getExportedCustomDirectEventTypeConstants", "", "", "pushProps", "reducer", "Lkotlin/Function1;", "Lcom/kubi/rn/kline/KlineFlutterStageViewManager$PropsState;", "PropsState", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineFlutterStageViewManager extends SimpleViewManager<KlineFlutterStageHostView> {

    @NotNull
    private static final String TAG = "KlineStageViewManager";

    @NotNull
    private static final SparseArray<PropsState> propsStore = new SparseArray<>();

    /* JADX INFO: renamed from: com.kubi.rn.kline.KlineFlutterStageViewManager$a, reason: from toString */
    /* JADX INFO: compiled from: KlineFlutterStageViewManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterStageViewManager$PropsState;", "", "symbol", "", "klineType", "leverTradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getKlineType", "getLeverTradeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PropsState {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String klineType;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String leverTradeType;

        public PropsState() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropsState)) {
                return false;
            }
            PropsState propsState = (PropsState) other;
            return Intrinsics.areEqual(this.symbol, propsState.symbol) && Intrinsics.areEqual(this.klineType, propsState.klineType) && Intrinsics.areEqual(this.leverTradeType, propsState.leverTradeType);
        }

        public PropsState(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.symbol = str;
            this.klineType = str2;
            this.leverTradeType = str3;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ PropsState m56047b(PropsState propsState, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = propsState.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = propsState.klineType;
            }
            if ((i11 & 4) != 0) {
                str3 = propsState.leverTradeType;
            }
            return propsState.m56048a(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final PropsState m56048a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new PropsState(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getKlineType() {
            return this.klineType;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLeverTradeType() {
            return this.leverTradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.klineType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.leverTradeType;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PropsState(symbol=" + this.symbol + ", klineType=" + this.klineType + ", leverTradeType=" + this.leverTradeType + ')';
        }

        public /* synthetic */ PropsState(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setKlineType$lambda$1(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56047b(current, null, str, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setLeverTradeType$lambda$2(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56047b(current, null, null, str, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropsState setSymbol$lambda$0(String str, PropsState current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return PropsState.m56047b(current, str, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KlineFlutterStageHostView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KlineFlutterStageHostView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return KlineFlutterStageConstants.NATIVE_VIEW_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull KlineFlutterStageHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        propsStore.remove(view.getId());
        super.onDropViewInstance(view);
    }

    @ReactProp(name = "klineType")
    public final void setKlineType(@NotNull KlineFlutterStageHostView view, @Nullable final String klineType) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterStageViewManager.setKlineType$lambda$1(klineType, (KlineFlutterStageViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "leverTradeType")
    public final void setLeverTradeType(@NotNull KlineFlutterStageHostView view, @Nullable final String leverTradeType) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterStageViewManager.setLeverTradeType$lambda$2(leverTradeType, (KlineFlutterStageViewManager.PropsState) obj);
            }
        });
    }

    @ReactProp(name = "symbol")
    public final void setSymbol(@NotNull KlineFlutterStageHostView view, @Nullable final String symbol) {
        Intrinsics.checkNotNullParameter(view, "view");
        pushProps(view, new Function1() { // from class: com.kubi.rn.kline.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineFlutterStageViewManager.setSymbol$lambda$0(symbol, (KlineFlutterStageViewManager.PropsState) obj);
            }
        });
    }

    private final void pushProps(KlineFlutterStageHostView view, Function1<? super PropsState, PropsState> reducer) {
        int id2 = view.getId();
        SparseArray<PropsState> sparseArray = propsStore;
        PropsState propsState = sparseArray.get(id2);
        if (propsState == null) {
            propsState = new PropsState(null, null, null, 7, null);
        }
        PropsState propsStateInvoke = reducer.invoke(propsState);
        sparseArray.put(id2, propsStateInvoke);
        C44128b.m97259c(TAG, "pushProps tag=" + id2 + " symbol=" + propsStateInvoke.getSymbol() + " klineType=" + propsStateInvoke.getKlineType() + " leverTradeType=" + propsStateInvoke.getLeverTradeType());
        view.updateProps(propsStateInvoke.getSymbol(), propsStateInvoke.getKlineType(), propsStateInvoke.getLeverTradeType());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().build();
    }
}

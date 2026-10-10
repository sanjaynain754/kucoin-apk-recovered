package com.kubi.flutter.widget.kline;

import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5287o0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.flutter.proto.kline.CandleViewConfig;
import com.kubi.flutter.proto.kline.CandleViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.ChartSetupConfig;
import com.kubi.flutter.proto.kline.ChartSetupConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SwitchType;
import com.kubi.flutter.widget.R$color;
import com.kubi.host.HostManager;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.utils.DataMapUtil;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineSetting.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0011H\u0002J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineSetting;", "", "<init>", "()V", "listeners", "Ljava/util/WeakHashMap;", "", "Lcom/kubi/flutter/widget/kline/KLineSetting$ISettingUpdateListener;", "addListener", "", "key", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener$LKLineWidget_googleRelease", "removeListener", "removeListener$LKLineWidget_googleRelease", "getKlineRemarkUrl", "toColorValue", "", "getSetupConfig", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "getSetupConfig$LKLineWidget_googleRelease", "updateSetting", "config", "ISettingUpdateListener", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineSetting.kt\ncom/kubi/flutter/widget/kline/KLineSetting\n+ 2 ChartSetupConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartSetupConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CandleViewConfigKt.kt\ncom/kubi/flutter/proto/kline/CandleViewConfigKtKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n8#2:112\n1#3:113\n1#3:115\n8#4:114\n1869#5,2:116\n*S KotlinDebug\n*F\n+ 1 KLineSetting.kt\ncom/kubi/flutter/widget/kline/KLineSetting\n*L\n56#1:112\n56#1:113\n57#1:115\n57#1:114\n109#1:116,2\n*E\n"})
public final class KLineSetting {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineSetting f22480a = new KLineSetting();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final WeakHashMap<String, a> f22481b = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.o$a */
    /* JADX INFO: compiled from: KLineSetting.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineSetting$ISettingUpdateListener;", "", "onUpdateSetupConfig", "", "config", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    public final void m24361a(@NotNull String key, @NotNull a listener) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(listener, "listener");
        WeakHashMap<String, a> weakHashMap = f22481b;
        synchronized (weakHashMap) {
            weakHashMap.put(key, listener);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m24362b() {
        return "www." + HostManager.a.b();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ChartSetupConfig m24363c() {
        boolean z11 = DataMapUtil.m66367d(DataMapUtil.f54245a, KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 2, null) == 0;
        ChartSetupConfigKt$Dsl.Companion companion = ChartSetupConfigKt$Dsl.f22091b;
        ChartSetupConfig.C12652b c12652bNewBuilder = ChartSetupConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12652bNewBuilder, "newBuilder(...)");
        ChartSetupConfigKt$Dsl chartSetupConfigKt$Dsl_create = companion._create(c12652bNewBuilder);
        CandleViewConfigKt$Dsl.Companion companion2 = CandleViewConfigKt$Dsl.f22082b;
        CandleViewConfig.C12646b c12646bNewBuilder = CandleViewConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12646bNewBuilder, "newBuilder(...)");
        CandleViewConfigKt$Dsl candleViewConfigKt$Dsl_create = companion2._create(c12646bNewBuilder);
        candleViewConfigKt$Dsl_create.m23926d(SwitchType.OFF);
        KLineSetting kLineSetting = f22480a;
        candleViewConfigKt$Dsl_create.m23927e(kLineSetting.m24362b());
        candleViewConfigKt$Dsl_create.m23924b(kLineSetting.m24365e(z11 ? R$color.primary : R$color.secondary));
        candleViewConfigKt$Dsl_create.m23925c(kLineSetting.m24365e(z11 ? R$color.secondary : R$color.primary));
        chartSetupConfigKt$Dsl_create.m23935b(candleViewConfigKt$Dsl_create.m23923a());
        return chartSetupConfigKt$Dsl_create.m23934a();
    }

    /* JADX INFO: renamed from: d */
    public final void m24364d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        WeakHashMap<String, a> weakHashMap = f22481b;
        synchronized (weakHashMap) {
            weakHashMap.remove(key);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m24365e(int i11) {
        return ContextCompat.getColor(C5287o0.m6331a(), i11);
    }
}

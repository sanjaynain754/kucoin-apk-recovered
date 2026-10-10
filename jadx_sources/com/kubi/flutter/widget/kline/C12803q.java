package com.kubi.flutter.widget.kline;

import android.app.Activity;
import android.content.Intent;
import gf.C37878b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.q */
/* JADX INFO: compiled from: KlineExtension.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"FLUTTER_KLINE_USER_FLUTTER_CONFIG", "", "FLUTTER_KLINE_USER_CUR_SYMBOL", "FLUTTER_KLINE_TYPE", "isKlineUseFlutterConfig", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "getKlineSymbol", "getKlineType", "configFlutterKlineIntent", "", "intent", "Landroid/content/Intent;", "symbol", "klineType", "LKLineWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12803q {
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Boolean m24372d(@Nullable Activity activity) {
        Intent intent;
        boolean z11 = false;
        Boolean boolValueOf = (activity == null || (intent = activity.getIntent()) == null) ? null : Boolean.valueOf(intent.getBooleanExtra("FlutterKlineSettingConfig", false));
        boolean zM85529j = C37878b0.f85252a.m85529j();
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && zM85529j) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: a */
    public static final void m24369a(@NotNull Intent intent, @NotNull String symbol, @NotNull String klineType) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        intent.putExtra("FlutterKlineSettingConfig", true);
        intent.putExtra("FlutterKline", symbol);
        intent.putExtra("FLUTTER_KLINE_TYPE", klineType);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m24370b(@Nullable Activity activity) {
        Intent intent;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("FlutterKline");
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m24371c(@Nullable Activity activity) {
        Intent intent;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("FLUTTER_KLINE_TYPE");
    }
}

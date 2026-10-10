package com.facebook.react.modules.i18nmanager;

import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: I18nManagerModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "I18nManager")
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;", "Lcom/facebook/fbreact/specs/NativeI18nManagerSpec;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "allowRTL", "", "value", "", "forceRTL", "swapLeftAndRightInRTL", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class I18nManagerModule extends NativeI18nManagerSpec {

    @NotNull
    public static final String NAME = "I18nManager";

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean value) {
        I18nUtil companion = I18nUtil.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.allowRTL(reactApplicationContext, value);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean value) {
        I18nUtil companion = I18nUtil.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.forceRTL(reactApplicationContext, value);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean value) {
        I18nUtil companion = I18nUtil.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.swapLeftAndRightInRTL(reactApplicationContext, value);
    }

    public I18nManagerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Locale locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        I18nUtil.Companion companion = I18nUtil.INSTANCE;
        I18nUtil companion2 = companion.getInstance();
        Intrinsics.checkNotNull(reactApplicationContext);
        return MapsKt.mapOf(TuplesKt.m90091to("isRTL", Boolean.valueOf(companion2.isRTL(reactApplicationContext))), TuplesKt.m90091to("doLeftAndRightSwapInRTL", Boolean.valueOf(companion.getInstance().doLeftAndRightSwapInRTL(reactApplicationContext))), TuplesKt.m90091to("localeIdentifier", locale.toString()));
    }
}

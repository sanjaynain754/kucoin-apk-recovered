package com.facebook.react.uimanager;

import com.facebook.yoga.YogaErrata;
import org.jetbrains.annotations.NotNull;
import p193d7.AbstractC36629b;
import p193d7.AbstractC36630c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactYogaConfigProvider.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/uimanager/ReactYogaConfigProvider;", "", "<init>", "()V", "Ld7/b;", "get", "()Ld7/b;", "yogaConfig$delegate", "Lkotlin/Lazy;", "getYogaConfig", "yogaConfig", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactYogaConfigProvider {

    @NotNull
    public static final ReactYogaConfigProvider INSTANCE = new ReactYogaConfigProvider();

    /* JADX INFO: renamed from: yogaConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy yogaConfig = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.facebook.react.uimanager.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReactYogaConfigProvider.yogaConfig_delegate$lambda$0();
        }
    });

    @JvmStatic
    @NotNull
    public static final AbstractC36629b get() {
        return INSTANCE.getYogaConfig();
    }

    private final AbstractC36629b getYogaConfig() {
        Object value = yogaConfig.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AbstractC36629b) value;
    }

    private ReactYogaConfigProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC36629b yogaConfig_delegate$lambda$0() {
        AbstractC36629b abstractC36629bM81963a = AbstractC36630c.m81963a();
        abstractC36629bM81963a.mo81962b(0.0f);
        abstractC36629bM81963a.mo81961a(YogaErrata.ALL);
        return abstractC36629bM81963a;
    }
}

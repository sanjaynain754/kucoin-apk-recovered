package com.kubi.p110rn.config;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.utils.C27099x;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RnWhitePageCheckConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/config/RnWhitePageCheckConfig;", "", "<init>", "()V", "CONFIG_NAME", "", "value", "", "isEnable", "()Z", "", "delay", "getDelay", "()J", "", "thresholdRate", "getThresholdRate", "()F", "load", "", "load$BReactNativeLib_googleRelease", "WhitePageConfig", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnWhitePageCheckConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnWhitePageCheckConfig.kt\ncom/kubi/rn/config/RnWhitePageCheckConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,37:1\n35#2,4:38\n39#2:44\n44#3,2:42\n35#4,3:45\n*S KotlinDebug\n*F\n+ 1 RnWhitePageCheckConfig.kt\ncom/kubi/rn/config/RnWhitePageCheckConfig\n*L\n29#1:38,4\n29#1:44\n29#1:42,2\n30#1:45,3\n*E\n"})
public final class RnWhitePageCheckConfig {

    @NotNull
    private static final String CONFIG_NAME = "krn_white_page_config";

    @NotNull
    public static final RnWhitePageCheckConfig INSTANCE = new RnWhitePageCheckConfig();
    private static boolean isEnable = C45590s.f102687a.m100666Q();
    private static long delay = 5000;
    private static float thresholdRate = 95.0f;

    /* JADX INFO: compiled from: RnWhitePageCheckConfig.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "threshold", "", "delay", "", "<init>", "(ZFJ)V", "getEnable", "()Z", "getThreshold", "()F", "getDelay", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class WhitePageConfig {
        private final long delay;
        private final boolean enable;
        private final float threshold;

        public WhitePageConfig() {
            this(false, 0.0f, 0L, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhitePageConfig)) {
                return false;
            }
            WhitePageConfig whitePageConfig = (WhitePageConfig) other;
            return this.enable == whitePageConfig.enable && Float.compare(this.threshold, whitePageConfig.threshold) == 0 && this.delay == whitePageConfig.delay;
        }

        public WhitePageConfig(boolean z11, float f11, long j11) {
            this.enable = z11;
            this.threshold = f11;
            this.delay = j11;
        }

        public static /* synthetic */ WhitePageConfig copy$default(WhitePageConfig whitePageConfig, boolean z11, float f11, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = whitePageConfig.enable;
            }
            if ((i11 & 2) != 0) {
                f11 = whitePageConfig.threshold;
            }
            if ((i11 & 4) != 0) {
                j11 = whitePageConfig.delay;
            }
            return whitePageConfig.copy(z11, f11, j11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnable() {
            return this.enable;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getThreshold() {
            return this.threshold;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDelay() {
            return this.delay;
        }

        @NotNull
        public final WhitePageConfig copy(boolean enable, float threshold, long delay) {
            return new WhitePageConfig(enable, threshold, delay);
        }

        public final long getDelay() {
            return this.delay;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final float getThreshold() {
            return this.threshold;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.enable) * 31) + Float.hashCode(this.threshold)) * 31) + Long.hashCode(this.delay);
        }

        @NotNull
        public String toString() {
            return "WhitePageConfig(enable=" + this.enable + ", threshold=" + this.threshold + ", delay=" + this.delay + ')';
        }

        public /* synthetic */ WhitePageConfig(boolean z11, float f11, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 0.95f : f11, (i11 & 4) != 0 ? 5000L : j11);
        }
    }

    public final long getDelay() {
        return delay;
    }

    public final float getThresholdRate() {
        return thresholdRate;
    }

    public final boolean isEnable() {
        return isEnable;
    }

    public final void load$BReactNativeLib_googleRelease() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<WhitePageConfig>() { // from class: com.kubi.rn.config.RnWhitePageCheckConfig$load$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a(CONFIG_NAME, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        WhitePageConfig whitePageConfig = (WhitePageConfig) objM20457a;
        if (whitePageConfig == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("load rn white page config: ");
        String strM66919i = C27099x.m66919i(whitePageConfig, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        sb2.append(strM66919i);
        C44128b.m97266j("RnWhitePageCheckConfig", sb2.toString());
        float threshold = whitePageConfig.getThreshold() * 100;
        if (whitePageConfig.getDelay() <= 0) {
            return;
        }
        isEnable = whitePageConfig.getEnable();
        delay = whitePageConfig.getDelay();
        thresholdRate = threshold;
    }

    private RnWhitePageCheckConfig() {
    }
}

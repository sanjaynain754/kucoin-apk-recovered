package com.kubi.widget.web.helper;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.widget.web.startup.PreparedConfig;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45977b;

/* JADX INFO: compiled from: WhitePageCheckHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0002\b\u0014J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0014J\u001b\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0002\b\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/widget/web/helper/WhitePageCheckHelper;", "", "<init>", "()V", "CONFIG_NAME", "", "value", "", "isEnable", "()Z", "", "delay", "getDelay", "()J", "load", "", "load$LWebWidget_googleRelease", "prepare", "Lcom/kubi/widget/web/startup/PreparedConfig;", "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;", "prepare$LWebWidget_googleRelease", "config", "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;", "apply", "prepared", "apply$LWebWidget_googleRelease", "WhitePageConfig", "PreparedWhitePageConfig", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWhitePageCheckHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhitePageCheckHelper.kt\ncom/kubi/widget/web/helper/WhitePageCheckHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,64:1\n35#2,4:65\n39#2:71\n44#3,2:69\n*S KotlinDebug\n*F\n+ 1 WhitePageCheckHelper.kt\ncom/kubi/widget/web/helper/WhitePageCheckHelper\n*L\n40#1:65,4\n40#1:71\n40#1:69,2\n*E\n"})
public final class WhitePageCheckHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WhitePageCheckHelper f55155a = new WhitePageCheckHelper();

    /* JADX INFO: renamed from: b */
    public static boolean f55156b = C45590s.f102687a.m100666Q();

    /* JADX INFO: renamed from: c */
    public static long f55157c = 5000;

    /* JADX INFO: compiled from: WhitePageCheckHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "threshold", "", "delay", "", "<init>", "(ZFJ)V", "getEnable", "()Z", "getThreshold", "()F", "getDelay", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

    /* JADX INFO: renamed from: com.kubi.widget.web.helper.WhitePageCheckHelper$a, reason: from toString */
    /* JADX INFO: compiled from: WhitePageCheckHelper.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "thresholdRate", "", "delay", "", "<init>", "(ZFJ)V", "getEnable", "()Z", "getThresholdRate", "()F", "getDelay", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PreparedWhitePageConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean enable;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final float thresholdRate;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long delay;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreparedWhitePageConfig)) {
                return false;
            }
            PreparedWhitePageConfig preparedWhitePageConfig = (PreparedWhitePageConfig) other;
            return this.enable == preparedWhitePageConfig.enable && Float.compare(this.thresholdRate, preparedWhitePageConfig.thresholdRate) == 0 && this.delay == preparedWhitePageConfig.delay;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDelay() {
            return this.delay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnable() {
            return this.enable;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getThresholdRate() {
            return this.thresholdRate;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.enable) * 31) + Float.hashCode(this.thresholdRate)) * 31) + Long.hashCode(this.delay);
        }

        @NotNull
        public String toString() {
            return "PreparedWhitePageConfig(enable=" + this.enable + ", thresholdRate=" + this.thresholdRate + ", delay=" + this.delay + ')';
        }

        public PreparedWhitePageConfig(boolean z11, float f11, long j11) {
            this.enable = z11;
            this.thresholdRate = f11;
            this.delay = j11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.helper.WhitePageCheckHelper$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27163b extends TypeToken<WhitePageConfig> {
    }

    /* JADX INFO: renamed from: b */
    public final long m67288b() {
        return f55157c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67289c() {
        return f55156b;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final PreparedConfig<PreparedWhitePageConfig> m67292f(@Nullable WhitePageConfig whitePageConfig) {
        if (whitePageConfig == null) {
            return PreparedConfig.b.f55253a;
        }
        return whitePageConfig.getDelay() <= 0 ? PreparedConfig.b.f55253a : new PreparedConfig.Value(new PreparedWhitePageConfig(whitePageConfig.getEnable(), whitePageConfig.getThreshold() * 100, whitePageConfig.getDelay()));
    }

    /* JADX INFO: renamed from: a */
    public final void m67287a(@NotNull PreparedConfig<PreparedWhitePageConfig> prepared) throws Throwable {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        if (prepared instanceof PreparedConfig.Value) {
            PreparedConfig.Value value = (PreparedConfig.Value) prepared;
            f55156b = ((PreparedWhitePageConfig) value.m67410a()).getEnable();
            f55157c = ((PreparedWhitePageConfig) value.m67410a()).getDelay();
            C45977b.f103426a.m101430p(((PreparedWhitePageConfig) value.m67410a()).getThresholdRate(), ((PreparedWhitePageConfig) value.m67410a()).getDelay());
            return;
        }
        if (!Intrinsics.areEqual(prepared, PreparedConfig.b.f55253a)) {
            if (prepared instanceof PreparedConfig.Error) {
                throw ((PreparedConfig.Error) prepared).getThrowable();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m67290d() throws Throwable {
        m67287a(m67291e());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final PreparedConfig<PreparedWhitePageConfig> m67291e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27163b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("web_white_page_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return m67292f((WhitePageConfig) objM20457a);
    }
}

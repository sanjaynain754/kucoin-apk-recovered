package com.kubi.widget.web.abtest;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WebKnbABTestHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;", "", "<init>", "()V", "config", "Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;", "getConfig", "()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;", "config$delegate", "Lkotlin/Lazy;", "isEnableMessageQueue", "", "ABTestConfig", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebKnbABTestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebKnbABTestHelper.kt\ncom/kubi/widget/web/abtest/WebKnbABTestHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,29:1\n35#2,4:30\n39#2:36\n44#3,2:34\n*S KotlinDebug\n*F\n+ 1 WebKnbABTestHelper.kt\ncom/kubi/widget/web/abtest/WebKnbABTestHelper\n*L\n23#1:30,4\n23#1:36\n23#1:34,2\n*E\n"})
public final class WebKnbABTestHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebKnbABTestHelper f55056a = new WebKnbABTestHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f55057b = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.abtest.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebKnbABTestHelper.m67080b();
        }
    });

    /* JADX INFO: compiled from: WebKnbABTestHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;", "", "queue", "", "<init>", "(Z)V", "getQueue", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ABTestConfig {

        @SerializedName("message-queue")
        private final boolean queue;

        public ABTestConfig() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ABTestConfig) && this.queue == ((ABTestConfig) other).queue;
        }

        public ABTestConfig(boolean z11) {
            this.queue = z11;
        }

        public static /* synthetic */ ABTestConfig copy$default(ABTestConfig aBTestConfig, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = aBTestConfig.queue;
            }
            return aBTestConfig.copy(z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getQueue() {
            return this.queue;
        }

        @NotNull
        public final ABTestConfig copy(boolean queue) {
            return new ABTestConfig(queue);
        }

        public final boolean getQueue() {
            return this.queue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.queue);
        }

        @NotNull
        public String toString() {
            return "ABTestConfig(queue=" + this.queue + ')';
        }

        public /* synthetic */ ABTestConfig(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? C45590s.f102687a.m100666Q() : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.abtest.WebKnbABTestHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27128a extends TypeToken<ABTestConfig> {
    }

    /* JADX INFO: renamed from: b */
    public static final ABTestConfig m67080b() {
        Object objM20457a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27128a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("h5_knb_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        ABTestConfig aBTestConfig = (ABTestConfig) objM20457a;
        return aBTestConfig == null ? new ABTestConfig(false, 1, defaultConstructorMarker) : aBTestConfig;
    }

    /* JADX INFO: renamed from: c */
    public final ABTestConfig m67081c() {
        return (ABTestConfig) f55057b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67082d() {
        return m67081c().getQueue();
    }
}

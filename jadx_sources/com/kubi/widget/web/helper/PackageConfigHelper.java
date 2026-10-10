package com.kubi.widget.web.helper;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PackageConfigHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/widget/web/helper/PackageConfigHelper;", "", "<init>", "()V", "TASK_LIMIT_DEF", "", "CONFIG_KEY", "", "setting", "Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;", "getSetting", "()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;", "setting$delegate", "Lkotlin/Lazy;", "bundleTaskLimit", "getBundleTaskLimit", "()I", "offlineTaskLimit", "getOfflineTaskLimit", "RemoteSetting", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPackageConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageConfigHelper.kt\ncom/kubi/widget/web/helper/PackageConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,34:1\n35#2,4:35\n39#2:41\n44#3,2:39\n*S KotlinDebug\n*F\n+ 1 PackageConfigHelper.kt\ncom/kubi/widget/web/helper/PackageConfigHelper\n*L\n14#1:35,4\n14#1:41\n14#1:39,2\n*E\n"})
public final class PackageConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PackageConfigHelper f55151a = new PackageConfigHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f55152b = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.helper.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PackageConfigHelper.m67269e();
        }
    });

    /* JADX INFO: compiled from: PackageConfigHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;", "", "offlineTaskLimit", "", "bundleTaskLimit", "<init>", "(II)V", "getOfflineTaskLimit", "()I", "getBundleTaskLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RemoteSetting {
        private final int bundleTaskLimit;
        private final int offlineTaskLimit;

        /* JADX WARN: Illegal instructions before constructor call */
        public RemoteSetting() {
            int i11 = 0;
            this(i11, i11, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteSetting)) {
                return false;
            }
            RemoteSetting remoteSetting = (RemoteSetting) other;
            return this.offlineTaskLimit == remoteSetting.offlineTaskLimit && this.bundleTaskLimit == remoteSetting.bundleTaskLimit;
        }

        public RemoteSetting(int i11, int i12) {
            this.offlineTaskLimit = i11;
            this.bundleTaskLimit = i12;
        }

        public static /* synthetic */ RemoteSetting copy$default(RemoteSetting remoteSetting, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = remoteSetting.offlineTaskLimit;
            }
            if ((i13 & 2) != 0) {
                i12 = remoteSetting.bundleTaskLimit;
            }
            return remoteSetting.copy(i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getOfflineTaskLimit() {
            return this.offlineTaskLimit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBundleTaskLimit() {
            return this.bundleTaskLimit;
        }

        @NotNull
        public final RemoteSetting copy(int offlineTaskLimit, int bundleTaskLimit) {
            return new RemoteSetting(offlineTaskLimit, bundleTaskLimit);
        }

        public final int getBundleTaskLimit() {
            return this.bundleTaskLimit;
        }

        public final int getOfflineTaskLimit() {
            return this.offlineTaskLimit;
        }

        public int hashCode() {
            return (Integer.hashCode(this.offlineTaskLimit) * 31) + Integer.hashCode(this.bundleTaskLimit);
        }

        @NotNull
        public String toString() {
            return "RemoteSetting(offlineTaskLimit=" + this.offlineTaskLimit + ", bundleTaskLimit=" + this.bundleTaskLimit + ')';
        }

        public /* synthetic */ RemoteSetting(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 5 : i11, (i13 & 2) != 0 ? 5 : i12);
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.helper.PackageConfigHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27160a extends TypeToken<RemoteSetting> {
    }

    /* JADX INFO: renamed from: d */
    public final RemoteSetting m67272d() {
        return (RemoteSetting) f55152b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final RemoteSetting m67269e() {
        Object objM20457a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27160a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("pkg_setting_android", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        RemoteSetting remoteSetting = (RemoteSetting) objM20457a;
        if (remoteSetting == null) {
            int i11 = 0;
            return new RemoteSetting(i11, i11, 3, defaultConstructorMarker);
        }
        return remoteSetting;
    }

    /* JADX INFO: renamed from: b */
    public final int m67270b() {
        return m67272d().getBundleTaskLimit();
    }

    /* JADX INFO: renamed from: c */
    public final int m67271c() {
        return m67272d().getOfflineTaskLimit();
    }
}

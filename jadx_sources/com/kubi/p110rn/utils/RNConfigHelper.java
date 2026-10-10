package com.kubi.p110rn.utils;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.p110rn.utils.RNConfigHelper;
import com.kubi.sdk.pkg.bundle.BundleManager;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: RNConfigHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u0082\bJ\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/rn/utils/RNConfigHelper;", "", "<init>", "()V", "TAG", "", "getHost", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getConfigUrls", "", "bindConfigUpdate", "", "initConfig", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/content/Context;", "BundlesConfig", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNConfigHelper.kt\ncom/kubi/rn/utils/RNConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n25#1:75\n25#1:76\n35#2,4:65\n39#2:71\n44#3,2:69\n1563#4:72\n1634#4,2:73\n1636#4:77\n*S KotlinDebug\n*F\n+ 1 RNConfigHelper.kt\ncom/kubi/rn/utils/RNConfigHelper\n*L\n38#1:75\n39#1:76\n33#1:65,4\n33#1:71\n33#1:69,2\n35#1:72\n35#1:73,2\n35#1:77\n*E\n"})
public final class RNConfigHelper {

    @NotNull
    private static final String TAG = "RNConfigHelper";

    @NotNull
    public static final RNConfigHelper INSTANCE = new RNConfigHelper();

    @NotNull
    private static final CompositeDisposable compositeDisposable = new CompositeDisposable();

    /* JADX INFO: renamed from: com.kubi.rn.utils.RNConfigHelper$a, reason: from toString */
    /* JADX INFO: compiled from: RNConfigHelper.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/rn/utils/RNConfigHelper$BundlesConfig;", "", "pathList", "", "", "<init>", "(Ljava/util/List;)V", "getPathList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BundlesConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        @SerializedName("android")
        @NotNull
        public final List<String> pathList;

        /* JADX WARN: Multi-variable type inference failed */
        public BundlesConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BundlesConfig) && Intrinsics.areEqual(this.pathList, ((BundlesConfig) other).pathList);
        }

        public BundlesConfig(@NotNull List<String> pathList) {
            Intrinsics.checkNotNullParameter(pathList, "pathList");
            this.pathList = pathList;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m56156a() {
            return this.pathList;
        }

        public int hashCode() {
            return this.pathList.hashCode();
        }

        @NotNull
        public String toString() {
            return "BundlesConfig(pathList=" + this.pathList + ')';
        }

        public /* synthetic */ BundlesConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    private final void bindConfigUpdate() {
        CompositeDisposable compositeDisposable2 = compositeDisposable;
        compositeDisposable2.clear();
        Observable<Boolean> observableM20460e = RemoteConfig.m20460e();
        final Function1 function1 = new Function1() { // from class: sx.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RNConfigHelper.bindConfigUpdate$lambda$1((Boolean) obj));
            }
        };
        Observable<Boolean> observableObserveOn = observableM20460e.filter(new Predicate() { // from class: sx.b
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return RNConfigHelper.bindConfigUpdate$lambda$2(function1, obj);
            }
        }).observeOn(Schedulers.m87969io());
        final Function1 function2 = new Function1() { // from class: sx.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RNConfigHelper.bindConfigUpdate$lambda$3((Boolean) obj);
            }
        };
        compositeDisposable2.add(observableObserveOn.subscribe(new Consumer() { // from class: sx.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindConfigUpdate$lambda$1(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindConfigUpdate$lambda$2(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindConfigUpdate$lambda$3(Boolean bool) {
        List<String> configUrls = INSTANCE.getConfigUrls();
        if (configUrls == null) {
            return Unit.INSTANCE;
        }
        BundleManager.f47277a.m57486a0(configUrls);
        C44128b.m97266j(TAG, " BundleManager.updateConfig " + configUrls);
        return Unit.INSTANCE;
    }

    private final List<String> getConfigUrls() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<BundlesConfig>() { // from class: com.kubi.rn.utils.RNConfigHelper$getConfigUrls$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("krn_v3_bundles", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        BundlesConfig bundlesConfig = (BundlesConfig) objM20457a;
        if (bundlesConfig == null) {
            return null;
        }
        List<String> listM56156a = bundlesConfig.m56156a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM56156a, 10));
        for (String str : listM56156a) {
            if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                str = StringsKt.startsWith$default(str, "/", false, 2, (Object) null) ? HostManager.a.m() + str : HostManager.a.m() + '/' + str;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    private final String getHost() {
        return HostManager.a.m();
    }

    public final void initConfig(@NotNull Context application) {
        Intrinsics.checkNotNullParameter(application, "application");
        List<String> configUrls = getConfigUrls();
        if (configUrls == null) {
            configUrls = CollectionsKt.emptyList();
        }
        BundleManager.f47277a.m57477Q(application, configUrls);
        C44128b.m97266j(TAG, " BundleManager.initConfig " + configUrls);
        bindConfigUpdate();
    }

    private RNConfigHelper() {
    }
}

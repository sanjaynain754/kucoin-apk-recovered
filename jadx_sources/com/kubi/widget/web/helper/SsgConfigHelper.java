package com.kubi.widget.web.helper;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.Constants;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.startup.PreparedConfig;
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
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import x00.C45977b;
import x00.C45979d;

/* JADX INFO: compiled from: SsgConfigHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002J\u0019\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0000¢\u0006\u0002\b\u000fJ)\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J!\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/helper/SsgConfigHelper;", "", "<init>", "()V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "init", "", "loadConfig", "prepareCatching", "Lcom/kubi/widget/web/startup/PreparedConfig;", "", "Lcom/kubi/sdk/web/config/WebSsgInfo;", "prepareCatching$LWebWidget_googleRelease", "prepare", "config", "Lcom/kubi/widget/web/helper/SsgConfigHelper$SsgConfigInfo;", "prepare$LWebWidget_googleRelease", "applyCatching", "prepared", "applyCatching$LWebWidget_googleRelease", "listenConfigChange", "listenConfigChange$LWebWidget_googleRelease", "SsgConfigInfo", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSsgConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SsgConfigHelper.kt\ncom/kubi/widget/web/helper/SsgConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,97:1\n35#2,4:98\n39#2:104\n44#3,2:102\n827#4:105\n855#4,2:106\n1374#4:108\n1460#4,2:109\n1563#4:111\n1634#4,3:112\n1462#4,3:115\n46#5,6:118\n*S KotlinDebug\n*F\n+ 1 SsgConfigHelper.kt\ncom/kubi/widget/web/helper/SsgConfigHelper\n*L\n45#1:98,4\n45#1:104\n45#1:102,2\n52#1:105\n52#1:106,2\n53#1:108\n53#1:109,2\n54#1:111\n54#1:112,3\n53#1:115,3\n74#1:118,6\n*E\n"})
public final class SsgConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SsgConfigHelper f55153a = new SsgConfigHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CompositeDisposable f55154b = new CompositeDisposable();

    /* JADX INFO: compiled from: SsgConfigHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/widget/web/helper/SsgConfigHelper$SsgConfigInfo;", "", Constants.BIZ, "", "matchPaths", "", "preFetchPaths", "supportTheme", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "getBiz", "()Ljava/lang/String;", "getMatchPaths", "()Ljava/util/List;", "getPreFetchPaths", "getSupportTheme", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SsgConfigInfo {

        @Nullable
        private final String biz;

        @SerializedName("matchPath")
        @NotNull
        private final List<String> matchPaths;

        @SerializedName("preFetch")
        @NotNull
        private final List<String> preFetchPaths;
        private final boolean supportTheme;

        public SsgConfigInfo() {
            this(null, null, null, false, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SsgConfigInfo)) {
                return false;
            }
            SsgConfigInfo ssgConfigInfo = (SsgConfigInfo) other;
            return Intrinsics.areEqual(this.biz, ssgConfigInfo.biz) && Intrinsics.areEqual(this.matchPaths, ssgConfigInfo.matchPaths) && Intrinsics.areEqual(this.preFetchPaths, ssgConfigInfo.preFetchPaths) && this.supportTheme == ssgConfigInfo.supportTheme;
        }

        public SsgConfigInfo(@Nullable String str, @NotNull List<String> matchPaths, @NotNull List<String> preFetchPaths, boolean z11) {
            Intrinsics.checkNotNullParameter(matchPaths, "matchPaths");
            Intrinsics.checkNotNullParameter(preFetchPaths, "preFetchPaths");
            this.biz = str;
            this.matchPaths = matchPaths;
            this.preFetchPaths = preFetchPaths;
            this.supportTheme = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SsgConfigInfo copy$default(SsgConfigInfo ssgConfigInfo, String str, List list, List list2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ssgConfigInfo.biz;
            }
            if ((i11 & 2) != 0) {
                list = ssgConfigInfo.matchPaths;
            }
            if ((i11 & 4) != 0) {
                list2 = ssgConfigInfo.preFetchPaths;
            }
            if ((i11 & 8) != 0) {
                z11 = ssgConfigInfo.supportTheme;
            }
            return ssgConfigInfo.copy(str, list, list2, z11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        public final List<String> component2() {
            return this.matchPaths;
        }

        @NotNull
        public final List<String> component3() {
            return this.preFetchPaths;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSupportTheme() {
            return this.supportTheme;
        }

        @Nullable
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        public final List<String> getMatchPaths() {
            return this.matchPaths;
        }

        @NotNull
        public final List<String> getPreFetchPaths() {
            return this.preFetchPaths;
        }

        public final boolean getSupportTheme() {
            return this.supportTheme;
        }

        public int hashCode() {
            String str = this.biz;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.matchPaths.hashCode()) * 31) + this.preFetchPaths.hashCode()) * 31) + Boolean.hashCode(this.supportTheme);
        }

        @NotNull
        public String toString() {
            return "SsgConfigInfo(biz=" + this.biz + ", matchPaths=" + this.matchPaths + ", preFetchPaths=" + this.preFetchPaths + ", supportTheme=" + this.supportTheme + ')';
        }

        @NotNull
        public final SsgConfigInfo copy(@Nullable String biz, @NotNull List<String> matchPaths, @NotNull List<String> preFetchPaths, boolean supportTheme) {
            Intrinsics.checkNotNullParameter(matchPaths, "matchPaths");
            Intrinsics.checkNotNullParameter(preFetchPaths, "preFetchPaths");
            return new SsgConfigInfo(biz, matchPaths, preFetchPaths, supportTheme);
        }

        public /* synthetic */ SsgConfigInfo(String str, List list, List list2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 8) != 0 ? true : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.helper.SsgConfigHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27161a extends TypeToken<List<? extends SsgConfigInfo>> {
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m67277h(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m67279j(Boolean bool) {
        f55153a.m67284l();
        C44128b.m97266j("SsgConfigHelper", "configChange");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m67283g() {
        CompositeDisposable compositeDisposable = f55154b;
        compositeDisposable.clear();
        Observable<Boolean> observableM20460e = RemoteConfig.m20460e();
        final Function1 function1 = new Function1() { // from class: com.kubi.widget.web.helper.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SsgConfigHelper.m67277h((Boolean) obj));
            }
        };
        Observable<Boolean> observableObserveOn = observableM20460e.filter(new Predicate() { // from class: com.kubi.widget.web.helper.q
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SsgConfigHelper.m67278i(function1, obj);
            }
        }).observeOn(Schedulers.m87969io());
        final Function1 function2 = new Function1() { // from class: com.kubi.widget.web.helper.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsgConfigHelper.m67279j((Boolean) obj);
            }
        };
        compositeDisposable.add(observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.widget.web.helper.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SsgConfigHelper.m67280k(function2, obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final PreparedConfig<List<C45979d>> m67285m(@Nullable List<SsgConfigInfo> list) {
        if (list == null) {
            return PreparedConfig.b.f55253a;
        }
        ArrayList<SsgConfigInfo> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SsgConfigInfo) obj).getBiz() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (SsgConfigInfo ssgConfigInfo : arrayList) {
            List<String> matchPaths = ssgConfigInfo.getMatchPaths();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(matchPaths, 10));
            for (String str : matchPaths) {
                arrayList3.add(new C45979d(str, ssgConfigInfo.getBiz(), ssgConfigInfo.getPreFetchPaths().contains(str), ssgConfigInfo.getSupportTheme()));
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        return new PreparedConfig.Value(CollectionsKt.toList(arrayList2));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final PreparedConfig<List<C45979d>> m67286n() {
        Object objM20457a;
        try {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C27161a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("h5_ssg_config", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            return m67285m((List) objM20457a);
        } catch (Throwable th3) {
            return new PreparedConfig.Error(th3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m67278i(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final void m67280k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m67281e(@NotNull PreparedConfig<? extends List<C45979d>> prepared) {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        try {
            if (prepared instanceof PreparedConfig.Value) {
                C45977b.f103426a.m101426l((List) ((PreparedConfig.Value) prepared).m67410a());
            } else if (!Intrinsics.areEqual(prepared, PreparedConfig.b.f55253a)) {
                if (prepared instanceof PreparedConfig.Error) {
                    throw ((PreparedConfig.Error) prepared).getThrowable();
                }
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C43846g.m96568c(new KWebWidgetException(th2, "SsgConfigHelper", false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(th2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m67282f() {
        m67284l();
        m67283g();
    }

    /* JADX INFO: renamed from: l */
    public final void m67284l() {
        m67281e(m67286n());
    }
}

package p233ej;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.home.api.R$drawable;
import com.kubi.home.api.R$string;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import dj.C36719d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: ej.i */
/* JADX INFO: compiled from: HomeFeedConfig.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020#J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050%J\u0006\u0010(\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0010\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0010\u0010,\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0010\u0010-\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0017\u0010.\u001a\u0004\u0018\u00010/2\b\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u00100J\b\u00106\u001a\u00020/H\u0002J\u000e\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020/J\b\u00109\u001a\u00020#H\u0002J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0002J\u0014\u0010>\u001a\u00020#2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0%J\u0016\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020/J\u001e\u0010C\u001a\u00020#2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\b\u0010E\u001a\u0004\u0018\u00010FJ\u0018\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020/2\b\u0010E\u001a\u0004\u0018\u00010FJ\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010JJ\r\u0010S\u001a\u0004\u0018\u00010/¢\u0006\u0002\u0010TJ\u0006\u0010U\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR\u001b\u0010\r\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u001b\u0010\u0013\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\nR\u000e\u0010\u0016\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001f0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020/0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010M\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, m90084d2 = {"Lcom/kubi/home/config/HomeFeedConfig;", "", "<init>", "()V", "TAG", "", "PARAMS_TAB_POSITION", "PARAMS_FORCE_REFRESH", "isLiveVisible", "", "()Z", "isLiveVisible$delegate", "Lkotlin/Lazy;", "useRNHomeFeed", "getUseRNHomeFeed", "useRNHomeFeed$delegate", "useRNHomeFeedPost", "getUseRNHomeFeedPost", "useRNHomeFeedPost$delegate", "useRNHomeFeedTab", "getUseRNHomeFeedTab", "useRNHomeFeedTab$delegate", "tabCodeDiscover", "tabCodeFollow", "tabCodeLive", "tabCodeNews", "tabCodeAnnouncement", "tabCodeFlash", "tabCodeActivity", "curFeedTabs", "Ljava/util/ArrayList;", "Lcom/kubi/home/config/HomeFeedTab;", "Lkotlin/collections/ArrayList;", "feedOperationSync", "preload", "", "getHomeFeedTabs", "", "getCanShowTabs", "getCanShowTabsTitle", "getFeedCurTabActionCode", "canShowFeedActionTab", "actionCode", "isFeedLiveTab", "isFeedFollowingTab", "isFeedDiscoverTab", "getFeedActionResId", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "homeFeedCurTabIndex", "getHomeFeedCurTabIndex", "()I", "setHomeFeedCurTabIndex", "(I)V", "initHomeFeedTabPreSelectIndex", "updateHomeFeedTabSelectIndex", "index", "tryInitTabs", "defaultTabCodes", "tabsCodeStringIdMap", "", "innerGetHomeFeedTabCodes", "saveHomeFeedTabs", "tabs", "updateFeedTabs", "updatedTabsJson", "selectedIndex", "tryToShowRedDot", "tabList", "tableLayout", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "tryHideRedDot", "pos", "getCurFeedTabPopupStorageId", "Lcom/kubi/utils/storage/StorageId;", "SCROLL_DELAY_MILLS", "", "needJumpToTabCode", "getNeedJumpToTabCode", "()Ljava/lang/String;", "setNeedJumpToTabCode", "(Ljava/lang/String;)V", "step", "tryToJumpFeedTabByRouter", "()Ljava/lang/Integer;", "checkNeedScrollToAgain", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedConfig.kt\ncom/kubi/home/config/HomeFeedConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,319:1\n774#2:320\n865#2,2:321\n1869#2,2:323\n360#2,7:328\n360#2,7:337\n360#2,7:348\n67#3:325\n32#3:326\n136#3:327\n136#3:336\n126#3,2:344\n126#3,2:346\n58#3,2:376\n23#3,2:378\n1#4:335\n35#5,4:355\n39#5:361\n35#5,4:362\n39#5:368\n35#5,4:369\n39#5:375\n44#6,2:359\n44#6,2:366\n44#6,2:373\n*S KotlinDebug\n*F\n+ 1 HomeFeedConfig.kt\ncom/kubi/home/config/HomeFeedConfig\n*L\n110#1:320\n110#1:321,2\n117#1:323,2\n252#1:328,7\n259#1:337,7\n303#1:348,7\n160#1:325\n199#1:326\n251#1:327\n258#1:336\n272#1:344,2\n274#1:346,2\n167#1:376,2\n226#1:378,2\n55#1:355,4\n55#1:361\n60#1:362,4\n60#1:368\n64#1:369,4\n64#1:375\n55#1:359,2\n60#1:366,2\n64#1:373,2\n*E\n"})
public final class C37201i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37201i f82500a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f82501b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f82502c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f82503d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f82504e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final ArrayList<HomeFeedTab> f82505f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static Object f82506g;

    /* JADX INFO: renamed from: h */
    public static int f82507h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final List<HomeFeedTab> f82508i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Map<String, Integer> f82509j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public static volatile String f82510k;

    /* JADX INFO: renamed from: l */
    public static volatile int f82511l;

    /* JADX INFO: renamed from: ej.i$a */
    /* JADX INFO: compiled from: HomeFeedConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/config/HomeFeedConfig$innerGetHomeFeedTabCodes$1$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/home/config/HomeFeedTab;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends HomeFeedTab>> {
    }

    /* JADX INFO: renamed from: ej.i$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: ej.i$c */
    /* JADX INFO: compiled from: HomeFeedConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/config/HomeFeedConfig$updateFeedTabs$1$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/home/config/HomeFeedTab;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends TypeToken<List<? extends HomeFeedTab>> {
    }

    /* JADX INFO: renamed from: ej.i$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: ej.i$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class e extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m83199P() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final Integer m83216I() {
        f82511l = 0;
        C44128b.m97259c("HomeFeedTabs", "[tryToJumpFeedTabByRouter] code:" + f82510k);
        if (f82510k == null) {
            return null;
        }
        String str = f82510k;
        f82510k = null;
        Iterator<HomeFeedTab> it = m83222k().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getCode(), str)) {
                break;
            }
            i11++;
        }
        int i12 = i11 >= 0 ? i11 : 0;
        f82511l = 1;
        return Integer.valueOf(i12);
    }

    static {
        C37201i c37201i = new C37201i();
        f82500a = c37201i;
        f82501b = LazyKt.lazy(new Function0() { // from class: ej.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C37201i.m83194B());
            }
        });
        f82502c = LazyKt.lazy(new Function0() { // from class: ej.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C37201i.m83200Q());
            }
        });
        f82503d = LazyKt.lazy(new Function0() { // from class: ej.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C37201i.m83198O());
            }
        });
        f82504e = LazyKt.lazy(new Function0() { // from class: ej.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C37201i.m83199P());
            }
        });
        f82505f = new ArrayList<>();
        f82506g = new Object();
        f82507h = c37201i.m83232u();
        Boolean bool = Boolean.TRUE;
        f82508i = CollectionsKt.listOf((Object[]) new HomeFeedTab[]{new HomeFeedTab("discover", bool), new HomeFeedTab("follow", bool), new HomeFeedTab("live", bool), new HomeFeedTab("news", bool), new HomeFeedTab("announcement", bool), new HomeFeedTab("flash", bool), new HomeFeedTab("activity", bool)});
        f82509j = MapsKt.mapOf(TuplesKt.m90091to("discover", Integer.valueOf(R$string.feed_discover)), TuplesKt.m90091to("follow", Integer.valueOf(R$string.feed_following)), TuplesKt.m90091to("live", Integer.valueOf(R$string.feed_live)), TuplesKt.m90091to("news", Integer.valueOf(R$string.feed_news)), TuplesKt.m90091to("announcement", Integer.valueOf(R$string.feed_announcement)), TuplesKt.m90091to("flash", Integer.valueOf(R$string.feed_flash)), TuplesKt.m90091to("activity", Integer.valueOf(R$string.feed_activity)));
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m83194B() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("is_feed_live_tab_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m83195E(List list) {
        String json = new Gson().toJson(list);
        C44128b.m97259c("HomeFeedTabs", "[saveHomeFeedTabs] tabs:" + list);
        StorageId<String> storageIdM82259d = C36719d.f79632a.m82259d();
        Intrinsics.checkNotNull(json);
        C46392a.m102333p(storageIdM82259d, json);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m83196L(String str, ArrayList arrayList) {
        List list = (List) new Gson().fromJson(str, new c().getType());
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m83197N(int i11) {
        C46392a.m102329l(C36719d.f79632a.m82261f(), i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m83198O() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_feed_post_use_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m83200Q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_feed_use_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m83209w(String str, ArrayList arrayList) {
        List list = (List) new Gson().fromJson(str, new a().getType());
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m83210A() {
        return ((Boolean) f82501b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    public final void m83212D(@NotNull final List<HomeFeedTab> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        C27100x0.m66923d(new Function0() { // from class: ej.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37201i.m83195E(tabs);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m83213F(@Nullable String str) {
        f82510k = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m83214G(int i11, @Nullable SlidingTabLayout slidingTabLayout) {
        if (slidingTabLayout == null) {
            return;
        }
        slidingTabLayout.m55290u(i11);
        String strM83226o = m83226o();
        if (Intrinsics.areEqual(strM83226o, "live")) {
            C46392a.m102328k(C36719d.f79632a.m82262g(), true);
        } else if (Intrinsics.areEqual(strM83226o, "follow")) {
            C46392a.m102328k(C36719d.f79632a.m82260e(), true);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m83215H() {
        ArrayList<HomeFeedTab> arrayList = f82505f;
        if (arrayList.isEmpty()) {
            arrayList.addAll(m83233v());
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m83217J(@NotNull List<HomeFeedTab> tabList, @Nullable SlidingTabLayout slidingTabLayout) {
        Intrinsics.checkNotNullParameter(tabList, "tabList");
        if (slidingTabLayout == null) {
            return;
        }
        int i11 = 0;
        int i12 = -1;
        if (!C46392a.m102322d(C36719d.f79632a.m82262g(), false)) {
            Iterator<HomeFeedTab> it = tabList.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getCode(), "live")) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                slidingTabLayout.m55281G(numValueOf.intValue());
            }
        }
        if (C46392a.m102322d(C36719d.f79632a.m82260e(), false)) {
            return;
        }
        Iterator<HomeFeedTab> it2 = tabList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(it2.next().getCode(), "follow")) {
                i12 = i11;
                break;
            }
            i11++;
        }
        Integer numValueOf2 = Integer.valueOf(i12);
        Integer num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        if (num != null) {
            slidingTabLayout.m55281G(num.intValue());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m83218K(@NotNull final String updatedTabsJson, int i11) {
        Intrinsics.checkNotNullParameter(updatedTabsJson, "updatedTabsJson");
        final ArrayList arrayList = new ArrayList();
        C27100x0.m66923d(new Function0() { // from class: ej.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37201i.m83196L(updatedTabsJson, arrayList);
            }
        });
        if (arrayList.isEmpty()) {
            return;
        }
        m83212D(arrayList);
        synchronized (f82506g) {
            ArrayList<HomeFeedTab> arrayList2 = f82505f;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            f82500a.m83219M(i11);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m83219M(final int i11) {
        f82507h = i11;
        C27100x0.m66923d(new Function0() { // from class: ej.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37201i.m83197N(i11);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m83221j() {
        C44128b.m97259c("HomeFeedTabs", "[checkNeedScrollToAgain] step:" + f82511l);
        if (f82511l == 1) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:home_feed_scroll_to_top", null, 0L, 6, null);
            f82511l = 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<String> m83223l() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m83222k().iterator();
        while (it.hasNext()) {
            Integer num = f82509j.get(((HomeFeedTab) it.next()).showCode());
            if (num != null) {
                arrayList.add(C27017c.f54310a.m66516f(num.intValue(), new Object[0]));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Integer m83225n(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1268958287) {
            if (iHashCode == 3322092) {
                if (str.equals("live")) {
                    return Integer.valueOf(R$drawable.ic2_video_bold_24);
                }
                return null;
            }
            if (iHashCode != 273184745 || !str.equals("discover")) {
                return null;
            }
        } else if (!str.equals("follow")) {
            return null;
        }
        return Integer.valueOf(R$drawable.ic2_add_bold_20);
    }

    /* JADX INFO: renamed from: p */
    public final int m83227p() {
        return f82507h;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<HomeFeedTab> m83228q() {
        synchronized (f82506g) {
            f82500a.m83215H();
            Unit unit = Unit.INSTANCE;
        }
        return f82505f;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m83229r() {
        return ((Boolean) f82502c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m83230s() {
        return ((Boolean) f82503d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m83231t() {
        return ((Boolean) f82504e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public final int m83232u() {
        return C46392a.m102323e(C36719d.f79632a.m82261f(), 0);
    }

    /* JADX INFO: renamed from: v */
    public final List<HomeFeedTab> m83233v() {
        final String strM102326h = C46392a.m102326h(C36719d.f79632a.m82259d(), "");
        C44128b.m97259c("HomeFeedTabs", "[innerGetHomeFeedTabCodes] tabString:" + strM102326h);
        final ArrayList arrayList = new ArrayList();
        if (strM102326h.length() > 0) {
            C27100x0.m66923d(new Function0() { // from class: ej.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C37201i.m83209w(strM102326h, arrayList);
                }
            });
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(f82508i);
        }
        C44128b.m97259c("HomeFeedTabs", "[innerGetHomeFeedTabCodes] tabList:" + arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m83234x(@Nullable String str) {
        return Intrinsics.areEqual(str, "discover");
    }

    /* JADX INFO: renamed from: y */
    public final boolean m83235y(@Nullable String str) {
        return Intrinsics.areEqual(str, "follow");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m83236z(@Nullable String str) {
        return Intrinsics.areEqual(str, "live");
    }

    /* JADX INFO: renamed from: C */
    public final void m83211C() {
        m83228q();
        m83232u();
        List<HomeFeedTab> listM83222k = m83222k();
        C44128b.m97266j("HomeFeedTabs", "[preload] curFeedTabs:" + f82505f);
        C44128b.m97266j("HomeFeedTabs", "[preload] canShowTabs:" + listM83222k);
        C44128b.m97266j("HomeFeedTabs", "[preload] index:" + f82507h + ", showTabSize:" + listM83222k.size());
        if (f82507h >= listM83222k.size()) {
            m83219M(0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m83220i(@Nullable String str) {
        if (!m83236z(str) && !m83235y(str) && !m83234x(str)) {
            return false;
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<HomeFeedTab> m83222k() {
        List<HomeFeedTab> listM83228q = m83228q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM83228q) {
            if (((HomeFeedTab) obj).isDisplay()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m83224m() {
        String strM83226o = m83226o();
        int iHashCode = strM83226o.hashCode();
        if (iHashCode != -1268958287) {
            if (iHashCode != 3322092) {
                if (iHashCode != 273184745 || !strM83226o.equals("discover")) {
                    return null;
                }
            } else {
                if (strM83226o.equals("live")) {
                    return C36719d.f79632a.m82258c();
                }
                return null;
            }
        } else if (!strM83226o.equals("follow")) {
            return null;
        }
        return C36719d.f79632a.m82257b();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m83226o() {
        String code;
        HomeFeedTab homeFeedTab = (HomeFeedTab) CollectionsKt.getOrNull(m83222k(), f82507h);
        if (homeFeedTab != null && (code = homeFeedTab.getCode()) != null) {
            return code;
        }
        return "discover";
    }
}

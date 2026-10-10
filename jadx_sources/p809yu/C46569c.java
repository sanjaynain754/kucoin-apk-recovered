package p809yu;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27025c;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: yu.c */
/* JADX INFO: compiled from: FavTradeListAdapterExt.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/CallAuctionSwitch;", "", "<init>", "()V", "subject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "isThirdStopTrade", "()Z", "setThirdStopTrade", "(Z)V", "getSymbolCallAuctionObs", "inCallAuctionState", "auction", "getAuction", "auction$delegate", "Lkotlin/Lazy;", "callAuctionRemoteConfig", "symbolInCallAuction", "getSymbolInCallAuction", "setSymbolInCallAuction", "changeAuction", "", "symbol", "", "isSymbolCallAuction", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "useCache", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavTradeListAdapterExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavTradeListAdapterExt.kt\ncom/kubi/quotefacade/adapter/CallAuctionSwitch\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,98:1\n35#2,4:99\n39#2:105\n44#3,2:103\n*S KotlinDebug\n*F\n+ 1 FavTradeListAdapterExt.kt\ncom/kubi/quotefacade/adapter/CallAuctionSwitch\n*L\n71#1:99,4\n71#1:105\n71#1:103,2\n*E\n"})
public final class C46569c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46569c f104325a = new C46569c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PublishSubject<Boolean> f104326b;

    /* JADX INFO: renamed from: c */
    public static boolean f104327c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f104328d;

    /* JADX INFO: renamed from: yu.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f104326b = publishSubjectCreate;
        f104327c = true;
        f104328d = LazyKt.lazy(new Function0() { // from class: yu.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C46569c.m102725b());
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m102725b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_call_auction_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m102727d() {
        return ((Boolean) f104328d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m102728e(@NotNull TradeItemBean tradeItemBean, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        return m102726c() && (z11 ? C27025c.m66566d(tradeItemBean.getSymbolInfoEntity().getEnableAuctionTrade()) : C27025c.m66566d(Boolean.valueOf(tradeItemBean.isEnableAuctionTrade())));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m102726c() {
        return m102727d();
    }
}

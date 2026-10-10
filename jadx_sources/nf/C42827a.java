package nf;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.CoinProperty;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: nf.a */
/* JADX INFO: compiled from: CoinInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/data/util/CoinInfoUtils;", "", "<init>", "()V", "isFiatOrStableCoin", "", FirebaseAnalytics.Param.CURRENCY, "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42827a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42827a f94887a = new C42827a();

    /* JADX INFO: renamed from: a */
    public final boolean m93899a(@Nullable String str) {
        CoinInfoEntity coinInfoEntityM85613u;
        CoinProperty properties;
        return (str == null || str.length() == 0 || (((coinInfoEntityM85613u = C37890n.f85269a.m85613u(str)) == null || coinInfoEntityM85613u.isDigital()) && (coinInfoEntityM85613u == null || (properties = coinInfoEntityM85613u.getProperties()) == null || !properties.isStableCoin()))) ? false : true;
    }
}

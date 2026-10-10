package p379jt;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kucoin.utils.ILocationChangeReceiver;
import com.kubi.payment.util.ForterUtils;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;

/* JADX INFO: renamed from: jt.a */
/* JADX INFO: compiled from: LocationChangeReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¨\u0006\b"}, m90084d2 = {"Lcom/kubi/otc/receiver/LocationChangeReceiver;", "Lcom/kubi/kucoin/utils/ILocationChangeReceiver;", "<init>", "()V", "invoke", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40469a implements ILocationChangeReceiver {
    /* JADX INFO: renamed from: a */
    public void m89114a(@Nullable Location location) {
        ForterUtils.a.f(location);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m89114a((Location) obj);
        return Unit.INSTANCE;
    }
}

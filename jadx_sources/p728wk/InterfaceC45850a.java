package p728wk;

import android.annotation.SuppressLint;
import com.kubi.kucoin.entity.GPSEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: wk.a */
/* JADX INFO: compiled from: GpsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/api/GpsApi;", "", "uploadGPS", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "gpsEntity", "Lcom/kubi/kucoin/entity/GPSEntity;", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCRetrofitAPICheck"})
public interface InterfaceC45850a {
    @POST("v1/user/event/gps")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<Object>> m101275a(@Body @NotNull GPSEntity gPSEntity);
}

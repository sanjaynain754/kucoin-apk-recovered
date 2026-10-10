package p842zs;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.home.api.IHomeService;
import com.kubi.home.realtime.IRealTimeWidgetService;
import com.kubi.operation.lib.realtime.bonus.BonusRealtimeAdapter;
import com.kubi.operation.lib.realtime.bonus.BonusRealtimeDataHelper;
import com.kubi.operation.lib.realtime.bonus.BonusRealtimeListener;
import com.kubi.operation.lib.realtime.gempool.GemPoolRealtimeAdapter;
import com.kubi.operation.lib.realtime.gempool.GempoolRealtimeDataHelper;
import com.kubi.operation.lib.realtime.gempool.GempoolRealtimeListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zs.b */
/* JADX INFO: compiled from: RealtimeHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/RealtimeHelper;", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "<init>", "()V", "TAG", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/kubi/home/realtime/IRealTimeWidgetService;", "getService$OperationLib_googleRelease", "()Lcom/kubi/home/realtime/IRealTimeWidgetService;", "service$delegate", "Lkotlin/Lazy;", "init", "", "onForeground", "activity", "Landroid/app/Activity;", "onBackground", "loggingInfo", "msg", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46913b implements C5287o0.b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46913b f104783a = new C46913b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f104784b = LazyKt.lazy(new Function0() { // from class: zs.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C46913b.m103330e();
        }
    });

    /* JADX INFO: renamed from: e */
    public static final IRealTimeWidgetService m103330e() {
        return IRealTimeWidgetService.f26087a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IRealTimeWidgetService m103331b() {
        return (IRealTimeWidgetService) f104784b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m103332c() {
        if (!IHomeService.f25434a.get().mo28952h()) {
            m103333d("not use homeV2, ignore realtime-gempool/bonus");
            return;
        }
        m103331b().mo30031a(new GemPoolRealtimeAdapter());
        m103331b().mo30032b(new GempoolRealtimeListener());
        m103331b().mo30031a(new BonusRealtimeAdapter());
        m103331b().mo30032b(new BonusRealtimeListener());
        C5264d.registerAppStatusChangedListener(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m103333d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onBackground(@Nullable Activity activity) {
        GempoolRealtimeDataHelper.f36778a.m43521l();
        BonusRealtimeDataHelper.f36764a.m43499j();
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onForeground(@Nullable Activity activity) {
        GempoolRealtimeDataHelper.f36778a.m43520k();
        BonusRealtimeDataHelper.f36764a.m43498i();
    }
}

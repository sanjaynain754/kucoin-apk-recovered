package bi;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.l */
/* JADX INFO: compiled from: TapBookEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/event/TapBookEvent;", "", "side", "", "isLatestPrice", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;ZLjava/math/BigDecimal;)V", "getSide", "()Ljava/lang/String;", "()Z", "getPrice", "()Ljava/math/BigDecimal;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4620l {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f4149a;

    /* JADX INFO: renamed from: b */
    public final boolean f4150b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BigDecimal f4151c;

    public C4620l(@Nullable String str, boolean z11, @NotNull BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f4149a = str;
        this.f4150b = z11;
        this.f4151c = price;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getF4151c() {
        return this.f4151c;
    }

    public /* synthetic */ C4620l(String str, boolean z11, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11, bigDecimal);
    }
}

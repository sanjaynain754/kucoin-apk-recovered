package p181cp;

import androidx.annotation.StringRes;
import com.kubi.margin.R$string;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cp.a */
/* JADX INFO: compiled from: LiquidationBizType.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001b\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/constant/LiquidationBizType;", "", "strRes", "", "code", "", "<init>", "(ILjava/lang/String;)V", "getStrRes", "()I", "getCode", "()Ljava/lang/String;", "AutoLiquidation", "InterestLiquidation", "OthersLiquidation", "Lcom/kubi/margin/constant/LiquidationBizType$AutoLiquidation;", "Lcom/kubi/margin/constant/LiquidationBizType$InterestLiquidation;", "Lcom/kubi/margin/constant/LiquidationBizType$OthersLiquidation;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC36514a {

    /* JADX INFO: renamed from: a */
    public final int f79340a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f79341b;

    /* JADX INFO: renamed from: cp.a$a */
    /* JADX INFO: compiled from: LiquidationBizType.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/constant/LiquidationBizType$AutoLiquidation;", "Lcom/kubi/margin/constant/LiquidationBizType;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AbstractC36514a {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final a f79342c = new a();

        public a() {
            super(R$string.filter_forced_liquidation_auto, "AUTO_LIQUIDATION", null);
        }
    }

    /* JADX INFO: renamed from: cp.a$b */
    /* JADX INFO: compiled from: LiquidationBizType.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/constant/LiquidationBizType$InterestLiquidation;", "Lcom/kubi/margin/constant/LiquidationBizType;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends AbstractC36514a {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final b f79343c = new b();

        public b() {
            super(R$string.filter_forced_liquidation_interest, "INTEREST_LIQUIDATION", null);
        }
    }

    /* JADX INFO: renamed from: cp.a$c */
    /* JADX INFO: compiled from: LiquidationBizType.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/constant/LiquidationBizType$OthersLiquidation;", "Lcom/kubi/margin/constant/LiquidationBizType;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends AbstractC36514a {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final c f79344c = new c();

        public c() {
            super(R$string.filter_forced_liquidation_other_types, "OTHER", null);
        }
    }

    public /* synthetic */ AbstractC36514a(int i11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str);
    }

    public AbstractC36514a(@StringRes int i11, String str) {
        this.f79340a = i11;
        this.f79341b = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF79341b() {
        return this.f79341b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF79340a() {
        return this.f79340a;
    }
}

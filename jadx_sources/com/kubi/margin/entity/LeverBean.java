package com.kubi.margin.entity;

import androidx.annotation.ColorRes;
import com.kubi.margin.R$color;
import com.kubi.margin.R$string;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/margin/entity/LeverBean;", "", "<init>", "()V", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverBean {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f33019a = new Companion(null);

    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/entity/LeverBean$Companion;", "", "<init>", "()V", "getColorByRate", "", "noNullDouble", "", "lowValue", "middleValue", "getTextByRate", "", "rate", "lowTop", "middleTop", "getRiskGradeByString", "", "riskGrade", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLeverBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverBean.kt\ncom/kubi/margin/entity/LeverBean$Companion\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n17#2,2:177\n1563#3:179\n1634#3,3:180\n*S KotlinDebug\n*F\n+ 1 LeverBean.kt\ncom/kubi/margin/entity/LeverBean$Companion\n*L\n38#1:177,2\n51#1:179\n51#1:180,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @ColorRes
        public final int getColorByRate(double noNullDouble, double lowValue, double middleValue) {
            if (noNullDouble >= 0.0d && noNullDouble < lowValue) {
                return R$color.primary;
            }
            if (noNullDouble < lowValue || noNullDouble >= middleValue) {
                return (noNullDouble >= middleValue || noNullDouble < 0.0d) ? R$color.secondary : R$color.emphasis60;
            }
            return R$color.complementary;
        }

        @Nullable
        public final List<Double> getRiskGradeByString(@NotNull String riskGrade) {
            Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
            try {
                List listSplit$default = StringsKt.split$default((CharSequence) riskGrade, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(DowngradeExKt.m66538h((String) it.next(), 0.0d, 1, null)));
                }
                if (arrayList.size() != 2) {
                    return null;
                }
                return arrayList;
            } catch (Exception unused) {
                return null;
            }
        }

        @NotNull
        public final String getTextByRate(double rate, double lowTop, double middleTop) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false) {
                return C27017c.f54310a.m66516f(R$string.kc_trade_liquidation_risk_indicator, new Object[0]);
            }
            if (0.0d <= rate && rate <= lowTop) {
                return C27017c.f54310a.m66516f(R$string.low_risk, new Object[0]);
            }
            return lowTop <= rate && rate <= middleTop ? C27017c.f54310a.m66516f(R$string.medium_risk, new Object[0]) : C27017c.f54310a.m66516f(R$string.high_risk, new Object[0]);
        }
    }
}

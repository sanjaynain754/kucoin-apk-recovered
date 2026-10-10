package com.kubi.tradingbotkit.bean.params;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.tradingbotkit.bean.RobotOrderBaseParamsBean;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreateRobotParamsBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001ej\b\u0012\u0004\u0012\u00020\u0019`\u001f2\u0006\u0010 \u001a\u00020!J\u001c\u0010\"\u001a\n #*\u0004\u0018\u00010\u00050\u0005*\u00020$2\u0006\u0010%\u001a\u00020&H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006("}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean;", "", "<init>", "()V", "couponId", "", "getCouponId", "()Ljava/lang/String;", "setCouponId", "(Ljava/lang/String;)V", "templateId", "getTemplateId", "setTemplateId", "followTaskId", "getFollowTaskId", "setFollowTaskId", "useBaseCurrency", "", "getUseBaseCurrency", "()Ljava/lang/Boolean;", "setUseBaseCurrency", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", ReportDataTable.COLUMN_PARAMS, "", "Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean$Param;", "getParams", "()Ljava/util/List;", "setParams", "(Ljava/util/List;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "bean", "Lcom/kubi/tradingbotkit/bean/RobotOrderBaseParamsBean;", "toPlainStringBy", "kotlin.jvm.PlatformType", "Ljava/math/BigDecimal;", "priceIncrementPrecision", "", "Param", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CreateRobotParamsBean {

    @Nullable
    private String couponId;

    @Nullable
    private String followTaskId;

    @Nullable
    private List<Param> params;

    @Nullable
    private String templateId;

    @Nullable
    private Boolean useBaseCurrency = Boolean.FALSE;

    /* JADX INFO: compiled from: CreateRobotParamsBean.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean$Param;", "", "code", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getValue", "setValue", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Param {

        @Nullable
        private String code;

        @Nullable
        private String value;

        /* JADX WARN: Multi-variable type inference failed */
        public Param() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public Param(@Nullable String str, @Nullable String str2) {
            this.code = str;
            this.value = str2;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setCode(@Nullable String str) {
            this.code = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        public /* synthetic */ Param(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    @Nullable
    public final List<Param> getParams() {
        return this.params;
    }

    private final String toPlainStringBy(BigDecimal bigDecimal, int i11) {
        return bigDecimal.setScale(i11, RoundingMode.DOWN).toPlainString();
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getFollowTaskId() {
        return this.followTaskId;
    }

    @NotNull
    public final ArrayList<Param> getParams(@NotNull RobotOrderBaseParamsBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        ArrayList<Param> arrayList = new ArrayList<>();
        arrayList.add(new Param("up", toPlainStringBy(bean.getUp(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("down", toPlainStringBy(bean.getDown(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("symbol", bean.getSymbol()));
        arrayList.add(new Param("depth", String.valueOf(bean.getDepth())));
        arrayList.add(new Param("limitAsset", toPlainStringBy(bean.getLimitAsset(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("stopLossPrice", toPlainStringBy(bean.getStopLossPrice(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("stopProfitPrice", toPlainStringBy(bean.getStopProfitPrice(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("openUnitPrice", toPlainStringBy(bean.getOpenUnitPrice(), bean.getPriceIncrementPrecision())));
        arrayList.add(new Param("baseAmount", bean.getBaseAmount().toPlainString()));
        arrayList.add(new Param("quotaAmount", bean.getQuotaAmount().toPlainString()));
        arrayList.add(new Param("createWay", bean.getCreateWay()));
        arrayList.add(new Param("createEntrance", "app"));
        arrayList.add(new Param(AppsFlyerProperties.CHANNEL, "APP"));
        return arrayList;
    }

    @Nullable
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final Boolean getUseBaseCurrency() {
        return this.useBaseCurrency;
    }

    public final void setCouponId(@Nullable String str) {
        this.couponId = str;
    }

    public final void setFollowTaskId(@Nullable String str) {
        this.followTaskId = str;
    }

    public final void setParams(@Nullable List<Param> list) {
        this.params = list;
    }

    public final void setTemplateId(@Nullable String str) {
        this.templateId = str;
    }

    public final void setUseBaseCurrency(@Nullable Boolean bool) {
        this.useBaseCurrency = bool;
    }
}

package com.kubi.core.spot.entity;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import p661ue.C45193a;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OrderRequestEntity {
    private String funds;
    private String limitPrice;
    private String price;
    private String side;
    private String size;
    private String stop;
    private String stopPrice;
    private String symbol;
    private String type;
    private boolean autoBorrow = false;
    private boolean autoRepay = false;
    private String tradeType = "TRADE";

    private String trimTrailingZerosAndPlainString(String str) {
        return C6447a.m11724a(new BigDecimal(String.valueOf(str))).toPlainString();
    }

    public String getFunds() {
        return this.funds;
    }

    public Map<String, String> getLimitOderParams() {
        HashMap map = new HashMap(5);
        map.put(FirebaseAnalytics.Param.PRICE, trimTrailingZerosAndPlainString(this.price));
        map.put("side", this.side);
        map.put("size", trimTrailingZerosAndPlainString(this.size));
        map.put("symbol", this.symbol);
        map.put("type", TUIConstants.TUIContact.LIMIT);
        map.put("tradeType", this.tradeType);
        map.put("autoBorrow", String.valueOf(this.autoBorrow));
        map.put("autoRepay", String.valueOf(this.autoRepay));
        return map;
    }

    public String getLimitPrice() {
        return this.limitPrice;
    }

    public Map<String, String> getMarketOderParams() {
        HashMap map = new HashMap();
        try {
            if (!TextUtils.isEmpty(this.funds) && new BigDecimal(this.funds).compareTo(BigDecimal.ZERO) != 0) {
                map.put("funds", trimTrailingZerosAndPlainString(this.funds));
            }
        } catch (Exception e11) {
            C45193a.m99855b(e11, "spotOrderRequest", false);
        }
        try {
            if (!TextUtils.isEmpty(this.size) && new BigDecimal(this.size).compareTo(BigDecimal.ZERO) != 0) {
                map.put("size", trimTrailingZerosAndPlainString(this.size));
            }
        } catch (Exception e12) {
            C45193a.m99855b(e12, "spotOrderRequest", false);
        }
        map.put("side", this.side);
        map.put("symbol", this.symbol);
        map.put("type", "market");
        map.put("tradeType", this.tradeType);
        map.put("autoBorrow", String.valueOf(this.autoBorrow));
        map.put("autoRepay", String.valueOf(this.autoRepay));
        return map;
    }

    public Map<String, String> getOcoOderParams() {
        HashMap map = new HashMap(5);
        map.put(FirebaseAnalytics.Param.PRICE, trimTrailingZerosAndPlainString(this.price));
        map.put("stopPrice", trimTrailingZerosAndPlainString(this.stopPrice));
        map.put("limitPrice", trimTrailingZerosAndPlainString(this.limitPrice));
        map.put("side", this.side);
        map.put("size", trimTrailingZerosAndPlainString(this.size));
        map.put("symbol", this.symbol);
        map.put("type", TUIConstants.TUIContact.LIMIT);
        map.put("tradeType", this.tradeType);
        map.put("autoBorrow", String.valueOf(this.autoBorrow));
        map.put("autoRepay", String.valueOf(this.autoRepay));
        return map;
    }

    public String getPrice() {
        return this.price;
    }

    public String getSide() {
        return this.side;
    }

    public String getSize() {
        return this.size;
    }

    public String getStop() {
        return this.stop;
    }

    public String getStopPrice() {
        return this.stopPrice;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getType() {
        return this.type;
    }

    public boolean isAutoBorrow() {
        return this.autoBorrow;
    }

    public boolean isAutoRepay() {
        return this.autoRepay;
    }

    public void setAutoBorrow(boolean z11) {
        this.autoBorrow = z11;
    }

    public void setAutoRepay(boolean z11) {
        this.autoRepay = z11;
    }

    public void setFunds(String str) {
        this.funds = str;
    }

    public void setLimitPrice(String str) {
        this.limitPrice = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setSide(String str) {
        this.side = str;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public void setStop(String str) {
        this.stop = str;
    }

    public void setStopPrice(String str) {
        this.stopPrice = str;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setTradeType(String str) {
        this.tradeType = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Map<String, String> getLimitStopOderParams() {
        Map<String, String> limitOderParams = getLimitOderParams();
        limitOderParams.put(InterfaceC33730j9.f70350a, this.stop);
        limitOderParams.put("stopPrice", trimTrailingZerosAndPlainString(this.stopPrice));
        return limitOderParams;
    }

    public Map<String, String> getMarketStopOderParams() {
        Map<String, String> marketOderParams = getMarketOderParams();
        marketOderParams.put(InterfaceC33730j9.f70350a, this.stop);
        marketOderParams.put("stopPrice", trimTrailingZerosAndPlainString(this.stopPrice));
        return marketOderParams;
    }
}

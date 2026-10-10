package cn.jiguang.cloud.analytics.api;

import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class PurchaseEvent extends Event {
    private static final int CUSTOM_SIZE = 7;
    private static final String TAG = "PurchaseEvent";
    private Currency purchaseCurrency;
    private String purchaseGoodsId;
    private String purchaseGoodsName;
    private int purchaseGoodsQuantity;
    private String purchaseGoodsType;
    private double purchasePrice;
    private boolean purchaseSuccess;

    public PurchaseEvent() {
        super(JAnalysisConstants.TYPE_PURCHASE);
        this.purchaseGoodsId = "";
        this.purchaseGoodsName = "";
        this.purchaseGoodsType = "";
        this.purchaseGoodsQuantity = 0;
        this.purchasePrice = 0.0d;
        this.purchaseSuccess = false;
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_ID, "");
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_NAME, (Object) this.purchaseGoodsName);
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_TYPE, (Object) this.purchaseGoodsType);
        super.putExtraAttr(JAnalysisConstants.PURCHASE_PRICE, (Object) Double.valueOf(this.purchasePrice));
        super.putExtraAttr(JAnalysisConstants.PURCHASE_QUANTITY, (Object) Integer.valueOf(this.purchaseGoodsQuantity));
        super.putExtraAttr(JAnalysisConstants.PURCHASE_SUCCESS, (Object) Boolean.valueOf(this.purchaseSuccess));
        super.putExtraAttr(JAnalysisConstants.PURCHASE_CURRENCY, "");
    }

    public Currency getPurchaseCurrency() {
        return this.purchaseCurrency;
    }

    public int getPurchaseGoodsCount() {
        return this.purchaseGoodsQuantity;
    }

    public String getPurchaseGoodsid() {
        return this.purchaseGoodsId;
    }

    public String getPurchaseGoodsname() {
        return this.purchaseGoodsName;
    }

    public String getPurchaseGoodstype() {
        return this.purchaseGoodsType;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public boolean getPurchaseSuccess() {
        return this.purchaseSuccess;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public PurchaseEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        switch (str) {
            case "purchase_quantity":
            case "purchase_goods_name":
            case "purchase_goods_type":
            case "purchase_currency":
            case "purchase_goods_id":
            case "purchase_price":
            case "purchase_success":
                JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
                return this;
            default:
                if (this.extraAttrMap.size() < 50) {
                    return (PurchaseEvent) super.putExtraAttr(str, obj);
                }
                JCommonLog.m5430d(TAG, "can't put [" + str + "], purchase event extraAttrMap size can't be no more than 43");
                return this;
        }
    }

    public Event setExtMap(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return this;
        }
        Map<String, Object> extraAttrMap = getExtraAttrMap();
        if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
            Iterator<Map.Entry<String, Object>> it = extraAttrMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                key.getClass();
                switch (key) {
                    case "purchase_quantity":
                    case "purchase_goods_name":
                    case "purchase_goods_type":
                    case "purchase_currency":
                    case "purchase_goods_id":
                    case "purchase_price":
                    case "purchase_success":
                        JCommonLog.m5430d(TAG, "key [" + next.getKey() + "] is invalid");
                        break;
                    default:
                        it.remove();
                        break;
                }
            }
        }
        addExtMap(map);
        return this;
    }

    public PurchaseEvent setPurchaseCurrency(Currency currency) {
        if (currency != null && JAnalyticsHelper.isValidValue(currency.name())) {
            this.purchaseCurrency = currency;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_CURRENCY, (Object) currency.name());
        }
        return this;
    }

    public Event addExtMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                key.getClass();
                switch (key) {
                    case "purchase_quantity":
                    case "purchase_goods_name":
                    case "purchase_goods_type":
                    case "purchase_currency":
                    case "purchase_goods_id":
                    case "purchase_price":
                    case "purchase_success":
                        JCommonLog.m5430d(TAG, "key [" + entry.getKey() + "] is invalid");
                        break;
                    default:
                        putExtraAttr(entry.getKey(), entry.getValue());
                        break;
                }
            }
        }
        return this;
    }

    public PurchaseEvent addKeyValue(String str, Object obj) {
        return putExtraAttr(str, obj);
    }

    public PurchaseEvent setPurchaseGoodsCount(int i11) {
        if (JAnalyticsHelper.isValidValue(Integer.valueOf(i11))) {
            this.purchaseGoodsQuantity = i11;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_QUANTITY, (Object) Integer.valueOf(i11));
        }
        return this;
    }

    public PurchaseEvent setPurchaseGoodsid(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.purchaseGoodsId = str;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_ID, (Object) str);
        }
        return this;
    }

    public PurchaseEvent setPurchaseGoodsname(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.purchaseGoodsName = str;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_NAME, (Object) str);
        }
        return this;
    }

    public PurchaseEvent setPurchaseGoodstype(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.purchaseGoodsType = str;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_TYPE, (Object) str);
        }
        return this;
    }

    public PurchaseEvent setPurchasePrice(double d11) {
        if (JAnalyticsHelper.isValidValue(Double.valueOf(d11))) {
            this.purchasePrice = d11;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_PRICE, (Object) Double.valueOf(d11));
        }
        return this;
    }

    public PurchaseEvent setPurchaseSuccess(boolean z11) {
        if (JAnalyticsHelper.isValidValue(Boolean.valueOf(z11))) {
            this.purchaseSuccess = z11;
            super.putExtraAttr(JAnalysisConstants.PURCHASE_SUCCESS, (Object) Boolean.valueOf(z11));
        }
        return this;
    }

    public PurchaseEvent(String str, String str2, double d11, boolean z11, Currency currency, String str3, int i11) {
        super(JAnalysisConstants.TYPE_PURCHASE);
        this.purchaseGoodsId = str;
        this.purchaseGoodsName = str2;
        this.purchaseGoodsType = str3;
        this.purchasePrice = d11;
        this.purchaseGoodsQuantity = i11;
        this.purchaseSuccess = z11;
        this.purchaseCurrency = currency;
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_ID, (Object) str);
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_NAME, (Object) this.purchaseGoodsName);
        super.putExtraAttr(JAnalysisConstants.PURCHASE_GOODS_TYPE, (Object) this.purchaseGoodsType);
        super.putExtraAttr(JAnalysisConstants.PURCHASE_PRICE, (Object) Double.valueOf(this.purchasePrice));
        super.putExtraAttr(JAnalysisConstants.PURCHASE_QUANTITY, (Object) Integer.valueOf(this.purchaseGoodsQuantity));
        super.putExtraAttr(JAnalysisConstants.PURCHASE_SUCCESS, (Object) Boolean.valueOf(this.purchaseSuccess));
        if (currency != null) {
            super.putExtraAttr(JAnalysisConstants.PURCHASE_CURRENCY, (Object) this.purchaseCurrency.name());
        } else {
            super.putExtraAttr(JAnalysisConstants.PURCHASE_CURRENCY, "");
        }
    }
}

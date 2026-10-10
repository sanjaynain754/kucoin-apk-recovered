package com.appsflyer;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\t\u0010\u0007"}, m90084d2 = {"Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "", "", "", "validationError", "", "onInAppPurchaseValidationError", "(Ljava/util/Map;)V", "validationResult", "onInAppPurchaseValidationFinished"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface AppsFlyerInAppPurchaseValidationCallback {
    void onInAppPurchaseValidationError(@NotNull Map<String, ? extends Object> validationError);

    void onInAppPurchaseValidationFinished(@NotNull Map<String, ? extends Object> validationResult);
}

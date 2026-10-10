package com.sumsub.sns.core;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0012\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020\u0003H&J\u0010\u0010O\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u0004\u0018\u00010(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0004\u0018\u000100X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0004\u0018\u000104X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u0004\u0018\u000108X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R \u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020C\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001eR\u0014\u0010E\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u0004\u0018\u00010IX¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0012\u0010P\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005¨\u0006R"}, m90084d2 = {"Lcom/sumsub/sns/core/MobileSdk;", "", "versionName", "", "getVersionName", "()Ljava/lang/String;", "versionCode", "", "getVersionCode", "()I", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "isDebug", "", "()Z", "state", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "getState", "()Lcom/sumsub/sns/core/data/model/SNSSDKState;", "conf", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "settings", "", "getSettings", "()Ljava/util/Map;", "tokenExpirationHandler", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getTokenExpirationHandler", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "eventHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "customization", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "instructionsViewHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsViewHandler", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "supportItems", "", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "getSupportItems", "()Ljava/util/List;", "setSupportItems", "(Ljava/util/List;)V", "preferredDocumentsDefinitions", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "getPreferredDocumentsDefinitions", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout", "()Ljava/lang/Integer;", "urlHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getUrlHandler", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getPluggedModule", "Lcom/sumsub/sns/core/SNSModule;", "className", "isModuleAvailable", "version", "getVersion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface MobileSdk {
    @Nullable
    Integer getAutoCloseOnApproveTimeout();

    @Nullable
    SNSInitConfig getConf();

    @Nullable
    SNSJsonCustomization getCustomization();

    @Nullable
    SNSErrorHandler getErrorHandler();

    @Nullable
    SNSEventHandler getEventHandler();

    @NotNull
    SNSIconHandler getIconHandler();

    @Nullable
    SNSInstructionsViewHandler getInstructionsViewHandler();

    @NotNull
    Locale getLocale();

    @NotNull
    String getPackageName();

    @Nullable
    SNSModule getPluggedModule(@NotNull String className);

    @Nullable
    Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions();

    @Nullable
    Map<String, String> getSettings();

    @NotNull
    SNSSDKState getState();

    @Nullable
    SNSStateChangedHandler getStateChangedHandler();

    @Nullable
    List<SNSSupportItem> getSupportItems();

    @Nullable
    TokenExpirationHandler getTokenExpirationHandler();

    @Nullable
    SNSUrlHandler getUrlHandler();

    @NotNull
    String getVersion();

    int getVersionCode();

    @NotNull
    String getVersionName();

    boolean isDebug();

    boolean isModuleAvailable(@NotNull String className);

    void setSupportItems(@Nullable List<SNSSupportItem> list);
}

package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebSettingsAdapter {
    private final WebSettingsBoundaryInterface mBoundaryInterface;

    public int getAttributionRegistrationBehavior() {
        return this.mBoundaryInterface.getAttributionBehavior();
    }

    public int getDisabledActionModeMenuItems() {
        return this.mBoundaryInterface.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.mBoundaryInterface.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.mBoundaryInterface.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.mBoundaryInterface.getForceDarkBehavior();
    }

    public boolean getOffscreenPreRaster() {
        return this.mBoundaryInterface.getOffscreenPreRaster();
    }

    @NonNull
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return this.mBoundaryInterface.getRequestedWithHeaderOriginAllowList();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.mBoundaryInterface.getSafeBrowsingEnabled();
    }

    @NonNull
    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(this.mBoundaryInterface.getUserAgentMetadataMap());
    }

    @NonNull
    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(this.mBoundaryInterface.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.mBoundaryInterface.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.mBoundaryInterface.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z11) {
        this.mBoundaryInterface.setAlgorithmicDarkeningAllowed(z11);
    }

    public void setAttributionRegistrationBehavior(int i11) {
        this.mBoundaryInterface.setAttributionBehavior(i11);
    }

    public void setDisabledActionModeMenuItems(int i11) {
        this.mBoundaryInterface.setDisabledActionModeMenuItems(i11);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z11) {
        this.mBoundaryInterface.setEnterpriseAuthenticationAppLinkPolicyEnabled(z11);
    }

    public void setForceDark(int i11) {
        this.mBoundaryInterface.setForceDark(i11);
    }

    public void setForceDarkStrategy(int i11) {
        this.mBoundaryInterface.setForceDarkBehavior(i11);
    }

    public void setOffscreenPreRaster(boolean z11) {
        this.mBoundaryInterface.setOffscreenPreRaster(z11);
    }

    public void setRequestedWithHeaderOriginAllowList(@NonNull Set<String> set) {
        this.mBoundaryInterface.setRequestedWithHeaderOriginAllowList(set);
    }

    public void setSafeBrowsingEnabled(boolean z11) {
        this.mBoundaryInterface.setSafeBrowsingEnabled(z11);
    }

    public void setUserAgentMetadata(@NonNull UserAgentMetadata userAgentMetadata) {
        this.mBoundaryInterface.setUserAgentMetadataFromMap(UserAgentMetadataInternal.convertUserAgentMetadataToMap(userAgentMetadata));
    }

    public void setWebViewMediaIntegrityApiStatus(@NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        this.mBoundaryInterface.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig.getDefaultStatus(), webViewMediaIntegrityApiStatusConfig.getOverrideRules());
    }

    public WebSettingsAdapter(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.mBoundaryInterface = webSettingsBoundaryInterface;
    }
}

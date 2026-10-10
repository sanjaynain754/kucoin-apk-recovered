package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewFeature;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebMessageAdapter implements WebMessageBoundaryInterface {
    private static final String[] sFeatures = {WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER};
    private WebMessageCompat mWebMessageCompat;

    public static boolean isMessagePayloadTypeSupportedByWebView(int i11) {
        return i11 == 0 || (i11 == 1 && WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView());
    }

    @NonNull
    private static WebMessagePortCompat[] toWebMessagePortCompats(InvocationHandler[] invocationHandlerArr) {
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArr.length];
        for (int i11 = 0; i11 < invocationHandlerArr.length; i11++) {
            webMessagePortCompatArr[i11] = new WebMessagePortImpl(invocationHandlerArr[i11]);
        }
        return webMessagePortCompatArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    @Deprecated
    public String getData() {
        return this.mWebMessageCompat.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler getMessagePayload() {
        WebMessagePayloadAdapter webMessagePayloadAdapter;
        int type = this.mWebMessageCompat.getType();
        if (type == 0) {
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(this.mWebMessageCompat.getData());
        } else {
            if (type != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.mWebMessageCompat.getType());
            }
            byte[] arrayBuffer = this.mWebMessageCompat.getArrayBuffer();
            Objects.requireNonNull(arrayBuffer);
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(arrayBuffer);
        }
        return C37184a.m83173c(webMessagePayloadAdapter);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] ports = this.mWebMessageCompat.getPorts();
        if (ports == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[ports.length];
        for (int i11 = 0; i11 < ports.length; i11++) {
            invocationHandlerArr[i11] = ports[i11].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return sFeatures;
    }

    public WebMessageAdapter(@NonNull WebMessageCompat webMessageCompat) {
        this.mWebMessageCompat = webMessageCompat;
    }

    @Nullable
    public static WebMessageCompat webMessageCompatFromBoundaryInterface(@NonNull WebMessageBoundaryInterface webMessageBoundaryInterface) {
        WebMessagePortCompat[] webMessagePortCompats = toWebMessagePortCompats(webMessageBoundaryInterface.getPorts());
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C37184a.m83171a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), webMessagePortCompats);
            }
            return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), webMessagePortCompats);
        }
        return new WebMessageCompat(webMessageBoundaryInterface.getData(), webMessagePortCompats);
    }
}
